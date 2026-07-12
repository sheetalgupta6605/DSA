package CollectionFramework;

import java.util.Set;

public class TreeSet {
    public static void main(String[] args) {
        Set<Integer> set = new java.util.TreeSet<>();
        set.add(32);
        set.add(20);
        set.add(45);
        set.add(1);
        set.add(67);
        set.add(20);

        System.out.println(set);
        set.remove(45);
        System.out.println(set);

        System.out.println(set.contains(100));
        System.out.println(set.isEmpty());
        System.out.println(set.size());
        set.clear();
        System.out.println(set);

    }
}
