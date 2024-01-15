package _1718;

import java.util.*;
import java.io.*;

public class AS1_PatternFinder_Junior {
	static String[][] arr;
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(new File("1718AS1.in"));
		
		arr = new String[8][8];
		
		for(int i = 0; i < 8; i++) {
			String temp = in.next();
			String t1 = temp.charAt(0)+"";
			String t2 = temp.charAt(1)+"";
			int d1 = Integer.parseInt(t1, 16);
			int d2 = Integer.parseInt(t2, 16);
			String jc1 = Integer.toBinaryString(d1);
			String jc2 = Integer.toBinaryString(d2);
			while(jc1.length()!=4) {
				jc1="0"+jc1;
			}
			while(jc2.length()!=4) {
				jc2="0"+jc2;
			}
			//System.out.println(jc1);
			for(int j = 0; j < 4; j++) {
				arr[i][j] = jc1.charAt(j)+"";
			}
			for(int j = 4; j < 8; j++) {
				arr[i][j] = jc2.charAt(j-4)+"";
			}
			
		}
		
		//printBoard(arr);
		//System.out.println();
		
		for(int i = 0; i < 10; i++) {
			int r = in.nextInt();
			int c = in.nextInt();
			
			String tati = "";
			for(int j = 0; j < r; j++) {
				String temp = in.next();
				
				for(int k = 0; k < c; k++) {
					tati += temp.charAt(k)+"";
				}
			}
			int ans = countarr(tati, r, c);
			
			//System.out.println(ans);
			//System.out.println(tati);
		}
		
	}
	
	public static int countarr(String tati, int r, int c ) {
		int count = 0;
		for(int i = 0; i < 8-r; i++) {
			for(int j = 0; j < 8-c; j++) {
				String temp = "";
				for(int u = 0; u < r; u++) {
					
				}
				for(int k = 0; k < c; k++) {
					
				}
				temp += arr[i][j];
				temp += arr[i][j+1];
				temp += arr[i+1][j];
				temp += arr[i+1][j+1];
				System.out.println(temp);
				if(temp.equals(tati)) {
					count++;
				}
			}
		}
		return count;
	}
	
	public static void printBoard(String[][] arr) {
		for(int i = 0; i < arr.length; i++) {
			String[] temp = arr[i];
			for(int j = 0; j < temp.length; j++) {
				System.out.print(temp[j]+" ");
			}
			System.out.println();
		}
	}
	
}