package _2017;

import java.util.*;
import java.io.*;

public class Question_5 {

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		
		int sum = 1;

		ArrayList<Integer> blacklist = new ArrayList<Integer>();
		
		for(int i = 2; i < n/2; i++) {
			
			if(n % i == 0 && !blacklist.contains(i)) {
				blacklist.add(i);
				blacklist.add(n/i);
				sum += i + n/i;
			}
		}
		
		if(sum == n) {
			System.out.println(1);
		}
		else System.out.println(0);
	}

}
