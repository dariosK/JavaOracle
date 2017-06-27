package basisJava.Generics;

/**
 * Created by edarkal on 2017-05-31.
 */

public class Util {
    public static <K, V> boolean compare(Pair<K, V> p1, Pair<K,V> p2) {
        return p1.getKey().equals(p2.getKey()) &&
                p1.getValue().equals(p2.getValue());
    }
}
