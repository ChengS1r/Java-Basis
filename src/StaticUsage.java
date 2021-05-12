/**
 * 静态关键字static的使用方法
 */


public class StaticUsage {
    String name;
    int age;

    public static int count = 0;
    public final static String UserType = "Person";

    /**
     * 构造函数，每次实例化一个变量 count++
     */
    StaticUsage() {
        count++;
    }

    /**
     * 打印成员变量信息
     */

    public void printInfo() {
        System.out.println("name:" + this.name);
        System.out.println("age:" + this.age);
        System.out.println("count:" + count);
        System.out.println("userType:" + UserType);
    }
/*
 *   方法体内部是不可以使用static关键字，不同于C和C++语言
 *   public void test() {
 *       static int cnt = 0;
 *   }
 */
}
