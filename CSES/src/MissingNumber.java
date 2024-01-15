import java.io.*;
import java.util.*;
public class MissingNumber {

	public static void main(String[] args) {
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			
			long n = Long.parseLong(in.readLine());
			long x = (n*(n+1))/2;
			StringTokenizer st = new StringTokenizer(in.readLine());
			for(int i = 0; i < n-1; i++) {
				
				
				x -= Long.parseLong(st.nextToken());
			}
			
			System.out.println(x);
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
