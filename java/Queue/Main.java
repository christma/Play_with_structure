package Queue;

public class Main {
    public static void main(String[] args) {

      LoopQueue aq = new LoopQueue();

        for (int i = 0; i <= 16; i++) {
            aq.enqueue(i);
            System.out.println(aq.toString());
        }


    }
}
