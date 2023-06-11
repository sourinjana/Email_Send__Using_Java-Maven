package org.sourin;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("Sending Mail From Sourin ");

        MailHandler mailHandler=new MailHandler();
        mailHandler.sendMail();

        System.out.println("Sending Mail Successfully !!");
    }
}