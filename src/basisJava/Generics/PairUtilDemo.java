package basisJava.Generics;

/**
 * Created by edarkal on 2017-05-31.
 */
public class PairUtilDemo {
    public static void main(String[] args) {
        Pair<Integer, String> p1 = new Pair<>(1, "apple");
        Pair<Integer, String> p2 = new Pair<>(2, "pear");
        boolean same = Util.<Integer, String>compare(p1, p2);
        System.out.println(same);
    }
}