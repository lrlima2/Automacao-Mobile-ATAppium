package pageObjects;

import static utils.Utils.*;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.offset.PointOption;

public class SwipeListPage {

	public SwipeListPage(AppiumDriver<?> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	TouchAction deslizar = new TouchAction(driver);

	// Elementos
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Swipe List']")
	private MobileElement menuSwipeList;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Opção 2 (+)']")
	private MobileElement opcao2Inicial;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Opção 2']")
	private MobileElement opcao2Final;

	// Metodos
	public void arrastarATelaParaCima() {
		deslizar.longPress(PointOption.point(467, 1464)).moveTo(PointOption.point(467, 897)).release().perform();
	}

	public void clicarNoMenuSwipeList() {
		menuSwipeList.click();
	}

	public void arrastarOpcao2ParaEsquerda() {
		opcao2Inicial.click();
		deslizar.longPress(PointOption.point(150, 300)).moveTo(PointOption.point(900, 300)).release().perform();
	}

	// Validações
	public void validarOpcao2() {
		opcao2Final.isDisplayed();
	}

}
