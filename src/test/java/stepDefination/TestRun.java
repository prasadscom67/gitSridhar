package stepDefination;

import org.junit.runner.RunWith;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.*;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;

//@RunWith(Cucumber.class)
@CucumberOptions(

		features = "Features",
		glue = "stepDefination",
//		monochrome = true,
//		plugin = { "pretty", "html:test-output" },
//		dryRun=true
		tags = {"~@Igonre"},


//  features = "Features", glue = "stepDefination", monochrome = true,
		format =
  {"pretty", "html:target/cucumber-reports/cucumber-pretty",
  "json:target/cucumber-reports/CucumberTestReport.json",
  "rerun:target/cucumber-report/rerun.txt"},
  
  plugin = "json:target/cucumber-reports/CucumberTestReport.json"
//  dryRun=true // tags = {"@smoke"}
 
)

public class TestRun {
	private TestNGCucumberRunner testNGCucumberRunner;
	
	
	@BeforeTest(alwaysRun = true)
	public void setUp() throws Exception {
		System.out.println("BeforeTest");
	testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());}
	

	@Test(groups="cucumber",description="This is for testing",dataProvider="features")
//	@Test()
	public void feature(CucumberFeatureWrapper cucumberFeature) {
		
		System.out.println("Test");
		testNGCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());
	}

	@DataProvider
	public Object[][] features() {
		return testNGCucumberRunner.provideFeatures();
	}
	
	@AfterTest(alwaysRun = true)
	public void tearDown() throws Exception {
		System.out.println("AfterTest");
//	reportMgr.getExtent().flush();
	testNGCucumberRunner.finish();
	}

}
