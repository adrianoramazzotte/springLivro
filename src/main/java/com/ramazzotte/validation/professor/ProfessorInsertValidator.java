package com.ramazzotte.validation.professor;


import java.util.ArrayList;
import java.util.List;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.factory.annotation.Autowired;

import com.ramazzotte.domain.DTO.aula.ProfessorNewDTO;
import com.ramazzotte.domain.aula.Professor;
import com.ramazzotte.repository.aula.ProfessorRepository;
import com.ramazzotte.resource.exception.FieldMessage;





public class ProfessorInsertValidator implements ConstraintValidator<ProfessorInsert, ProfessorNewDTO> {
	@Autowired
	private ProfessorRepository repo;

	
	@Override
	public void initialize(ProfessorInsert ann) {
	}

	@Override
	public boolean isValid(ProfessorNewDTO objDto, ConstraintValidatorContext context) {
		List<FieldMessage> list = new ArrayList<>();
		
		Professor aux1 = repo.findByNome(objDto.getNome());
		if(aux1 !=null) {
			list.add(new FieldMessage("nome"," Nome já existente"));
		}
		Professor aux2 = repo.findByCpf(objDto.getCpf());
		if(aux2 !=null) {
			list.add(new FieldMessage("cpf"," CPF já existente"));
		}

		for (FieldMessage e : list) {
			context.disableDefaultConstraintViolation();
			context.buildConstraintViolationWithTemplate(e.getMensagem()).addPropertyNode(e.getFieldName())
					.addConstraintViolation();
		}
		return list.isEmpty();
	}
}
