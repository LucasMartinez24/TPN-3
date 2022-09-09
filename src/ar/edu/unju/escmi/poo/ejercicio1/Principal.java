package ar.edu.unju.escmi.poo.ejercicio1;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws Exception {
        Scanner leer=new Scanner(System.in);
        String patente,Marca,color,modelo;
        int anio;
        int opc;
        do {
            System.out.println("1)Crear objeto con Constructor por defecto.");
            System.out.println("2)Crear objeto con Constructor parametrizado.");
            System.out.println("3)Crear objeto con Constructor (año fabricación y marca).");
            System.out.println("4)Salir.");
            opc=leer.nextInt();
            switch (opc) {
                case 1:
                Auto auto=new Auto();
                System.out.println(auto);
                break;
                case 2:
                System.out.println("Ingrese la patente:");
                patente=leer.next();
                System.out.println("Ingrese la marca:");
                Marca=leer.next();
                System.out.println("Ingrese el color:");
                color=leer.next();
                System.out.println("Ingrese el modelo:");
                modelo=leer.next();
                System.out.println("Ingrese el año:");
                anio=leer.nextInt();
                Auto auto2=new Auto(patente, Marca, color, modelo, anio);
                System.out.println(auto2);
                break;
                case 3:
                System.out.println("Ingrese la patente:");
                patente=leer.next();
                System.out.println("Ingrese el color:");
                color=leer.next();
                System.out.println("Ingrese el modelo:");
                modelo=leer.next();
                Auto auto3=new Auto(patente, color, modelo);
                System.out.println(auto3);
                break;
                case 4:
                System.out.println("Saliendo...");
                break;
                default:
                System.out.println("Opción incorrecta.");
                break;
            }
        } while (opc!=4);
    }
}
