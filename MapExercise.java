import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExercise {
    public static void main() {
        Map hashMap = new HashMap();

        hashMap.put(1, new Emp("jack", 30000, 1));
        hashMap.put(2, new Emp("tom", 12000, 2));
        hashMap.put(3, new Emp("zx", 21000, 3));

        Set keyset = hashMap.keySet();
        for(Object o : keyset) {
            Emp emp = (Emp) hashMap.get(o);
            if (emp.getSal() > 18000) {
                System.out.println(emp);
            }

        }

        Set entrySet = hashMap.entrySet();
        System.out.println("--------------迭代器--------------");
        Iterator iterator = entrySet.iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry) iterator.next();
            Emp emp = (Emp) entry.getValue();
            if (emp.getSal() > 18000) {
                System.out.println(emp);
            }
        }
    }
}

class Emp {
    private String name;
    private double sal;
    private int id;

    public Emp(String name, double sal, int id) {
        this.name = name;
        this.sal = sal;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public double getSal() {
        return sal;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString(){
        return "Emp{" + "name = " + name + "\t" + "sale = " + sal + "\t" + "id = " + id + "}";
    }
}
