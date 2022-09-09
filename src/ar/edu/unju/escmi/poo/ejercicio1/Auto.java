package ar.edu.unju.escmi.poo.ejercicio1;

public class Auto {
  private String Patente;
  private String Marca;
  private String Color;
  private String Modelo;
  private int anio;

  public Auto(String patente, String marca, String color, String modelo, int anio) {
    this.Patente = patente;
    this.Marca = marca;
    this.Color = color;
    this.Modelo = modelo;
    this.anio = anio;
  }


  public Auto(String patente, String color, String modelo) {
    this.Patente = patente;
    this.Marca = "Peugeot";
    this.Color = color;
    this.Modelo = modelo;
    this.anio = 2010;
  }


  public Auto() {
  }


  public String getPatente() {
    return Patente;
  }
  public void setPatente(String patente) {
    Patente = patente;
  }
  public String getMarca() {
    return Marca;
  }
  public void setMarca(String marca) {
    Marca = marca;
  }
  public String getColor() {
    return Color;
  }
  public void setColor(String color) {
    Color = color;
  }
  public String getModelo() {
    return Modelo;
  }
  public void setModelo(String modelo) {
    Modelo = modelo;
  }
  public int getAnio() {
    return anio;
  }
  public void setAnio(int anio) {
    this.anio = anio;
  }
  public String Avanzar(){
    System.out.println("Estoy avanzando");
    return null;
  }
  public String Acelerar(){
    System.out.println("Estoy acelerando");
    return null;
  }
  public String Frenar(){
    System.out.println("Estoy frenando");
    return null;
  }
  public String Girar(){
    System.out.println("Estoy girando");
    return null;
  }
  public String LimpiarCristales(){
    System.out.println("Estoy limpiando los cristales");
    return null;
  }
  @Override
  public String toString() {
    return "Auto [Color=" + Color + ", Marca=" + Marca + ", Modelo=" + Modelo + ", Patente=" + Patente + ", anio="
        + anio + "]";
  }

}

