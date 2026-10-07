package Hashmap;

import java.util.HashMap;
import java.util.Map.Entry;

public class hashmap {
    public static void main(String[] args) {
        HashMap <String,Integer> map = new HashMap<>();
        map.put("India", 120);
        map.put("China", 150);
        map.put("Us", 30);
        map.put("Uk", 70);

        System.out.println(map);

        System.out.println(map.get("India"));

        map.put("Uk", 80);
        System.out.println(map.get("Uk"));

        System.out.println(map.remove("Us"));
        System.out.println(map);

        // map.putIfAbsentt("Russia", "90");
        // System.out.println(map);

        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.entrySet());

        // tranversing
        for (String key : map.keySet()) {
            System.out.printf("the value are %s and %d \n",key,map.get(key));
        }
        for(Entry<String, Integer> mp : map.entrySet()){
            System.out.printf("the value are %s and %d \n",mp.getKey(),mp.getValue());
        }
        
        for(var e : map.entrySet()){
            System.out.printf("the value are %s and %d \n",e.getKey(),e.getValue());
        }

        HashMap <Integer,Integer> mm = new HashMap<>();
        int[] arr ={1,3,2,2,1,4,1,3,4,2,1,3,4,2,4,3,2,1,4,2,1,4,3,2,3,1,3,3,4,1,3,2,4};
        for(var e : arr){
            if (mm.containsKey(e)) {
                mm.put(e, mm.get(e)+1);
            }else {
                mm.put(e, 1);
            }
        }
        int max=0;
        int key=-1;
        for(var e : mm.entrySet()){
            if(e.getValue()>max){
                max=e.getValue();
                key=e.getKey();
            }
        }
        System.out.println("maximum number repeated is "+key + " and that freq is " +max);
    }
}
