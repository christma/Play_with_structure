package Link;

public class Main {
    public static void main(String[] args) {
        LinkList<Integer> linkList = new LinkList<>();
        for (int i = 0; i < 5; i++) {
            linkList.addFirst(i);
            System.out.println(linkList);
        }

        linkList.add(2, 666);
        System.out.println(linkList);

        linkList.add(7,777);
        System.out.println(linkList);
    }
}
