package startproject;

import java.util.Scanner;

public class p8 {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		  int n = scan.nextInt();
		  int k = scan.nextInt();
		  
		  if((n-k) % 10 == 0) {
			  System.out.println("yes");
		  }
		  else {
			  System.out.println("no");
		  }
		  
		  scan.close();

	}

}
