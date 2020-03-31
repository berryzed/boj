import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * https://www.acmicpc.net/problem/10886
 */
public class P10886 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int cute = 0, notCute = 0;
		for (int i = 0; i < N; i++) {
			int vote = Integer.parseInt(br.readLine());
			if (vote == 0) notCute++;
			else cute++;
		}

		if (cute > notCute) System.out.println("Junhee is cute!");
		else System.out.println("Junhee is not cute!");
	}
}