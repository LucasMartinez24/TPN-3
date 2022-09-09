package ar.edu.unju.escmi.poo.ejercicio3;

import java.util.Scanner;

public class Principal {
  public static void main(String[] args) {
    Scanner leer=new Scanner(System.in);
    int opc,ocup=0;
    Figura[] figura=new Figura[8];
    double dato1,dato2,dato3,h;
    String color;
    do {
      System.out.println("1- Crear un círculo.\n2- Crear un cuadrado.\n3- Crear un rectángulo.\n4- Crear un triángulo.\n5- Mostrar todas las figuras geométricas.\n6 – Ingrese un color y muestre todas las figuras con ese color.\n7 – Mostrar solo círculos.\n8 – Mostrar solo cuadrados.\n9 – Mostrar solo rectángulos.\n10 – Mostrar solo triángulos.\n11 – Salir.");
      opc=leer.nextInt();
      switch(opc){
        case 1:
        if(ocup!=figura.length){
          System.out.println("Ingrese el radio del circulo:");
          dato1=leer.nextInt();
          System.out.println("Ingrese el color:");
          color=leer.next();
          Circulo circulo=new Circulo(dato1, color);
          figura[ocup]=circulo;
          ocup++;
        }else{
          System.out.println("No hay espacio para mas figuras");
        }
        break;
        case 2:
        if(ocup!=figura.length){
          System.out.println("Ingrese el lado del cuadrado:");
          dato1=leer.nextInt();
          System.out.println("Ingrese el color:");
          color=leer.next();
          Cuadrado cuadrado=new Cuadrado(dato1, color);
          figura[ocup]=cuadrado;
          ocup++;
        }else{
          System.out.println("No hay espacio para mas figuras");
        }
        break;
        case 3:
          if(ocup!=figura.length){
            System.out.println("Ingrese un lado del rectangulo:");
            dato1=leer.nextInt();
            System.out.println("Ingrese el otro lado del rectangulo:");
            dato2=leer.nextInt();
            System.out.println("Ingrese el color:");
            color=leer.next();
            Rectangulo rectangulo=new Rectangulo(dato1, color, dato2);
            figura[ocup]=rectangulo;
            ocup++;
          }else{
            System.out.println("No hay espacio para mas figuras");
          }
        break;
        case 4:
          if(ocup!=figura.length){
            System.out.println("Ingrese un lado del triangulo:");
            dato1=leer.nextInt();
            System.out.println("Ingrese el otro lado del triangulo:");
            dato2=leer.nextInt();
            System.out.println("Ingrese el otro lado del triangulo:");
            dato3=leer.nextInt();
            System.out.println("Ingrese la altura del triangulo:");
            h=leer.nextInt();
            System.out.println("Ingrese el color:");
            color=leer.next();
            Triangulo triangulo=new Triangulo(dato1, color, dato2, dato3, h);
            figura[ocup]=triangulo;
            ocup++;
          }else{
            System.out.println("No hay espacio para mas figuras");
          }
        break;
        case 5:
          for (Figura figura2 : figura) {
            System.out.println(figura2.toString());
          }
        break;
        case 6:
        break;
        case 7:
        break;
        case 8:
        break;
        case 9:
        break;
        case 10:
        break;
        case 11:
        System.out.println("Saliendo...");
        break;
        default:
        System.out.println("Opcion incorrecta.");
        break;
      }
    } while (opc!=11);
  }
}
