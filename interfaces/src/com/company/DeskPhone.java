package com.company;

public class DeskPhone implements ITelephone{
    private  int myNumber;
    private  boolean isRingning;

    public DeskPhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        System.out.println("No action taken, desk phone does not on");



    }

    @Override
    public void dial(int phoneNumber) {
        System.out.println("Now ringining "+ phoneNumber+"call on the number");

    }

    @Override
    public void answer() {
        if(isRingning){
            System.out.println("Answering the desk phone");
            isRingning=false;
        }

    }

    @Override
    public boolean callPhone(int phoneNumber) {

        if(phoneNumber==myNumber){
            isRingning=true;
            System.out.println("Ring Ring");
        }
        else{
            isRingning=false;
        }
        return isRingning;
    }

    @Override
    public boolean isRinging() {
        return isRingning;
    }
}
