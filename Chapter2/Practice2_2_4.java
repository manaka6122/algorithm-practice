package Chapter2;

import java.util.*;

class Paractice2_2_4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int[] A = new int[N + 1];
    for (int i = 1; i <= N; i++) {
      A[i] = sc.nextInt();
    }
    int Answer = 0;
    for (int i = 1; i <= N; i++) {
      Answer += A[i];
    }
    System.out.println(Answer % 100);
  }
};

