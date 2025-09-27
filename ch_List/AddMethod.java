package ch_List;

import java.util.*;

public class AddMethod {
    public static void main(String[] args) {
        
        // add() method:
        // This method used add the elements at the end;

        List<Integer> li = new ArrayList<>();
        li.add(10);
        li.add(20);
        li.add(30);
        li.add(40);
        System.out.println(li);

        //add(int index, Object obj);
        // this method is used to add the elements at the specific
        li.add(2,50);
        System.out.println(li);
    }
}
