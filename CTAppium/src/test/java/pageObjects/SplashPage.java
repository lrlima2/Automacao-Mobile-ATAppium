package pageObjects;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class SplashPage {

	public SplashPage(AppiumDriver<?> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	/// Elementos
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Splash']")
	private MobileElement menuSplash;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Esta']")
	private MobileElement mensagemSplash;

	// Metodos
	public void acessarMenuSplash() {
		menuSplash.click();
	}

	// Validaçoes
	public void validarMensagemSplash() {
		mensagemSplash.isDisplayed();
	}

}
