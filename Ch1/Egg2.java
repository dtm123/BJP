public class Egg2 {

    public static void top() {
        System.out.println("  _______  ");
        System.out.println(" /       \\ ");
        System.out.println("/         \\");
    } 

    public static void mid() {
        System.out.println("-\"-'-\"-'-\"-");
    }    

    public static void bot() {
        System.out.println("\\         /");
        System.out.println(" \\_______/");
    }

    public static void main(String[] args) {
        top();
        bot();
        System.out.println();
        mid();
        top();
        bot();
        System.out.println();
        mid();
        bot();
        top();
        mid();
        bot();
    }
}
