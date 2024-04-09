/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit3TestClass.java to edit this template
 */
package instituto;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

/**
 *
 * @author Diego
 */
public class PersonaTest{
    private Persona persona1;
    private Persona persona2;
    private Persona persona3;
    
    protected void setUp() {
        Persona persona1 = new Persona(12371623, "Diego", 'M', 21, 11, 2005);
        Persona persona2 = new Persona(32123455, "Diego", 'M', 21, 11, 2005);
        Persona persona3 = new Persona(56789765, "Mario", 'M', 23, 9, 2005);
    }
    
    /**
     * Test of getEdad method, of class Persona.
     */
    public void testGetEdad() {
        assertEquals(18, persona1.getEdad());
    }

    /**
     * Test of equals method, of class Persona.
     */
    public void testEquals() {
        assertTrue(persona1.equals(persona2));
        assertFalse(persona1.equals(persona3));
    }

    
}
