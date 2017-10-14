/*
There are two types of conversions
1. Implicit type conversion : done by compiler low value to high value data type
2. Ecplicit type conversion : done manually hight to low
*/
public class TypeConversion {
	public static void main(String[] args) {
		int x=20,y;
		long b=x;//Implicit type conversion
		y=(int)b;
		System.out.println(y);

	}
}