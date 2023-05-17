package src;

//import java.util.ArrayList;
import java.util.List;

public class Ordenamiento_Insercion {

  public static void main(String[] args) {

    int[] n = { 5, 4, 3, 2, 1 };

    System.out.println("Arreglo original: ");
    for (int i = 0; i < n.length; i++) {
      System.out.print(n[i] + " ");
    }

    System.out.println();

    System.out.println("ordenamiento por insercion");
    ordenamientoInsercion(n);

    System.out.println("\nArreglo ordenado: ");
    for (int i = 0; i < n.length; i++) {
      System.out.print(n[i] + " ");
    }

    System.out.println();
    int[] n2 = { 5, 4, 3, 2, 1 };
    System.out.println("ordenaminto por insercion con recursividad: ");
    ordenamientoInsercionRecursivo(n2, 1);

    System.out.println("\nArreglo ordenado: ");
    for (int i = 0; i < n2.length; i++) {
      System.out.print(n2[i] + " ");
    }

  }

  // algoritmo de ordenamiento por insercion
  public static void ordenamientoInsercion(int[] arreglo) {
    for (int i = 1; i < arreglo.length; i++) {
      int aux = arreglo[i];
      int j;
      for (j = i - 1; j >= 0 && arreglo[j] > aux; j--) {
        arreglo[j + 1] = arreglo[j];
      }
      arreglo[j + 1] = aux;
    }
  }

  // algoritmo de ordenamiento por insercion con recursividad
  public static void ordenamientoInsercionRecursivo(int[] arreglo, int indice) {
    if (indice == arreglo.length) {
      return;
    }
    int aux = arreglo[indice];
    int j;
    for (j = indice - 1; j >= 0 && arreglo[j] > aux; j--) {
      arreglo[j + 1] = arreglo[j];
    }
    arreglo[j + 1] = aux;
    ordenamientoInsercionRecursivo(arreglo, indice + 1);
  }

  // algoritmo de ordenamiento por insercion con listas

  // public static void ordenamientoInsercionLista() {

  //   List<Integer> lista = new ArrayList<>();

  // }

}
