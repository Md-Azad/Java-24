package Assessment_test.Assignment_one.Problem_4;

public class WordSorter {
    public static void main(String[] args) {
        String text = "To be or not to be, that is the question;"
                + "Whether `tis nobler in the mind to suffer"
                + " the slings and arrows of outrageous fortune,"
                + " or to take arms against a sea of troubles,"
                + " and by opposing end them?";

        String[] wordsarr = splitWords(text);
        String[] words = bubbleSort(wordsarr);

        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }
    }

    /**
     * In terms of spiliting the words I used regular expression.
     * splited depanding of s,;'.`]+
     */

    public static String[] splitWords(String texts) {
        String[] splitedWords = texts.split("[\\s,;'.`]+");

        return splitedWords;

    }

    /**
     * for comparision word to word I used compareTo() method.
     * it compares character by character based on unicode value of each character.
     * it keeps comparing until it find the end of any string.
     */

    public static String[] bubbleSort(String[] words) {

        int le = words.length;
        for (int i = 0; i < le - 1; i++) {
            for (int j = 0; j < le - i - 1; j++) {
                if ((words[j].compareTo(words[j + 1]) > 0)) {
                    String temp = words[j];
                    words[j] = words[j + 1];
                    words[j + 1] = temp;

                }

            }

        }
        return words;

    }

}
