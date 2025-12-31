package z_Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

// Array List is a class
public class ArrayListDemo {
    public static void main(String[] args) {
        // declaration for heterogeneous data
         ArrayList mylist = new ArrayList();
         List mylist1 = new ArrayList();

        // for homogeneous data
        ArrayList<Integer> list = new ArrayList<>();

        // to add elememts
        mylist.add(8);
        mylist.add("hello");
        mylist.add("welcome");
        mylist.add(7);
        mylist.add(null);
        mylist.add(7);

        //size of arrayList
        System.out.println("Size of array is : "+ mylist.size());

        // print the arrayList
        System.out.println("elements of arraylist are : ");
        System.out.println(mylist);

        // to remove an item from list
        mylist.remove(3);
        System.out.println("elements of arraylist after removing 3 index  are : ");
        System.out.println(mylist);

        // to insert a elements in middle or between two elements of a list
        mylist.add(4,"i am inserted at 4th index");
        System.out.println("elements of arraylist aer inserting a elements in list are : ");
        System.out.println(mylist);

        // modify / update / replace elements in list
        mylist.set(4,false);
        System.out.println("elements of arraylist after updating 4th element are : ");
        System.out.println(mylist);

        // to access a specific elements of a list -- get()
        System.out.println(mylist.get(4));

        // reading all elements of list  -- 3 ways
        /*
             // 1 .normal for loop
        for (int i = 0; i < mylist.size(); i++) {
            System.out.println(mylist.get(i));
        }
        System.out.println();
            // 2 using for each loop
        for(Object ele : mylist){ // object type qunki daa can be int , boolean , sing .... ya kucx v t unk hold karne k liye
            System.out.println(ele);
        }
         */
             // 3 using iterator
        Iterator<Object> it = mylist.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        // to check arraylist  is empty or not
        System.out.println("Is Array List is empty ? : "+mylist.isEmpty());

        // remove all elements from arrayList
         // single elememtn -- remove() ,, all elememtns  -- clear()
        // to remove multiple elements randomly
        ArrayList removelist = new ArrayList();
        removelist.add(7);
        removelist.add("welcome");
        System.out.println("elements Before multiple removal  : \n"+mylist);

        mylist.removeAll(removelist);
        System.out.println("elements after multiple removal  : ");
        System.out.println(mylist);

    }
}
