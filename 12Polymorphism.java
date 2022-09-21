class Car{
  public void displayInfo() {
    System.out.println("Common Car");
  }
}

class Bmw extends Car{
  @Override
  public void displayInfo() {
    System.out.println("Bmw Car");
  }
}

class Main {
  public static void main(String[] args) {
    Bmw j1 = new Bmw();
    j1.displayInfo();
    Car l1 = new Car();
    l1.displayInfo();
  }
}
