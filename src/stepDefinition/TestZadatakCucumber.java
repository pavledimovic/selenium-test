package stepDefinition;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@Cucumber.Options(
		features = "features",	    
		glue = {"stepDefinition"},
		format = { "html:target/myreport" }		
		)
public class TestZadatakCucumber {

}

