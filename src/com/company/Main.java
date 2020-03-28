package com.company;

public class Main {

    public static void main(String[] args) {
        Witcher witch = new Witcher("Охотники на монстров", 500, "Геральт из Ривии",
                185, "Мастер по фехтованию", Weapon.SILVER_SWORD,
                new Location("Каэр Морхен", "В горах"));
        witch.magic(5);
        System.out.println(witch.GetInfo());

        System.out.println("________________");
        System.out.println("________________");

        WitcherApprentice personeOne = new WitcherApprentice("Будущие охотники на монстров",
                120, "Цири из Цинтры", 168, "Телепортация",
                Weapon.STILL_SWORD, new Location("Каэр Морхен", "В горах"), 16);
        personeOne.magic("Аард(Сила воздуха)", 3);
        System.out.println(personeOne.GetInfo());

        System.out.println("________________");
        System.out.println("________________");

        WitcherApprentice personeTwo = new WitcherApprentice("Изгнан из школы",
                3000, "Кагыр их Вэнденбурга", 193,
                "Физические способности и Черная магия", Weapon.STILL_SWORD, new Location("Нильфгаард", "Замок"), 24);
        personeTwo.magic("Магия крови", 2);
        System.out.println(personeTwo.GetInfo());

    }
}
