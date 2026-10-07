package Hashmap;
import java.util.HashSet;
import java.util.Iterator;

public class Hashset {
    public static void main(String[] args) {
        HashSet <Integer> set =new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(20);
        set.add(69);
        if (set.contains(10)) {
            System.out.println("Set contains the 10");
        }
        set.remove(69);
        if(!set.contains(69)){
            System.out.println("set removed the 69 element in the set");
        }
        System.out.println(set);
        // traversing
        Iterator it= set.iterator();
        while (it.hasNext()) {
            System.out.print(it.next()+ " ");
        }

    }
}
