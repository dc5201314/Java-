package top.dc.Exceptionhandling;

public class ExceptionDemo5 {
    /**
     * 第一个自定义的静态内部异常类
     */
    static class FirstCustomException extends Exception {

        // 无参构造方法
        public FirstCustomException() {
            super("第一个异常");
        }
    }

    /**
     * 第二个自定义的静态内部异常类
     */
    static class SecondCustomException extends Exception {

        public SecondCustomException() {
            super("第二个异常");
        }
    }

    /**
     * 第三个自定义的静态内部异常类
     */
    static class ThirdCustomException extends Exception {

        public ThirdCustomException() {
            super("第三个异常");
        }
    }

    /**
     * 测试异常链静态方法1，直接抛出第一个自定义的静态内部异常类
     */
    public static void f1() throws FirstCustomException {
        throw new FirstCustomException();
    }

    /**
     * 测试异常链静态方法2，调用f1()方法，并抛出第二个自定义的静态内部异常类
     */
    public static void f2() throws SecondCustomException {
        try {
            f1();
        } catch (FirstCustomException e) {
            throw new SecondCustomException();
        }
    }

    /**
     * 测试异常链静态方法3，调用f2()方法， 并抛出第三个自定义的静态内部异常类
     */
    public static void f3() throws ThirdCustomException {
        try {
            f2();
        } catch (SecondCustomException e) {
            throw new ThirdCustomException();
        }
    }

    public static void main(String[] args) throws ThirdCustomException {
        // 调用静态方法f3()
        f3();
    }
}
