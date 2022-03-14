public class Car extends Vehicle {
  int numberOfSeats = 4;

  @Override
  public void setLicensePlate(String lic) {
    super.setLicensePlate("CarPlate: " + lic);
  }
}