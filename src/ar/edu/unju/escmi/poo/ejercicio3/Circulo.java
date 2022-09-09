package ar.edu.unju.escmi.poo.ejercicio3;

public class Circulo extends Figura{
  public double pi=Math.PI;
  public double getPi() {
    return pi;
  }
  public void setPi(double pi) {
    this.pi = pi;
  }
  public Circulo(double dato1, String color) {
    super(dato1, color);
  }
  @Override
  public double calcularArea() {
    return pi*(Math.pow(super.dato1,2));
  }

  @Override
  public double calcularPerimetro() {
    return 2*pi*super.dato1;
  }
  @Override
  public String toString() {
    return "Circulo [Perimetro =" + calcularPerimetro() +", Area="+calcularArea()+ "]";
  }
}
