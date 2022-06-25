package pages.png;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GoodNewsPage extends CommonAPI {
    private final Logger LOG = LoggerFactory.getLogger(GoodNewsPage.class);

    @FindBy(xpath = "//*[@id=\"content\"]/main/div/div/div[4]/div/div[2]/div/div/div/div/a")
    private WebElement leadWithLoveBtn;

    @FindBy(xpath = "//span[contains(text(),'#LeadWithLove')]")
    private WebElement leadWithLoveTitle;

    @FindBy(xpath = "//*[@id=\"content\"]/main/div/div/div[4]/div/div[8]/div/div/div/div/a[1]")
    private WebElement equalityAndInclusionBtn;

    @FindBy(xpath = "//*[@id=\"content\"]/main/div/div/div[3]/div/div/div/div[1]/div/span")
    private WebElement equalityAndInclusionTitle;

    @FindBy(xpath = "//*[@id=\"content\"]/main/div/div/div[4]/div/div[6]/div/div/div/div/a[1]")
    private WebElement sustainabilityBtn;

    @FindBy(xpath = "//*[@id=\"content\"]/main/div/div/div[3]/div/div/div/div[1]/div/span")
    private WebElement sustainabilityTitle;

    @FindBy(xpath = "//*[@id=\"content\"]/main/div/div/div[4]/div/div[9]/div/div/div/div/a[1]")
    private WebElement CSDWBtn;

    @FindBy(xpath = "//*[@id=\"content\"]/main/div/div/div[3]/div/div/div/div[1]/div/span")
    private WebElement CSDWTitle;

    @FindBy(xpath = "//*[@id=\"content\"]/main/div/div/div[4]/div/div[9]/div/div/div/div/a[2]")
    private WebElement communityImpactBtn;

    @FindBy(xpath = "//*[@id=\"content\"]/main/div/div/div[3]/div/div/div/div[1]/div/span")
    private WebElement communityImpactTitle;

    @FindBy(xpath = "//*[@id=\"content\"]/main/div/div/div[4]/div/div[1]/div/div/div/div/a[1]")
    private WebElement diversityAndInclusionBtn;

    @FindBy(xpath = "//*[@id=\"content\"]/main/div/div/div[3]/div/div/div/div[1]/div/span")
    private WebElement diversityAndInclusionTitle;

    @FindBy(xpath = "//*[@id=\"content\"]/main/div/div/div[4]/div/div[5]/div/div/div/div/a[3]")
    private WebElement PGGoodEveryDayBtn;

    @FindBy(xpath = "//*[@id=\"content\"]/main/div/div/div[3]/div/div/div/div[1]/div/span")
    private WebElement PGGoodEveryDayTitle;

    public GoodNewsPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void setLeadWithLoveBtn() {
        click(leadWithLoveBtn);
        LOG.info("click on button was successful");
    }

    public String leadWithLoveTitle(){return getElementText(leadWithLoveTitle);}

    public void setEqualityAndInclusionBtn() {
        click(equalityAndInclusionBtn);
        LOG.info("click on button was successful");
    }

    public String equalityAndInclusionTitle(){return getElementText(equalityAndInclusionTitle);}

    public void setSustainabilityBtn() {
        click(sustainabilityBtn);
        LOG.info("click on button was successful");
    }
    public String sustainabilityTitle(){return getElementText(sustainabilityTitle);}

    public void setCSDWBtn() {
        click(CSDWBtn);
        LOG.info("click on button was successful");
    }
    public String CSDWTitle(){return getElementText(CSDWTitle);}

    public void setCommunityImpactBtn() {
        click(communityImpactBtn);
        LOG.info("click on button was successful");
    }
    public String communityImpactTitle(){return getElementText(communityImpactTitle);}

    public void setDiversityAndInclusionBtn() {
        click(diversityAndInclusionBtn);
        LOG.info("click on button was successful");
    }

    public String diversityAndInclusionTitle(){return getElementText(diversityAndInclusionTitle);}

    public void setPGGoodEveryDayBtn() {
        click(PGGoodEveryDayBtn);
        LOG.info("click on button was successful");
    }

    public String PGGoodEveryDayTitle(){return getElementText(PGGoodEveryDayTitle);}
}


