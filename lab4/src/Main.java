import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ArithmeticExpression {

    // funkcija za presmetuvanje na izrazot pocnuvajki
    // od indeks l, zavrsuvajki vo indeks r
    static int presmetaj(char c[], int l, int r) {
        int br;
        int sum=0;
        for(br=l;br<=r;br++)
        {

            if(c[br]=='(' || c[br]==')') {
                continue;
            }
            else
            {
                if(c[br]=='0')
                sum+= (int)(c[br])-48;
                if(c[br]=='1')
                    sum+= (int)(c[br])-49;
                if(c[br]=='2')
                    sum+= (int)(c[br])-50;
                if(c[br]=='3')
                    sum+= (int)(c[br])-51;
                if(c[br]=='4')
                    sum+= (int)(c[br])-52;
                if(c[br]=='5')
                    sum+= (int)(c[br])-53;
                if(c[br]=='6')
                    sum+= (int)(c[br])-54;
                if(c[br]=='7')
                    sum+= (int)(c[br])-55;
                if(c[br]=='8')
                    sum+= (int)(c[br])-56;
                if(c[br]=='9')
                    sum+= (int)(c[br])-57;
            }
        }
        return sum;// Vasiot kod tuka
    }

    public static void main(String[] args) throws Exception {
        int i,j,k;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String expression = br.readLine();
        char exp[] = expression.toCharArray();

        int rez = presmetaj(exp, 0, exp.length-1);
        System.out.println(rez);

        br.close();

    }

}
