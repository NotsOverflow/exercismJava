/*
*                                                                              *
*               ╔╗╔┌─┐┌┬┐┌─┐╔═╗┬  ┬┌─┐┬─┐┌─┐┬  ┌─┐┬ ┬                          *
*               ║║║│ │ │ └─┐║ ║└┐┌┘├┤ ├┬┘├┤ │  │ ││││                          *
*               ╝╚╝└─┘ ┴ └─┘╚═╝ └┘ └─┘┴└─└  ┴─┘└─┘└┴┘                          *
*                                                                              *
*               AppointmentScheduler.java created 2025/01/14                   *
*               by Richard JUAN (contact@richard-juan.com)                     *
*                                                                              *
*               Copyright © 2025 Richard JUAN. All rights reserved             *
*                                                                              *
*/

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

class AppointmentScheduler {
    public LocalDateTime schedule(String appointmentDateDescription) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("M/d/yyyy H:mm:ss");
        return LocalDateTime.parse(appointmentDateDescription, formatter);
    }

    public boolean hasPassed(LocalDateTime appointmentDate) {
        return appointmentDate.isBefore(LocalDateTime.now());
    }

    public boolean isAfternoonAppointment(LocalDateTime appointmentDate) {
        int hour = appointmentDate.getHour();
        return hour >= 12 && hour < 18;
    }

    public String getDescription(LocalDateTime appointmentDate) {
        DateTimeFormatter dayFormatter = DateTimeFormatter.ofPattern("EEEE, MMMM d, yyyy", Locale.US);
        String dayAndDate = appointmentDate.format(dayFormatter);
        int hour = appointmentDate.getHour();
        String period = hour < 12 ? "AM" : "PM";
        int minute = appointmentDate.getMinute();
        String minutes = minute < 10 ? "0" + minute : "" + minute;
        int displayHour = hour % 12 == 0 ? 12 : hour % 12;
        String time = String.format("%d:%s %s", displayHour, minutes, period);

        return "You have an appointment on " + dayAndDate + ", at " + time + ".";
    }

    public LocalDate getAnniversaryDate() {
        return LocalDate.of(Year.now().getValue(), 9, 15);
    }
}
