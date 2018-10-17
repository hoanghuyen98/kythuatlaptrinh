/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de9_java;

import java.util.ArrayList;

/**
 *
 * @author Dell
 */
public class Dictionary {
    private ArrayList<Word> arr ;

    public Dictionary() {
        arr = new ArrayList<>();
        arr.add(new Word(1, "hello", "xin chao"));
        arr.add(new Word(2, "bye", "tam biet"));
        arr.add(new Word(3, "hello", "xin chao"));
        arr.add(new Word(4, "bye", "tam biet"));
        arr.add(new Word(5, "hello", "xin chao"));
        arr.add(new Word(6, "cat", "meo"));
        arr.add(new Word(7, "cat", "meo"));
        arr.add(new Word(8, "cat", "meo"));
        arr.add(new Word(9, "cat", "meo"));
        arr.add(new Word(10, "cat", "meo"));
        arr.add(new Word(11, "cat", "meo"));
        
        
    }

    public Dictionary(ArrayList<Word> arr) {
        this.arr = arr;
    }

    public ArrayList<Word> getArr() {
        return arr;
    }

    public void setArr(ArrayList<Word> arr) {
        this.arr = arr;
    }
    
}
