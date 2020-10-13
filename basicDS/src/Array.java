public class Array {
    //私有成员变量
    private int[] data;
    private  int size;

    //构造函数
    public Array(int capacity){
        data = new int[capacity];
        size = 0;
    }
    //无参数构造函数 默认数组容量10
    public Array(){
        this(10);
    }
    //获取 数组元素个数
    public int getSize(){
        return  size;
    }
    //获取 数组容量
    public int getCapacity(){
        return data.length;
    }
    //返回数组是否为空
    public boolean isEmpty(){
        return size == 0;
    }
    //向最后添加元素
    public void addLast(int e){
        if(size == data.length)
            throw new IllegalArgumentException("AddLast failed. Array is full");
        data[size] = e;
        size++;

    }
}
