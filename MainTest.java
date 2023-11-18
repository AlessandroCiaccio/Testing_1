import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    private final Main testing = new Main();

    @Test
    void media() {
        double media = (float) testing.media(4, 7, 10);
        assertEquals(7, media, "La media di 4,7,10 dovrebbe essere 7");
    }
}
