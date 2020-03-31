import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * https://www.acmicpc.net/problem/10895
 *
 * TODO 정수론 확인하기
 */
public class P10895 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());

		if ((k != 0) && (a % 2 == 0)) a = 1;
		System.out.println(a);
	}
}