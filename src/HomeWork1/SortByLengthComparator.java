package HomeWork1;

import java.util.Comparator;

/**
 * 建一个comparator来实现数组中元素按照字符串长度大小排序
 */
public class SortByLengthComparator implements Comparator<String> {
    public int compare(String var1, String var2) {
        if (var1.length() > var2.length()) {
            return 1;
        } else if (var1.length() == var2.length()) {
            return 0;
        } else {
            return -1;
        }
    }
}
