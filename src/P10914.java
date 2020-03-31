import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * https://www.acmicpc.net/problem/10914
 *
 * TODO 26을 더해주는 이유 확인하기
 */
public class P10914 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder builder = new StringBuilder();
		while (st.hasMoreTokens()) {
			String text = st.nextToken();
			for (int i = 1; i < text.length(); i += 2) { // 더미 무시
				int y = text.charAt(i - 1) - 'a';
				int z = text.charAt(i) - 'a';
				char x = (char) ('a' + (26 + y + z - n) % 26);
				builder.append(x);
			}
			builder.append(" ");
		}
		System.out.println(builder.toString());
	}
}