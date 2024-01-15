package _1314;

import java.util.*;
import java.io.*;

public class AS4_HexFractions_Jr {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(new File("1314A4.txt"));
		
		//not repeating
		for(int i = 0; i < 10; i++) {
			double next = in.nextDouble();
			
			//System.out.println("."+toHexString(hex));
			String hex = toHexString(next);
			if(i<=5)
			{
				if(hex.length()>=10)
				{
					System.out.println("."+hex.substring(0,10));
				}
				else
					System.out.println("."+hex);
			}
			else
			{
				TreeSet<String> repeat = new TreeSet<String>();
				for(int a=0;a<hex.length();a++)
				{
					for(int b = hex.length()-1;b>=a+1;b--)
					{
						String check = hex.substring(a,b);
						String omg = hex.substring(0,a);
						int count = 0;
						while(omg.length()<hex.length())
						{
							omg+=check;
							count++;
							
						}
						if(count==2)continue;
						String stuff = omg.substring(0,omg.length()-check.length());
						if(stuff.length()>check.length()&&stuff.equals(hex.substring(0,stuff.length())))
							repeat.add(hex.substring(0,a)+check);
						
					}
				}
				if(!repeat.isEmpty())System.out.println("."+repeat.first());
				else if(hex.length()<=10) System.out.println("."+hex);
				else System.out.println("."+hex.substring(0,10));
			}
			
		}
	}
	public static String toHexString(double a)
	{
		String ans ="";
		int count = 0;
		while(a!=0&&count<=15)
		{
			double multiply = 16*a;
			int next = (int)multiply;
			a = multiply-next;
			
			//System.out.println(next+":"+a);
			String inte = Integer.toString(next);
			if(inte.equals("10")) inte = "A";
			else if(inte.equals("11")) inte = "B";
			else if(inte.equals("12")) inte = "C";
			else if(inte.equals("13")) inte = "D";
			else if(inte.equals("14")) inte = "E";
			else if(inte.equals("15")) inte = "F";
			ans+=inte;
			count++;
			
		}
		//for(int i =7;i>=0;i--)
		
		return ans;
	}
}
