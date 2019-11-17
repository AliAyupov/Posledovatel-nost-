import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class dd13 {
    public static int kol = 0;
    public static int n = 0;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите элементы: ");
        try {
            while (true) {
                int a=in.nextInt();
                System.out.println("Такой последовательности нет");

                for (int i = 0; ; i++) {
                    int b=in.nextInt();
                    if((a==1)&&(b==2)) {
                        kol++;
                        if (kol == 3) {
                            n++;
                            System.out.println("Количество:" + n);
                            kol = 0;
                        }
                        else if (n==0) {
                            System.out.println("Такой последовательности нет");
                        }
                        else if(n>0){
                            System.out.println("Количество"+n);
                        }
                    }
                    else if(n>0){
                        System.out.println("Количество:"+n);

                    }
                    else if (n==0){
                        System.out.println("Такой последовательности нет");
                    }

                }
            }

        }catch (Exception e){
        }
    }
}

