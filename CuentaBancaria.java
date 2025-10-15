public class CuentaBancaria {
    public static void main(String[] args) {}
    
    private String titular;
    private String numeroCuenta;
    private double saldo; 

    
    public CuentaBancaria() {
        this.titular = "Sin titular";
        this.numeroCuenta = "000000";
        this.saldo = 0.0;
    }

    
    public CuentaBancaria(String titular, String numeroCuenta, double saldo) {
        if (titular == null || titular.trim().isEmpty()) {
            System.out.println("Titular inválido. Se asigna valor por defecto.");
            this.titular = "Sin titular";
        } else {
            this.titular = titular.trim();
        }

        if (numeroCuenta == null || numeroCuenta.trim().length() < 6) {
            System.out.println("Número de cuenta inválido. Se asigna '000000'.");
            this.numeroCuenta = "000000";
        } else {
            this.numeroCuenta = numeroCuenta.trim();
        }

        if (saldo < 0) {
            System.out.println("Saldo inválido. Se asigna 0.0.");
            this.saldo = 0.0;
        } else {
            this.saldo = saldo;
        }
    }


    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        if (titular == null || titular.trim().isEmpty()) {
            System.out.println("No se puede asignar un titular vacío.");
            return;
        }
        this.titular = titular.trim();
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        if (numeroCuenta == null || numeroCuenta.trim().length() < 6) {
            System.out.println("Número de cuenta inválido. Debe tener al menos 6 caracteres.");
            return;
        }
        this.numeroCuenta = numeroCuenta.trim();
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo < 0) {
            System.out.println("Saldo inválido. No se puede asignar valor negativo.");
            return;
        }
        this.saldo = saldo;
    }

    
    public boolean depositar(double monto) {
        if (monto <= 0) {
            System.out.println("El monto a depositar debe ser mayor que 0.");
            return false;
        }
        this.saldo += monto;
        return true;
    }


    public boolean retirar(double monto) {
        if (monto <= 0) {
            System.out.println("El monto a retirar debe ser mayor que 0.");
            return false;
        }
        if (monto > this.saldo) {
            System.out.println("Saldo insuficiente.");
            return false;
        }
        this.saldo -= monto;
        return true;
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" +
                "titular='" + titular + '\'' +
                ", numeroCuenta='" + numeroCuenta + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}



   
        

   
            
            

