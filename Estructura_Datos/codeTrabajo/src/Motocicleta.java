import java.util.Objects;

public class Motocicleta {
    private String marca;
    private String potenciaHp;

    public Motocicleta(String m,String p){
        this.marca = m;
        this.potenciaHp = p;

    }
    @Override
    public String toString(){
        return marca+potenciaHp;
    }

    
    @Override
    public boolean equals(Object o){
       Motocicleta a = (Motocicleta)o;
       return Objects.equals(a.toString(), toString());
    }

    public String info(){
        return "marca " + marca + "potencia caballo de fuerza: " + potenciaHp;
     }

}
