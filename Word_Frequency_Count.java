import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Word_Frequency_Count {
    public static void main(String[] args) {
        String text = "Java, java! backend backend backend. Spring spring?";

        Map<String, Integer> cnt_test = new HashMap<>();
        cnt_test = countWords(text);
        List<Map.Entry<String, Integer>> ret = sortWords(cnt_test);
        for (Map.Entry<String, Integer> m : ret) {
            System.out.println(m.getKey() + "->" + m.getValue());
        }

        String[] words = text.split("\\s+");
        Map<String, Integer> cnt = new HashMap<>();

        for (String raw : words){
            //统一大小写
            String w = raw.toLowerCase();
            //去掉标点，只保留字母和数字
            w = w.replaceAll("[^a-z0-9]", "");
            // 如果去完之后变成了空，就跳过这一步
            if (w.isEmpty()){
                continue;
            }

            cnt.put(w, cnt.getOrDefault(w, 0) + 1);
        }
        // 将Map转换为列表，方便最后的排序工作
        List<Map.Entry<String, Integer>> list = new ArrayList<>(cnt.entrySet());

        // 按value 降序排序
//        list.sort((a, b) -> b.getValue().compareTo(a.getValue()));
        list.sort((a, b) -> {
            int c = b.getValue().compareTo(a.getValue()); //先比次数
            if (c != 0)
                return c;
            return a.getKey().compareTo(b.getKey());    //如果次数相同，再比单词首字母
        });
//        可以发现默认都是升序
        // 打印最后的结果
        for (Map.Entry<String, Integer> e : list) {
            System.out.println(e.getKey() + "->" + e.getValue());
        }
//        System.out.println(cnt);
    }

    public static Map<String, Integer> countWords(String text) {
        String[] words = text.split("\\s+");
        Map<String, Integer> cnt = new HashMap<>();

        for (String raw : words) {
            String w = raw.toLowerCase();//先统一变成小写
            w = w.replaceAll("[^a-z0-9]","");
            if (w.isEmpty()){
                continue;
            }
            cnt.put(w, cnt.getOrDefault(w, 0) + 1);
        }
        return cnt;
    }

    public static List<Map.Entry<String, Integer>> sortWords(Map<String, Integer> words){
        List<Map.Entry<String, Integer>> list = new ArrayList<>(words.entrySet());
        list.sort((a,b)-> {
            int c = b.getValue().compareTo(a.getValue());
            if (c != 0)
                return c;
            return a.getKey().compareTo(b.getKey());
        });

        return list;
    }
}
