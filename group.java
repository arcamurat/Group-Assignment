import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class group {
    int evenSum;
    int oddSum;
    static int[] listOfNumbers;

    public static void main(String[] args) {
        displayMenu();
    }

    public static void displayMenu(){
        int opt;
        do{
            System.out.println("\n\n1) Create the array");
            System.out.println("2) Find the minimum and maximum numbers");
            System.out.println("3) Difference from average");
            System.out.println("4) Sum of odd indexed and even indexed numbers");
            System.out.println("5) Exit");

            Scanner input = new Scanner(System.in);
            System.out.print("Select an option: ");
            opt = input.nextInt();

            if(opt == 1){
                listOfNumbers = createArrays();
            }

            if(opt == 2){
                findMinumum(listOfNumbers);
                findMaximum(listOfNumbers);
            }

            if(opt == 3){
                System.out.println(Arrays.toString(differenceFromAverage(listOfNumbers)));
            }

            if(opt == 4){
                System.out.printf("Sum of even indexes: %d", sumOfEvenIndexes(listOfNumbers));
                System.out.printf("\nSum of odd indexes: %d", sumOfOddIndexes(listOfNumbers));
            }

            if(opt == 5){
                System.out.println("\nExiting...");
                System.out.println("Closed successfully.");
            }
        }while(opt != 5);
    }

    public static int[] createArrays(){
        int[] listOfNumbers = new int[5];
        Random random = new Random();

        for(int i=0; i<listOfNumbers.length; i++){
            listOfNumbers[i] = random.nextInt(100);
            System.out.print(listOfNumbers[i] + " ");
        }
        System.out.println();
        return listOfNumbers;
    }


    public static void findMaximum(int[] number) {
        int maxValue = Integer.MIN_VALUE;
        for (int i = 0; i < number.length; i++) {
            if (number[i] > maxValue) {
                maxValue = number[i];
            }
        }
        System.out.println("Maximum value of array is " + maxValue);
    }
    
    public static void findMinumum(int[] number) {
        int minValue = Integer.MAX_VALUE;
        for (int i = 0; i < number.length; i++) {
            if (number[i] < minValue) {
                minValue = number[i];
            }
        }
        System.out.println("Minumum value of array is " + minValue);
    }

    public static int[] differenceFromAverage(int[] givenArray){
        int[]differenceArray = new int[givenArray.length];
        int total = 0;
        int average = 0;

            for(int i =0; i<givenArray.length;i++){
            total = total + givenArray[i];
            }
        average = total/givenArray.length;

            for(int i =0; i<givenArray.length;i++){
                differenceArray[i] = givenArray[i] - average;
            }
        return differenceArray;
        }

    public static int sumOfEvenIndexes (int[] givenArray){
        int sumOfEvenIndex = 0;
        
        for(int i =0; i<givenArray.length;i++){
            if(i%2 == 0){
                sumOfEvenIndex = sumOfEvenIndex+givenArray[i];
            }
        }
        return sumOfEvenIndex;
    }

    public static int sumOfOddIndexes (int[] givenArray){
        int sumOfOddIndex = 0;
        for(int i =0; i<givenArray.length;i++){
            if(i%2 == 1){
                sumOfOddIndex = sumOfOddIndex+givenArray[i];
            }
        }
        return sumOfOddIndex;
    }

}
