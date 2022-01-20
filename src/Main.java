public class Main {

    public static void main(String[] args) {
        MyArrayQueue<String> queue = new MyArrayQueue<>();
        queue.enqueue("AAA");
        queue.enqueue("BBB");
        queue.enqueue("CCC");
        queue.enqueue("DDD");
        queue.enqueue("EEE");
        queue.enqueue("FFF");
        queue.enqueue("GGG");


        while(!queue.isEmpty()){
            System.out.println("queue size: " + queue.size());
            System.out.println("enqueue: " + queue.dequeue());
        }

    }
}