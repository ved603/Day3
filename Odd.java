class Odd{

    public static void main(String args[]){

        int arr[] = {6,5,4,1,2,3,9,8,7,10};
        for(int i=0;i<arr.length;i++){
            if((i+1)%2 != 0){
                System.out.println(arr[i]);
            }
        }
    }
}