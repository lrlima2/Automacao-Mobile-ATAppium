package stepsDefinitions;

import static utils.Utils.driver;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import pageObjects.SplashPage;

public class SplashSteps {

	SplashPage sl = new SplashPage(driver);

	@Dado("que eu acesse o menu Splash")
	public void queEuAcesseOMenuSplash() {
		sl.acessarMenuSplash();
	}

	@Entao("o sistema mostra uma mensagem temporaria")
	public void oSistemaMostraUmaMensagemTemporaria() {
		sl.validarMensagemSplash();
	}

}
