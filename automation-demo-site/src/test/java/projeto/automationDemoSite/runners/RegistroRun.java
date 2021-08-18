package projeto.automationDemoSite.runners;

import org.junit.jupiter.api.DisplayName;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(JUnitPlatform.class)
@DisplayName("Suite de Teste- Automation Demo Site")
@SelectPackages("projeto.automationDemoSite.testes")
public class RegistroRun {

}
