package am.arkadysahakyan.visitorpattern;

public class WelcomePlayer implements PlayerVisitor {
    @Override
    public void visit(Player obj) {
        System.out.println(obj.toString() + " " + "welcome" + "!");
    }
}
