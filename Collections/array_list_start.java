import java.util.*;

class array_list_start {
    public static void main(String[] args) {
        ArrayList<String> arr_list = new ArrayList<>();

        // add the element
        arr_list.add("apple");
        arr_list.add("banana");
        arr_list.add("mango");

        for (String el : arr_list) {
            System.out.println(el);
            
        }

    }
}