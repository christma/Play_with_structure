package BST;

public class Main {

    public static void main(String[] args) {
        BST<Integer> bst = new BST<Integer>();
        int[] nums = {5, 4, 6, 3, 7, 9, 1};
        for (int num : nums) {
            bst.add(num);
        }

        bst.preOrder();

        System.out.println(bst.size());
    }
}
