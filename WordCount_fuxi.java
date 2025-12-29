import java.util.*;

public class WordCount_fuxi {
    public static void main(String[] args){
        String text = "Java Java spring spring spring";

        // 进行词频统计,先将词语进行切分
        HashMap<String, Integer> cnt = new HashMap<>();
        String[] words = text.split(" ");
        for (String w : words) {
            cnt.put(w, cnt.getOrDefault(w, 0) + 1);
        }
        // 用集合包装，方便排序
        LinkedList<Map.Entry<String, Integer>> s = new LinkedList<>(cnt.entrySet());
        Collections.sort(s, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });
        System.out.println(s);

    }
}
