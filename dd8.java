/*import java.util.Scanner;

public class dd8  {
    private static int n = 0;
    private static int f;
    private static int max;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите элементы ");
        try {
            while (true) {
                int p=in.nextInt();
                int max=p;
                System.out.println("No");
                for (int i = 0; ; i++) {
                  int x=in.nextInt();
                  if(x>max)
                      max=x;
                  if((x==p) && (n>0)){
                      System.out.println("Второй по величине элемент:"+f);
                  }
                  else if((n>0)&&(f<x)&&(x<max)){
                      System.out.println("Второй по величине элемент:"+x);
                  }
                  else if((n>0)&&(f>x)&&(x<max)) {
                      System.out.println("Второй по величине элемент:" + f);
                  }
                  else if(x>p){
                      System.out.println("Второй по величине элемент:"+p);
                      n++;
                      f=p;
                  }
                  else if((x==p)&&(n==0)){
                      System.out.println("No");
                  }
                  else if (x<p){
                      System.out.println("Второй по величине элемент:"+x);
                      n++;
                      f=p;
                  }
                  p=x;
                }
            }

            }catch(Exception e){
        }
    }
}

 */