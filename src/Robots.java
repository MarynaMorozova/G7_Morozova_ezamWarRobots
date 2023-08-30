import java.util.Random;

public class Robots {
    private int healthRobot = 100;
    private String nameRobot;
    private String getShootRandomAlf = "QWEASDZXC";

    public Robots(String nameRobot) {
        this.nameRobot = nameRobot;
        setGetShootRandomAlf(upSetRandomAlf(getShootRandomAlf));
        setHelthRobot(healthRobot);
    }

    public String getGetShootRandomAlf() {
        return this.getShootRandomAlf;
    }

    public void setGetShootRandomAlf(String getShootRandomAlf) {
        this.getShootRandomAlf = getShootRandomAlf;
    }

    public int getHealthRobot() {
        return healthRobot;
    }

    public int setHelthRobot(int healthRobot) {
        this.healthRobot = healthRobot;
        return healthRobot;
    }

    public String getNameRobot() {
        return nameRobot;
    }

    public void setNameRobot(String nameRobot) {
        this.nameRobot = nameRobot;
    }

    private static String upSetRandomAlf(String getShootRandomAlf) {
        String alphabet = getShootRandomAlf;
        String alShoot = "";
        for (int i = 0; i < 5; i++) {
            int randIdx = new Random().nextInt(alphabet.length());
            char randChar = alphabet.charAt(randIdx);
            alphabet = alphabet.replace(String.valueOf(randChar), "");
            alShoot = alShoot + randChar;
        }
        return alShoot;
    }

    public void containsChar(char args) {
        String args1 = "" + args;
        int indexM = this.getGetShootRandomAlf().indexOf(args1); // Пошук символу у вбивчому рядку
        if (indexM == -1) {
            System.out.println("Промазав");
            System.out.println(args);
            System.out.println(this.getGetShootRandomAlf());
        } else {
            System.out.println("Влучив");
            this.setGetShootRandomAlf(this.getGetShootRandomAlf().replace(args1, ""));
            this.setHelthRobot(this.getHealthRobot() - 20);
//            System.out.println(args);
//            System.out.println(this.getGetShootRandomAlf());//вбивчи кнопки
        }
    }
}

