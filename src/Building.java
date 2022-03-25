public class Building implements Sortable {
  private int height = 0;

  public Building(int height) {
    setHeight(height);
  }

  public int getHeight() {
    return height;
  }

  public void setHeight(int height) {
    this.height = height;
  }

  @Override
  public int isBiggerThan(Sortable obj) {
    Building otherBuilding = (Building) obj;
    if (getHeight() > otherBuilding.getHeight())
      return 1;
    else
      return 0;
  }

}