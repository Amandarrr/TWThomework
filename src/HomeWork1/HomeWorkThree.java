package HomeWork1;

import java.util.*;

public class HomeWorkThree {
    public static void main(String[] args) {
        List<String> list=mapToList( "123","It's so hard","ABC","I don't know it","ABC","cry die","123");

        printList(startWithA(list));
        System.out.println();
        printList(dataProcessing(list));
        System.out.println();
        printList(deduplicate(list));
    }

    //输出list相应的元素。
    private static void printList(List<String> list) {
        for (String s : list) {
            System.out.print(s + "\t");
        }
    }

    //返回list中所有以大写字母A开头的字符串组成的list。
    private static List<String> startWithA(List<String> list) {
        List<String> a = new ArrayList<>();
        for (String s : list) {
            if (s.startsWith("A")) {
                a.add(s);
            }
        }
        return a;
    }

    //将传进来的变长参数转换为一个List返回
    @SafeVarargs
    private static <T> List<T> mapToList(T... ts) {
        return Arrays.asList(ts);
    }

    //将list中的每一个元素先按照字符串长度大小排序，再在每一个字符串后面加上该字符串的长度,返回操作后的list
    private static List<String> dataProcessing(List<String> list) {
        int i = 0;
        List<String> c = new ArrayList<>();
        list.sort(new SortByLengthComparator());
        while (i < list.size()) {
            c.add(i, list.get(i) + "[" + list.get(i).length() + "]");
            ++i;
        }
        return c;
    }

    //将传进来的list进行去重操作并返回去重后的list。
    private static List<String> deduplicate(List<String> list) {
        Set<String> set = new HashSet<>();
        List<String> d = new ArrayList<>();
        for (String cd : list) {
            if (set.add(cd)) {
                d.add(cd);
            }
        }
        return d;
    }
}