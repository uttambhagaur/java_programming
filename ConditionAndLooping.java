/*
Condions, Logic, looping and Array
*/
public class ConditionAndLooping {
	public static void main(String[] args) {
		int[] arr= {1,3,4,6,7};
	
		for (int x : arr) {
			System.out.print(x+" ");
		}
		int x=10;
		if (x>9) {
			System.out.println("X is grator than 9");
		}
		else {
			System.out.println("X is less than 9");
		}

		for(int i=0; i<10;i++){
			for (int j=0;j<10 ;j++ ) {
				
				if (i<j)	
				System.out.print("*");	
				continue;
			}
			System.out.println();
		}
		for(int i=0; i<10;i++){
			for (int j=0;j<10 ;j++ ) {
				
				if (j<i)	
				System.out.print("*");	
				continue;
			}
			System.out.println();
		}
	}
}