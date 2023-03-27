package top.dc.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsDemo2 {
    public static void main(String[] args) {
        List arrayList = new ArrayList();
        arrayList.add(123);
        arrayList.add("Hello");
        int str = (Integer) arrayList.get(0);
        System.out.println("element=" + str);
    }
}
