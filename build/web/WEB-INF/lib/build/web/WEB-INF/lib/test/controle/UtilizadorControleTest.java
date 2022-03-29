/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.util.List;
import model.Utilizador;
import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author fernandojoao
 */
public class UtilizadorControleTest {
    
    public UtilizadorControleTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
        //System.out.println("Comecou Um Metodo");
    }
    
    @After
    public void tearDown() {
        //System.out.println("Terminou Um Metodo");
    }

    @Test
    public void testValidUsernameAndPassword() throws Exception {
        System.out.println("validUsernameAndPassword");
        String nomeUtilizador = "fer";
        String senhaUtilizador = "fer";
        UtilizadorControle instance = new UtilizadorControle();
        boolean expResult = true;
        boolean result = instance.validUsernameAndPassword(nomeUtilizador, senhaUtilizador);
        assertEquals(expResult, result);
    }

    public void testInserirUtilizador() throws Exception {
        System.out.println("inserirUtilizador");
        Utilizador utilizador = null;
        UtilizadorControle instance = new UtilizadorControle();
        boolean expResult = false;
        boolean result = instance.inserirUtilizador(utilizador);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public void testAlterarUtilizador() throws Exception {
        System.out.println("alterarUtilizador");
        Utilizador utilizador = null;
        UtilizadorControle instance = new UtilizadorControle();
        boolean expResult = false;
        boolean result = instance.alterarUtilizador(utilizador);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public void testApagarUtilizador() throws Exception {
        System.out.println("apagarUtilizador");
        long idUtilizador = 0L;
        UtilizadorControle instance = new UtilizadorControle();
        boolean expResult = false;
        boolean result = instance.apagarUtilizador(idUtilizador);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    public void testGetUtilizador() throws Exception {
        System.out.println("getUtilizador");
        long idUtilizador = 1;
        UtilizadorControle instance = new UtilizadorControle();
        Utilizador result = instance.getUtilizador(idUtilizador);
        assertNotNull(result);
        assertEquals(idUtilizador, result.getIdUtilizador());
    }

    
    public void testGetListOfUtilizador() throws Exception {
        System.out.println("getListOfUtilizador");
        UtilizadorControle instance = new UtilizadorControle();
        List result = instance.getListOfUtilizador();
        assertNotNull(result);
        assertTrue(result.size()>0);
    }
}
