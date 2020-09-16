package ArraysList;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> integerList = new ArrayList<>();
        integerList.add(5);
        integerList.add(15);
        integerList.add(35);
        integerList.add(55);

        for (int currentInt : integerList) {
            System.out.println("first " + currentInt);
        }

        for (int i = 0; i < integerList.size(); i++) {
            System.out.println(integerList.get(i));
        }
    }
}
