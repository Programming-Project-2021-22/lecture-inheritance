public class Hovercraft extends LandVehicle, WaterVehicle {
  void accelerateAndTurn(int targetSpeed, int radius) {
    accelerate(targetSpeed);
    turn(radius);
  }
}
