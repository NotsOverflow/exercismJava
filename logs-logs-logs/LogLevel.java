/*
*                                                                              *
*               ╔╗╔┌─┐┌┬┐┌─┐╔═╗┬  ┬┌─┐┬─┐┌─┐┬  ┌─┐┬ ┬                          *
*               ║║║│ │ │ └─┐║ ║└┐┌┘├┤ ├┬┘├┤ │  │ ││││                          *
*               ╝╚╝└─┘ ┴ └─┘╚═╝ └┘ └─┘┴└─└  ┴─┘└─┘└┴┘                          *
*                                                                              *
*               LogLevel.java created 2025/01/14                               *
*               by Richard JUAN (contact@richard-juan.com)                     *
*                                                                              *
*               Copyright © 2025 Richard JUAN. All rights reserved             *
*                                                                              *
*/

public enum LogLevel {
    UNKNOWN(0),
    TRACE(1),
    DEBUG(2),
    INFO(4),
    WARNING(5),
    ERROR(6),
    FATAL(42);

    private final int encodedLevel;

    LogLevel(int encodedLevel) {
        this.encodedLevel = encodedLevel;
    }

    public static LogLevel fromString(String level) {
        switch (level) {
            case "TRC":
                return TRACE;
            case "DBG":
                return DEBUG;
            case "INF":
                return INFO;
            case "WRN":
                return WARNING;
            case "ERR":
                return ERROR;
            case "FTL":
                return FATAL;
            default:
                return UNKNOWN;
        }

    }

    public int getEncodedLevel() {
        return encodedLevel;
    }
}