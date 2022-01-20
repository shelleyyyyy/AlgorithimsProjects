package Revision.AnalysisOfAlgorithims;

// Help Recieved
// I googled what a mod does

public class PartB{

    public static boolean primeCheck(int check){

        for(int i = 2; i < check; i++){
            if(check % i == 0){
                return false;
            }
        }
        
        return true;
    }



    public static void main(String[] args) {

        System.out.println(primeCheck(10));
    }
}
