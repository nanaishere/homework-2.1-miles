package com.company;

public class BonusMilesService {
    public int calculate(int price) {

        int mile = 20;

        int totalmiles = price / mile;

        return totalmiles;
    }
}
