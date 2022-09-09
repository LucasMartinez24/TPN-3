package ar.edu.unju.escmi.poo.ejercicio2;

public abstract class Persona {
  private String Nombre;
  private String Apellido;
  private int Dni;
  public Persona(String nombre, String apellido, int dni) {
    this.Nombre = nombre;
    this.Apellido = apellido;
    this.Dni = dni;
  }
  public String getNombre() {
    return Nombre;
  }
  public void setNombre(String nombre) {
    Nombre = nombre;
  }
  public String getApellido() {
    return Apellido;
  }
  public void setApellido(String apellido) {
    Apellido = apellido;
  }
  public int getDni() {
    return Dni;
  }
  public void setDni(int dni) {
    Dni = dni;
  }
  public abstract String toString();
}
