package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListExample {


    public static void main(String[] args) {


        ArrayList<String> list = new ArrayList<>();
        System.out.println(list.isEmpty());

        list.add("Deepak");
        list.add("Krishna");
        list.add("Rahul");
        list.add("Rahul");
        list.add("Ram");
        list.add("Nagendar");
        System.out.println(list.isEmpty());
        System.out.println(list);

        Collections.sort(list);

        System.out.println(list);


        for (int i =0 ; i< list.size(); i++) {
        }


        for (String s : list) {
            System.out.println(s);
        }

        System.out.println(list);

        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()) {
            iterator.next();
            iterator.remove();
        }

        System.out.println(list);






    }
}
