//File name is TDMergeSort
//File written by Garrison Konschak
//File written on 4/13/2022
package tdmergesort;
import java.util.Random;
public class TDMergeSort
{
    public static void fill(int arrayNum[])
    {
        Random num = new Random();
        for(int i = 0; i < arrayNum.length; i++)
            arrayNum[i] = num.nextInt();
    }
    public static void display(int array[])
    {
        System.out.println("The elements of the array are: ");
        for(int i = 0; i < array.length; i++)
            System.out.print(array[i] + "\t");
        System.out.println();
    }
    public static void merge(int data[], int low, int medium, int high)
    {
        int first = medium;
        int second = medium + 1;
        int last = low;
        while ((last <= first) && (second <= high))
            if(data[low] < data[second])
                low++;
            else
            {
            int temp = data[second];
            for(int num = second - 1; num >= low; num--)
                data[num + 1] = data[num];
            data[low] = temp;
            low++;
            first++;
            second++;
            }
    }
    public static void mergeSort(int data[], int low, int high)
    {
        if(low >= high)
            return;
        int medium = (low + high) / 2;
        mergeSort(data, low, medium);
        mergeSort(data, medium + 1, high);
        merge(data, low, medium, high);
    }
    public static void main(String[] args)
    {
        int[] data = new int[100];
        fill(data);
        display(data);
        mergeSort(data, 0, 99);
        display(data);
    }
}
