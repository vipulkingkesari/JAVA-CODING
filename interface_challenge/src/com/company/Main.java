package com.company;

import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

    player tim=new player("tim",10,15);
    System.out.println(tim.toString());
    saveObject(tim);

    tim.setHitpoints(8);
    System.out.println(tim);
    tim.setWeapon("Stormbringer");
    saveObject(tim);
    loadObject(tim);
    System.out.println(tim);


    Isaveable werwolf=new monster("werwolf",20,40);
    System.out.println(werwolf);
    saveObject(werwolf);


    }


    public static ArrayList<String> readvalues() {


        ArrayList<String> values = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("choose\n" + "1 to enter a string\n" + "0 to quit");
        while (!quit) {
            System.out.println("choose an option");
            int choice = scanner.nextInt();
            scanner.next();
            switch (choice) {
                case 0:
                    quit = true;
                    break;

                case 1:
                    System.out.println("Enter a string");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }

        return values;
    }


    public static void saveObject(Isaveable objectToSave){
        for(int i=0;i<objectToSave.write().size();i++){
            System.out.println("Saving "+objectToSave.write().get(i) +"to Storage device");

        }
    }

    public static void loadObject(Isaveable objectToLoad){
        ArrayList<String> values=readvalues();

        objectToLoad.read(values);
    }



















}



