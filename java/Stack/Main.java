package Stack;

public class Main {

    public static void main(String[] args) {
        ArrayStack<Integer> as = new ArrayStack<Integer>();

        for (int i = 0; i < 20; i++) {
            as.push(i);
            System.out.println(as);
        }

        System.out.println(as.peek());
        System.out.println(as.pop());
        System.out.println(as.peek());


    }
}
