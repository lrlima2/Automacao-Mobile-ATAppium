package stepsDefinitions;

import static utils.Utils.driver;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.CliquesPage;

public class CliquesSteps {

	CliquesPage cl = new CliquesPage(driver);

	@Dado("que eu acesse o menu cliques")
	public void queEuAcesseOMenuCliques() {
		cl.acessarMenuCliques();
	}

	@Quando("eu clicar duas vezes na opcao clicar duas vezes")
	public void euClicarDuasVezesNaOpcaoClicarDuasVezes() {
		cl.clicarNoBotaoCliqueDuplo();
	}

	@Entao("o app mostra a mensagem do clique duplo")
	public void oAppMostraAMensagemDoCliqueDuplo() {
		cl.validarMensagemDuploClique();
	}

}
