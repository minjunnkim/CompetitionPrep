package _1415;

import java.util.*;
import java.io.*;

public class AS2_Mail_Jr {

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(new File("1415AS2.in"));
		
		Stack<house> addresseven = new Stack<house>();
		Stack<house> addressodd = new Stack<house>();
		
		int n = in.nextInt();
		house[] h = new house[n];
		
		for(int i = 0; i < n; i++) {
			String temp = in.next();
			char c = temp.charAt(0);
			int num = Integer.parseInt(temp.substring(1));
			
			h[i] = new house(c, num);
			if(num % 2 == 1) {
				addressodd.add(h[i]);
			}
			else if(num % 2 == 0) {
				addresseven.add(h[i]);
			}
		}
		
		Collections.sort(addressodd);
		Collections.sort(addresseven);
		
		System.out.println(addressodd + " " + addresseven);
		
		
		for(int i = 0; i < 5; i++) {
			in.nextLine();
			int n1 = in.nextInt();
			for(int j = 0; j < n1; j++) {
				String temp = in.next();
				char c = temp.charAt(0);
				int num = Integer.parseInt(temp.substring(1));
				
				house temph = new house(c, num);
				if(num % 2 == 1) {
					addressodd.add(temph);
				}
				else if(num % 2 == 0) {
					addresseven.add(temph);
				}
				Collections.sort(addressodd);
				Collections.sort(addresseven);
			}
			
			System.out.println(addressodd + " " + addresseven);

			String s = in.next();
			boolean check = false;
			while(check == false) {
				for(int k = 0; k < addressodd.size(); k++) {
					house temp = addressodd.pop();
					String t1 = temp.toString();
					String str = String.valueOf(t1.charAt(0));
					System.out.println(str);
					if(str.equals(s)) {
						check = true;
						addressodd.push(temp);
						break;
					}
					else {
						addressodd.add(0, temp);
					}
				}
				if(check == false) {
					for(int k = 0; k < addresseven.size(); k++) {
						house temp = addresseven.pop();
						String t1 = temp.toString();
						String str = String.valueOf(t1.charAt(0));
						System.out.println(str);
						if(str.equals(s)) {
							check = true;
							addresseven.push(temp);
							break;
						}
						else {
							addresseven.add(0, temp);
						}
					}
				}
			}
			
			System.out.println(addressodd + " " + addresseven);
			
			
		}
		
		
	}

}

class house implements Comparable<house> {
	
	int num;
	char gate;
	
	house(char g, int n) {
		gate = g;
		num = n;
	}
	
	@Override
	public int compareTo(house h) {
		if(this.num % 2 == 1 && h.num % 2 == 0) {
			return 1;
		}
		else if(this.num % 2 == 0 && h.num % 2 == 1) {
			return -1;
		}
		else if(this.num % 2 == 1 && h.num % 2 == 1) {
			if(this.gate < h.gate) {
				return 1;
			}
			else if(this.gate > h.gate) { 
				return -1;
			}
			else if(this.num < h.num) {
				return 1;
			}
			else if(this.num < h.num) {
				return -1;
			}
		}
		else if(this.num % 2 == 0 && h.num % 2 == 0) {
			if(this.gate < h.gate) {
				return 1;
			}
			else if(this.gate > h.gate) { 
				return -1;
			}
			else if(this.num < h.num) {
				return 1;
			}
			else if(this.num < h.num) {
				return -1;
			}
		}
		return 0;
	}
	
	public String toString() {
		return "" + gate + num;
	}
	
}
