class Runner {

  public static void main(String[] args) {
    Vehicle v = new Vehicle();
    v.setLicensePlate("ABC");
    System.out.println(v.getLicensePlate());

    Car c = new Car();
    c.setLicensePlate("DEF");
    System.out.println(c.getLicensePlate());
    c.numberOfSeats = 5;
    System.out.println(c.numberOfSeats);
  }

}