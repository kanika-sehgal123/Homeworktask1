import java.util.*;

public class StringCharacters {
	void CalcVowels() {
        String text = "To be or not to be, that is the question;"
            + "Whether `tis nobler in the mind to suffer"
            + " the slings and arrows of outrageous fortune,"
            + " or to take arms against a sea of troubles,"
            + " and by opposing end them?";

        text = text.toLowerCase(); // Convert text to lowercase to handle both uppercase and lowercase characters

        int spaces = 0;
        int vowels = 0;
        int consonants = 0;

        for (char ch : text.toCharArray()) {
            if (ch == ' ') {
                spaces++;
            } else if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.println("Number of spaces: " + spaces);
        System.out.println("Number of vowels: " + vowels);
        System.out.println("Number of consonants: " + consonants);
    }
}
