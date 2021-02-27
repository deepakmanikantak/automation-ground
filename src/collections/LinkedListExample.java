package collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {

    public static void main(String[] args) {
        LinkedList<String> linkedList  = new LinkedList<>();

        long s1 = System.currentTimeMillis();



        linkedList.addFirst("Deepak");
        linkedList.addLast("Manikanta");

        Iterator iterator = linkedList.descendingIterator();

        for (long i = 0; i< 1000000000 ; i++) {
            linkedList.add("1");
        }

        long s2 = System.currentTimeMillis();

        System.out.println(s2-s1);
    }

}
