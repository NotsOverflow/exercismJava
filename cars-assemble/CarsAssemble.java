/*
*                                                                              *
*               ╔╗╔┌─┐┌┬┐┌─┐╔═╗┬  ┬┌─┐┬─┐┌─┐┬  ┌─┐┬ ┬                          *
*               ║║║│ │ │ └─┐║ ║└┐┌┘├┤ ├┬┘├┤ │  │ ││││                          *
*               ╝╚╝└─┘ ┴ └─┘╚═╝ └┘ └─┘┴└─└  ┴─┘└─┘└┴┘                          *
*                                                                              *
*               CarsAssemble.java created 2025/01/11                           *
*               by Richard JUAN (contact@richard-juan.com)                     *
*                                                                              *
*               Copyright © 2025 Richard JUAN. All rights reserved             *
*                                                                              *
*/

public class CarsAssemble {
    int currentProductionPerHour = 221;

    public double productionRatePerHour(int speed) {
        if (speed < 0 || speed > 10)
            throw new UnsupportedOperationException("unsuported rate");

        double rate = 0.0;
        if (speed > 0 && speed < 5)
            rate = speed * currentProductionPerHour;
        else if (speed > 4 && speed < 9)
            rate = speed * currentProductionPerHour * 0.9;
        else if (speed == 9)
            rate = speed * currentProductionPerHour * 0.8;
        else if (speed == 10)
            rate = speed * currentProductionPerHour * 0.77;
        return rate;
    }

    public int workingItemsPerMinute(int speed) {
        if (speed < 0 || speed > 10)
            throw new UnsupportedOperationException("unsuported rate");

        double rate = 0;
        if (speed > 0 && speed < 5)
            rate = speed * currentProductionPerHour / 60;
        else if (speed > 4 && speed < 9)
            rate = speed * currentProductionPerHour * 0.9 / 60;
        else if (speed == 9)
            rate = speed * currentProductionPerHour * 0.8 / 60;
        else if (speed == 10)
            rate = speed * currentProductionPerHour * 0.77 / 60;
        return (int) rate;
    }
}
