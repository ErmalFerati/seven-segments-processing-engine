import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DigitProcessor {

    public void readAndPrintDigits() throws FileNotFoundException {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        URL resource = classLoader.getResource("example_1");
        File unparsedFile = new File(resource.getPath());

        List<Digit> digits = buildDigitsFromFile(unparsedFile);
        digits.forEach(System.out::print);
    }

    private List<Digit> buildDigitsFromFile(File file) throws FileNotFoundException {
        List<Digit> digits = new ArrayList<>();

        Scanner sc = new Scanner(file);

        String[] firstLineValues = sc.nextLine().split(" ");
        String[] secondLineValues = sc.nextLine().split(" ");
        String[] thirdLineValues = sc.nextLine().split(" ");

        int valuesLength = firstLineValues.length;

        for (int i = 0; i < valuesLength; i++) {
            String content = firstLineValues[i] + secondLineValues[i] + thirdLineValues[i];
            Digit parsedDigit = new Digit(getSymbolValue(content));
            digits.add(parsedDigit);
        }

        return digits;
    }

    private Value getSymbolValue(String value) {

        if (value.matches(RegexTable.ZERO)) {
            return Value.ZERO;
        } else if (value.matches(RegexTable.ONE)) {
            return Value.ONE;
        } else if (value.matches(RegexTable.TWO)) {
            return Value.TWO;
        } else if (value.matches(RegexTable.THREE)) {
            return Value.THREE;
        } else if (value.matches(RegexTable.FOUR)) {
            return Value.FOUR;
        } else if (value.matches(RegexTable.FIVE)) {
            return Value.FIVE;
        } else if (value.matches(RegexTable.SIX)) {
            return Value.SIX;
        } else if (value.matches(RegexTable.SEVEN)) {
            return Value.SEVEN;
        } else if (value.matches(RegexTable.EIGHT)) {
            return Value.EIGHT;
        } else if (value.matches(RegexTable.NINE)) {
            return Value.NINE;
        }

        return Value.UNDEFINED;
    }
}
