package ch_List;

import java.util.ArrayList;
import java.util.List;

public class ListDemo1 {
    public static void main(String[] args) {
       
        List<Integer> i = new ArrayList<>();
        i.add(20);
        i.add(10);
        i.add(15);

        i.add(1,50);
    }
}
