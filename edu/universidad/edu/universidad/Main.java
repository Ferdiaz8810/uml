package edu.universidad;

public class Main {
  public static void main(String[] args) {
      // Crear Universidad
      Universidad universidad = new Universidad("Universidad EAN", "Ciudad Capital BOGOTA");

      // Crear Facultad
      Facultad facultad = new Facultad("Facultad de Ingeniería", "FIE");

      // Crear Profesor
      Profesor profesor = new Profesor("Dr. MANUEL DIAZ", "Ingeniero de Sistemas", "Colombiano", 5000, facultad);
      facultad.addProfesor(profesor);

      // Crear Carrera
      Carrera carrera = new Carrera("Ingeniería de Industriales", 150, 10, Carrera.Nivel.PREGRADO, facultad);

      // Crear Estudiante
      Estudiante estudiante = new Estudiante("Ana López", "Colegio ABC", "2023-01-01");
      estudiante.addCarrera(carrera);

      // Crear Curso
      Curso curso = new Curso("CS101", "Algoritmos y Estructuras de Datos", 4, "A101", "Edificio 1", carrera);
      curso.addProfesor(profesor);
      curso.addEstudiante(estudiante);

      // Mostrar información
      System.out.println("Universidad: " + universidad.getNombre() + ", Ubicación: " + universidad.getUbicacion());
      System.out.println("Facultad: " + facultad.getNombre() + ", Código: " + facultad.getCodigo());
      System.out.println("Profesor: " + profesor.getNombre() + ", Profesión: " + profesor.getProfesion());
      System.out.println("Carrera: " + carrera.getNombre() + ", Créditos Totales: " + carrera.getCreditosTotales());
      System.out.println("Estudiante: " + estudiante.getNombre() + ", Colegio: " + estudiante.getColegioGraduacion());
      System.out.println("Curso: " + curso.getNombre() + ", Créditos: " + curso.getCreditos());
  }
}
