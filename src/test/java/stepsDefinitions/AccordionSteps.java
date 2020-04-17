package stepsDefinitions;

import static utils.Utils.driver;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.AccordionPage;

public class AccordionSteps {

	AccordionPage ac = new AccordionPage(driver);

	@Dado("que eu acesse o menu Accordion")
	public void queEuAcesseOMenuAccordion() {
		ac.acessarMenuAccordion();
	}

	@Quando("eu clicar na opcao um")
	public void euClicarNaOpcaoUm() {
		ac.clicarNaOpcaoUm();
	}

	@Entao("o app mostra a mensagem da opcao um")
	public void oAppMostraAMensagemDaOpcaoUm() {
		ac.validarMensagemOpcaoUm();
	}

}
