package _2017;

import java.util.*;
import java.io.*;

public class Question_1 {

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		
		String number = in.nextLine();
		
		/*number = number.replaceAll("[A~B~C]", "2");
		number = number.replaceAll("[D~E~F]", "3");
		number = number.replaceAll("[G~H~I]", "4");
		number = number.replaceAll("[J~K~L]", "5");
		number = number.replaceAll("[M~N~O]", "6");
		number = number.replaceAll("[P~Q~R~S]", "7");
		number = number.replaceAll("[T~U~V]", "8");
		number = number.replaceAll("[W~X~Y~Z]", "9");
		*/
		
		number = number.replaceAll("[^x~y~z]", "+");
		System.out.println(number);
	}

}
