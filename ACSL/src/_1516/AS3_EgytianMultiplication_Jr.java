package _1516;

import java.util.*;
import java.io.*;

public class AS3_EgytianMultiplication_Jr {

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(new File("1516A3.txt"));
		
		for(int j=0; j<10; j++) {
			ArrayList<Integer> name = new ArrayList<Integer>();
			
			int num = in.nextInt();
			int mult = in.nextInt();
			int temp = num;
			int count = 0;
			while(true) {
				
				if(temp >= 2) {
					temp =temp/2;
					count++;
				}
				else {
					name.add((int)Math.pow(2, count));
					num = num - (int)Math.pow(2, count);
					temp=num;
					count=0;
				}
				//System.out.println(temp);
					
				if(temp <= 0) {
					break;
				}
			}
			
			for(int i = 0; i < name.size(); i++) {
				System.out.print((int)name.get(i) * mult +" ");
			}
			System.out.println();
		}
	}

}
