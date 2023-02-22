// CS210 3884 SU 2022 TESTING
// Dan West
// This code tests some output

public class WorkIt {
    public static void work1() { //makes the line
        System.out.println ("All work and no play makes Jack a dull boy.");
	}
	
	public static void work2() { //outputs 5x = 5 times
		work1();
		work1();
		work1();
		work1();
		work1();
	}
	
	public static void work3() { //outputs 5x5x = 25 times
		work2();
		work2();
		work2();
		work2();
		work2();
	}

	public static void work4() { //outputs 5x5x5x = 125 times
		work3();
		work3();
		work3();
		work3();
		work3();
	}

	public static void work5() { //outputs 5x5x5x4x = 500 times
		work4();
		work4();
		work4();
		work4();
	}

	public static void workIt() { //outputs 5x5x5x4x2x = 1000 times
		work5();
		work5();
	}

	public static void main(String[] args) {
		workIt();
	}

}