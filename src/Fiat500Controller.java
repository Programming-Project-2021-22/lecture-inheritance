class Fiat500Controller implements CarController {
  private double speed = 0;

  @Override
  public void accelerate(double targetSpeed) {
    this.speed = Math.min(targetSpeed, 100);
    System.out.println("Accelerating car to " + speed + " km/h.");
  }

  @Override
  public double getCurrentSpeed() {
    return this.speed;
  }
}