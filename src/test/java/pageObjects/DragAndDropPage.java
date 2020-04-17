package pageObjects;

import static utils.Utils.driver;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;

public class DragAndDropPage {

	public DragAndDropPage(AppiumDriver<?> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	TouchAction arrastar = new TouchAction(driver);

	// Elementos
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Drag and drop']")
	private MobileElement menuDragAndDrop;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Esta']")
	private MobileElement caixaEsta;

	// Metodos
	/*
	 * public void arrastarATelaParaCima() {
	 * arrastar.longPress(PointOption.point(467,
	 * 1464)).moveTo(PointOption.point(467, 897)).release().perform(); }
	 */
	public void clicarNoMenuDragAndDrop() {
		menuDragAndDrop.click();
	}

	public void clicarNaCaixaEsta() {
		// caixaEsta.click();
	}

	public void arrastarCaixaEstaParaBaixo() {
		arrastar.longPress(ElementOption.element(caixaEsta)).moveTo(PointOption.point(475, 1500)).release().perform();

	}
	// Validacoes

}
