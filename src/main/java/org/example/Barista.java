package org.example;

import org.springframework.stereotype.Component;

@Component
public class Barista {
    private String baristaName;
    private int baristaAge;

    public String getBaristaName() {
        return baristaName;
    }

    public void setBaristaName(String baristaName) {
        this.baristaName = baristaName;
    }

    public int getBaristaAge() {
        return baristaAge;
    }

    public void setBaristaAge(int baristaAge) {
        this.baristaAge = baristaAge;
    }
}
