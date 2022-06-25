package apps.pngtest;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.png.HomePage;
//7
public class HomeTest extends CommonAPI {

    @Test
    public void validateHomePage(){
        HomePage homePage = new HomePage(getDriver());
        homePage.setGoodNewsBtn();
        String expectedtitle = "Good News";
        Assert.assertEquals(expectedtitle,homePage.goodNewsTitle());
    }

    @Test
    public void validateRewardsPage(){
        HomePage homePage = new HomePage(getDriver());
        homePage.setRewardsBtn();
        String expectedtitle = "Rewards";
        Assert.assertEquals(expectedtitle,homePage.rewardsTitle());
    }

    @Test
    public void validateImpactPage(){
        HomePage homePage = new HomePage(getDriver());
        homePage.setImpactBtn();
        String expectedtitle = "Making a Difference";
        Assert.assertEquals(expectedtitle,homePage.impactTitle());
    }

    @Test
    public void validateEarnPointsPage(){
        HomePage homePage = new HomePage(getDriver());
        homePage.setEarnPointsBtn();
        String expectedtitle = "Earn Points";
        Assert.assertEquals(expectedtitle,homePage.earnPointsTitle());
    }

    @Test
    public void validateCouponsPage(){
        HomePage homePage = new HomePage(getDriver());
        homePage.setCouponsBtn();
        String expectedtitle = "Coupons";
        Assert.assertEquals(expectedtitle,homePage.couponsTitle());
    }

    @Test
    public void validateLogInHeader(){
        HomePage homePage = new HomePage(getDriver());
        homePage.setLogInBtn();
        String expectedtitle = "Please log in to get started.";
        Assert.assertEquals(expectedtitle,homePage.logInTitle());
    }

    @Test
    public void validateSignUpHeader(){
        HomePage homePage = new HomePage(getDriver());
        homePage.setSignUpBtn();
        String expectedtitle = "Sign up. Earn rewards. Do good.";
        Assert.assertEquals(expectedtitle,homePage.signUpTitle());
    }

}
