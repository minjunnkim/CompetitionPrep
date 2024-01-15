package _1314;

import java.util.*;
import java.io.*;

public class AS2_KenKen_Jr {

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(new File("1314AS2.in"));
			
		for(int u = 0; u < 3; u++) {
			int[] possibleGrid = {123312231, 132213321, 321213132, 231312123, 213321132, 312123231, 231123312, 132321213, 312231123, 321132213, 213132321, 123231312};
			
			String testGrid = "000000000";
			
			int sectionnum = in.nextInt();
			
			String[] inputarr = in.nextLine().split(" ");
			
			Stack<String> input = new Stack<String>();
			
			for(int i = 0; i < inputarr.length; i++) {
				input.add(inputarr[i]);
			}
			
			input.remove(0);
			
			//System.out.println(input);
			
			String check = "";
			String ans = "";
			
			for(int i = 0; i < sectionnum; i++) {
				ans += "1";
			}
			int count = 0;
			
			
			while(!check.equals(ans)) {
				check = "";
				
				Stack<String> test = (Stack<String>) input.clone();
				
				
				testGrid = String.valueOf(possibleGrid[count]);
				
				System.out.println(testGrid);
				
				for(int j = 0; j < sectionnum; j++) {
					String temp = test.pop();
					
					System.out.println(temp);
					
					if(temp.contains("#")) {
						int temp2 = Integer.parseInt(test.pop());
						if(testGrid.substring(temp2-1, temp2).equals(temp.substring(0,1))) {
							check += "1";
						}
						
					}
					
					else if(temp.contains("+")) {
						ArrayList<String> temp2 = new ArrayList<String>();
						String testch = test.pop();
						while(!testch.contains("+") && !testch.contains("#")) {
							test.push(testch);
							int tempi = Integer.parseInt(test.pop());
							temp2.add(testGrid.substring(tempi-1, tempi));
							
							System.out.println(temp2 + " " + tempi + " " + testGrid.substring(tempi-1, tempi));
							
							testch = test.pop();
						}
						test.push(testch);
						
						int total = 0;
						
						for(int k = 0; k < temp2.size(); k++) {
							total += Integer.parseInt(temp2.get(k));
						}
						
						System.out.println(total);
						
						if(total == Integer.parseInt(temp.substring(0,1))) {
							check += "1";
						}
						
					}
					
					System.out.println(check);
					
					
				}
				
				count++;
			}
			
			for(int j = 0; j < 5; j++) {
				int print = in.nextInt();
				System.out.println(testGrid.substring(print-1, print));
			}
		}
	}

}

