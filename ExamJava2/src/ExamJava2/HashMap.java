/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExamJava2;

import java.util.Scanner;

/**
 *
 * @author hoang
 */
public class HashMap {
    public static void main(String[] args) {
        PhoneBooks phonebook = new PhoneBooks();
        int menuID = 0;
        do {
            menuID = menu();
            switch (menuID) {
                case 1:
                    phonebook.them();
                    break;
                case 2:
                    phonebook.hienThiAll();
                    break;
                case 3:
                    phonebook.timKiem();
                    break;
                case 4:
                    phonebook.xoa();
                    break;
                case 5:
                    phonebook.sua();
                    break;
                case 6:
                    System.out.println("Exit");
                    break;
            }
        } while (menuID != 6);
    }
    public static int menu() {
        Scanner sc = new Scanner(System.in);
        int menuID = 0;
        while (true) {
            System.out.println("1. Add new contact");
            System.out.println("2. Show all contact");
            System.out.println("3. Find a contact by name");
            System.out.println("4. Delete");
            System.out.println("5. Edit");
            System.out.println("6. Exit");
            try {
                menuID = sc.nextInt();
                if (1 <= menuID && menuID <= 6) {
                    break;
                } else {
                    System.err.println("Select from 1 - 6");
                    //continue;
                }
            } catch (Exception e) {
                sc.nextLine();
                System.err.println("Select from 1 - 6");
            }
        }
        System.out.println("Menu : " + menuID);
        return menuID;
    }   
}
