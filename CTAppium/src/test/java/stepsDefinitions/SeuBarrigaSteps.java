package stepsDefinitions;

import static utils.Utils.driver;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.SeuBarrigaPage;

public class SeuBarrigaSteps {

	SeuBarrigaPage sb = new SeuBarrigaPage(driver);

	@Dado("que eu acesse o menu Seu Barriga Hibrido")
	public void queEuAcesseOMenuSeuBarrigaHibrido() {
		sb.acessarMenuSeuBarrigaHibrido();
	}

	@Quando("eu tocar na aba no usuario")
	public void euTocarNaAbaNoUsuario() {
		sb.acessarAbaNovoUsuario();
	}

	@Quando("preencher o campo nome com {string}")
	public void preencherOCampoNomeCom(String string) {
		sb.preencherCampoNome(string);
	}

	@Quando("preencher o campo email com {string}")
	public void preencherOCampoEmailCom(String string) {
		sb.preencherCampoEmail(string);
	}

	@Quando("preencher o campo senha com {string}")
	public void preencherOCampoSenhaCom(String string) {
		sb.preencherCampoSenha(string);
	}

	@Quando("acionar o botao cadastrar")
	public void acionarOBotaoCadastrar() {
		sb.acionarBotaoCadastrar();
	}

	@Entao("o aplicativo mostra o usuario cadastrado")
	public void oAplicativoMostraOUsuarioCadastrado() {
		sb.validarUsuarioCadastrado();
	}

	// Cenario Realizar Login

	@Quando("eu preencher o campo email com {string}")
	public void euPreencherOCampoEmailCom(String string) {
		sb.preencherCampoEmailLogin(string);
	}

	@Quando("eu preencher o campo senha com {string}")
	public void euPreencherOCampoSenhaCom(String string) {
		sb.preencherCampoSenhaLogin(string);
	}

	@Quando("acionar o botao entrar")
	public void acionarOBotaoEntrar() {
		sb.acionarBotaoEntrar();
	}

	@Entao("o aplicativo mostra o usuario logado")
	public void oAplicativoMostraOUsuarioLogado() {
		sb.validarUsuarioLogado();
	}

	// Realizar Login Seu Barriga nativo
	@Dado("que eu acesse o menu Seu Barriga Nativo")
	public void queEuAcesseOMenuSeuBarrigaNativo() {
		sb.acessarMenuSeuBarrigaNativo();
	}

	@Dado("eu preencher o campo nome nativo com {string}")
	public void euPreencherOCampoNomeNativoCom(String string) {
		sb.preencherCampoNomeSeuBarrigaNativo(string);
	}

	@Dado("eu preencher o campo senha nativo com {string}")
	public void euPreencherOCampoSenhaNativoCom(String string) {
		sb.preencherCampoSenhaSeuBarrigaNativo(string);
	}

	@Dado("acionar o botao entrar nativo")
	public void acionarOBotaoEntrarNativo() {
		sb.acionarBotaoEntrarSeuBarrigaNativo();
	}

	@Entao("o aplicativo mostra a mensagem de erro")
	public void oAplicativoMostraAMensagemDeErro() {
		sb.validarLoginSeuBarrigaNativo();
	}

}
