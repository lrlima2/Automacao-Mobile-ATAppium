package pageObjects;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class AbasPage {

	public AbasPage(AppiumDriver<?> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	// Elementos
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Abas']")
	private MobileElement menuAbas;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='ABA 2']")
	private MobileElement abaDois;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Este é o conteúdo da Aba 2']")
	private MobileElement mensagemConteutdoAbaDois;

	// Metodos
	public void acessarMenuAbas() {
		menuAbas.click();
	}

	public void clicarSobreAbaDois() {
		abaDois.click();
	}

	// Validações
	public void validarMensagemConteudoAbaDois() {
		mensagemConteutdoAbaDois.isDisplayed();
	}

}
