class Runner {

  public static void main(String[] args) {
    Bicycle b = new MountainBike();
    b.gear = 6;
    b.speedUp(40);
    System.out.println(b);

    MountainBike mb = new MountainBike();
    mb.setSeatHeight(30);
    mb.gear = 2;
    mb.speedUp(10);
    System.out.println(mb);
  }

}