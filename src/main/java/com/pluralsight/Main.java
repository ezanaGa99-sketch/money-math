package com.pluralsight;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        // 1. three variables, all starting at 0
        float floatValue = 0;
        double doubleValue = 0;
        BigDecimal bigDecimalValue = BigDecimal.ZERO;

        // 2. loop 10 times, add ten cents each time
        System.out.println("===== Adding $0.10, 10 times =====");
        for (int i = 1; i <= 10; i++) {
            floatValue += 0.10f;
            doubleValue += 0.10;
            bigDecimalValue = bigDecimalValue.add(new BigDecimal("0.10"));

            System.out.println(i + ")  float: " + floatValue
                    + "   double: " + doubleValue
                    + "   BigDecimal: " + bigDecimalValue);
        }

        // 3. set everything back to 0
        floatValue = 0;
        doubleValue = 0;
        bigDecimalValue = BigDecimal.ZERO;

        // 4. loop 1000 times, add 19.99 each time
        for (int i = 1; i <= 1000; i++) {
            floatValue += 19.99f;
            doubleValue += 19.99;
            bigDecimalValue = bigDecimalValue.add(new BigDecimal("19.99"));
        }

        System.out.println();
        System.out.println("===== Adding $19.99, 1000 times (should be 19990.00) =====");
        System.out.println("float:      " + floatValue);
        System.out.println("double:     " + doubleValue);
        System.out.println("BigDecimal: " + bigDecimalValue);

        // 5. compare them to each other
        System.out.println();
        System.out.println("===== Comparing =====");
        System.out.println("float == double? " + (floatValue == doubleValue));

        BigDecimal doubleAsBigDecimal = new BigDecimal(doubleValue);
        System.out.println("double equals BigDecimal? " + (doubleAsBigDecimal.compareTo(bigDecimalValue) == 0));
    }
}