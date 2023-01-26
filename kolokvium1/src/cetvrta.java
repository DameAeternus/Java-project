import java.util.Scanner;


public class LDS {


    private static int najdolgaOpagackaSekvenca(int[] a) {
        int[] br = new int[a.length];
        for(int i=0;i<a.length;i++){
            br[i] = 1;
        }
        for(int i = 1;i<a.length;i++){
            for(int j=0;j<i;j++){
                if(a[i] < a[j]&&br[i] < br[j]+1){
                    br[i] = br[j]+1;
                }
            }
        }
        int minimum = -1000000;
        for(int i=0;i<br.length;i++){
            if(minimum < br[i]){
                minimum = br[i];
            }
        }
        return minimum;
    }

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        int n = stdin.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = stdin.nextInt();
        }
        System.out.println(najdolgaOpagackaSekvenca(a));
    }


}
