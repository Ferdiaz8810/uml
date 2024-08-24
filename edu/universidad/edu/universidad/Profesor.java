package edu.universidad;

public class Profesor {
  private String nombre;
  private String profesion;
  private String nacionalidad;
  private double sueldo;
  private Facultad facultad;

  // Constructor
  public Profesor(String nombre, String profesion, String nacionalidad, double sueldo, Facultad facultad) {
      this.nombre = nombre;
      this.profesion = profesion;
      this.nacionalidad = nacionalidad;
      this.sueldo = sueldo;
      this.facultad = facultad;
  }

  // Getters y Setters
  public String getNombre() {
      return nombre;
  }

  public void setNombre(String nombre) {
      this.nombre = nombre;
  }

  public String getProfesion() {
      return profesion;
  }

  public void setProfesion(String profesion) {
      this.profesion = profesion;
  }

  public String getNacionalidad() {
      return nacionalidad;
  }

  public void setNacionalidad(String nacionalidad) {
      this.nacionalidad = nacionalidad;
  }

  public double getSueldo() {
      return sueldo;
  }

  public void setSueldo(double sueldo) {
      this.sueldo = sueldo;
  }

  public Facultad getFacultad() {
      return facultad;
  }

  public void setFacultad(Facultad facultad) {
      this.facultad = facultad;
  }
}
