package ar.edu.unju.escmi.poo.ejercicio3;

public class Rectangulo extends Figura{
  private double dato2;
  
  public Rectangulo(double dato1, String color, double dato2) {
    super(dato1, color);
    this.dato2 = dato2;
  }

  @Override
  public double calcularArea() {
    return super.dato1*dato2;
  }

  @Override
  public double calcularPerimetro() {
    return super.dato1*2+dato2*2;
  }

  public double getDato2() {
    return dato2;
  }

  public void setDato2(double dato2) {
    this.dato2 = dato2;
  }

  @Override
  public String toString() {
    return "Rectangulo [Perimetro =" + calcularPerimetro() +", Area="+calcularArea()+ "]";
  }
  
}
