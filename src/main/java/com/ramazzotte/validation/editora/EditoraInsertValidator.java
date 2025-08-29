package com.ramazzotte.validation.editora;

import java.util.ArrayList;
import java.util.List;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.factory.annotation.Autowired;

import com.ramazzotte.domain.Editora;
import com.ramazzotte.domain.DTO.EditoraNewDTO;
import com.ramazzotte.repository.EditoraRepository;
import com.ramazzotte.resource.exception.FieldMessage;

public class EditoraInsertValidator implements ConstraintValidator<EditoraInsert, EditoraNewDTO> {
	@Autowired
	private EditoraRepository repo;

	
	@Override
	public void initialize(EditoraInsert ann) {
	}

	@Override
	public boolean isValid(EditoraNewDTO objDto, ConstraintValidatorContext context) {
		List<FieldMessage> list = new ArrayList<>();
		
		Editora aux1 = repo.findByRazao(objDto.getRazao());
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
