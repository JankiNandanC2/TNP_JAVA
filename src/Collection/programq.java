package Collection;

import java.util.ArrayList;

public class programq {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(55);
        list.add(5);
        list.add(599);
        list.add(44);
        System.out.println(list);
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        for(int ele : list){
            System.out.print(ele+" ");
        }

    }
}
