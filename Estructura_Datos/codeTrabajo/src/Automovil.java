import java.util.Objects;

public class Automovil{
    private String marca;
    private String modelo;
    private String velocidad;

    public Automovil(String m,String mo,String velocidad){
        this.marca = m;
        this.modelo = mo;
        this.velocidad = velocidad;
    }

    @Override
    public String toString(){
        return marca+modelo+velocidad;
    }

    
    @Override
    public boolean equals(Object o){
       Motocicleta a = (Motocicleta)o;
       return Objects.equals(a.toString(), toString());
    }

    public String info(){
        return "marca " + marca + "modelo: " + modelo +"numero velocidades: " + velocidad;
     }

}