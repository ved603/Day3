import java.util.*;

class Sort{
    public static void main(String args[]){
        int arr[] = {4,5,3,1,6,2};
        int small = 0;
        for(int i=0;i<arr.length;i++){
            small = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j] < arr[small]){
                    small = j;
                }
            }

            int k = arr[i];
            arr[i] = arr[small];
            arr[small] = k;

        }

        System.out.println(Arrays.toString(arr));
    }
}
