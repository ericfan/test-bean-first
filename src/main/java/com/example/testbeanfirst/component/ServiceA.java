package com.example.testbeanfirst.component;

import org.springframework.stereotype.Component;

public class ServiceA {

    private String clazz;

    private String title;

    public ServiceA(String clazz, String title) {
        this.clazz = clazz;
        this.title = title;
    }

    public String getClazz() {
        return clazz;
    }

    public void setClazz(String clazz) {
        this.clazz = clazz;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "ServiceA{" +
                "clazz='" + clazz + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
