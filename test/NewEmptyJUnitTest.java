/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import exercicio_6.cdp.AbstractFormatoReader;
import exercicio_6.cdp.FormatoAVI;
import exercicio_6.cdp.FormatoMP3;
import exercicio_6.cdp.FormatoMP4;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ricardo
 */
public class NewEmptyJUnitTest {

    public NewEmptyJUnitTest() {
    }

    AbstractFormatoReader avi;
    AbstractFormatoReader mp3;
    AbstractFormatoReader mp4;

    @Before
    public void setUp() {
        avi = new FormatoAVI();
        mp3 = new FormatoMP3();
        mp4 = new FormatoMP4();
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void TestaAVI() {
        assertEquals(avi.getNumeroFrames(), 128);
    }

    @Test
    public void TestaMP3() {
        assertEquals(mp3.getNumeroFrames(), 64);

    }

    @Test
    public void TestaMP4() {
        assertEquals(mp3.getNumeroFrames(), 32);
    }
}
