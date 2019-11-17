/*import java.util.Scanner;
public class dd4 {

    public static int max = 0;
    public static int n = 1;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите элементы->: ");
        try {
            while (true) {
                int k = in.nextInt();
                System.out.println("максимальное количество элементов идущих подряд:"+n);
                for (int i = 0; ; i++) {
                    System.out.print("-->");
                    int x = in.nextInt();
                    if (x == k) {
                        n++;
                    } else if (x != k) {
                        n = 1;
                        k=x;
                    }
                    if (n > max) {
                        max = n;
                    }
                    System.out.println("максимальное количество элементов идущих подряд:" + max);

                }

            }
        } catch (Exception e) {

        }
    }
}

/*





 */
