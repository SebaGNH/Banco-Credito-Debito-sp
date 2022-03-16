public class Credito extends Tarjeta{
    
    private float limite;
    
    public float getLimite(){
        return this.limite;
    }
    
    public void setLimite(int limite){
        this.limite = limite;
    }
    
    public Credito(int numeroDeTarjeta, int saldo, String titular, float limite){
    super(numeroDeTarjeta,saldo,titular);
    this.limite = limite;
    }
    
    @Override
    public String toString(){
        return super.toString() +", Limite: "+ this.limite;
    }
    
    //+Depositar(float importe): método que representa el pago de la tarjeta, o sea que disminuye el saldo en base al importe por parametro.
    public float deposito(float importe){        
       return super.getSaldo() - importe;
    }
    
    //+Extraer(float importe): mòntodo que representa una compra con la tarjeta, validar con el lìmite para saber si puede realizar o no la compra.
    public float extraccion(float importe){ 
        float saldo = 0;
        
        if(limite >= importe){
            saldo = super.getSaldo() +importe;
            super.setSaldo(saldo);            
        }
        return saldo; 
    }
    
}
