// CS210 3884 SU 2022 TESTING
// Dan West
// This code tests some output

public class NoPlay {
    public static void work1() { //makes the line
        System.out.println ("All work and no play makes Jack a dull boy.");
	}
	
	public static void work2() { //outputs 10x
		work1();
		work1();
		work1();
		work1();
		work1();
		work1();
		work1();
		work1();
		work1();
		work1();
	}
	
	public static void work3() { //outputs 10x10x
		work2();
		work2();
		work2();
		work2();
		work2();
		work2();
		work2();
		work2();
		work2();
		work2();
	}

	public static void workIt() { //outputs 10x10x10x
		work3();
		work3();
		work3();
		work3();
		work3();
		work3();
		work3();
		work3();
		work3();
		work3();
	}

	public static void main(String[] args) {
		workIt();
	}
}