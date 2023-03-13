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
public class Contact {
    String name;
    String phoneNumber;

    public Contact() {
    }
    


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Add name : ");
        this.setName(sc.nextLine());
        System.out.print("Add telephone number : ");
        this.setPhoneNumber(sc.nextLine());
    }
    
    public void hienThi() {
        System.out.printf("%15s %15s\n", name, phoneNumber);
//        System.out.println("Ten la : " + this.getName());
//        System.out.println("So dien thoai : " + this.getPhoneNumber());
    }

}
