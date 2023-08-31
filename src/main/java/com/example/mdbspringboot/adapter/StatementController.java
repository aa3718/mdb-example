package com.example.mdbspringboot.adapter;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.mdbspringboot.application.StatementApplicationService;
import com.example.mdbspringboot.domain.Statement;

@RestController
public class StatementController implements StatementService {

	private final StatementApplicationService statementService;

    public StatementController(StatementApplicationService statementService) {
        this.statementService = statementService;
    }

	@PostMapping("/statement")
    @ResponseStatus(HttpStatus.CREATED)
    public void addStatement(@RequestBody Statement statement) {
		statementService.addStatement(statement);
    }

	@GetMapping("/statement/{statement_id}")
    @ResponseStatus(HttpStatus.OK)
    public Statement getStatement(@PathVariable("statement_id") String statementId) {
		return statementService.getStatement(statementId);
    }

}
