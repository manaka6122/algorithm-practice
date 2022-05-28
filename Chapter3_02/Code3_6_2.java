package Chapter3_02;
import java.util.*;

class Code3_6_2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] A = new int[N + 1];
    for (int i = 1; i <= N; i++) {
      A[i] = sc.nextInt();
    }
    for (int i = 1; i <= N; i++) {
      int minPosition = i;
      int minValue = A[i];
      for (int j = i + 1; j <= N; j++) {
        if (A[j] < minValue) {
          minPosition = j;
          minValue = A[j];
        }
      }
      int temp = A[i];
      A[i] = A[minPosition];
      A[minPosition] = temp;
    }
    for (int i = 1; i <= N; i++) {
      System.out.println(A[i]);
    }
  }
}
