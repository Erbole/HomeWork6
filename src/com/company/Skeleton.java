package com.company;

public class Skeleton extends Boss {
    private int arrows;

    public Skeleton(int health, int damage, int arrows) {
        super(health, damage);
        this.arrows = arrows;
    }

    public int getArrows() {
        return arrows;
    }

    public void setArrows(int arrows) {
        this.arrows = arrows;
    }

    Weapon weapon = new Weapon();

    public Skeleton(int health, int damage) {
        super(health, damage);
    }

    public Skeleton(int health, int damage, Weapon weapon) {
        super(health, damage, weapon);
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public String info() {
        return super.info() + " Тип оружие " + getWeapon().getTypeWeapon() + " Имя оружие " + getWeapon().getNameWeapon() +
                " Стрелы " + getArrows();
    }
}
