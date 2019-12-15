package List;

import static java.lang.System.*;

//for each
//import java.util.Arrays
//数组—>字符串 toString
//public static void main(String []args){
//int[]arr = {1,2,3,4,5,6};
//doubleArray(arr);
////arr-->String
// String str = Arrays.toString(arr);
//输出结果[2,4,6,8,10,12]
public class Test {
    static int count = 0;
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int[] arr1 = {1,5,8,6,3,2,4};
        //int[] newArr = arrCopy(arr);//int[]newArr = Arrays.copyof(arr,arr.length)
        // cpoyof->arrcpoy(自己的方法)
        //doubleArray(arr);
        //String str = arr2Str(arr);
        //System.out.println(str);
        //System.out.println(findMax(arr));
        //System.out.println(avg(arr));
        //System.out.println(findElement(arr, 3));
        //System.out.println(binarySeach(arr,4));
        //System.out.println("二分查找共执行" + count + "次");
        System.out.println(arrIsSorted(arr));
        System.out.println(arrIsSorted(arr1));
        bubbleSort(arr1);
        System.out.println(arr2Str(arr1));
    }

    //所有引用数据类型的默认值为null，不指向任何地址
    //private static void swap(int[] arr) {
    //  int temp = arr[0];
    //arr[0] = arr[1];
    //arr[1] = temp;
    //}
    ///写一个方法，将数组中的每个元素*2
    ///public static void doubleArray(int[] array){
    /// for (int i = 0;i < array.length;i++) {
    ///    array[i] *= 2;
    ///}
    ///}
    //写一个方法，打印数组的每个元素
    // public static void printArray(int[]array) {
    //   for (int i:array) {
    //     System.out.print(i+",");
    //}
    //}
    //字符串+任何 =字符串
    public static String arr2Str(int[] array) {
        String str = "[";
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                //此时已经遍历到数组末尾
                str += array[i] + "]";
            } else {
                str += array[i] + ", ";
            }
        }
        return str;
    }

    //不改变原数组,将原数组中的每个元素都*2，不改变原数组
    //创建新的数组
    public static void doubleArray(int[] array) {
        //动态数组
        int[] newArr = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            newArr[i] = array[i] * 2;
        }
        out.println(arr2Str(newArr));
    }

    //数组拷贝  产生一个新的数组 新数组的内容和原数组相同
    //新数组十一块新空间，深拷贝（克隆）
    //浅拷贝
    //  int[] arr = {1, 3, 5, 7, 9};
    //int[] newArr = Arrays.copyOf(arr, arr.length);
    // 写一个方法，产生一个新数组，新的数组内容和原来的数组相同
    public static int[] arrCopy(int[] sourceArr) {
        int[] newArr = new int[sourceArr.length];
        for (int i = 0; i < sourceArr.length; i++) {
            newArr[i] = sourceArr[i];
        }
        return newArr;
    }

    //查找整形数组最大值/最小值
    public static int findMax(int[] arr) {
        //对比值采用数组中的一个任意值
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    //求一个整形数组的平均值sum/length
    public static double avg(int[] arr) {
        double sum = 0.0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        //double/int 整形提升
        return sum / arr.length;
    }

    //*****在一个数组中查找一个值，找到返回其索引，没有返回-1
    //顺序查找

    public static int findElement(int[] arr, int data) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == data) {
                return arr[i];
            }

        }
        return -1;
    }
//二分查找 （有序数组）  将要查找的元素与中间位置元素比较，若data>mid，在右半边区间查找，若data<mid，在左半边区间查找，若data=mid
    //返回mid的下标
    public static int binarySeach(int[]arr,int data){
        int left = 0;
        int right = arr.length-1;
        while (left<=right){
            count++;
            int mid = (left + right) / 2;
            if(data < arr[mid]){
                right = mid - 1;
            }else if (data > mid){
                left = mid + 1;
            }else {
                return mid;
            }
        }
        return -1;
    }
    //判断一个数组是否为有序数组（升序）
    public static boolean arrIsSorted(int[]arr){
        for(int i = 0;i < arr.length-1;i++){
            if(arr[i] > arr[i+1]){
                out.println("不是升序数组");
                return false;
            }
        }
        return true;
    }
    //冒泡排序 将一个无需数组整理为升序数组
    public static void bubbleSort(int[]arr){
        //从前到后遍历一边数组
        for(int i = 0;i < arr.length;i++){
            //依次比较相邻的两个元素
            for (int j = 0;j < arr.length-1;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

    }
    //数组逆序，数组数字排列
}
