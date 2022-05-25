package Chapter2;
import java.util.*;

class Code2_4_3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int S = sc.nextInt();
    int cnt = 0;
    for (int i = 1; i <= N; i++) {
      for (int j = 1; j <= S; i++) {
        if (i + j <= S) {
          cnt++;
        }
      }
    }
    System.out.println(cnt);
  }
}
