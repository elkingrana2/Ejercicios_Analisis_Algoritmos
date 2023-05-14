package src;
public class Ejercicio6 {

  public static void main(String[] args) {
    xMethod(5);
  }

  /*
   * El metodo falla
   */
  public static void xMethod(int n) {
    if (n > 0)
      System.out.println(n + " ");
    xMethod(n - 1);
  }

  /*
   * El metodo imprime los numeros desde 0 hasta n
   * if n = 5
   * imprime:
   * 0
   * 1
   * 2
   * 3
   * 4
   * 5
   */
  public static void xMethod2(int n) {
    if (n > 0)
      xMethod2(n - 1);
    System.out.println(n + " ");
  }
}
