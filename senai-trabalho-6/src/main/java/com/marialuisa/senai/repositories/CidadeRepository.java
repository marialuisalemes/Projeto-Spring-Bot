package com.marialuisa.senai.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marialuisa.senai.domain.Cidade;

public interface CidadeRepository extends JpaRepository<Cidade, Integer> {

}