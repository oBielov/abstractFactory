package abstractFactory;

public class LinuxButton implements Button{

    @Override
    public void handleButton() {
        System.out.println("Linux Button!");
    }
}
