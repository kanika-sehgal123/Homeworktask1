import java.util.*;

public class WordSorter {
    void SortWords() {
        String text = "To be or not to be, that is the question; "
                + "Whether 'tis nobler in the mind to suffer "
                + "the slings and arrows of outrageous fortune, "
                + "or to take arms against a sea of troubles, "
                + "and by opposing end them?";

        String[] words = extractWords(text);
        bubbleSort(words);
        displaySortedWords(words);
    }

    public static String[] extractWords(String text) {
        // Split the text into words using space and punctuation as delimiters
        String[] words = text.split("[\\s\\p{Punct}]+");
        return words;
    }

    public static void bubbleSort(String[] arr) {
        int n = arr.length;
        boolean swapped;
        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (arr[i - 1].compareToIgnoreCase(arr[i]) > 0) {
                    // Swap arr[i-1] and arr[i]
                    String temp = arr[i - 1];
                    arr[i - 1] = arr[i];
                    arr[i] = temp;
                    swapped = true;
                }
            }
            n--;
        } while (swapped);
    }

    public static void displaySortedWords(String[] words) {
        System.out.println("Words sorted alphabetically:");
        for (String word : words) {
            System.out.println(word);
        }
    }
}

      
  
