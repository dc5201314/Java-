package top.dc.String;

public class StringDemo52 {
        public static void main(String[] args) {
            String str = "我喜欢Java";
            System.out.println("将字符串转换为byte数组：");
            // 将字符串转换为字节数组
            byte[] ascii = str.getBytes();
            // 遍历字节数组，打印每个元素
            for (byte aByte : ascii) {
                System.out.print(aByte + "\t");
            }
        }
    }

