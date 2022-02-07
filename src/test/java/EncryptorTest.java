import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EncryptorTest {
    @Test
    public void encryptorTest() {
        assertEquals("100", Encryptor.encryptText("d"));
        assertEquals("66ey" ,Encryptor.encryptText("Bye"));
        assertEquals("72olle 109na" ,Encryptor.encryptText("Hello man"));
        assertEquals("79en 116ow 116ereh" ,Encryptor.encryptText("One two three"));
        assertEquals("84deyDontUnderstanh" ,Encryptor.encryptText("TheyDontUnderstand"));
    }
}
