package basisJava.NumberAndStrings;

/**
 * Created by edarkal on 2017-05-12.
 */
public class StringBuilderDemo {
    public static void main(String[] args) {
        String palindrom = "Dot saw I was Tod";

        StringBuilder sb = new StringBuilder(palindrom);

        sb.reverse();

        System.out.println(palindrom);
        System.out.println(sb);
    }
}
