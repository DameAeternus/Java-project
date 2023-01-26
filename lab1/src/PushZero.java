import java.io.*;
import java.util.Scanner;
public class PushZero
{
    static void pushZerosToEnd(int arr[], int n)
    {
        int i;
        int brojac=0;
        for(i=0;i<n;i++) {
            if(arr[i]!=0){
            arr[brojac]=arr[i]; // 1 0 2 3
            brojac++; // 2 0 0 4 4
            }
        }
        while(brojac<n) {
            arr[brojac] = 0;
            brojac++;
        }

    }

    public static void main (String[] args)
    {
        int arr[] = new int[100];
        int n;
        Scanner input=new Scanner(System.in);
        n=input.nextInt();
        for(int i=0;i<n;i++)
        {
            arr[i]=input.nextInt();
        }
        pushZerosToEnd(arr, n);
        System.out.println("Transformiranata niza e:");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}