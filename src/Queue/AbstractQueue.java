package Queue;

import java.util.LinkedList;//LinkedList是List中的一种，使用链表访问

public abstract class AbstractQueue<T>{
    protected LinkedList<T> list;

    //清空队列
    public abstract void clearQueue();

    //判断队列是否为空
    public abstract boolean isEmpty();

    //返回队列的长度
    public abstract int length();

    //返回队头元素
    public abstract T poll();

    //队尾插入一个元素
    public abstract void enQueue(T t);

    //删除队头元素，并返回其值
    public abstract T deQueue();

    //Visit为一个接口，
    //遍历队列，对每一个数据元素e调用函数Visit.operate(e)
    public abstract void traverse(Visit<T> visit);

}
