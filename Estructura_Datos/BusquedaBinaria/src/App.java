import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        int[] arreglo = new int[10];
        int inicio = 0;
        int fin = arreglo.length - 1;
        int medio = 0;

        ArrayList<Integer> numeros = new ArrayList<>();
       String number = "";
       Random r = new Random();
       int numero = 0;
      for(int i = 0; i <arreglo.length;i++){
        do{
            numero = r.nextInt(200);
            number = "" + numero;
        }while(number.length() > 4 || numeros.contains(numero));
        numeros.add(numero);
        arreglo[i] = numero; 
      }
   int temp = 0;
      for (int i = 0; i < arreglo.length - 1; i++) {
          
        for (int j = 0; j < arreglo.length - 1; j++) {
               
                 if(arreglo[j] > arreglo[j+1]){
                    temp = arreglo[j];
                    arreglo[j] =arreglo[j +1];
                    arreglo[j +1] = temp;
                 }
                 
            }
        }


      for(int i = 0; i < arreglo.length;i++){
         System.out.println(i + " = " + arreglo[i]);
      }
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese el numero a buscar");
        int buscar = entrada.nextInt();
        boolean bandera = true;
  int incre = 0;
        //busqueda binaria
        while(inicio <= fin){
           medio = (inicio + fin) / 2;
           if(arreglo[medio] == buscar){
            System.out.println("la posicion del elmento es " + medio);
            bandera = false;
            break;
           }else if(arreglo[medio] < buscar){
                inicio = (medio +1);
           }else{
            fin = medio - 1;
           }
           incre++;
        }

        if(bandera){
            System.out.println("posicion no encontrada");
        }
    }
}
