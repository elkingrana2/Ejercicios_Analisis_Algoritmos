package src;
public class Ejercicio5 {

  public static void main(String[] args) {
    int n = 6;

    System.out.println("El resultado de la suma desde 1 hasta (n): " + n + " es:" + suma(n));
  }

  public static int suma(int n) {
    if (n == 1)
      return 1;
    else
      return n + suma(n - 1);
  }

}
