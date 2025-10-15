public class OperacionesMatematicas {
    //Atributos de la clase OperacionesMatematicas
	private int a; 
	private int b;


	//constructor: permite inicializar la clase 
	public OperacionesMatematicas(int a, int b){
	     this.a = a;
	     this.b = b;
	}

	//metodos
	public int sumar(){
		return a + b;
	}
		
	public int restar(){
		return a - b;
	}

	public int multiplicar(){
		return a * b;
	}

	public double dividir() {
		double resultado;
		if (b == 0) {
			resultado = 0.0;
		} else {
			resultado = (double) a / b;
		}
		return resultado;
	}

}


	// Add your methods and fields here
