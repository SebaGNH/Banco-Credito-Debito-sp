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
    @Override
    public String deposito(float importe){  
        float saldo = super.getSaldo();
        saldo -= importe;
        super.setSaldo(saldo);
       
       return "El pago se realizo con exito, su saldo es: "+ saldo;
    }
    
    //+Extraer(float importe): mòntodo que representa una compra con la tarjeta, validar con el lìmite para saber si puede realizar o no la compra.
    @Override
    public String extraccion(float importe){ 
        float saldo = super.getSaldo();
        
        if(this.limite >= importe){
            saldo +=importe;
            this.limite -= importe;
            super.setSaldo(saldo);

            return "Operacion realizada con exito, su limite es: "+ this.limite+", su saldo es: "+ saldo;
        }        
        return "Limite insuficiente, actualmente tu limite es: "+this.limite;        
    }
    
}
