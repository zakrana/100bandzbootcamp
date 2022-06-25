package pages.png;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ImpactPage extends CommonAPI {
    private final Logger LOG = LoggerFactory.getLogger(ImpactPage.class);

    @FindBy(xpath = "//*[@id=\"content\"]/main/div/div[2]/div[1]/div/div/div/div/div[3]/div/div[4]/div/div/a")
    private WebElement seeOurImpactBtn;
    @FindBy(xpath = "//*[@id=\"content\"]/main/div/div[2]/div[2]/div[1]/div/div[2]/p[1]")
    private WebElement seeOurImpactTitle;

    @FindBy(xpath = "//*[@id=\"content\"]/main/div/div[2]/div[4]/div[2]/div/div/div[4]/div/div[4]/div/div/a")
    private WebElement smileGapCauseBtn;
    @FindBy(xpath = "//*[@id=\"content\"]/main/div/div[3]/div[3]/div/div/div/div/div[1]/p")
    private WebElement smileGapCauseTitle;

    @FindBy(xpath = "//*[@id=\"content\"]/main/div/div[2]/div[4]/div[3]/div/div/div[4]/div/div[4]/div/div/a")
    private WebElement tideCauseBtn;
    @FindBy(xpath = "//*[@id=\"content\"]/main/div/div[3]/div[3]/div/div/div/div/div[1]/p")
    private WebElement tideCauseTitle;

    @FindBy(xpath = "//*[@id=\"content\"]/main/div/div[2]/div[4]/div[4]/div/div/div[4]/div/div[4]/div/div/a")
    private WebElement safeGuardAmericaCauseBtn;
    @FindBy(xpath = "//*[@id=\"content\"]/main/div/div[3]/div[3]/div/div/div/div/div[3]/p")
    private WebElement safeGuardAmericaTitle;

    @FindBy(xpath = "//*[@id=\"content\"]/main/div/div[2]/div[4]/div[5]/div/div/div[4]/div/div[4]/div/div/a")
    private WebElement waterCauseBtn;
    @FindBy(xpath = "//*[@id=\"content\"]/main/div/div[3]/div[3]/div/div/div/div/div[3]/p")
    private WebElement waterCauseTitle;

    @FindBy(xpath = "//*[@id=\"content\"]/main/div/div[2]/div[4]/div[6]/div/div/div[4]/div/div[4]/div/div/a")
    private WebElement homeFrontCauseBtn;
    @FindBy(xpath = "//*[@id=\"content\"]/main/div/div[3]/div[3]/div/div/div/div/div[3]/p")
    private WebElement homeFrontCauseTitle;

    @FindBy(xpath = "//*[@id=\"content\"]/main/div/div[2]/div[4]/div[7]/div/div/div[4]/div/div[4]/div/div/a")
    private WebElement unitedWayCauseBtn;
    @FindBy(xpath = "//*[@id=\"content\"]/main/div/div[3]/div[3]/div/div/div/div/div[1]/p")
    private WebElement unitedWayCauseTitle;

    @FindBy(xpath = "//*[@id=\"content\"]/main/div/div[2]/div[4]/div[8]/div/div/div[4]/div/div[4]/div/div/a")
    private WebElement ministriesCauseBtn;
    @FindBy(xpath = "//*[@id=\"content\"]/main/div/div[3]/div[3]/div/div/div/div/div[1]/p")
    private WebElement ministriesCauseTitle;

    @FindBy(xpath = "//*[@id=\"content\"]/main/div/div[2]/div[4]/div[9]/div/div/div[4]/div/div[4]/div/div/a")
    private WebElement feedingAmericaCauseBtn;
    @FindBy(xpath = "//*[@id=\"content\"]/main/div/div[3]/div[3]/div/div/div/div/div[1]/p")
    private WebElement feedingAmericaCauseTitle;

    @FindBy(xpath = "//*[@id=\"content\"]/main/div/div[2]/div[4]/div[10]/div/div/div[4]/div/div[4]/div/div/a")
    private WebElement pampersCauseBtn;
    @FindBy(xpath = "//*[@id=\"content\"]/main/div/div[3]/div[3]/div/div/div/div/div[1]/p")
    private WebElement pampersCauseTitle;

    @FindBy(xpath = "//*[@id=\"content\"]/main/div/div[2]/div[6]/div[4]/div/div/div[4]/div/div[4]/div/div/a")
    private WebElement hispanicCauseBtn;
    @FindBy(xpath = "//*[@id=\"content\"]/main/div/div[3]/div[3]/div/div/div/div/div[1]/p")
    private WebElement hispanicCauseTitle;

    public ImpactPage(WebDriver driver) {
        PageFactory.initElements(driver,this);}

    public void setSeeOurImpactBtn(){
        click(seeOurImpactBtn);
        LOG.info("click on button was successful");
    }
    public String seeOurImpactTitle(){
        return getElementText(seeOurImpactTitle);
    }

    public void setSmileGapCauseBtn(){
        click(smileGapCauseBtn);
        LOG.info("click on button was successful");
    }
    public String smileGapCauseTitle(){
        return getElementText(smileGapCauseTitle);
    }

    public void setTideCauseBtn(){
        click(tideCauseBtn);
        LOG.info("click on button was successful");
    }
    public String tideCauseTitle(){
        return getElementText(tideCauseTitle);
    }

    public void setSafeGuardAmericaCauseBtn(){
        click(safeGuardAmericaCauseBtn);
        LOG.info("click on button was successful");
    }
    public String safeGuardAmericaCauseTitle(){
        return getElementText(safeGuardAmericaTitle);
    }

    public void setWaterCauseBtn(){
        click(waterCauseBtn);
        LOG.info("click on button was successful");
    }
    public String waterCauseTitle(){
        return getElementText(waterCauseTitle);
    }

    public void setHomeFrontCauseBtn(){
        click(homeFrontCauseBtn);
        LOG.info("click on button was successful");
    }
    public String homeFrontCauseTitle(){
        return getElementText(homeFrontCauseTitle);
    }

    public void setUnitedWayCauseBtn(){
        click(unitedWayCauseBtn);
        LOG.info("click on button was successful");
    }
    public String unitedWayCauseTitle(){
        return getElementText(unitedWayCauseTitle);
    }

    public void setMinistriesCauseBtn(){
        click(ministriesCauseBtn);
        LOG.info("click on button was successful");
    }
    public String ministriesCauseTitle(){
        return getElementText(ministriesCauseTitle);
    }

    public void setFeedingAmericaCauseBtn(){
        click(feedingAmericaCauseBtn);
        LOG.info("click on button was successful");
    }
    public String feedingAmericaCauseTitle(){
        return getElementText(feedingAmericaCauseTitle);
    }

    public void setPampersCauseBtn(){
        click(pampersCauseBtn);
        LOG.info("click on button was successful");
    }
    public String pampersCauseTitle(){
        return getElementText(pampersCauseTitle);
    }

    public void setHispanicCauseBtn(){
        click(hispanicCauseBtn);
        LOG.info("click on button was successful");
    }
    public String hispanicCauseTitle(){
        return getElementText(hispanicCauseTitle);
    }

}
