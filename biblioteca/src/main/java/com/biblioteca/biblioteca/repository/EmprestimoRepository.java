package com.biblioteca.biblioteca.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.biblioteca.biblioteca.model.EmprestimoModel;

public interface EmprestimoRepository extends JpaRepository<EmprestimoModel, Long>{

}
