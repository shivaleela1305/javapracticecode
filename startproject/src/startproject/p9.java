package startproject;

import java.util.Scanner;

public class p9 {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		  int n = scan.nextInt();
		  int k = scan.nextInt();
		  
		  if(n % 100 == k) {
			  System.out.println("yes");
		  }
		  else {
			  System.out.println("no");
		  }
		  
		  scan.close();

	}

}
