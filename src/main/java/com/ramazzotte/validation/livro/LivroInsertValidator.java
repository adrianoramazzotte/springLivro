package com.ramazzotte.validation.livro;

import java.util.ArrayList;
import java.util.List;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.factory.annotation.Autowired;

import com.ramazzotte.domain.Livro;
import com.ramazzotte.domain.DTO.LivroNewDTO;
import com.ramazzotte.repository.LivroRepository;
import com.ramazzotte.resource.exception.FieldMessage;

public class LivroInsertValidator implements ConstraintValidator<LivroInsert, LivroNewDTO> {
	@Autowired
	private LivroRepository repo;

	
	@Override
	public void initialize(LivroInsert ann) {
	}

	@Override
	public boolean isValid(LivroNewDTO objDto, ConstraintValidatorContext context) {
		List<FieldMessage> list = new ArrayList<>();
		
		Livro aux1 = repo.findByTitulo(objDto.getTitulo());
		if(aux1 !=null) {
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