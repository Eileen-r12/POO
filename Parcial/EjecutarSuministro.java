import java.util.Random;

public class EjecutarSuministro {

    public static void main(String[] args) {
        Random r = new Random();
        int[] energiaContenedores = new int[12];
        int[][] mapaCarga = new int[3][3];

        int min = 50;
        int max = 150;

        // 1. Generar 12 valores aleatorios de energía
        System.out.print("EnergiaContenedores {");
        for (int i = 0; i < energiaContenedores.length; i++) {
            energiaContenedores[i] = r.nextInt(max - min + 1) + min;
            System.out.print(energiaContenedores[i] + ", ");
        }
        System.out.println("}");

        // 2. Filtrar los múltiplos de 10 y guardarlos en segundoA
        int[] segundoA = new int[12];
        int contador = 0;
        for (int i = 0; i < energiaContenedores.length; i++) {
            if (energiaContenedores[i] % 10 == 0) {
                segundoA[contador] = energiaContenedores[i];
                contador++;
            }
        }

        System.out.println("\nSegundo arreglo con los multiplos de 10 ");
        if (contador == 0) {
            System.out.println("No hay multiplos de 10");
        } else {
            for (int i = 0; i < contador; i++) {
                System.out.print(segundoA[i] + ", ");
            }
        }

        // 3. Llenar la matriz 3x3 con los múltiplos de 10 (o -1 si no hay suficientes)
        System.out.println("\n\nMatriz");
        int posicion = 0;
        for (int i = 0; i < mapaCarga.length; i++) {
            for (int j = 0; j < mapaCarga[i].length; j++) {
                if (posicion < contador) {
                    mapaCarga[i][j] = segundoA[posicion];
                    posicion++;
                } else {
                    mapaCarga[i][j] = -1;
                }
            }
        }

        // Mostrar la matriz
        for (int i = 0; i < mapaCarga.length; i++) {
            for (int j = 0; j < mapaCarga[i].length; j++) {
                System.out.print(mapaCarga[i][j] + "\t");
            }
            System.out.println();
        }

        // 4. Crear el manifiesto de suministros (siempre 9 elementos, uno por celda)
        Suministro[] manifiesto = new Suministro[9];
        int posicion2 = 0;

        for (int i = 0; i < mapaCarga.length; i++) {
            for (int j = 0; j < mapaCarga[i].length; j++) {
                int energia = mapaCarga[i][j];

                if (energia != -1) {
                    // Determinar prioridad según la energía (usando operador ternario)
                    String prioridad = (energia > 100) ? "ALTA" : "ESTANDAR";
                    // Generar un identificador con la posición en la matriz
                    String id = "Posición= fila:" + i + " columna:" + j;
                    // Crear el objeto Suministro (constructor corregido)
                    manifiesto[posicion2] = new Suministro(id, energia, prioridad);
                } else {
                    manifiesto[posicion2] = null; // Celda vacía
                }
                posicion2++;
            }
        }

        // 5. Mostrar el manifiesto completo
        System.out.println("\nLista:");
        for (int i = 0; i < manifiesto.length; i++) {
            if (manifiesto[i] != null) {
                System.out.println("ID: " + manifiesto[i].getId() +
                                   "\t Energia: " + manifiesto[i].getNivelEnergia() +
                                   "\t Prioridad: " + manifiesto[i].getPrioridad());
            } else {
                System.out.println("Null");
            }
        }
    }
}