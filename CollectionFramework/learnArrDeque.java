package CollectionFramework;

import java.util.ArrayDeque;

public class learnArrDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> adq = new ArrayDeque<>();

        System.out.println("Offer: ");
        adq.offer(23); // queue
        System.out.println(adq);

        System.out.println("Offer First: ");
        adq.offerFirst(12); // ArrayDeque
        System.out.println(adq);

        System.out.println("Offer Last: ");
        adq.offerLast(45); // ArrayDeque
        System.out.println(adq);

        System.out.println("Offer: ");
        adq.offer(27); // queue
        System.out.println(adq);

        System.out.println("Peek: " + adq.peek());
        System.out.println("PeekFirst: " + adq.peekFirst());
        System.out.println("PeekLast: " + adq.peekLast());

        System.out.println(adq.poll());
        System.out.println("Poll() " + adq);

        System.out.println(adq.pollFirst());
        System.out.println("PollFirst() " + adq);

        System.out.println(adq.pollLast());
        System.out.println("PollLast() " + adq);

    }

}
