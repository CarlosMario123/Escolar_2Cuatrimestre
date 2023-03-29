import java.util.ArrayList;

public class BaseDatos {
    //aplicaremos algo parecido a singleton

    private static BaseDatos datos;
    private static ArrayList<Persona> personas;

     private BaseDatos(){
        this.personas = new ArrayList<>();
     }


     //permite iniciar la base datos
     public static void Iniciar(){
          if(datos == null){
              datos = new BaseDatos();
          }
     }

    public static void agregarPersonas(Persona p){
          personas.add(p);
    }

    //Eliminar Persona
    public static void deletePersona(String id){
           //este while nos permitira encontrar la persona a eliminar
           int i = 0;
           boolean bandera = true;
           
           while(i < personas.size() && bandera){
              if(personas.get(i).getID().equals(id)){
                 personas.remove(i);
                 System.out.println("persona eliminado correctamente");
                 bandera = false;
              }

           }
    }
}
