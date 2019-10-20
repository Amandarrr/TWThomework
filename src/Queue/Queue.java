package Queue;

import java.util.LinkedList;

/**
 * 对抽象类的AbstractQueue继承，并对方法进行使用
 * @param <T>
 */
public class Queue<T> extends AbstractQueue<T> {
    {
        list = new LinkedList<>();
    }

    @Override
    public void clearQueue() {
        list.removeAll(list);
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public int length() {
        return list.size();
    }

    @Override
    public T poll() {
        return list.get(0);
    }

    @Override
    public void enQueue(T t) {
        list.add(t);
    }

    @Override
    public T deQueue() {
        return list.remove(0);
    }

    @Override
    public void traverse(Visit<T> visit) {
        for (T e : list) {
            visit.operate(e);
        }
    }
}
