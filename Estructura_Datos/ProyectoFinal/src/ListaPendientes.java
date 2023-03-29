import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class ListaPendientes {
    private static ArrayList<UtilesEscolares> listaUtiles = new ArrayList<>();
    private static HashMap<String, UtilesEscolares> mapaUtiles = new HashMap<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        char opcion;

        do {
            System.out.println("\nMENU DE OPCIONES\n");
            System.out.println("1. Agregar elementos");
            System.out.println("2. Modificar pendientes");
            System.out.println("3. Buscar elemento");
            System.out.println("4. Eliminar elemento");
            if (listaUtiles.size() > 0) {
                System.out.println("5. Ordenar elementos (alfabéticamente)");
                System.out.println("6. Imprimir lista de pendientes");
            }
            System.out.println("X. Salir");
            System.out.print("\nElija una opción: ");
            opcion = scanner.nextLine().charAt(0);

            switch (opcion) {
                case '1':
                    agregarElemento();
                    break;
                case '2':
                    modificarPendientes();
                    break;
                case '3':
                    buscarElemento();
                    break;
                case '4':
                    eliminarElemento();
                    break;
                case '5':
                    ordenarElementos();
                    break;
                case '6':
                    imprimirLista();
                    break;
                case 'x':
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 'X' && opcion != 'x');

        scanner.close();
    }

    private static void agregarElemento() {
        System.out.print("\nIngrese la descripción del elemento: ");
        String descripcion = scanner.nextLine().toUpperCase();

        if (mapaUtiles.containsKey(descripcion)) {
            System.out.println("Este elemento ya ha sido agregado.");
            return;
        }
        
        int cantidadAComprar = 0;
        do{
            System.out.print("Ingrese la cantidad a comprar: ");
            cantidadAComprar = scanner.nextInt();
            scanner.nextLine();

            if(cantidadAComprar < 1){
                System.out.println("la cantidad debe ser mayor a cero intente de nuevo");
            }
        }while(cantidadAComprar < 1);
      

        UtilesEscolares nuevoElemento = new UtilesEscolares(descripcion, cantidadAComprar, 0);
        listaUtiles.add(nuevoElemento);
        mapaUtiles.put(descripcion, nuevoElemento);

        System.out.println("Elemento agregado exitosamente.");
    }

    private static void modificarPendientes() {
        if (listaUtiles.size() == 0) {
            System.out.println("\nNo hay elementos para modificar.");
            return;
        }

        System.out.println("\nElija el elemento a modificar:");
        for (int i = 0; i < listaUtiles.size(); i++) {
            System.out.println((i + 1) + ". " + listaUtiles.get(i).toString());
        }

        int opcion = scanner.nextInt();
        scanner.nextLine();

        if (opcion < 1 || opcion > listaUtiles.size()) {
            System.out.println("Opción no válida.");
            return;
        }

        UtilesEscolares elemento = listaUtiles.get(opcion - 1);

        System.out.println("Elemento seleccionado: " + elemento.toString());
        System.out.print("Ingrese la cantidad comprada: ");
        int cantidadComprada = 0;
        do{
             cantidadComprada = scanner.nextInt();
            scanner.nextLine();

            if(cantidadComprada < 1){
              System.out.println("la cantidad debe ser mayor a cero intente de nuevo");
            }
        }while(cantidadComprada < 1);
       

        elemento.modificarCantidadComprada(cantidadComprada);
        System.out.println("Cantidad comprada modificada exitosamente.");
    }

    private static void buscarElemento() {
        if (listaUtiles.size() == 0) {
            System.out.println("\nNo hay elementos para buscar.");
            return;
        }

        System.out.print("\nIngrese la descripción del elemento: ");
        String descripcion = scanner.nextLine().toUpperCase();

        if (!mapaUtiles.containsKey(descripcion)) {
            System.out.println("Elemento no encontrado.");
            return;
        }

        UtilesEscolares elemento = mapaUtiles.get(descripcion);
        int cantidadPendiente = elemento.obtenerDiferencia();

        if (cantidadPendiente < 0) {
            System.out.println("ATENCIÓN: Se ha comprado una cantidad mayor a la requerida.");
        }

        System.out.println("Descripción: " + elemento.getDescripcion());
        if( cantidadPendiente < 0){
            System.out.println("hay de elementos de sobras cantidad: " + cantidadPendiente * -1 );
        }else{
            System.out.println("Cantidad pendiente a adquirir: " +cantidadPendiente); 
        }
       
    }

    private static void eliminarElemento() {
        if (listaUtiles.size() == 0) {
            System.out.println("\nNo hay elementos para eliminar.");
            return;
        }

        System.out.println("\nElija el elemento a eliminar:");
        for (int i = 0; i < listaUtiles.size(); i++) {
            System.out.println((i + 1) + ". " + listaUtiles.get(i).toString());
        }

        int opcion = scanner.nextInt();
        scanner.nextLine();

        if (opcion < 1 || opcion > listaUtiles.size()) {
            System.out.println("Opción no válida.");
            return;
        }

        UtilesEscolares elemento = listaUtiles.get(opcion - 1);
        listaUtiles.remove(elemento);
        mapaUtiles.remove(elemento.getDescripcion());

        System.out.println("Elemento eliminado exitosamente.");
    }

    private static void ordenarElementos() {
        Collections.sort(listaUtiles);
        System.out.println("\nLa lista ha sido ordenada alfabéticamente.");
    }

    private static void imprimirLista() {
        System.out.println("\nLista de pendientes:");
        for (UtilesEscolares elemento : listaUtiles) {
            System.out.println(elemento.toString());
        }
    }

}