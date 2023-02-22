// Building Java Programs
// Chapter 1 - Excercise 8
// build - Stewie2
//
// outputs Stewie -- but 5 times
//
// //////////////////////
// || Victory is mine! ||
// \\\\\\\\\\\\\\\\\\\\\\
// || Victory is mine! ||
// \\\\\\\\\\\\\\\\\\\\\\
// || Victory is mine! ||
// \\\\\\\\\\\\\\\\\\\\\\
// || Victory is mine! ||
// \\\\\\\\\\\\\\\\\\\\\\
// || Victory is mine! ||
// \\\\\\\\\\\\\\\\\\\\\\

 
public class Stewie2 {
    //setup static method to run multiple times
    public static void stew() {
        System.out.println ("|| Victory is mine! ||");
        System.out.println ("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
    }
    public static void main(String[] args) {
        System.out.println ("//////////////////////");
        stew();
        stew();
        stew();
        stew();
        stew();
    }
}    

