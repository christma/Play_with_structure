package Array;

public class Main {
    public static void main(String[] args) {


        Array<Integer> array = new Array(10);

        for (int i = 0; i < 10; i++) {
            array.addLast(i);
        }
        System.out.println(array);

        array.add(1, 100);

        System.out.println(array);


        array.addFirst(-1);

        System.out.println(array);
//
        array.removeByIndex(11);

        System.out.println(array);

        array.removeFrist();

        System.out.println(array);
//
//
//        array.addFirst(100);
//
//        System.out.println(array);
//
//
//        array.removeElement(100);
//
//        System.out.println(array);


    }
}
