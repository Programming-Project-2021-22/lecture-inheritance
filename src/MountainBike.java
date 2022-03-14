public class MountainBike extends Bicycle {
  int seatHeight;

  public int getSeatHeight() {
    return seatHeight;
  }

  public MountainBike setSeatHeight(int seatHeight) {
    this.seatHeight = seatHeight;
    return this;
  }

  @Override
  void changeGear(int newValue) {
    if (newValue < 1 || newValue > 4)
      return;

    super.changeGear(newValue);
  }

  @Override
  public String toString() {
    return super.toString() + ", " + "seatHeight: " + seatHeight;
  }
}
