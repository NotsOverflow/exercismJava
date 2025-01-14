/*
*                                                                              *
*               ╔╗╔┌─┐┌┬┐┌─┐╔═╗┬  ┬┌─┐┬─┐┌─┐┬  ┌─┐┬ ┬                          *
*               ║║║│ │ │ └─┐║ ║└┐┌┘├┤ ├┬┘├┤ │  │ ││││                          *
*               ╝╚╝└─┘ ┴ └─┘╚═╝ └┘ └─┘┴└─└  ┴─┘└─┘└┴┘                          *
*                                                                              *
*               ProductionRemoteControlCar.java created 2025/01/12             *
*               by Richard JUAN (contact@richard-juan.com)                     *
*                                                                              *
*               Copyright © 2025 Richard JUAN. All rights reserved             *
*                                                                              *
*/

class ProductionRemoteControlCar implements RemoteControlCar, Comparable<ProductionRemoteControlCar> {
    private int drivingUnits = 10;
    private int traveledDistance;
    private int victories;

    public void drive() {
        traveledDistance += drivingUnits;
    }

    public int getDistanceTravelled() {
        return traveledDistance;
    }

    public int getNumberOfVictories() {
        return victories;
    }

    public void setNumberOfVictories(int numberOfVictories) {
        victories = numberOfVictories;
    }

    @Override
    public int compareTo(ProductionRemoteControlCar car) {
        return Integer.compare(this.victories, car.getNumberOfVictories());
    }
}
