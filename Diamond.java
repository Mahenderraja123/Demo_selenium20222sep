package array;

public class Diamond {

	public static void main(String[] args) {

		int number=4;
		for(int i=0;i<number;i++) { 
			
			for(int j=number-i;j>1;j--) {
				System.out.print(" ");
			}
			
			for(int j=0;j<=i;j++) {
				System.out.print(" *");
			}
			System.out.println();
		}
		
		
		for(int i=0;i<=number-1;i++) {
		
		for(int j=0;j<=i;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<=number-i-1;j++) {
				System.out.print("* ");

			}
			System.out.println();

		}
	}

}
