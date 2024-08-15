
public class repositorio {

    public static void main(String[] args) {
        int[][] matriz = llenarMatriz(5); // Llena la matriz cuadrada de 5x5 con números aleatorios
        mostrarMatriz(matriz); // Muestra la matriz en la consola
        punto2(matriz); // Muestra el número máximo y sus coordenadas
    }

    public static int[][] llenarMatriz(int tamaño) {
        int[][] matriz = new int[tamaño][tamaño]; // Inicializa la matriz con el tamaño dado
        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                matriz[i][j] = (int)(Math.random() * 100 + 1); // Rango de 1 a 100
            }
        }
        return matriz;
    }

    public static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void punto2(int[][] matriz) {
        int max = matriz[0][0];
        int maxFila = 0;
        int maxColumna = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > max) {
                    max = matriz[i][j];
                    maxFila = i;
                    maxColumna = j;
                }
            }
        }

        System.out.println("El número más grande es: " + max);
        System.out.println("Se encuentra en la fila: " + maxFila + ", columna: " + maxColumna);
    }
}
