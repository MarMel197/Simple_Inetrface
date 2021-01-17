import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void setUp() {
        guitar = new Guitar();
    }

    @Test
    public void hasMadeNoSoundToStart() {
        assertEquals("", guitar.getSoundMade());
    }

    @Test
    public void canPlaySound() {
        guitar.playInstrument("Strum Strum");
        assertEquals("Strum Strum", guitar.getSoundMade());
    }

}
