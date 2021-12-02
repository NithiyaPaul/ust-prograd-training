package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	    ArrayList<Integer> arrayList = new ArrayList<>(20);
        ArrayList<Integer> arrayList1 = new ArrayList<>(List.of(10,20,30,40));
        arrayList.add(1);
        arrayList.add(0,0);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.addAll(arrayList1);

        System.out.println(arrayList);
    }
}
