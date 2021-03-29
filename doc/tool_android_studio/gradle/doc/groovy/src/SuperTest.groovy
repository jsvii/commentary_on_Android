public class SuperTest {

    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            System.out.println("Java的东西Groovy都能用");
        }
        System.out.println("随便输入点啥试试");
        Scanner sc = new Scanner(System.in); // 不需要导入java.util包
        String str = sc.next();
        System.out.println("你刚才输入了：" + str);
    }

}
