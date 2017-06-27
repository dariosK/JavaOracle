package basisJava.NumberAndStrings;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by edarkal on 2017-05-12.
 */
public class Excercise1 {
    public static void main(String[] args) {
        String hi = "Hi, ";
        String mom = "mom.";
        Map<String, String> himom = new HashMap<>();

        himom.put("himom1", hi + mom);
        himom.put("himom2", hi.concat(mom));
        //himom.put("himom3", new StringBuilder(hi).append(new StringBuilder(mom)));

        StringBuilder hiBuilder = new StringBuilder(hi);
        StringBuilder momBuilder = new StringBuilder(mom);

        himom.put("himom4", hiBuilder.append(mom).toString());

        for (Map.Entry<String, String> entry: himom.entrySet()
             ) {
            String key = entry.getKey();
            String value = entry.getValue();

            System.out.println(key + " : " + value);
        }

        StringBuilder himom3 = new StringBuilder(hi).append(new StringBuilder(mom));
        System.out.println("himom3 : " + himom3);

    }
}
