/*
*                                                                              *
*               ╔╗╔┌─┐┌┬┐┌─┐╔═╗┬  ┬┌─┐┬─┐┌─┐┬  ┌─┐┬ ┬                          *
*               ║║║│ │ │ └─┐║ ║└┐┌┘├┤ ├┬┘├┤ │  │ ││││                          *
*               ╝╚╝└─┘ ┴ └─┘╚═╝ └┘ └─┘┴└─└  ┴─┘└─┘└┴┘                          *
*                                                                              *
*               SqueakyClean.java created 2025/01/12                           *
*               by Richard JUAN (contact@richard-juan.com)                     *
*                                                                              *
*               Copyright © 2025 Richard JUAN. All rights reserved             *
*                                                                              *
*/

class SqueakyClean {
    static String clean(String identifier) {
        identifier = identifier.replace(" ", "_");
        String[] tmp = identifier.split("-");
        identifier = un1337(tmp[0]);
        for (int i = 1; i < tmp.length; i++) {
            tmp[i] = un1337(tmp[i].toLowerCase());
            tmp[i] = tmp[i].substring(0, 1).toUpperCase() + tmp[i].substring(1);
            identifier += tmp[i];
        }
        return identifier.replaceAll("[^a-zA-Z_-]", "");
    }

    static String un1337(String str) {
        return str.replace("4", "a").replace("3", "e").replace("0", "o").replace("1", "l").replace("7", "t");
    }
}
