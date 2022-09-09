package ar.edu.unju.escmi.poo.ejercicio3;

public class Triangulo extends Figura{
  private double dato2;
  private double dato3;
  private double h;

  public Triangulo(double dato1, String color, double dato2, double dato3, double h) {
    super(dato1, color);
    this.dato2 = dato2;
    this.dato3 = dato3;
    this.h = h;
  }

  @Override
  public double calcularArea() {
    return (super.dato1*h)/2;
  }

  @Override
  public double calcularPerimetro() {
    return super.dato1+dato2+dato3;
  }

  public double getDato2() {
    return dato2;
  }

  public void setDato2(double dato2) {
    this.dato2 = dato2;
  }

  public double getDato3() {
    return dato3;
  }

  public void setDato3(double dato3) {
    this.dato3 = dato3;
  }

  public double getH() {
    return h;
  }

  public void setH(double h) {
    this.h = h;
  }

  @Override
  public String toString() {
    return "Triangulo [Perimetro =" + calcularPerimetro() +", Area="+calcularArea()+ "]";
  }
  
}
