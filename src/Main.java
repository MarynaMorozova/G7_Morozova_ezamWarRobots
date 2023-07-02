import java.util.ArrayList;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        System.out.println("Game \"WarRobots\"");
        ArrayList<Robots> listOfRobots = new ArrayList();
        for (int i = 0; i < 2; i++) {
            System.out.println("Enter robot name " + (i + 1));
            String nameRb = Game.getNumberShootConsole();
            listOfRobots.add(new Robots(nameRb));
            System.out.println("Ім'я робота " + (i + 1)+ " " + listOfRobots.get(i).getNameRobot());
            System.out.println("Здоров'я робота " + (i + 1)+ " " + listOfRobots.get(i).getHealthRobot());
            System.out.println("Вбивчи кнопки 5 з 9(QWEASDZXC)");
        }
        do {
            for (int i = 0; i < listOfRobots.size(); i++) {
                System.out.println(("Cтріляють по роботу " + (i + 1) + " " + listOfRobots.get(i).getNameRobot()));
                System.out.println("Exit P");
                String shoots = Game.getNumberShootConsole().toUpperCase(Locale.ROOT);
                char char1 = shoots.charAt(0);
                if (char1 == 'P') {
                    System.out.println("Goodbye)");
                    break;
                }
                listOfRobots.get(i).containsChar(char1);
                if (listOfRobots.get(i).getHealthRobot() <= 0) {
                    System.out.println("Програв робот " + listOfRobots.get(i).getNameRobot() + " " + listOfRobots.get(i).getHealthRobot());
                    listOfRobots.remove(i);
                    System.out.println("Виграв робот " + listOfRobots.get(0).getNameRobot() + " " + listOfRobots.get(0).getHealthRobot());
                    break;
                }
            }
            if (listOfRobots.size() > 1) {
                System.out.println("Здоров'я робота 1 = " + listOfRobots.get(0).getHealthRobot());
                System.out.println("Здоров'я робота 2 = " + listOfRobots.get(1).getHealthRobot());
            }
        } while (listOfRobots.size() > 1);
    }
}