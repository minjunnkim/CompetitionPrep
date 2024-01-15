package practice;

import java.util.*;
import java.io.*;

public class HexgridWalk3 {

	static Scanner in;
	static PrintWriter out;
	static String[] l, w;
	
	public static void main(String[] args) {
		try {
			in = new Scanner(new File("1718AS3.in"));
			out = new PrintWriter(new File("1718AS3.out"));
			
			init();

			for(int q = 0; q < 10; q++) {
				
				out.println(solve(q));
			}
			in.close();
			out.close();
		}
		catch(Exception e) { 
			e.printStackTrace();
		}
	}
	
	private static void init() {
		l = new String[10];
		w = new String[10];
		for(int i = 0; i < 10; i++) {
			l[i] = in.next();
			w[i] = in.next();
		}
	}
	
	private static String solve(int q) {
		String loc = l[q];
		String way = w[q];
		
		char let = loc.charAt(0);
		int num = Integer.parseInt(loc.substring(1));
			
		for(int i = 0; i < way.length(); i++) {
			char temp = way.charAt(i);
				
			if(temp=='1') {
				num++;
			}
			else if(temp=='2') {
				if(let=='Z') {
					continue;
				}
				if((int)let%2==1) {
					num++;
				}
				else if((int)let%2==0) {
					num+=0;
				}
				let = (char) (let+1);
				
			}
			else if(temp=='3') {
				if(let=='Z') {
					continue;
				}
				if((int)let%2==0) {
					if(num==1)
						continue;
					num--;
				}
				else if((int)let%2==1) {
					num+=0;
				}
				let = (char) (let+1);
			}
			else if(temp=='4') {
				if(num==1)
					continue;
				num--;
			}
			else if(temp=='5') {
				if(let=='A') {
					continue;
				}
				if((int)let%2==0) {
					if(num==1)
						continue;
					num--;
				}
				else if((int)let%2==1) {
					num+=0;
				}
				let = (char)(let-1);
			}
			else if(temp == '6') {
				if(let=='A') {
					continue;
				}
				if((int)let%2==1) {
					num++;
				}
				else if((int)let%2==0) {
					num+=0;
				}
				let = (char)(let-1);
			}
			
			
		}
		
		return(let+""+num);		
		
	}

}
