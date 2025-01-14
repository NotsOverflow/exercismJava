/*
*                                                                              *
*               ╔╗╔┌─┐┌┬┐┌─┐╔═╗┬  ┬┌─┐┬─┐┌─┐┬  ┌─┐┬ ┬                          *
*               ║║║│ │ │ └─┐║ ║└┐┌┘├┤ ├┬┘├┤ │  │ ││││                          *
*               ╝╚╝└─┘ ┴ └─┘╚═╝ └┘ └─┘┴└─└  ┴─┘└─┘└┴┘                          *
*                                                                              *
*               LogLine.java created 2025/01/14                                *
*               by Richard JUAN (contact@richard-juan.com)                     *
*                                                                              *
*               Copyright © 2025 Richard JUAN. All rights reserved             *
*                                                                              *
*/

class LogLine {
    private String line;

    public LogLine(String line) {
        this.line = line;
    }

    public LogLevel getLogLevel() {
        String levelString = line.substring(1, 4);
        return LogLevel.fromString(levelString);
    }

    public String getOutputForShortLog() {
        LogLevel level = getLogLevel();
        int index = line.indexOf(']');
        String message = line.substring(index + 2);
        return level.getEncodedLevel() + ":" + message.trim();
    }
}
