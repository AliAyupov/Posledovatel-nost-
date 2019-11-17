/*import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class massiv {
    public static int k = 0;
    public static int x;
    public static int y;
    public static int l;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n, i, a[];
        System.out.println("Введите длину массива");
        n = in.nextInt();
        a = new int[n];
        for (i = 0; i <= n - 1; i++) {
            System.out.println("Введите элементы ");
            a[i] = in.nextInt();
            l = n % 2;
            l = l + n / 2;
            l=l/2+l%2;
        }
        for (i = 1; i <= l; ) {
            n--;
            if (a[i]== a[n]) {
                k++;
                i++;

            }
        }
        if (l == k) {
            System.out.println("Последовательность симметрична");
        } else
            System.out.println("нет");
    }

}
 */