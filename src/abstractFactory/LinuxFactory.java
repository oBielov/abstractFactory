package abstractFactory;

public class LinuxFactory extends Factory{


    protected LinuxFactory(){}

    @Override
    public Button createButton() {
        return new LinuxButton();
    }

    @Override
    public Scroll createScroll() {
        return new LinuxScroll();
    }

    @Override
    public Window createWindow() {
        return new LinuxWindow();
    }
}
