public class CustomException {
    public static void main(String[] args) throws AgeException{
//        int age = 130;
//        if (age <18 || age > 120) {
//            throw new AgeException("年龄不符合");
//        }
//        System.out.println("年龄没问题");

//        try{
//            System.out.println("进入方法中");
//            return;
//        } finally {
//            System.out.println("是否执行了");
//        }
        try {
            showExce();
            System.out.println("A");
        } catch (Exception e) {
            System.out.println("B");
        } finally {
            System.out.println("C");
        }
        System.out.println("D");
    }

    public static void showExce() throws Exception{
        throw new Exception();
    }
}
class AgeException extends RuntimeException {
    public AgeException(String message) {
        super(message);
    }
}