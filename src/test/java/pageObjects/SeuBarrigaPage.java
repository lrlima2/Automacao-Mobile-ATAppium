package pageObjects;

import static utils.Utils.driver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class SeuBarrigaPage {

	public SeuBarrigaPage(AppiumDriver<?> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	// Elementos
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='SeuBarriga Híbrido']")
	private MobileElement menuSeuBarrigaHibrido;

	@AndroidFindBy(accessibility = "Novo usuário?")
	private MobileElement abaNovoUsuario;

	@AndroidFindBy(xpath = "//android.widget.EditText[@text='Nome']")
	private MobileElement campoNome;

	@AndroidFindBy(xpath = "//android.widget.EditText[@text='Email']")
	private MobileElement campoEmail;

	@AndroidFindBy(xpath = "//android.widget.EditText[@text='••••••••']")
	private MobileElement campoSenha;

	@AndroidFindBy(xpath = "//android.widget.Button[@content-desc='Cadastrar']")
	private MobileElement botaoCadastrar;

	@AndroidFindBy(accessibility = "Usuário inserido com sucesso")
	private MobileElement mensagemUsuarioCadastrado;

	@AndroidFindBy(accessibility = "Login")
	private MobileElement abaLogin;

	@AndroidFindBy(xpath = "//android.webkit.WebView[@content-desc=\"Seu Barriga - Log in\"]/android.view.View[2]/android.view.View/android.widget.EditText[1]")
	private MobileElement campoEmailLogin;

	@AndroidFindBy(xpath = "//android.widget.EditText[@index='3']")
	private MobileElement campoSenhaLogin;

	@AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Entrar\"]")
	private MobileElement botaoEntrar;

	@AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Bem vindo, Leonardo Rodrigues!\"]")
	private MobileElement mensagemUsuarioLogado;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='SeuBarriga Nativo']")
	private MobileElement menuSeuBarrigaNativo;

	@AndroidFindBy(xpath = "//android.widget.EditText[@text='Nome']")
	private MobileElement campoNomeNativo;

	@AndroidFindBy(xpath = "//android.widget.EditText[@text='Senha']")
	private MobileElement campoSenhaNativo;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='ENTRAR']")
	private MobileElement botaoEntrarNativo;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Problemas com o login']")
	private MobileElement mensagemErro;

	// Metodos
	public void acessarMenuSeuBarrigaHibrido() {
		menuSeuBarrigaHibrido.click();
	}

	public void acessarAbaNovoUsuario() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		abaNovoUsuario.click();
	}

	public void preencherCampoNome(String string) {
		campoNome.sendKeys(string);
	}

	public void preencherCampoEmail(String string) {
		campoEmail.sendKeys(string);
	}

	public void preencherCampoSenha(String string) {
		campoSenha.sendKeys(string);
	}

	public void acionarBotaoCadastrar() {
		botaoCadastrar.click();
	}

	public void acionarAAbaLogin() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		abaLogin.click();
	}

	public void preencherCampoEmailLogin(String string) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		campoEmailLogin.sendKeys(string);
	}

	public void preencherCampoSenhaLogin(String string) {
		campoSenhaLogin.sendKeys(string);
	}

	public void acionarBotaoEntrar() {
		botaoEntrar.click();
	}

	public void acessarMenuSeuBarrigaNativo() {
		menuSeuBarrigaNativo.click();
	}

	public void preencherCampoNomeSeuBarrigaNativo(String string) {
		campoNomeNativo.sendKeys(string);
	}

	public void preencherCampoSenhaSeuBarrigaNativo(String string) {
		campoSenhaNativo.sendKeys(string);
	}

	public void acionarBotaoEntrarSeuBarrigaNativo() {
		botaoEntrarNativo.click();
	}

	// Validações
	public void validarUsuarioCadastrado() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		mensagemUsuarioCadastrado.isDisplayed();
	}

	public void validarUsuarioLogado() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		mensagemUsuarioLogado.isDisplayed();
	}

	public void validarLoginSeuBarrigaNativo() {
		mensagemErro.isDisplayed();
	}

}
