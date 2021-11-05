import java.util.Scanner;

public class output {
    public static void main(String[] args) {
        String usrInput;

        Scanner input = new Scanner(System.in);
        counter program = new counter();
        System.out.println("\nWelcome, Please enter a few random words to receive the results.");

        //loop & final output
        while (!program.returnStopper()) {
            usrInput = input.nextLine();
            program.charCounter(usrInput);
            program.LineCounter(1,usrInput);
            program.WordCounter(usrInput);
            program.longestWord(usrInput);
        }
        System.out.println("\nResult from user input...\n"+"\nNumber of characters... "+program.returnCharacterAmount()+"\nNumber of lines... " + program.returnLines() +"\nNumber of words... " + program.returnWord()+"\nlongest word... "+ program.returnLongestWord());
    }
}
