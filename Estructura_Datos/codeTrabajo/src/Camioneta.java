import java.util.Objects;

public class Camioneta{
  private String marca;
  private String numeroCabina;
  private String combustible;

  public Camioneta(String m,String n,String c){
    this.marca = m;
    this.numeroCabina = n;
    this.combustible = c;
  }

  @Override
  public String toString(){
      return marca+numeroCabina+combustible;
  }

  public String info(){
     return "marca " + marca + "numero Cabina: " + numeroCabina +"combustible: " + combustible;
  }

  
  @Override
  public boolean equals(Object o){
     Camioneta a = (Camioneta)o;
     return Objects.equals(a.toString(), toString());
  }

}