package ch_List;

import java.util.*;

public class UpdatingElements {
    public static void main(String[] args) {
        
        List<String> name = new ArrayList<>();

        // Adding the elements
        name.add("Vishal");
        name.add("Singh");
        name.add(1,"Singh");
        System.out.println("Initial Elements: "+name);

        // updating
        name.set(1, "Prasad");
        System.out.println("Updating "+name);
    }
}
