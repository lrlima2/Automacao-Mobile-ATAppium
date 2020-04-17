package stepsDefinitions;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.OpcaoBemEscondidaPage;
import static utils.Utils.driver;

public class OpcaoBemEscondidaSteps {

	OpcaoBemEscondidaPage op = new OpcaoBemEscondidaPage(driver);

	@Quando("eu clicar no menu Opcao bem escondida")
	public void euClicarNoMenuOpcaoBemEscondida() {
		op.clicarMenuOpcaoBemEscondida();
	}

	@Entao("o app mostra uma mensagem")
	public void oAppMostraUmaMensagem() {
		op.validarMensagemSucesso();
		op.clicarNoBotaoOK();
	}

}
