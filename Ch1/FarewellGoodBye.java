// Building Java Programs
// Chapter 1 - Excercise 17
// build - FarewellGoodBye
//
// outputs:
//
/*

Farewell,
goodbye,
au revoir,
good night!
It's time, to go,
and I'll be out of sight!

Farewell,
goodbye,
au revoir,
take care!
I'll say, goodbye,
that's neither here nor there!

Farewell,
goodbye,
au revoir,
see you later!
I hope, you think,
I'm a lover, not a hater!

*/
// 


public class FarewellGoodBye {
    public static void main(String[] args) {
        v1();
        v2();
        v3();
    }
    
    public static void chorus() {
        System.out.println("Farewell,");
        System.out.println("goodbye,");
        System.out.println("au revoir,");
    }

    public static void v1() {
        chorus();
        System.out.println("good night!");
        System.out.println("It's time, to go,");
        System.out.println("and I'll be out of sight!");
        System.out.println();
    }

    public static void v2() {
        chorus();
        System.out.println("take care!");
        System.out.println("I'll say, goodbye,");
        System.out.println("that's neither here nor there!");
        System.out.println();
    }

    public static void v3() {
        chorus();
        System.out.println("see you later!");
        System.out.println("I hope, you think,");
        System.out.println("I'm a lover, not a hater!");
        System.out.println();
    }


}
