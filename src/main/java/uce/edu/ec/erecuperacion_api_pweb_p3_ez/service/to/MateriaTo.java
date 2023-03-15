package uce.edu.ec.erecuperacion_api_pweb_p3_ez.service.to;

import org.springframework.hateoas.RepresentationModel;

public class MateriaTo extends RepresentationModel<MateriaTo>{

    private Integer id;
    private String codigo;
    private String nombre;
    private String profesor;
    private Integer numCreditos;
    
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getProfesor() {
        return profesor;
    }
    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }
    public Integer getNumCreditos() {
        return numCreditos;
    }
    public void setNumCreditos(Integer numCreditos) {
        this.numCreditos = numCreditos;
    }
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
}
