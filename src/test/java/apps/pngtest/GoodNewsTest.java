package apps.pngtest;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.png.GoodNewsPage;
import pages.png.HomePage;
//7
public class GoodNewsTest extends CommonAPI {

    @Test
    public void validateLeadWithLovePage(){
        HomePage homePage = new HomePage(getDriver());
        GoodNewsPage goodNewsPage = new GoodNewsPage(getDriver());
        homePage.setGoodNewsBtn();
        goodNewsPage.setLeadWithLoveBtn();
        String expectedtitle = "#LeadWithLove";
        Assert.assertEquals(expectedtitle,goodNewsPage.leadWithLoveTitle());
    }

    @Test
    public void validateEqualityAndInclusionPage(){
        HomePage homePage = new HomePage(getDriver());
        GoodNewsPage goodNewsPage = new GoodNewsPage(getDriver());
        homePage.setGoodNewsBtn();
        goodNewsPage.setEqualityAndInclusionBtn();
        String expectedtitle = "#equalityandinclusion";
        Assert.assertEquals(expectedtitle,goodNewsPage.equalityAndInclusionTitle());
    }

    @Test
    public void validateSustainabilityPage(){
        HomePage homePage = new HomePage(getDriver());
        GoodNewsPage goodNewsPage = new GoodNewsPage(getDriver());
        homePage.setGoodNewsBtn();
        goodNewsPage.setSustainabilityBtn();
        String expectedtitle = "#sustainability";
        Assert.assertEquals(expectedtitle,goodNewsPage.sustainabilityTitle());
    }

    @Test
    public void validateCSDWPage(){
        HomePage homePage = new HomePage(getDriver());
        GoodNewsPage goodNewsPage = new GoodNewsPage(getDriver());
        homePage.setGoodNewsBtn();
        goodNewsPage.setCSDWBtn();
        String expectedtitle = "#CSDW";
        Assert.assertEquals(expectedtitle,goodNewsPage.CSDWTitle());
    }

    @Test
    public void validateCommunityImpactPage(){
        HomePage homePage = new HomePage(getDriver());
        GoodNewsPage goodNewsPage = new GoodNewsPage(getDriver());
        homePage.setGoodNewsBtn();
        goodNewsPage.setCommunityImpactBtn();
        String expectedtitle = "#CommunityImpact";
        Assert.assertEquals(expectedtitle,goodNewsPage.communityImpactTitle());
    }

    @Test
    public void validateDiversityAndInclusionPage(){
        HomePage homePage = new HomePage(getDriver());
        GoodNewsPage goodNewsPage = new GoodNewsPage(getDriver());
        homePage.setGoodNewsBtn();
        goodNewsPage.setDiversityAndInclusionBtn();
        String expectedtitle = "#DiversityandInclusion";
        Assert.assertEquals(expectedtitle,goodNewsPage.diversityAndInclusionTitle());
    }

    @Test
    public void validatePGGoodEverDayPage(){
        HomePage homePage = new HomePage(getDriver());
        GoodNewsPage goodNewsPage = new GoodNewsPage(getDriver());
        homePage.setGoodNewsBtn();
        goodNewsPage.setPGGoodEveryDayBtn();
        String expectedtitle = "#PGGoodEveryday";
        Assert.assertEquals(expectedtitle,goodNewsPage.diversityAndInclusionTitle());
    }

}
