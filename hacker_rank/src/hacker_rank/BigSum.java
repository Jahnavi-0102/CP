package hacker_rank;
// question
// You are given an array of integers of size . You need to print the sum of the elements in the array, keeping in mind that some of those integers may be quite large.
//Input Format
//The first line of the input consists of an integer . The next line contains space-separated integers contained in the array.
//Output Format
//Print a single value equal to the sum of the elements in the array.
//Constraints
//1<=N<=10 0<=a[i]<=10^10
//
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BigSum {
	public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int n = Integer.parseInt(line);
        line = br.readLine();
        String[] strs = line.trim().split("\\s+"); 
        long sum=0;
        
        for(int i=0;i<n;i++){
            sum = sum + Long.parseLong(strs[i]);
        }
        
        System.out.println(sum);
 
    }

}
