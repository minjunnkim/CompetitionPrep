import java.io.*;

import java.util.*; 

public class WeirdAlgorithm {

	public static void main(String[] args) {
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			
			long n = Long.parseLong(in.readLine());

			System.out.print(n + " ");
			while(n != 1) {
				if(n%2==0) {
					n/=2;
					System.out.print(n + " ");
				}
				else {
					n = n*3 +1;
					System.out.print(n + " ");
				}
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
