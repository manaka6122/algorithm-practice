package Chapter3_02;
import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    long[] A = new long[N + 1];
    for (int i = 1; i <= N; i++) {
      A[i] = sc.nextLong();
    }
    long R = LCM(A[1], A[2]);
    for (int i = 3; i <= N; i++) {
      R = LCM(R, A[i]);
    }
    System.out.println(R);
  }
  static long GCD(long A, long B) {
		// 正の整数 A と B の最大公約数を返す関数
		while (A >= 1 && B >= 1) {
			if (A < B) {
				B %= A;
			}
			else {
				A %= B;
			}
		}
		if (A >= 1) {
			return A;
		}
		return B;
	}
  static long LCM(long A, long B) {
    return (A / GCD(A, B)) * B;
  }
}
