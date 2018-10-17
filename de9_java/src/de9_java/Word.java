/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de9_java;

/**
 *
 * @author Dell
 */
public class Word {
    public Integer id;
    public String en;
    public String vn;
    
    public Word(){
        
    }

    public Word(Integer id, String en, String vn) {
        this.id = id;
        this.en = en;
        this.vn = vn;
    }
    
    public void hienthi(){
        System.out.println("id: "+this.getId());
        System.out.println("en: "+this.getEn());
        System.out.println("vn: "+this.getVn());
    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEn() {
        return en;
    }

    public void setEn(String en) {
        this.en = en;
    }

    public String getVn() {
        return vn;
    }

    public void setVn(String vn) {
        this.vn = vn;
    }
    
}
