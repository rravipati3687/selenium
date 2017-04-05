package TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)

@CucumberOptions(plugin = {"pretty", "html:target/site/cucumber-pretty", "json:target/cucumber.json","usage:target/cucumber-usage.json"}

                        ,features = {"src/test/resources/Regression_Suite/A-Americangolf"}

                        ,glue={"stepDefinition"}

                        ,tags={"@LoginUser,@Home"}

                        )

public class Americangolf_Regression_BDDTest {

	//tags={"@COCApproval_Login_CountyUser,@Gmail_login,"
    //        +"Gmailmain"}
	
	
}
