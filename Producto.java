     public class Producto {

    private String codigo;
    private String descripcion;
    private int cantidad; 
    private double precioUnitario;


    public Producto() {
        this.codigo = "N/C";
        this.descripcion = "Sin descripcion";
        this.cantidad = 1;
        this.precioUnitario = 0.0;
    }

    
    public Producto(String codigo, String descripcion, int cantidad, double precioUnitario) {
        if (codigo == null || codigo.trim().isEmpty()) {
            System.out.println("Código inválido. Se asigna 'N/C'.");
            this.codigo = "N/C";
        } else {
            this.codigo = codigo.trim();
        }

        if (descripcion == null || descripcion.trim().isEmpty()) {
            this.descripcion = "Sin descripcion";
        } else {
            this.descripcion = descripcion.trim();
        }

        if (cantidad < 1) {
            System.out.println("Cantidad inválida. Se asigna 1.");
            this.cantidad = 1;
        } else {
            this.cantidad = cantidad;
        }

        if (precioUnitario < 0) {
            System.out.println("Precio inválido. Se asigna 0.0.");
            this.precioUnitario = 0.0;
        } else {
            this.precioUnitario = precioUnitario;
        }
        }
    
    public String getCodigo() { return codigo; }
    public void setCodigo(String codigo) {
        if (codigo == null || codigo.trim().isEmpty()) {
            System.out.println("Código inválido.");
            return;
        }
        this.codigo = codigo.trim();
    }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) {
        if (descripcion == null || descripcion.trim().isEmpty()) {
            System.out.println("Descripción inválida.");
            return;
        }
        this.descripcion = descripcion.trim();
    }

    public int getCantidad() { return cantidad; }
    public void setCantidad(int cantidad) {
        if (cantidad < 1) {
            System.out.println("La cantidad debe ser al menos 1.");
            return;
        }
        this.cantidad = cantidad;
    }

    public double getPrecioUnitario() { return precioUnitario; }
    public void setPrecioUnitario(double precioUnitario) {
        if (precioUnitario < 0) {
            System.out.println("Precio unitario inválido.");
            return;
        }
        this.precioUnitario = precioUnitario;
    }

    
    public double calcularSubtotal() {
        return this.cantidad * this.precioUnitario;
    }

    
    public boolean aplicarDescuento(double porcentaje) {
        if (porcentaje < 0 || porcentaje > 50) {
            System.out.println("Porcentaje inválido. Debe estar entre 0 y 50.");
            return false;
        }
        double descuento = (porcentaje / 100.0) * this.calcularSubtotal();
        double subtotal = this.calcularSubtotal();
        double nuevoTotal = subtotal - descuento;
        if (this.cantidad > 0) {
            this.precioUnitario = nuevoTotal / this.cantidad;
        }
        return true;
    }

    
    public boolean incrementarCantidad(int valor) {
        if (valor <= 0) {
            System.out.println("El valor a incrementar debe ser mayor que 0.");
            return false;
        }
        this.cantidad += valor;
        return true;
    }

    
    public double calcularTotalConImpuesto(double porcentajeDescuento) {
        double subtotal = this.calcularSubtotal();
        double descuento = 0.0;

        if (porcentajeDescuento >= 0 && porcentajeDescuento <= 50) {
            descuento = (porcentajeDescuento / 100.0) * subtotal;
        }

        double totalConDescuento = subtotal - descuento;
        double impuesto = totalConDescuento * 0.08; 
        return totalConDescuento + impuesto;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "codigo='" + codigo + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", cantidad=" + cantidad +
                ", precioUnitario=" + precioUnitario +
                '}';
    }
}


