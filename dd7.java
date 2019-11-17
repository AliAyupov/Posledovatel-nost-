/*import java.util.Scanner;

public class dd7 {
    public static double kol = 0;
    public static int l = 0;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите элементы:-> ");
        try {
            while (true) {
                int k = in.nextInt();
                System.out.println("Количество элементов меньших предыдущего :" + l);
                for (int i = 0; ; i++) {
                    System.out.print("-->");
                    int x = in.nextInt();
                    if ((x == -110) || (k == -110))
                        break;
                    else if (k > x) {
                        l++;
                        k = x;
                    } else if (k < x)
                        k = x;
                    System.out.println("Количество элементов меньших предыдущего :" + l);
                }
            }
        } catch (
                Exception e) {

        }
    }
}
/*

 */