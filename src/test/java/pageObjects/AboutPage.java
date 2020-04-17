package pageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import static utils.Utils.*;

public class AboutPage {

	// Construtor
	public AboutPage(AppiumDriver<?> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	// Elementos
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='About...']")
	private MobileElement menuAbout;
	
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView[3]")
	private MobileElement versaoApp;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Veja o curso aqui']")
	private MobileElement botaoVejaOCursoAqui;
	
	@AndroidFindBy(id ="com.android.chrome:id/url_bar")
	private MobileElement paginaDoCurso;
	

	// Metodos
	public void acionarMenuAbout() {
		menuAbout.click();
	}
	public void acionarBotaoVejaOCursoAqui() {
		botaoVejaOCursoAqui.click();
	}

	// Validações
	public void validarMenu() {
		versaoApp.isDisplayed();
	}
	public void validarPaginaDoCurso() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		paginaDoCurso.isDisplayed();
	}
}
