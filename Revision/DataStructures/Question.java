package Revision.DataStructures;

// Help Recieved
// I googled the syntax to make an array

public class Question {

    private static int [] arr = {1, 3, 5, 6, 9, 11, 16};

    private static int max = arr.length - 1;
    private static int min = 0;

    public static void shift(int index, int insert){

        int [] array = new int[arr.length + 1];

        int j = 0;
        for(int i = 0; i < array.length; i++){
            if(i == index){
                array[i] = insert;
                continue;
            }

            array[i] = arr[j];

            j++;
        }

        max++;
        arr = array;
    }
    

    public static void insert(int insert){
        int low = 0;
        int high = arr.length;
        int mid = 0;


        while(low < high){
            mid = (low + high) / 2;

            if(arr[mid] == insert){
                shift(mid + 1, insert);
                return;
            }

            if(arr[mid] > insert){
                high = mid;
            }

            if(arr[mid] < insert){
                low = mid + 1;
            }
        }

        shift(mid, insert);
    }

    public static void print(int [] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + ", ");
        }
    }

    public static void main(String[] args) {

        System.out.println(max);
        print(arr);
        System.out.println("");
        insert(16);
        print(arr);
        System.out.println("");
        System.out.println(max);

    }
}
