import java.util.ArrayList; 
class Duplicate{
    public static void main(String args[]){
        int arr[] = {1,4,5,1,2,3,4,6};
        ArrayList <Integer> a1 = new ArrayList<>();
        for(int i=0; i<arr.length;i++){
            if(!a1.contains(arr[i])){
                a1.add(arr[i]);
            }
        }
        System.out.println(a1);
    }
}

