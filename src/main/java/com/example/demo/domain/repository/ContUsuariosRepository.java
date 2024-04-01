package com.example.demo.domain.repository;

import com.example.demo.persistence.contUsuarios.ContUsuarios;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContUsuariosRepository extends JpaRepository<ContUsuarios, Integer> {
}
