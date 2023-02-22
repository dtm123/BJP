// CS210 3884 SU 2022 Chapter #1 Excercies #11
// Dan West
// This code outputs 2 ascii rockets

public class TwoRockets {
    public static void top() {
        System.out.println ("   /\\       /\\");
        System.out.println ("  /  \\     /  \\");
        System.out.println (" /    \\   /    \\");
	}

	public static void main() {
		main1();
		main2();
		main2();
		main1();
	}

	public static void main1() {
		System.out.println ("+------+ +------+");
	}

	public static void main2() {
		System.out.println ("|      | |      |");
	}
	
	public static void usa() {
        System.out.println ("|United| |United|");
		System.out.println ("|States| |States|");
	}
	
	public static void main(String[] args) {
		top();
		main();
		usa();
		main();
		top();
	}
}
