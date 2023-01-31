package Ejercicio.backend.EjercicioFinal.Dao;

import Ejercicio.backend.EjercicioFinal.Models.Usuario;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.awt.*;
@Repository
@Transactional
public class UsuarioDaoImp implements UsuarioDao{
    @PersistenceContext
    EntityManager entityManager;

    @Override
    public List<Usuariorio> getUsuarios() {
        String query = "FROM Usuario";
        List<Usuario> resultados = entityManager.createQuery(query).getResultList();
        return resultados;
    }
}
