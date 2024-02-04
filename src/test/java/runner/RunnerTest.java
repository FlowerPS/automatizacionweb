package runner;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;


/*
By Flor Paucar
*/

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features ="src/test/recursos/features/HomeAmazon.feature", glue= {"com.primerproyecto.pom.flor.web.stepdefinition"}, tags = ""
        //plugin = {"pretty","html:target/cucumber-reports/cucumber-pretty","json:target/cucumber-reports/CucumberTestReport.json","rerun:target/cucumber-reports/rerun.txt"}
        )
public class RunnerTest{






}
