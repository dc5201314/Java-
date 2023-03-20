package top.dc.String;

public class StringDemo51 {

        public static void main(String[] args) {
            String str1 = "I love Java";

            System.out.println("以空格切割");
            String[] strArr1 = str1.split(" ");
            for (String str : strArr1) {
                System.out.print(str + '\t');
            }

            System.out.println("\n" + "以*切割");
            String str2 = "I*love*Java";
            String[] strArr2 = str2.split("\\*");
            for (String str : strArr2) {
                System.out.print(str + '\t');
            }

            System.out.println("\n" + "以\\切割");
            String str3 = "I\\love\\Java";
            String[] strArr3 = str3.split("\\\\");
            for (String str : strArr3) {
                System.out.print(str + '\t');
            }

            System.out.println("\n" + "以|切割");
            String str4 = "I|love|Java";
            String[] strArr4 = str4.split("\\|");
            for (String str : strArr4) {
                System.out.print(str + '\t');
            }
        }
    }


