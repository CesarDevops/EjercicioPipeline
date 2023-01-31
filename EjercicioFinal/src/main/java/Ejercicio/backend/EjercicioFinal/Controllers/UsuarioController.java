package Ejercicio.backend.EjercicioFinal.Controllers;

import Ejercicio.backend.EjercicioFinal.Models.Usuario;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsuarioController {

    @RequestMapping (value = "usuarios")
    public List<Usuario> getUsuarios() {
        List<Usuario> usuarios = new ArrayList<>();
        Usuario usuario = new Usuario();
        usuario.setNombre("Cesar");
        usuario.setEmail("Cesar@");
        usuario.setTelefono("12323534");
        usuario.setFecha("12323534");
        usuario.setId(123);

        Usuario usuario2 = new Usuario();
        usuario2.setNombre("Cesar");
        usuario2.setEmail("Cesar@");
        usuario2.setTelefono("12323534");
        usuario2.setFecha("12323534");
        usuario2.setId(321);

        Usuario usuario3 = new Usuario();
        usuario3.setNombre("Cesar");
        usuario3.setEmail("Cesar@");
        usuario3.setTelefono("12323534");
        usuario3.setFecha("12323534");
        usuario3.setId(432);

        Usuario usuario4 = new Usuario();
        usuario4.setNombre("Cesar");
        usuario4.setEmail("Cesar@");
        usuario4.setTelefono("12323534");
        usuario4.setFecha("12323534");
        usuario4.setId(654);

        usuarios.add(usuario);
        usuarios.add(usuario2);
        usuarios.add(usuario3);
        usuarios.add(usuario4);

        return usuarios;

    }

}
