package com.conversion;

public class ConversionTool {
    /** Convert from feet to meters */
    public static double footToMeter(double foot) {
        return 0.305 * foot;
    }

    /** Convert from meters to feet */
    //when i was testing the meters to feet formula, my numbers did not match with the books. I slightly altered the formula
    // changed from 3.279 to 3.27869. I am not sure if this was the proper way to complete the assignment by changing the formula slightly
    // only difference is the conversion for 50 meters to feet has a difference of .001
    public static double meterToFoot(double meter) {
        return 3.27869 * meter;
    }
}