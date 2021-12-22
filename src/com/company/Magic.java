package com.company;

public class Magic extends Hero implements  HavingSuperAbility{
    int Hp;
    int Attack;
    String Ability;

    public Magic(int heroesHp1, String ability1, int heroesAttack1) {
        super(heroesHp1, ability1, heroesAttack1);
        Ability = ability1;
        Attack = heroesAttack1;
        Hp = heroesHp1;

    }

    @Override
    public void applySuperAbility() {
        System.out.println("Ability " + Ability);
    }
}
