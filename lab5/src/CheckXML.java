import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.NoSuchElementException;
import java.util.Stack;

public class CheckXML {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int n = Integer.parseInt(s);
        String[] redovi = new String[n];

        for (int i = 0; i < n; i++)
            redovi[i] = br.readLine();

        int valid;

        if (isValid(redovi))
            System.out.println(1);
        else
            System.out.println(0);
        br.close();
    }

    private static boolean isValid(String[] redovi) {

        Stack<String> valid = new Stack<>();

        for (String red : redovi) {

            if (red.charAt(0) == '[' && red.charAt(red.length() - 1) == ']') {

                if (red.charAt(1) != '/')
                    valid.push(red);

                else {
                    if (valid.pop().substring(1).compareTo(red.substring(2)) != 0) {
                        return false;
                    }
                }


            }

        }

        return valid.isEmpty();

    }
}