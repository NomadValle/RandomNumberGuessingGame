import java.util.*;

public class randomGuessingGame {
    public static void main(String[] args) {
        menu();

    }


    

    /*METHODS*/
    public static void menu(){
        Scanner userSelection = new Scanner(System.in);
        System.out.println("****************************");
        System.out.println("Do you want to play?");
        System.out.println("\t1 - Yes, lets do this!");
        System.out.println("\t2 - NO, thank you.");
        System.out.print("Your Selection: ");

        int choice = userSelection.nextInt();
        switch(choice){
            case 1:
             //   generateRandomNumber();
                int numberToGuess = generateRandomNumber();
                usrGuess(numberToGuess);
                break;
            case 2:
                System.out.println("Ok, see you later!");
                System.exit(0);
                break;
            default:
                break;
        }
        menu();

    }


    public static void usrGuess(int numberToGuess){
        Scanner userNumber = new Scanner(System.in);
        System.out.println("Guess a number between 0 & 100");
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

    }

    public static int generateRandomNumber() {
        ArrayList<Integer> numberRange = new ArrayList<Integer>();
        Random randomNum = new Random();

        for(int i = 0; i< 101; i++) {
            int number = randomNum.nextInt(101);
            numberRange.add(number);
        }
        return numberRange.get(randomNum.nextInt(numberRange.size()));//returns a random element of the arraylist
    }


}
