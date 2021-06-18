package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private  static Scanner  scan = new Scanner(System.in);
    private  static  GroceryList groceryList=new GroceryList();

    public  static void main (String[] args){
        boolean quit= false;
        int choice =0;
         printInstructions();
         while(!quit){
             System.out.println("ENter your choices");
             choice=scan.nextInt();
             scan. nextLine();

             switch ((choice )){
                 case 0:
                     printInstructions();
                     break;
                 case 1:
                     groceryList.printGroceryList();
                     break;
                 case 2:
                     addItem();
                     break;
                 case 3:
                     modifyItem();
                     break;

                 case 4:
                     removeItem();
                     break;
                 case 5:
                     searchItem();
                     break;
                 case 6:
                     quit=true;
                     break;

             }
         }
    }


    public static  void printInstructions(){
     System.out.println("\n Press");
        System.out.println("\t 0- to print choice options");
        System.out.println("\t 1- to print the list of grocery items");
        System.out.println("\t 2- to add an item in the list");
        System.out.println("\t 3- to modify an item in the list");
        System.out.println("\t 4- to remove an item in the list");
        System.out.println("\t 5- to search for an item in the list");
        System.out.println("\t 6- to quit the application");



    }


    public  static void addItem(){
        System.out.println("please enter grocery item");
        groceryList.addGroceryItem(scan.nextLine());

    }

    public  static  void modifyItem(){
        System.out.println("enter the item number:");
        int itemno= scan.nextInt();
         scan.nextLine();
         System.out.print("ENter the replacement item:");
         String newItem= scan.nextLine();
         groceryList.modifyGroceryList(itemno-1,newItem);

    }

    public  static  void removeItem(){
        System.out.println("enter the item number:");
        int itemno= scan.nextInt();
        scan.nextLine();
        groceryList.removeGroceryList(itemno);
    }

    public static  void searchItem(){
        System.out.println("Item to search for");
        String searchitem= scan.nextLine();
        if(groceryList.findItem(searchitem)!=null){
            System.out.println("Found "+ searchitem+" in our grocery list");

        }
         else{
             System.out.println(searchitem+"not found in the grocery list");
        }
    }


}
