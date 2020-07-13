package ru.geekbrain.test.oop.at;

public class Start {
    public static void main(String[] args) {
        Runner catTom = new Cat ("Tom", 8, 6);
        Runner catLarry = new Cat ("Bars", 8, 4);
        Runner catBoris = new Cat ("Filip", 13, 5);

        Runner humanMax = new Human ("Max", 15, 5);
        Runner humanAnna = new Human ("Inna", 12, 3);
        Runner humanAlex = new Human ("Alex", 16, 5);

        Runner robotVally = new Robot ("Vally", 14, 3);
        Runner robotEva = new Robot ("Eva", 12, 2);
        Runner robotBender = new Robot ("Bender", 19, 7);

        Runner[] runners = {catTom, catLarry, catBoris, humanMax, humanAnna, humanAlex, robotVally, robotEva, robotBender};


        Obstacles wall = new Wall (10);
        Obstacles wall1 = new Wall (12);
        Obstacles wall2 = new Wall (2);

        Obstacles treadmill = new Treadmill (12);
        Obstacles treadmill1 = new Treadmill (13);
        Obstacles treadmill2 = new Treadmill (14);

        Obstacles[] obstacles = {wall, wall1, wall2, treadmill, treadmill1, treadmill2};


        System.out.println ("Старт!");
        for (int i = 0; i < obstacles.length; i++) {
            System.out.println ("\n\nИспытание " + (i + 1));

            for (Runner runner : runners) {
                if (runner.getSuccess ()) {
                    System.out.println ("------------");
                    obstacles[i].check (runner);
                }

            }
        }
    }
}