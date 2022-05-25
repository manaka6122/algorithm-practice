package Chapter2;

import java.util.*;

class Code2_1_4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    String answer = "";
    while (N >= 1) {
      if (N % 2 == 0) {
        answer = "0" + answer;
      }
      if (N % 2 == 1) {
        answer = "1" + answer;
      }
      N = N / 2;
    }
    System.out.println(answer);
  }
}
