package Chapter3_02;
import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] A = new int[N + 1];
    for (int i = 1; i <= N; i++) {
      A[i] = sc.nextInt();
    }
    long x = 0, y = 0, z = 0;
    for (int i = 1; i <= N; i++) {
      if (A[i] == 1) x += 1;
      if (A[i] == 2) y += 1;
      if (A[i] == 3) z += 1;
    }
    System.out.println(x * (x - 1) / 2 + y * (y - 1) / 2 + z * (z - 1) / 2);
  }
}
