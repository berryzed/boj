import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * https://www.acmicpc.net/problem/11383
 */
public class p11383 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()); // Y
		int M = Integer.parseInt(st.nextToken()); // X

		String[] images = new String[N], images2x = new String[N];

		for (int i = 0; i < N; i++) {
			images[i] = br.readLine(); // 원본

			StringBuilder text = new StringBuilder();
			for (int j = 0; j < M; j++) { // 2배
				text.append(images[i].charAt(j)).append(images[i].charAt(j));
			}
			images2x[i] = text.toString();
		}

		boolean isEquals = true;
		for (int i = 0; i < N; i++) {
			if (!images2x[i].equals(br.readLine())) {
				isEquals = false;
				break;
			}
		}

		if (isEquals) System.out.println("Eyfa");
		else System.out.println("Not Eyfa");
	}
}