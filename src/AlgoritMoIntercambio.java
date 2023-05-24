package src;

public class AlgoritMoIntercambio {

  public static void main(String[] args) {

    int[] n = { 8, 4, 6, 2 };

    // algoritmoOrdenamiento(n);
    algoritmoOrdenamientoRecursivo(n, 0, 0);
    // n sera igual a { 2, 4, 6, 8 }

    for (int i = 0; i < n.length; i++) {
      System.out.println(n[i]);
    }

  }

  public static void algoritmoOrdenamiento(int[] n) {

    for (int i = 0; i < n.length - 1; i++) {
      for (int j = i + 1; j < n.length; j++) {

        if (n[i] > n[j]) {
          int aux = n[i];
          n[i] = n[j];
          n[j] = aux;
        }
      }
    }

  }

  // algoritmo intercambio recursivo

  public static void algoritmoOrdenamientoRecursivo(int[] n, int i, int j) {

    if (i < n.length - 1) {
      if (j < n.length) {
        if (n[i] > n[j]) {
          int aux = n[i];
          n[i] = n[j];
          n[j] = aux;
        }
        algoritmoOrdenamientoRecursivo(n, i, j + 1);
      }
      algoritmoOrdenamientoRecursivo(n, i + 1, 0);
    }

  }
}
