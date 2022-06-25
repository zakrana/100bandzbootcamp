package pages.png;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SustainabilityPage extends CommonAPI {
    private final Logger LOG = LoggerFactory.getLogger(SustainabilityPage.class);

    @FindBy(xpath = "//*[@id=\"content\"]/main/div/div/div[4]/div/div[20]/div/div/button/div[2]/div/div[1]")
    private WebElement recyclingTipsBtn;
    @FindBy(xpath = "//*[@id=\"content\"]/main/div/div/div[2]/div[1]/div/div[2]/h2")
    private WebElement recyclingTipsTitle;

    @FindBy(xpath = "//*[@id=\"content\"]/main/div/div/div[4]/div/div[14]/div/div/button/div[2]/div/div/p")
    private WebElement driveClimateChangeBtn;
    @FindBy(xpath = "//*[@id=\"content\"]/main/div/div/div[2]/div[1]/div/div[2]/h2")
    private WebElement driveClimateChangeTitle;

    @FindBy(xpath = "//*[@id=\"content\"]/main/div/div/div[4]/div/div[12]/div/div/button/div[2]/div/div[1]/p")
    private WebElement bucketListBtn;
    @FindBy(xpath = "//*[@id=\"content\"]/main/div/div/div[2]/div[1]/div/div[2]/h2")
    private WebElement bucketListTitle;

    @FindBy(xpath = "//*[@id=\"content\"]/main/div/div/div[4]/div/div[22]/div/div/button/div[2]/div/div[1]/p")
    private WebElement bucketVideoBtn;
    @FindBy(xpath = "//*[@id=\"content\"]/main/div/div/div[2]/div[1]/div/div[2]/h2")
    private WebElement bucketVideoTitle;

    @FindBy(xpath = "//*[@id=\"content\"]/main/div/div/div[4]/div/div[23]/div/div/button/div[2]/div/div[1]/p")
    private WebElement sixFamilyProjectsBtn;
    @FindBy(xpath = "//*[@id=\"content\"]/main/div/div/div[2]/div[1]/div/div[2]/h2")
    private WebElement sixFamilyProjectsTitle;

    @FindBy(xpath = "//*[@id=\"content\"]/main/div/div/div[4]/div/div[29]/div/div/button/div[2]/div/div[1]/p")
    private WebElement findACareerBtn;
    @FindBy(xpath = "//*[@id=\"content\"]/main/div/div/div[2]/div[1]/div/div[2]/h2")
    private WebElement findACareerTitle;

    @FindBy(xpath = "//*[@id=\"content\"]/main/div/div/div[4]/div/div[21]/div/div/button/div[2]/div/div[1]/p")
    private WebElement foodWasteBtn;
    @FindBy(xpath = "//*[@id=\"content\"]/main/div/div/div[2]/div[1]/div/div[2]/h2")
    private WebElement foodWasteTitle;

    @FindBy(xpath = "//*[@id=\"content\"]/main/div/div/div[4]/div/div[4]/div/div/button/div[2]/div/div/p")
    private WebElement greenHouseGasQuizBtn;
    @FindBy(xpath = "//*[@id=\"content\"]/main/div/div/div[2]/div[1]/div/div[2]/h2")
    private WebElement greenHouseGasTitle;

    @FindBy(xpath = "//*[@id=\"content\"]/main/div/div/div[4]/div/div[28]/div/div/button/div[2]/div/div[1]/p")
    private WebElement healthierOceanBtn;
    @FindBy(xpath = "//*[@id=\"content\"]/main/div/div/div[2]/div[1]/div/div[2]/h2")
    private WebElement healthierOceanTitle;

    @FindBy(xpath = "//*[@id=\"content\"]/main/div/div/div[4]/div/div[9]/div/div/button/div[2]/div/div/p")
    private WebElement ibrCelebratesBtn;
    @FindBy(xpath = "//*[@id=\"content\"]/main/div/div/div[2]/div[1]/div/div[2]/h2")
    private WebElement ibrCelebratesTitle;

    @FindBy(xpath = "//*[@id=\"content\"]/main/div/div/div[4]/div/div[10]/div/div/button/div[2]/div/div[1]/p")
    private WebElement infusingCommunitiesBtn;
    @FindBy(xpath = "//*[@id=\"content\"]/main/div/div/div[2]/div[1]/div/div[2]/h2")
    private WebElement infusingCommunitiesTitle;

    @FindBy(xpath = "//*[@id=\"content\"]/main/div/div/div[4]/div/div[25]/div/div/button/div[2]/div/div[1]/p")
    private WebElement ingredientsYouCanTrustBtn;
    @FindBy(xpath = "//*[@id=\"content\"]/main/div/div/div[2]/div[1]/div/div[2]/h2")
    private WebElement ingredientsYouCanTrustTitle;

    @FindBy(xpath = "//*[@id=\"content\"]/main/div/div/div[4]/div/div[19]/div/div/button/div[2]/div/div[1]/p")
    private WebElement laundryDayBtn;
    @FindBy(xpath = "//*[@id=\"content\"]/main/div/div/div[2]/div[1]/div/div[2]/h2")
    private WebElement laundryDayTitle;

    @FindBy(xpath = "//*[@id=\"content\"]/main/div/div/div[4]/div/div[3]/div/div/button/div[2]/div/div[1]/p")
    private WebElement joinUsLeadWithLoveBtn;
    @FindBy(xpath = "//*[@id=\"content\"]/main/div/div/div[2]/div[1]/div/div[2]/h2")
    private WebElement joinUsLeadWithLoveTitle;

    @FindBy(xpath = "//*[@id=\"content\"]/main/div/div/div[4]/div/div[18]/div/div/button/div[2]/div/div/p")
    private WebElement legacyOfGoodBtn;
    @FindBy(xpath = "//*[@id=\"content\"]/main/div/div/div[2]/div[1]/div/div[2]/h2")
    private WebElement legacyOfGoodTitle;

    @FindBy(xpath = "//*[@id=\"content\"]/main/div/div/div[4]/div/div[5]/div/div/button/div[2]/div/div/p")
    private WebElement lessPlasticBtn;
    @FindBy(xpath = "//*[@id=\"content\"]/main/div/div/div[2]/div[1]/div/div[2]/h2")
    private WebElement lessPlasticTitle;

    @FindBy(xpath = "//*[@id=\"content\"]/main/div/div/div[4]/div/div[13]/div/div/button/div[2]/div/div/p")
    private WebElement measureOfGreatnessBtn;
    @FindBy(xpath = "//*[@id=\"content\"]/main/div/div/div[2]/div[1]/div/div[2]/h2")
    private WebElement measureOfGreatnessTitle;

    @FindBy(xpath = "//*[@id=\"content\"]/main/div/div/div[4]/div/div[15]/div/div/button/div[2]/div/div/p")
    private WebElement paperPackagingBtn;
    @FindBy(xpath = "//*[@id=\"content\"]/main/div/div/div[2]/div[1]/div/div[2]/h2")
    private WebElement paperPackagingTitle;

    @FindBy(xpath = "//*[@id=\"content\"]/main/div/div/div[4]/div/div[17]/div/div/button/div[2]/div/div[1]/p")
    private WebElement partOfRecyclingBtn;
    @FindBy(xpath = "//*[@id=\"content\"]/main/div/div/div[2]/div[1]/div/div[2]/h2")
    private WebElement partOfRecyclingTitle;

    @FindBy(xpath = "//*[@id=\"content\"]/main/div/div/div[4]/div/div[27]/div/div/button/div[2]/div/div[1]/p")
    private WebElement plasticStrawBtn;
    @FindBy(xpath = "//*[@id=\"content\"]/main/div/div/div[2]/div[1]/div/div[2]/h2")
    private WebElement plasticStrawTitle;

    @FindBy(xpath = "//*[@id=\"content\"]/main/div/div/div[4]/div/div[8]/div/div/button/div[2]/div/div/p")
    private WebElement protectForestsBtn;
    @FindBy(xpath = "//*[@id=\"content\"]/main/div/div/div[2]/div[1]/div/div[2]/h2")
    private WebElement protectForestsTitle;

    @FindBy(xpath = "//*[@id=\"content\"]/main/div/div/div[4]/div/div[2]/div/div/button/div[2]/div/div[1]/p")
    private WebElement randomActsOfKindnessBtn;
    @FindBy(xpath = "//*[@id=\"content\"]/main/div/div/div[2]/div[1]/div/div[2]/h2")
    private WebElement randomActsOfKindnessTitle;

    @FindBy(xpath = "//*[@id=\"content\"]/main/div/div/div[4]/div/div[24]/div/div/button/div[2]/div/div[1]/p")
    private WebElement beyondTheBasicsBtn;
    @FindBy(xpath = "//*[@id=\"content\"]/main/div/div/div[2]/div/div/div[2]/h2")
    private WebElement beyondTheBasicsTitle;

    @FindBy(xpath = "//*[@id=\"content\"]/main/div/div/div[4]/div/div[6]/div/div/button/div[2]/div/div/p")
    private WebElement smallActionsAtHomeBtn;
    @FindBy(xpath = "//*[@id=\"content\"]/main/div/div/div[2]/div[1]/div/div[2]/h2")
    private WebElement smallActionsAtHomeTitle;

    @FindBy(xpath = "//*[@id=\"content\"]/main/div/div/div[4]/div/div[16]/div/div/button/div[2]/div/div/p")
    private WebElement superHeroQuizBtn;
    @FindBy(xpath = "//*[@id=\"content\"]/main/div/div/div[2]/div[1]/div/div[2]/h2")
    private WebElement superHeroQuizTitle;

    @FindBy(xpath = "//*[@id=\"content\"]/main/div/div/div[4]/div/div[1]/div/div/button/div[2]/div/div/p")
    private WebElement sustainableAtHomeBtn;
    @FindBy(xpath = "//*[@id=\"content\"]/main/div/div/div[2]/div[1]/div/div[2]/h2")
    private WebElement sustainableAtHomeTitle;

    @FindBy(xpath = "//*[@id=\"content\"]/main/div/div/div[4]/div/div[26]/div/div/button/div[2]/div/div[1]/p")
    private WebElement virginPlasticBtn;
    @FindBy(xpath = "//*[@id=\"content\"]/main/div/div/div[2]/div[1]/div/div[2]/h2")
    private WebElement virginPlasticTitle;

    public SustainabilityPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void setRecyclingTipsBtn() {
        click(recyclingTipsBtn);
        LOG.info("click on button was successful");
    }
    public String recyclingTipsTitle(){return getElementText(recyclingTipsTitle);}

    public void setDriveClimateChangeBtn() {
        click(driveClimateChangeBtn);
        LOG.info("click on button was successful");
    }
    public String driveClimateChangeTitle(){return getElementText(driveClimateChangeTitle);}

    public void setBucketListBtn() {
        click(bucketListBtn);
        LOG.info("click on button was successful");
    }
    public String bucketListTitle(){return getElementText(bucketListTitle);}

    public void setBucketVideoBtn() {
        click(bucketVideoBtn);
        LOG.info("click on button was successful");
    }
    public String bucketVideoTitle(){return getElementText(bucketVideoTitle);}

    public void setSixFamilyProjectsBtn() {
        click(sixFamilyProjectsBtn);
        LOG.info("click on button was successful");
    }
    public String sixFamilyProjectsTitle(){return getElementText(sixFamilyProjectsTitle);}

    public void setFindACareerBtn() {
        click(findACareerBtn);
        LOG.info("click on button was successful");
    }
    public String findACareerTitle(){return getElementText(findACareerTitle);}

    public void setFoodWasteBtn() {
        click(foodWasteBtn);
        LOG.info("click on button was successful");
    }
    public String foodWasteTitle(){return getElementText(foodWasteTitle);}

    public void setGreenHouseGasQuizBtn() {
        click(greenHouseGasQuizBtn);
        LOG.info("click on button was successful");
    }
    public String greenHouseGasQuizTitle(){return getElementText(greenHouseGasTitle);}

    public void setHealthierOceanBtn() {
        click(healthierOceanBtn);
        LOG.info("click on button was successful");
    }
    public String healthierOceanTitle(){return getElementText(healthierOceanTitle);}

    public void setIbrCelebratesBtn() {
        click(ibrCelebratesBtn);
        LOG.info("click on button was successful");
    }
    public String ibrCelebratesTitle(){return getElementText(ibrCelebratesTitle);}

    public void setInfusingCommunitiesBtn() {
        click(infusingCommunitiesBtn);
        LOG.info("click on button was successful");
    }
    public String infusingCommunitiesTitle(){return getElementText(infusingCommunitiesTitle);}

    public void setIngredientsYouCanTrustBtn() {
        click(ingredientsYouCanTrustBtn);
        LOG.info("click on button was successful");
    }
    public String ingredientsYouCanTrustTitle(){return getElementText(ingredientsYouCanTrustTitle);}

    public void setLaundryDayBtn() {
        click(laundryDayBtn);
        LOG.info("click on button was successful");
    }
    public String laundryDayTitle(){return getElementText(laundryDayTitle);}

    public void setJoinUsLeadWithLoveBtn() {
        click(joinUsLeadWithLoveBtn);
        LOG.info("click on button was successful");
    }
    public String joinUsLeadWithLoveTitle(){return getElementText(joinUsLeadWithLoveTitle);}

    public void setLegacyOfGoodBtn() {
        click(legacyOfGoodBtn);
        LOG.info("click on button was successful");
    }
    public String legacyOfGoodTitle(){return getElementText(legacyOfGoodTitle);}

    public void setLessPlasticBtn() {
        click(lessPlasticBtn);
        LOG.info("click on button was successful");
    }
    public String lessPlasticTitle(){return getElementText(lessPlasticTitle);}

    public void setMeasureOfGreatnessBtn() {
        click(measureOfGreatnessBtn);
        LOG.info("click on button was successful");
    }
    public String measureOfGreatnessTitle(){return getElementText(measureOfGreatnessTitle);}

    public void setPaperPackagingBtn() {
        click(paperPackagingBtn);
        LOG.info("click on button was successful");
    }
    public String paperPackagingTitle(){return getElementText(paperPackagingTitle);}

    public void setPartOfRecyclingBtn() {
        click(partOfRecyclingBtn);
        LOG.info("click on button was successful");
    }
    public String partOfRecyclingTitle(){return getElementText(partOfRecyclingTitle);}

    public void setPlasticStrawBtn() {
        click(plasticStrawBtn);
        LOG.info("click on button was successful");
    }
    public String plasticStrawTitle(){return getElementText(plasticStrawTitle);}

    public void setProtectForestsBtn() {
        click(protectForestsBtn);
        LOG.info("click on button was successful");
    }
    public String protectForestsTitle(){return getElementText(protectForestsTitle);}

    public void setRandomActsOfKindnessBtn() {
        click(randomActsOfKindnessBtn);
        LOG.info("click on button was successful");
    }
    public String randomActsOfKindnessTitle(){return getElementText(randomActsOfKindnessTitle);}

    public void setBeyondTheBasicsBtn() {
        click(beyondTheBasicsBtn);
        LOG.info("click on button was successful");
    }
    public String beyondTheBasicsTitle(){return getElementText(beyondTheBasicsTitle);}

    public void setSmallActionsAtHomeBtn() {
        click(smallActionsAtHomeBtn);
        LOG.info("click on button was successful");
    }
    public String smallActionsAtHomeTitle(){return getElementText(smallActionsAtHomeTitle);}

    public void setSuperHeroQuizBtn() {
        click(superHeroQuizBtn);
        LOG.info("click on button was successful");
    }
    public String superHeroQuizTitle(){return getElementText(superHeroQuizTitle);}

    public void setSustainableAtHomeBtn() {
        click(sustainableAtHomeBtn);
        LOG.info("click on button was successful");
    }
    public String sustainableAtHomeTitle(){return getElementText(sustainableAtHomeTitle);}

    public void setVirginPlasticBtn() {
        click(virginPlasticBtn);
        LOG.info("click on button was successful");
    }
    public String virginPlasticTitle(){return getElementText(virginPlasticTitle);}



}
