package _1718;

import java.util.*;
import java.io.*;

public class AS4_FifteenPuzzle {

	public static void main(String[] args) throws IOException{
		Scanner in = new Scanner(new File("1718a4.txt"));
		
		for(int i = 0; i < 10; i++) {
			int start = in.nextInt();
			
			String input = in.next();
			
			for(int j = 0; j < input.length(); j++) {
				if(input.charAt(j) == 'B') {
					start += 4;
				}
				else if(input.charAt(j) == 'L') {
					start -= 1;
				}
				else if(input.charAt(j) == 'R') {
					start += 1;
				}
				else if(input.charAt(j) == 'A') {
					start -= 4;
				}
			}
			
			System.out.println(start);
		}
	}

}
