import java.util.Random;
import java.util.Scanner;

public class group {
    int opt;
    int evenSum;
    int oddSum;

    public static void main(String[] args) {
        int[] lisOfNumbers = new int[5];
        Random random = new Random();

        for(int i=0; i<lisOfNumbers.length; i++){
            lisOfNumbers[i] = random.nextInt(100);
            System.out.println(lisOfNumbers[i] + " ");
        }

        

    }


    public void displayMenu(){
        do{
            System.out.println("1) ");
            System.out.println("2) Find the minimum and maximum numbers");
            System.out.println("3) ");
            System.out.println("4) ");
            System.out.println("5) Exit");

            Scanner input = new Scanner(System.in);
            System.out.println("Select an option: ");
            int opt = input.nextInt();
        }while(opt != 5);
    }

    public void sumOf(int[] listNum){
        for(int i = 0; i < listNum.length; i++){
            if(listNum[i] % 2 == 0){
                evenSum += listNum[i];
            }
            else{
                oddSum += listNum[i];
            }
        }
        System.out.printf("\nSum of even numbers: %d",evenSum);
        System.out.printf("\nSum of even numbers: %d",oddSum);
    }

    public void findMaximum(int[] number) {
        int maxValue = Integer.MIN_VALUE;
        for (int i = 0; i < number.length; i++) {
            if (number[i] > maxValue) {
                maxValue = number[i];
            }
        }
        System.out.println("Maximum value of array is " + maxValue);
    }
    
    public void findMinumum(int[] number) {
        int minValue = Integer.MAX_VALUE;
        for (int i = 0; i < number.length; i++) {
            if (number[i] < minValue) {
                minValue = number[i];
            }
        }
        System.out.println("Minumum value of array is " + minValue);
    }



}
