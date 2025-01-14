/*
*                                                                              *
*               ╔╗╔┌─┐┌┬┐┌─┐╔═╗┬  ┬┌─┐┬─┐┌─┐┬  ┌─┐┬ ┬                          *
*               ║║║│ │ │ └─┐║ ║└┐┌┘├┤ ├┬┘├┤ │  │ ││││                          *
*               ╝╚╝└─┘ ┴ └─┘╚═╝ └┘ └─┘┴└─└  ┴─┘└─┘└┴┘                          *
*                                                                              *
*               BirdWatcher.java created 2025/01/11                            *
*               by Richard JUAN (contact@richard-juan.com)                     *
*                                                                              *
*               Copyright © 2025 Richard JUAN. All rights reserved             *
*                                                                              *
*/

class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return this.birdsPerDay;
    }

    public int getToday() {
        return this.birdsPerDay[6];
    }

    public void incrementTodaysCount() {
        this.birdsPerDay[6]++;
    }

    public boolean hasDayWithoutBirds() {
        for (int i = 0; i < birdsPerDay.length; i++)
            if (birdsPerDay[i] == 0)
                return true;
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        if (numberOfDays < 1 || numberOfDays > 7)
            numberOfDays = 7;
        int count = 0;
        for (int i = 0; i < numberOfDays; i++)
            count += birdsPerDay[i];
        return count;
    }

    public int getBusyDays() {
        int count = 0;
        for (int i = 0; i < birdsPerDay.length; i++)
            if (birdsPerDay[i] > 4)
                count++;
        return count;
    }
}
