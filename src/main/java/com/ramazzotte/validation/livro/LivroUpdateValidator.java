package com.ramazzotte.validation.livro;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerMapping;

import com.ramazzotte.domain.Livro;
import com.ramazzotte.domain.DTO.LivroDTO;
import com.ramazzotte.repository.LivroRepository;
import com.ramazzotte.resource.exception.FieldMessage;

public class LivroUpdateValidator implements ConstraintValidator<LivroUpdate, LivroDTO> {
	
	@Autowired
	private HttpServletRequest request;
	
	@Autowired
	private LivroRepository repo;

	
	@Override
	public void initialize(LivroUpdate ann) {
	}

	@Override
	public boolean isValid(LivroDTO objDto, ConstraintValidatorContext context) {
		
		List<FieldMessage> list = new ArrayList<>();
		@SuppressWarnings("unchecked")
		Map<String,String>map = (Map<String,String>) request.getAttribute(HandlerMapping.URI_TEMPLATE_VARIABLES_ATTRIBUTE);
		Integer uriId = Integer.parseInt(map.get("id"));
		
		Livro aux1 = repo.findByTitulo(objDto.getTitulo());	
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
