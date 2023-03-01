package programs;

public class Reversestring {

	public static void main(String[] args) {
		
		String name = "Happiness";
		String rev ="";
		
		for(int i = name.length()-1;i>=0;i--) {
			char ch = name.charAt(i);
			rev = rev+ch;
			
		}
		System.out.println("before reverse string :" + name);
		System.out.println("after reverse string is :" + rev);

	}

}
