package steps;




import org.hamcrest.Matchers;

import cucumber.api.java.pt.Dado;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class TestApi {

	@Dado("Que faça um get na Api")
	public void testarApi() {
		
			
		Response response = RestAssured.get("https://swapi.co/api/films/");
		System.out.printf(response.path("results.title") + "\n");
		response.then()
		.statusCode(200)
		.body("results.title", Matchers.hasItems("A New Hope","Attack of the Clones","The Phantom Menace","Revenge of the Sith","Return of the Jedi","The Empire Strikes Back","The Force Awakens"))
		.assertThat()
		.body("results.director", Matchers.hasItem("George Lucas"))
		.and()
		.body("results.producer", Matchers.hasItem("Rick McCallum"));
		
		
	
		
			

	}

}
