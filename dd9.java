/*import java.util.Scanner;

public class dd9 {
    public static int y = 0;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите элементы->: ");
        try {
            while (true) {
                int k = in.nextInt();
                System.out.println("Группы единиц разделенные нулями:"+y);
                int n = in.nextInt();
                if((k==1)&&(n==0))
                    y++;
                System.out.println("Группы единиц разделенные нулями"+y);
                for (int i = 0; ; i++) {
                    System.out.print("-->");
                    int x = in.nextInt();
                    if ((n == 1)  && (x == 0)) {
                        y++;
                        System.out.println("Группы единиц разделенные нулями:" + y);
                        break;
                    }
                    k = n;
                    n = x;
                    System.out.println("Группы единиц разделенные нулями:" + y);
                }
            }
        } catch (Exception e) {

        }
    }
}

 */

