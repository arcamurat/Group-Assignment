import java.util.Random;
import java.util.Scanner;

public class group {
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


}
