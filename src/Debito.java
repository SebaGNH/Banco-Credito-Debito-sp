public abstract class Debito extends Tarjeta {
    
    public Debito(int numeroDeTarjeta, float saldo, String titular){
        super(numeroDeTarjeta,saldo,titular);
    }
    
       
    @Override
    public String toString(){
        return super.toString();
    }
    
    //+Depositar(float importe): móntodo que representa un depósito en el banco a la cuenta del titular 
    public  float deposito(float importe){
    
    return super.getSaldo() + importe;
    }
    
    
    
    
    //+Extraer(float importe): móntodo que representa una extracción de dinero. 
    //  Validar que la tarjeta tenga saldo suficiente para realizar la extracción.
    
    public float extraccion(float importe){
        float saldo = super.getSaldo();
        
        if(saldo >= importe){
            saldo -= importe;
        }
        super.setSaldo(saldo);
        
        return saldo ;
    }
}
