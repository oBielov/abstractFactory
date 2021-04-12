package abstractFactory;

public class WindowsScroll implements Scroll{
    @Override
    public void handleScroll() {
        System.out.println("Windows Scroll!");
    }
}
