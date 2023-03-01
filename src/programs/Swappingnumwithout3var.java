package programs;

public class Swappingnumwithout3var {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 100;
		int b = 500;
		
		System.out.println("before swapping :" +a+ " " +b);
		
		a = a+b; // 100+500=600
		b = a-b; // 600-500=100
		a = a-b; // 600-100=500
		
		System.out.println("after swapping :"  +a+ " " +b);

	}

}
