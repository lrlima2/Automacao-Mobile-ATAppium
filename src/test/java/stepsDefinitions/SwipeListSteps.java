package stepsDefinitions;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.SwipeListPage;
import static utils.Utils.driver;

public class SwipeListSteps {

	SwipeListPage sw = new SwipeListPage(driver);

	@Dado("que eu arraste a tela para cima")
	public void queEuArrasteATelaParaCima(){
		sw.arrastarATelaParaCima();
	}

	@Dado("acesse o menu SwipeList")
	public void acesseOMenuSwipeList() {
		sw.clicarNoMenuSwipeList();
	}

	@Quando("eu clicar na opcao cinco e arrastar pra esquerda")
	public void euClicarNaOpcaoCincoEArrastarPraEsquerda() {
		sw.arrastarOpcao2ParaEsquerda();
	}

	@Quando("clicar no sinal de mais")
	public void clicarNoSinalDeMais() {
	}

	@Entao("a opcao cinco fica verde")
	public void aOpcaoCincoFicaVerde() {
	}

}
