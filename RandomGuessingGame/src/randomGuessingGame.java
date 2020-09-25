import java.util.*;

public class randomGuessingGame {
    public static void main(String[] args) {
        menu();
        usrGuess(generateRandomNumber());
    }


    

    /*METHODS*/
    public static void menu(){
        Scanner userSelection = new Scanner(System.in);

        System.out.println("Do you want to play?");
        System.out.println("\t1 - Yes, lets do this!");
        System.out.println("\t2 - NO, thank you.");

        int choice = userSelection.nextInt();
        switch(choice){
            case 1:
                generateRandomNumber();
                break;
            case 2:
                System.out.println("Ok, see you later!");
                System.exit(0);
                break;
            default:
                break;
        }
    }


    public static void usrGuess(int numberToGuess){
        Scanner userNumber = new Scanner(System.in);
        System.out.println("Enter a number to guess.");
        int guess = userNumber.nextInt();

        while(guess != numberToGuess){
            if(guess < numberToGuess){
                System.out.println("Too low...");
            }
            else if(guess > numberToGuess){
                System.out.println("Too high...");
            }

            System.out.println("Enter a number to guess.");
            guess = userNumber.nextInt();
        }
        System.out.println("You Got It!!");
        menu();
    }

    public static int generateRandomNumber() {
        ArrayList<Integer> numberRange = new ArrayList<Integer>();
        Random randomNum = new Random();

        for(int i = 0; i< 101; i++) {
            int number = randomNum.nextInt(101);
            numberRange.add(number);
        }
        return numberRange.get(randomNum.nextInt(numberRange.size()));
    }


}
