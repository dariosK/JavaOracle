package basisJava.interfacesAndInharitance;

/**
 * Created by edarkal on 2017-03-17.
 */
public class MaxVariablesDemo {
    public static void main(String args[]) {

        //integers
        byte largestByte = Byte.MAX_VALUE;
        short largestShort = Short.MAX_VALUE;
        int largestInteger = Integer.MAX_VALUE;
        long largestLong = Long.MAX_VALUE;

        //real numbers
        float largestFloat = Float.MAX_VALUE;
        double largestDouble = Double.MAX_VALUE;

        //other primitive types
        char aChar = 'S';
        boolean aBoolean = true;

        //Display them all.
        System.out.println("The largest byte value is "
                + largestByte + ".");
        System.out.println("The largest short value is "
                + largestShort + ".");
        System.out.println("The largest integer value is "
                + largestInteger + ".");
        System.out.println("The largest long value is "
                + largestLong + ".");

        System.out.println("The largest float value is "
                + largestFloat + ".");
        System.out.println("The largest double value is "
                + largestDouble + ".");

        if (Character.isUpperCase(aChar)) {
            System.out.println("The character " + aChar
                    + " is uppercase.");
        } else {
            System.out.println("The character " + aChar
                    + " is lowercase.");
        }
        System.out.println("The value of aBoolean is "
                + aBoolean + ".");

        System.out.println();
        for (int i =0; i<50; i++) {
            System.out.print("=");
        }
        System.out.println();

        //integers
        byte lowestByte = Byte.MIN_VALUE;
        short lowestShort = Short.MIN_VALUE;
        int lowestInteger = Integer.MIN_VALUE;
        long lowestLong = Long.MIN_VALUE;

        //real numbers
        float lowestFloat = Float.MIN_VALUE;
        double lowestDouble = Double.MIN_VALUE;


        //Display them all.
        System.out.println("The lowest byte value is "
                + lowestByte + ".");
        System.out.println("The lowest short value is "
                + lowestShort + ".");
        System.out.println("The lowest integer value is "
                + lowestInteger + ".");
        System.out.println("The lowest long value is "
                + lowestLong + ".");

        System.out.println("The lowest float value is "
                + lowestFloat+ ".");
        System.out.println("The lowest double value is "
                + lowestDouble + ".");
    }
}
