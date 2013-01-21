/*
 * Copyright 2013 Stephen Asbury
 * Released under the MIT license
 * http://opensource.org/licenses/MIT
 */
import java.util.*;
import java.text.*;

public class NumberStyleExample
{
    public static void main(String args[])
    {
        int[] tests = {-10,-4,0,1,4,5,9,10,22,27,41,49,50,75,91,100,350,450,500,990,1000,1564,4990,10000};
        int test;
        Random rand = new Random();

        System.out.println();
        System.out.println("1-100");
        for(int i=0;i<101;i++)
        {
            test = i;
            System.out.print(""+test);
            System.out.print("\t"+NumberStyle.convertToAlpha(test));
            System.out.print("\t"+NumberStyle.convertToLittleAlpha(test));
            System.out.print("\t"+NumberStyle.convertToBigRoman(test) );
            System.out.print("\t"+NumberStyle.convertToLittleRoman(test) );
            System.out.print("\t"+NumberStyle.convertToEnglish(test) );
            System.out.println();
        }

        System.out.println("Semi-random numbers");
        for(int i=0;i<tests.length;i++)
        {
            test = tests[i];
            System.out.print(""+NumberFormat.getNumberInstance().format(test));
            System.out.print("\t"+NumberStyle.convertToAlpha(test));
            System.out.print("\t"+NumberStyle.convertToLittleAlpha(test));
            System.out.print("\t"+NumberStyle.convertToBigRoman(test) );
            System.out.print("\t"+NumberStyle.convertToLittleRoman(test) );
            System.out.print("\t"+NumberStyle.convertToEnglish(test) );
            System.out.println();
        }

        System.out.println("Size tests");
        for(int i=0;i<20;i++)
        {
            test = Math.abs(rand.nextInt(Integer.MAX_VALUE));
            System.out.print(""+NumberFormat.getNumberInstance().format(test));
            System.out.print(" "+NumberStyle.convertToReadableMemorySize(test) );
            System.out.print(" "+NumberStyle.convertToEnglish(test) );
            System.out.println();
        }
    }
}
