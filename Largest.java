
class Largest{
    public static void main(String args[]){
        int arr[] = {8,4,5,2,9,3,10,1,7};
        int largest = 0;
        for(int i=0;i<arr.length;i++){
            if (arr[i] >= largest){
                largest = arr[i];
            }
        }
        System.out.println("Largest Element is :" +largest);
    }
}

