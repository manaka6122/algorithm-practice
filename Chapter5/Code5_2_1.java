package Chapter5;
import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long N = sc.nextLong();
    if (N % 4 == 1) {
      System.out.println(2);
    }
    if (N % 4 == 2) {
      System.out.println(4);
    }
    if (N % 4 == 3) {
      System.out.println(8);
    }
    if (N % 4 == 0) {
      System.out.println(6);
    }
  }
}
