package array;

import java.util.Arrays;

//动态数组  增删查改
public class MyArray {
    //集体存储元素的数组
    private int[] num;
    //当前动态数组中存储的元素个数
    private int size;
   // public MyArray(){
      //  num = new int[16];
    //}
    public MyArray(int length){
        num = new int[length];
    }




    //添加数据，默认从尾部插入
    public void add(int data){
        if(size == num.length){
            //此时动态数组保存的元素个数已经达到num的最大值，需要扩容
            //将原先的数组num扩容为原来的二倍
            num = Arrays.copyOf(num,num.length<<1);
        }
       num[size] = data;
       size++;
       //num[size++] = data;
    }
    //添加数据，方法重载。向任意位置插入  index 插入的目标索引
    public void add(int index,int data) {

        if(index <0 ||index >num.length){
            System.out.println("索引非法");
            return;
        }
        //若恰好在有效位数尾部插入
        if (index == size){
            add(data);
        }//在有效位置的之外但在数组长度之内 {1,2,3,4,0,0}->{1,2,3,4,4,0}
         if(index > size && index < num.length-1){
            num[index] = data;
            size++;
        }
        else {

        }
        //在中间插入
        //{1,2,3,4,0}
        //{1,5,2,3,4}
        //将index位置以及之后的元素向后移动一位
        //首先判断内部数组是否饱和
        if(size ==num.length){
            num = Arrays.copyOf(num,num.length<<1);
        }
        System.arraycopy(num,index,num,index+1,size-index);
        num[index] = data;
        size++;
    }
    //查找  若有返回索引 否则返回-1
    public int find(int data){
        return -1;
    }
    //值查找数据在或不在 然后返回值   在数组中查找是否有指定元素
    public boolean contains(int data){
        return false;
    }
    //删除第一个出现的指定内容
    public boolean remove(int data){
        return false;
    }
    //取得指定位置的元素
    public int get(int index){
       return -1;
    }
    //修改索引的指定内容  index指定的元素下标，data修改后的内容
    public boolean set(int index,int data){
        return false;
    }
    //返回动态数组长度
    public int size(){
        return size;
    }
    //打印动态数组内容
    public void print(){
        for (int i = 0; i <=size ; i++) {
            System.out.print(num[i]+",");
        }
    }
    //清空所有数组元素
    public void clear(){}
}
