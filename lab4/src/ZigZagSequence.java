import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ZigZagSequence {

    static int najdiNajdolgaCikCak(int a[]) {
        int n=1;
        int najdolg=0;
        int temp=a[0];
        int flag=0;
        for(int j=1;j<a.length;j++)
        {
            if(temp < 0) {
                if(a[j] > 0)
                    n++;
            }
            else if(temp > 0) {
                if(a[j] < 0)
                    n++;
            }
            temp = a[j]; // sg ke ga zeme vtor

            if(n>flag) { // n pogolem od momentalan
                if(n>najdolg)
                    najdolg = n;
                flag = n;
            }
            else {
                flag = 0;
                n = 1;
            }
            /*
            4
    n   flag
-1  1   1
4   2   0
-3  3
2
             */
        }
        return najdolg;
        // Vasiot kod tuka
    }

    public static void main(String[] args) throws Exception {
        int i,j,k;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int a[] = new int[N];
        for (i=0;i<N;i++)
            a[i] = Integer.parseInt(br.readLine());

        int rez = najdiNajdolgaCikCak(a);
        System.out.println(rez);

        br.close();

    }

}
