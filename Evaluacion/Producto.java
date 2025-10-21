     public class Producto {

    private String codigo;
    private String descripcion;
    private int cantidad;
    private double precioUnitario;

    public Producto() {
        this.codigo = "Sin codigo";
        this.descripcion = "Sin descripcion";
        this.cantidad = 1;
        this.precioUnitario = 0.0;
    }

    public Producto(String codigo, String descripcion, int cantidad, double precioUnitario) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        
        if (cantidad >= 1) {
            this.cantidad = cantidad;
        } else {
            this.cantidad = 1;
        }
        
        if (precioUnitario >= 0) {
            this.precioUnitario = precioUnitario;
        } else {
            this.precioUnitario = 0.0;
        }
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        if (cantidad >= 1) {
            this.cantidad = cantidad;
        }
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        if (precioUnitario >= 0) {
            this.precioUnitario = precioUnitario;
        }
    }

    public double calcularSubtotal() {
        return cantidad * precioUnitario;
    }

    public void aplicarDescuento(double porcentaje) {
        if (porcentaje > 0 && porcentaje <= 50) {
            double descuento = precioUnitario * (porcentaje / 100);
            precioUnitario = precioUnitario - descuento;
            System.out.println("Descuento aplicado: " + porcentaje + "%");
        } else {
            System.out.println("El descuento debe estar entre 1% y 50%");
        }
    }

    public void incrementarCantidad(int valor) {
        if (valor > 0) {
            cantidad = cantidad + valor;
            System.out.println("Cantidad incrementada en: " + valor);
        } else {
            System.out.println("El valor debe ser mayor a 0");
        }
    }

    public String toString() {
        return "Producto - Codigo: " + codigo + 
               ", Descripcion: " + descripcion + 
               ", Cantidad: " + cantidad + 
               ", Precio: $" + precioUnitario +
               ", Subtotal: $" + calcularSubtotal();
    }

    public static void main(String[] args) {
        System.out.println("=== PROBANDO CLASE PRODUCTO ===");
        
        Producto producto1 = new Producto();
        System.out.println("Producto 1: " + producto1.toString());
        
        Producto producto2 = new Producto("P001", "Lapiz", 5, 2.5);
        System.out.println("Producto 2: " + producto2.toString());
        
        System.out.println("Subtotal: $" + producto2.calcularSubtotal());
        
        producto2.aplicarDescuento(10);  
        System.out.println("Después del descuento: " + producto2.toString());
        
        producto2.incrementarCantidad(3);
        System.out.println("Después de incrementar: " + producto2.toString());
        
        producto2.aplicarDescuento(60);  
        producto2.aplicarDescuento(-5);  
        
        producto2.incrementarCantidad(-2);
    }
}