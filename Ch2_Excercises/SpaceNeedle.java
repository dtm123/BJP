// CS210 3884 SU 2022 Assignment #2 "Space Needle"
// Dan West
// Outputs an ASCII space needle

public class SpaceNeedle {
	public static final int SIZE = 4;

    public static void main(String[] args) {
		drawSpaceNeedle();
    }
	
	//prints the thin part of the pole and the tip of the space needle based on SIZE
	public static void pole(){
		for (int q = 1; q <= (SIZE); q++) {
			for (int j = 1; j <= (SIZE*3); j++) {
				System.out.print(" ");
			}
			System.out.println("||");
		}
	}
	
	//prints the top and base of the space needle based on SIZE
	public static void top() {
		for (int i = 1; i <= (SIZE); i++) {
			for (int j = 1; j <= (SIZE*3-i*3); j++) {
				System.out.print(" ");
			}
			System.out.print("__/");
			for (int k = 1; k <= (i-1); k++) {
				System.out.print(":::");
			}
			System.out.print("||");
			for (int l = 1; l <= (i-1); l++) {
				System.out.print(":::");
			}
			System.out.println("\\__");
		}
		System.out.print("|");
		for (int m = 1; m <= (SIZE*6); m++) {
			System.out.print("\"");
		}
		System.out.println("|");
	}
	
	//prints the bottom of the top of the space needle based on SIZE
	public static void bottom() {
		for (int i = 1; i <= (SIZE); i++) {
			for (int j = 1; j <= (i*2-2); j++) {
				System.out.print(" ");
			}
			System.out.print("\\_/");
			for (int k = 1; k <= (SIZE*3-2*i); k++) {
				System.out.print("\\/");
			}
			System.out.println("\\_/");
		}
	}
	
	//prints the thick part of the pole of the space needle based on SIZE
	public static void mid() {
		for (int i = 1; i <= (SIZE*SIZE); i++) {
			for (int j = 1; j <= (2*SIZE+1); j++) {
				System.out.print(" ");
			}
			System.out.print("|");
			for (int k = 1; k <= (SIZE-2); k++) {
				System.out.print("%");
			}
			System.out.print("||");
			for (int l = 1; l <= (SIZE-2); l++) {
				System.out.print("%");
			}
			System.out.println("|");
		}
	}
			
	//orders the various sections of the space needle based on the previously created methods
    public static void drawSpaceNeedle() {
        pole();
		top();
		bottom();
		pole();
		mid();
		top();
    }
}
