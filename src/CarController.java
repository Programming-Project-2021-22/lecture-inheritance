interface CarController extends VehicleController {

  // constant declarations
  double MAX_SPEED = 100;
  double SAFE_SPEED = 80;

  // abstract methods
  void accelerate(double targetSpeed);

  double getCurrentSpeed();

  // default method
  default void evaluateSpeed() {
    if (this.getCurrentSpeed() <= SAFE_SPEED)
      System.out.println("The car is at a safe speed: " + getCurrentSpeed() + " km/h");
    else
      System.out.println("The car is at a risky speed: " + getCurrentSpeed() + " km/h");
  }

  // static method
  static void isSpeedAllowed(double speed) {
    if (speed <= MAX_SPEED)
      System.out.println(speed + " km/h is allowed.");
    else
      System.out.println(speed + " km/h is not allowed.");
  }

}