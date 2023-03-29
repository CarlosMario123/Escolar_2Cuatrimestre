import java.security.Key;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

import javax.sound.midi.Soundbank;

public class App {
    public static void main(String[] args) throws Exception {
        HashMap<String,Alumno> lista  = new HashMap<>();
        String opcion = "1";
        Scanner entrada = new Scanner(System.in);

        do{
        System.out.println("1)Agregar alumno");
        System.out.println("2)buscar");
        System.out.println("3)Eliminar");
        System.out.println("4)salir");
        opcion = entrada.nextLine();
        switch(opcion){
            case "1":
              Alumno alumno = crearAlumno();
              String llave = generarLlave();
              if(lista.containsKey(llave)){
                System.out.println("matricula ya existente");
              }else{
                lista.put(llave, alumno);
                System.out.println("alumno agregado correctamente");
              }
            break;

            case "2":
            System.out.println("ingrese la llave a buscar");
             String llave2 = generarLlave();
             buscar(lista, llave2);
            break;

            case "3":
            System.out.println("ingrese la matricula a Eliminar");
              llave2 = generarLlave();
              EliminarAlumno(lista, llave2);
              
            break;
        }
        }while(!opcion.equals("4"));
       
    }

    public static Alumno crearAlumno(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el nombre");
        String nombre = entrada.nextLine();
        System.out.println("Ingrese el apellido");
        String apellido = entrada.nextLine();
        System.out.println("Ingrese la carrera");
        String Carrera = entrada.nextLine();
        System.out.println("Ingrese el cuatrimestre");
        String cuatrimestre = entrada.nextLine();
        return new Alumno(nombre, apellido, cuatrimestre,Carrera);
    }

    public static String generarLlave(){
        Scanner entrada = new Scanner(System.in);
        String llave = "";
        do{
          System.out.println("ingrese la matricula");
          llave = entrada.nextLine();
        }while(llave.length() != 5);
        return llave;
    }


    public static void buscar(HashMap<String,Alumno> lista,String llave){
        Set<String> lista2 = lista.keySet();
        boolean bandera = false;

        for(String clave: lista2){
            if(clave.equals(llave)){
               System.out.println(lista.get(llave).mostrarInformacion());
               bandera=true;
            }
        }
        if(bandera){
            System.out.println("Alumno no encontrado");
        }
    }

    public static void EliminarAlumno(HashMap<String,Alumno> lista,String llave){
        Set<String> lista2 = lista.keySet();
        boolean bandera = true;

        for(String clave: lista2){
            if(clave.equals(llave)){
               System.out.println("eliminado");
               lista.remove(llave);
               bandera=false;
               break;
            }
        }
        if(bandera){
            System.out.println("Alumno no encontrado");
        }
    }
}
