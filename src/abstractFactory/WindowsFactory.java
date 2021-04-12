package abstractFactory;

public class WindowsFactory extends Factory {


    protected WindowsFactory(){}

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Scroll createScroll() {
        return new WindowsScroll();
    }

    @Override
    public Window createWindow() {
        return new WindowsWindow();
    }
}
