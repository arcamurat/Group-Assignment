import java.util.Scanner;

public class group {
    int opt;






    public void displayMenu(){
        do{
            System.out.println("1) ");
            System.out.println("2) ");
            System.out.println("3) ");
            System.out.println("4) ");
            System.out.println("5) Exit");

            Scanner input = new Scanner(System.in);
            System.out.println("Select an option: ");
            int opt = input.nextInt();

        }while(opt != 5);

    }


}
