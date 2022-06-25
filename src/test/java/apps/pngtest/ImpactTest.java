package apps.pngtest;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.png.HomePage;
import pages.png.ImpactPage;

//11
public class ImpactTest extends CommonAPI {
    @Test
    public void validateSeeOurImpactPage(){
        HomePage homePage = new HomePage(getDriver());
        ImpactPage impactPage = new ImpactPage(getDriver());
        homePage.setImpactBtn();
        impactPage.setSeeOurImpactBtn();
        String expectedtitle = "TOTAL ACTS OF GOOD";
        Assert.assertEquals(expectedtitle,impactPage.seeOurImpactTitle());
    }

    @Test
    public void validateSmileGapCausePage(){
        HomePage homePage = new HomePage(getDriver());
        ImpactPage impactPage = new ImpactPage(getDriver());
        homePage.setImpactBtn();
        impactPage.setSmileGapCauseBtn();
        String expectedtitle = "A Legacy of Doing Good. A Commitment to Doing Better.";
        Assert.assertEquals(expectedtitle,impactPage.smileGapCauseTitle());
    }

    @Test
    public void validateTideCausePage(){
        HomePage homePage = new HomePage(getDriver());
        ImpactPage impactPage = new ImpactPage(getDriver());
        homePage.setImpactBtn();
        impactPage.setTideCauseBtn();
        String expectedtitle = "A legacy of doing good. A commitment to doing better.";
        Assert.assertEquals(expectedtitle,impactPage.tideCauseTitle());
    }

    @Test
    public void validateSafeGuardAmericaCausePage(){
        HomePage homePage = new HomePage(getDriver());
        ImpactPage impactPage = new ImpactPage(getDriver());
        homePage.setImpactBtn();
        impactPage.setSafeGuardAmericaCauseBtn();
        String expectedtitle = "Shifting focus to Safeguard America";
        Assert.assertEquals(expectedtitle,impactPage.safeGuardAmericaCauseTitle());
    }

    @Test
    public void validateWaterCausePage(){
        HomePage homePage = new HomePage(getDriver());
        ImpactPage impactPage = new ImpactPage(getDriver());
        homePage.setImpactBtn();
        impactPage.setWaterCauseBtn();
        String expectedtitle = "Imagine your day without water";
        Assert.assertEquals(expectedtitle,impactPage.waterCauseTitle());
    }

    @Test
    public void validateHomeFrontCausePage(){
        HomePage homePage = new HomePage(getDriver());
        ImpactPage impactPage = new ImpactPage(getDriver());
        homePage.setImpactBtn();
        impactPage.setHomeFrontCauseBtn();
        String expectedtitle = "Empowering families to start strong and stay strong";
        Assert.assertEquals(expectedtitle,impactPage.homeFrontCauseTitle());
    }

    @Test
    public void validateUnitedWayCausePage(){
        HomePage homePage = new HomePage(getDriver());
        ImpactPage impactPage = new ImpactPage(getDriver());
        homePage.setImpactBtn();
        impactPage.setUnitedWayCauseBtn();
        String expectedtitle = "A legacy of doing good. A commitment to doing better.";
        Assert.assertEquals(expectedtitle,impactPage.unitedWayCauseTitle());
    }

    @Test
    public void validateMinistriesCausePage(){
        HomePage homePage = new HomePage(getDriver());
        ImpactPage impactPage = new ImpactPage(getDriver());
        homePage.setImpactBtn();
        impactPage.setMinistriesCauseBtn();
        String expectedtitle = "Coming together for communities";
        Assert.assertEquals(expectedtitle,impactPage.ministriesCauseTitle());
    }

    @Test
    public void validateFeedingAmericaCausePage(){
        HomePage homePage = new HomePage(getDriver());
        ImpactPage impactPage = new ImpactPage(getDriver());
        homePage.setImpactBtn();
        impactPage.setFeedingAmericaCauseBtn();
        String expectedtitle = "Offering hope in the face of uncertainty";
        Assert.assertEquals(expectedtitle,impactPage.feedingAmericaCauseTitle());
    }

    @Test
    public void validatePampersCausePage(){
        HomePage homePage = new HomePage(getDriver());
        ImpactPage impactPage = new ImpactPage(getDriver());
        homePage.setImpactBtn();
        impactPage.setPampersCauseBtn();
        String expectedtitle = "A legacy of doing good. A commitment to doing better.";
        Assert.assertEquals(expectedtitle,impactPage.pampersCauseTitle());
    }

    @Test
    public void validateHispanicCausePage(){
        HomePage homePage = new HomePage(getDriver());
        ImpactPage impactPage = new ImpactPage(getDriver());
        homePage.setImpactBtn();
        impactPage.setHispanicCauseBtn();
        String expectedtitle = "A legacy of doing good. A commitment to doing better.";
        Assert.assertEquals(expectedtitle,impactPage.hispanicCauseTitle());
    }


}
