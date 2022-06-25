package pages.png;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EqualityAndInclusionPage extends CommonAPI {
    private final Logger LOG = LoggerFactory.getLogger(EqualityAndInclusionPage.class);

    @FindBy(xpath = "//*[@id=\"content\"]/main/div/div/div[4]/div/div[8]/div/div/button/div[2]/div/div[1]")
    private WebElement blackHistoryQuizBtn;
    @FindBy(xpath = "//*[@id=\"content\"]/main/div/div/div[2]/div[1]/div/div[2]/h2")
    private WebElement blackHistoryQuizTitle;

    @FindBy(xpath = "//*[@id=\"content\"]/main/div/div/div[4]/div/div[9]/div/div/button/div[2]/div/div/p")
    private WebElement choreGapBtn;
    @FindBy(xpath = "//*[@id=\"content\"]/main/div/div/div[2]/div[1]/div/div[2]/h2")
    private WebElement choreGapTitle;

    @FindBy(xpath = "//*[@id=\"content\"]/main/div/div/div[4]/div/div[11]/div/div/button/div[2]/div/div/p")
    private WebElement colorfulPrideQuizBtn;
    @FindBy(xpath = "//*[@id=\"content\"]/main/div/div/div[2]/div[1]/div/div[2]/h2")
    private WebElement colorfulPrideQuizTitle;

    @FindBy(xpath = "//*[@id=\"content\"]/main/div/div/div[4]/div/div[1]/div/div/button/div[2]/div/div/p")
    private WebElement genderEqualityQuizBtn;
    @FindBy(xpath = "//*[@id=\"content\"]/main/div/div/div[2]/div[1]/div/div[2]/h2")
    private WebElement genderEqualityQuizTitle;

    @FindBy(xpath = "//*[@id=\"content\"]/main/div/div/div[4]/div/div[4]/div/div/button/div[2]/div/div/p")
    private WebElement prideKnowledgeQuizBtn;
    @FindBy(xpath = "//*[@id=\"content\"]/main/div/div/div[2]/div[1]/div/div[2]/h2")
    private WebElement prideKnowledgeQuizTitle;

    @FindBy(xpath = "//*[@id=\"content\"]/main/div/div/div[4]/div/div[6]/div/div/button/div[2]/div/div/p")
    private WebElement sevenWaysBtn;
    @FindBy(xpath = "//*[@id=\"content\"]/main/div/div/div[2]/div[1]/div/div[2]/h2")
    private WebElement sevenWaysTitle;

    public EqualityAndInclusionPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    public void setBlackHistoryQuizBtn() {
        click(blackHistoryQuizBtn);
        LOG.info("click on button was successful");
    }
    public String blackHistoryQuizTitle(){return getElementText(blackHistoryQuizTitle);}

    public void setChoreGapBtn() {
        click(choreGapBtn);
        LOG.info("click on button was successful");
    }
    public String choreGapTitle(){return getElementText(choreGapTitle);}

    public void setColorfulPrideQuizBtn() {
        click(colorfulPrideQuizBtn);
        LOG.info("click on button was successful");
    }
    public String colorfulPrideQuizTitle(){return getElementText(colorfulPrideQuizTitle);}

    public void setGenderEqualityQuizBtn() {
        click(genderEqualityQuizBtn);
        LOG.info("click on button was successful");
    }
    public String genderEqualityQuizTitle(){return getElementText(genderEqualityQuizTitle);}

    public void setPrideKnowledgeQuizBtn() {
        click(prideKnowledgeQuizBtn);
        LOG.info("click on button was successful");
    }
    public String prideKnowledgeQuizTitle(){return getElementText(prideKnowledgeQuizTitle);}

    public void setSevenWaysBtn() {
        click(sevenWaysBtn);
        LOG.info("click on button was successful");
    }
    public String sevenWaysTitle(){return getElementText(sevenWaysTitle);}







}
