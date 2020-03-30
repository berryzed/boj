package oj.uz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * https://oj.uz/problem/view/KRIII5P_1
 */
public class KRIII5P_1 {

	private static final int[] LAST_DAY = {-1, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());
		int[][] xy = new int[T][2];
		for (int i = 0; i < T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			xy[i][0] = Integer.parseInt(st.nextToken());
			xy[i][1] = Integer.parseInt(st.nextToken());
		}

		// 시간 날짜
		for (int[] datetime : xy) {
			System.out.println(checkTime(datetime) + " " + checkDate(datetime));
		}
	}

	private static String checkDate(int[] date) {
		if (date[0] >= 1 && date[0] <= 12 && date[1] >= 1 && date[1] <= LAST_DAY[date[0]]) return "Yes";
		return "No";
	}

	private static String checkTime(int[] time) {
		if (time[0] >= 0 && time[0] <= 23 && time[1] >= 0 && time[1] <= 59) return "Yes";
		return "No";
	}
}