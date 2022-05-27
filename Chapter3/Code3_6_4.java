// 佐伯関数によるユーグリッド除去法（最大公約数)
package Chapter3;
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
