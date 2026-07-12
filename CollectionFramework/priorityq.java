package CollectionFramework;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class priorityq {
    public static void main(String[] args) {
        Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        // min heap
        pq.offer(40);
        pq.offer(72);
        pq.offer(24);
        pq.offer(36);

        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);

        System.out.println(pq.peek());
    }
}
