public class Land implements Sortable {
  private int width = 0;
  private int length = 0;

  public Land(int width, int length) {
    setWidth(width);
    setLength(length);
  }

  public int getWidth() {
    return width;
  }

  public void setWidth(int width) {
    this.width = width;
  }

  public int getLength() {
    return length;
  }

  public void setLength(int length) {
    this.length = length;
  }

  public int getArea() {
    return getLength() * getWidth();
  }

  @Override
  public int isBiggerThan(Sortable obj) {
    Land otherLand = (Land) obj;
    if (getArea() > otherLand.getArea())
      return 1;
    else
      return 0;
  }

}