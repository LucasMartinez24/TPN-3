package ar.edu.unju.escmi.poo.ejercicio2;

import java.util.Arrays;

public class Alumno extends Persona{
  private String LibretaUniversitaria;
  private int[] Notas= new int[5];
  public Alumno(String nombre, String apellido, int dni) {
		super(nombre, apellido, dni);
  }
  public String getLibretaUniversitaria() {
    return LibretaUniversitaria;
  }
  public void setLibretaUniversitaria(String libretaUniversitaria) {
    LibretaUniversitaria = libretaUniversitaria;
  }
  public int[] getNotas() {
    return Notas;
  }
  public void setNotas(int[] notas) {
    Notas = notas;
  }
  public int Promedio(){
    int promedio=0;
    for (int i : Notas) {
      promedio=promedio+i;
    }
    return promedio;
  }
  @Override
  public String toString() {
    return "Alumno [Nombre="+super.getNombre()+", Apellido="+super.getApellido() +", Dni="+super.getDni()+", Libreta Universitaria="+ LibretaUniversitaria + ", Promedio de notas=" + Promedio() + "]";
  }
  
}
