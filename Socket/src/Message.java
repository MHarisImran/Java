import java.io.*;
class Message implements Serializable {
    private String text;
    private char maxChar;
    private int maxCount;

    public Message(String text) {
        this.text = text;
        this.calculateMaxChar();
    }

    public char getMaxChar() {
        return maxChar;
    }

    public int getMaxCount() {
        return maxCount;
    }

    private void calculateMaxChar() {
        int[] charCount = new int[256]; // Assuming ASCII characters
        int max = -1;
        char maxChar = '\0';

        for (char c : text.toCharArray()) {
            charCount[c]++;
            if (charCount[c] > max) {
                max = charCount[c];
                maxChar = c;
            }
        }

        this.maxChar = maxChar;
        this.maxCount = max;
    }
}


