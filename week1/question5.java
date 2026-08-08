class MovieReview {

    void classifyWordLengths(String review) {

        String[] words = review.split(" ");

        int shortCount = 0;
        int mediumCount = 0;
        int longCount = 0;

        for (int i = 0; i < words.length; i++) {

            int length = words[i].length();

            if (length >= 1 && length <= 4) {
                shortCount++;
            }
            else if (length >= 5 && length <= 8) {
                mediumCount++;
            }
            else {
                longCount++;
            }
        }

        System.out.println("Short: " + shortCount
                + " | Medium: " + mediumCount
                + " | Long: " + longCount);
    }}
    class question5{
    public static void main(String[] args) {

        String review = "This movie was absolutely fantastic and thrilling";

        MovieReview obj = new MovieReview();

        obj.classifyWordLengths(review);
    }
}