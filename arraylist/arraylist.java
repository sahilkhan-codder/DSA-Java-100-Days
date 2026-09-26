package arraylist;
import java.util.ArrayList;
import java.util.Collections;

public class arraylist {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<Integer>();       
        ArrayList <String> list2 = new ArrayList<String>();       
        ArrayList <Boolean> list3 = new ArrayList<Boolean>();       
    

        // add elements 
        list.add(397);
        list.add(445);
        list.add(323);

        // to print the arraylist
        System.out.println(list);

        // to get the value 
        int element = list.get(2);
        System.out.println("element is "+element);

        //to all elment in between
        list.add(1,999);
        System.out.println("added elements are "+list);

        // set/chnage the elemt
        list.set(0, 878);
        System.out.println("elemnt changed "+list);

        // remove /delete 
        list.remove(1);
        System.out.println("remove one element "+list);

        // sorting 
        Collections.sort(list);
        System.out.println("sorted :"+list);
    }
}
