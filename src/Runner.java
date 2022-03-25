class Runner {

  public static Sortable getBiggest(Sortable s1, Sortable s2, Sortable s3) {
    Sortable biggest = s1;

    if (s2.isBiggerThan(biggest) > 0)
      biggest = s2;

    if (s3.isBiggerThan(biggest) > 0)
      biggest = s3;

    return biggest;
  }

  public static void main(String[] args) {
    Building b1 = new Building(20);
    Building b2 = new Building(80);
    Building b3 = new Building(60);

    Building tallestBuilding = (Building) getBiggest(b1, b2, b3);
    System.out.println("The tallest building is " +
            tallestBuilding.getHeight() + "m high.");

    Land l1 = new Land(20, 30);
    Land l2 = new Land(10, 5);
    Land l3 = new Land(25, 25);

    Land biggestLand = (Land) getBiggest(l1, l2, l3);
    System.out.println("The biggest land is " + biggestLand.getArea() + "m2 (" +
            biggestLand.getLength() + "x" + biggestLand.getWidth()+").");

  }

}