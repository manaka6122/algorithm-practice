package Chapter3;
import java.util.*;

class Code3_2_2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long A = sc.nextLong();
    long B = sc.nextLong();
    System.out.println(GCD(A, B));
  }
  static long GCD(long A, long B) {
    // 正の整数 A と B の最大公約数を返す関数
		// GCD は Greatest Common Divisor（最大公約数）の略
    while (A >= 1 && B >= 1) {
      if (A < B) {
        B %= A;  // A < Bの場合、大きい方Bを置き換える
      } else {
        A %= B;  // A >= Bの場合、大きい方Aを置き換える
      }
    }
    if (A >= 1) {
      return A;
    }
    return B;
  }
}
