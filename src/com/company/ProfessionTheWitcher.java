package com.company;

public class ProfessionTheWitcher {
    private String profession;
    private int howMuchMoneyTheyGet;

    public ProfessionTheWitcher() {

    }

    public ProfessionTheWitcher(String profession, int howMuchMoneyTheyGet) {
        this.profession = profession;
        this.howMuchMoneyTheyGet = howMuchMoneyTheyGet;
    }

    public String getProfession() {
        return profession;
    }

    public int getHowMuchMoneyTheyGet() {
        return howMuchMoneyTheyGet;
    }


    public String GetInfo() {
        return "Профессия Ведьмаков: " + profession + "\n" +
                "Сколько получают за заказ - " + howMuchMoneyTheyGet + " сом" + " \n";

    }
}
