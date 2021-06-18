package com.company;

import java.util.ArrayList;

public class GroceryList {
    private int[] mynumbers = new int[50];
    private ArrayList<String> groceryList= new ArrayList<String>();

    public void addGroceryItem(String item){
        groceryList.add(item);
    }
    public void printGroceryList(){
        System.out.println("You have "+ groceryList.size()+"ITems in your grocery list");
        for (int i =0; i<groceryList.size();i++){
            System.out.println((i+1)+","+ groceryList.get(i));

        }

    }

    public void modifyGroceryList( int position , String newitem){
         groceryList.set(position,newitem);
         System.out.println("ADDED");
    }
    public  void  removeGroceryList( int position){
        String theItem= groceryList.get(position);
        groceryList.remove(position);
    }

    public String findItem(String searchItem){
//        boolean exists= groceryList.contains(searchItem);
        int position = groceryList.indexOf(searchItem);
        if(position>=0){
            return (groceryList.get(position));
        }
        return null;
    }


}
