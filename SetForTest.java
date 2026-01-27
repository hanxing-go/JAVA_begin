import javax.print.attribute.standard.JobKOctets;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

public class SetForTest {
    public static void main(String[] args) {
        Set set = new HashSet();
        set.add("sb");
        set.add("dsb");
        set.add("is");
        set.add("zx");

        for (Object o : set) {
            System.out.println(o);
        }

        Iterator iterator = set.iterator();
        while(iterator.hasNext()) {
            Object o = iterator.next();
            System.out.println(o);
        }
    }
}
