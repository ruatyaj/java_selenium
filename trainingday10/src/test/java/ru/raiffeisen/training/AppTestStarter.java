package ru.raiffeisen.training;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;

import org.junit.Ignore;
import org.junit.Test;


public class AppTestStarter
{
    @Ignore
    @Test
    public void testAnswerWithTrue()
    {
        assertTrue(1==6);
        assertTrue(1==1);
        //assertTrue( true );
    }



    @Test
    public void testAnswerWithTrue1()
    {
        int a=1, b=2;
        assertTrue(1==1);
        a=1/(b-a);
        assertTrue(1==1);
        //assertTrue( true );
    }


    @Test
    public void testLogin(){
        String login = "   name1334 ";
        String password = "    07081967";
        Login login1= new Login(login,password);
        assertTrue("Wrong results",login1.getUserLogin().equals("NAME1334"));

    }

    @Test
    public void testValidPassword() throws PasswordException {
        String login = "   name1334 ";
        String password = "07081967";
        Login login1= new Login(login,password);
        login1.verify();
        //assertTrue("Wrong results",login1.getUserLogin().equals("NAME1334"));

    }


    @Test(expected = PasswordException.class)
    public void testInvalidPassword() throws PasswordException {
        Login login1= new Login("GOGA","12345");
        login1.verify();
    }


    @Test
    public void testValidPassword2()  {
        String login = "   name1334 ";
        String password = "070817";
        Login login1= new Login(login,password);
        try {
            login1.verify();
        } catch (PasswordException e) {
            assertTrue("Failed password "+ e.getMessage(),false);
        }


    }


}
