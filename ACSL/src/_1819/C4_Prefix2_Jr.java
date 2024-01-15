package _1819;

import java.io.*;
import java.util.*;

public class C4_Prefix2_Jr {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(new File("1819C4.in"));
		PrintWriter out = new PrintWriter(new File("1819C4.out"));
		
		for(int i = 0; i < 5; i++) {
			String[] s = in.nextLine().split(" ");
			
			ArrayList<String> inputarr = new ArrayList<String>();
			
			
			for(int j = 0; j < s.length; j++) {
					inputarr.add(s[j]);
			}
			
			while(inputarr.size() != 1) {
				for(int j = 0; j < inputarr.size()-2; j++) {
					String o = inputarr.get(j);
					String a = inputarr.get(j+1);
					String b = inputarr.get(j+2);
					
					if(check(a) == "ze" && check(b) == "ze") {
						if(check(o) == "tw*") {
							
						}
						
					}	
					
					if(check(o) == "th") {
						String c = inputarr.get(j+3);
					}
				}
				
			}
		}
	}
	public static String check(String s) {
		if(s.equals("*")) {
			return "tw*";
		}
		else if(s.equals("+")) {
			return "tw+";
		}
		else if(s.equals("-")) {
			return "tw-";
		}
		else if(s.equals("@")){
			return "th";
		}
		else {
			return "ze";
		}
	}
}
