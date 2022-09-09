package ar.edu.unju.escmi.poo.ejercicio2;

import java.util.Scanner;

public class Principal {
  public static void main(String[] args) {
    Persona[] personas=new Persona[4];
    int opc,ocup=0,legajo,antigüedad,dni;
    Scanner leer=new Scanner(System.in);
    String nombre,apellido;
    do {
      System.out.println("1- Alta de alumno.\n2- Alta de profesor.\n3- Mostrar alumnos.\n4- Mostrar profesores.\n5- Salir.");
      opc=leer.nextInt();
      switch (opc) {
        case 1:
        if(ocup!=personas.length){
          Alumno alumno=new Alumno("", "", 0);
          System.out.println("Ingrese su nombre:");
          alumno.setNombre(leer.next());
          System.out.println("Ingrese su apellido:");
          alumno.setApellido(leer.next());
          System.out.println("Ingrese su DNI:");
          alumno.setDni(leer.nextInt());
          System.out.println("Ingrese su libreta universitaria:");
          alumno.setLibretaUniversitaria(leer.next());
          int[] aux=new int[5];
          for (int i = 0; i < alumno.getNotas().length; i++) {
            System.out.println("Ingrese su nota:");
            aux[i]=leer.nextInt();
          }
          alumno.setNotas(aux);
          personas[ocup]=alumno;
          ocup++;
        }else{
          System.out.println("No hay espacio para mas alumnos.");
        }
        break;
        case 2:
        if(ocup!=personas.length){
          System.out.println("Ingrese su nombre:");
          nombre=leer.next();
          System.out.println("Ingrese su apellido:");
          apellido=leer.next();
          System.out.println("Ingrese su DNI:");
          dni=leer.nextInt();
          System.out.println("Ingrese su numero de legajo:");
          legajo=leer.nextInt();
          System.out.println("Ingrese su antiguedad:");
          antigüedad=leer.nextInt();
          Profesor profesor=new Profesor(nombre, apellido, dni, legajo, antigüedad);
          profesor.setSueldoBasico(profesor.sueldo());
          personas[ocup]=profesor;
          ocup++;
        }else{
          System.out.println("No hay espacio para mas profesores.");
        }
        break;
        case 3:
          for (Persona persona : personas) {
            if(persona instanceof Alumno){
              System.out.println(persona.toString());
            }
          }
        break;
        case 4:
          for (Persona persona : personas) {
            if(persona instanceof Profesor){
              System.out.println(persona.toString());
            }
          }
        break;
        case 5:
        System.out.println("Saliendo....");
        break;
        default:
        System.out.println("Opcion Incorrecta.");
        break;
      }
    } while (opc!=5);
  }
}
