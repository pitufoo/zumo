package zumo;

import static junit.framework.TestCase.assertTrue;
import static junit.framework.TestCase.fail;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author pabloaparicioestevez
 */
public class ZumoTest {

    public ZumoTest() {
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
     * @throws java.lang.Exception
     */
    @Test
    public void testObtenerLitros() throws Exception{
        System.out.println("obtenerLitros");
        Zumo instance = new Zumo();
        int expResult = 0;
        int result = instance.obtenerLitros();
        assertEquals(expResult, result);
    }

/**
* Test para el método SacarZumo. En esta prueba intento sacar 10 litros de un deposito que contiene 20.
* El metodo debe de permitirlo.
* @throws java.lang.Exception */
    @Test
    public void testSacarZumo1() throws Exception {
        System.out.println("\"Test de prueba para sacar un número de litros positivo");
        int litros = 10;
        int dinero = 40;
        Zumo instance = new Zumo(20, 2, "Pomelo", 40);
        instance.sacarZumo(litros, dinero);
        assertTrue(instance.obtenerLitros() == 10); // Como parto de un deposito que contiene 20 litros y saco 10 deben de quedar 10 litros
    }

/**
* Test para el método SacarZumo. En esta prueba intento sacar un numero de litros negativo.
* El metodo no debe de permitirlo y debe saltar la excepción.
* @throws java.lang.Exception */
    @Test
    public void testSacarZumo2() throws Exception {
        System.out.println("\"Test de prueba para sacar un número de litros negativo");
        int litros = -10;
        int dinero = 40;
        Zumo instance = new Zumo(20, 2, "Pomelo", 40);

        try {
            instance.sacarZumo(litros, dinero);
            fail("Intento sacar un número negativo de litros de zumo");// la prueba falla al sacar litros negativos , por lo tanto es exitosa
        } catch (Exception e) {
            System.out.println(e);
            assertTrue(instance.obtenerLitros()==20);
        }
    }

/**
* Test para el método SacarZumo. En esta prueba intento sacar un numero de litros superior al contenido del deposito. 
* El metodo no debe de permitirlo y debe saltar la excepción.
* @throws java.lang.Exception */
    @Test
    public void testSacarZumo3() throws Exception {
        System.out.println("\"Test de prueba para sacar un número de litros superior al contenido del deposito");
        int litros = 50;
        int dinero = 150;
        Zumo instance = new Zumo(20, 2, "Pomelo", 40);
        try {
            instance.sacarZumo(litros, dinero);
            fail("Intento sacar un número superior al contenido del deposito");// la prueba falla al sacar un numero de litros superior al contenido del deposito, por lo tanto es exitosa
        } catch (Exception e) {
            System.out.println(e);
            assertTrue(instance.obtenerLitros()==20);
        }
    }

/**
* Test para el método SacarZumo. En esta prueba intento sacar zumo con saldo insuficiente.
* El metodo no debe de permitirlo y debe saltar la excepción.
* @throws java.lang.Exception */
    @Test
    public void testSacarZumo4() throws Exception {
        System.out.println("\"Test de prueba para sacar zumo con saldo insuficiente");
        int litros = 10;
        int dinero = 0;
        Zumo instance = new Zumo(20, 2, "Pomelo", 40);
        try {
            instance.sacarZumo(litros, dinero);
            fail("Intento sacar zumo sin saldo suficiente");// la prueba falla al intentar sacar zumo con saldo insuficiente, por lo tanto es exitosa
        } catch (Exception e) {
            System.out.println(e);
            assertTrue(instance.obtenerLitros()==20);
        }
    }
    
/**
* Test para el método SacarZumo. En esta prueba intento sacar mas zumo del disponible. 
* El metodo no debe de permitirlo y debe saltar la excepción.
* @throws java.lang.Exception */
    @Test
    public void testSacarZumo5() throws Exception {
        System.out.println("\"Test de prueba para sacar mas zumo del disponible");
        int litros = 30;
        int dinero = 70;
        Zumo instance = new Zumo(20, 2, "Pomelo", 40);
        try {
            instance.sacarZumo(litros, dinero);
            fail("Intento sacar mas zumo del que queda en el deposito");// la prueba falla al intentar sacar  mas zumo del disponible, por lo tanto es exitosa
        } catch (Exception e) {
            System.out.println(e);
            assertTrue(instance.obtenerLitros()==20);        
        }
    }

 /**
* Test para el método Rellenar. En esta prueba intento rellenar 50 litros en  el deposito de 40 litros.
* El metodo no debe de permitirlo y debe saltar la excepción.
* @throws java.lang.Exception */

    @Test
    public void testRellenar1() throws Exception {
        System.out.println("\"Test de prueba para rellenar el deposito superando su capacidad");
        int litros = 50;
        Zumo instance = new Zumo(20, 2, "Pomelo", 40);
        try {
            instance.rellenar(litros);
            fail("No se puede superar la capacidad del deposito");// la prueba falla al superar la capacidad del deposito, por lo tanto es exitosa
        } catch (Exception e) {
            System.out.println(e);
            assertTrue(instance.obtenerLitros()==20);
        }
    }

 /**
* Test para el método Rellenar. En esta prueba intento rellenar el deposito con una cantidad negativa.
* El metodo no debe de permitirlo y debe saltar la excepción.
* @throws java.lang.Exception */
    @Test
    public void testRellenar2() throws Exception {
        System.out.println("\"Test de prueba para rellenar el deposito con una catidad negativa");
        int litros = -5;
        Zumo instance = new Zumo(20, 2, "Pomelo", 40);
        try {
            instance.rellenar(litros);
            fail("No se puede rellenar un numero negativo de litros");// la prueba falla al intentar sacar un numero negativo de litros, por lo tanto es exitosa
        } catch (Exception e) {
            System.out.println(e);
            assertTrue(instance.obtenerLitros()==20);            
        }
    }

/**
* Test para el método Rellenar. En esta prueba intento rellenar un numero positivo de litros.
* El metodo debe de permitirlo.
* @throws java.lang.Exception */
    @Test
    public void testRellenar3() throws Exception {
        System.out.println("\"Test de prueba para rellenar el deposito con una catidad  positiva que no supere la capacidad del deposito");
        int litros = 5;
        Zumo instance = new Zumo(20, 2, "Pomelo", 40);
        instance.rellenar(litros);
        assertTrue(instance.obtenerLitros() == 25); // Como parto de un deposito que contiene 20 litros y relleno 5 deben de quedar 25 litros
    }

    /**
     * Test of sacarZumo method, of class Zumo.
     */
    @Test
    public void testSacarZumo() throws Exception {
        System.out.println("sacarZumo");
        int litros = 0;
        int dinero = 0;
        Zumo instance = new Zumo();
        instance.sacarZumo(litros, dinero);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of rellenar method, of class Zumo.
     */
    @Test
    public void testRellenar() throws Exception {
        System.out.println("rellenar");
        int litros = 0;
        Zumo instance = new Zumo();
        instance.rellenar(litros);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
