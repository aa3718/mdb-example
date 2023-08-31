package com.example.mdbspringboot.adapter;

import com.example.mdbspringboot.domain.Statement;

public interface StatementService {

	void addStatement(Statement statement);

	Statement getStatement(String statementId);
}
