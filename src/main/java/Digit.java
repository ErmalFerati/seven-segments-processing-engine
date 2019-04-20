public class Digit {

    public Digit(Value value) {
        this.value = value;
    }

    private Value value;

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return String.valueOf(value.getParsedValue());
    }
}
