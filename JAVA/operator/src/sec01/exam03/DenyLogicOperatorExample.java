package sec01.exam03;

public class DenyLogicOperatorExample {
    public static void main(String[] args) {
        boolean play = true;
        System.out.println("play = " + play);

        play= !play;
        System.out.println("play = " + play);

        play = !play;
        System.out.println("play = " + play);

    }
}
