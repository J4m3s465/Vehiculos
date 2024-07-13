package com.taller.vh.Servicio;

import com.taller.vh.Entidad.Usuario;
import com.taller.vh.Repositorio.UsuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioServicio {

    @Autowired

    UsuarioRepositorio usuarioRepositorio;
    public List<Usuario> getUsuario(){

        return usuarioRepositorio.findAll();
    }

    public Optional<Usuario> getUsuario(Long id){
        return usuarioRepositorio.findById(id);

    }

    public void guardarActualizar(Usuario usuario){
        usuarioRepositorio.save(usuario);
    }

    public void eliminar(Long id){
        usuarioRepositorio.deleteById(id);
    }

}
