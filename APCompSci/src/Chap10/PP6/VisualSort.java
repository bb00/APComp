package Chap10.PP6;

import javax.swing.*;
import java.util.Random;
import java.util.stream.IntStream;

public class VisualSort {
    public static void main(String[] args) {
        int size = 1240;
        int[] sort;
        sort = new int[size];
        Random r = new Random();
        sort[0] = r.nextInt(size) + 1;
        for (int i = 1; i < size; i++) {
            int temp = r.nextInt(size) + 1;

            if (IntStream.of(sort).anyMatch(x -> x == temp)) {
                sort[i] = temp - 1;
            } else {
                sort[i] = temp;
            }
        }

        JFrame frame = new JFrame("Visual Sort");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Pic x = new Pic(sort);
        frame.getContentPane().add(x);
        frame.setSize(1260,890);
        frame.setVisible(true);

        System.out.println("\n");
        //heapSort(sort, x);
        //insertionSort(sort, x);
        heapSort(sort, x);



    }

    public static void selectionSort(int[] s, Pic x) {
        int y = s.length;
        int min, temp, k;
        for (int i = 0; i < y-1; i++) {
            k=i;
            for (int j = i+1; j < y; j++) {
                if (s[j] < s[k]) {
                    k = j;
                }
                temp=s[i];
                s[i]=s[k];
                s[k]=temp;
                try{Thread.sleep(1);}
                catch(InterruptedException e) {
                    e.printStackTrace();
                }
                x.repaint();
            }
        }
    }
    public static void insertionSort(int array[], Pic x) throws InterruptedException {
        int n = array.length;  
        for (int j = 1; j < n; j++) {  
            int key = array[j];  
            int i = j-1;  
            while ( (i > -1) && ( array [i] > key ) ) {  
                array [i+1] = array [i];  
                i--;  
            }
            try{Thread.sleep(1);}
            catch(InterruptedException e) {
                throw e;
            }
            array[i+1] = key;
            x.repaint();
        }  
    }
    private static int N;
    public static void heapSort(int arr[], Pic x)
    {
        heapify(arr);
        for (int i = N; i > 0; i--)
        {
            swap(arr,0, i);
            N = N-1;
            maxheap(arr, 0);
            try{Thread.sleep(1);}
            catch(InterruptedException e) {
                e.printStackTrace();
            }

            x.repaint();
        }
    }
    /* Function to build a heap */
    public static void heapify(int arr[])
    {
        N = arr.length-1;
        for (int i = N/2; i >= 0; i--)
            maxheap(arr, i);
    }
    /* Function to swap largest element in heap */
    public static void maxheap(int arr[], int i)
    {
        int left = 2*i ;
        int right = 2*i + 1;
        int max = i;
        if (left <= N && arr[left] > arr[i])
            max = left;
        if (right <= N && arr[right] > arr[max])
            max = right;
        if (max != i)
        {
            swap(arr, i, max);
            maxheap(arr, max);
        }
    }
    /* Function to swap two numbers in an array */
    public static void swap(int arr[], int i, int j)
    {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

}
