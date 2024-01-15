package _1617;

import java.util.*;
import java.io.*;

public class AS1_Numbers_Junior {
	
static Set<String> stack = new HashSet<String>(); 
	
	public static void main(String[] args) throws IOException{
		Scanner in = new Scanner(new File("1617as1.in"));
		
		String line = in.next();
		int k = in.nextInt();
		
		permute(line, 0, line.length()-1);
		String[] arr = new String[stack.size()];
		int q = 0;
		for(String str : stack) {
			arr[q] = str;
			q++;
		}
		
		Arrays.sort(arr);
		
		//1
		String r1 = deleteZeros(arr[0]);
		System.out.println(r1);
		
		//2
		String r2 = deleteZeros(arr[arr.length-1]);
		System.out.println(r2);
		
		//3
		String r3 = deleteZeros(arr[arr.length-50]);
		System.out.println(r3);
		
		//4
		String r4 = deleteZeros(arr[k-1]);
		System.out.println(r4);
		
		//5
		long first = Long.parseLong(r1);
		long second = Long.parseLong(r2);
		long mean = (first+second)/2;
		long distance = Integer.MAX_VALUE;
		String r5 = "";
		for(int i = 0; i < arr.length; i++) {
			if(Math.abs(mean-Long.parseLong(arr[i]))<distance) {
				distance = Math.abs(mean-Long.parseLong(arr[i]));
				r5 = arr[i];
			}
		}
		System.out.println(r5);
		
		}
		
	public static String deleteZeros(String str) {
		while(str.charAt(0)=='0') {
			str=str.substring(1);
		}
		return str;
	}
	
	public static void permute(String str, int l, int r) {
		if(l == r) {
			
			stack.add(str);
		}
		else {
			for(int i = l; i <= r; i++) {
				str = swap(str, l, i);
				permute(str, l+1, r);
			}
		}
	}
	
	public static String swap(String a, int i, int j) {
		char temp;
		char[] c = a.toCharArray();
		temp = c[i];
		c[i] = c[j];
		c[j] = temp;
		return String.valueOf(c);
	}
}
