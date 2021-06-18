package com.company;

import java.util.ArrayList;
import java.util.List;

public class monster implements Isaveable{
    private String name;
    private int hitpoints;
    private int strength;

    public monster(String name, int hitpoints, int strength) {
        this.name = name;
        this.hitpoints = hitpoints;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public int getHitpoints() {
        return hitpoints;
    }

    public int getStrength() {
        return strength;
    }


    @Override
    public String toString() {
        return "monster{" +
                "name='" + name + '\'' +
                ", hitpoints=" + hitpoints +
                ", strength=" + strength +
                '}';
    }


    @Override
    public List<String> write() {
        ArrayList<String>values =new ArrayList<String>();
        values.add(0,this.name);
        values.add(1,""+this.hitpoints);
        values.add(2,""+this.strength);

        return values;

    }

    @Override
    public void read(List<String> savedvalues) {

        if(savedvalues!=null &&savedvalues.size()>0){
            this.name=savedvalues.get(0);
            this.hitpoints=Integer.parseInt(savedvalues.get(1));
            this.strength=Integer.parseInt(savedvalues.get(2));
            //this.weapon=savedvalues.get(3);
        }



    }
}
