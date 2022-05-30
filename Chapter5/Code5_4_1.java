package Chapter5;
import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    long yojishou = 0;
    for (int a = 1; a <= N; a++) {
      int l = Math.max(1, a - (K - 1)); // b, c の探索範囲の下限 l
      int r = Math.min(N, a + (K - 1)); // b, c の探索範囲の上限 r
      for (int b = l; b <= r; b++) {
        for (int c = l; c <= r; c++) {
          if (Math.abs(b - c) <= K - 1) {
            yojishou += 1;
          }
        }
      }
    }
    long answer = (long)N * N * N - yojishou;
    System.out.println(answer);
  }
}
