package ar.edu.unju.escmi.poo.ejercicio2;

public class Profesor extends Persona{
  private int Legajo;
  private int Antigüedad;
  private int SueldoBasico;
  
  public Profesor(String nombre, String apellido, int dni, int legajo, int antigüedad) {
    super(nombre, apellido, dni);
    Legajo = legajo;
    Antigüedad = antigüedad;
    SueldoBasico = 85000;
  }
  public int getLegajo() {
    return Legajo;
  }
  public void setLegajo(int legajo) {
    Legajo = legajo;
  }
  public int getAntigüedad() {
    return Antigüedad;
  }
  public void setAntigüedad(int antigüedad) {
    Antigüedad = antigüedad;
  }
  public int getSueldoBasico() {
    return SueldoBasico;
  }
  public void setSueldoBasico(int sueldoBasico) {
    SueldoBasico = sueldoBasico;
  }

  public int sueldo(){
    if(Antigüedad>=5){
      SueldoBasico=(int) (SueldoBasico+(SueldoBasico*0.25));
    }else{
      SueldoBasico=(int) (SueldoBasico+(SueldoBasico*0.1));
    }
    return SueldoBasico;
  }
  @Override
  public String toString() {
    return "Profesor [Nombre="+super.getNombre()+", Apellido="+super.getApellido() +", Dni="+super.getDni()+", Antigüedad=" + Antigüedad + ", Legajo=" + Legajo + ", SueldoBasico=" + SueldoBasico + "]";
  }
  
}
