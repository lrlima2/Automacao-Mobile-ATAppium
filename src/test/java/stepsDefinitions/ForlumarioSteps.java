package stepsDefinitions;

import static utils.Utils.driver;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.FormularioPage;

public class ForlumarioSteps {
	
	FormularioPage fl = new FormularioPage(driver);

	@Dado("que eu acesse o menu Formulario")
	public void queEuAcesseOMenuFormulario() {
		fl.acessarMenuFormulario();
	}

	@Quando("eu preencher o campo nome com {string}")
	public void euPreencherOCampoNomeCom(String string) {
		fl.preencherCampoNome(string);
	}

	@Quando("tocar em salvar")
	public void tocarEmSalvar() {
		fl.acionarBotaoSalvar();
	}

	@Entao("o app mostra o usuario cadastrado")
	public void oAppMostraOUsuarioCadastrado() {
		fl.validarUsuarioCadastrado();
	}
}
