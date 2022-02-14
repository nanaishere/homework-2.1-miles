package com.company;

public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
    int totalmiles = service.calculate(1000);
        System.out.println(totalmiles+" мили");
    }
}


  
