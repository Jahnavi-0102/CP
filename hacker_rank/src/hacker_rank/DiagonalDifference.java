package hacker_rank;
//Question
//Given a square matrix of size N * N, calculate the absolute difference between the sums of its diagonals.
//Input Format: The first line contains a single integer, N. The next N lines denote the matrix’s rows, with each line N containing space-separated integers describing the columns.
//Output Format: Print the absolute difference between the two sums of the matrix’s diagonals as a single integer.

import java.util.Scanner;

public class DiagonalDifference {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int N = Integer.parseInt(in.nextLine());
		long diff = 0;
		for(int i=0; i < N; i++) {
			String[] row = in.nextLine().split(" ");
			diff += (Integer.parseInt(row[i]) - Integer.parseInt(row[N - 1 - i]));
		}
		
		System.out.println(Math.abs(diff));
		
		in.close();
	}

}
