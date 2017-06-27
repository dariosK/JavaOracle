package basisJava.NumberAndStrings;

import java.rmi.MarshalledObject;
import java.util.*;

/**
 * Created by edarkal on 2017-05-12.
 */
public class Excercise3 {



    public static void main(String[] args) {

        Vector<String> anagramVector = new Vector<String>();
        anagramVector.add("software");
        anagramVector.add("swear oft");
        anagramVector.add("parliament");
        anagramVector.add("partial men");

        Map<Character, Integer> anagramLetters1 = createMapsOfAnagramLetters.getMapsOfAnagramLetters(anagramVector.get(0));
        Map<Character, Integer> anagramLetters2 = createMapsOfAnagramLetters.getMapsOfAnagramLetters(anagramVector.get(1));
        Map<Character, Integer> anagramLetters3 = createMapsOfAnagramLetters.getMapsOfAnagramLetters(anagramVector.get(2));
        Map<Character, Integer> anagramLetters4 = createMapsOfAnagramLetters.getMapsOfAnagramLetters(anagramVector.get(3));



        System.out.println(anagramLetters1);
        System.out.println(anagramLetters2);

        if (anagramLetters1.equals(anagramLetters2)) {
            System.out.printf("\"%s\" and \"%s\" ara anagrams", anagramVector.get(0), anagramVector.get(1));
        }
        else {
            System.out.printf("\"%s\" and \"%s\" are not anagrams", anagramVector.get(0), anagramVector.get(1));
        }

        if (anagramLetters3.equals(anagramLetters4)) {
            System.out.printf("\n\"%s\" and \"%s\" ara anagrams", anagramVector.get(2), anagramVector.get(3));
        }
        else {
            System.out.printf("\n\"%s\" and \"%s\" are not anagrams", anagramVector.get(2), anagramVector.get(3));
        }
    }

}
