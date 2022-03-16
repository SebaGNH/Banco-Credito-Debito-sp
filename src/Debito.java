public abstract class Debito extends Tarjeta {
    
    public Debito(int numeroDeTarjeta, float saldo, String titular){
        super(numeroDeTarjeta,saldo,titular);
    }
    
       
    @Override
    public String toString(){
        return super.toString();
    }
    
    //+Depositar(float importe): móntodo que representa un depósito en el banco a la cuenta del titular 
    @Override
    public  String deposito(float importe){
        float saldo = super.getSaldo();
        saldo += importe;
    
    return "El deposito se realizo correctamente, su saldo actual es de : "+ saldo;
    
    }
    
    
    
    
    //+Extraer(float importe): móntodo que representa una extracción de dinero. 
    //  Validar que la tarjeta tenga saldo suficiente para realizar la extracción.
    @Override
    public String extraccion(float importe){
        float saldo = super.getSaldo();
        
        if(saldo >= importe){
            saldo -= importe;
            super.setSaldo(saldo);
            return "Extraccion completa, su saldo actual es de: "+ saldo;            
        } 
        return "Monto insuficiente, su saldo es de: "+ saldo ;
    }
}
