package pageObjects;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class AlertasPage {

	public AlertasPage(AppiumDriver<?> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	// Elementos
	/////////////// Cenario 1/////////////////////
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Alertas']")
	private MobileElement menuAlertas;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='ALERTA SIMPLES']")
	private MobileElement botaoAlertaSimples;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Pode clicar no OK ou fora da caixa para sair']")
	private MobileElement mensagemAlertaSimples;

	@AndroidFindBy(id = "android:id/button1")
	private MobileElement botaoOk;

	//////////////////// Cenario 2/////////////////////
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='ALERTA RESTRITIVO']")
	private MobileElement botaoAlertasRestritivo;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Não pode clicar fora, apenas no SAIR']")
	private MobileElement mensagemAlertaRestritivo;

	@AndroidFindBy(xpath = "//android.widget.Button[@text='SAIR']")
	private MobileElement botaoSair;

	//////////////////// Cenario 3//////////////////////
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='ALERTA CONFIRM']")
	private MobileElement botaoAlertaConfirm;

	@AndroidFindBy(xpath = "//android.widget.Button[@text='CONFIRMAR']")
	private MobileElement botaoConfirmar;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Confirmado']")
	private MobileElement mensagemAlertaConfirm;

	@AndroidFindBy(xpath = "//android.widget.Button[@text='SAIR']")
	private MobileElement botaoSairAlertaConfirm;

	// Metodos
	/////////////////// Cenario 1//////////////////
	public void acessarMenuAlertas() {
		menuAlertas.click();
	}

	public void acionarBotaoAlertaSimples() {
		botaoAlertaSimples.click();
	}

	public void acionarBotaoOk1() {
		botaoOk.click();
	}

	/////////////////// Cenario 2//////////////////////
	public void acessarBotaoAlertaRestritivo() {
		botaoAlertasRestritivo.click();
	}

	public void acionarBotaoSair() {
		botaoSair.click();
	}

	//////////////////// Cenario 3///////////////////
	public void clicarNoBotaoAlertaConfirm() {
		botaoAlertaConfirm.click();
	}

	public void clicarNoBotaoConfirmarAlertaConfirm() {
		botaoConfirmar.click();
	}

	public void clicarNoBotaoSairAlertaConfirm() {
		botaoSairAlertaConfirm.click();
	}

	// Validações
	public void validarMensagemAlertaSimples() {
		mensagemAlertaSimples.isDisplayed();
	}

	public void validarMensagemAlertaRestritivo() {
		mensagemAlertaRestritivo.isDisplayed();
	}

	public void validarMensageAlertaConfirm() {
		mensagemAlertaConfirm.isDisplayed();
	}

}