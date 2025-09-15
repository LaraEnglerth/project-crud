package com.englerth.project_crud.infrastructure.repository;

import com.englerth.project_crud.infrastructure.entitys.Usuario;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

    Optional<Usuario> findByEmail(String email); //preciso criar exceção caso não exista

    @Transactional //caso der erro, não pode deletar
    void deleteByEmail(String email);
}
