public enum Value {
  ZERO("0"),
  ONE("1"),
  TWO("2"),
  THREE("3"),
  FOUR("4"),
  FIVE("5"),
  SIX("6"),
  SEVEN("7"),
  EIGHT("8"),
  NINE("9"),
  UNDEFINED("UNDEFINED");

  Value(String parsedValue) {
    this.parsedValue = parsedValue;
  }

  private String parsedValue;

  public String getParsedValue() {
    return this.parsedValue;
  }
}
