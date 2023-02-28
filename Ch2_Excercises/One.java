// Building Java Programs
// Chapter 2 - Excercise 1
// build a program to calculate the position s
// s is a body in motion
// at a given time t
// based on initial position s0
// initial velocity v0
// rate of accelleration a
// 
// formula:  s = s0 + v0 + (a *t^2) / 2
//

// ? package Ch2_Excercises;

public class One {

    public static void main(String[] args) {
        calculateS();
    }

    public static void calculateS() {
        int s0 = 10;
        int v0 = 5;
        int a = 1;
        int t = 2;
        double s = s0 + v0 * t + .5 * a * t * t;
        System.out.println(s);
    }
}
