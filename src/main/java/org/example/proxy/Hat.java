package org.example.proxy;

public class Hat implements HatInterface {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void pullOutName() {
        System.out.println("name = " + name);
    }
}
