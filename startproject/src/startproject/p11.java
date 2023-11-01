package startproject;

import java.util.Scanner;

public class p11 {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		  int n = scan.nextInt();
		  int k = scan.nextInt();
		  int l = scan.nextInt();
		  
		  if(n % k == 0) {
			  System.out.println("tap");
		  }
		  else if(n % l == 0) {
			  System.out.println("acdmy");
		  }
		  else {
			  System.out.println("btm");
		  }
		  
		  scan.close();

	}

}
