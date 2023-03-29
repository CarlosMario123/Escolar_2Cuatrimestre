public class Persona {
    private String nombre;
    private int edad;
    private String paisOrigen;
    private String id;
    public Persona(String nombre, int edad, String paisOrigen, String id) {
        this.nombre = nombre;
        this.edad = edad;
        this.paisOrigen = paisOrigen;
        this.id = id;
    }

    public String getID(){
        return id;
    }

}
