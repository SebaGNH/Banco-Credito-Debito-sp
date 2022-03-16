public abstract class Tarjeta {
    private int numeroDeTarjeta;
    private float saldo;
    private String titular;

    public int getNumeroDeTarjeta() {
        return numeroDeTarjeta;
    }

    public void setNumeroDeTarjeta(int numeroDeTarjeta) {
        this.numeroDeTarjeta = numeroDeTarjeta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public Tarjeta(int numeroDeTarjeta, float saldo, String titular) {
        this.numeroDeTarjeta = numeroDeTarjeta;
        this.saldo = saldo;
        this.titular = titular;
    }

    @Override
    public String toString() {
        return "Nuero de tarjeta: " + numeroDeTarjeta + ", Saldo: " + saldo + ", Titular: " + titular;
    }
    
     
    public abstract String extraccion(float importe);
    
    public abstract String deposito(float importe);
        
    
}
