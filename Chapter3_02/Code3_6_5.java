package Chapter3_02;
import java.util.*;

class Code3_6_5 {
  private static final int[] A = null;
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] A = new int[N + 1];
    for (int i = 1; i <= N; i++) {
      A[i] = sc.nextInt();
    }
    int answer = solve(1, N + 1);
    System.out.println(answer);
  }
  static int solve(int l, int r) {
    if (r - 1 == 1) {
      return A[l];
    }
    int m = (l + r) / 2;
    int s1 = solve(l, m);
    int s2 = solve(m, r);
    return s1 + s2;
  }
}
