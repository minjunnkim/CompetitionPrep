package _2017;

import java.util.*;
import java.io.*;

public class Question_2 {

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		
		int maxsum = 0;
		
		for(int i = 0; i < n; i++) {
			int temp = in.nextInt();
			if(temp > 0) {
				maxsum += temp;
			}
		}
		
		System.out.println(maxsum);
	}

}
