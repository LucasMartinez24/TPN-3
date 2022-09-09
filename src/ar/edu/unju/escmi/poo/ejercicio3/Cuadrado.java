package ar.edu.unju.escmi.poo.ejercicio3;

public class Cuadrado extends Figura{

  public Cuadrado(double dato1, String color) {
    super(dato1, color);
  }

  @Override
  public double calcularArea() {
    return Math.pow(super.dato1,2);
  }

  @Override
  public double calcularPerimetro() {
    return super.dato1*4;
  }

  @Override
  public String toString() {
    return "Cuadrado [Perimetro =" + calcularPerimetro() +", Area="+calcularArea()+ "]";
  }
  
}
