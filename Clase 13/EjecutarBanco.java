public class EjecutarBanco {
    public static void main(String[] args) {
        // Crear una cuenta y un banco
        Cuenta cuenta1 = new Cuenta(12345, 1000.0);
        Banco banco1 = new Banco("Banco Central", cuenta1);
        // Mostrar información del banco
        System.out.println(banco1);
        // Crear un cliente
        Cliente cliente1 = new Cliente(1001345678, "Juan Perez");
        // Crear el cliente en el banco y mostrar el resultado
        String msg = banco1.crearCliente(cliente1) ? "Cliente creado exitosamente" : "Error al crear el cliente";
        System.out.println(msg);
    }
}
   
    

