package steps;


import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import factory.WebDriverFactory;
import pageobject.InmetricsPage;

public class InmetricsSteps  extends WebDriverFactory{



	@Dado("que acesso o site da inmetrics")
	public void acessoSiteInmetrics() {
		Hooks hs= new Hooks();
		hs.setUp();
	}

	@Quando("clicar em carreira")
	public void ClicarEmCarreira() {
		page.GetInstance(InmetricsPage.class).ClickBotãoCarreira();
	}

	@E("clicar em confira vagas")
	public void ClicarEmConfiraVagas() throws InterruptedException {
		page.GetInstance(InmetricsPage.class).ClickBotãoConfiraVagas();

	}

	@Entao("sou direcionado para a pagina com todas as vagas da empresa.")
	public void PagindaDeVagasDaEmpresa() {
		page.GetInstance(InmetricsPage.class).BotãoVagas();

	}

}
