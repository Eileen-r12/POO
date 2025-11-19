public class BotonAfuera extends Boton{
        private boolean direccion;
        private int pisoLlamada;
        private boolean iluminado;
        private boolean subir;

        public BotonAfuera(boolean direccion, int pisoLlamada, boolean iluminado, String tipo, boolean subir) {
            super(iluminado,tipo, pisoLlamada);
            this.direccion = direccion;
            this.subir = true;
            this.pisoLlamada = pisoLlamada;
        }
        

        @Override
        public void iluminar() {
            iluminado = true;
            System.out.println("Botón de llamada presionado en piso " + pisoLlamada);
        }
        @Override
        public void apagar() {
            iluminado = false;
            System.out.println("Botón de llamada apagado en piso " + pisoLlamada);
        }
        
    }


