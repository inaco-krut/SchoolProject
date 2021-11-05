public class counter {

        private int LineCounter;
        private int CharacterCounter;
        private int index;
        private String longest;
        private boolean stopper;

    public counter() {

        LineCounter = 0;
        CharacterCounter = 0;
        index = 0;
        longest = "";
        stopper = false;

    }
    public void LineCounter(int LineCount, String input) {
        if (!input.equalsIgnoreCase("stop")) LineCounter += LineCount;
    }
    public int returnLines() {
        return LineCounter;
    }
    public void charCounter(String input) {
        if (!input.equalsIgnoreCase("stop")) { CharacterCounter = CharacterCounter + input.replace("stop","").replace(" ","").length();
        }
    }
    public int returnCharacterAmount() {
        return CharacterCounter;
    }
    public void lookForStop(String stop) {
        if (stop.contains("stop")) {
            stopper = true;
        }
    }
    public boolean returnStopper() {
        return stopper;
    }
    public void WordCounter(String input) {
        String[] MyArray = input.split(" ");
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