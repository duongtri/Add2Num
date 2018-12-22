/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addtwonum;

import org.junit.Test;
import static org.junit.Assert.*;
import addtwonum.NumberException;
import addtwonum.IReceiver;
import addtwonum.MyBigNumber;

/**
 *
 * author Hy's PC.
 */
public class MyBigNumberTest implements IReceiver {

    public MyBigNumberTest() {
    }

    /**
     * Test of sum method, of class MyBigNumber.
     */
    @Test
    public void testSum1() {
        System.out.printf("sum :");
        String str1 = "10";
        String str2 = "10";
        String expResult = "20";
        MyBigNumberTest test = new MyBigNumberTest();
        MyBigNumber mybignumber = new MyBigNumber(test);
        String result = mybignumber.sum(str1, str2);
        assertEquals(expResult, result);
    }

    @Test
    public void testSum2() {
        System.out.printf("sum :");
        String str1 = "99";
        String str2 = "99";
        String expResult = "198";
        MyBigNumberTest test = new MyBigNumberTest();
        MyBigNumber mybignumber = new MyBigNumber(test);
        String result = mybignumber.sum(str1, str2);
        assertEquals(expResult, result);
    }

    @Test
    public void testSum3() {
        System.out.printf("sum :");
        String str1 = "999";
        String str2 = "99";
        String expResult = "1098";
        MyBigNumberTest test = new MyBigNumberTest();
        MyBigNumber mybignumber = new MyBigNumber(test);
        String result = mybignumber.sum(str1, str2);
        assertEquals(expResult, result);
    }

    @Test
    public void testSum4() {
        System.out.printf("sum :");
        String str1 = "99";
        String str2 = "999";
        String expResult = "1098";
        MyBigNumberTest test = new MyBigNumberTest();
        MyBigNumber mybignumber = new MyBigNumber(test);
        String result = mybignumber.sum(str1, str2);
        assertEquals(expResult, result);
    }

    @Test
    public void testSum5() {
        try {
            System.out.printf("sum :");
            String str1 = "21";
            String str2 = "10)";
            String expResult = "31";
            MyBigNumberTest test = new MyBigNumberTest();
            MyBigNumber mybignumber = new MyBigNumber(test);
            String result = mybignumber.sum(str1, str2);
            assertEquals(expResult, result);
        } catch (NumberFormatException e) {
            System.out.printf(e);
        }
    }
    
     @Test
    public void testSum6() {
        try {
            System.out.printf("sum :");
            String str1 = "";
            String str2 = "10)";
            String expResult = "31";
            MyBigNumberTest test = new MyBigNumberTest();
            MyBigNumber mybignumber = new MyBigNumber(test);
            String result = mybignumber.sum(str1, str2);
            assertEquals(expResult, result);
        } catch (NumberFormatException e) {
            System.out.printf(e);
        }
    }

    @Override
    public void send(String msg) {
        System.out.println(msg + "\n");
    }

}
