package am.arkadysahakyan.visitorpattern;

public class Main {

    public static void main(String[] args) {
        GameObject player = new Player();
        player.accept(new WelcomePlayer());
    }
}
