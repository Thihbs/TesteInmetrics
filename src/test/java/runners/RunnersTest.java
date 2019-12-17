package runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty", "html:target/evidencias/html/evidence-html", "json:target/evidencias/json/evidencia.json"},
		snippets = SnippetType.CAMELCASE,
		monochrome = true,
		strict = true,
		features = {"classpath:features"},
		
		//ESTE GLUE ESTÁ UTILIZANDO O STEP -> PAGE REPOSITORIO
		glue = {"classpath:steps"},
		//tags = {"@AudiTeste"}
		//tags = {"@OdontoPrev"}
		tags = {"@Inmetricstest"}
				
		//ESTE GLUE ESTA UTILIZANDO -> API
		//glue = {"classpath:steps.Api"},
		
		//tags = {"@API_Test"}
		
		/*COMENTE A GLUE E TAGS A SEREM UTILIZADAS*/
		
		)
public class RunnersTest {

}
