/*
*                                                                              *
*               ╔╗╔┌─┐┌┬┐┌─┐╔═╗┬  ┬┌─┐┬─┐┌─┐┬  ┌─┐┬ ┬                          *
*               ║║║│ │ │ └─┐║ ║└┐┌┘├┤ ├┬┘├┤ │  │ ││││                          *
*               ╝╚╝└─┘ ┴ └─┘╚═╝ └┘ └─┘┴└─└  ┴─┘└─┘└┴┘                          *
*                                                                              *
*               GameMaster.java created 2025/01/14                             *
*               by Richard JUAN (contact@richard-juan.com)                     *
*                                                                              *
*               Copyright © 2025 Richard JUAN. All rights reserved             *
*                                                                              *
*/

public class GameMaster {
    public String describe(Character character) {
        return String.format("You're a level %d %s with %d hit points.", character.getLevel(),
                character.getCharacterClass(),
                character.getHitPoints());
    }

    public String describe(Destination destination) {
        return String.format("You've arrived at %s, which has %d inhabitants.", destination.getName(),
                destination.getInhabitants());
    }

    public String describe(TravelMethod travelMethod) {
        switch (travelMethod) {
            case HORSEBACK:
                return String.format("You're traveling to your destination on %s.",
                        travelMethod.toString().toLowerCase());
            default:
                return String.format("You're traveling to your destination by %s.",
                        travelMethod.toString().toLowerCase());
        }

    }

    public String describe(Character character, Destination destination) {
        return describe(character) + " " + describe(TravelMethod.WALKING) + " " + describe(destination);
    }

    public String describe(Character character, Destination destination, TravelMethod travelMethod) {
        return describe(character) + " " + describe(travelMethod) + " " + describe(destination);
    }
}
