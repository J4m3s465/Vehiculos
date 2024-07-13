package com.taller.vh.Controlador;

import com.taller.vh.Entidad.Usuario;
import com.taller.vh.Servicio.UsuarioServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping
public class UsuarioControlador{
    @Autowired
    private UsuarioServicio usuarioServicio;
    //home
    @GetMapping("/home")
    public String home(){
        return "/Usuario/index";
    }
    //leer
    @GetMapping("/usuarios")
    public String mostrarFormulario(Model model){
        List<Usuario> usuarios = usuarioServicio.getUsuario();
        model.addAttribute("usuarios", usuarios);
        return "/usuario/usuario";
    }
    //CREAR
    @GetMapping("/usuario/form")
    public String formulario(Model model){
        model.addAttribute("usuario", new Usuario());
        return "/usuario/formulario";
    }
    @PostMapping("/usuario/guardar")
    public String guardarActualizar(Usuario usuario){
        usuarioServicio.guardarActualizar(usuario);
        return "redirect:/usuarios";
    }
    //Actilzar

    @GetMapping("/usuario/editar/{id}")
    public String actualiza(@PathVariable Long id, Model model){

        Optional<Usuario> usuario = usuarioServicio.getUsuario(id);
        model.addAttribute("usuario", usuario);

        return "usuario/formulario";
    }
    @GetMapping("/usuario/eliminar/{id}")
    public String elimina(@PathVariable("id") Long id)
    {
        usuarioServicio.eliminar(id);
        return "redirect:/usuarios";
    }

}