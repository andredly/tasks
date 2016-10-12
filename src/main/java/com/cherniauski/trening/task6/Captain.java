package com.cherniauski.trening.task6;

class Captain{
    private String name;
    private int experience;
    private NuclearMarine nuclearMarine;

    Captain(String name, int experience) {
        this.name = name;
        this.experience = experience;
    }

    public NuclearMarine getNuclearMarine() {
        return nuclearMarine;
    }

    void setNuclearMarine(NuclearMarine nuclearMarine) {
        this.nuclearMarine = nuclearMarine;
    }

    public String getName() {
        return name;
    }

    public int getExperience() {
        return experience;
    }

    void command(int speed) throws InterruptedException {
        System.out.println("Captain: Start engine!");
        Thread.sleep(2000);
        nuclearMarine.startEngine();
        System.out.println("Captain: Speed "+speed+" knots!");
        Thread.sleep(2000);
        nuclearMarine.setSpeed(speed);
        System.out.println("Captain: Marine start!");
        Thread.sleep(2000);
        new Thread(nuclearMarine).start();
    }
}