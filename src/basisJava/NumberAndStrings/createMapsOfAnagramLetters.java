package basisJava.NumberAndStrings;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by edarkal on 2017-05-12.
 */
public class createMapsOfAnagramLetters {

    public static Map<Character, Integer> getMapsOfAnagramLetters(String anagram) {

        Map<Character, Integer> anagramLetters = new HashMap<>();
        for (int i = 0; i < anagram.length(); i++) {
            char ch = anagram.charAt(i);
            if (Character.isLetter(ch)) {
                if (anagramLetters.containsKey(ch)) {
                    anagramLetters.put(ch, anagramLetters.get(ch) +1 );
                }
                else {
                    anagramLetters.put(ch, 1);
                }
            }

        }

        return anagramLetters;
    }

}
