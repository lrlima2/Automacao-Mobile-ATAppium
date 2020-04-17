package stepsDefinitions;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.AboutPage;
import static utils.Utils.*;

public class AboutSteps {

	AboutPage ab = new AboutPage(driver);

	@Quando("eu acionar a aba About")
	public void euAcionarAAbaAbout() {
		ab.acionarMenuAbout();
	}

	@Entao("o aplicativo mostra a versao do sistema")
	public void oAplicativoMostraAVersaoDoSistema() {
		ab.validarMenu();
	}

	@Quando("acionar o botao Veja o curso aqui")
	public void acionar_o_botao_Veja_o_curso_aqui() {
		ab.acionarBotaoVejaOCursoAqui();
	}

	@Entao("o app mostra o curso no navegador")
	public void o_app_mostra_o_curso_no_navegador() {
		ab.validarPaginaDoCurso();
	}

}
