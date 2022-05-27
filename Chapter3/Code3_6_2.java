package Chapter3;
import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] A = new int[N + 1];
    for (int i = 1; i <= N; i++) {
      A[i] = sc.nextInt();
    }
    for (int i = 1; i <= N - 1; i++) {
      int minPosition = i;
      int minValue = A[i];
      for (int j = i + 1; j <= N; j++) {
        if (A[j] <= minValue) {
          minPosition = j;  // minPosition は最小値のインデックス（1 ～ N）
          minValue = A[j];  // minValue は現時点での最小値
        }
      }
      // 次の 3 行で A[i] と A[minPosition] を交換
      int temp = A[i];
      A[i] = A[minPosition];
      A[minPosition] = temp;
    }
    for (int i = 1; i <= N; i++) {
      System.out.println(A[i]);
    }
  }
}
