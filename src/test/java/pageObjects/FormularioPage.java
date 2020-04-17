package pageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import static utils.Utils.*;


public class FormularioPage {
	
	//Construtor
	public FormularioPage(AppiumDriver<?> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this );
	}
		
	
	//Elementos
		@AndroidFindBy(xpath = "//android.widget.TextView[@text='Formulário']")
		private MobileElement menuFormulario;
		
		@AndroidFindBy(xpath = "//android.widget.EditText[@text='Nome']")
		private MobileElement caixaNome;
		
		@AndroidFindBy(xpath = "//android.widget.TextView[@text='SALVAR']")
		private MobileElement botaoSalvar;
	
		@AndroidFindBy(xpath = "//android.widget.TextView[@text='Nome: Leonardo']")
		private MobileElement usuarioCadastrado;
	
	//Metodos
		public void acessarMenuFormulario() {
			menuFormulario.click();
		}
		public void preencherCampoNome(String string) {
			caixaNome.sendKeys(string);
		}
		public void acionarBotaoSalvar() {
			botaoSalvar.click();
		}
	
	
	//Validações
		public void validarUsuarioCadastrado() {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			usuarioCadastrado.isDisplayed();
		}
	
	

}
