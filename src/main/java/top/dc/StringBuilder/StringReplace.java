package top.dc.StringBuilder;

public class StringReplace {
    public static void main(String[] args) {
        // 初始化一个内容为 Hello 的字符串生成器
        StringBuilder str = new StringBuilder("Hello World!");
        // 调用字符串替换方法，将 World 替换为 Java
        //6-11索引位置
        str.replace(6, 11, "Java");
        // 打印替换后的字符串
        System.out.println(str);
    }
}
