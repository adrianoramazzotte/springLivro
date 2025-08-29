package com.ramazzotte.validation.locacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerMapping;

import com.ramazzotte.domain.Locacao;
import com.ramazzotte.domain.DTO.LocacaoDTO;
import com.ramazzotte.repository.LocacaoRepository;
import com.ramazzotte.resource.exception.FieldMessage;

public class LocacaoUpdateValidator implements ConstraintValidator<LocacaoUpdate, LocacaoDTO> {
	
	@Autowired
	private HttpServletRequest request;
	
	@Autowired
	private LocacaoRepository repo;

	
	@Override
	public void initialize(LocacaoUpdate ann) {
	}

	@Override
	public boolean isValid(LocacaoDTO objDto, ConstraintValidatorContext context) {
		
		List<FieldMessage> list = new ArrayList<>();
		@SuppressWarnings("unchecked")
		Map<String,String>map = (Map<String,String>) request.getAttribute(HandlerMapping.URI_TEMPLATE_VARIABLES_ATTRIBUTE);
		Integer uriId = Integer.parseInt(map.get("id"));
		
		Locacao aux1 = repo.findByLivro(objDto.getLivro());	
		if(aux1 !=null && !aux1.getId().equals(uriId)) {
			list.add(new FieldMessage("descricao"," Desscricao já existente"));
		}
		


		for (FieldMessage e : list) {
			context.disableDefaultConstraintViolation();
			context.buildConstraintViolationWithTemplate(e.getMensagem()).addPropertyNode(e.getFieldName())
					.addConstraintViolation();
		}
		return list.isEmpty();
	}
}

