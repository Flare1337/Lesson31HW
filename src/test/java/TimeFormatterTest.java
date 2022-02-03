import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TimeFormatterTest {
    // в минуте 60, в часе 3600, в сутках 86400, в году 31536000 (это не високосный)
    @Test
    public void positiveTimeFormatterTest() {
        assertEquals("1 second", TimeFormatter.formatDuration(1));
        assertEquals("1 minute", TimeFormatter.formatDuration(60));
        assertEquals("1 hour", TimeFormatter.formatDuration(3600));
        assertEquals("1 day", TimeFormatter.formatDuration(86_400));
        assertEquals("1 year", TimeFormatter.formatDuration(31_536_000));
        assertEquals("5 minutes", TimeFormatter.formatDuration(300));
        assertEquals("2 minutes and 2 seconds", TimeFormatter.formatDuration(122));
        assertEquals("1 hour, 6 minutes and 1 second", TimeFormatter.formatDuration(3961));
        assertEquals("1 day, 1 hour, 5 minutes and 1 second", TimeFormatter.formatDuration(90_301));
        assertEquals("3 years, 1 day, 1 hour, 1 minute and 1 second", TimeFormatter.formatDuration(94_698_061));
    }

    @Test
    public void negativeTimeFormatterTest() {
        assertNotEquals("1 seconds" ,TimeFormatter.formatDuration(1));
        assertNotEquals("1 minutes" ,TimeFormatter.formatDuration(60));
        assertNotEquals("1 hours" ,TimeFormatter.formatDuration(3600));
        assertNotEquals("1 days" ,TimeFormatter.formatDuration(86_400));
        assertNotEquals("1 years" ,TimeFormatter.formatDuration(31_536_000));
        assertNotEquals("2 second" ,TimeFormatter.formatDuration(2));
        assertNotEquals("2 minute" ,TimeFormatter.formatDuration(120));
        assertNotEquals("2 hour" ,TimeFormatter.formatDuration(7200));
        assertNotEquals("2 day" ,TimeFormatter.formatDuration(172_800));
        assertNotEquals("2 year" ,TimeFormatter.formatDuration(63_072_000));
        assertNotEquals("1 hour, 6 minutes, 1 second", TimeFormatter.formatDuration(3961));
        assertNotEquals("1 day, 1 hour, 5 minutes, 1 second", TimeFormatter.formatDuration(90_301));
        assertNotEquals("3 years, 1 day, 1 hour, 1 minute, 1 second", TimeFormatter.formatDuration(94_698_061));
    }
}
