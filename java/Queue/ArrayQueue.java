package Queue;

import Array.Array;

public class ArrayQueue<E> implements Queue<E> {

    private Array<E> array;


    public ArrayQueue(int capacity) {
        array = new Array<E>(10);
    }

    public ArrayQueue() {
        array = new Array<E>();
    }


    @Override
    public int getSize() {
        return array.getSize();
    }

    @Override
    public boolean isEmpty() {
        return array.isEmpty();
    }


    public int getCapacity() {
        return array.getCapacity();
    }

    @Override
    public void enqueue(E e) {
        array.addLast(e);
    }

    @Override
    public E dequeue() {
        return array.removeFrist();
    }

    @Override
    public E getFront() {
        return array.getFirst();
    }


    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();


        res.append(String.format(" Queue : size = %d, capacity = %d \n", array.getSize(), array.getCapacity()));

        res.append("front [ ");
        for (int i = 0; i < array.getSize(); i++) {
            res.append(array.get(i));
            if (i != array.getSize() - 1)
                res.append(", ");
        }
        res.append(" ]  tail");
        return res.toString();
    }


}
