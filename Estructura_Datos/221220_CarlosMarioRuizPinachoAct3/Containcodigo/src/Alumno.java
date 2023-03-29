public class Alumno {
     private String nombre;
     private String apellido;
     private String matricula;

      public Alumno(String nombre,String apellido,String matricula){
        this.nombre = nombre;
      this.apellido = apellido;
     this.matricula = apellido;
      }
      public String curp(){
           return nombre+apellido+matricula;
      }
}
