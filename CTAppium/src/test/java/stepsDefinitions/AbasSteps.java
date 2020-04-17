package stepsDefinitions;

import static utils.Utils.driver;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.AbasPage;

public class AbasSteps {

	AbasPage ap = new AbasPage(driver);

	@Dado("que eu acesse o menu Abas")
	public void queEuAcesseOMenuAbas() {
		ap.acessarMenuAbas();
	}

	@Quando("eu clicar na Aba dois")
	public void euClicarNaAbaDois() {
		ap.clicarSobreAbaDois();
	}

	@Entao("o app mostra uma mensagem do conteudo")
	public void oAppMostraUmaMensagemDoConteudo() {
		ap.validarMensagemConteudoAbaDois();
	}

}
