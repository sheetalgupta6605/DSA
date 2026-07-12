package CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class arraylist {

    public static void main(String[] args) {
        // ArrayList<String> studentsName = new ArrayList<>();
        // studentsName.add("Sheetal");
        // System.out.println(studentsName);

        // List<Integer> list = new ArrayList<>();
        // list.add(1);
        // list.add(2);
        // list.add(3);
        // System.out.println(list); // [1, 2, 3]

        // list.add(4);
        // System.out.println(list); // [1, 2, 3, 4]

        // list.add(1, 50);
        // System.out.println(list);

        // =====================================================================================================================================

        // List<Integer> newlist = new ArrayList<>();
        // newlist.add(100);
        // newlist.add(200);
        // list.addAll(newlist);
        // System.out.println(list);

        // System.out.println(list.get(1));
        // =============================================================================================================================================
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);
        list.add(80);
        // list.remove(1);
        // System.out.println(list);
        // list.remove(Integer.valueOf(30));
        // System.out.println(list);

        // list.clear();
        // System.out.println(list);

        // list.set(2, 1000);

        // System.out.println(list.contains(50));

        // ======================================================================================================================================

        // for (int i = 0; i < list.size(); i++) {
        // System.out.println("element is : " + list.get(i));
        // }

        // for (Integer element : list) {
        // System.out.println(element);
        // }
        // System.out.println(list);

        // =============================================================================================================================================================
        // Iterator

        Iterator<Integer> it = list.iterator();

        while (it.hasNext()) {
            System.out.println("Iterator: " + +it.next());
        }

    }
}
