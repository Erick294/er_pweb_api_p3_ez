package uce.edu.ec.erecuperacion_api_pweb_p3_ez.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import uce.edu.ec.erecuperacion_api_pweb_p3_ez.repository.model.Materia;

@Repository
@Transactional
public class MateriaRepositoryImpl implements IMateriaRepository{

    @PersistenceContext
    private EntityManager entity;

    @Override
    public void actualizarMateria(Materia mate) {
        // TODO Auto-generated method stub
        this.entity.merge(mate);
    }

    @Override
    public Materia buscarMateriaId(Integer id) {
        // TODO Auto-generated method stub
        TypedQuery<Materia> query = this.entity.createQuery("SELECT m FROM Materia m WHERE m.id = :id", Materia.class);
        query.setParameter("id", id);
        return query.getSingleResult();
    }

    @Override
    public List<Materia> buscarTodasMaterias() {
        // TODO Auto-generated method stub
        TypedQuery<Materia> query = this.entity.createQuery("SELECT m FROM Materia m", Materia.class);
        return query.getResultList();
    }

    @Override
    public void eliminarMateria(Integer id) {
        // TODO Auto-generated method stub
        this.entity.remove(id);
        
    }

    @Override
    public void insertarMateria(Materia mate) {
        // TODO Auto-generated method stub
        this.entity.persist(mate);
        
    }

    
    
}
