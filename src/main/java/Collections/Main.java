package Collections;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    void main() {
        MyArrayList<Integer> myArrayList = new MyArrayList<>();

        myArrayList.add(1);
        myArrayList.add(2);

        for (int i = 3; i <= 11; i++) {
            myArrayList.add(i);
        }

        System.out.println(myArrayList);

        System.out.println(myArrayList.get(4));

        System.out.println(myArrayList.size());

    }
}
