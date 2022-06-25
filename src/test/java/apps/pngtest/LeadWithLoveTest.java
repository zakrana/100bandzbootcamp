package apps.pngtest;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.png.GoodNewsPage;
import pages.png.HomePage;
import pages.png.LeadWithLovePage;
//6
public class LeadWithLoveTest extends CommonAPI {
    @Test
    public void validateAlwaysThereVideoHeader(){
        HomePage homePage = new HomePage(getDriver());
        GoodNewsPage goodNewsPage = new GoodNewsPage(getDriver());
        LeadWithLovePage leadWithLovePage = new LeadWithLovePage(getDriver());
        homePage.setGoodNewsBtn();
        goodNewsPage.setLeadWithLoveBtn();
        leadWithLovePage.setAlwaysThereVideoBtn();
        String expectedtitle = "VIDEO: Always There";
        Assert.assertEquals(expectedtitle,leadWithLovePage.alwaysThereVideoTitle());
    }

    @Test
    public void validateBennettSistersVideoHeader(){
        HomePage homePage = new HomePage(getDriver());
        GoodNewsPage goodNewsPage = new GoodNewsPage(getDriver());
        LeadWithLovePage leadWithLovePage = new LeadWithLovePage(getDriver());
        homePage.setGoodNewsBtn();
        goodNewsPage.setLeadWithLoveBtn();
        leadWithLovePage.setBennettSistersVideoBtn();
        String expectedtitle = "Meet the 13-Year-Old Bennett Sisters Who Are Helping to End Period Poverty";
        Assert.assertEquals(expectedtitle,leadWithLovePage.bennettSistersVideoTitle());
    }

    @Test
    public void validateCareGivingTipsHeader(){
        HomePage homePage = new HomePage(getDriver());
        GoodNewsPage goodNewsPage = new GoodNewsPage(getDriver());
        LeadWithLovePage leadWithLovePage = new LeadWithLovePage(getDriver());
        homePage.setGoodNewsBtn();
        goodNewsPage.setLeadWithLoveBtn();
        leadWithLovePage.setCareGivingTipsBtn();
        String expectedtitle = "Caregiving Tips to Lessen the Load!";
        Assert.assertEquals(expectedtitle,leadWithLovePage.careGivingTipsTitle());
    }

    @Test
    public void validateMotherOfTheForestsHeader(){
        HomePage homePage = new HomePage(getDriver());
        GoodNewsPage goodNewsPage = new GoodNewsPage(getDriver());
        LeadWithLovePage leadWithLovePage = new LeadWithLovePage(getDriver());
        homePage.setGoodNewsBtn();
        goodNewsPage.setLeadWithLoveBtn();
        leadWithLovePage.setMotherOfTheForestsVideoBtn();
        String expectedtitle = "Meet the 'Mother of the Forests' Advocating for Responsible Forestry";
        Assert.assertEquals(expectedtitle,leadWithLovePage.motherOfTheForestsVideoTitle());
    }

    @Test
    public void validatePastorRudyVideoHeader(){
        HomePage homePage = new HomePage(getDriver());
        GoodNewsPage goodNewsPage = new GoodNewsPage(getDriver());
        LeadWithLovePage leadWithLovePage = new LeadWithLovePage(getDriver());
        homePage.setGoodNewsBtn();
        goodNewsPage.setLeadWithLoveBtn();
        leadWithLovePage.setPastorRudyVideoBtn();
        String expectedtitle = "Meet Pastor Rudy, an Inspiration to the Poor and Underserved in Houston";
        Assert.assertEquals(expectedtitle,leadWithLovePage.pastorRudyVideoTitle());
    }

    @Test
    public void validateTokyoPodiumVideoHeader(){
        HomePage homePage = new HomePage(getDriver());
        GoodNewsPage goodNewsPage = new GoodNewsPage(getDriver());
        LeadWithLovePage leadWithLovePage = new LeadWithLovePage(getDriver());
        homePage.setGoodNewsBtn();
        goodNewsPage.setLeadWithLoveBtn();
        leadWithLovePage.setTokyoPodiumVideoBtn();
        String expectedtitle = "Tokyo 2020 podiums made entirely of recycled plastic";
        Assert.assertEquals(expectedtitle,leadWithLovePage.tokyoPodiumVideoTitle());
    }




}
