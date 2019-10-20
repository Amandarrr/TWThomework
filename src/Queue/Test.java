package Queue;

public class Test {
    public static void main(String[] args) {
        AbstractQueue<Integer> queue = new Queue<Integer>();
        for (int i = 0; i < 100; i++) {
            queue.enQueue(i);
        }

        queue.traverse(System.out::println);
        System.out.println(queue.length());
        System.out.println(queue.poll());
        System.out.println(queue.deQueue());
        queue.clearQueue();
        queue.isEmpty();
        queue.enQueue(3);
        queue.isEmpty();
    }
}
