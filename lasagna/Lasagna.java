/*
*                                                                              *
*               ╔╗╔┌─┐┌┬┐┌─┐╔═╗┬  ┬┌─┐┬─┐┌─┐┬  ┌─┐┬ ┬                          *
*               ║║║│ │ │ └─┐║ ║└┐┌┘├┤ ├┬┘├┤ │  │ ││││                          *
*               ╝╚╝└─┘ ┴ └─┘╚═╝ └┘ └─┘┴└─└  ┴─┘└─┘└┴┘                          *
*                                                                              *
*               Lasagna.java created 2025/01/11                                *
*               by Richard JUAN (contact@richard-juan.com)                     *
*                                                                              *
*               Copyright © 2025 Richard JUAN. All rights reserved             *
*                                                                              *
*/

public class Lasagna {
    int timeToCookOneLasagna = 40;
    int timePerLayer = 2;

    public int expectedMinutesInOven() {
        return timeToCookOneLasagna;
    }

    public int remainingMinutesInOven(int time) {
        if (time < 0)
            time = 0;
        if (time > timeToCookOneLasagna)
            time = timeToCookOneLasagna;
        return timeToCookOneLasagna - time;
    }

    public int preparationTimeInMinutes(int layers) {
        if (layers < 0)
            layers = 0;
        return layers * timePerLayer;
    }

    public int totalTimeInMinutes(int layers, int timeSpent) {
        return preparationTimeInMinutes(layers) + timeSpent;
    }
}
