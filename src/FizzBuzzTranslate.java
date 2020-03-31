public class FizzBuzzTranslate {

    public static final String FIZZ_BUZZ = "FizzBuzz";
    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";

    public static String translate(int number) {
        String translate = "";
        if (number > 0) {
            boolean isNumberDividedBy3 = number % 3 == 0;
            boolean isNumberDividedBy5 = number % 5 == 0;
            if (isNumberDividedBy3 && isNumberDividedBy5) {
                translate = FIZZ_BUZZ;
            } else if (isNumberDividedBy3) {
                translate = FIZZ;
            } else if (isNumberDividedBy5) {
                translate = BUZZ;
            } else {
                if (isNumberHave3And5(number)) {
                    translate = FIZZ_BUZZ;
                } else if (isNumberHave3(number)) {
                    translate = FIZZ;
                } else if (isNumberHave5(number)) {
                    translate = BUZZ;
                } else {
                    translate = readNumber(number);
                }
            }
            return translate;
        } else {
            throw new UnsupportedOperationException();
        }
    }

    private static String readNumber(int number) {
        String stringNumber = String.valueOf(number);
        int lengthNumber = stringNumber.length();
        String translate;
        String readNumberString = "";
        for (int i = 0; i < lengthNumber; i++) {
            switch (stringNumber.substring(i, i + 1)) {
                case "1":
                    readNumberString += "mot ";
                    break;
                case "2":
                    readNumberString += "hai ";
                    break;
                case "4":
                    readNumberString += "bon ";
                    break;
                case "6":
                    readNumberString += "sau ";
                    break;
                case "7":
                    readNumberString += "bay ";
                    break;
                case "8":
                    readNumberString += "tam ";
                    break;
                case "9":
                    readNumberString += "chin ";
                    break;
            }
        }
        translate = readNumberString.trim();
        return translate;
    }

    private static boolean isNumberHave3And5(int number) {
        String stringNumber = String.valueOf(number);
        int lengthNumber = stringNumber.length();
        int count = 0;
        for (int i = 0; i < lengthNumber; i++) {
            if (stringNumber.substring(i, i + 1).equals("3")) {
                count++;
                break;
            }
        }
        for (int i = 0; i < lengthNumber; i++) {
            if (stringNumber.substring(i, i + 1).equals("5")) {
                count++;
                break;
            }
        }
        if (count == 2) {
            return true;
        } else {
            return false;
        }
    }

    private static boolean isNumberHave3(int number) {
        String stringNumber = String.valueOf(number);
        int lengthNumber = stringNumber.length();
        for (int i = 0; i < lengthNumber; i++) {
            if (stringNumber.substring(i, i + 1).equals("3")) {
                return true;
            }
        }
        return false;
    }

    private static boolean isNumberHave5(int number) {
        String stringNumber = String.valueOf(number);
        int lengthNumber = stringNumber.length();
        for (int i = 0; i < lengthNumber; i++) {
            if (stringNumber.substring(i, i + 1).equals("5")) {
                return true;
            }
        }
        return false;
    }
}
