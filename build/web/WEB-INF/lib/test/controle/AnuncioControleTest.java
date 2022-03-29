/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.util.List;
import model.Anuncio;
import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author fernandojoao
 */
public class AnuncioControleTest {
    
    public AnuncioControleTest() {
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

    
    public void testGetAnuncio() throws Exception {
        System.out.println("getAnuncio");
        long idAnuncio = 0L;
        AnuncioControle instance = new AnuncioControle();
        Anuncio expResult = null;
        Anuncio result = instance.getAnuncio(idAnuncio);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    
    public void testGetAnuncioNum() throws Exception {
        System.out.println("getAnuncioNum");
        long idAnunciante = 0L;
        AnuncioControle instance = new AnuncioControle();
        long expResult = 0L;
        long result = instance.getAnuncioNum(idAnunciante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetListOfAnuncio() throws Exception {
        System.out.println("getListOfAnuncio");
        AnuncioControle instance = new AnuncioControle();
        List result = instance.getListOfAnuncio();
        assertTrue(result.size()>0);
    }

    @Test
    public void testGetListOfAnuncioAnunciante() throws Exception {
        System.out.println("getListOfAnuncioAnunciante");
        long idAnunciante = 2;
        AnuncioControle instance = new AnuncioControle();
        List result = instance.getListOfAnuncioAnunciante(idAnunciante);
        assertTrue(result.size()>0);
    }

    
    public void testInserirAnuncio() throws Exception {
        System.out.println("inserirAnuncio");
        Anuncio anuncio = null;
        AnuncioControle instance = new AnuncioControle();
        boolean expResult = false;
        boolean result = instance.inserirAnuncio(anuncio);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    
    public void testAlterarAnuncio() throws Exception {
        System.out.println("alterarAnuncio");
        Anuncio anuncio = null;
        AnuncioControle instance = new AnuncioControle();
        boolean expResult = false;
        boolean result = instance.alterarAnuncio(anuncio);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    
    public void testApagarAnuncio() throws Exception {
        System.out.println("apagarAnuncio");
        long idAnuncio = 0L;
        AnuncioControle instance = new AnuncioControle();
        boolean expResult = false;
        boolean result = instance.apagarAnuncio(idAnuncio);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    
    public void testRegistarClique() throws Exception {
        System.out.println("registarClique");
        long idAnuncio = 0L;
        AnuncioControle instance = new AnuncioControle();
        boolean expResult = false;
        boolean result = instance.registarClique(idAnuncio);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    
    public void testActivarAnuncio() throws Exception {
        System.out.println("activarAnuncio");
        long idAnuncio = 0L;
        AnuncioControle instance = new AnuncioControle();
        boolean expResult = false;
        boolean result = instance.activarAnuncio(idAnuncio);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    
    public void testDesactivarAnuncio() throws Exception {
        System.out.println("desactivarAnuncio");
        long idAnuncio = 0L;
        AnuncioControle instance = new AnuncioControle();
        boolean expResult = false;
        boolean result = instance.desactivarAnuncio(idAnuncio);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    
    public void testIsLockedAnuncio() throws Exception {
        System.out.println("isLockedAnuncio");
        long idAnuncio = 0L;
        AnuncioControle instance = new AnuncioControle();
        boolean expResult = false;
        boolean result = instance.isLockedAnuncio(idAnuncio);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
