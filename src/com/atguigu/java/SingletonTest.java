package com.atguigu.java;

/**
 * @author msstart
 * @create 2018-08-10 19:17
 */
public class SingletonTest {

    public static void main(String[] args) {

        Bank bank = Bank.getInstance();
        Bank bank1 = Bank.getInstance();
        Bank bank2 = Bank.getInstance();
        System.out.println(bank);
        System.out.println(bank1);
        System.out.println(bank2);
        System.out.println("----------------------");
        Bank2 instance = Bank2.getInstance();
        Bank2 instance1 = Bank2.getInstance();
        Bank2 instance2 = Bank2.getInstance();
        System.out.println(instance);
        System.out.println(instance1);
        System.out.println(instance2);
    }

}

class Bank{
    private Bank(){}
    private static Bank bank = new Bank();
    public static Bank getInstance(){
        return bank;
    }
}

class Bank2{
    private Bank2(){}
    private static Bank2 bank = null;
    public static Bank2 getInstance(){
        if (bank == null){
            bank = new Bank2();
        }
        return bank;
    }
}