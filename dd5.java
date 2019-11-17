/*import java.util.Scanner;

public class dd5 {
    public static int k = 0;
    public static int maxim;
    public static int g;
    public static int z;
    public static int n=0;


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите элементы: ");
        try {
            while (true) {
                int l=in.nextInt();
                maxim=l;
                k++;
                g=k;

                System.out.println("Номер первого максимума:"+k);
                System.out.println("Номер второго максимума:"+k);
                for (int i = 0; ; i++) {
                    System.out.print("-->");
                    int x = in.nextInt();


                    if(x>maxim){
                        k=k+n;
                        k++;
                        maxim=x;
                        System.out.println("Номер первого максимума:"+k);
                        System.out.println("Номер второго максимума:"+k);
                        g=k;
                        n=0;



                    }
                    else if(x<maxim){
                        z=k;
                        n++;
                        System.out.println("Номер первого максимума:"+g);
                        System.out.println("Номер второго максимума:"+z);
                    }
                    else if(x==maxim){
                        k=k+n;
                        k++;
                        System.out.println("Номер первого максимума:"+g);
                        System.out.println("Номер второго максимума:"+k);
                        n=0;
                    }


                }
            }
        }catch(Exception e){
            ;
        }
    }
}


 */
