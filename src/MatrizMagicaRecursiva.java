package src;

public class MatrizMagicaRecursiva {

  public static void main(String[] args) {
    int[][] matriz = {
        { 2, 9, 4 },
        { 7, 5, 3 },
        { 6, 1, 8 }
    };

    if (esMatrizMagica(matriz, 0, 0)) {
      System.out.println("La matriz es mágica.");
    } else {
      System.out.println("La matriz no es mágica.");
    }
  }

  public static boolean esMatrizMagica(int[][] matriz, int fila, int columna) {
    int n = matriz.length;

    if (fila >= n) {
      return true; // Caso base: se han verificado todas las filas sin encontrar inconsistencias
    }

    int sumaActual = sumarFila(matriz, fila);
    if (sumaActual != sumarColumna(matriz, columna) || sumaActual != sumarDiagonal(matriz)) {
      return false; // No cumple la propiedad de una matriz mágica, retornar falso
    }

    // Verificar siguiente columna o siguiente fila
    if (columna < n - 1) {
      return esMatrizMagica(matriz, fila, columna + 1);
    } else {
      return esMatrizMagica(matriz, fila + 1, 0);
    }
  }

  public static int sumarFila(int[][] matriz, int fila) {
    int suma = 0;
    for (int i = 0; i < matriz.length; i++) {
      suma += matriz[fila][i];
    }
    return suma;
  }

  public static int sumarColumna(int[][] matriz, int columna) {
    int suma = 0;
    for (int i = 0; i < matriz.length; i++) {
      suma += matriz[i][columna];
    }
    return suma;
  }

  public static int sumarDiagonal(int[][] matriz) {
    int suma = 0;
    for (int i = 0; i < matriz.length; i++) {
      suma += matriz[i][i];
    }
    return suma;
  }
}
