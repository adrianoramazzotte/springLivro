package com.ramazzotte.validation.biblioteca;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerMapping;

import com.ramazzotte.domain.Biblioteca;
import com.ramazzotte.domain.DTO.BibliotecaDTO;
import com.ramazzotte.repository.BibliotecaRepository;
import com.ramazzotte.resource.exception.FieldMessage;




public class BibliotecaUpdateValidator implements ConstraintValidator<BibliotecaUpdate, BibliotecaDTO> {
	
	@Autowired
	private HttpServletRequest request;
	
	@Autowired
	private BibliotecaRepository repo;

	
	@Override
	public void initialize(BibliotecaUpdate ann) {
	}

	@Override
	public boolean isValid(BibliotecaDTO objDto, ConstraintValidatorContext context) {
		
		List<FieldMessage> list = new ArrayList<>();
		@SuppressWarnings("unchecked")
		Map<String,String>map = (Map<String,String>) request.getAttribute(HandlerMapping.URI_TEMPLATE_VARIABLES_ATTRIBUTE);
		Integer uriId = Integer.parseInt(map.get("id"));
		
		Biblioteca aux1 = repo.findByNome(objDto.getNome());	
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
