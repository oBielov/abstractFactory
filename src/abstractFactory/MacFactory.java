package abstractFactory;

public class MacFactory extends Factory{


    protected MacFactory(){}

    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Scroll createScroll() {
        return new MacScroll();
    }

    @Override
    public Window createWindow() {
        return new MacWindow();
    }
}
