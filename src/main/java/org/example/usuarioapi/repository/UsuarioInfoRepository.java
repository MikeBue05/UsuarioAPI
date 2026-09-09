package org.example.usuarioapi.repository;

import org.example.usuarioapi.model.UsuarioInfo;
import  org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioInfoRepository extends JpaRepository<UsuarioInfo, Integer> {
}
