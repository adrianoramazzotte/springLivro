package com.ramazzotte.validation.biblioteca;


import java.util.ArrayList;
import java.util.List;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.factory.annotation.Autowired;

import com.ramazzotte.domain.Biblioteca;
import com.ramazzotte.domain.DTO.BibliotecaNewDTO;
import com.ramazzotte.repository.BibliotecaRepository;
import com.ramazzotte.resource.exception.FieldMessage;





public class BibliotecaInsertValidator implements ConstraintValidator<BibliotecaInsert, BibliotecaNewDTO> {
	@Autowired
	private BibliotecaRepository repo;

	
	@Override
	public void initialize(BibliotecaInsert ann) {
	}

	@Override
	public boolean isValid(BibliotecaNewDTO objDto, ConstraintValidatorContext context) {
		//UM OBJ COM NOME "BIBLIOTECA MUNICIPAL"
		List<FieldMessage> list = new ArrayList<>();
		
		Biblioteca aux1 = repo.findByNome(objDto.getNome());
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
