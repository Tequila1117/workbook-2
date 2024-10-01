package com.pluralsight.logic;

public class LogicExamples {

    public static void main(String[] args) {
        System.out.println("Hello");

        double area = 10 / 3;
        double remainder = 10 % 3;

        area = (double) 10 / 3;

        System.out.println( area );
        System.out.println( remainder );

        // Arithmetic operators
        // + = / * %
        // Increment/Decrements
        // ++ --

        area = area + 1;
        System.out.println (area);

        area ++;
        System.out.println(area++);

        System.out.println(++ area + area ++ + remainder ++);

        System.out.println(area); // 8.33
        System.out.println(remainder); // 2.0

        float x = (float) remainder;
        System.out.println(x); // 2.0

        float y = 7.99f;
        System.out.println(y);

        double z = 8.33f;
        System.out.println(z);

        System.out.printf("%,2f\n", z);
        System.out.println(z); // what value prints here?

          // Comparison operators
        // == != < > >= <= !

        boolean amIDone = false;
        int counter = 0;
        do {
            System.out.println("taliking.... words...");
            if ( counter++ == 5 ) amIDone = true;
        } while ( counter != 5 );
        {
            System.out.println(counter);
            counter++;
        }

        for (int i=0; i<5; i++) {
            System.out.println("Talking...");
        }

        if (counter > 0) {
            System.out.println("We talked about it");
        }

    }

}
