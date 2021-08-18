package projeto.automationDemoSite.actions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import projeto.automationDemoSite.objects.RegistroObj;

public class RegistroActions {

	static RegistroObj regobj;

	public RegistroActions(WebDriver driver) {

		regobj = new RegistroObj(driver);
	}

	public void realizarCadastro() {

		/**** Dados ****/
		regobj.getFirstName().sendKeys("Aline");
		regobj.getLastName().sendKeys("Medeiros");
		regobj.getAdrress().sendKeys("Rua Cardoso, A - Catete");
		regobj.getEmail().sendKeys("alinemedeiros@mail.com");
		regobj.getPhone().sendKeys("2025550180");
		regobj.getFemale().click();
		
		
		regobj.getHockey().click();

		/**** verifica a Language ****/
		// Clica em Language
		regobj.getLanguage().click();
		// selecionar a lingua
		regobj.getSelectlanguage().click();
		
		regobj.getSkills().getText();
		regobj.getCountries().getText();

		/**** verifica o país ****/
		// Clica em Select Country
		regobj.getSelectCountry().click();
		// Escolhe o país desejado
		regobj.getSelectpais().sendKeys("Australia");
		regobj.getSelectpais().sendKeys(Keys.ENTER);

		/***** Data de Nascimento ****/
		// Ano
		regobj.getYear().getText();
		// Mês
		regobj.getMonth().getText();
		// Dia
		regobj.getDay().getText();

		regobj.getPassword().sendKeys("123456");
		regobj.getConfirmPassword().sendKeys("123456");
		
		// Inserir Foto
		//regobj.getFoto().click();

		regobj.getRefresh().click();

	}

}
