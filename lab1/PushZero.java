import java.io.*;
import java.util.Scanner;

public class PushZero
{
    static void pushZerosToEnd(int arr[], int n)
    {
        for(int i=0;i<n;i++)
        {
            int temp=0;
            if(arr[i]==0 && i!=n-1){
                temp=arr[i+1];
                arr[i+1]=arr[i];
                arr[i]=temp;
            }
            if(i==n-1)
            {
                temp=arr[i];// 0 4 - arr[i-1] arr[i] temp=4 arr[i]=arr[i-1]
                arr[i]=arr[i-1]; // 4=0
                arr[i-1]=temp;
            }
        }

    }

    public static void main (String[] args)
    {
        int arr[] = new int[100];
        int n;

        pushZerosToEnd(arr, n);

    }
}