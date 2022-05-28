package Chapter3_02;
import java.util.*;

class Main {
  public static void main(String[] args) {
    Random rd = new Random();
    int N = 10000;
    int M = 0;
    for (int i = 1; i <= N; i++) {
      double px = rd.nextDouble();
      double py = rd.nextDouble();
      if (px * px + py * py <= 1.0) {
        M++;
      }
    }
    System.out.format("%.12f\n", 4.0 * M / N);
  }
}
