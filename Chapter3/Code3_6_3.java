// 佐伯関数による階乗の計算
package Chapter3;
import java.util.*;


class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    System.out.println(func(N));
  }
  static int func(int N) {
    if (N == 1) {
      return 1;  // このような場合分けすべきケースを「ベースケース」といいます
    }
    return func(N - 1) * N;
  }
}
