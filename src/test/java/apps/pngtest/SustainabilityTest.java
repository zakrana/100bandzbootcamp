package apps.pngtest;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.png.GoodNewsPage;
import pages.png.HomePage;
import pages.png.SustainabilityPage;
//28
public class SustainabilityTest extends CommonAPI {
    @Test
    public void validateRecyclingTipsHeader(){
        HomePage homePage = new HomePage(getDriver());
        GoodNewsPage goodNewsPage = new GoodNewsPage(getDriver());
        SustainabilityPage sustainabilityPage = new SustainabilityPage(getDriver());
        homePage.setGoodNewsBtn();
        goodNewsPage.setSustainabilityBtn();
        sustainabilityPage.setRecyclingTipsBtn();
        String expectedtitle = "Recycling Tips to Beat the Packaging Pileup";
        Assert.assertEquals(expectedtitle,sustainabilityPage.recyclingTipsTitle());
    }

    @Test
    public void validateDriveClimateChangeHeader(){
        HomePage homePage = new HomePage(getDriver());
        GoodNewsPage goodNewsPage = new GoodNewsPage(getDriver());
        SustainabilityPage sustainabilityPage = new SustainabilityPage(getDriver());
        homePage.setGoodNewsBtn();
        goodNewsPage.setSustainabilityBtn();
        sustainabilityPage.setDriveClimateChangeBtn();
        String expectedtitle = "Climate Change: How P&G Is Taking Action to Drive Change and You Can, Too";
        Assert.assertEquals(expectedtitle,sustainabilityPage.driveClimateChangeTitle());
    }

    @Test
    public void validateBucketListHeader(){
        HomePage homePage = new HomePage(getDriver());
        GoodNewsPage goodNewsPage = new GoodNewsPage(getDriver());
        SustainabilityPage sustainabilityPage = new SustainabilityPage(getDriver());
        homePage.setGoodNewsBtn();
        goodNewsPage.setSustainabilityBtn();
        sustainabilityPage.setBucketListBtn();
        String expectedtitle = "The Doing Good Bucket List";
        Assert.assertEquals(expectedtitle,sustainabilityPage.bucketListTitle());
    }

    @Test
    public void validateBucketVideoHeader(){
        HomePage homePage = new HomePage(getDriver());
        GoodNewsPage goodNewsPage = new GoodNewsPage(getDriver());
        SustainabilityPage sustainabilityPage = new SustainabilityPage(getDriver());
        homePage.setGoodNewsBtn();
        goodNewsPage.setSustainabilityBtn();
        sustainabilityPage.setBucketVideoBtn();
        String expectedtitle = "Saving More than a Drop in the Bucket";
        Assert.assertEquals(expectedtitle,sustainabilityPage.bucketVideoTitle());
    }

    @Test
    public void validateSixFamilyProjects(){
        HomePage homePage = new HomePage(getDriver());
        GoodNewsPage goodNewsPage = new GoodNewsPage(getDriver());
        SustainabilityPage sustainabilityPage = new SustainabilityPage(getDriver());
        homePage.setGoodNewsBtn();
        goodNewsPage.setSustainabilityBtn();
        sustainabilityPage.setSixFamilyProjectsBtn();
        String expectedtitle = "6 Environmental Projects for the Whole Family";
        Assert.assertEquals(expectedtitle,sustainabilityPage.sixFamilyProjectsTitle());
    }

    @Test
    public void validateFindACareer(){
        HomePage homePage = new HomePage(getDriver());
        GoodNewsPage goodNewsPage = new GoodNewsPage(getDriver());
        SustainabilityPage sustainabilityPage = new SustainabilityPage(getDriver());
        homePage.setGoodNewsBtn();
        goodNewsPage.setSustainabilityBtn();
        sustainabilityPage.setFindACareerBtn();
        String expectedtitle = "How to Find a Company That Shares Your Values";
        Assert.assertEquals(expectedtitle,sustainabilityPage.findACareerTitle());
    }

    @Test
    public void validateFoodWaste(){
        HomePage homePage = new HomePage(getDriver());
        GoodNewsPage goodNewsPage = new GoodNewsPage(getDriver());
        SustainabilityPage sustainabilityPage = new SustainabilityPage(getDriver());
        homePage.setGoodNewsBtn();
        goodNewsPage.setSustainabilityBtn();
        sustainabilityPage.setFoodWasteBtn();
        String expectedtitle = "What Can You Do About Food Waste?";
        Assert.assertEquals(expectedtitle,sustainabilityPage.foodWasteTitle());
    }

    @Test
    public void validateGreenHouseGazQuiz(){
        HomePage homePage = new HomePage(getDriver());
        GoodNewsPage goodNewsPage = new GoodNewsPage(getDriver());
        SustainabilityPage sustainabilityPage = new SustainabilityPage(getDriver());
        homePage.setGoodNewsBtn();
        goodNewsPage.setSustainabilityBtn();
        sustainabilityPage.setGreenHouseGasQuizBtn();
        String expectedtitle = "QUIZ: Do you know how greenhouse gas emissions affect climate change?";
        Assert.assertEquals(expectedtitle,sustainabilityPage.greenHouseGasQuizTitle());
    }

    @Test
    public void validateHealthierOceanHeader(){
        HomePage homePage = new HomePage(getDriver());
        GoodNewsPage goodNewsPage = new GoodNewsPage(getDriver());
        SustainabilityPage sustainabilityPage = new SustainabilityPage(getDriver());
        homePage.setGoodNewsBtn();
        goodNewsPage.setSustainabilityBtn();
        sustainabilityPage.setHealthierOceanBtn();
        String expectedtitle = "A Healthier Ocean Means a Healthier World";
        Assert.assertEquals(expectedtitle,sustainabilityPage.healthierOceanTitle());
    }

    @Test
    public void validateIbrCelebratesHeader(){
        HomePage homePage = new HomePage(getDriver());
        GoodNewsPage goodNewsPage = new GoodNewsPage(getDriver());
        SustainabilityPage sustainabilityPage = new SustainabilityPage(getDriver());
        homePage.setGoodNewsBtn();
        goodNewsPage.setSustainabilityBtn();
        sustainabilityPage.setIbrCelebratesBtn();
        String expectedtitle = "International Bird Rescue Celebrates 50 Years of Saving Wildlife";
        Assert.assertEquals(expectedtitle,sustainabilityPage.ibrCelebratesTitle());
    }

    @Test
    public void validateInfusingCommunitiesHeader(){
        HomePage homePage = new HomePage(getDriver());
        GoodNewsPage goodNewsPage = new GoodNewsPage(getDriver());
        SustainabilityPage sustainabilityPage = new SustainabilityPage(getDriver());
        homePage.setGoodNewsBtn();
        goodNewsPage.setSustainabilityBtn();
        sustainabilityPage.setInfusingCommunitiesBtn();
        String expectedtitle = "Meet the People Infusing Their Communities with Love and Support When It’s Needed Most";
        Assert.assertEquals(expectedtitle,sustainabilityPage.infusingCommunitiesTitle());
    }

    @Test
    public void validateIngredientsYouCanTrust(){
        HomePage homePage = new HomePage(getDriver());
        GoodNewsPage goodNewsPage = new GoodNewsPage(getDriver());
        SustainabilityPage sustainabilityPage = new SustainabilityPage(getDriver());
        homePage.setGoodNewsBtn();
        goodNewsPage.setSustainabilityBtn();
        sustainabilityPage.setIngredientsYouCanTrustBtn();
        String expectedtitle = "Ingredients You Can Trust, Transparency to Make Shopping Easier: How P&G Brands Are Making a Positive Impact";
        Assert.assertEquals(expectedtitle,sustainabilityPage.ingredientsYouCanTrustTitle());
    }

    @Test
    public void validateLaundryDayHeader(){
        HomePage homePage = new HomePage(getDriver());
        GoodNewsPage goodNewsPage = new GoodNewsPage(getDriver());
        SustainabilityPage sustainabilityPage = new SustainabilityPage(getDriver());
        homePage.setGoodNewsBtn();
        goodNewsPage.setSustainabilityBtn();
        sustainabilityPage.setLaundryDayBtn();
        String expectedtitle = "Laundry Day? Here’s How to Wash Sustainably";
        Assert.assertEquals(expectedtitle,sustainabilityPage.laundryDayTitle());
    }

    @Test
    public void validateJoinUsLeadWithLoveHeader(){
        HomePage homePage = new HomePage(getDriver());
        GoodNewsPage goodNewsPage = new GoodNewsPage(getDriver());
        SustainabilityPage sustainabilityPage = new SustainabilityPage(getDriver());
        homePage.setGoodNewsBtn();
        goodNewsPage.setSustainabilityBtn();
        sustainabilityPage.setJoinUsLeadWithLoveBtn();
        String expectedtitle = "Join Us to #LeadWithLove in 2022 and Beyond";
        Assert.assertEquals(expectedtitle,sustainabilityPage.joinUsLeadWithLoveTitle());
    }

    @Test
    public void validateLegacyOfGoodHeader(){
        HomePage homePage = new HomePage(getDriver());
        GoodNewsPage goodNewsPage = new GoodNewsPage(getDriver());
        SustainabilityPage sustainabilityPage = new SustainabilityPage(getDriver());
        homePage.setGoodNewsBtn();
        goodNewsPage.setSustainabilityBtn();
        sustainabilityPage.setLegacyOfGoodBtn();
        String expectedtitle = "A Legacy of Good: 180 Years of P&G in the Community";
        Assert.assertEquals(expectedtitle,sustainabilityPage.legacyOfGoodTitle());
    }

    @Test
    public void validateLessPlasticHeader(){
        HomePage homePage = new HomePage(getDriver());
        GoodNewsPage goodNewsPage = new GoodNewsPage(getDriver());
        SustainabilityPage sustainabilityPage = new SustainabilityPage(getDriver());
        homePage.setGoodNewsBtn();
        goodNewsPage.setSustainabilityBtn();
        sustainabilityPage.setLessPlasticBtn();
        String expectedtitle = "A Smarter Plan for Less Plastic Waste";
        Assert.assertEquals(expectedtitle,sustainabilityPage.lessPlasticTitle());
    }

    @Test
    public void validateMeasureOfGreatnessVideoHeader(){
        HomePage homePage = new HomePage(getDriver());
        GoodNewsPage goodNewsPage = new GoodNewsPage(getDriver());
        SustainabilityPage sustainabilityPage = new SustainabilityPage(getDriver());
        homePage.setGoodNewsBtn();
        goodNewsPage.setSustainabilityBtn();
        sustainabilityPage.setMeasureOfGreatnessBtn();
        String expectedtitle = "VIDEO: The Measure of Greatness";
        Assert.assertEquals(expectedtitle,sustainabilityPage.measureOfGreatnessTitle());
    }

    @Test
    public void validateMeasureOfGreatnessHeader(){
        HomePage homePage = new HomePage(getDriver());
        GoodNewsPage goodNewsPage = new GoodNewsPage(getDriver());
        SustainabilityPage sustainabilityPage = new SustainabilityPage(getDriver());
        homePage.setGoodNewsBtn();
        goodNewsPage.setSustainabilityBtn();
        sustainabilityPage.setMeasureOfGreatnessBtn();
        String expectedtitle = "VIDEO: The Measure of Greatness";
        Assert.assertEquals(expectedtitle,sustainabilityPage.measureOfGreatnessTitle());
    }

    @Test
    public void validatePaperPackagingHeader(){
        HomePage homePage = new HomePage(getDriver());
        GoodNewsPage goodNewsPage = new GoodNewsPage(getDriver());
        SustainabilityPage sustainabilityPage = new SustainabilityPage(getDriver());
        homePage.setGoodNewsBtn();
        goodNewsPage.setSustainabilityBtn();
        sustainabilityPage.setPaperPackagingBtn();
        String expectedtitle = "New Paper Packaging Helps Cut Plastic Waste";
        Assert.assertEquals(expectedtitle,sustainabilityPage.paperPackagingTitle());
    }

    @Test
    public void validatePartOfRecyclingHeader(){
        HomePage homePage = new HomePage(getDriver());
        GoodNewsPage goodNewsPage = new GoodNewsPage(getDriver());
        SustainabilityPage sustainabilityPage = new SustainabilityPage(getDriver());
        homePage.setGoodNewsBtn();
        goodNewsPage.setSustainabilityBtn();
        sustainabilityPage.setPartOfRecyclingBtn();
        String expectedtitle = "Become a Part of the Recycling Solution";
        Assert.assertEquals(expectedtitle,sustainabilityPage.partOfRecyclingTitle());
    }

    @Test
    public void validatePlasticStrawHeader(){
        HomePage homePage = new HomePage(getDriver());
        GoodNewsPage goodNewsPage = new GoodNewsPage(getDriver());
        SustainabilityPage sustainabilityPage = new SustainabilityPage(getDriver());
        homePage.setGoodNewsBtn();
        goodNewsPage.setSustainabilityBtn();
        sustainabilityPage.setPlasticStrawBtn();
        String expectedtitle = "6 Great Alternatives to Plastic Straws";
        Assert.assertEquals(expectedtitle,sustainabilityPage.plasticStrawTitle());
    }

    @Test
    public void validateProtectForestsHeader(){
        HomePage homePage = new HomePage(getDriver());
        GoodNewsPage goodNewsPage = new GoodNewsPage(getDriver());
        SustainabilityPage sustainabilityPage = new SustainabilityPage(getDriver());
        homePage.setGoodNewsBtn();
        goodNewsPage.setSustainabilityBtn();
        sustainabilityPage.setProtectForestsBtn();
        String expectedtitle = "Want to Protect Forests? Here’s How.";
        Assert.assertEquals(expectedtitle,sustainabilityPage.protectForestsTitle());
    }

    @Test
    public void validateRandomActsOfKindness(){
        HomePage homePage = new HomePage(getDriver());
        GoodNewsPage goodNewsPage = new GoodNewsPage(getDriver());
        SustainabilityPage sustainabilityPage = new SustainabilityPage(getDriver());
        homePage.setGoodNewsBtn();
        goodNewsPage.setSustainabilityBtn();
        sustainabilityPage.setRandomActsOfKindnessBtn();
        String expectedtitle = "Spread More Good with 22 Random Acts of Kindness";
        Assert.assertEquals(expectedtitle,sustainabilityPage.randomActsOfKindnessTitle());
    }

    @Test
    public void validateBeyondTheBasics(){
        HomePage homePage = new HomePage(getDriver());
        GoodNewsPage goodNewsPage = new GoodNewsPage(getDriver());
        SustainabilityPage sustainabilityPage = new SustainabilityPage(getDriver());
        homePage.setGoodNewsBtn();
        goodNewsPage.setSustainabilityBtn();
        sustainabilityPage.setBeyondTheBasicsBtn();
        String expectedtitle = "7 Recycling Tips: Beyond the Basics";
        Assert.assertEquals(expectedtitle,sustainabilityPage.beyondTheBasicsTitle());
    }

    @Test
    public void validateSmallActionsAtHome(){
        HomePage homePage = new HomePage(getDriver());
        GoodNewsPage goodNewsPage = new GoodNewsPage(getDriver());
        SustainabilityPage sustainabilityPage = new SustainabilityPage(getDriver());
        homePage.setGoodNewsBtn();
        goodNewsPage.setSustainabilityBtn();
        sustainabilityPage.setSmallActionsAtHomeBtn();
        String expectedtitle = "Small Actions at Home Can Make a World of Difference";
        Assert.assertEquals(expectedtitle,sustainabilityPage.smallActionsAtHomeTitle());
    }

    @Test
    public void validateSuperHeroQuiz(){
        HomePage homePage = new HomePage(getDriver());
        GoodNewsPage goodNewsPage = new GoodNewsPage(getDriver());
        SustainabilityPage sustainabilityPage = new SustainabilityPage(getDriver());
        homePage.setGoodNewsBtn();
        goodNewsPage.setSustainabilityBtn();
        sustainabilityPage.setSuperHeroQuizBtn();
        String expectedtitle = "QUIZ: Which Sustainability Superhero Are You?";
        Assert.assertEquals(expectedtitle,sustainabilityPage.superHeroQuizTitle());
    }

    @Test
    public void validateSustainableAtHomeHeader(){
        HomePage homePage = new HomePage(getDriver());
        GoodNewsPage goodNewsPage = new GoodNewsPage(getDriver());
        SustainabilityPage sustainabilityPage = new SustainabilityPage(getDriver());
        homePage.setGoodNewsBtn();
        goodNewsPage.setSustainabilityBtn();
        sustainabilityPage.setSustainableAtHomeBtn();
        String expectedtitle = "10 Easy Ways You Can Be Sustainable at Home and Make a Big Impact";
        Assert.assertEquals(expectedtitle,sustainabilityPage.sustainableAtHomeTitle());
    }

    @Test
    public void validateVirginPlasticHeader(){
        HomePage homePage = new HomePage(getDriver());
        GoodNewsPage goodNewsPage = new GoodNewsPage(getDriver());
        SustainabilityPage sustainabilityPage = new SustainabilityPage(getDriver());
        homePage.setGoodNewsBtn();
        goodNewsPage.setSustainabilityBtn();
        sustainabilityPage.setVirginPlasticBtn();
        String expectedtitle = "Reducing Virgin Plastic: P&G’s Commitment to Sustainability";
        Assert.assertEquals(expectedtitle,sustainabilityPage.virginPlasticTitle());
    }








}
