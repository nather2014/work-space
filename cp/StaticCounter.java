public class StaticCounter {

  static int counter = 0;

  StaticCounter() {
    counter++;
  }

  public static void main(String[] args) {
    new StaticCounter();
    new StaticCounter();
    System.out.println(new StaticCounter().counter);
  }

}
