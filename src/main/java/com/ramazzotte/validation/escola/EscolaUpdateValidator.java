package com.ramazzotte.validation.escola;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerMapping;

import com.ramazzotte.domain.Escola;
import com.ramazzotte.domain.DTO.EscolaDTO;
import com.ramazzotte.repository.EscolaRepository;
import com.ramazzotte.resource.exception.FieldMessage;
import com.ramazzotte.resource.util.BR;



public class EscolaUpdateValidator implements ConstraintValidator<EscolaUpdate, EscolaDTO> {
	
	@Autowired
	private HttpServletRequest request;
	
	@Autowired
	private EscolaRepository repo;

	
	@Override
	public void initialize(EscolaUpdate ann) {
	}

	@Override
	public boolean isValid(EscolaDTO objDto, ConstraintValidatorContext context) {
		
		List<FieldMessage> list = new ArrayList<>();
		@SuppressWarnings("unchecked")
		Map<String,String>map = (Map<String,String>) request.getAttribute(HandlerMapping.URI_TEMPLATE_VARIABLES_ATTRIBUTE);
		Integer uriId = Integer.parseInt(map.get("id"));
		

		if(!BR.isValidCNPJ(objDto.getCnpj())) {
			list.add(new FieldMessage("cnpj"," CNPJ inválido  "));			
		}
		
		Escola cnpj = repo.buscarByCnpj(objDto.getCnpj());
		if(cnpj !=null && !cnpj.getId().equals(uriId)) {
			list.add(new FieldMessage("cnpj"," cnpj já existente  "));
		}
		Escola nome = repo.findByNome(objDto.getNome());
		if(nome !=null && !nome.getId().equals(uriId)) {
			list.add(new FieldMessage("nome"," nome já existente  "));
		}
		
		Escola email = repo.findByEmail(objDto.getEmail());
		if(email !=null && !email.getId().equals(uriId)) {
			list.add(new FieldMessage("email"," Email já existente  "));
		}
		
	

		for (FieldMessage e : list) {
			context.disableDefaultConstraintViolation();
			context.buildConstraintViolationWithTemplate(e.getMensagem()).addPropertyNode(e.getFieldName())
					.addConstraintViolation();
		}
		return list.isEmpty();
	}
}
