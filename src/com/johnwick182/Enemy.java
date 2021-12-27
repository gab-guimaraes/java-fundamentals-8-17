package com.johnwick182;

import java.util.ArrayList;
import java.util.UUID;

public abstract class Enemy {
    private String name;
    private double life;
    private String weapon;

    public abstract void screamAttack();

    public Enemy(String name, double life, String weapon) {
        this.name = name + UUID.randomUUID();
        this.life = life;
        this.weapon = weapon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLife() {
        return life;
    }

    public void setLife(double life) {
        this.life = life;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }
}

class Boro extends Enemy {
    public Boro(double life, String weapon) {
        super("Boro", life, weapon);
    }

    @Override
    public void screamAttack() {
        System.out.println("I'm Borus and you'll die...");
    }
}

class Zombie extends Enemy {
    public Zombie(double life, String weapon) {
        super("Zombie", life, weapon);
    }

    @Override
    public void screamAttack() {
        System.out.println("uuuuuuh, zombie...");
    }
}


class Abstract {
    public static void main(String[] args) {
        ArrayList<Enemy> enemies = new ArrayList<>();
        Boro b1 = new Boro(19, "knife");
        Zombie z1 = new Zombie(200, "none");
        enemies.add(b1);
        enemies.add(z1);

        for (Enemy e: enemies) {
            System.out.println(e.getName());
            e.screamAttack();
        }


    }
}
