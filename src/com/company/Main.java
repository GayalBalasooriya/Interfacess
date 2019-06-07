package com.company;

public class Main {

    public static void main(String[] args) {
        ITelephone timsphone;
        timsphone = new DeskPhone(123456);
        timsphone.powerOn();
        timsphone.callPhone(123456);
        timsphone.answer();

        timsphone = new MobilePhone(234567);
        timsphone.powerOn();
        timsphone.callPhone(234567);
        timsphone.answer();
    }
}
