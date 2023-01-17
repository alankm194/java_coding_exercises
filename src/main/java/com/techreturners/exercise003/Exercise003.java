package com.techreturners.exercise003;

import java.util.Arrays;

public class Exercise003 {
    private String[] iceCreamArray;
    public Exercise003() {
        this.iceCreamArray = iceCreamFlavours();
    }
    int getIceCreamCode(String iceCreamFlavour) {
        int iceCreamCode =  Arrays.asList(iceCreamArray).indexOf(iceCreamFlavour);
        return iceCreamCode;
    }

    String[] iceCreamFlavours() {
        String[] flavours = { "Pistachio", "Raspberry Ripple", "Vanilla", "Mint Chocolate Chip", "Chocolate", "Mango Sorbet" };
        return flavours;
    }

}
