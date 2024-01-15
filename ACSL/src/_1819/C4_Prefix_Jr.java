package _1819;

import java.util.*;
import java.io.*;

public class C4_Prefix_Jr {
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
					String a = inputarr.get(j+1);
					String b = inputarr.get(j+2);
					
					//System.out.println(inputarr.get(j) + " " + a + " " + b);
					if(a.contains("0") || a.contains("1") || a.contains("2") || a.contains("3") || a.contains("4") || a.contains("5") || a.contains("6") || a.contains("7") || a.contains("8") || a.contains("9")) {
						if(b.contains("0") || b.contains("1") || b.contains("2") || b.contains("3") || b.contains("4") || b.contains("5") || b.contains("6") || b.contains("7") || b.contains("8") || b.contains("9")) {
							String temp = "";
							if(inputarr.get(j).equals("*")) {
								temp = String.valueOf(Integer.parseInt(a) * Integer.parseInt(b));
								inputarr.set(j+2, temp);
								inputarr.remove(j+1);
								inputarr.remove(j);
							}
							else if(inputarr.get(j).equals("+")) {
								temp = String.valueOf(Integer.parseInt(a) + Integer.parseInt(b));
								inputarr.set(j+2, temp);
								inputarr.remove(j+1);
								inputarr.remove(j);
							}
							else if(inputarr.get(j).equals("-")) {
								temp = String.valueOf(Integer.parseInt(a) - Integer.parseInt(b));
								inputarr.set(j+2, temp);
								inputarr.remove(j+1);
								inputarr.remove(j);
							}
							else if(inputarr.get(j).equals("/")) {
								temp = String.valueOf(Integer.parseInt(a) / Integer.parseInt(b));
								inputarr.set(j+2, temp);
								inputarr.remove(j+1);
								inputarr.remove(j);
							}

							else if(inputarr.get(j).equals("@")) {
								String c = inputarr.get(j+3);
								//System.out.println(c);
								if(!c.contains("*") && !c.contains("+") && !c.contains("-") && !c.contains("/") && !c.contains("@")) {
									if(Integer.parseInt(a) >= 0) {
										inputarr.set(j+3, b);
									}
									inputarr.remove(j+2);
									inputarr.remove(j+1);
									inputarr.remove(j);	
								}
							}
						}
					}
					
					//System.out.println(inputarr);
				}
			}	
			out.println(inputarr.get(0));
		}
		in.close();
		out.close();
	}
}
