/*
Encapsulation is done by Access modifiers
Public : everywhere
private : only with in class
protected , default

Here we use Getter and Setter
*/
class Encapsulated{
	private int width;
		private int height;
		Encapsulated(int width, int height){
			this.width = width;
			this.height = height;

		}
		public int getWidth(){
			return this.width;
		}

		public int getHeight(){
			return this.height;
		}

		public void setWidth(int width){
			this.width = width;
		}

		public void setHeight(int height){
			this.height = height;
		}
}
public class EncapsulationExample{
	public static void main(String[] args) {
Encapsulated a = new Encapsulated(8,2);
System.out.println(a.getWidth());
System.out.println(a.getHeight());

	}
}