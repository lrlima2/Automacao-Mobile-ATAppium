package pageObjects;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class CliquesPage {

	public CliquesPage(AppiumDriver<?> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	// Elementos
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Cliques']")
	private MobileElement menuCliques;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Clique duplo']")
	private MobileElement botaoCliqueDuplo;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Duplo Clique']")
	private MobileElement mensagemCliqueDuplo;

	// Metodos
	public void acessarMenuCliques() {
		menuCliques.click();
	}

	public void clicarNoBotaoCliqueDuplo() {
		botaoCliqueDuplo.click();
		botaoCliqueDuplo.click();
	}

	// Validações
	public void validarMensagemDuploClique() {
		mensagemCliqueDuplo.isDisplayed();
	}

}
