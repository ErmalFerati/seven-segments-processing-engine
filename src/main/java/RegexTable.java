public final class RegexTable {

  private RegexTable() {
  }

  public final static String ZERO = "\\.[^\\.\\s]\\.[^\\.\\s]\\.[^\\.\\s]{4}";
  public final static String ONE = "\\.{5}[^\\.\\s]\\.{2}[^\\.\\s]";
  public final static String TWO = "\\.[^\\.\\s]\\.{2}[^\\.\\s]{4}\\.";
  public final static String THREE = "\\.[^\\.\\s]\\.{2}[^\\.\\s]{2}\\.[^\\.\\s]{2}";
  public final static String FOUR = "\\.{3}[^\\.\\s]{3}\\.{2}[^\\.\\s]";
  public final static String FIVE = "\\.[^\\.\\s]\\.[^\\.\\s]{2}\\.{2}[^\\.\\s]{2}";
  public final static String SIX = "\\.[^\\.\\s]\\.[^\\.\\s]{2}\\.[^\\.\\s]{3}";
  public final static String SEVEN = "\\.[^\\.\\s]\\.{3}[^\\.\\s]\\.{2}[^\\.\\s]";
  public final static String EIGHT = "\\.[^\\.\\s]\\.[^\\.\\s]{6}";
  public final static String NINE = "\\.[^\\.\\s]\\.[^\\.\\s]{3}\\.{2}[^\\.\\s]";

}
