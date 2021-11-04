public class counter {

    //variables
        private int LineCounter;
        private int CharacterCounter;
        private int index;
        private String longest;
        private boolean stopper;

    public counter() {

    //variables
        LineCounter = 0;
        CharacterCounter = 0;
        index = 0;
        longest = "";
        stopper = false;

    //methods
    }
    public void LineCounter(int LineCount, String input) {
        if (!input.equalsIgnoreCase("stop")) LineCounter += LineCount;
    }
    public int returnLines() {
        return LineCounter;
    }
    public void charCounter(String input) {
        if (!input.equalsIgnoreCase("stop")) CharacterCounter = CharacterCounter + input.replace("stop", "").length();
        input.replace(" ","");
    }
    public int returnCharacterAmount() {
        return CharacterCounter;
    }
    public void lookForStop(String stop) {
        if (stop.contains("stop"))
            stopper = true;
    }
    public boolean returnStopper() {
        return stopper;
    }
    public void WordCounter(String input) {
            input.replace(" ","");
            String space = "\\s+";
            String[] MyArray = input.split(space);
            for (String words : MyArray) {
                if (words.trim().length() > 0) {
                    lookForStop(words);
                }
                index++;
            }
        }
    public int returnWord() {
        return index;
    }
    public void longestWord (String input) {
        if (!input.contains("stop")) {
            input.replace("stop","");
            String[] wordLength = input.split(" ");
            for (String s : wordLength) {
                if (s.length() >= longest.length()) {
                    longest = s;
                }
            }
        }
    }
    public String returnLongestWord() {
        return longest;
    }
}