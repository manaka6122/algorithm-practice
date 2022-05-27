package Chapter3;
import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();

    // 動的計画法
    int[] dp = new int[N + 1];
    for (int i = 0; i <= N; i++) {
      if (i <= 1) {
        dp[i] = 1;
      } else {
        dp[i] = dp[i - 1] + dp[i - 2];
      }
    }
    System.out.println(dp[N]);
  }
}
