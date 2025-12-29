import javax.print.attribute.EnumSyntax;
import java.net.InterfaceAddress;
import java.util.*;

public class ListPractice {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(2);
        nums.add(1);

        // 学习遍历方式
        for (int i = 0; i < nums.size(); i++) {
            System.out.println(nums.get(i));
        }
        for (int x : nums) {
            System.out.println(x);
        }
        Iterator<Integer> it = nums.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("-----------");
        nums = uniqueAndKeepOrder1(nums);
        for (int num:
             nums) {
            System.out.println(num);
        }
    }

    public static List<Integer> uniqueAndKeepOrder(List<Integer> list) {
        Set<Integer> set = new LinkedHashSet<>();
        for(int x : list) {
            set.add(x);
        }
        return new ArrayList<>(set);
    }

    public static List<Integer> uniqueAndKeepOrder1(List<Integer> list) {
        Set<Integer> set = new HashSet<>();
        ArrayList<Integer> res = new ArrayList<>();
        for(int x : list) {
            if (!set.contains(x)){
                set.add(x);
                res.add(x);
            }
        }
        return res;
    }

}
