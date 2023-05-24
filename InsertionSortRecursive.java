public class InsertionSortRecursive {
  public static void insertionSortRecursive(int[] arr, int n) {
      // Caso base
      if (n <= 1)
          return;

      // Ordenar los n-1 elementos
      insertionSortRecursive(arr, n - 1);

      // Insertar el último elemento en la posición correcta
      int last = arr[n - 1];
      int j = n - 2;

      while (j >= 0 && arr[j] > last) {
          arr[j + 1] = arr[j];
          j--;
      }

      arr[j + 1] = last;
  }

  public static void main(String[] args) {
      int[] arr = {5, 2, 8, 12, 1, 6, 3, 7};
      insertionSortRecursive(arr, arr.length);
      System.out.println("Array ordenado:");
      for (int num : arr) {
          System.out.print(num + " ");
      }
  }
}
