/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;
import com.mycompany.proyecto.Paciente;
    import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 *
 * @author anaga
 */
public class PacienteIt {

    public PacienteIt() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getId method, of class patientModel.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Paciente instance = new Paciente();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class patientModel.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        Paciente instance = new Paciente();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class patientModel.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getName");
        Paciente instance = new Paciente();
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class patientModel.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setName");
        String name = "";
        Paciente instance = new Paciente();
        instance.setNombre(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAddress method, of class patientModel.
     */
    @Test
    public void testGetApellidos() {
        System.out.println("getApellidos");
        Paciente instance = new Paciente();
        String expResult = "";
        String result = instance.getApellidos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAddress method, of class patientModel.
     */
    @Test
    public void testSetApellidos() {
        System.out.println("setApellido");
        String Apellido = "";
        Paciente instance = new Paciente();
        instance.setApellidos(Apellido);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPhone method, of class patientModel.
     */
    @Test
    public void testGetPieza(){
        System.out.println("getPhone");
        Paciente instance = new Paciente();
        String expResult = "";
        String result = instance.getPieza();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPhone method, of class patientModel.
     */
    @Test
    public void testSetPieza() {
        System.out.println("setPieza");
        String pieza = "";
        Paciente instance = new Paciente();
        instance.setPieza(pieza);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBloodgroup method, of class patientModel.
     */
    @Test
    public void testGetColor() {
        System.out.println("getColor");
        Paciente instance = new Paciente();
        String expResult = "";
        String result = instance.getColor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBloodgroup method, of class patientModel.
     */
    @Test
    public void testSetColor() {
        System.out.println("set");
        String Color = "";
        Paciente instance = new Paciente();
        instance.setColor(Color);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHealthproblems method, of class patientModel.
     */
    @Test
    public void testGetPrecio() {
        System.out.println("getPrecio");
        Paciente instance = new Paciente();
        String expResult = "";
        String result = instance.getPrecio();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHealthproblems method, of class patientModel.
     */
    @Test
    public void testSetPrecio() {
        System.out.println("setPrecio");
        String precio = "";
        Paciente instance = new Paciente();
        instance.setPrecio(precio);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}


