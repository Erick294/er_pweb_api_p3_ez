package uce.edu.ec.erecuperacion_api_pweb_p3_ez.repository;

import java.util.List;

import uce.edu.ec.erecuperacion_api_pweb_p3_ez.repository.model.Materia;

public interface IMateriaRepository {
    
    public void insertarMateria(Materia mate);
    public void actualizarMateria(Materia mate);
    public Materia buscarMateriaId(Integer id);
    public List<Materia> buscarTodasMaterias();
    public void eliminarMateria(Integer id);
}
