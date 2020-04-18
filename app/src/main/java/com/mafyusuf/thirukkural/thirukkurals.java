package com.mafyusuf.thirukkural;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

public class thirukkurals implements Serializable {

    private  String adhigaram;
  private String kurals1,kural2,kural3,kural4,kural5,kural6,kural7,kural8,kural9,kural10;


    public thirukkurals(String topic , String kuralone,String kuraltwo,String kuralthree,String kuralfour,String kuralfive,String kuralsix,
                        String kuralseven,String kuraleeight,String kuralnine,String kuralten
                        ){
        this.adhigaram=topic;
       this.kurals1=kuralone;
       this.kural2=kuraltwo;
       this.kural3=kuralthree;
       this.kural4 =kuralfour;
       this.kural5=kuralfive;
        this.kural6=kuralsix;
        this.kural7=kuralseven;
        this.kural8=kuraleeight;
        this.kural9=kuralnine;
        this.kural10=kuralten;

    }

    public String getAdhigaram() {
        return adhigaram;
    }

    public void setAdhigaram(String adhigaram) {
        this.adhigaram = adhigaram;
    }

    public String getKurals1() {
        return kurals1;
    }

    public void setKurals1(String kurals1) {
        this.kurals1 = kurals1;
    }

    public String getKural2() {
        return kural2;
    }

    public void setKural2(String kural2) {
        this.kural2 = kural2;
    }

    public String getKural3() {
        return kural3;
    }

    public void setKural3(String kural3) {
        this.kural3 = kural3;
    }

    public String getKural4() {
        return kural4;
    }

    public void setKural4(String kural4) {
        this.kural4 = kural4;
    }

    public String getKural5() {
        return kural5;
    }

    public void setKural5(String kural5) {
        this.kural5 = kural5;
    }

    public String getKural6() {
        return kural6;
    }

    public void setKural6(String kural6) {
        this.kural6 = kural6;
    }

    public String getKural7() {
        return kural7;
    }

    public void setKural7(String kural7) {
        this.kural7 = kural7;
    }

    public String getKural8() {
        return kural8;
    }

    public void setKural8(String kural8) {
        this.kural8 = kural8;
    }

    public String getKural9() {
        return kural9;
    }

    public void setKural9(String kural9) {
        this.kural9 = kural9;
    }

    public String getKural10() {
        return kural10;
    }

    public void setKural10(String kural10) {
        this.kural10 = kural10;
    }
    public String toString(){
        return adhigaram;
    }

    //let consider this project and giveme opportunity sir
    //yusuf
}