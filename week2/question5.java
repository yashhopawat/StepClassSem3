import java.util.*;

class WordFrequency {

    void printFilteredWordFrequency(String feedback) {

        // Stop words
        String[] stopWords = {"the", "was", "and", "a", "is", "of", "in"};

        // Convert to lowercase and remove punctuation
        feedback = feedback.toLowerCase();
        feedback = feedback.replace(".", "");
        feedback = feedback.replace(",", "");

        // Split into words
        String[] words = feedback.split("\\s+");

        // Store word and frequency
        HashMap<String, Integer> frequency = new HashMap<>();

        for (int i = 0; i < words.length; i++) {

            boolean isStopWord = false;

            // Check whether current word is a stop word
            for (int j = 0; j < stopWords.length; j++) {

                if (words[i].equals(stopWords[j])) {
                    isStopWord = true;
                    break;
                }
            }

            if (!isStopWord) {

                if (frequency.containsKey(words[i])) {
                    frequency.put(words[i], frequency.get(words[i]) + 1);
                } 
                else {
                    frequency.put(words[i], 1);
                }
            }
        }

        // Convert map entries into a list
        ArrayList<Map.Entry<String, Integer>> list =
                new ArrayList<>(frequency.entrySet());

        // Sort by frequency in descending order
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {

            public int compare(Map.Entry<String, Integer> a,
                               Map.Entry<String, Integer> b) {

                return b.getValue() - a.getValue();
            }
        });

        // Print result
        for (Map.Entry<String, Integer> entry : list) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }}


    public class question5{
    public static void main(String[] args) {

        String feedback =
                "The mentor was great, the session was great and clear.";

        WordFrequency obj = new WordFrequency();

        obj.printFilteredWordFrequency(feedback);
    }
}
