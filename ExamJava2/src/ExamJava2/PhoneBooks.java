/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExamJava2;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author hoang
 */
public class PhoneBooks {
    List<Contact> danhBa;
    public PhoneBooks() {
        danhBa = new LinkedList();
    }
    
    public void them() {
        Contact user = new Contact();
        user.nhap();
        boolean flag = false;
        for (Contact item : danhBa) {
            if (item.getPhoneNumber().equals(user.getPhoneNumber())) {
                flag = true;
            }
        }
        if (flag == true) {
            System.err.println("Already have this telephone number");
        } else {
            danhBa.add(user);
            System.err.println("Add successfully");
        }

    }

    public void hienThiAll() {
        if (danhBa.isEmpty()) {
            System.err.println("Address Book is empty");
        } else {
            System.out.println("----------------");
            System.out.printf("%15s %15s\n", "Contact Name", "Phone Number");
            for (Contact user : danhBa) {
                user.hienThi();
            }
            System.out.println("----------------");
        }
    }

    public void timKiem() {
        boolean flag = false;
        if (danhBa.isEmpty()) {
            System.err.println("Address Book is empty");
        } else {
            Scanner sc = new Scanner(System.in);
            String name;
            System.out.print("Enter Name to find : ");
            name = sc.nextLine();
            System.out.println("----------------");
            System.out.println("Result : ");
            System.out.printf("%15s %15s\n", "COntact Name", "Phone Number");
            for (Contact user : danhBa) {
                //System.out.printf("%15s %15s\n", "Ten", "So dien thoai");
                if (user.getName().indexOf(name) >= 0) {
                    user.hienThi();
                    flag = true;
                }
                //System.out.println("----------------");
            }
            System.out.println("----------------");
            if (flag == false) {
                System.err.println("Can't find name");
            }
        }

    }

    public void xoa() {
        if (danhBa.isEmpty()) {
            System.err.println("Address Book is empty");
        } else {
            Scanner sc = new Scanner(System.in);
            String name;
            System.out.print("Enter Name or Phone Number to delete : ");
            name = sc.nextLine();
            //System.out.println("Ket qua tim kiem");
            List<Contact> listXoa = new LinkedList<Contact>();
            //listXoa.clear();
            
            for (Contact user : danhBa) {
                if (user.getName().indexOf(name) >= 0 || user.getPhoneNumber().indexOf(name) >= 0) {
                    listXoa.add(user);
                }
            }
            if(listXoa.isEmpty())
                System.out.println("Can't find Name or Phone Number");
            else
            {
                for (Contact user : listXoa) {
                danhBa.remove(user);
                System.err.println("Delete successfully : " + user.getName() + "- " + user.getPhoneNumber());
            }
            }
            
        }

    }

    public void sua() {
        if (danhBa.isEmpty()) {
            System.err.println("Address Book is empty");
        } else {
            Scanner sc = new Scanner(System.in);
            String name;
            System.out.print("Enter Name to edit : ");
            name = sc.nextLine();
            boolean timthay=false;
            for (Contact user : danhBa) {
                if (user.getName().equals(name)) {
                    String phone;
                    System.out.print("Add new telephone number : ");
                    phone = sc.nextLine();
                    user.setPhoneNumber(phone);
                    System.out.println("Edit successfully");
                    timthay=true;
                } //else {
                //    System.out.println("Khong tim thay ten trong danh ba");
                //}
            }
            if(!timthay)
                System.out.println("Can't find name");
                
        }
    }
}
