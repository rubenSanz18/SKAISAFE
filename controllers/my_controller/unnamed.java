import com.cyberbotics.webots.controller.Robot;

public class HelloWorld {

  public static void main(String[] args) {

    final Robot robot = new Robot();

    while (robot.step(32) != -1)
      System.out.println("Hello World!");
  }
}