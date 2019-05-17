package com.odinrossy.pismlab8;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;

@ManagedBean
@SessionScoped
public class MainBean implements Serializable {

    private static final long serialVersionUID = 1L;

    private String symbols;

    private String text;

    private int count;

    public String getSymbols() {
        return symbols;
    }

    public void setSymbols(String symbols) {
        this.symbols = symbols;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getCount() {
        int counter = 0;
        String[] stringsArr = text.split("");
        for (String s : stringsArr) {
            if (s.contains(symbols)) {
                counter++;
            }
        }
        return counter;
    }

    public void setCount(int count) {
        this.count = count;
    }
}