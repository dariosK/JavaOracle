package basisJava.Generics;

import java.util.Arrays;
import java.util.List;

/**
 * Created by edarkal on 2017-06-02.
 */
public class UnboundedWildcards {

    public static void printList(List<?> list) {
        for (Object elem : list) {
            System.out.print(elem + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(1,2,3);
        List<String> ls = Arrays.asList("one", "two", "three");
        printList(li);
        printList(ls);
    }
}