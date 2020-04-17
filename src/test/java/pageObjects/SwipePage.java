package pageObjects;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class SwipePage {

	public SwipePage(AppiumDriver<?> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	// Elementos
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Swipe']")
	private MobileElement menuSwipe;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='›']")
	private MobileElement tela1;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='›']")
	private MobileElement tela2;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Chegar até o fim!']")
	private MobileElement mensagemSucesso;

	// Metodos
	public void acessarMenuSwipe() {
		menuSwipe.click();
	}

	public void clicarParaIrPraTela2() {
		tela1.click();
	}

	public void clicarParaIrPraTela3() {
		tela2.click();
	}

	// Validações
	public void validarMensagemDeSucesso() {
		mensagemSucesso.isDisplayed();
	}

}
