/*
*                                                                              *
*               ╔╗╔┌─┐┌┬┐┌─┐╔═╗┬  ┬┌─┐┬─┐┌─┐┬  ┌─┐┬ ┬                          *
*               ║║║│ │ │ └─┐║ ║└┐┌┘├┤ ├┬┘├┤ │  │ ││││                          *
*               ╝╚╝└─┘ ┴ └─┘╚═╝ └┘ └─┘┴└─└  ┴─┘└─┘└┴┘                          *
*                                                                              *
*               Fighter.java created 2025/01/13                                *
*               by Richard JUAN (contact@richard-juan.com)                     *
*                                                                              *
*               Copyright © 2025 Richard JUAN. All rights reserved             *
*                                                                              *
*/

class Fighter {

    public boolean isVulnerable() {
        return true;
    }

    public int getDamagePoints(Fighter fighter) {
        return 1;
    }
}

class Warrior extends Fighter {

    public String toString() {
        return "Fighter is a Warrior";
    }

    @Override
    public boolean isVulnerable() {
        return false;
    }

    @Override
    public int getDamagePoints(Fighter fighter) {
        return fighter.isVulnerable() ? 10 : 6;
    }

}

class Wizard extends Fighter {

    private boolean spellPrepared = false;

    public void prepareSpell() {
        spellPrepared = true;
    }

    public String toString() {
        return "Fighter is a Wizard";
    }

    @Override
    public boolean isVulnerable() {
        return spellPrepared ? false : true;
    }

    @Override
    public int getDamagePoints(Fighter fighter) {
        return spellPrepared ? 12 : 3;
    }
}
