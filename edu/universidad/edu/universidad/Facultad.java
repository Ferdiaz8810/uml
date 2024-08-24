package edu.universidad;

import java.util.ArrayList;
import java.util.List;

public class Facultad {
    private String nombre;
    private String codigo;
    private List<Profesor> profesores;

    // Constructor
    public Facultad(String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.profesores = new ArrayList<>();
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public List<Profesor> getProfesores() {
        return profesores;
    }

    public void addProfesor(Profesor profesor) {
        this.profesores.add(profesor);
    }
}
