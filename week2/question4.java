class ISBNValidator {

    String normalizeCode(String raw) {

        raw = raw.trim();

        String publisher = raw.substring(0, 3).toUpperCase();
        String rest = raw.substring(3);

        return publisher + rest;
    }

    String validateAndFormat(String code) {

        // Check length
        if (code.length() != 13) {
            return "Invalid: wrong length";
        }

        // Check first 3 characters are letters
        for (int i = 0; i < 3; i++) {

            if (!Character.isLetter(code.charAt(i))) {
                return "Invalid: publisher code must be 3 letters";
            }
        }

        // Check remaining 10 characters are digits
        for (int i = 3; i < 13; i++) {

            if (!Character.isDigit(code.charAt(i))) {
                return "Invalid: body must contain only digits";
            }
        }

        // Get year and catalog number
        String year = code.substring(3, 7);
        String catalog = code.substring(7);

        // Build formatted output
        StringBuilder result = new StringBuilder();

        result.append("[");
        result.append(code.substring(0, 3));
        result.append("] YEAR: ");
        result.append(year);
        result.append(" | CATALOG: ");
        result.append(catalog);

        return result.toString();
    }}


    public class question4{
    public static void main(String[] args) {

        ISBNValidator obj = new ISBNValidator();

        String raw = " pen2026004251 ";

        String normalized = obj.normalizeCode(raw);

        System.out.println(obj.validateAndFormat(normalized));
    }
}