import java.util.ArrayList;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        ArrayList[] materia = new ArrayList[4];
        String nombre = "";
        String matricula = "";
        double calificacion = 0;
        int opcion2 = 0;
         Scanner entrada = new Scanner(System.in);
        for(int i = 0; i < materia.length;i++){
           materia[i] = new ArrayList<Alumno>();
        }

        boolean bandera = true;
         while(bandera){
    System.out.println("1.Agregar alumno");
    System.out.println("2. Salir");
    int opcion=entrada.nextInt();
    entrada.nextLine();

    switch (opcion){
        case 1:
        do{
            System.out.println("ingrese que materia desea añadir 1 al 4");
            opcion2 = entrada.nextInt();
           }while(opcion2 < 1 || opcion2 > 4);
           
           System.out.println("ingrese el nombre del alumno");
           nombre = entrada.next();
           System.out.println("ingrese la matricula del alumno");
           matricula = entrada.next();
           System.out.println("ingrese la calificacion del alumno");
           calificacion = entrada.nextDouble();
           boolean exito = materia[opcion2].add(new Alumno(nombre, matricula, calificacion));
           if (exito)
            System.out.println("alumno registrado");
           else 
            System.out.println("alumno registrado");
        break;
        
        case 2:
        System.out.println("saliendo");
        bandera = false;
        break;
        
        default:
        System.out.println("Opcion invalida, elige una opcion entre 1 y 2");
    }
   }

     
   
     


          
    }
}
