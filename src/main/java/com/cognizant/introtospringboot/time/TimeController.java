package com.cognizant.introtospringboot.time;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/time-to-text")
final class TimeController {

    @GetMapping("/{time}")
    String convertTimeToText(@PathVariable("time") final String time) {
        System.out.println("time  " + time);

        if (time == null) {
            return "No time is entered";
        }

        if (time.equals("13:00")) {
            return "one o'clock in the afternoon";
        }
        if (time.equals("12:00")) {
            return "noon";
        }
        if (time.equals("0:00")) {
            return "midnight";
        }
        String[] timeHourAndMinute = time.split(":");
        String hour = timeHourAndMinute[0];
        String minute = timeHourAndMinute[1];

        if (Integer.parseInt(hour) > 24 || Integer.parseInt(hour) < 0 || Integer.parseInt(minute) > 60 || Integer.parseInt(minute) < 0) {
            return "Invalid Time";
        }
        if ((Integer.parseInt(hour) >= 12 && Integer.parseInt(hour) < 18)) {
            return time + " in the afternoon";
        }
        if ((Integer.parseInt(hour) < 12 && Integer.parseInt(hour) >= 0)) {
            return time + " in the morning";
        }
        if ((Integer.parseInt(hour) >= 18 && Integer.parseInt(hour) < 24)) {
            return time + " in the evening";
        }


        return time;

    }
}
