public class counter {
    //variables
        private int LineCounter;
        private int CharacterCounter;
        private int index;
        private String longest;

    public counter() {

    //variables
        LineCounter = 0;
        CharacterCounter = 0;
        index = 0;
        longest = "";

    //methods
    }
    public void LineCounter(int LineCount, String input) { if (!input.equalsIgnoreCase("stop")) LineCounter += LineCount;
    }
    public int returnLines() {
        return LineCounter;
    }
    public void charCounter(String input) { if (!input.equalsIgnoreCase("stop")) CharacterCounter = CharacterCounter + input.replace(" ", "").length();
    }
    public int returnCharacterAmount() {
        return CharacterCounter;
    }
    public boolean lookForStop(String stop) {
        return stop.equalsIgnoreCase("stop");
    }
    public void WordCounter(String input) { if (!input.equalsIgnoreCase("stop")) {
            String space = "\\s+";
            String[] MyArray = input.split(space);
            for (String words : MyArray) {
                if (words.trim().length() > 0) {
                    index++;
                }
            }
        }
    }
    public int returnWord() {
        return index;
    }
    public void longestWord (String input) { if (!input.equalsIgnoreCase("stop")) {
            String[] wordLenght = input.split(" ");
            for (String s : wordLenght) {
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