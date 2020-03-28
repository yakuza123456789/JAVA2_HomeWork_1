package com.company;

public class Witcher extends ProfessionTheWitcher {
    private String name;
    private int height;
    private String superAbility;
    private Weapon weapon;
    private Location location;


    public Witcher() {

    }

    public Witcher(String profession, int howMuchMoneyTheyGet, String name, int height, String superAbility, Weapon weapon, Location location) {
        super(profession, howMuchMoneyTheyGet);
        this.name = name;
        this.height = height;
        this.superAbility = superAbility;
        this.weapon = weapon;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    public String getSuperAbility() {
        return superAbility;
    }

    public void magic(String magic, int numbers) {
        for (int i = 1; i < numbers; i++) {
            System.out.println(i + " раз использовал магию: " + magic);
        }
    }

    public void magic(String magic) {
        System.out.println(magic);
    }

    public final void magic(int numbers) {
        System.out.println(numbers + " раз использовал Пируэт");
    }

    @Override
    public String GetInfo() {
        return super.GetInfo() + "Имя Ведьмака: " + name + "\n" +
                "Рост Ведьмака: " + height + "\n" +
                "Меч Ведьмака: " + weapon + "\n" +
                "Локация Ведьмаков: " + location.getName() + ", " + location.getLive() + "\n" +
                "Супер способность: " + superAbility + "\n";
    }
}
