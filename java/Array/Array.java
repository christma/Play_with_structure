package Array;


public class Array<E> {

    private E[] data;
    private int size;

    //Java 不支出 new 泛型数组
    public Array(int capacity) {
        data = (E[]) new Object[capacity];
        size = 0;

    }

    //无参数构造函数,默认容量为 10
    public Array() {
        this(10);
    }

    //获取数组中的元素个数
    public int getSize() {
        return size;
    }

    //获取数组容量
    public int getCapacity() {
        return data.length;
    }

    //判断是否数组为空
    public boolean isEmpty() {
        return size == 0;
    }

    // add a new element to array at last
    public void addLast(E e) {
//        if (size == data.length)
//            throw new IllegalArgumentException("AddLast failed， Array is full ！！！");
//
//        data[size] = e;
//        size++;

        add(size, e);
    }


    public void addFirst(E e) {
        add(0, e);
    }

    public void add(int index, E e) {
        if (size == data.length)
            throw new IllegalArgumentException("Add failed， Array is full ！！！");
        if (index < 0 || index > size)
            throw new IllegalArgumentException("Add failed， Require index >=0 or index > size");

        for (int i = size - 1; i >= index; i--) {
            data[i + 1] = data[i];
        }
        data[index] = e;
        size++;
    }

    // get element by index
    E get(int index) {
        if (index < 0 || index > size)
            throw new IllegalArgumentException("Add failed， Require index >=0 or index >= size");
        return data[index];
    }

    // change element
    void set(int index, E e) {
        if (index < 0 || index > size)
            throw new IllegalArgumentException("Add failed， Require index >=0 or index > size");
        data[index] = e;
    }

    //
    public boolean contains(E e) {
        for (int i = 0; i < size; i++) {
            if (data[size] == e)
                return true;
        }
        return false;
    }

    //
    public int find(E e) {
        for (int i = 0; i < size; i++) {
            if (data[i] == e)
                return i;
        }
        return -1;
    }

    public void findAll(int e) {
        //
    }

    //
    public E removeByIndex(int index) {
        if (size == data.length)
            throw new IllegalArgumentException("Add failed， Array is full ！！！");
        if (index < 0 || index >= size)
            throw new IllegalArgumentException("Add failed， Require index >=0 or index > size");
        E ret = data[index];
        for (int i = index; i < size; i++)
            data[i] = data[i + 1];
        size--;
        return ret;
    }

    //
    public E removeFrist(int index) {
        return removeByIndex(0);
    }

    //
    public E removeLast(int index) {
        return removeByIndex(size - 1);
    }

    //
    public void removeElement(E e) {
        if (isEmpty())
            throw new IllegalArgumentException("array is empty！");
        int index = find(e);
        if (index != -1)
            removeByIndex(index);
    }

    //
    public void removeElements(E e) {
        if (isEmpty())
            throw new IllegalArgumentException("array is empty！");
        for (int i = 0; i < size; i++) {
            if (data[i] == e)
                removeByIndex(i);
        }
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();


        res.append(String.format(" Array : size = %d, capacity = %d \n", size, data.length));

        res.append("[ ");
        for (int i = 0; i < size; i++) {
            res.append(data[i]);
            if (i != size - 1)
                res.append(", ");
        }
        res.append(" ]");
        return res.toString();
    }


}
