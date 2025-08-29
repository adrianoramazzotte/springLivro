package com.ramazzotte.validation.editora;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerMapping;

import com.ramazzotte.domain.Editora;
import com.ramazzotte.domain.DTO.EditoraDTO;
import com.ramazzotte.repository.EditoraRepository;
import com.ramazzotte.resource.exception.FieldMessage;

public class EditoraUpdateValidator implements ConstraintValidator<EditoraUpdate, EditoraDTO> {
	
	@Autowired
	private HttpServletRequest request;
	
	@Autowired
	private EditoraRepository repo;

	
	@Override
	public void initialize(EditoraUpdate ann) {
	}

	@Override
	public boolean isValid(EditoraDTO objDto, ConstraintValidatorContext context) {
		
		List<FieldMessage> list = new ArrayList<>();
		@SuppressWarnings("unchecked")
		Map<String,String>map = (Map<String,String>) request.getAttribute(HandlerMapping.URI_TEMPLATE_VARIABLES_ATTRIBUTE);
		Integer uriId = Integer.parseInt(map.get("id"));
		
		Editora aux1 = repo.findByRazao(objDto.getRazao());	
		if(aux1 !=null && !aux1.getId().equals(uriId)) {
			list.add(new FieldMessage("razao"," Razao já existente"));
		}
		


		for (FieldMessage e : list) {
			context.disableDefaultConstraintViolation();
			context.buildConstraintViolationWithTemplate(e.getMensagem()).addPropertyNode(e.getFieldName())
					.addConstraintViolation();
		}
		return list.isEmpty();
	}
}