public class Calculator {
  public static double calculateDisplacement(double time, double acceleration, double initialVelocity) {
    return initialVelocity * time + (acceleration * Math.pow(time, 2)) / 2;
  }

  public static double calculateDisplacement(double time, double acceleration) {
    return calculateDisplacement(time, acceleration, 1);
  }

  public static double calculateDisplacement(double time) {
    return calculateDisplacement(time, 1);
  }

  public static void main(String[] args) {
    System.out.println("Distance: " + calculateDisplacement(10, 1, 1));
    System.out.println("Distance: " + calculateDisplacement(10, 1));
    System.out.println("Distance: " + calculateDisplacement(10));
  }

}
