// CS210 3884 SU 2022 TESTING
// Dan West
// This code tests some output

public class Test {
//	public static final int SIZE = 9;
	
	public static void main(String[] args) {
		for (int line = 1; line <= 6; line++) {
			for (int bs = 1; bs <= (line*2-2); bs++) {
				System.out.print("\\");
			}
			
		for (int bang =1; bang <=(26-4*line); bang++) {
			System.out.print("!");
		}
		
		for (int fs = 1; fs <= (line*2-2); fs++) {
			System.out.print("/");
		}
		System.out.println("");
		}	
	}
}