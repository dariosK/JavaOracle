package basisJava.NumberAndStrings;

import java.text.*;
/**
 * Created by edarkal on 2017-03-10.
 */
public class DecimalFormatDemo {

    static public void customFormat(String pattern, double value) {
        DecimalFormat myFormatter = new DecimalFormat(pattern);
        String output = myFormatter.format(value);
        System.out.println(value + " " + pattern + " " + output);
    }

    public static void main(String[] args) {
        customFormat("###,###.###", 123456.789);
        customFormat("###.##", 123456.789);
        customFormat("000000.000", 123.789);
        customFormat("$###,###.###", 12345.67);
    }
}
