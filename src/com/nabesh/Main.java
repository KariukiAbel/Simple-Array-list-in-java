package com.nabesh;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList al=new ArrayList();
        al.add("A");
        al.add("B");
        al.add("C");
        al.add("D");
        System.out.println("Size of al after addition is "+al.size());
        System.out.println("Elements in the array are "+al);
        al.remove("A");
        System.out.println("Size of al after addition is "+al.size());
        System.out.println("Elements in the array are "+al);

    }
}
