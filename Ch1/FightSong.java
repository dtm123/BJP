// Building Java Programs
// Chapter 1 - Excercise 12
// build - FightSong
//
// outputs:
//
// Go, Team, go!
// You can do it.
//
// Go, Team, go!
// You can do it.
// You're the best,
// In the west.
// Go, Team, go!
// You can do it.
//
// Go, Team, go!
// You can do it.
// You're the best,
// In the west.
// Go, Team, go!
// You can do it.
//
// Go, Team, go!
// You can do it.

public class FightSong {

    public static void go() {
        System.out.println("Go, Team, go!");
        System.out.println("You can do it.");
    }

    public static void west() {
        System.out.println("You're the best,");
        System.out.println("In the west.");
    }

    public static void br() {
        System.out.println();
    }

    public static void chorus() {
        go();
        west();
        go();
        br();
        }

    public static void main(String[] args) {
        go();
        br();
        chorus();
        chorus();
        go();
    }
}

