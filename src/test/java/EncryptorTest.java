import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EncryptorTest {
    @Test
    public void encryptorTest() {
        assertEquals("", Encryptor.encryptThis(""));
        assertEquals("100", Encryptor.encryptThis("d"));
        assertEquals("66ey" ,Encryptor.encryptThis("Bye"));
        assertEquals("72olle 109na" ,Encryptor.encryptThis("Hello man"));
        assertEquals("79en 116ow 116ereh" ,Encryptor.encryptThis("One two three"));
        assertEquals("84deyDontUnderstanh" ,Encryptor.encryptThis("TheyDontUnderstand"));
    }
}
