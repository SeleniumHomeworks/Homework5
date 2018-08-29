package DataStructure;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class Queue {

    public static void main(String[] args) {
        java.util.Queue<String> drinks = new LinkedList<>();

        drinks.add("Cocacola");
        drinks.add("redbull");
        drinks.add("Monster");
        drinks.add("Starbucks shots");

        for(String drink : drinks){

            System.out.println(drink);
        }





    }


}
