import java.util.ArrayList;

public class Banco {
    
    ArrayList<Tarjeta> tarjetas;
    
    public Banco(){
        tarjetas = new ArrayList();
    }
    
    //Agregar una nueva tarjeta
    public void agregarTarjeta(Tarjeta t){
        tarjetas.add(t);
    }
    
    
  
    
    
}
