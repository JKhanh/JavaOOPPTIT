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
public class PhoneNumber {
    private int maVung;
    private String sDT;

    public PhoneNumber(int maVung, String sDT) {
        this.maVung = maVung;
        this.sDT = sDT;
    }

    public PhoneNumber() {
    }

    public int getMaVung() {
        return maVung;
    }

    public void setMaVung(int maVung) {
        this.maVung = maVung;
    }

    public String getsDT() {
        return sDT;
    }

    public void setsDT(String sDT) {
        this.sDT = sDT;
    }

    @Override
    public String toString() {
        return "0" + maVung + "-" + sDT; //To change body of generated methods, choose Tools | Templates.
    }
}
