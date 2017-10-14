public class ArithmaticOperations  {
	public static void main(String[] args) {
		int x=3,b;
		System.out.println(x);
		b=x++ + ++x;
		System.out.println(++x+" value of b is : "+b);//pre Increment
		System.out.println(x++);// post Increment
		System.out.println(--x + x++);
	}
	
}