package com.biblioteca.biblioteca.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.biblioteca.biblioteca.model.ClienteModel;

public interface ClienteRepository extends JpaRepository<ClienteModel, Long>{

}
