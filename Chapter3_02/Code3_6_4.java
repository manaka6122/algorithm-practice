package Chapter3_02;
import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long A = sc.nextLong();
    long B = sc.nextLong();
    System.out.println(GCD(A, B));
  }
  static long GCD(long A, long B) {
    if (B == 0) {
      return A;
    }
    return GCD(B, A % B);
  }
}
