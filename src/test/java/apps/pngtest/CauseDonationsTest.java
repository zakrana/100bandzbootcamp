package apps.pngtest;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.png.CauseDonationsPage;
import pages.png.HomePage;
import pages.png.RewardsPage;
//10
public class CauseDonationsTest extends CommonAPI {

    @Test
    public void validateBabyBookDonation(){
        HomePage homePage = new HomePage(getDriver());
        RewardsPage rewardsPage = new RewardsPage(getDriver());
        CauseDonationsPage causeDonationsPage = new CauseDonationsPage(getDriver());
        homePage.setRewardsBtn();
        rewardsPage.setCauseDonationsBtn();
        causeDonationsPage.setBabyBookDonationBtn();
        String expectedtitle = "Donate one book to help a baby’s early development";
        Assert.assertEquals(expectedtitle,causeDonationsPage.babyBookDonationTitle());
    }

    @Test
    public void validateCleanWaterDonation(){
        HomePage homePage = new HomePage(getDriver());
        RewardsPage rewardsPage = new RewardsPage(getDriver());
        CauseDonationsPage causeDonationsPage = new CauseDonationsPage(getDriver());
        homePage.setRewardsBtn();
        rewardsPage.setCauseDonationsBtn();
        causeDonationsPage.setCleanWaterDonationBtn();
        String expectedtitle = "Provide one week of clean drinking water for someone in need";
        Assert.assertEquals(expectedtitle,causeDonationsPage.cleanWaterDonationTitle());
    }

    @Test
    public void validatePeriodProtectionDonation(){
        HomePage homePage = new HomePage(getDriver());
        RewardsPage rewardsPage = new RewardsPage(getDriver());
        CauseDonationsPage causeDonationsPage = new CauseDonationsPage(getDriver());
        homePage.setRewardsBtn();
        rewardsPage.setCauseDonationsBtn();
        causeDonationsPage.setPeriodProtectionDonationBtn();
        String expectedtitle = "Provide one month of period protection for a girl in need";
        Assert.assertEquals(expectedtitle,causeDonationsPage.periodProtectionDonationTitle());
    }

    @Test
    public void validateGeneralMealsDonation(){
        HomePage homePage = new HomePage(getDriver());
        RewardsPage rewardsPage = new RewardsPage(getDriver());
        CauseDonationsPage causeDonationsPage = new CauseDonationsPage(getDriver());
        homePage.setRewardsBtn();
        rewardsPage.setCauseDonationsBtn();
        causeDonationsPage.setGeneralMealsDonationBtn();
        String expectedtitle = "Provide ten meals* for people in need";
        Assert.assertEquals(expectedtitle,causeDonationsPage.generalMealsDonationTitle());
    }

    @Test
    public void validateDishSoapDonation(){
        HomePage homePage = new HomePage(getDriver());
        RewardsPage rewardsPage = new RewardsPage(getDriver());
        CauseDonationsPage causeDonationsPage = new CauseDonationsPage(getDriver());
        homePage.setRewardsBtn();
        rewardsPage.setCauseDonationsBtn();
        causeDonationsPage.setDishSoapDonationBtn();
        String expectedtitle = "Donate dish soap for the first baths of three oil-covered birds";
        Assert.assertEquals(expectedtitle,causeDonationsPage.dishSoapDonationTitle());
    }

    @Test
    public void validateSeaLionDonation(){
        HomePage homePage = new HomePage(getDriver());
        RewardsPage rewardsPage = new RewardsPage(getDriver());
        CauseDonationsPage causeDonationsPage = new CauseDonationsPage(getDriver());
        homePage.setRewardsBtn();
        rewardsPage.setCauseDonationsBtn();
        waitFor(3);
        causeDonationsPage.setSeaLionDonationBtn();
        String expectedtitle = "Donate seven doses of medicine to sick sea lion pups";
        Assert.assertEquals(expectedtitle,causeDonationsPage.seaLionDonationTitle());
    }

    @Test
    public void validateWifiDonationTest(){
        HomePage homePage = new HomePage(getDriver());
        RewardsPage rewardsPage = new RewardsPage(getDriver());
        CauseDonationsPage causeDonationsPage = new CauseDonationsPage(getDriver());
        homePage.setRewardsBtn();
        rewardsPage.setCauseDonationsBtn();
        waitFor(3);
        causeDonationsPage.setWifiDonationBtn();
        String expectedtitle = "Connect a family to Wi-Fi to continue at-home learning";
        Assert.assertEquals(expectedtitle,causeDonationsPage.wifiDonationTitle());
    }

    @Test
    public void validateSupportAccessDonationTest(){
        HomePage homePage = new HomePage(getDriver());
        RewardsPage rewardsPage = new RewardsPage(getDriver());
        CauseDonationsPage causeDonationsPage = new CauseDonationsPage(getDriver());
        homePage.setRewardsBtn();
        rewardsPage.setCauseDonationsBtn();
        waitFor(5);
        causeDonationsPage.setSupportAccessDonationBtn();
        String expectedtitle = "Donate to support access to resources via 211 service";
        Assert.assertEquals(expectedtitle,causeDonationsPage.supportAccessDonationTitle());
    }

    @Test
    public void validateArborDayDonation(){
        HomePage homePage = new HomePage(getDriver());
        RewardsPage rewardsPage = new RewardsPage(getDriver());
        CauseDonationsPage causeDonationsPage = new CauseDonationsPage(getDriver());
        homePage.setRewardsBtn();
        rewardsPage.setCauseDonationsBtn();
        waitFor(5);
        causeDonationsPage.setArborDayDonationBtn();
        String expectedtitle = "Plant a tree through the Arbor Day Foundation";
        Assert.assertEquals(expectedtitle,causeDonationsPage.arborDayDonationTitle());
    }

    @Test
    public void validateLgbtqDonation(){
        HomePage homePage = new HomePage(getDriver());
        RewardsPage rewardsPage = new RewardsPage(getDriver());
        CauseDonationsPage causeDonationsPage = new CauseDonationsPage(getDriver());
        homePage.setRewardsBtn();
        rewardsPage.setCauseDonationsBtn();
        waitFor(5);
        causeDonationsPage.setLgbtqDonationBtn();
        String expectedtitle = "Reach one hundred people with a news story to support LGBTQ+ equality";
        Assert.assertEquals(expectedtitle,causeDonationsPage.lgbtqDonationTitle());
    }




}
