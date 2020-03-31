package cote;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NgvA {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		String s = br.readLine();

		long max = 0;
		for (int i = 0; i <= N - K; i++) {
			long num = Long.parseLong(s.substring(i, i + K));
			if (max < num) max = num;
		}
		System.out.println(max);
	}
}