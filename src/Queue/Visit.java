package Queue;

/**
 * 创建一个Visit的接口来返回operate
 * @param <T>
 */
public interface Visit<T> {
        void operate(T t);
}
