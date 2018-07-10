package com.thoughtworks.Diamond;

public class Main {
    public static void main(String[] args) throws Exception {
        Diamond diamond = new Diamond();
        diamond.drawIsoscelesTriangle(3);
        diamond.drawDiamond(3);
        diamond.drawDiamondWithName(3,"Bill");
    }
}
