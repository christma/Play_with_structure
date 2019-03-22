package Queue;

public class Main {
    public static void main(String[] args) {

        ArrayQueue aq = new ArrayQueue();

        for (int i = 0; i <= 10; i++) {
            aq.enqueue(i);
            System.out.println(aq.toString());
        }


    }
}
