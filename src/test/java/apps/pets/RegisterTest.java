package apps.pets;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.petstore.*;


public class RegisterTest extends CommonAPI {
    @Test
    public void RegisterAnAccount() {
        LandingPage LandingPage = new LandingPage(getDriver());
        LandingPage.clickLink();
        CatalogPage CatalogPage = new CatalogPage(getDriver());
        CatalogPage.setSignin();
        SignInPage SignInPage = new SignInPage(getDriver());
        SignInPage.setRegisternow();
        RegistrationPage RegistrationPage = new RegistrationPage(getDriver());
        RegistrationPage.setUsername("SyedFX");
        RegistrationPage.setPassword("12345");
        RegistrationPage.setRepeatpassword("12345");
        RegistrationPage.setFirstname("Syed");
        RegistrationPage.setLastname("ThaGod");
        RegistrationPage.setEmail("syedfx@gmail.com");
        RegistrationPage.setPhone("7187187181");
        RegistrationPage.setAddress1("12345 Avenue");
        RegistrationPage.setAddress2("Apt A");
        RegistrationPage.setCity("New York");
        RegistrationPage.setState("NY");
        RegistrationPage.setZipcode("10036");
        String expectedtitle = "Profile Information";
        Assert.assertEquals(expectedtitle,RegistrationPage.Profiletext());
        RegistrationPage.setSaveaccountbtn();
    }

    @Test
    public void InvalidRegisterAccount() {
        LandingPage LandingPage = new LandingPage(getDriver());
        LandingPage.clickLink();
        CatalogPage CatalogPage = new CatalogPage(getDriver());
        CatalogPage.setSignin();
        SignInPage SignInPage = new SignInPage(getDriver());
        SignInPage.setRegisternow();
        RegistrationPage RegistrationPage = new RegistrationPage(getDriver());
        RegistrationPage.setUsername(".,.,");
        RegistrationPage.setPassword("123");
        RegistrationPage.setRepeatpassword("44");
        RegistrationPage.setFirstname("fhfhfh");
        RegistrationPage.setLastname("ThaGod");
        RegistrationPage.setEmail("blahahhaa");
        RegistrationPage.setPhone("7tt5");
        RegistrationPage.setAddress1("465y");
        RegistrationPage.setAddress2("Apt A");
        RegistrationPage.setCity("New York");
        RegistrationPage.setState("NY");
        RegistrationPage.setZipcode("10036");
        RegistrationPage.setSaveaccountbtn();
//        Assert.assertTrue(RegistrationPage.saveAccountButtonFunction());
    }

    @Test
    public void Create2ndAccount() {
        LandingPage LandingPage = new LandingPage(getDriver());
        LandingPage.clickLink();
        CatalogPage CatalogPage = new CatalogPage(getDriver());
        CatalogPage.setSignin();
        SignInPage SignInPage = new SignInPage(getDriver());
        SignInPage.setRegisternow();
        RegistrationPage RegistrationPage = new RegistrationPage(getDriver());
        RegistrationPage.setUsername("Tester");
        RegistrationPage.setPassword("12345");
        RegistrationPage.setRepeatpassword("12345");
        RegistrationPage.setFirstname("Test");
        RegistrationPage.setLastname("Test");
        RegistrationPage.setEmail("test@gmail.com");
        RegistrationPage.setPhone("333333333");
        RegistrationPage.setAddress1("123 Ave");
        RegistrationPage.setAddress2("Apt A");
        RegistrationPage.setCity("New York");
        RegistrationPage.setState("NY");
        RegistrationPage.setZipcode("10036");
        RegistrationPage.setCountry("USA");
        waitFor(5);
        String expectedtitle = "Profile Information";
        Assert.assertEquals(expectedtitle,RegistrationPage.Profiletext());
        RegistrationPage.setSaveaccountbtn();
    }

}
