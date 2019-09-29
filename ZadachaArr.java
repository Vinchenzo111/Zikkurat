import java.util.*;
public class ZadachaArr {
    public static void main(String[] args) {
        int [] arr1 = new int[9];
        for (int i=0; i<arr1.length; i++) {
            arr1[i]=(int)(Math.random()*100);
            System.out.print(arr1[i]+" ");
        }
       System.out.print("\nSorted: \n");
        Arrays.sort(arr1);
        for (int i=0; i< arr1.length; i++) {
            System.out.print(arr1[i]+" ");
                           }

    }
}



