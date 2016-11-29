package ni.edu.uca.prueba;

import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Administrador on 28/11/2016.
 */
public class UtilsTest {



    @Test
    public void convertToLetter() throws Exception {
        Utils utils = new Utils();
        assertEquals("F",utils.convertToLetter(45).toString());
        assertEquals("A",utils.convertToLetter(95).toString());
        assertEquals("B",utils.convertToLetter(80).toString());
        assertEquals("C",utils.convertToLetter(70).toString());
        assertEquals("D",utils.convertToLetter(65).toString());


    }

    @Test
    public void testOutOfRange(){
        try{
            Utils utils = new Utils();
            utils.convertToLetter(200);
            fail();
        }catch (Exception ex){
            assertTrue(true);
        }
    }

    @Test
    public void testOutOfRange0(){
        try{
            Utils utils = new Utils();
            utils.convertToLetter(-5);
            fail();
        }catch (Exception ex){
            assertTrue(true);
        }
    }


}