import java.util.ArrayList;
import java.util.Random;

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
     
 
      //imprimir desordenado
      for(int i = 0;i < arreglo.length;i++){
         System.out.println("posicion(" + (i) + ") =  "+  arreglo[i]);
      }
      int temp = 0;
      //ordenamiento burbuja
        for (int i = 0; i < arreglo.length - 1; i++) {
          
            for (int j = 0; j < arreglo.length - 1; j++) {
                   
                     if(arreglo[j] > arreglo[j+1]){
                        temp = arreglo[j];
                        arreglo[j] =arreglo[j +1];
                        arreglo[j +1] = temp;
                     }
                     
                }
            }


          //imprimir ordenado
          System.out.println("imprimir ordenado");
      for(int i = 0;i < arreglo.length;i++){
        System.out.println("posicion( "+  (i) + ") = "+  arreglo[i]);
     }   
    }
}
