package abstractFactory;

public class MacButton implements Button{
    @Override
    public void handleButton() {
        System.out.println("Mac Button!");
    }
}
