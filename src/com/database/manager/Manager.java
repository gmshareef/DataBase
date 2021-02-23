package com.database.manager;

import com.database.dao.Dao;
import com.database.entities.DataBase;

import java.util.ArrayList;
import java.util.List;

public class Manager {
    Dao dao = new Dao();
    List<DataBase> list = dao.dataBaseList();

    public void setDataBase(int id, String name, int cost) {
        dao.setDataBase(id,name,cost);
    }

//    public void printDataBase(){
//        dao.printDataBase();
//    }

    public void dataBaseList(){
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public void searchDataBase(int id) {
//        System.out.println("Search database");
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                System.out.println(list.get(i));
            }
        }
    }

    public void updateDataBase(int id, String name, int cost) {
//        System.out.println("Update record");
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId()==id) {
                list.get(i).setName(name);
                list.get(i).setCost(cost);
                System.out.println(list.get(i));
            }
        }
    }
    public void deleteDataBase(int id) {
//        System.out.println("Delete record");
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId()==id) {
                list.remove(i);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId()!=id) {
                System.out.println("Record deleted");
                break;
            }
        }
    }

}
