package src;
public class Ejercicio7 {

  /*
   * 2.
   */
  public Ejercicio7() {
    Ejercicio7 test = new Ejercicio7();
  }

  public static void main(String[] args) {
    xMethod(1234567);

    Ejercicio7 test = new Ejercicio7();
    System.out.println(test.toString());
  }

  /*
   * 1. la condicion debe ser n>1 
   */
  public static void xMethod(double n) {
    if (n >1) {
      System.out.println(n);
      xMethod(n / 10);
    }
  }

}
