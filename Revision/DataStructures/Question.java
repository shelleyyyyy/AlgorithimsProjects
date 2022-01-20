package Revision.DataStructures;

public class Question {


    public static void shift(int [] arr, int index){

        int [] array = new int[arr.length + 1];

        boolean bool = true;

        for(int i = 0; i < arr.length; i++){
            if(i == index && bool){
                System.out.println(index);
                array[i] = 0;
                i--;
                bool = false;
            }
            array[i] = arr[i];
        }

        print(array);
    }
    

    public static void insert(int [] arr, int insert){
        int low = 0;
        int high = arr.length;

        while(low < high){
            int mid = (low + high) / 2;

            if(arr[mid] == insert){
                
            }
        }
    }

    public static void print(int [] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + ", ");
        }
    }

    public static void main(String[] args) {

        int [] arr = {1, 3, 5, 6, 9, 11};

        print(arr);
        System.out.println("");
        shift(arr, 3);
        
    }
}
