/*
*                                                                              *
*               ╔╗╔┌─┐┌┬┐┌─┐╔═╗┬  ┬┌─┐┬─┐┌─┐┬  ┌─┐┬ ┬                          *
*               ║║║│ │ │ └─┐║ ║└┐┌┘├┤ ├┬┘├┤ │  │ ││││                          *
*               ╝╚╝└─┘ ┴ └─┘╚═╝ └┘ └─┘┴└─└  ┴─┘└─┘└┴┘                          *
*                                                                              *
*               Secrets.java created 2025/01/14                                *
*               by Richard JUAN (contact@richard-juan.com)                     *
*                                                                              *
*               Copyright © 2025 Richard JUAN. All rights reserved             *
*                                                                              *
*/

public class Secrets {
    public static int shiftBack(int value, int amount) {
        return value >>> amount;
    }

    public static int setBits(int value, int mask) {
        return value | mask;
    }

    public static int flipBits(int value, int mask) {
        return value ^ mask;
    }

    public static int clearBits(int value, int mask) {
        return value & ~mask;
    }
}