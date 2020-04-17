package pageObjects;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class OpcaoBemEscondidaPage {

	public OpcaoBemEscondidaPage(AppiumDriver<?> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	// Elementos
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Opção bem escondida']")
	private MobileElement menuOpcaoBemEscondida;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Você achou essa opção']")
	private MobileElement mensagemSucesso;

	@AndroidFindBy(xpath = "//android.widget.Button[@text='OK']")
	private MobileElement botaoOk;

	// Metodos
	public void clicarMenuOpcaoBemEscondida() {
		menuOpcaoBemEscondida.click();
	}

	public void clicarNoBotaoOK() {
		botaoOk.click();
	}

	// Validacoes
	public void validarMensagemSucesso() {
		mensagemSucesso.isDisplayed();
	}

}
