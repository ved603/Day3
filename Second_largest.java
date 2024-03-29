class Second_largest{
    public static void main(String args[]){
        int arr[] = {8,4,5,2,9,3,10,1,7};
        int largest = 0;
        int sec_large = 0;
        for(int i=0;i<arr.length;i++){
            if (arr[i] >= largest){
                sec_large = largest;
                largest = arr[i];
            }
        }
        System.out.println("second Largest Element is :" +sec_large);
    }
}