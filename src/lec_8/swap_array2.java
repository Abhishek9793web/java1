package lec_8;

public class swap_array2 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int brr[] = {6, 7, 8, 9, 10};

        System.out.println(arr[0]+" "+brr[1]);
        swap(arr,brr);
        System.out.println(arr[0]+" "+brr[1]);
    }
    public static void swap(int a[],int b[]){
        int c[]=a;
        a=b;
        b=c;


    }
}
