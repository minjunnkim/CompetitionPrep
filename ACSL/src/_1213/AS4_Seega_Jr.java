package _1213;

import java.util.*;
import java.io.*;

public class AS4_Seega_Jr {

	public static void main(String[] args) throws IOException{
		Scanner in = new Scanner(new File("1213AS4.in"));
				
		String[][] board = new String[5][5];
		
		int n = in.nextInt();
		
		for(int i = 0; i < n; i++) {
			int temp = in.nextInt();
			String temp1 = points(temp);
			int x = Integer.parseInt(temp1.charAt(0)+"");
			int y = Integer.parseInt(temp1.charAt(1)+"");
			board[x][y]="X";
		}
		for(int i = 0; i < n; i++) {
			int temp = in.nextInt();
			String temp1 = points(temp);
			int x = Integer.parseInt(temp1.charAt(0)+"");
			int y = Integer.parseInt(temp1.charAt(1)+"");
			board[x][y]="O";
		}
		
	}
	
	public static void dfs(String[][] arr) {
		
	}
	
	public static String points(int n) {
		if(n==1) {
			return "40";
		}
		else if(n==2) {
			return "41";
		}
		else if(n==3) {
			return "42";
		}
		else if(n==4) {
			return "43";
		}
		else if(n==5) {
			return "44";
		}
		else if(n==6) {
			return "30";
		}
		else if(n==7) {
			return "31";
		}
		else if(n==8) {
			return "32";
		}
		else if(n==9) {
			return "33";
		}
		else if(n==10) {
			return "34";
		}
		else if(n==11) {
			return "20";
		}
		else if(n==12) {
			return "21";
		}
		else if(n==13) {
			return "22";
		}
		else if(n==14) {
			return "23";
		}
		else if(n==15) {
			return "24";
		}
		else if(n==16) {
			return "10";
		}
		else if(n==17) {
			return "11";
		}
		else if(n==18) {
			return "12";
		}
		else if(n==19) {
			return "13";
		}
		else if(n==20) {
			return "14";
		}
		else if(n==21) {
			return "00";
		}
		else if(n==22) {
			return "01";
		}
		else if(n==23) {
			return "02";
		}
		else if(n==24) {
			return "03";
		}
		else 
			return "04";
	}

}
