package src;
public class Ejercicio4 {

  public static void main(String[] args) {
    int n = 10;

    // System.out.println("El resultado de la potencia " + n + " es:" +
    // potencia_2(n));
    System.out.println("El resultado de la recursiva " + n + " es:" + recursiva2(n));
  }

  public static int potencia_2(int exponente) {

    if (exponente == 0) {
      return 1;
    } else {
      return 2 * potencia_2(exponente - 1);
    }
  }

  public static int recursiva2(int n) {
    if (n <= 1)
      return 1;
    else
      return (2 * recursiva2(n / 2));
  }

}
