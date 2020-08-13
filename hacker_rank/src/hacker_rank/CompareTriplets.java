package hacker_rank;
//Question
//Alice and Bob each created one problem for HackerRank. A reviewer rates the two challenges, awarding points on a scale from 1 to 100 for three categories: problem clarity, originality, and difficulty.
//We define the rating for Alice’s challenge to be the triplet a = (a[0], a[1], a[2]), and the rating for Bob’s challenge to be the triplet b = (b[0], b[1], b[2]).
//Your task is to find their comparison points by comparing a[0] with b[0], a[1] with b[1], and a[2] with b[2] .
//If a[i] > b[i], then Alice is awarded 1 point.
//If a[i] < b[i], then Bob is awarded 1 point.
//If a[i] = b[i], then neither person receives a point.
//Comparison points are the total points a person earned.
//Given a and b, determine their respective comparison points.

import java.util.Scanner;

public class CompareTriplets {
	 public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int alice = 0;
	        int bob = 0;
	        int a0 = in.nextInt();
	        int a1 = in.nextInt();
	        int a2 = in.nextInt();
	        int b0 = in.nextInt();
	        int b1 = in.nextInt();
	        int b2 = in.nextInt();
	        if(a0>b0){
	            alice++;
	        }
	        if(b0>a0){
	            bob++;
	        }
	        if(a1>b1){
	            alice++;
	        }
	        if(b1>a1){
	            bob++;
	        }
	        if(a2>b2){
	            alice++;
	        }
	        if(b2>a2){
	            bob++;
	        }
	        System.out.print(alice+" "+bob);
	        in.close();
	    }

}
