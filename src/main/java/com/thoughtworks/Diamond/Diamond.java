package com.thoughtworks.Diamond;

public class Diamond {
    public void drawHorizontalLine(Integer number){
        for (int i = 0; i < number; i++) {
            System.out.print("* ");
        }
        System.out.println();
    }

    public void printBlank(Integer count){
        for (int i = 0; i < count ; i++) {
            System.out.print(" ");
        }
    }

    public void drawIsoscelesTriangle(Integer number){
        for (int i = 1,j = 1; i <= number ; i++,j = j + 2) {
            printBlank(number - i);
            drawHorizontalLine(j);
        }
    }

    public void drawDiamond(Integer number){
        int countDiamond = 1;
        for (int i = 1; i <= number ; i++,countDiamond = countDiamond + 2) {
            printBlank(number - i);
            drawHorizontalLine(countDiamond);
        }
        for (int i = number -1 ,j = countDiamond - 4; i > 0 ; i--,j = j - 2) {
            printBlank(number - i);
            drawHorizontalLine(j);
        }
    }

    public void drawDiamondWithName(Integer number ,String name){
        int countDiamond = 1;
        for (int i = 1; i < number ; i++,countDiamond = countDiamond + 2) {
            printBlank(number - i);
            drawHorizontalLine(countDiamond);
        }
        System.out.println(name);
        for (int i = number -1 ,j = countDiamond - 2 ; i > 0 ; i--,j = j - 2) {
            printBlank(number - i);
            drawHorizontalLine(j);
        }
    }
}
