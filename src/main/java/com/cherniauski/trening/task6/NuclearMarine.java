package com.cherniauski.trening.task6;

/**
 * Created by ivc4 on 12.10.2016.
 */
class NuclearMarine implements Runnable{
    private int countCrew;
    private String name;
    private int displacement;
    private int speed;
    private Captain captain;
    private Engine engine;

    NuclearMarine(String name, int displacement) {
        this.name = name;
        this.displacement = displacement;
        this.engine= new Engine(43000, "T-1000");
    }

    public int getCountCrew() {
        return countCrew;
    }

    void setCountCrew(int countCrew) {
        this.countCrew = countCrew;
    }

    public String getName() {
        return name;
    }


    public int getDisplacement() {
        return displacement;
    }


    public int getSpeed() {
        return speed;
    }

    void setSpeed(int speed) throws InterruptedException {
        System.out.println("Crew: Yes speed: "+speed +" knots!");
        this.speed = speed;
        Thread.sleep(1000);

    }

    public Captain getCaptain() {
        return captain;
    }

    void setCaptain(Captain captain) {
        this.captain = captain;
    }

    @Override
    public void run() {
        System.out.println("Crew: : Yes, marine start!");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String space="";
        for (int i=0;i<10;i++){
            System.out.println("Coast: "+space+" Marine...");
            space=space+".";
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    void startEngine() throws InterruptedException {

        engine.start();
    }

    private class Engine{
        private int power;
        private String model;

        Engine(int power, String model) {
            this.power = power;
            this.model = model;
        }
        void start() throws InterruptedException {
            System.out.println("Crew: Yes, engine running!");
            Thread.sleep(1000);
            System.out.println("Engine DR-DR-DR!");
            Thread.sleep(1000);

        }
    }


}
