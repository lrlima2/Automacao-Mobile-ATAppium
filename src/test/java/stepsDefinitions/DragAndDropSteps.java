package stepsDefinitions;

import static utils.Utils.driver;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.DragAndDropPage;

public class DragAndDropSteps {

	DragAndDropPage dg = new DragAndDropPage(driver);

	@Dado("que eu acessar o menu Drag and Drop")
	public void queEuAcessarOMenuDragAndDrop() {
		dg.clicarNoMenuDragAndDrop();
	}

	@Quando("eu clicar na caixa esta")
	public void euClicarNaCaixaEsta() {
		// dg.clicarNaCaixaEsta();
	}

	@Quando("arrastar ela pra baixo")
	public void arrastarElaPraBaixo() {
		dg.arrastarCaixaEstaParaBaixo();
	}

	@Entao("ela vai para o final da lista")
	public void elaVaiParaOFinalDaLista() {
	}

}
