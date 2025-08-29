package com.ramazzotte.validation.genero;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerMapping;

import com.ramazzotte.domain.Genero;
import com.ramazzotte.domain.DTO.GeneroDTO;
import com.ramazzotte.repository.GeneroRepository;
import com.ramazzotte.resource.exception.FieldMessage;

public class GeneroUpdateValidator implements ConstraintValidator<GeneroUpdate, GeneroDTO> {
	
	@Autowired
	private HttpServletRequest request;
	
	@Autowired
	private GeneroRepository repo;

	
	@Override
	public void initialize(GeneroUpdate ann) {
	}

	@Override
	public boolean isValid(GeneroDTO objDto, ConstraintValidatorContext context) {
		
		List<FieldMessage> list = new ArrayList<>();
		@SuppressWarnings("unchecked")
		Map<String,String>map = (Map<String,String>) request.getAttribute(HandlerMapping.URI_TEMPLATE_VARIABLES_ATTRIBUTE);
		Integer uriId = Integer.parseInt(map.get("id"));
		
		Genero aux1 = repo.findByNome(objDto.getNome());	
		if(aux1 !=null && !aux1.getId().equals(uriId)) {
			list.add(new FieldMessage("nome"," Nome já existente"));
		}
		


		for (FieldMessage e : list) {
			context.disableDefaultConstraintViolation();
			context.buildConstraintViolationWithTemplate(e.getMensagem()).addPropertyNode(e.getFieldName())
					.addConstraintViolation();
		}
		return list.isEmpty();
	}
}