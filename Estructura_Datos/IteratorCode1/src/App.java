import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;



public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        ArrayList<String> lista = new ArrayList(5);
        //size()
        
        boolean bandera = true;
        Scanner entrada = new Scanner(System.in);

        while(bandera){

            System.out.println("ingrese un elemento");
            lista.add(entrada.nextLine());
            Iterator<String> iterador = lista.iterator();
            
            while(iterador.hasNext()){
                System.out.println(iterador.next());
            }

            System.out.println("desea repetir si)a    No)otra letra");
            bandera = (entrada.nextLine().equals("a"));

        }
        

        System.out.println("impresion con for");
        for(int i = 0; i < lista.size();i++){
            System.out.println(lista.get(i));
        }
    }
}
