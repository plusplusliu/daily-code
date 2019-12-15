package List;

public class Test1 {
    public static void main(String[] args) {
      int[] num = new int[] {10,20};
      swap(num);
    }
    public  static void swap(int[]data) {
        int temp = data[0];
        data[0] = data[1];
        data[1] = temp;
    }
}

