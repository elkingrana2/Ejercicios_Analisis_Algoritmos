package src;

public class Ordenamiento_Seleccion {

  public static void main(String[] args) {

    int[] n = { 5, 4, 3, 2, 1 };
    System.out.println("Arreglo original: ");
    for (int i = 0; i < n.length; i++) {
      System.out.print(n[i] + " ");
    }
    System.out.println();
    System.out.println("ordenamiento por seleccion");
    ordenamientoSeleccion(n);
    System.out.println("\nArreglo ordenado: ");
    for (int i = 0; i < n.length; i++) {
      System.out.print(n[i] + " ");
    }

    System.out.println();
    System.out.println("ordenaminto por seleccion con recursividad: ");
    ordenamientoSeleccionRecursivo(n, 0);
    System.out.println("\nArreglo ordenado: ");
    for (int i = 0; i < n.length; i++) {
      System.out.print(n[i] + " ");
    }
  }

  public static void ordenamientoSeleccion(int[] arreglo) {
    int indiceMenor;
    // System.out.println("indice menor"+indiceMenor);
    for (int i = 0; i < arreglo.length - 1; i++) {
      indiceMenor = i;
      for (int indiceActual = i + 1; indiceActual < arreglo.length; indiceActual++) {
        if (arreglo[indiceActual] < arreglo[indiceMenor]) {
          indiceMenor = indiceActual;
        }
      }
      intercambiar(arreglo, i, indiceMenor);
    }
  }

  public static void intercambiar(int[] arreglo, int primero, int segundo) {
    int temporal = arreglo[primero];
    arreglo[primero] = arreglo[segundo];
    arreglo[segundo] = temporal;
  }

  // ordenaminto por seleccion con recursividad
  public static void ordenamientoSeleccionRecursivo(int[] arreglo, int indice) {
    if (indice == arreglo.length - 1) {
      return;
    }
    int indiceMenor = indice;
    for (int indiceActual = indice + 1; indiceActual < arreglo.length; indiceActual++) {
      if (arreglo[indiceActual] < arreglo[indiceMenor]) {
        indiceMenor = indiceActual;
      }
    }
    intercambiar(arreglo, indice, indiceMenor);
    ordenamientoSeleccionRecursivo(arreglo, indice + 1);
  }
}
