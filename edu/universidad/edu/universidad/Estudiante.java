package edu.universidad;

import java.util.ArrayList;
import java.util.List;

public class Estudiante {
    private String nombre;
    private String colegioGraduacion;
    private String fechaIngreso;
    private List<Carrera> carreras;

    // Constructor
    public Estudiante(String nombre, String colegioGraduacion, String fechaIngreso) {
        this.nombre = nombre;
        this.colegioGraduacion = colegioGraduacion;
        this.fechaIngreso = fechaIngreso;
        this.carreras = new ArrayList<>();
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColegioGraduacion() {
        return colegioGraduacion;
    }

    public void setColegioGraduacion(String colegioGraduacion) {
        this.colegioGraduacion = colegioGraduacion;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public List<Carrera> getCarreras() {
        return carreras;
    }

    public void addCarrera(Carrera carrera) {
        this.carreras.add(carrera);
    }
}
