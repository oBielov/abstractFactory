package abstractFactory;

public class LinuxWindow implements Window{
    @Override
    public void handleWindow() {
        System.out.println("Linux Window!");
    }
}
