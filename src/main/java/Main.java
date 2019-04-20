import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) {
        try {
            DigitProcessor digitProcessor = new DigitProcessor();
            digitProcessor.readAndPrintDigits();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
