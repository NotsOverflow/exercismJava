/*
*                                                                              *
*               ╔╗╔┌─┐┌┬┐┌─┐╔═╗┬  ┬┌─┐┬─┐┌─┐┬  ┌─┐┬ ┬                          *
*               ║║║│ │ │ └─┐║ ║└┐┌┘├┤ ├┬┘├┤ │  │ ││││                          *
*               ╝╚╝└─┘ ┴ └─┘╚═╝ └┘ └─┘┴└─└  ┴─┘└─┘└┴┘                          *
*                                                                              *
*               LogLevels.java created 2025/01/11                              *
*               by Richard JUAN (contact@richard-juan.com)                     *
*                                                                              *
*               Copyright © 2025 Richard JUAN. All rights reserved             *
*                                                                              *
*/

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LogLevels {

    private static Pattern pattern = Pattern.compile("^\\[(INFO|WARNING|ERROR)\\]:[ \t]*([a-zA-Z0-9 ]+)[ \t\r\n]*$");

    public static String message(String logLine) {
        Matcher matcher = pattern.matcher(logLine);
        if (!matcher.matches())
            throw new UnsupportedOperationException("this is not a proper log message");
        return matcher.group(2).trim();
    }

    public static String logLevel(String logLine) {
        Matcher matcher = pattern.matcher(logLine);
        if (!matcher.matches())
            throw new UnsupportedOperationException("this is not a proper log message");
        return matcher.group(1).toLowerCase();
    }

    public static String reformat(String logLine) {
        Matcher matcher = pattern.matcher(logLine);
        if (!matcher.matches())
            throw new UnsupportedOperationException("this is not a proper log message");
        return String.format("%s (%s)", matcher.group(2).trim(), matcher.group(1).toLowerCase());
    }
}
