import java.util.Scanner;
public class Main {
        public static boolean isThree(int n) {
            // Your code goes here
            int count = 1,result = 0,duplicateN;
            duplicateN = n;
            while(duplicateN > 0){
                if( n % count  == 0){
                    result++;
                }
                count++;
                duplicateN--;

            }
            if(result > 2){
                return true;
            }else{
                return false;
            }
        }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.println(isThree(num));
    }
}