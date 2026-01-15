import java.util.TreeSet;

public class Test10_3_5 {
    Sample sam1 = new Sample("sam1成员初始化");
    static Sample sam = new Sample("静态成员sam初始化");
    static {
        System.out.println("static块执行");
        if (sam == null) System.out.println("sam is null");
    }
    Test10_3_5()
    {
        System.out.println("默认构造器被调用");
    }

    public static void main(String[] args) {
//        System.out.println(Person.total);
//        System.out.println(Person.total);

        Test10_3_5 a= new Test10_3_5();
    }
}
class Person {
    public static int total;
    static {
        total = 100;
        System.out.println("toal" + "=" + total);
    }
}
class Sample
{
    Sample(String s)
    {
        System.out.println(s);
    }
    Sample() {
        System.out.println("Sample的默认函数被调用");
    }
}