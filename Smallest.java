
class Smallest{
    public static void main(String args[]){
        int arr[] = {8,4,5,2,9,3,10,1,7};
        int small = arr[1];
        for(int i=0;i<arr.length;i++){
            if(arr[i] < small){
                small = arr[i];
            }
        }
        System.out.println("Smallest Element is :" +small);
    }
}
