package startproject;

import java.util.Scanner;

public class p1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		int sum = a + b;
		
		System.out.print(sum);
		scanner.close();

	}

}
