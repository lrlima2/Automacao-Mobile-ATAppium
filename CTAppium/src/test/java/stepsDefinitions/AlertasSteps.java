package stepsDefinitions;

import static utils.Utils.driver;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.AlertasPage;

public class AlertasSteps {

	AlertasPage al = new AlertasPage(driver);

	///////////////////////// Cenario 1/////////////////////
	@Dado("que eu acesse o menu alertas")
	public void queEuAcesseOMenuAlertas() {
		al.acessarMenuAlertas();
	}

	@Quando("eu clicar no botao Alerta Simples")
	public void euClicarNoBotaoAlertaSimples() {
		al.acionarBotaoAlertaSimples();
	}

	@Entao("o aplicativo mostra uma mensagem simples")
	public void oAplicativoMostraUmaMensagemSimples() {
		al.validarMensagemAlertaSimples();
	}

	@Entao("eu clico em ok")
	public void euClicoEmOk() {
		al.acionarBotaoOk1();
	}

	//////////////////// Cenario 2////////////////////////////
	@Quando("eu clicar no botao Alerta Restritivo")
	public void euClicarNoBotaoAlertaRestritivo() {
		al.acessarBotaoAlertaRestritivo();
	}

	@Entao("o sistema mostra uma mensagem")
	public void oSistemaMostraUmaMensagem() {
		al.validarMensagemAlertaRestritivo();
	}

	@Entao("eu clico em sair restritivo")
	public void euClicoEmSairRestritivo() {
		al.acionarBotaoSair();
	}

	////////////////// Cenario 3//////////////////
	@Quando("eu clicar no botao Alerta Confirm")
	public void euClicarNoBotaoAlertaConfirm() {
		al.clicarNoBotaoAlertaConfirm();
	}

	@Quando("clicar em confirmar")
	public void clicarEmConfirmar() {
		al.clicarNoBotaoConfirmarAlertaConfirm();
	}

	@Entao("o sistema mostra a mensagem de confirmacao")
	public void oSistemaMostraAMensagemDeConfirmacao() {
		al.validarMensageAlertaConfirm();
	}

	@Entao("eu clico em sair confirm")
	public void euClicoEmSairConfirm() {
		al.clicarNoBotaoSairAlertaConfirm();
	}
}
