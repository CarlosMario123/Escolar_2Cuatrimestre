import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Scanner entrada = new Scanner(System.in);
        ArrayList<String> alumnos = new ArrayList<>();
        
        String opcion = "";
        boolean bandera = true;


        do{
            System.out.println("a)agregar Alumno");
            System.out.println("b)salir");
            opcion = entrada.nextLine();

            switch(opcion){
               case "a":
               System.out.println("ingrese el nombre");
               String nombre = entrada.nextLine();
               System.out.println("ingrese el apellido");
               String apellido = entrada.nextLine();
               System.out.println("ingrese matricula");
               String matricula = entrada.nextLine();
               Alumno alumno = new Alumno(nombre, apellido, matricula);
               if(alumnos.contains(alumno)){
                 System.out.println("alumno ya existe");
               }else{
                System.out.println("se agrego");
                alumnos.add(alumno.curp());
                System.out.println(alumno);
               }
               break;
               case "b":
               System.out.println("saliendo");
               bandera = false;
               break;
            }
        }while(bandera);

    }
}
