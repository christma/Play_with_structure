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
        add(size, e);
    }


    public void addFirst(E e) {
        add(0, e);
    }

    public void add(int index, E e) {
        if (size == data.length)
            resize(2 * data.length);


        if (index < 0 || index > size)
            throw new IllegalArgumentException("Add failed， Require index >=0 or index > size");

        for (int i = size - 1; i >= index; i--) {
            data[i + 1] = data[i];
        }
        data[index] = e;
        size++;
    }

    private void resize(int newCapacity) {
        E[] newData = (E[]) new Object[newCapacity];

        for (int i = 0; i < size; i++)
            newData[i] = data[i];
        data = newData;


    }

    // get element by index
    public E get(int index) {
        if (index < 0 || index > size)
            throw new IllegalArgumentException("Add failed， Require index >=0 or index >= size");
        return data[index];
    }

    public E getLast() {
        return get(size - 1);
    }


    public E getFirst() {
        return get(0);
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
            if (data[size].equals(e))
                return true;
        }
        return false;
    }

    //
    public int find(E e) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(e))
                return i;
        }
        return -1;
    }

    public void findAll(int e) {
        //
    }

    //
    public E removeByIndex(int index) {
        if (index < 0 || index >= size)
            throw new IllegalArgumentException("Add failed， Require index >=0 or index > size");
        E ret = data[index];
        for (int i = index + 1; i < size; i++)
            data[i] = data[i + 1];
        size--;
        data[size] = null;

        if (size == data.length / 4 && data.length / 2 != 0)
            resize(data.length / 2);
        return ret;
    }

    //
    public E removeFrist() {
        return removeByIndex(0);
    }

    //
    public E removeLast() {
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
            if (data[i].equals(e))
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
