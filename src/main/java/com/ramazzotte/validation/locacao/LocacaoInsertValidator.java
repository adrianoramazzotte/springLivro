package com.ramazzotte.validation.locacao;

import java.util.ArrayList;
import java.util.List;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.factory.annotation.Autowired;

import com.ramazzotte.domain.Locacao;
import com.ramazzotte.domain.DTO.LocacaoNewDTO;
import com.ramazzotte.repository.LocacaoRepository;
import com.ramazzotte.resource.exception.FieldMessage;

public class LocacaoInsertValidator implements ConstraintValidator<LocacaoInsert, LocacaoNewDTO> {
	@Autowired
	private LocacaoRepository repo;

	
	@Override
	public void initialize(LocacaoInsert ann) {
	}

	@Override
	public boolean isValid(LocacaoNewDTO objDto, ConstraintValidatorContext context) {
		List<FieldMessage> list = new ArrayList<>();
		
		Locacao aux1 = repo.findByLivro(objDto.getLivro());
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
