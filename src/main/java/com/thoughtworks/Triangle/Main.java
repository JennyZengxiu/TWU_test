package com.thoughtworks.Triangle;

public class Main {
    public static void main(String[] args) throws Exception {
       Triangle triangle = new Triangle();
       triangle.printOneAsterisk();
       triangle.drawHorizontalLine(8);
       triangle.drawVerticalLine(3);
       triangle.drawRightTrangle(3);
    }
}
