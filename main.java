import java.util.Random;
import java.util.Scanner;

public class main {
    // create a scanner  for all my functions
    private Scanner scanner = new Scanner(System.in);
    // if the player choose elixir
    private boolean elixir = false;

    // create a method for the first door
    public void door1() {
        // elixir = faux
        elixir = false;
        System.out.println("Welcome to the first Door");
        System.out.println(" Enter your name: ");
        // get the name the user enter in the console
        Scanner scanner = new Scanner(System.in);
        //create a variable to get  the name
        // this variable goal is to wait for the user to enter the name
        String name = scanner.nextLine();

        //Verify if the name is "XR12CV7"
        if (name.equals("XR12CV7")) {
            //show decryption completed
            System.out.println("decryption completed");

            // use java random
            Random random = new Random();
            //choose a number between 1 and 9
            int randomNumb = random.nextInt(9);

            //calldoor2
            door2();

        } else {
            System.out.println(" Access to an non authorized dimension!");
        }

    };

    // create a method of the second door
    public void door2() {
        //brought to the next door

        System.out.println(" Welcome to the second Door, Where it's getting darker!");

        // ask the player to enter a number
        System.out.println(" enter a number between 1 to 9");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        //Condition of number should be between 1 and 9
        if (number > 0 && number < 10) {
            // check if the number is odd or even
            //if number devided has no reminder, it's an odd number
            if(number %2 == 0){
                // odd number
                System.out.println(" Our ancesters are among us");
                // redirected to door 3
                door3();
            }
            else{
                //It's an even number
                //redirect the player to door 1 to
                door1to();
            }
        }

    }
    //create the third door
    public void door3(){
        System.out.println(" Welcome to the third door: The wait");
        // request a sentence from the player
        System.out.println(" Enter a sentence : ");
        // collect the sentence
        Scanner scanner = new Scanner(System.in);

        String sentence = scanner.nextLine();
        //Verify if the sentence contains the word dragon using if statement in  lowercase
        if (  sentence.toLowerCase().contains("dragon")){
            // redirect to the second door to
            door2to();
        }
        else {
            // redirect to the door 2
            door2();
        }

    };
    //create a method for door 21 to
    public void door1to(){
        System.out.println("Welcome to the first Door");
        System.out.println(" Enter your name: ");
        // get the name the user enter in the console
        Scanner scanner = new Scanner(System.in);
        //create a variable to get  the name
        // this variable goal is to wait for the user to enter the name
        String name = scanner.nextLine();

        //Verify if the name is "XR12CV7"
        if (name.equalsIgnoreCase("XR12CV7")) {
            //print error is the reason of the doubt suffer the fury of the dragon
            System.out.println("error is the reason of the doubt suffer the fury of the dragon");
            // redirect to door 1
            door1();
            }
        else {
            System.out.println(" Do you want an elixir?: yes or no");
            // collect his answer
            String answer = scanner.nextLine();
            if (answer.equalsIgnoreCase("yes")){
                // add
                System.out.println(" Good");
                elixir = true;
                //redirect to the second door
                door2();
        }
            else {
                System.out.println("Sorry..");
                //redirect to the 4th door
            }
    };
    // create a method of door 2 to

    }
    //create a method for door 2 to
    public void door2to(){
        System.out.println(" Welcome to the second door: Distress");
        //verify if the player choose the elixir, he get  redirected  to door 4
        if (elixir){
            System.out.println(" La solution is true");
            door4();
        }
        else {
            door2();
        }
    }
    // create a method for door 4
    public void door4(){

        //brought to the next door

        System.out.println(" Welcome to the second Door, Where it's getting darker!");

        // ask the player to enter a number
        System.out.println(" enter a number between 1 to 9");
        int number = scanner.nextInt();
        //Condition of number should be between 1 and 9
        if (number > 0 && number < 10) {
            // check if the number is odd or even
            //if number devided has no reminder, it's an odd number
            if(number %2 == 0){
                // odd number
                System.out.println(" You won ");

            }
            else{
                //It's an even number
                //redirect the player to door 1 to
                door1to();
            }
        }
    }

    public static void main(String[] args) {
        // create a main object
        main game = new main();
        //call the first door
        game.door1();

    }
}

