package com.company;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss(500, 50);
        boss.weapon.setNameWeapon(" AKM ");
        boss.weapon.setTypeWeapon(" Штурмовая винтовка ");
        System.out.println(boss.info());

        Skeleton skeleton = new Skeleton(150, 20, 50);
        skeleton.weapon.setTypeWeapon(" Лук ");
        skeleton.weapon.setNameWeapon(" Шнитт-лук ");
        System.out.println(skeleton.info());

        Skeleton skeleton1 = new Skeleton(150, 21, 49);
        skeleton1.weapon.setTypeWeapon(" Лук ");
        skeleton1.weapon.setNameWeapon(" Лук-порей ");
        System.out.println(skeleton1.info());
    }
}
