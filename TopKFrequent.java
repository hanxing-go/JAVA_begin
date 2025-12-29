import java.util.*;

public class TopKFrequent {
    public static void main(String[] args) {
        int[] nums = {1,1,13,13,4,13, 2, 3};
        System.out.println(topKFrequent(nums, 3));
    }
    public static List<Integer> topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> cnt = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            cnt.put(nums[i], cnt.getOrDefault(nums[i], 0) + 1);
        }
        // 进行排序，注意要使用降序
        LinkedList<Map.Entry<Integer, Integer>> list = new LinkedList<>(cnt.entrySet());
        list.sort((a,b) -> b.getValue().compareTo(a.getValue()));


        List<Integer> res = new ArrayList<>();
        int i = 0;
        while(k-- != 0) {
//            System.out.println(list.get(i));
            res.add(list.get(i++).getKey());
        }
        return res;
    }
}
