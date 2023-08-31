package com.example.mdbspringboot.application;

import org.springframework.stereotype.Service;

import com.example.mdbspringboot.adapter.StatementService;
import com.example.mdbspringboot.domain.Statement;
import com.example.mdbspringboot.domain.StatementRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class StatementApplicationService implements StatementService {

	private final StatementRepository statementRepository;

	@Override
	public void addStatement(Statement statement) {
		statementRepository.save(statement);
	}

}
