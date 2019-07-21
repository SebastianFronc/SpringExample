package com.seba;

public class ZadOne {

    private int numerOne;
    private int numberTwo;

    public ZadOne(int numerOne, int numberTwo) {
        this.numerOne = numerOne;
        this.numberTwo = numberTwo;
    }

    public ZadOne() {
    }

    public int getNumerOne() {
        return numerOne;
    }

    public void setNumerOne(int numerOne) {
        this.numerOne = numerOne;
    }

    public int getNumberTwo() {
        return numberTwo;
    }

    public void setNumberTwo(int numberTwo) {
        this.numberTwo = numberTwo;
    }

    public int addTwoNumbers(){
        return this.numerOne+ this.numberTwo;
    }
}
