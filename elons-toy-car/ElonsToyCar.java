/*
*                                                                              *
*               ╔╗╔┌─┐┌┬┐┌─┐╔═╗┬  ┬┌─┐┬─┐┌─┐┬  ┌─┐┬ ┬                          *
*               ║║║│ │ │ └─┐║ ║└┐┌┘├┤ ├┬┘├┤ │  │ ││││                          *
*               ╝╚╝└─┘ ┴ └─┘╚═╝ └┘ └─┘┴└─└  ┴─┘└─┘└┴┘                          *
*                                                                              *
*               ElonsToyCar.java created 2025/01/12                            *
*               by Richard JUAN (contact@richard-juan.com)                     *
*                                                                              *
*               Copyright © 2025 Richard JUAN. All rights reserved             *
*                                                                              *
*/

public class ElonsToyCar {

    private int distanceDriven;
    private int batteryLeft = 100;

    public static ElonsToyCar buy() {
        return new ElonsToyCar();
    }

    public String distanceDisplay() {
        return String.format("Driven %s meters", this.distanceDriven);
    }

    public String batteryDisplay() {
        if (batteryLeft < 1)
            return "Battery empty";
        return String.format("Battery at %s%%", this.batteryLeft);
    }

    public void drive() {
        if (batteryLeft > 0) {
            distanceDriven += 20;
            batteryLeft--;
        }
    }
}
