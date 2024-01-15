package _1718;

import java.io.*;
import java.util.*;

public class AS3_HexgridWalk {
	
	public static void main(String[] args) throws IOException{
		
		Scanner in = new Scanner(new File("1718a3.txt"));
		
		for(int q = 0; q < 10; q++) {
			String loc = in.next();
			String way = in.next();
			
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
				
				//System.out.println(let+""+num);
				
			}
			
			System.out.println(let+""+num);
			//System.out.println();
			
		}
		
	}
	
}
