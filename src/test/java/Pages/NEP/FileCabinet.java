package Pages.NEP;

import Pages.GenericPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class FileCabinet extends GenericPage {
    public static final By spinnerBy =By.xpath("//*/span/twa-spinner");

    @FindBy(how= How.ID,using="endpointprotection")
    public WebElement TrustwaveEndpointFolder_element;

    private static final String endPointExeXpath = "//span[contains(text(),'TrustwaveEndpoint.exe')]";
    public static final By endPointExeBy = By.xpath(endPointExeXpath);
    @FindBy(how= How.XPATH,using=endPointExeXpath)
    public WebElement TrustwaveEndpointExe_element;

    private static final String clientKeyXpath = "//span[contains(text(),'client_key.pem')]";
    public static final By clientKeyBy = By.xpath(clientKeyXpath);
    @FindBy(how= How.XPATH,using=clientKeyXpath)
    public WebElement client_key_element;

    private static final String clientPemXpath = "//span[contains(text(),'client.pem')]";
    public static final By clientPemBy = By.xpath(clientPemXpath);
    @FindBy(how= How.XPATH,using=clientPemXpath)
    public WebElement clientPem_element;

    private static final String threeDotsIconXpath = "//body//twa-datalist-column[5]";
    public static final By threeDotsIconBy = By.xpath(threeDotsIconXpath);
    @FindBy(how= How.XPATH,using=threeDotsIconXpath)
    public WebElement threeDotsIcon_element;

    public List<WebElement> GetFirstThreeDotsIcon() {
        return this.driver.findElements(threeDotsIconBy);
    }

    private static final String removeMenuItemXpath = "//span[contains(text(),'Remove')]";
    public static final By removeMenuItemBy = By.xpath(removeMenuItemXpath);
    @FindBy(how= How.XPATH,using=removeMenuItemXpath)
    public WebElement removeMenuItem_element;

    private static final String removeButtonConfirmXpath = "//div[@class='pane modal visible']//twa-button[1]";
    public static final By removeButtonConfirmBy = By.xpath(removeButtonConfirmXpath);
    @FindBy(how= How.XPATH,using=removeButtonConfirmXpath)
    public WebElement removeButtonConfirm_element;

    private static final String refreshButtonXpath = "//*/div/twa-file-cabinet-files/twa-page/div/div[2]/div[2]/twa-datalist/twa-action-bar/div/div[2]/twa-button/material-button";
    public static final By refreshButtonBy = By.xpath(refreshButtonXpath);
    @FindBy(how= How.XPATH,using=refreshButtonXpath)
    public WebElement refreshButton_element;


}
