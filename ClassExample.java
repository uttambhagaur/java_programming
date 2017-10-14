/*
Examples of classes  
*/
class Rect{
	int width,height;
	Rect(int width, int height){
		this.width = width;
		this.height = height;
	}
}

public class ClassExample {
	public static void main(String[] args) {
		Rect a = new Rect(5,7);
		System.out.println("width : "+a.width+ " height : "+a.height);
		Rect b = new Rect(9,12);
		System.out.println("width : "+b.width+" height : "+b.height);
		b=a;
		b.width=50;
		System.out.println(" width : "+a.width);
	}
}