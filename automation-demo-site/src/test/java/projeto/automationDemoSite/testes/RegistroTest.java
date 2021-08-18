package projeto.automationDemoSite.testes;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import projeto.automationDemoSite.actions.RegistroActions;

class RegistroTest {
	static WebDriver driver;
	static RegistroActions regact; 

	@BeforeEach
	void iniciarPagina() throws Exception {

		System.setProperty("webdriver.chrome.driver", "C:/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		
		//Instanciar Actions
		regact = new RegistroActions(driver);
	}
	
	@Test
	void realizarCadastroUsuario() {
		
		regact.realizarCadastro();
	}

}
