package pages.png;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LeadWithLovePage extends CommonAPI {
    private final Logger LOG = LoggerFactory.getLogger(LeadWithLovePage.class);

    @FindBy(xpath = "//*[@id=\"content\"]/main/div/div/div[4]/div/div[3]/div/div/button/div[2]/div/div")
    private WebElement alwaysThereVideoBtn;
    @FindBy(xpath = "//*[@id=\"content\"]/main/div/div/div[2]/div[1]/div/div[2]/h2")
    private WebElement alwaysThereVideoTitle;

    @FindBy(xpath = "//*[@id=\"content\"]/main/div/div/div[4]/div/div[11]/div/div/button/div[2]/div/div/p")
    private WebElement bennettSistersVideoBtn;

    @FindBy(xpath = "//*[@id=\"content\"]/main/div/div/div[2]/div[1]/div/div[2]/h2")
    private WebElement bennettSistersVideoTitle;

    @FindBy(xpath = "//*[@id=\"content\"]/main/div/div/div[4]/div/div[1]/div/div/button/div[1]")
    private WebElement careGivingTipsBtn;

    @FindBy(xpath = "//*[@id=\"content\"]/main/div/div/div[2]/div[1]/div/div[2]/h2")
    private WebElement careGivingTipsTitle;

    @FindBy(xpath = "//*[@id=\"content\"]/main/div/div/div[4]/div/div[9]/div/div/button/div[2]/div/div/p")
    private WebElement motherOfTheForestsVideoBtn;
    @FindBy(xpath = "//*[@id=\"content\"]/main/div/div/div[2]/div[1]/div/div[2]/h2")
    private WebElement motherOfTheForestsVideoTitle;

    @FindBy(xpath = "//*[@id=\"content\"]/main/div/div/div[4]/div/div[8]/div/div/button/div[2]/div/div/p")
    private WebElement pastorRudyVideoBtn;
    @FindBy(xpath = "//*[@id=\"content\"]/main/div/div/div[2]/div[1]/div/div[2]/h2")
    private WebElement pastorRudyVideoTitle;

    @FindBy(xpath = "//*[@id=\"content\"]/main/div/div/div[4]/div/div[12]/div/div/button/div[2]/div/div[1]/p")
    private WebElement tokyoPodiumVideoBtn;
    @FindBy(xpath = "//*[@id=\"content\"]/main/div/div/div[2]/div[1]/div/div[2]/h2")
    private WebElement tokyoPodiumVideoTitle;

    public LeadWithLovePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void setAlwaysThereVideoBtn() {
        click(alwaysThereVideoBtn);
        LOG.info("click on button was successful");
    }

    public String alwaysThereVideoTitle(){return getElementText(alwaysThereVideoTitle);
    }

    public void setBennettSistersVideoBtn() {
        click(bennettSistersVideoBtn);
        LOG.info("click on button was successful");
    }

    public String bennettSistersVideoTitle(){return getElementText(bennettSistersVideoTitle);
    }
    public void setCareGivingTipsBtn() {
        click(careGivingTipsBtn);
        LOG.info("click on button was successful");
    }
    public String careGivingTipsTitle(){return getElementText(careGivingTipsTitle);
    }
    public void setMotherOfTheForestsVideoBtn() {
        click(motherOfTheForestsVideoBtn);
        LOG.info("click on button was successful");
    }
    public String motherOfTheForestsVideoTitle(){return getElementText(motherOfTheForestsVideoTitle);
    }

    public void setPastorRudyVideoBtn() {
        click(pastorRudyVideoBtn);
        LOG.info("click on button was successful");
    }
    public String pastorRudyVideoTitle(){return getElementText(pastorRudyVideoTitle);
    }

    public void setTokyoPodiumVideoBtn() {
        click(tokyoPodiumVideoBtn);
        LOG.info("click on button was successful");
    }
    public String tokyoPodiumVideoTitle(){return getElementText(tokyoPodiumVideoTitle);
    }







}
