public class BubbleSortRecursive {
  public static void bubbleSortRecursive(int[] arr, int n) {
    // Caso base
    if (n == 1)
      return;

    // Realizar un pase del algoritmo de bubble sort
    for (int i = 0; i < n - 1; i++) {
      if (arr[i] > arr[i + 1]) {
        // Intercambiar arr[i] y arr[i + 1]
        int temp = arr[i];
        arr[i] = arr[i + 1];
        arr[i + 1] = temp;
      }
    }

    // Llamada recursiva para ordenar los elementos restantes
    bubbleSortRecursive(arr, n - 1);
  }

  public static void main(String[] args) {
    int[] arr = { 5, 2, 8, 12, 1, 6, 3, 7 };
    bubbleSortRecursive(arr, arr.length);
    System.out.println("Array ordenado:");
    for (int num : arr) {
      System.out.print(num + " ");
    }
  }
}
