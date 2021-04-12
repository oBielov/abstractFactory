package abstractFactory;

public class LinuxScroll implements Scroll {

    @Override
    public void handleScroll() {
        System.out.println("Linux Scroll!");
    }
}
