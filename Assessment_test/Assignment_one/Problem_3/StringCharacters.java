package Assessment_test.Assignment_one.Problem_3;

public class StringCharacters {
    public static void main(String[] args) {
        String text = "To be or not to be, that is the question;"
                + "Whether `tis nobler in the mind to suffer"
                + " the slings and arrows of outrageous fortune,"
                + " or to take arms against a sea of troubles,"
                + " and by opposing end them?";
        int spaces = 0,
                vowels = 0,
                letters = 0;

        for (int i = 0; i < text.length(); i++) {
            char charecter = text.charAt(i);
            char lowerChar = Character.toLowerCase(charecter);
            if (lowerChar == 'a' || lowerChar == 'e' || lowerChar == 'i' || lowerChar == 'o' || lowerChar == 'u') {
                vowels++;
            } else if (lowerChar == ' ') {
                spaces++;
            } else {
                letters++;
            }

        }
        System.out.println("The text contained vowels: " + vowels + "\n"
                + "Consonants: " + (letters - vowels) + "\n"
                + "Spaces: " + spaces);

    }
}
