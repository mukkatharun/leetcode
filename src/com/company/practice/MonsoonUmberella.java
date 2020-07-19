package com.company.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MonsoonUmberella {

    public static void main(String[] args) {
        Integer requirements = 97;
        List<Integer> sizes = new ArrayList<Integer>();
        sizes.add(1);
        sizes.add(2);
        sizes.add(3);
        Integer count = getUmberellas(requirements, sizes);
        System.out.println("number of umberellas are " + count);
    }

    private static Integer getUmberellas(Integer requirements, List<Integer> sizes) {
        if(sizes.isEmpty()) return -1;
        Collections.sort(sizes);
        Integer len = sizes.size() - 1;
        Integer ucount=0;
        while(requirements >= 0&& len>=0)
        {
            ucount += requirements/ sizes.get(len);
            requirements = requirements%sizes.get(len);
            len--;
        }
        return requirements!=0? -1 : ucount;
    }
}
