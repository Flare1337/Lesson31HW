public class TimeFormatter {

    public static String formatDuration(int seconds) {
        String output = "";
        int minutes = 0;
        int hours = 0;
        int days = 0;
        int years = 0;

        String secondsString = "";
        String minuteString = "";
        String hourString = "";
        String dayString = "";
        String yearString = "";

        if (seconds <= 0) {
            output = "now";
        }

        else if (seconds >= 0) {
            while (seconds >= 60) {
                if (seconds > 59) {
                    seconds -= 60;
                    minutes++;
                    if (minutes > 59) {
                        minutes = 0;
                        hours++;
                        if (hours > 23) {
                            hours = 0;
                            days++;
                            if (days > 364) {
                                days = 0;
                                years++;
                            }
                        }
                    }
                }
            }

            if (years > 0) {
                if ((days > 0 || hours > 0 || minutes > 0) && years > 1) {
                    yearString = years + " years, ";
                }
                else if (years > 1) {
                    yearString = years + " years ";
                }
                else if ((days > 0 || hours > 0 || minutes > 0) && years == 1) {
                    yearString = years + " year, ";
                }
                else if (years == 1) {
                    yearString = years + " year ";
                }
            }
            else {
                yearString = "";
            }

            if (days > 0) {
                if ((hours > 0 || minutes > 0) && days > 1) {
                    dayString = days + " days, ";
                }
                else if (days > 1) {
                    dayString = days + " days ";
                }
                else if ((hours > 0 || minutes > 0) && days == 1) {
                    dayString = days + " day, ";
                }
                else if (days == 1) {
                    dayString = days + " day ";
                }
            }
            else {
                dayString = "";
            }


            if (hours > 0) {
                if (minutes > 0 && hours == 1 && seconds < 0) {
                    hourString = hours + " hour and";
                }
                else if (minutes > 0 && hours == 1) {
                    hourString = hours + " hour, ";
                }
                else if (hours == 1) {
                    hourString = hours + " hour ";
                }
                else if (hours > 1 && minutes > 0 && seconds < 0) {
                    hourString = hours + " hours and";
                }
                else if (minutes > 0 && hours > 1) {
                    hourString = hours + " hours, ";
                }
                else if (hours > 1) {
                    hourString = hours + " hours ";
                }
            }
            else {
                hourString = "";
            }

            if (minutes > 0) {
                if (minutes == 1) {
                    minuteString = minutes + " minute ";
                }
                else {
                    minuteString = minutes + " minutes ";
                }
            }
            else {
                minuteString = "";
            }

            if (seconds > 0) {
                if ((years > 0 || days > 0 || hours > 0 || minutes > 0) && seconds > 1) {
                    secondsString = "and " + seconds + " seconds";
                }
                else if ((years > 0 || days > 0 || hours > 0 || minutes > 0) && seconds == 1) {
                    secondsString = "and " + seconds + " second";
                }
                if ((years == 0 && days == 0 && hours == 0 && minutes == 0) && seconds > 1) {
                    secondsString = seconds + " seconds";
                }
                else if ((years == 0 && days == 0 && hours == 0 && minutes == 0) && seconds == 1) {
                    secondsString = seconds + " second";
                }
            }
            else {
                secondsString = "";
            }
            output = "" + yearString + dayString + hourString + minuteString + secondsString;
        }
        return output.trim();
    }
}
