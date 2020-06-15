package com.biblioteca.biblioteca.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.biblioteca.biblioteca.model.EmprestimoModel;
import com.biblioteca.biblioteca.repository.EmprestimoRepository;

@RestController
@RequestMapping("/emprestimos")
@CrossOrigin("*")
public class EmprestimoController {
	
	@Autowired
	private EmprestimoRepository repository;
	
	@GetMapping
	public ResponseEntity<List<EmprestimoModel>> GetAll(){
		return ResponseEntity.ok(repository.findAll());
	}
	
	@PostMapping
	public ResponseEntity<EmprestimoModel> Post(@RequestBody EmprestimoModel cliente){
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(cliente));
	}
}
