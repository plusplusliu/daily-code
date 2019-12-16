package array;

public class Test2 {
    public static void main(String[] args) {
        MyArray myArray = new MyArray(3);
        myArray.add(1);
        myArray.add(2);
        myArray.add(3);
        myArray.add(4);
        //myArray.print();
        //myArray.add(1,5);

        //{1,2,3,4,0,0}
        myArray.add(1,10);
        myArray.print();
       // System.out.println(myArray.size());

    }
}
