/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package tarea2;

import java.util.Arrays;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Nuria
 */
public class Prueba1Test {
    
    public Prueba1Test() {
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

    @Test
    public void testPrueba1() {
        System.out.println("Prueba1");
        int[] ArrayN = {9, 3, 7, 5};
        Prueba1 instance = new Prueba1();
        int[] expResult = {3,5,7,9};
        int[] result = instance.Prueba1(ArrayN);
        assertEquals(Arrays.toString(expResult),Arrays.toString(result));
      
    }
    
     @Test
    public void testPrueba2() {
        System.out.println("Prueba1");
        int[] ArrayN = {1, 6, 2, 3};
        Prueba1 instance = new Prueba1();
        int[] expResult = {1,2,3,6};
        int[] result = instance.Prueba1(ArrayN);
        assertEquals(Arrays.toString(expResult),Arrays.toString(result));
      
    }
    
   @Test
    public void testPrueba3() {
        System.out.println("Prueba1");
        int[] ArrayN = {8, 6, 4, 2};
        Prueba1 instance = new Prueba1();
        int[] expResult = {2,4,6,8};
        int[] result = instance.Prueba1(ArrayN);
        assertEquals(Arrays.toString(expResult),Arrays.toString(result));
      
    }
    
     @Test
    public void testPrueba4() {
        System.out.println("Prueba1");
        int[] ArrayN = {1, 6, 2, 3};
        Prueba1 instance = new Prueba1();
        int[] expResult = {1, 6, 2, 3};
        int[] result = instance.Prueba1(ArrayN);
        assertEquals(Arrays.toString(expResult),Arrays.toString(result));
      
    }
    
     @Test
    public void testPrueba5() {
        System.out.println("Prueba1");
        int[] ArrayN = {8, 6, 4, 2};
        Prueba1 instance = new Prueba1();
        int[] expResult = {8, 6, 4, 2};
        int[] result = instance.Prueba1(ArrayN);
        assertEquals(Arrays.toString(expResult),Arrays.toString(result));
      
    }
}
