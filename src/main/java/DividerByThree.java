public class DividerByThree {
    public static boolean isDivide(String line) {
        char[] chars = line.toCharArray();
        var integer = 0;
        for (int i = 0; i <= chars.length - 1; i++) {
            integer += chars[i];
        }
        return integer % 3 == 0;
    }
}

