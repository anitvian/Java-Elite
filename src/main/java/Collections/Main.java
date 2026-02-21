package Collections;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    void main() {
        MyArrayList<Integer> myArrayList = new MyArrayList<>();

        myArrayList.add(1);
        myArrayList.add(2);

        for (int i = 3; i <= 10; i++) {
            myArrayList.add(i);
        }

        System.out.println("Testing My ArrayList Values : "+myArrayList);

        System.out.println("Testing Get(4) Method For MyArrayList :"+myArrayList.get(4));

        System.out.println("Testing ArrayList Size :"+myArrayList.size());

        myArrayList.remove(9);

        System.out.println("Testing after removing the 9th element :"+myArrayList);

        myArrayList.add(1,88);

        System.out.println("Testing add at index 1 and value 88 at a specific index :"+myArrayList);

        myArrayList.set(1,888);

        System.out.println("Testing set at index 1 and value 888 at a specific index :"+myArrayList);

        System.out.println("Testing contains, weather 88 is present or not :"+myArrayList.contains(88));



    }
}
