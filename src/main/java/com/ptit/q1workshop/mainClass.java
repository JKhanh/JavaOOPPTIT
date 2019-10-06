package com.ptit.q1workshop;

import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author anh_dep_trai
 */
public class mainClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Set<PhoneNumber> phoneSet = new HashSet<>();
        Set<IntIPhoneNumber> InphoneSet = new HashSet<>();
        HashMap phoneMap = new HashMap();
        while(true){
            System.out.println("1.Them sdt moi.");
            System.out.println("2.Tim sdt theo ma vung.");
            System.out.println("3.Liet ke sdt.");
            System.out.println("4.Tinh tong sdt theo tung vung.");
            System.out.println("5.Tim kiem theo co duoi.");
            System.out.print("Nhap lua chon: ");
            int choose = input.nextInt();
            input.nextLine();
            switch(choose){
                case 1:
                    System.out.println("1.Noi vung");
                    System.out.println("2.Quoc Te");
                    System.out.print("Chon loai so dien thoai: ");
                    choose = input.nextInt();
                    input.nextLine();
                    switch(choose){
                        case 1:
                            System.out.print("Nhap so dien thoai: ");
                            String sdt = input.nextLine();
                            while(!sdt.matches("\\d{3,4}-\\d+")){
                                System.out.println("Dinh dang sai. Moi nhap lai:");
                                System.out.print("Nhap so dien thoai: ");
                                sdt = input.nextLine();
                            }
                            int space = sdt.indexOf('-');
                            int maVung = Integer.parseInt(sdt.substring(1,space));
                            int so = Integer.parseInt(sdt.substring(space+1));
                            phoneSet.add(new PhoneNumber(maVung, so));
                            if(phoneMap.containsKey(maVung)) {
                                int soMV = (int)phoneMap.get(maVung);
                                System.out.println("add more");
                                phoneMap.put(maVung, soMV+1);
                            }
                            else{ 
                                System.out.println("add new");
                                phoneMap.put(maVung, 1);
                            }
                            break;
                        case 2:
                            System.out.print("Nhap so dien thoai: ");
                            sdt = input.nextLine();
                            while(!sdt.matches("\\d{2}-\\d{2,3}-\\d+")){
                                System.out.println("Dinh dang sai. Moi nhap lai:");
                                System.out.print("Nhap so dien thoai: ");
                                sdt = input.nextLine();
                            }
                            int maQG = Integer.parseInt(sdt.substring(0,2));
                            space = sdt.lastIndexOf('-');
                            maVung = Integer.parseInt(sdt.substring(3,space));
                            so = Integer.parseInt(sdt.substring(space+1));
                            System.out.println(maQG + " " + maVung + " " + so);
                            InphoneSet.add(new IntIPhoneNumber(maVung, so, maQG));
                            if(phoneMap.containsKey(maVung)) {
                                int soMV = (int)phoneMap.get(maVung);
                                phoneMap.put(maVung, soMV++);
                            }
                            else phoneMap.put(maVung, 1);
                            break;
                    }
                    break;
                case 2:
                    System.out.print("Nhap ma vung: ");
                    int maVung = input.nextInt();
                    for(PhoneNumber i : phoneSet){
                        if(i.getMaVung() == maVung) System.out.println(i);
                    }
                    for(IntIPhoneNumber i : InphoneSet){
                        if(i.getMaVung() == maVung) System.out.println(i);
                    }
                    break;
                case 3:
                    System.out.println("1.Chon so trong nuoc.");
                    System.out.println("2.Chon so quoc te.");
                    System.out.println("3.Ca hai.");
                    System.out.print("Chon yeu cau: ");
                    choose = input.nextInt();
                    if(choose == 1){
                        for(PhoneNumber i : phoneSet) System.out.println(i);
                    }
                    else if(choose == 2)
                        for(IntIPhoneNumber i : InphoneSet) System.out.println(i);
                    else {
                        for(PhoneNumber i : phoneSet) System.out.println(i);
                        for(IntIPhoneNumber i : InphoneSet) System.out.println(i);
                    }
                    break;
                case 4:
                    Set mvSet = phoneMap.entrySet();
                    Iterator i = mvSet.iterator();
                    while(i.hasNext()){
                        Map.Entry me = (Map.Entry)i.next();
                        System.out.println("Ma vung " + me.getKey() + " co: " + me.getValue());
                    }
                    break;
                    default: System.exit(0);
            }
        }
    }
}
