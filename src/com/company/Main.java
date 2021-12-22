package com.company;

public class Main {
    public static void main(String[] args) {
        Warrior Warrior = new Warrior(300, "Dash", 20);
        Magic Magic = new Magic(300, "Mana flow", 20);
        Medic Medic = new Medic(300, "Heal", 20);
        HavingSuperAbility[] Heroes = {Warrior, Magic, Medic};
        for (int i = 0; i < Heroes.length; i++) {
            Heroes[i].applySuperAbility();
        }

    }
}