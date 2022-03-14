public class InverseString implements CharSequence {
  private CharSequence original;
  private String inverse;

  public InverseString(CharSequence sequence) {
    this.original = sequence;
    inverse = "";

    for(int i=sequence.length()-1; i>=0; i--){
      inverse += sequence.charAt(i);
    }
  }

  @Override
  public int length() {
    return inverse.length();
  }

  @Override
  public char charAt(int index) {
    return inverse.charAt(index);
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    return inverse.subSequence(start, end);
  }

  @Override
  public String toString() {
    return inverse;
  }
}