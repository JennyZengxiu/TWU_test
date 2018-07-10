package com.thoughtworks.Triangle;

public class Triangle {

    public void printOneAsterisk(){
        System.out.println("*");
    }

    public void drawHorizontalLine(Integer number){
        for (int i = 0; i < number ; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }

    public void drawVerticalLine(Integer number){
        for (int i = 0; i < number; i++) {
            System.out.println("*");
        }
    }

    public void drawRightTrangle(Integer number){
        for (int i = 0; i < number; i++) {
            for (int j = i+1; j > 0; j--){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

}
