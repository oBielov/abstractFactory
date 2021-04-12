package clients;

import abstractFactory.Factory;

public class Main {


    public static final String OS = "Windows";

    public static void main(String[] args) {

        Factory factory = Factory.of();

        factory.createButton().handleButton();
    }


}
