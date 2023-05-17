package src;

public class Ordenamiento_MergeSort {

  public static void main(String[] args) {

    int[] n = { 5, 4, 3, 2, 1 };
    System.out.println("Arreglo original: ");
    for (int i = 0; i < n.length; i++) {
      System.out.print(n[i] + " ");
    }
    System.out.println();
    System.out.println("ordenamiento por merge sort");
    mergeSort(n, 0, n.length - 1);
    System.out.println("\nArreglo ordenado: ");
    for (int i = 0; i < n.length; i++) {
      System.out.print(n[i] + " ");
    }

  }

  // algoritmo de ordenamiento por merge sort

  public static void mergeSort(int[] arreglo, int inicio, int fin) {
    if (inicio < fin) {
      int medio = (inicio + fin) / 2;
      mergeSort(arreglo, inicio, medio);
      mergeSort(arreglo, medio + 1, fin);
      merge(arreglo, inicio, medio, fin);
    }
  }

  public static void merge(int[] arreglo, int inicio, int medio, int fin) {
    int n1 = medio - inicio + 1;
    int n2 = fin - medio;

    int[] arregloIzq = new int[n1];
    int[] arregloDer = new int[n2];

    for (int i = 0; i < n1; i++) {
      arregloIzq[i] = arreglo[inicio + i];
    }

    for (int j = 0; j < n2; j++) {
      arregloDer[j] = arreglo[medio + 1 + j];
    }

    int i = 0;
    int j = 0;
    int k = inicio;

    while (i < n1 && j < n2) {
      if (arregloIzq[i] <= arregloDer[j]) {
        arreglo[k] = arregloIzq[i];
        i++;
      } else {
        arreglo[k] = arregloDer[j];
        j++;
      }
      k++;
    }

    while (i < n1) {
      arreglo[k] = arregloIzq[i];
      i++;
      k++;
    }

    while (j < n2) {
      arreglo[k] = arregloDer[j];
      j++;
      k++;
    }
  }

}
