package basisJava.NumberAndStrings;

/**
 * Created by edarkal on 2017-05-12.
 */
public class Excercise2 {

    public static void main(String[] args) {
        String fullname = "Dariusz Kalicinski";

        char firstInitial = fullname.trim().charAt(0);
        char secondInitial = fullname.trim().charAt(fullname.trim().indexOf(" ")+1);

        System.out.printf("My initials: %s.%s.", firstInitial, secondInitial );
    }
}
