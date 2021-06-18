package com.company;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> placesTovisit = new LinkedList<String>();

        addInOrder(placesTovisit,"Sydney");
        addInOrder(placesTovisit,"melboune");
        addInOrder(placesTovisit,"Brisbane");
        addInOrder(placesTovisit,"Perth");
        addInOrder(placesTovisit,"Canberra");
        addInOrder(placesTovisit,"Adelaide");
        addInOrder(placesTovisit,"Darwin");
//        placesTovisit.add("Sydney");
//        placesTovisit.add("Melbourne");
//        placesTovisit.add("Brisbane");
//        placesTovisit.add("perth");
//        placesTovisit.add("Canberra");
//        placesTovisit.add("Adelaide");
//        placesTovisit.add("Darwin");

        printList(placesTovisit);

//        placesTovisit.add(1,"Alice Springs");
//        printList(placesTovisit);
//
//        placesTovisit.remove(4);
//        printList(placesTovisit);




    }

    private  static void printList(LinkedList<String> linkedList){
        Iterator<String> i=linkedList.iterator();
        while(i.hasNext()){
            System.out.println("Now visiting" + i.next());

        }
        System.out.println("===================");
    }

    private static boolean addInOrder(LinkedList<String> linkedList,String newCity){
        ListIterator<String> stringListIterator=linkedList.listIterator();
        while(stringListIterator.hasNext()){
            int comparison =stringListIterator.next().compareTo(newCity);
            if(comparison==0){
                //equal , do not add
                System.out.println(newCity +"is already included as a destination");
                return false;
            }
            else if(comparison>0){
                //new city should appear before this one
                //brisbane -> adelaide
                stringListIterator.previous();
                stringListIterator.add(newCity);
            }
            else if (comparison<0){
                //save on next city
            }


        }
        stringListIterator.add(newCity);
        return true;
    }
















}
