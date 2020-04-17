package pageObjects;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class AccordionPage {

	public AccordionPage(AppiumDriver<?> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	// Elementos
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Accordion']")
	private MobileElement menuAccordion;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Opção 1']")
	private MobileElement opcaoUm;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Esta é a descrição da opção 1']")
	private MobileElement mensagemOpcaoUm;

	// Metodos
	public void acessarMenuAccordion() {
		menuAccordion.click();
	}

	public void clicarNaOpcaoUm() {
		opcaoUm.click();
	}

	// Validações
	public void validarMensagemOpcaoUm() {
		mensagemOpcaoUm.isDisplayed();
	}

}
