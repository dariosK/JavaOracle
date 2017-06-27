package basisJava.Generics;

/**
 * Created by edarkal on 2017-06-02.
 */
public class EffectTypeErasure {
    public static void main(String[] args) {
        MyNode mn = new MyNode(5);
        //Node n = (MyNode) mn;   //A raw type - compiler throws an unchecked warning
        //n.setData("Hellp");
        //Integer x = (String) mn.data;   //Causes a ClassCastException to be thrown.
    }
}
