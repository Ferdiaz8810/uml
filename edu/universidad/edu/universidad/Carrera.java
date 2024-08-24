package edu.universidad;

public class Carrera {
  public enum Nivel {PREGRADO, POSTGRADO}

  private String nombre;
  private int creditosTotales;
  private int duracionSemestres;
  private Nivel nivel;
  private Facultad facultad;

  // Constructor
  public Carrera(String nombre, int creditosTotales, int duracionSemestres, Nivel nivel, Facultad facultad) {
      this.nombre = nombre;
      this.creditosTotales = creditosTotales;
      this.duracionSemestres = duracionSemestres;
      this.nivel = nivel;
      this.facultad = facultad;
  }

  // Getters y Setters
  public String getNombre() {
      return nombre;
  }

  public void setNombre(String nombre) {
      this.nombre = nombre;
  }

  public int getCreditosTotales() {
      return creditosTotales;
  }

  public void setCreditosTotales(int creditosTotales) {
      this.creditosTotales = creditosTotales;
  }

  public int getDuracionSemestres() {
      return duracionSemestres;
  }

  public void setDuracionSemestres(int duracionSemestres) {
      this.duracionSemestres = duracionSemestres;
  }

  public Nivel getNivel() {
      return nivel;
  }

  public void setNivel(Nivel nivel) {
      this.nivel = nivel;
  }

  public Facultad getFacultad() {
      return facultad;
  }

  public void setFacultad(Facultad facultad) {
      this.facultad = facultad;
  }
}
