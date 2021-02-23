package com.database.manager;

import com.database.dao.Dao;
import com.database.entities.DataBase;

import java.util.ArrayList;
import java.util.List;

public class Manager {
    Dao dao = new Dao();
  List<DataBase> list = dao.dataBaseList();

    public void printDataBase(){
        dao.printDataBase();
    }
    public void dataBaseList(){
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public void searchDataBase() {
        System.out.println("Search database");
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == 111) {
                System.out.println(list.get(i));
            }
        }
    }

    public void updateDataBase() {
        System.out.println("Update record");
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId()==111) {
                list.get(i).setName("Gem");
                list.get(i).setCost(20000);
                System.out.println(list.get(i));
            }
        }
    }
    public void deleteDataBase() {
        System.out.println("Delete record");
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId()==113) {
                list.remove(i);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId()!=113) {
                System.out.println("Record deleted");
                break;
            }
        }
    }

}
