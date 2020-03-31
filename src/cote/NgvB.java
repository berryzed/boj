package cote;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * TODO DFS / BFS / 트리 DP
 */
public class NgvB {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] NM = br.readLine().split(" ");
		int N = Integer.parseInt(NM[0]); // 노트 개수
		int M = Integer.parseInt(NM[1]); // 질문 수
		int[] NODES = new int[N];
		int[][] Q = new int[M][2];

		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			NODES[i] = Integer.parseInt(st.nextToken());
		}
		for (int i = 0; i < M; i++) {
			String[] QQ = br.readLine().split(" ");
			Q[i][0] = Integer.parseInt(QQ[0]);
			Q[i][1] = Integer.parseInt(QQ[1]);
		}
	}
}