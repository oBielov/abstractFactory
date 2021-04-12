package abstractFactory;

import static clients.Main.OS;

public abstract class Factory {


    private static Factory factory;

    //lazy init
    public static Factory of(){

        if (factory == null) factory = init(OS);

        return factory;

    }

    private static Factory init(String os){

        switch (os){
            case("Windows") : return new WindowsFactory();
            case("Linux") : return new LinuxFactory();
            case("Mac") : return new MacFactory();
            default : throw new RuntimeException("Unsupported OS");
        }

    }

    public abstract Button createButton();
    public abstract Scroll createScroll();
    public abstract Window createWindow();


}
