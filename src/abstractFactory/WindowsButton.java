package abstractFactory;

public class WindowsButton implements Button{

    @Override
    public void handleButton() {
        System.out.println("Windows Button!");
    }
}
