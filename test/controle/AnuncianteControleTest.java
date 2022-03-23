/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.util.List;
import model.Anunciante;
import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author fernandojoao
 */
public class AnuncianteControleTest {
    
    public AnuncianteControleTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

  
    public void testValidUsernameAndPassword() throws Exception {
        System.out.println("validUsernameAndPassword");
        String emailAnunciante = "";
        String senhaAnunciante = "";
        AnuncianteControle instance = new AnuncianteControle();
        boolean expResult = false;
        boolean result = instance.validUsernameAndPassword(emailAnunciante, senhaAnunciante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }


    public void testInserirAnunciante() throws Exception {
        System.out.println("inserirAnunciante");
        Anunciante anunciante = null;
        AnuncianteControle instance = new AnuncianteControle();
        boolean expResult = false;
        boolean result = instance.inserirAnunciante(anunciante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

  
    public void testAlterarAnunciante() throws Exception {
        System.out.println("alterarAnunciante");
        Anunciante anunciante = null;
        AnuncianteControle instance = new AnuncianteControle();
        boolean expResult = false;
        boolean result = instance.alterarAnunciante(anunciante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

 
    public void testApagarAnunciante() throws Exception {
        System.out.println("apagarAnunciante");
        long idAnunciante = 0L;
        AnuncianteControle instance = new AnuncianteControle();
        boolean expResult = false;
        boolean result = instance.apagarAnunciante(idAnunciante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

  
    public void testGetAnunciante() throws Exception {
        System.out.println("getAnunciante");
        long idAnunciante = 0L;
        AnuncianteControle instance = new AnuncianteControle();
        Anunciante expResult = null;
        Anunciante result = instance.getAnunciante(idAnunciante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

   
    public void testGetAnuncianteNome() throws Exception {
        System.out.println("getAnuncianteNome");
        String emailAnunciante = "";
        AnuncianteControle instance = new AnuncianteControle();
        String expResult = "";
        String result = instance.getAnuncianteNome(emailAnunciante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

   @Test
    public void testGetListOfAnunciante() throws Exception {
        System.out.println("getListOfAnunciante");
        AnuncianteControle instance = new AnuncianteControle();
        List result = instance.getListOfAnunciante();
        assertTrue(result.size()>0);
    }

    
    public void testGetAnuncianteID() throws Exception {
        System.out.println("getAnuncianteID");
        String emailAnunciante = "microsoft@hotmail.com";
        AnuncianteControle instance = new AnuncianteControle();
        long expResult = 0L;
        long result = instance.getAnuncianteID(emailAnunciante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    
    public void testActivarConta() throws Exception {
        System.out.println("activarConta");
        long idAnunciante = 0L;
        AnuncianteControle instance = new AnuncianteControle();
        boolean expResult = false;
        boolean result = instance.activarConta(idAnunciante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    
    public void testBloquearConta() throws Exception {
        System.out.println("bloquearConta");
        long idAnunciante = 0L;
        AnuncianteControle instance = new AnuncianteControle();
        boolean expResult = false;
        boolean result = instance.bloquearConta(idAnunciante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    
    public void testIsValidTelefoneAnunciante() throws Exception {
        System.out.println("isValidTelefoneAnunciante");
        String telefoneAnunciante = "";
        AnuncianteControle instance = new AnuncianteControle();
        boolean expResult = false;
        boolean result = instance.isValidTelefoneAnunciante(telefoneAnunciante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    
    public void testIsValidEmailAnunciante() throws Exception {
        System.out.println("isValidEmailAnunciante");
        String emailAnunciante = "";
        AnuncianteControle instance = new AnuncianteControle();
        boolean expResult = false;
        boolean result = instance.isValidEmailAnunciante(emailAnunciante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testIsLockedAnunciante() throws Exception {
        System.out.println("isLockedAnunciante");
        long idAnunciante = 1;
        AnuncianteControle instance = new AnuncianteControle();
        boolean expResult = false;
        boolean result = instance.isLockedAnunciante(idAnunciante);
        assertEquals(expResult, result);
        
    }
}
