package CollectionFramework;

import java.util.LinkedList;
import java.util.Queue;

public class llqueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        // common queue methods
        queue.offer(12);
        queue.offer(24);
        queue.offer(36);
        System.out.println(queue);

        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.peek());
        // System.out.println(queue.element());
        System.out.println(queue.add(2));
        System.out.println(queue);
        System.out.println(queue.remove());
        System.out.println(queue);
    }
}
