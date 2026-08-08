class WordReversal {

    String reverseEachWord(String sentence) {

        String[] words = sentence.split(" ");

        String result = "";

        for (int i = 0; i < words.length; i++) {

            StringBuilder sb = new StringBuilder(words[i]);

            sb.reverse();

            result = result + sb;

            if (i < words.length - 1) {
                result = result + " ";
            }
        }

        return result;
    }}

    class question2{
    public static void main(String[] args) {

        WordReversal obj = new WordReversal();

        String sentence = "hello club";

        String answer = obj.reverseEachWord(sentence);

        System.out.println(answer);
    }
}