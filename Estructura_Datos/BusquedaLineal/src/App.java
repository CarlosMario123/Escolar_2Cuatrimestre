import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
      int[] arreglo = new int[100];
      ArrayList<Integer> numeros = new ArrayList<>();
       String number = "";
       Random r = new Random();
       int numero = 0;
      for(int i = 0; i < 100;i++){
        do{
            numero = r.nextInt(200);
            number = "" + numero;
        }while(number.length() > 4 || numeros.contains(numero));
        numeros.add(numero);
        arreglo[i] = numero; 
      }
       
      for(int i = 0; i < arreglo.length;i++){
        System.out.println((i) + " = " + arreglo[0]);
      }
      Scanner entrada = new Scanner(System.in);
      System.out.println("ingrese el numero a buscar");
      numero = entrada.nextInt();
      boolean bandera = true;
      for(int i = 0; i < arreglo.length;i++){
         if(numero == arreglo[i]){
           System.out.println("numero encontrado en la posicion " + i);
           bandera = false;
         }
      }

      if(bandera){
        System.out.println("numero no encontrado");
      }
    }
}
