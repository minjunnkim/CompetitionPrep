package _1819;

import java.io.*;
import java.util.*;

public class C4_PrefixStack_Jr {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(new File("1819C4.in"));
		
		for(int i = 0; i < 5; i++) {
			char[] s = in.nextLine().replace(" ", "").toCharArray();
			
			Stack<Integer> inputarr = new Stack<Integer>();
			
			
			for(int j = s.length-1; j >= 0; j--) {
				char c = s[j];
				if(c == '*') {
					inputarr.push(inputarr.pop() * inputarr.pop());
				}
				else if(c == '+') {
					inputarr.push(inputarr.pop() + inputarr.pop());
				}
				else if(c == '-') {
					inputarr.push(inputarr.pop() - inputarr.pop());
				}
				else if(c == '@') {
					int a = inputarr.pop();
					int b = inputarr.pop();
					int ca = inputarr.pop();
					if(a >= 0) {
						inputarr.push(b);
					}
					else {
						inputarr.push(ca);
					}
				}
				else {
					inputarr.push(c-'0');
				}
			}
			
			System.out.println(inputarr.pop());
		}
		
		in.close();
	}
}
