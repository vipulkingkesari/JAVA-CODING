package com.company;

public class MobilePhone implements ITelephone {
    private  int myNumber;
    private  boolean isRingning;
    private boolean isOn=false;

    public MobilePhone (int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        isOn=true;
        System.out.println("No action taken, desk phone does not on");



    }

    @Override
    public void dial(int phoneNumber) {
        if(isOn) {
            System.out.println("Now ringining " + phoneNumber + "call on the number");
        }
        else{
            System.out.println("phone is switched off");
        }


    }

    @Override
    public void answer() {
        if(isRingning){
            System.out.println("Answering the mobile phone");
            isRingning=false;
        }

    }

    @Override
    public boolean callPhone(int phoneNumber) {

        if(phoneNumber==myNumber && isOn){
            isRingning=true;
            System.out.println("Melody Ring");
        }
        else{
            isRingning=false;
            System.out.println("Mobile phone not on or number different");
        }
        return isRingning;
    }

    @Override
    public boolean isRinging() {
        return isRingning;
    }

}
