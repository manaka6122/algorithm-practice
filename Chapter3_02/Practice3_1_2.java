package Chapter3_02;
import java.util.*;

class Practice3_1_2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long N = sc.nextLong();
    boolean flag = false;
    for (long i = 2; i * i <= N; i++) {
      while (N % i == 0) {
        if (flag == true) {
          System.out.print(" ");
        }
        flag = true;
        N /= i;
        System.out.println(i);
      }
    }
    if (N >= 2) {
      if (flag == true) {
        System.out.print(" ");
      }
      flag = true;
      System.out.print(N);
    }
    System.out.println();
  }
}
