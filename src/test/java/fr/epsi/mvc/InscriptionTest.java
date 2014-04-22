package fr.epsi.mvc;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by edouard on 22/04/14.
 */
public class InscriptionTest {

    private Inscription uneinscription = new Inscription();

    @Before
    public void setUp() throws Exception {

        uneinscription.setLogin("thunderburn");
        uneinscription.setEmail("thunderburn@gmail.com");
        uneinscription.setConditionsGeneralesApprouvees(true);
    }

    @Test
    public void testGetLogin() throws Exception {

        assertEquals("thunderburn", uneinscription.getLogin());
    }

    @Test
    public void testGetEmail() throws Exception {

        assertEquals("thunderburn@gmail.com", uneinscription.getEmail());
    }

    @Test
    public void testIsConditionsGeneralesApprouvees() throws Exception {

        assertTrue(uneinscription.isConditionsGeneralesApprouvees());
    }

}
