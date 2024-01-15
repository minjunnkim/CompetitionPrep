import java.io.*;
import java.util.*;
public class Permutations {

	public static void main(String[] args) {
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			
			int n = Integer.parseInt(in.readLine());
			
			if(n == 1) System.out.println("1");
			else if(n < 4) System.out.println("NO SOLUTION");
			else if(n == 4) System.out.println("2 4 1 3");
			else {
				StringBuilder sb = new StringBuilder();
				for(int i = 2; i <= n; i+=2) {
					sb.append(i).append(" ");
				}
				
				for(int i = 1; i <= n; i+=2) {
					sb.append(i).append(" ");
				}
				System.out.println(sb.toString());
			}
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
