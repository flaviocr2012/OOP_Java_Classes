package ArraysList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AltoA {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();

        stringList.add("Flavio");
        stringList.add("Bruno");
        stringList.add("Andre");
        stringList.add("Edmea");
        stringList.add("Oraci");

        System.out.println("Before sort: "+ stringList);

        Collections.sort(stringList, new SortComparator());

        System.out.println("After sort: "+ stringList);

    }

}
