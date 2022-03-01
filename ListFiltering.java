package recap.codeWars;

import java.util.*;

public class ListFiltering {
    /*
    Kata.filterList(Arrays.asList(1, 2, "a", "b", "aasf", "1", "123", 231))
                                    => Arrays.asList(1, 2, 231)
     */

    public static void main(String[] args) {
      //  List<Object> list4 = new Arrays.asList(1, 2, "a", "b", "aasf", "1", "123", 231);
        List<Object> list = new ArrayList<Object>();
        list.add(1);
        list.add(2);
        list.add("a");
        list.add("b");
        list.add("aasbc");
        list.add("345");
        list.add("2");
        list.add(231);
        System.out.println(filterList(list));
    }
    public static List filterList(final List list) {
        // Return the List with the Strings filtered out
        List<Integer> ints = new ArrayList<>();
        for (Object obj: list) {
            if(obj.getClass().getSimpleName().equals("Integer")){
                ints.add((Integer) obj);
            }
        }
        return ints;
    }
}
