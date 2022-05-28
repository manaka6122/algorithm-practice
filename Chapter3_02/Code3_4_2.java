package Chapter3_02;
import java.util.*;

class Code3_4_2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] P = new int[N + 1];
    int[] Q = new int[N + 1];
    for (int i = 1; i <= N; i++) {
      P[i] = sc.nextInt();
      Q[i] = sc.nextInt();
    }
    double answer = 0.0;
    for (int i = 1; i <= N; i++) {
      answer += (double)Q[i] / P[i];
    }
    System.out.format("%.12f\n", answer);
  }
}
