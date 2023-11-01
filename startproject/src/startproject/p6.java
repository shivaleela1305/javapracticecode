package startproject;

import java.util.Scanner;

public class p6 {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		  int n = scan.nextInt();
		  
		  if(n % 2 == 0 && n % 5 == 0) {
			  System.out.println("yes");
		  }
		  else {
			  System.out.println("no");
		  }
		  
		  scan.close();

	}

}
