package pages.png;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HomePage extends CommonAPI {
    private final Logger LOG = LoggerFactory.getLogger(HomePage.class);


    @FindBy(xpath = "//*[@id=\"header-nav\"]/div[2]/div/div[1]/a[4]")
    private WebElement goodNewsBtn;
    @FindBy(xpath = "//*[@id=\"content\"]/main/div/div/div[2]/h1")
    private WebElement goodNewsTitle;

    @FindBy(xpath = "//*[@id=\"header-nav\"]/div[2]/div/div[1]/a[3]")
    private WebElement rewardsBtn;
    @FindBy(xpath = "//*[@id=\"content\"]/main/div/div[2]/p")
    private WebElement rewardsTitle;

    @FindBy(xpath = "//*[@id=\"header-nav\"]/div[2]/div/div[1]/a[5]")
    private WebElement impactBtn;
    @FindBy(xpath = "//*[@id=\"content\"]/main/div/div[2]/h1")
    private WebElement impactTitle;

    @FindBy(xpath = "//*[@id=\"header-nav\"]/div[2]/div/div[1]/a[2]")
    private WebElement earnPointsBtn;
    @FindBy(xpath = "//*[@id=\"content\"]/main/div/div[2]/div[1]/div[1]/h2")
    private WebElement earnPointsTitle;

    @FindBy(xpath = "//*[@id=\"header-nav\"]/div[2]/div/div[1]/a[6]")
    private WebElement couponsBtn;
    @FindBy(xpath = "//*[@id=\"content\"]/main/div/div[2]/div[2]/h1")
    private WebElement couponsTitle;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/div[1]/div/div/div/div/button")
    private WebElement logInBtn;
    @FindBy(xpath = "//*[@id=\"header-nav\"]/div[3]/div[2]/div/div[3]/div/form/div[1]/div")
    private WebElement logInTitle;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/div[1]/div/div/div/div/a")
    private WebElement signUpBtn;
    @FindBy(xpath = "//*[@id=\"content\"]/main/div/div/div/div/div/div[1]/div/div/div/div[2]/h2")
    private WebElement signUpTitle;

    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }
    public void setGoodNewsBtn(){
        click(goodNewsBtn);
        LOG.info("click on button was successful");
    }
    public String goodNewsTitle(){
        return getElementText(goodNewsTitle);
    }

    public void setRewardsBtn(){
        click(rewardsBtn);
        LOG.info("click on button was successful");
    }
    public String rewardsTitle(){
        return getElementText(rewardsTitle);
    }

    public void setImpactBtn(){
        click(impactBtn);
        LOG.info("click on button was successful");
    }
    public String impactTitle(){
        return getElementText(impactTitle);
    }

    public void setEarnPointsBtn(){
        click(earnPointsBtn);
        LOG.info("click on button was successful");
    }
    public String earnPointsTitle(){
        return getElementText(earnPointsTitle);
    }

    public void setCouponsBtn(){
        click(couponsBtn);
        LOG.info("click on button was successful");
    }
    public String couponsTitle(){
        return getElementText(couponsTitle);
    }

    public void setLogInBtn(){
        click(logInBtn);
        LOG.info("click on button was successful");
    }
    public String logInTitle(){
        return getElementText(logInTitle);
    }

    public void setSignUpBtn(){
        click(signUpBtn);
        LOG.info("click on button was successful");
    }
    public String signUpTitle(){
        return getElementText(signUpTitle);
    }


}
