package beakjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/**
 * Created by ccoli on 2020/04/03.
 */

public class Main_15652 {

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringBuilder sb = new StringBuilder();
    private static StringTokenizer st;

    private static int n, m;
    private static int[] order;


    public static void main(String... args) throws IOException {
        st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        order = new int[m];

        func(0, 0);

        bw.write(sb.toString());
        bw.close();
        br.close();
    }

    private static void func(final int x, final int count) {
        if (count == m) {
            for (int i = 0; i < m; i++) {
                sb.append(order[i]).append(" ");
            }
            sb.append("\n");
            return;
        }
        for (int i = (count == 0) ? 0 : order[count - 1] - 1; i < n; i++) {
            order[count] = i + 1;
            func(i + 1, count + 1);
        }
    }
}