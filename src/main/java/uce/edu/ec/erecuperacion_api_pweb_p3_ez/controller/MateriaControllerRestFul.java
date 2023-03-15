package uce.edu.ec.erecuperacion_api_pweb_p3_ez.controller;

import java.util.List;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Link;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import uce.edu.ec.erecuperacion_api_pweb_p3_ez.repository.model.Materia;
import uce.edu.ec.erecuperacion_api_pweb_p3_ez.service.IMateriaService;
import uce.edu.ec.erecuperacion_api_pweb_p3_ez.service.to.MateriaTo;

@RequestMapping("/materias")
@CrossOrigin()
@RestController
public class MateriaControllerRestFul {

    @Autowired
    private IMateriaService materiaServ;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public void insertarMateria(@RequestBody Materia mate){
        this.materiaServ.insertarMateria(mate);
    }

    @PutMapping(path = "/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void actualizarMateria(@PathVariable("id") Integer id, @RequestBody Materia mate){
        this.materiaServ.actualizarMateria(id, mate);
    }

    @GetMapping(path = "/{id}")
    public MateriaTo buscarMateriaId(@PathVariable("id") Integer id){
        return this.materiaServ.buscarMateriaId(id);
    }

    @GetMapping
    public List<MateriaTo> buscarTodasMaterias(){
        List<MateriaTo> lista = this.materiaServ.buscarTodasMaterias();

       /* for (MateriaTo m : lista) {
			Link myLink=linkTo(methodOn(MateriaControllerRestFul.class).buscarMateriaId(m.getId())).withSelfRel();
			m.add(myLink);
            lista.add(m);
		} */ 

        return lista;
    }

    @DeleteMapping(path = "/{id}")
    public void eliminarMateria(@PathVariable("id") Integer id){
        this.materiaServ.eliminarMateria(id);
    }
    
}
