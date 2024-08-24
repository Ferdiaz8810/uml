package edu.universidad;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String codigo;
    private String nombre;
    private int creditos;
    private String salon;
    private String edificio;
    private Carrera carrera;
    private List<Profesor> profesores;
    private List<Estudiante> estudiantes;

    // Constructor
    public Curso(String codigo, String nombre, int creditos, String salon, String edificio, Carrera carrera) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.creditos = creditos;
        this.salon = salon;
        this.edificio = edificio;
        this.carrera = carrera;
        this.profesores = new ArrayList<>();
        this.estudiantes = new ArrayList<>();
    }

    // Getters y Setters
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public String getSalon() {
        return salon;
    }

    public void setSalon(String salon) {
        this.salon = salon;
    }

    public String getEdificio() {
        return edificio;
    }

    public void setEdificio(String edificio) {
        this.edificio = edificio;
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }

    public List<Profesor> getProfesores() {
        return profesores;
    }

    public void addProfesor(Profesor profesor) {
        this.profesores.add(profesor);
    }

    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void addEstudiante(Estudiante estudiante) {
        this.estudiantes.add(estudiante);
    }
}
