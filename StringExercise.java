public class StringExercise {
    public static void main(String[] args) {
        String a = "dsb";
        String b = new String("dsb");
        System.out.println(a == b.intern());
    }
}
