public class CuentaBancaria {
    private String titular;
    private String numeroCuenta;
    private double saldo;

    public CuentaBancaria() {
        this.titular = "Sin titular";
        this.numeroCuenta = "111111";
        this.saldo = 0.0;
    }

    public CuentaBancaria(String titular, String numeroCuenta) {
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
        this.saldo = 0.0;
    }

    public String getTitular() {
        return titular;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void depositar(double monto) {
        if (monto > 0) {
            saldo = saldo + monto;
            System.out.println("Depositado: $" + monto);
        } else {
            System.out.println("No puedes depositar montos negativos");
        }
    }

    public void retirar(double monto) {
        if (monto > 0) {
            if (monto <= saldo) {
                saldo = saldo - monto;
                System.out.println("Retirado: $" + monto);
            } else {
                System.out.println("No tienes suficiente saldo");
            }
        } else {
            System.out.println("No puedes retirar montos negativos");
        }
    }

    public String toString() {
        return "Cuenta Bancaria - Titular: " + titular + 
               ", Numero: " + numeroCuenta + 
               ", Saldo: $" + saldo;
    }

    public static void main(String[] args) {
        System.out.println("=== PROBANDO CUENTA BANCARIA ===");
        
    
        CuentaBancaria cuenta1 = new CuentaBancaria();
        System.out.println("Cuenta 1: " + cuenta1.toString());
        
        CuentaBancaria cuenta2 = new CuentaBancaria("Laura Calderon", "123456");
        System.out.println("Cuenta 2: " + cuenta2.toString());
        
        cuenta2.depositar(1000.0);
        System.out.println("Después de depositar: " + cuenta2.toString());
        
        cuenta2.retirar(300.0);
        System.out.println("Después de retirar: " + cuenta2.toString());
        
        cuenta2.retirar(800.0);
        System.out.println("Después de intentar retirar mucho: " + cuenta2.toString());
        
        cuenta2.depositar(-100.0);
    }
}

