public class counter {
    //variables
    private int LineCounter;
    private int CharacterCounter;
    private int index;

    public counter() {
    //variables
    LineCounter = 0;
    CharacterCounter = 0;
    index = -1;

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
    public boolean lookForStop(String stop) {return stop.equalsIgnoreCase("stop");
    }
    public void WordCounter(String input) {
        String space = "\\s+";
        String[] MyArray = input.split(space);
        for (String words : MyArray) {
            if (words.trim().length() > 0) {
                index++;
            }
        }
    }
    public int returnWord() {
        return index;
    }
}

// Försökte mig på VG delen ett par gånger men fick det inte riktigt att fungera. Lyckades dock göra en egen metod som räknade antal ord.