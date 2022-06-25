package pages.png;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CauseDonationsPage extends CommonAPI {
    //private final Logger LOG = LoggerFactory.getLogger(CauseDonationsPage.class);
    private final Logger LOG = LoggerFactory.getLogger(CauseDonationsPage.class);

    @FindBy(xpath = "//*[@id=\"content\"]/main/div/div[3]/div/div/div[1]/div[2]/div[1]/a/div[2]/div[2]")
    private WebElement babyBookDonationBtn;
    @FindBy(xpath = "//*[@id=\"content\"]/main/div/div[2]/div[2]/div[1]/div/div[2]")
    private WebElement babyBookDonationTitle;

    @FindBy(xpath = "//*[@id=\"content\"]/main/div/div[3]/div/div/div[1]/div[2]/div[2]/a/div[2]/div[2]")
    private WebElement cleanWaterDonationBtn;
    @FindBy(xpath = "//*[@id=\"content\"]/main/div/div[2]/div[2]/div[1]/div/div[2]")
    private WebElement cleanWaterDonationTitle;

    @FindBy(xpath = "//*[@id=\"content\"]/main/div/div[3]/div/div/div[1]/div[2]/div[3]/a/div[2]/div[2]")
    private WebElement periodProtectionDonationBtn;
    @FindBy(xpath = "//*[@id=\"content\"]/main/div/div[2]/div[2]/div[1]/div/div[2]")
    private WebElement periodProtectionDonationTitle;

    @FindBy(xpath = "//*[@id=\"content\"]/main/div/div[3]/div/div/div[1]/div[2]/div[4]/a/div[2]/div[2]")
    private WebElement generalMealsDonationBtn;
    @FindBy(xpath = "//*[@id=\"content\"]/main/div/div[2]/div[2]/div[1]/div/div[2]")
    private WebElement generalMealsDonationTitle;

    @FindBy(xpath = "//*[@id=\"content\"]/main/div/div[3]/div/div/div[1]/div[2]/div[5]/a/div[2]/div[2]")
    private WebElement dishSoapDonationBtn;
    @FindBy(xpath = "//*[@id=\"content\"]/main/div/div[2]/div[2]/div[1]/div/div[2]")
    private WebElement dishSoapDonationTitle;

    @FindBy(xpath = "//*[@id=\"content\"]/main/div/div[3]/div/div/div[1]/div[2]/div[6]/a/div[2]/div[2]")
    private WebElement seaLionDonationBtn;
    @FindBy(xpath = "//*[@id=\"content\"]/main/div/div[2]/div[2]/div[1]/div/div[2]")
    private WebElement seaLionDonationTitle;

    @FindBy(xpath = "//*[@id=\"content\"]/main/div/div[3]/div/div/div[1]/div[2]/div[7]/a/div[2]/div[2]")
    private WebElement wifiDonationBtn;
    @FindBy(xpath = "//*[@id=\"content\"]/main/div/div[2]/div[2]/div[1]/div/div[2]")
    private WebElement wifiDonationTitle;

    @FindBy(xpath = "//*[@id=\"content\"]/main/div/div[3]/div/div/div[1]/div[2]/div[8]/a/div[2]/div[2]")
    private WebElement supportAccessDonationBtn;
    @FindBy(xpath = "//*[@id=\"content\"]/main/div/div[2]/div[2]/div[1]/div/div[2]")
    private WebElement supportAccessDonationTitle;

    @FindBy(xpath = "//*[@id=\"content\"]/main/div/div[3]/div/div/div[1]/div[2]/div[9]/a/div[2]/div[2]")
    private WebElement arborDayDonationBtn;
    @FindBy(xpath = "//*[@id=\"content\"]/main/div/div[2]/div[2]/div[1]/div/div[2]")
    private WebElement arborDayDonationTitle;

    @FindBy(xpath = "//*[@id=\"content\"]/main/div/div[3]/div/div/div[1]/div[2]/div[10]/a/div[2]/div[2]")
    private WebElement lgbtqDonationBtn;
    @FindBy(xpath = "//*[@id=\"content\"]/main/div/div[2]/div[2]/div[1]/div/div[2]")
    private WebElement lgbtqDonationTitle;


    public CauseDonationsPage(WebDriver driver) {PageFactory.initElements(driver,this);}

    public void setBabyBookDonationBtn(){
        click(babyBookDonationBtn);
        LOG.info("click on button was successful");
    }
    public String babyBookDonationTitle(){
        return getElementText(babyBookDonationTitle);
    }

    public void setCleanWaterDonationBtn(){
        click(cleanWaterDonationBtn);
        LOG.info("click on button was successful");
    }
    public String cleanWaterDonationTitle(){
        return getElementText(cleanWaterDonationTitle);
    }

    public void setPeriodProtectionDonationBtn(){
        click(periodProtectionDonationBtn);
        LOG.info("click on button was successful");
    }
    public String periodProtectionDonationTitle(){
        return getElementText(periodProtectionDonationTitle);
    }

    public void setGeneralMealsDonationBtn(){
        click(generalMealsDonationBtn);
        LOG.info("click on button was successful");
    }
    public String generalMealsDonationTitle(){
        return getElementText(generalMealsDonationTitle);
    }

    public void setDishSoapDonationBtn(){
        click(dishSoapDonationBtn);
        LOG.info("click on button was successful");
    }
    public String dishSoapDonationTitle(){
        return getElementText(dishSoapDonationTitle);
    }

    public void setSeaLionDonationBtn(){
        click(seaLionDonationBtn);
        LOG.info("click on button was successful");
    }
    public String seaLionDonationTitle(){
        return getElementText(seaLionDonationTitle);
    }

    public void setWifiDonationBtn(){
        click(wifiDonationBtn);
        LOG.info("click on button was successful");
    }
    public String wifiDonationTitle(){
        return getElementText(wifiDonationTitle);
    }

    public void setSupportAccessDonationBtn(){
        click(supportAccessDonationBtn);
        LOG.info("click on button was successful");
    }
    public String supportAccessDonationTitle(){
        return getElementText(supportAccessDonationTitle);
    }

    public void setArborDayDonationBtn(){
        click(arborDayDonationBtn);
        LOG.info("click on button was successful");
    }
    public String arborDayDonationTitle(){
        return getElementText(arborDayDonationTitle);
    }

    public void setLgbtqDonationBtn(){
        click(lgbtqDonationBtn);
        LOG.info("click on button was successful");
    }
    public String lgbtqDonationTitle(){
        return getElementText(lgbtqDonationTitle);
    }
}
