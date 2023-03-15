package uce.edu.ec.erecuperacion_api_pweb_p3_ez.repository.model;

import org.springframework.context.annotation.Primary;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name = "materia")
public class Materia {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "mate_id")
    private Integer id;

    @Column(name  = "mate_codigo")
    private String codigo;

    @Column(name  = "mate_nombre")
    private String nombre;

    @Column(name = "mate_profesor")
    private String profesor;

    @Column(name  = "mate_numero_creditos")
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

    public Integer getNumCreditos() {
        return numCreditos;
    }

    public void setNumCreditos(Integer numCreditos) {
        this.numCreditos = numCreditos;
    }

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
}
