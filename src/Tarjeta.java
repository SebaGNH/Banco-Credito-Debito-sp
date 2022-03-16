public abstract class Tarjeta {
    private int numeroTarjeta;
    private float saldo;
    private String titular;

    public int getNumeroDeTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroDeTarjeta(int numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
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

    public Tarjeta(int numeroTarjeta, float saldo, String titular) {
        this.numeroTarjeta = numeroTarjeta;
        this.saldo = saldo;
        this.titular = titular;
    }

    @Override
    public String toString() {
        return "Nuero de tarjeta: " + numeroTarjeta + ", Saldo: " + saldo + ", Titular: " + titular;
    }
    
     
    public abstract String extraccion(float importe);
    
    public abstract String deposito(float importe);
        
    
}
