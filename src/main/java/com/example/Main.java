package com.example;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws UnknownHostException, IOException {
        System.out.println("Hello world!");
        System.out.println("inserisci");
        
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter ip");

        String ip = myObj.nextLine();
        System.out.println("inserisci porta del server");
        int porta = myObj.nextInt();
        Socket miSocket = new Socket(ip,porta);

    }
}