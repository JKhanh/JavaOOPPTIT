/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ptit.q1workshop;

/**
 *
 * @author anh_dep_trai
 */
public class IntIPhoneNumber extends PhoneNumber {
    int maQuocGia;

    public IntIPhoneNumber() {
    }
    
    public IntIPhoneNumber(int maVung, int sDT, int maQuocGia){
        super(maVung, sDT);
        this.maQuocGia = maQuocGia; 
    }

    public int getMaQuocGia() {
        return maQuocGia;
    }

    public void setMaQuocGia(int maQuocGia) {
        this.maQuocGia = maQuocGia;
    }

    @Override
    public String toString() {
        return maQuocGia + "-" + getMaVung() + "-" + getsDT(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
