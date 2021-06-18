package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Customer customer =new Customer("Tim",54.56);
        Customer anotherCustomer;
        anotherCustomer=customer;
        anotherCustomer.setBalance(12.18);
        System.out.println("Balance for customer" + customer.getName()+" is "+customer.getBalance());

    }
}
