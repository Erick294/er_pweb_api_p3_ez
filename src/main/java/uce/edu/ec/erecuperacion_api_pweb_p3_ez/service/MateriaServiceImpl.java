package uce.edu.ec.erecuperacion_api_pweb_p3_ez.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uce.edu.ec.erecuperacion_api_pweb_p3_ez.repository.IMateriaRepository;
import uce.edu.ec.erecuperacion_api_pweb_p3_ez.repository.model.Materia;
import uce.edu.ec.erecuperacion_api_pweb_p3_ez.service.to.MateriaTo;

@Service
public class MateriaServiceImpl implements IMateriaService{

    @Autowired
    private IMateriaRepository materiaRepo;

    @Override
    public void actualizarMateria(Integer id, Materia mate) {
        // TODO Auto-generated method stub
        mate.setId(this.materiaRepo.buscarMateriaId(id).getId());
        this.materiaRepo.actualizarMateria(mate);
    }

    @Override
    public MateriaTo buscarMateriaId(Integer id) {
        // TODO Auto-generated method stub
        Materia mate = this.materiaRepo.buscarMateriaId(id);
        return convertir(mate);
    }

    @Override
    public List<MateriaTo> buscarTodasMaterias() {
        // TODO Auto-generated method stub
        List<Materia> aux = this.materiaRepo.buscarTodasMaterias();
        List<MateriaTo> tmp = aux.stream().map(materia -> convertir(materia)).collect(Collectors.toList());
        return tmp;
    }

    @Override
    public void eliminarMateria(Integer id) {
        // TODO Auto-generated method stub
        this.materiaRepo.eliminarMateria(id);
        
    }

    @Override
    public void insertarMateria(Materia mate) {
        // TODO Auto-generated method stub
        this.materiaRepo.insertarMateria(mate);
        
    }

    private MateriaTo convertir(Materia mate){
        MateriaTo mateTo = new MateriaTo();
        mateTo.setCodigo(mate.getCodigo());
        mateTo.setId(mate.getId());
        mateTo.setNumCreditos(mate.getNumCreditos());
        mateTo.setProfesor(mate.getProfesor());
        mateTo.setNombre(mate.getNombre());
        return mateTo;
    }
    
}
