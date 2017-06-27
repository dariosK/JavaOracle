package basisJava.Generics;

/**
 * Created by edarkal on 2017-06-01.
 */

public class BoxDemo {

    public static <U> void addBox(U u,
                                  java.util.List<Box<U>> boxes) {
        Box<U> box = new Box<U>();
        box.set(u);
        boxes.add(box);
    }

    public static <U>  void outputBoxes(java.util.List<Box<U>> boxes) {
        int counter = 0;
        for (Box<U> box : boxes) {
            U boxContent = box.get();
            System.out.println("Box #" + counter + " contains {" + boxContent.toString() + "}");
            counter++;
        }
    }

    public static void main(String[] args) {
        java.util.ArrayList<Box<Integer>> listOfIntegerBoxes =
                new java.util.ArrayList<>();
        BoxDemo.<Integer>addBox(Integer.valueOf(10), listOfIntegerBoxes);
        BoxDemo.<Integer>addBox(20, listOfIntegerBoxes);
        BoxDemo.<Integer>addBox(30, listOfIntegerBoxes);
        BoxDemo.outputBoxes(listOfIntegerBoxes);
    }
}
