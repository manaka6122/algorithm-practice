package Chapter3_02;
import java.util.*;

class Practice3_3_3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    long r = sc.nextLong();
    long Fact_n = 1, Fact_r = 1, Fact_nr= 1;
    for (int i = 1; i <= n; i++) Fact_n *= i;
    for (int i = 1; i <= r; i++) Fact_r *= i;
    for (int i = 1; i <= n - r; i++) Fact_nr *= i;
    System.out.println(Fact_n / (Fact_r * Fact_nr));
  }
}
