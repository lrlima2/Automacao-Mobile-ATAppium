package stepsDefinitions;

import static utils.Utils.driver;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.SwipePage;

public class SwipeSteps {

	SwipePage sw = new SwipePage(driver);

	@Dado("que eu acesse o menu Swipe")
	public void queEuAcesseOMenuSwipe() {
		sw.acessarMenuSwipe();
	}

	@Quando("eu clicar na tela e arrastar pro lado")
	public void euClicarNaTelaEArrastarProLado() {
		sw.clicarParaIrPraTela2();
	}

	@Quando("clicar na tela e arrastar pro lado")
	public void clicarNaTelaEArrastarProLado() {
		sw.clicarParaIrPraTela3();
	}

	@Entao("o app mostra a mensagem de sucesso")
	public void oAppMostraAMensagemDeSucesso() {
		sw.validarMensagemDeSucesso();
	}

}
