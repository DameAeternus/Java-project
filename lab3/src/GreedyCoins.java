import java.util.Scanner;

public class GreedyCoins {

    public static int minNumCoins(int[] coins, int sum) {
        //prvo gi sortirame coins
        int result=0;
        int n=coins.length;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(coins[j]<coins[j+1]) { // 2 4 3 5  4 3 5 2  4 5 3 2  5 4 3 2
                    int temp = coins[j];
                    coins[j]=coins[j+1];
                    coins[j+1]=temp;
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            if(sum==0)
            {
                break;
            }
            int a=sum/coins[i];
            result+=a;
            sum=sum-(a*coins[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String coinsStringLine = input.nextLine();
        String[] coinsString = coinsStringLine.split(" ");
        int[] coins = new int[coinsString.length];
        for(int i=0;i<coinsString.length;i++) {
            coins[i] = Integer.parseInt(coinsString[i]);
        }

        int sum = input.nextInt();
        System.out.println(minNumCoins(coins,sum));

    }
}