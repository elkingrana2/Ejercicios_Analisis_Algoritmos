package src;

class MatrizMagica {
  public static void main(String[] args) {
    int[][] matriz = {
        { 2, 9, 4 },
        { 7, 5, 3 },
        { 6, 1, 8 }
    };
    // matriz 3x3
    int[][] matriz2 = {
        { 2, 7, 6 },
        { 9, 5, 1 },
        { 4, 3, 8 }
    };

    // matriz 4x4
    int[][] matriz3 = {
        { 16, 3, 2, 13 },
        { 5, 10, 11, 8 },
        { 9, 6, 7, 12 },
        { 4, 15, 14, 1 }
    };

    // matriz 5x5
    int[][] matriz5 = {
        { 11, 24, 7, 20, 3 },
        { 4, 12, 25, 8, 16 },
        { 17, 5, 13, 21, 9 },
        { 10, 18, 1, 14, 22 },
        { 23, 6, 19, 2, 15 }
    };

    if (esMatrizMagica(matriz5)) {
      System.out.println("La matriz es mágica.");
    } else {
      System.out.println("La matriz no es mágica.");
    }
  }

  public static boolean esMatrizMagica(int[][] matriz) {
    int n = matriz.length;
    int diagonal1 = 0;
    int diagonal2 = 0;

    for (int i = 0; i < n; i++) {
      diagonal1 += matriz[i][i];
      diagonal2 += matriz[i][n - 1 - i];
    }

    for (int i = 0; i < n; i++) {
      int filaSuma = 0;
      int columnaSuma = 0;

      for (int j = 0; j < n; j++) {
        filaSuma += matriz[i][j];
        columnaSuma += matriz[j][i];
      }

      if (filaSuma != diagonal1 || columnaSuma != diagonal1) {
        return false;
      }
    }

    return diagonal1 == diagonal2;
  }
}
