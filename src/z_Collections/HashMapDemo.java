package z_Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;


public class HashMapDemo {
    public static void main(String[] args) {

        // Declaration -- all datatypes
        HashMap hMap = new HashMap();
        Map mymap = new HashMap();

        // Declaration for specific datatypes
        HashMap<Integer,String> hmap = new HashMap<>();

        // to add the pairs toh hashMap
        hmap.put(101,"John");
        hmap.put(102,"Scott");
        hmap.put(103,"mary");
        hmap.put(104,"Scott");
        hmap.put(102,"David");

        // to print the hashmap
        System.out.println(hmap);

        // size of hashmap
        System.out.println("size  of hashmap is "+hmap.size());

        // remove a pair
        hmap.remove(103) ; // 103 is key of the pair
        System.out.println("after removing a pair : "+hmap);

        // access value of the any specific key
        System.out.println(hmap.get(102));

        // to access all keys
        System.out.println(hmap.keySet());
        // to access all values
        System.out.println(hmap.values());
        // to access both together
        System.out.println(hmap.entrySet());

        //to update value of a key --- use put() method only

        // reading data from hashMap
            // using for each loop
        for(int k : hmap.keySet()){
            System.out.println(k+"   "+hmap.get(k));
        }

            // using iterator
        Iterator<Entry<Integer,String>> it = hmap.entrySet().iterator();
        while(it.hasNext()){
            Entry<Integer,String> entry = it.next();
            System.out.println(entry.getKey()+" "+entry.getValue());
        }

        // to clear hashMap --> clear()
        hmap.clear();
        System.out.println(hmap.isEmpty());
    }
}
