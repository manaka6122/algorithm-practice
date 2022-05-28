package Chapter3_02;
import java.util.*;

class Code3_6_3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    System.out.println(func(N));
  }
  static int func(int N) {
    if (N == 1) {
      return 1;
    }
    return func(N - 1) * N;
  }
}
