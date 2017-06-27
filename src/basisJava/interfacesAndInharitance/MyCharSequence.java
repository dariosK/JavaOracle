package basisJava.interfacesAndInharitance;

/**
 * Created by edarkal on 2017-03-09.
 */
public class MyCharSequence implements CharSequence {
    private String mySentence;

    public MyCharSequence(String mySentence) {
        this.mySentence = mySentence;
    }

    @Override
    public int length() {
        return this.mySentence.length();
    }

    @Override
    public char charAt(int index) {
        if ((index < 0) || (index >= mySentence.length())) {
            throw new StringIndexOutOfBoundsException(index);
        }
        return this.mySentence.charAt(index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        if (start < 0) {
            throw new StringIndexOutOfBoundsException(start);
        }
        if (end > this.mySentence.length()) {
            throw new StringIndexOutOfBoundsException(end);
        }
        if (start > end) {
            throw new StringIndexOutOfBoundsException(start- end);
        }
        StringBuilder sub = new StringBuilder(mySentence.subSequence(fromEnd(end), fromEnd(start)));
        return sub.reverse();

    }

    private int fromEnd(int i) {
        return mySentence.length() - 1 - i;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder(this.mySentence);
        return s.reverse().toString();
    }

    //Random int from 0 to max. As random() generates values between 0 and 0.9999
    private static int random(int max) {
        return (int) Math.round( Math.random() * (max + 1));
    }

    public static void main(String[] args) {
        MyCharSequence mySeq = new MyCharSequence("Suppose you have written a time server that periodically notifies its clients of the current date and time. Write an interface the server could use to enforce a particular protocol on its clients.");

        for (int i = 0; i< mySeq.length(); i++) {
            System.out.print(mySeq.charAt(i));
        }
        System.out.println();

        int start = random(mySeq.length() - 1);
        int end = random(mySeq.length()-1 - start) + start;
        System.out.println(mySeq.subSequence(start, end));

        System.out.println(mySeq);

    }




}
