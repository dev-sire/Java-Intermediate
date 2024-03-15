import java.util.Scanner;

public class ArrayDel{
    public static int[] deleteElement(int[] arr, int index){
        if(arr == null || index < 0 || index >= arr.length){
            return arr;
        }
        int[] newArr = new int[4];
        for(int i=0, k=0; i<arr.length; i++){
            if(i == index){
                continue;
            }
            newArr[k++] = arr[i];
        }        
        return newArr;
    }
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        int[] arr = new int[5];
        int elemDel;
        System.out.println("Enter Any Five Values: ");
        for(int i=0; i<5; i++){
            arr[i] = obj.nextInt();
        }
        System.out.println("Enter the index of the element that you want to delete: ");
        elemDel = obj.nextInt();
        int[] finalArr =  deleteElement(arr, elemDel);
        for(int i=0; i<finalArr.length; i++){
            System.out.print(finalArr[i]+" ");
        }
        obj.close();
    }
}