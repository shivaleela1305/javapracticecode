package startproject;

public class p13 {

	public static void main(String[] args) 
	{
		
		Calculator calc = new Calculator();
		 
		 int res1 = calc.add1(5, 9);
		 System.out.println(res1);
		 
		 int res2 = calc.add2(5, 9 ,6);
		 System.out.println(res2);
		 
		 }
	
	class Calculator
	{
		 int add1(int a , int b)
		 {
			 int sum = a+b;
			 return sum;
		 }
		 int add2(int a , int b , int c)
		 {
			 int sum = a+b+c;
			 return sum;
		 }
	}

}
