/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit3TestClass.java to edit this template
 */
package instituto;

import static junit.framework.Assert.assertTrue;
import junit.framework.TestCase;

/**
 *
 * @author Diego
 */
public class CursoTest{

    private Curso curso;
    private Persona alumno1;
    private Persona alumno2;

    protected void setUp() {
        curso = new Curso("1DAM");
        alumno1 = new Persona(152673899, "Diego", 'M', 21, 11, 2005);
        alumno2 = new Persona(871526722, "Mario", 'M', 23, 9, 2005);
    }

    /**
     * Test para añadir un Alumno a un curso,
     * sobre la clase Curso.
     */
    public void testAniadirAlumno() {
        curso.aniadirAlumno(alumno1);
        curso.aniadirAlumno(alumno2);

        assertTrue(curso.toString().contains(alumno1.toString()));
        assertTrue(curso.toString().contains(alumno2.toString()));
    }
    
}
