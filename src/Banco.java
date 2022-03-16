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
    
    //Depositar y extraer importes en base a número y tipo de tarjeta
    // si es  0 tarjeta Crédito, 1 Débito
    public String depositar(int tipo, int numeroTarjeta, float importe){
        String mensaje =  "";
        if(tipo ==0){
            for (Tarjeta t : tarjetas) {
                if(t instanceof Credito && t.getNumeroDeTarjeta() == numeroTarjeta ){
                    mensaje = t.deposito(importe);
                }
            }
        }else if(tipo == 1){
            for (Tarjeta t : tarjetas) {
                if(t instanceof Debito && t.getNumeroDeTarjeta() == numeroTarjeta){
                    mensaje = t.deposito(importe);
                }
            }
        }
        return mensaje;
    }
    
    
    public String extraer(int tipo, int numero, float importe){
        String mensaje = "";
        if(tipo == 0){
            for (Tarjeta t : tarjetas) {
                if(t instanceof Credito && t.getNumeroDeTarjeta() == numero){
                    t.extraccion(importe);
                }
            }
        }else if(tipo==1){
            for (Tarjeta t : tarjetas) {
                if(t instanceof Debito && t.getNumeroDeTarjeta() == numero){
                    t.extraccion(importe);
                }
            }
        }  
        return mensaje;
    }
    
    
    //Mostrar el saldo total de las tarjetas de débito
    public float getSaldoTotal(){
        float saldoAcumulador = 0;
        for (Tarjeta t : tarjetas) {
            if(t instanceof Debito){
                saldoAcumulador += t.getSaldo();
            }
        }
        return saldoAcumulador;
    }
    
     //Mostrar el promedio de saldo de las tarjetas de crédito
    public float getSaldoPromedioCredito(){
    float saldoAcumulador = 0;
    int contador = 0;
        for (Tarjeta t : tarjetas) {
            if(t instanceof Credito){
                saldoAcumulador += t.getSaldo();
                contador ++;
            }
        }
        return saldoAcumulador / contador;   
    }
    
    
    
    
    
}
