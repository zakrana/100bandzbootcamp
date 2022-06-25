package apps.pngtest;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.png.EqualityAndInclusionPage;
import pages.png.GoodNewsPage;
import pages.png.HomePage;

//6
public class EqualityAndInclusionTest extends CommonAPI {
    @Test
    public void validateBlackHistoryQuizHeader(){
        HomePage homePage = new HomePage(getDriver());
        GoodNewsPage goodNewsPage = new GoodNewsPage(getDriver());
        EqualityAndInclusionPage equalityAndInclusionPage = new EqualityAndInclusionPage(getDriver());
        homePage.setGoodNewsBtn();
        goodNewsPage.setEqualityAndInclusionBtn();
        equalityAndInclusionPage.setBlackHistoryQuizBtn();
        String expectedtitle = "QUIZ: Test Your Black History Knowledge";
        Assert.assertEquals(expectedtitle,equalityAndInclusionPage.blackHistoryQuizTitle());
    }

    @Test
    public void validateChoreGapHeader(){
        HomePage homePage = new HomePage(getDriver());
        GoodNewsPage goodNewsPage = new GoodNewsPage(getDriver());
        EqualityAndInclusionPage equalityAndInclusionPage = new EqualityAndInclusionPage(getDriver());
        homePage.setGoodNewsBtn();
        goodNewsPage.setEqualityAndInclusionBtn();
        equalityAndInclusionPage.setChoreGapBtn();
        String expectedtitle = "Close the Chore Gap to Promote Equality at Home";
        Assert.assertEquals(expectedtitle,equalityAndInclusionPage.choreGapTitle());
    }

    @Test
    public void validateColorfulPrideQuizHeader(){
        HomePage homePage = new HomePage(getDriver());
        GoodNewsPage goodNewsPage = new GoodNewsPage(getDriver());
        EqualityAndInclusionPage equalityAndInclusionPage = new EqualityAndInclusionPage(getDriver());
        homePage.setGoodNewsBtn();
        goodNewsPage.setEqualityAndInclusionBtn();
        equalityAndInclusionPage.setColorfulPrideQuizBtn();
        String expectedtitle = "QUIZ: How Colorful is Your Pride?";
        Assert.assertEquals(expectedtitle,equalityAndInclusionPage.colorfulPrideQuizTitle());
    }

    @Test
    public void validateGenderEqualityQuizHeader(){
        HomePage homePage = new HomePage(getDriver());
        GoodNewsPage goodNewsPage = new GoodNewsPage(getDriver());
        EqualityAndInclusionPage equalityAndInclusionPage = new EqualityAndInclusionPage(getDriver());
        homePage.setGoodNewsBtn();
        goodNewsPage.setEqualityAndInclusionBtn();
        equalityAndInclusionPage.setGenderEqualityQuizBtn();
        String expectedtitle = "QUIZ: Test Your Knowledge on Gender Equality";
        Assert.assertEquals(expectedtitle,equalityAndInclusionPage.genderEqualityQuizTitle());
    }

    @Test
    public void validatePrideKnowledgeQuizHeader(){
        HomePage homePage = new HomePage(getDriver());
        GoodNewsPage goodNewsPage = new GoodNewsPage(getDriver());
        EqualityAndInclusionPage equalityAndInclusionPage = new EqualityAndInclusionPage(getDriver());
        homePage.setGoodNewsBtn();
        goodNewsPage.setEqualityAndInclusionBtn();
        equalityAndInclusionPage.setPrideKnowledgeQuizBtn();
        String expectedtitle = "QUIZ: What’s Your Pride Knowledge?";
        Assert.assertEquals(expectedtitle,equalityAndInclusionPage.prideKnowledgeQuizTitle());
    }

    @Test
    public void validateSevenWaysHeader(){
        HomePage homePage = new HomePage(getDriver());
        GoodNewsPage goodNewsPage = new GoodNewsPage(getDriver());
        EqualityAndInclusionPage equalityAndInclusionPage = new EqualityAndInclusionPage(getDriver());
        homePage.setGoodNewsBtn();
        goodNewsPage.setEqualityAndInclusionBtn();
        equalityAndInclusionPage.setSevenWaysBtn();
        String expectedtitle = "7 Ways You Can Create a More Equal World";
        Assert.assertEquals(expectedtitle,equalityAndInclusionPage.sevenWaysTitle());
    }



}
