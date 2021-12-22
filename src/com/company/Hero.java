package com.company;

public abstract class Hero {
    int HeroesHp;
    int HeroesAttack;
    String HeroesAbility;

    public Hero(int heroesHp, String ability, int heroesAttack) {
        this.HeroesHp = heroesHp;
        this.HeroesAbility = ability;
        this.HeroesAttack = heroesAttack;
    }
}
