package apps.pngtest;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.png.HomePage;
import pages.png.RewardsPage;
//5
public class RewardsTest extends CommonAPI {

    @Test
    public void validateCauseDonationsPage(){
        HomePage homePage = new HomePage(getDriver());
        RewardsPage rewardsPage = new RewardsPage(getDriver());
        homePage.setRewardsBtn();
        rewardsPage.setCauseDonationsBtn();
        String expectedtitle = "CAUSE DONATIONS";
        Assert.assertEquals(expectedtitle,rewardsPage.causeDonationsTitle());
}

    @Test
    public void validateSweepStakesPage(){
        HomePage homePage = new HomePage(getDriver());
        RewardsPage rewardsPage = new RewardsPage(getDriver());
        homePage.setRewardsBtn();
        rewardsPage.setSweepStakesBtn();
        String expectedtitle = "SWEEPSTAKES ENTRIES";
        Assert.assertEquals(expectedtitle,rewardsPage.sweepTakesTitle());
    }

    @Test
    public void validateDigitalSubscriptionPage(){
        HomePage homePage = new HomePage(getDriver());
        RewardsPage rewardsPage = new RewardsPage(getDriver());
        homePage.setRewardsBtn();
        rewardsPage.setDigitalSubscriptionsBtn();
        String expectedtitle = "DIGITAL SUBSCRIPTIONS";
        Assert.assertEquals(expectedtitle,rewardsPage.digitalSubscriptionsTitle());
    }

    @Test
    public void validateGiftCardsPage(){
        HomePage homePage = new HomePage(getDriver());
        RewardsPage rewardsPage = new RewardsPage(getDriver());
        homePage.setRewardsBtn();
        rewardsPage.setGiftCardsBtn();
        String expectedtitle = "GIFT CARDS & LOCAL EXPERIENCES";
        Assert.assertEquals(expectedtitle,rewardsPage.giftCardsTitle());
    }

    @Test
    public void validateViewAllRewardsPage(){
        HomePage homePage = new HomePage(getDriver());
        RewardsPage rewardsPage = new RewardsPage(getDriver());
        homePage.setRewardsBtn();
        rewardsPage.setViewAllRewardsBtn();
        String expectedtitle = "ALL REWARDS";
        Assert.assertEquals(expectedtitle,rewardsPage.viewAllRewardsTitle());
    }


}
