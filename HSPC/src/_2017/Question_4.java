package _2017;

import java.util.*;
import java.io.*;

public class Question_4 {

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		
		int input = 0; 
		
		for(int i = n; i > 0; i--) {
			input += in.nextInt() * Math.pow(10, i-1);
		}
		
		System.out.println(input + 1);
	}

}
