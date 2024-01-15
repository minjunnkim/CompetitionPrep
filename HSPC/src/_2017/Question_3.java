package _2017;

import java.util.*;
import java.io.*;

public class Question_3 {

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		
		String input = in.nextLine();
		
		String temp = input.substring(0,1);
		
		int ans = 0;
		ans += Integer.parseInt(temp);
		
		int count = 1;
		
		while(!temp.contains("=")) {
			temp = input.substring(count, count+1);
			if(temp.contains("+")) {
				count++;
				temp = input.substring(count, count+1); 
				ans += Integer.parseInt(temp);
			}
			else if(temp.contains("-")) {
				count++;
				temp = input.substring(count, count+1); 
				ans -= Integer.parseInt(temp);
			}
			count++;
		}
		
		System.out.println(ans);
	
	}
	

}
