import java.util.Scanner;

public class output {
    public static void main(String[] args) {
        //variables
        String usrInput="";

        // user input
        Scanner input = new Scanner(System.in);
        counter program = new counter();

        //first output
        System.out.println("\nWelcome Staffan.. Please enter a few random words to receive the results.");

        //loop & final output
        while (!program.lookForStop(usrInput)) {
            usrInput = input.nextLine();
            program.charCounter(usrInput);
            program.LineCounter(1,usrInput);
            program.WordCounter(usrInput);
            program.longestWord(usrInput);
        }
        System.out.println("\nResult from user input...\n"+"\nNumber of characters... "+program.returnCharacterAmount()+"\nNumber of lines... "+program.returnLines() +"\nNumber of words... "+program.returnWord()+"\nlongest word... "+ program.returnLongestWord());
    }
}
