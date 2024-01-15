package _1718;

import java.util.*;
import java.io.*;

public class AS2_CompressedArrays2_Junior {
	
	static Map<Character, Integer> m;
	static ArrayList<pair> freq;
	public static void main(String[] args) throws IOException{
		Scanner in = new Scanner(new File("1718AS2.in"));
		for(int u = 0; u < 20; u++) {
			m = new HashMap<Character, Integer>();
			
			String str = in.next();
			int n = in.nextInt();
			freq = new ArrayList<pair>();
			for(int i = 0; i < str.length(); i++) {
				char c = str.charAt(i);
				
				if(m.containsKey(c)) {
					m.put(c, m.get(c) + 1);
				}
				else m.put(c, 1);
			}
			//System.out.println(m);
				
			for(char h : m.keySet()) {
				freq.add(new pair(m.get(h), h+""));
			}
			
			
			
			while(true) {
				Collections.sort(freq);
				
				int num = freq.get(0).n+freq.get(1).n;
				String letter = freq.get(0).s + freq.get(1).s;
				letter = sort(letter);
				Collections.sort(freq);
				
				if(num > n) break;
				
				freq.add(new pair(num, letter));
				freq.remove(0);
				freq.remove(0);
			}
			
			String ans = "";
			
			Collections.sort(freq);
			for(int i = 0; i < freq.size(); i++) {
				if(freq.get(i).n == n) ans += freq.get(i).s; 
			}
			
			ans = sort(ans);
			
			if(ans.equals("")) {
				System.out.println("NONE");
			}
			else System.out.println(ans);
		}
	}
	static String sort(String s) {
		char[] c = s.toCharArray();
		Arrays.sort(c);
		String ans = "";
		for(int i = 0; i < c.length; i++) {
			ans += c[i];
		}
		//System.out.println(ans);
		return ans;
	}
}



class pair implements Comparable<pair> {
	int n;
	String s;
	
	pair(int n1, String s1) {
		n = n1;
		s = s1;
	}
	@Override
	public int compareTo(pair that) {
		if(this.n > that.n) return 1;
		else if(this.n == that.n) {
			if(this.s.compareTo(that.s) > 0) {
				return 1;
			}
			else return -1;
		}
		else return -1;
	}
	
	public String toString() {
		return n + " " + s;
	}
}