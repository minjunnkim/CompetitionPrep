package _1718;

import java.util.*;
import java.io.*;

public class AS2_CompressedArrays_Junior {
	
	static ArrayList<String> freq, ans;
	static int n, countn, temp;
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(new File("1718AS2.in"));
		
		freq = new ArrayList<String>();
		
		String str = in.next();
		n = in.nextInt();
		countn = -1;
		
		for(int i = 0; i < str.length(); i++) {
			boolean check = false;
			int index = 0;
			for(int j = 0; j < freq.size(); j++) {
				if(freq.get(j).substring(freq.get(j).length()-1, freq.get(j).length()).equals(str.substring(i, i+1))) {
					check = true;
					index = j;
				}
			}
			
			//System.out.println(Arrays.deepToString(freq.toArray()) + " " + check);
			if(check == false) {
				freq.add("1" + str.substring(i, i+1));
				
			}
			else if(check == true) { 
				freq.set(index, String.valueOf(Integer.parseInt(freq.get(index).substring(0, 1))+1) + str.substring(i, i+1));
			}
		}
		
		Collections.sort(freq);
		
		System.out.println(Arrays.toString(freq.toArray()));
		
		
		ans = new ArrayList<String>();
		boolean c = true;
		int count = 0;
		
		while(c == true || freq.size() == 0) {
			temp = 0;
			
			algorithm();
			
			Collections.sort(freq);
			
			if(temp < countn || freq.size() == 1) c = false;
			
			else countn = temp;
			
			System.out.println(ans + " " + Arrays.toString(freq.toArray()) + " " + temp + " " + countn);
		}
		
		if(freq.size() == 1) System.out.println("NONE");
		
	}
	
	static void algorithm() {
		Collections.sort(freq);
		
		int k = Integer.parseInt(freq.get(0).substring(0,1));
		String s = freq.get(0).substring(1);
		freq.remove(0);
		
		if(k == Integer.parseInt(freq.get(0).substring(0,1))) {
			freq.set(0, String.valueOf(k+Integer.parseInt(freq.get(0).substring(0,1))) + s+freq.get(0).substring(1));
		}
		else {
			freq.set(0, String.valueOf(k+Integer.parseInt(freq.get(0).substring(0,1))) + freq.get(0).substring(1)+s);
		}
		
		Collections.sort(freq);
		
		for(int j = 0; j < freq.size(); j++) {
			if(Integer.parseInt(freq.get(j).substring(0,1)) == n) {
				temp++;
			}
		}
	}

}
