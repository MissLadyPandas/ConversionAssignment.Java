package com.conversion;

public class ConversionTest {

    public static void main(String[] args) {
        // Print the headers
        System.out.printf("%-10s%-10s|%10s%10s\n", "Feet", "Meters", "Meters", "Feet");
        System.out.println("- - - - - - - - - - - - - - - - - - - - - ");

        // Loop through the values and print the conversions in parallel
        for (int i = 1, j = 20; i <= 10; i++, j+=5) {
            System.out.printf("%-10.1f%-10.3f|%10.1f%10.3f\n", (double)i, ConversionTool.footToMeter(i), (double)j, ConversionTool.meterToFoot(j));
        }
    }
}
