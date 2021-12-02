package com.company;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkListDemo {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Java");
        linkedList.add("php");
        linkedList.add(0,"c++");
        linkedList.remove(0);
        linkedList.add("python");

        linkedList.forEach(lang -> System.out.println(lang));

        for (int i = 0;i<linkedList.size();i++){
            System.out.println(linkedList.get(i));
        }

        System.out.println(linkedList.lastIndexOf("php"));
        for (Iterator<String> iterator = linkedList.iterator();iterator.hasNext();){
            System.out.println(iterator.next());
        }

        linkedList.addLast("Java script");
        linkedList.set(1,"Ruby");
        System.out.println(linkedList);

    }
}
