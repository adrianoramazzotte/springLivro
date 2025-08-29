package com.ramazzotte.validation.genero;

import java.util.ArrayList;
import java.util.List;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.factory.annotation.Autowired;

import com.ramazzotte.domain.Genero;
import com.ramazzotte.domain.DTO.GeneroNewDTO;
import com.ramazzotte.repository.GeneroRepository;
import com.ramazzotte.resource.exception.FieldMessage;

public class GeneroInsertValidator implements ConstraintValidator<GeneroInsert, GeneroNewDTO> {
	@Autowired
	private GeneroRepository repo;

	
	@Override
	public void initialize(GeneroInsert ann) {
	}

	@Override
	public boolean isValid(GeneroNewDTO objDto, ConstraintValidatorContext context) {
		List<FieldMessage> list = new ArrayList<>();
		
		Genero aux1 = repo.findByNome(objDto.getNome());
		if(aux1 !=null) {
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