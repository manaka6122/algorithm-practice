package Chapter3_02;
import java.util.*;

class Code3_3_1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] A = new int[N + 1];
    for (int i = 1; i <= N; i++) {
      A[i] = sc.nextInt();
    }
    int Answer = 0;
    for (int i = 1; i <= N; i++) {
      for (int j = i + 1; j <= N; j++) {
        for (int l = j + 1; l <= N; l++) {
          for (int k = l + 1; k <= N; k++) {
            for (int m = k + 1; m <= N; m++) {
              if (A[i] + A[j] + A[l] + A[k] + A[m] == 1000) {
                Answer++;
              }
            }
          }
        }
      }
    }
    System.out.println(Answer);
  }
}
