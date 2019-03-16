package Array;

public class Student {

    private String name;
    private int score;


    public Student(String name, int score) {
        name = name;
        score = score;
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }


    public static void main(String[] args) {
        Array<Student> arr = new Array<Student>();

        arr.addLast(new Student("alice", 100));
        arr.addLast(new Student("lies", 10));
        arr.addLast(new Student("al", 99));


        System.out.println(arr);

    }
}
