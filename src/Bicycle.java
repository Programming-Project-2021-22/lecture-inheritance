public class Bicycle {
  int speed = 0;
  int gear = 1;

  void changeGear(int newValue) {
    gear = newValue;
  }

  void speedUp(int increment) {
    speed = speed + increment;
  }

  void applyBrakes(int decrement) {
    speed = speed - decrement;
  }

  @Override
  public String toString()  {
    return "speed:" + speed + ", gear:" + gear;
  }
}