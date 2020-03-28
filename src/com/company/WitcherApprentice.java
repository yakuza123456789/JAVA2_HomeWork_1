package com.company;

public final class WitcherApprentice extends Witcher {
    private int age;

    public WitcherApprentice(String profession, int howMuchMoneyTheyGet, String name, int height, String superAbility, Weapon weapon, Location location, int age) {
        super(profession, howMuchMoneyTheyGet, name, height, superAbility, weapon, location);
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public void magic(String magic) {
        super.magic(magic);
    }

    @Override
    public String GetInfo() {
        return super.GetInfo() + "Возраст ученика: " + age + "\n";
    }
}
