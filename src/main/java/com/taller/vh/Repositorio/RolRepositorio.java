package com.taller.vh.Repositorio;


import com.taller.vh.Entidad.Rol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolRepositorio extends JpaRepository <Rol, Long> {
    Rol findByName(String name);
}
