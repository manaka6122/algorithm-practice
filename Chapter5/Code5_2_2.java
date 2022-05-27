package Chapter5;
import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long N = sc.nextLong();
    if (N % 4 == 0) {
      System.out.println("Second");
    } else {
      System.out.println("First");
    }
  }
}
