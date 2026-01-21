public class StaticInnerClass {
    public static void main(String[] args) {
        Outer10 outer10 = new Outer10();
        outer10.m1();
        // 外部其他类如何使用静态内部类
        //方式一：
        Outer10.Inner10 inner10 = new Outer10.Inner10();
        inner10.say();
        System.out.println("---------------------------");
        // 方式二：
        Outer10.Inner10 inner11 = outer10.getInner10();
        inner11.say();
    }
}

class Outer10{
    private int n1 = 10;
    private static String name = "张三";
    private static void cry() {}

    static class Inner10{
        private static String name = "hanxing";
        public void say() {
            // 如果外部类和静态内部类的成员重名，静态内部类访问时默认遵循就近原则，
            // 如果想访问外部类的成员，则可以使用外部类名+成员
            System.out.println(name + " 外部类name= " + Outer10.name);
            cry();
        }
    }

    public void m1() {
        // 外部类需要访问静态内部类，创建对象，再访问
//        System.out.println(Inner10.name);

        Inner10 inner10 = new Inner10();
        inner10.say();
    }

    public Inner10 getInner10(){
        return new Inner10();
    }
}
