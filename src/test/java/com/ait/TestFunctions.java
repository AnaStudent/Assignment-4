package com.ait;

import org.junit.*;

import static org.junit.Assert.*;

public class TestFunctions extends Functions{
    /*
    3. Create a object of type Functions
    4. Assign values into setters
    5. Access values using the getters methods
     */
    public static void main(String[] args) {
        TestFunctions tfun = new TestFunctions();
        //Encaptulation
        //tfun.runEncaptulation();

        //Inheritance
        int num1 = 55;
        int num2 = 55;
        System.out.println("The answer is: " + tfun.addition(num1,num2));

        //
    }

    public void runEncaptulation(){
        Functions fun = new Functions();
        fun.setStudID("68377");
        fun.setName("Anastasia");
        fun.setInstitute("CPUT");
        fun.setYear(3);

        System.out.println("-----Data that could be accessed-----");
        System.out.println("Student ID: " + fun.getStudID() + " Student name: " + fun.getName() + " Institute: " + fun.getInstitute()+ " Year: " + fun.getYear());
    }

    @Test
    public void testEncap(){
        Functions fun = new Functions();
        fun.setStudID("68377");
        fun.setName("Anastasia");
        fun.setInstitute("CPUT");
        fun.setYear(3);
        assertEquals("68377 Anastasia CPUT 3", fun.getStudID()+ " " + fun.getName() + " " + fun.getInstitute() + " " + fun.getYear());
    }
    @Test
    public void testInheritance(){
        TestFunctions tfun = new TestFunctions();
        int num1 = 55;
        int num2 = 55;
        assertEquals(110, tfun.addition(num1,num2));
    }
}
