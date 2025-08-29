package com.ramazzotte.validation.professor;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerMapping;

import com.ramazzotte.domain.DTO.aula.ProfessorDTO;
import com.ramazzotte.domain.aula.Professor;
import com.ramazzotte.repository.aula.ProfessorRepository;
import com.ramazzotte.resource.exception.FieldMessage;




public class ProfessorUpdateValidator implements ConstraintValidator<ProfessorUpdate, ProfessorDTO> {
	
	@Autowired
	private HttpServletRequest request;
	
	@Autowired
	private ProfessorRepository repo;

	
	@Override
	public void initialize(ProfessorUpdate ann) {
	}

	@Override
	public boolean isValid(ProfessorDTO objDto, ConstraintValidatorContext context) {
		
		List<FieldMessage> list = new ArrayList<>();
		@SuppressWarnings("unchecked")
		Map<String,String>map = (Map<String,String>) request.getAttribute(HandlerMapping.URI_TEMPLATE_VARIABLES_ATTRIBUTE);
		Integer uriId = Integer.parseInt(map.get("idProfessor"));
		
		Professor aux2 = repo.findByCpf(objDto.getCpf());	
		if(aux2 !=null && !aux2.getId().equals(uriId)) {
			list.add(new FieldMessage("cpf"," CPF já existente!"));
		}
		Professor aux1 = repo.findByNome(objDto.getNome());	
		if(aux1 !=null && !aux1.getId().equals(uriId)) {
			list.add(new FieldMessage("nome"," Nome já existente!"));
		}
		


		for (FieldMessage e : list) {
			context.disableDefaultConstraintViolation();
			context.buildConstraintViolationWithTemplate(e.getMensagem()).addPropertyNode(e.getFieldName())
					.addConstraintViolation();
		}
		return list.isEmpty();
	}
}
