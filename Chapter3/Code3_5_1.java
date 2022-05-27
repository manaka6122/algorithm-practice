// 円周率Πの近似値を出力するプログラム
package Chapter3;
import java.util.*;

class Code3_5_1 {
  public static void main(String[] args) {
    Random rd = new Random();
    int N = 10000;  // N は試行回数（適宜変更する）
    int M = 0;
    for (int i = 1; i <= N; i++) {
      double px = rd.nextDouble();
      double py = rd.nextDouble();
      // 原点からの距離は sqrt(px * px + py * py)
			// これが 1 以下であれば良いので、条件は「px * px + py * py <= 1」（「sqrt(px * px + py * py) <= 1」と同値）
      if (px * px + py * py <= 1) {
        M++;
      }
      System.out.format("%.12f\n", 4.0 * M / N);
    }
  }
}
