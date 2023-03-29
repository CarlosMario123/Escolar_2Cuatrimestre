import java.util.ArrayList;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Automovil> autos = new ArrayList<>();
        ArrayList<Motocicleta> motos = new ArrayList<>();
        ArrayList<Camioneta> camiones = new ArrayList<>();
         int opcion1 = 0;
         int opcion2 = 0;
        do{
           opcion1 = Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese opcion 1)agregar\n2mostrar\n3)salir"));

           switch(opcion1){
            case 1:
            opcion2 = Integer.parseInt(JOptionPane.showInputDialog(null,"agregar1)Carro\n2)moto\n3)camioneta"));
              switch(opcion2){
                case 1:
                String marca = JOptionPane.showInputDialog(null, "ingrese la marca");
                 String numero = JOptionPane.showInputDialog(null, "ingrese las velocidades");
                 String modelo = JOptionPane.showInputDialog(null, "ingrese el modelo");
                 Automovil auto = new Automovil(marca, modelo,numero);
                if(!autos.contains(auto)){
                    JOptionPane.showMessageDialog(null,"auto agregadado exitosamente");
                    autos.add(auto);
                }else{
                    JOptionPane.showMessageDialog(null,"auto ya existente");
                }
                break;
                case 2:
                String marcaM = JOptionPane.showInputDialog(null, "ingrese la marca");
                 String potencia = JOptionPane.showInputDialog(null, "ingrese las potencia hp");
                 Motocicleta moto = new Motocicleta(marcaM, potencia);
                if(!motos.contains(moto)){
                    JOptionPane.showMessageDialog(null,"moto agregadado exitosamente");
                    motos.add(moto);
                }else{
                    JOptionPane.showMessageDialog(null,"moto ya existente");
                }
                break;
                case 3:
                String marcaC = JOptionPane.showInputDialog(null, "ingrese la marca");
                String combustible = JOptionPane.showInputDialog(null, "ingrese el combustible");
                String numeroC= JOptionPane.showInputDialog(null, "ingrese el numero cabina");
                 Camioneta camioneta = new Camioneta(marcaC, numeroC, combustible);
               if(!camiones.contains(camioneta)){
                   JOptionPane.showMessageDialog(null,"camioneta agregadado exitosamente");
                   camiones.add(camioneta);
               }else{
                   JOptionPane.showMessageDialog(null,"camioneta ya existente");
               }
                break;
                default:
                JOptionPane.showMessageDialog(null,"no seleciono opcion");
              }
             break;
             case 2:
                System.out.println("autos");
                  for(Automovil auto: autos){
                     System.out.println(auto.info());
                  }


                  System.out.println("motos");
                  for(Motocicleta moto: motos){
                     System.out.println(moto.info());
                  }

                  System.out.println("Camioneta");
                  for(Camioneta camion: camiones){
                     System.out.println(camion.info());
                  }
             break;
             case 3:
             JOptionPane.showMessageDialog(null,"vuelva pronto");
             break;
        }
           }while(opcion1 != 3);
        
    }
}
