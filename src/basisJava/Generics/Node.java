package basisJava.Generics;

/**
 * Created by edarkal on 2017-06-02.
 */
public class Node<T> {

    public T data;

    public Node(T data) {this.data = data; }

    public void setData(T data) {
        System.out.println("Node.setData");
        this.data = data;
    }
}
