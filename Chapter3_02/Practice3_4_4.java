package Chapter3_02;
import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    double answer = 0.0;
    for (int i = 1; i <= N; i++) {
      answer += (double)N / i;
    }
    System.out.format("%.12f\n", answer);
  }
}
