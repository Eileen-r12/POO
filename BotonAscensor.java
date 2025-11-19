
public class BotonAscensor extends Boton {
        private int pisoDestino;
        

    public BotonAscensor(String tipo, int pisoDestino) {
    super(false, pisoDestino, tipo);
        this.pisoDestino = pisoDestino;

    }

    
    public int getPiso() {
        return pisoDestino;
    }

    public boolean estaEncendido() {
        return estailuminado();
    }

         
    @Override 
    public void iluminar() {
    iluminado = true;
    System.out.println("Botón de piso " + pisoDestino + " iluminado.");
    }
    @Override
    public void apagar() {
        super.apagar();
    System.out.println("Botón de piso " + pisoDestino + " apagado.");
            }
    }
