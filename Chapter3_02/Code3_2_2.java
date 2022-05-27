package Chapter3_02;
import java.util.*;

class Code3_2_2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long A = sc.nextLong();
    long B = sc.nextLong();
    System.out.println(GCD(A, B));
  }
  static long GCD(long A, long B) {
    while (A >= 1 && B >= 1) {
      if (A < B) {
        B = B % A;
      } else {
        A = A % B;
      }
    }
    if (A >= 1) {
      return A;
    }
    return B;
  }
}
