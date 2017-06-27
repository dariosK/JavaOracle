package basisJava.NumberAndStrings;

import java.util.ArrayList;
import java.util.FormatFlagsConversionMismatchException;
import java.util.List;

/**
 * Created by edarkal on 2017-03-17.
 */
public class ValueOfDemo {
    public static void main(String[] args) {

        // this program requires two
        // arguments on the command line
        if (args.length >= 2) {
            // convert strings to numbers
            //float[] aVar = new  float[args.length];
            ArrayList<Float> aVar = new ArrayList<Float>();
            float a;
            float b;

            for (int i = 0; i < args.length; i++) {
                a = (Float.valueOf(args[i])).floatValue();
                aVar.add(a);
            }
            // do some arithmetic
            float sum = 0;
            float diff = 0;
            float mult = 1;

            for (float item: aVar) {
                sum += item;
                diff -= item;
                mult *= item;
            }

            System.out.format("a + b = %.2f%n",
                    sum);
            System.out.println("a - b = " +
                    diff);
            System.out.println("a * b = " +
                    mult);
            System.out.println("a / b = " +
                    (aVar.get(0) / aVar.get(1)));
            System.out.println("a % b = " +
                    (aVar.get(0) % aVar.get(1)));
        } else {
            System.out.println("This program " +
                    "requires two command-line arguments.");
        }
    }
}