package z_Collections;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public class HashSetDemo {
    public static void main(String[] args) {
    // Declaration -- 3 ways
        // Declaration -- Heterogeneous data
        HashSet myset = new HashSet();
        Set mySet = new HashSet();
        // Declaration -- homogeneous data
        HashSet<String> MySet = new HashSet<String>();

        // add elements in set
        myset.add(100);
        myset.add(10.5);
        myset.add('A');
        myset.add("Welcome");
        myset.add(true);
        myset.add(100);
        myset.add(null);
        myset.add(null); // no error at the time of adding

        // print the set -- order is not preserved
        // duplicate and more than one null is automatically removed
        System.out.println(myset);

        // size of a HashSet
        System.out.println("Size of Hashset : "+myset.size());

        // removing elements
        System.out.println("Before Removing : "+ myset);
        myset.remove(10.5); // directly pass the vale to be removed
        System.out.println("After Removing : "+ myset);

        // we cant insert a element at any specific index similar to list

        // access specific elements directly  ---> not possible
        // convert Hashset to ArrayList and access specific elements
        ArrayList al = new ArrayList(myset);
        System.out.println("Arraylist  : "+al);
        System.out.println(al.get(3));

        // Read All elements from HashSet
        // using normal for loop ---> not possible
            // using for each loop
        for(Object x : myset){
            System.out.println(x);
        }
            // using Iterator
        Iterator<Object> it = myset.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        // clearing all elements from HashSet
        myset.clear();
        System.out.println(myset);
        System.out.println("is it empty ? : "+myset.isEmpty());
    }
}
