public class Alumno {
    private String nombre;
    private String apellido;
    private String carrera;
  
    private String cuatrimestre;
    public Alumno(String nombre, String apellido, String cuatrimestre,String carrera) {
        this.nombre = nombre;
        this.apellido = apellido;
      this.carrera = carrera;
        this.cuatrimestre = cuatrimestre;
    }


    public String mostrarInformacion(){
       return "nombre: " + nombre + " " + apellido +" carrera: " + carrera +" cuatrimestre: " + cuatrimestre;
    }
   
}
