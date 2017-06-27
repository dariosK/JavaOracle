package basisJava.interfacesAndInharitance;

/**
 * Created by edarkal on 2017-04-04.
 */
public class PalindromDemo
{
    public static void main(String[] args) {
        String palindrom = "Dot saw I was Tod";
        int len = palindrom.length();
        char[] tempCharArray = new char[len];
        char[] charArray = new char[len];

        //put original string in an array of chars

        for (int i = 0; i<len ; i++){
            tempCharArray[i] = palindrom.charAt(i);
        }

        for (int i = 0; i < len; i++) {
            charArray[i] = tempCharArray[len - 1 - i];
        }

        String reverseString = new String(charArray);
        System.out.println(reverseString);
    }
}
