import java.util.ArrayList;
import java.util.HashSet;

public class App {
    public static void main(String[] args) throws Exception {
       
       
     /*
        for (int i = 1; i < nums.length; i++) {
            aux = nums[i];
            for (int j = i-1; j >=0 && nums[j]>aux; j--) {
                nums[j+1]=nums[j];
                nums[j]=aux;
            }
        }
        */
        //ordenamiento de insersecion
        long original[] =  generarNumeros();
        
        long[] nums = original;
        long aux = 0;
        int incio1 = (int) System.nanoTime();
        for(int i= 0; i < nums.length;i++){
            int pos = i;
             aux = nums[i];
             while(pos > 0 && nums[pos - 1] > nums[pos]){
                    nums[pos] = nums[pos - 1];
                    nums[pos -1] = aux;
                    pos--;
             }
             nums[pos] = aux;
        }
        int final1 = (int) System.nanoTime();

        long temp = 0;
        long arreglo[] = original;
        int incio2 = (int) System.nanoTime();
        for (int i = 0; i < arreglo.length - 1; i++) {
            
          for (int j = 0; j < arreglo.length - 1; j++) {
                 
                   if(arreglo[j] > arreglo[j+1]){
                      temp = arreglo[j];
                      arreglo[j] =arreglo[j +1];
                      arreglo[j +1] = temp;
                   }
                   
              }
          }
          int final2 = (int) System.nanoTime();

         int resultado1 = final1 - incio1;
          int resultado2 = final2 - incio2;
          System.out.println("ordenamiento insersecion " + resultado1);
          System.out.println("ordenamiento  burbuja" + resultado2);
        for(int i = 0 ; i < nums.length;i++){
            System.out.println("961" + nums[i]);
        }
    }

    public static long[] generarNumeros(){
        ArrayList<String> numeros = new ArrayList();
        String number = "";
        long numeros1[] = new long[10];
        long numero = 0;
        for(int i = 0; i < numeros1.length;i++){
            do{
                 numero = (long)(Math.random()*9999999+1); 
              number = "" + numero;
              }while(numeros.contains(number) && number.length() != 7);
              numeros.add(number);
              numeros1[i] = numero;
        }
   
        return numeros1;
    }
    
}
