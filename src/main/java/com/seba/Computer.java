package com.seba;

public class Computer {
    String name;
    Ram ram;

    public Computer(String name, Ram ram) {
        this.name = name;
        this.ram = ram;
    }

    public Computer() {
    }

    public Ram getRam() {
        return ram;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

