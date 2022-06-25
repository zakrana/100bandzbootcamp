package pages.png;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RewardsPage extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(RewardsPage.class);

    @FindBy(xpath = "//*[@id=\"content\"]/main/div/div[4]/div[3]/div[1]/a[1]/div[2]")
    private WebElement causeDonationsBtn;
    @FindBy(xpath = "//*[@id=\"content\"]/main/div/div[3]/div/div/div[1]/div[1]/div[2]/h2")
    private WebElement causeDonationsTitle;

    @FindBy(xpath = "//*[@id=\"content\"]/main/div/div[4]/div[3]/div[1]/a[2]/div[2]/div/p")
    private WebElement sweepStakesBtn;
    @FindBy(xpath = "//*[@id=\"content\"]/main/div/div[3]/div/div/div[1]/div[1]/div[2]/h2")
    private WebElement sweepStakesTitle;

    @FindBy(xpath = "//*[@id=\"content\"]/main/div/div[4]/div[3]/div[1]/a[3]/div[2]/div/p")
    private WebElement digitalSubscriptionsBtn;
    @FindBy(xpath = "//*[@id=\"content\"]/main/div/div[3]/div/div/div[1]/div[1]/div[2]/h2")
    private WebElement digitalSubscriptionTitle;

    @FindBy(xpath = "//*[@id=\"content\"]/main/div/div[4]/div[3]/div[1]/a[4]/div[2]/div/p")
    private WebElement giftCardsBtn;
    @FindBy(xpath = "//*[@id=\"content\"]/main/div/div[3]/div/div/div[1]/div[1]/div[2]/h2")
    private WebElement giftCardsTitle;

    @FindBy(xpath = "//*[@id=\"content\"]/main/div/div[4]/div[3]/div[2]/a")
    private WebElement viewAllRewardsBtn;
    @FindBy(xpath = "//*[@id=\"content\"]/main/div/div[3]/div/div/div[1]/div[1]/div[2]/h2")
    private WebElement viewAllRewardsTitle;


    public RewardsPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    public void setCauseDonationsBtn(){
        click(causeDonationsBtn);
        LOG.info("click on button was successful");
    }
    public String causeDonationsTitle(){
        return getElementText(causeDonationsTitle);
    }

    public void setSweepStakesBtn(){
        click(sweepStakesBtn);
        LOG.info("click on button was successful");
    }
    public String sweepTakesTitle(){
        return getElementText(sweepStakesTitle);
    }

    public void setDigitalSubscriptionsBtn(){
        click(digitalSubscriptionsBtn);
        LOG.info("click on button was successful");
    }
    public String digitalSubscriptionsTitle(){
        return getElementText(digitalSubscriptionTitle);
    }

    public void setGiftCardsBtn(){
        click(giftCardsBtn);
        LOG.info("click on button was successful");
    }
    public String giftCardsTitle(){
        return getElementText(giftCardsTitle);
    }

    public void setViewAllRewardsBtn(){
        click(viewAllRewardsBtn);
        LOG.info("click on button was successful");
    }
    public String viewAllRewardsTitle(){
        return getElementText(viewAllRewardsTitle);
    }

}
