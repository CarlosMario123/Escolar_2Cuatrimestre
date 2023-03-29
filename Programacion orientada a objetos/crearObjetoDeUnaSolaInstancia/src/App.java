import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //Empezamos arrancando nuestra base de datos
        BaseDatos.Iniciar();
        Scanner entrada = new Scanner(System.in);
        int opcion = 0;
        //creamos un menu

        do{
            System.out.println("1)Agregar persona");
            System.out.println("2)Eliminar");
            System.out.println("3)Salir");
            opcion = entrada.nextInt();

            switch(opcion){
                case 1:
                addPersona();
                break;
                case 2:
                eliminarPersona();
                break;
            }
        }while(opcion != 3);

    }

    //metodo para agregar persona
    public static void addPersona(){
      Scanner entrada = new Scanner(System.in);
      System.out.println("ingrese el nombre de la persona");
       String nombre = entrada.nextLine();
       System.out.println("ingrese la edad de la persona");
       int edad = Integer.parseInt(entrada.nextLine());
       System.out.println("ingrese el pais de origen de la persona");
       String paisOrigen = entrada.nextLine();
       System.out.println("ingrese el id de la persona");
       String id = entrada.nextLine();

        BaseDatos.agregarPersonas(new Persona(nombre, edad, paisOrigen, id));
    }

    public static void eliminarPersona(){
          Scanner entrada = new Scanner(System.in);
          System.out.println("ingrese el id de la persona");
          String id = entrada.nextLine();

          BaseDatos.deletePersona(id);
    }
}
