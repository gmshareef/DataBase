package com.database;

import com.database.dao.Dao;
import com.database.datastore.DataStore;
import com.database.manager.Manager;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Manager manager = new Manager();
//        manager.printDataBase();
//        manager.dataBaseList();
//        manager.searchDataBase();
//        manager.updateDataBase();
//        manager.deleteDataBase();
//        manager.dataBaseList();
        Scanner sc = new Scanner(System.in);
        int Choice = 0;

        do {
            System.out.println("Please enter your choice");
            System.out.println("1 : Add");
            System.out.println("2 : Display");
            System.out.println("3 : Update");
            System.out.println("4 : Search");
            System.out.println("5 : Delete");
            Choice = sc.nextInt();

            if (Choice==1){
                System.out.println("Please enter details to add record");
                System.out.println("Enter Id");
                int id = sc.nextInt();
                System.out.println("Enter Name");
                String name = sc.next();
                System.out.println("Enter Cost");
                int cost = sc.nextInt();
                manager.setDataBase(id,name,cost);
            }

            if (Choice==2){
//                System.out.println("Displaying all records");
                manager.dataBaseList();
            }

            if (Choice==3){
                System.out.println("Please enter details to update a record");
                System.out.println("Enter Id");
                int id = sc.nextInt();
                System.out.println("Enter Name");
                String name = sc.next();
                System.out.println("Enter Cost");
                int cost = sc.nextInt();
                manager.updateDataBase(id,name,cost);
            }

            if (Choice==4){
                System.out.println("Enter Id");
                int id = sc.nextInt();
                manager.searchDataBase(id);
            }

            if (Choice==5){
                System.out.println("Enter Id");
                int id = sc.nextInt();
                manager.deleteDataBase(id);
                manager.dataBaseList();
            }

        }while (Choice != 6);

    }
}
