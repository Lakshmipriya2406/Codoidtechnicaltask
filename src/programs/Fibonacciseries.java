package programs;

public class Fibonacciseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 11;
		System.out.println("print number a is :" +a);
		System.out.println("print number b is :" +b);
		for(int i = 12; i<=20; i++) {
			
			int c = a+b;
			System.out.println("print fibonacci number is :" +c);
			a = b;
			b = c;
		}
		

	}

}
