package uce.edu.ec.erecuperacion_api_pweb_p3_ez.service;

import java.util.List;

import uce.edu.ec.erecuperacion_api_pweb_p3_ez.repository.model.Materia;
import uce.edu.ec.erecuperacion_api_pweb_p3_ez.service.to.MateriaTo;

public interface IMateriaService {

    public void insertarMateria(Materia mate);
    public void actualizarMateria(Integer id, Materia mate);
    public MateriaTo buscarMateriaId(Integer id);
    public List<MateriaTo> buscarTodasMaterias();
    public void eliminarMateria(Integer id);
    
}
