package generated;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crawljax.browser.EmbeddedBrowser.BrowserType;
import com.crawljax.core.configuration.BrowserConfiguration;
import com.crawljax.core.configuration.BrowserOptions;
import com.crawljax.core.configuration.CrawljaxConfiguration;
import com.crawljax.core.configuration.CrawljaxConfiguration.CrawljaxConfigurationBuilder;
import com.crawljax.core.state.Identification;
import com.crawljax.core.state.Identification.How;
import com.crawljax.core.state.StatePair.StateComparision;
import com.crawljax.forms.FormInput;
import com.crawljax.plugins.testcasegenerator.TestConfiguration.StateEquivalenceAssertionMode;
import com.crawljax.plugins.testcasegenerator.TestSuiteHelper;

import com.crawljax.plugins.testcasegenerator.crawlPlugins.*;


/*
 * Generated @ Tue Oct 05 19:16:47 CDT 2021
 */

public class GeneratedTests {
	private final boolean mutate = true;
    private final String URL = "http://localhost:3000/claroline11110/";
	private TestSuiteHelper testSuiteHelper;
	
	private final String CRAWL_PATH = "/Users/liuyu/projects/tackle-test-generator-ui-level/testlabeling/crawljax_frag/out/claroline/claroline_HYBRID_DOM_-1.0_60mins/localhost/crawl1";

	private StateEquivalenceAssertionMode assertionMode = StateEquivalenceAssertionMode.HYBRID;
	
	private CrawljaxConfiguration getTestConfiguration() {
		CrawljaxConfigurationBuilder builder = CrawljaxConfiguration.builderFor(URL);
		builder.crawlRules().waitAfterEvent(500, TimeUnit.MILLISECONDS);
		builder.crawlRules().waitAfterReloadUrl(500, TimeUnit.MILLISECONDS);
		builder.setBrowserConfig(new BrowserConfiguration(BrowserType.CHROME_HEADLESS, 1, new BrowserOptions(false, 2)));
		builder.addPlugin(new ClarolineCleanup());
		return builder.build();
	}	
	
	@BeforeClass
	public void oneTimeSetUp(){
		try {
			//load needed data from json files
			testSuiteHelper = new TestSuiteHelper(
					getTestConfiguration(),
					CRAWL_PATH, URL, mutate);
					
		}
		catch (Exception e) {
			Assert.fail(e.getMessage());
		}
	}
	
	@AfterClass
	public void oneTimeTearDown(){
		try {
			testSuiteHelper.tearDown();
		}catch (Exception e) {
			Assert.fail(e.getMessage());
		}
	}

	@BeforeMethod
	public void setUp(){
		try {
			testSuiteHelper.goToInitialUrl();		
		}catch (Exception e) {
			Assert.fail(e.getMessage());
		}
	}	
	
	@AfterMethod
	public void getStatusAndDuration(ITestResult tr) {
		long duration = tr.getEndMillis() - tr.getStartMillis();
		long nanos = TimeUnit.MILLISECONDS.toNanos(duration);
		String message = "none";
		if (tr.getThrowable() != null) {
			message = tr.getThrowable().getMessage();
		}

		switch (tr.getStatus()) {
			case ITestResult.SUCCESS:
				testSuiteHelper.markLastMethodAsSucceeded(nanos);
				break;
			case ITestResult.FAILURE:
				testSuiteHelper.markLastMethodAsFailed(message, nanos);
				break;
			case ITestResult.SKIP:
				testSuiteHelper.markLastMethodAsSkipped(nanos);
				break;
		}
	}
	
	/*
	 * Test Cases
	 */
	 
	@Test(priority=1)
	public void method_0(){
		testSuiteHelper.newCurrentTestMethod("method_0", 1);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		try {
			//initial state
			testSuiteHelper.runInCrawlingPlugins(0);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 0");

			testSuiteHelper.addStateToReportBuilder(0);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(0)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(0)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(0)
					&& allStatesIdentical;	
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=2)
	public void method_BT0_path_2_3_5_6_8_9_10_11_12_14_16_17_18_19_20_21_22_23(){
		testSuiteHelper.newCurrentTestMethod("method_BT0_path_2_3_5_6_8_9_10_11_12_14_16_17_18_19_20_21_22_23", 2);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(0);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(0)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(0)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(0)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[1]/SPAN[1]/A[1], element=Element{node=[A: null], tag=A, text=Login, attributes={evlist=false, href=/claroline11110/claroline/auth/login.php?sourceUrl=aHR0cDovL2xvY2FsaG9zdDozMDAwL2NsYXJvbGluZTExMTEwLw%3D%3D, target=_top}}, source=HybridStateVertexImpl{id=0, name=index}, target=HybridStateVertexImpl{id=3, name=state3}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/FORM[1]/FIELDSET[1]/INPUT[1]"), "admin"));
			formInputs.add(new FormInput(FormInput.InputType.PASSWORD, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/FORM[1]/FIELDSET[1]/INPUT[2]"), "admin"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/FORM[1]/INPUT[1]"), "JPfdFFLi"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(2), "Event fired: Login");
			testSuiteHelper.runInCrawlingPlugins(3);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 3");

			testSuiteHelper.addStateToReportBuilder(3);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(3)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(3)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(3)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/SPAN[1]/A[1], element=Element{node=[A: null], tag=A, text=Claroline, attributes={anyaccess=action, evlist=false, href=/claroline11110/index.php, target=_top}}, source=HybridStateVertexImpl{id=3, name=state3}, target=HybridStateVertexImpl{id=0, name=index}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/FORM[1]/FIELDSET[1]/INPUT[4]"), "admin"));
			formInputs.add(new FormInput(FormInput.InputType.PASSWORD, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/FORM[1]/FIELDSET[1]/INPUT[5]"), "admin"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(3), "Event fired: Claroline");
			testSuiteHelper.runInCrawlingPlugins(0);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 0");

			testSuiteHelper.addStateToReportBuilder(0);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(0)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(0)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(0)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/P[1]/A[1], element=Element{node=[A: null], tag=A, text=Lost password, attributes={evlist=false, href=/claroline11110/claroline/auth/lostPassword.php}}, source=HybridStateVertexImpl{id=0, name=index}, target=HybridStateVertexImpl{id=6, name=state6}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/FORM[1]/FIELDSET[1]/INPUT[1]"), "admin"));
			formInputs.add(new FormInput(FormInput.InputType.PASSWORD, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/FORM[1]/FIELDSET[1]/INPUT[2]"), "admin"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/FORM[1]/INPUT[1]"), "TCAitBQO"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(5), "Event fired: Lost password");
			testSuiteHelper.runInCrawlingPlugins(6);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 6");

			testSuiteHelper.addStateToReportBuilder(6);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(6)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(6)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(6)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[1]/SPAN[1]/A[1], element=Element{node=[A: null], tag=A, text=Login, attributes={evlist=false, href=/claroline11110/claroline/auth/login.php?sourceUrl=aHR0cDovL2xvY2FsaG9zdDozMDAwL2NsYXJvbGluZTExMTEwL2NsYXJvbGluZS9hdXRoL2xvc3RQYXNzd29yZC5waHA%3D, target=_top}}, source=HybridStateVertexImpl{id=6, name=state6}, target=HybridStateVertexImpl{id=3, name=state3}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[2]/FORM[1]/INPUT[2]"), "ZRGaYqYM"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(6), "Event fired: Login");
			testSuiteHelper.runInCrawlingPlugins(3);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 3");

			testSuiteHelper.addStateToReportBuilder(3);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(3)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(3)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(3)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[3]/DIV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text= Claroline, attributes={anyaccess=none, evlist=false, href=/claroline11110/index.php, target=_top}}, source=HybridStateVertexImpl{id=3, name=state3}, target=HybridStateVertexImpl{id=0, name=index}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/FORM[1]/FIELDSET[1]/INPUT[4]"), "admin"));
			formInputs.add(new FormInput(FormInput.InputType.PASSWORD, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/FORM[1]/FIELDSET[1]/INPUT[5]"), "admin"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(8), "Event fired:  Claroline");
			testSuiteHelper.runInCrawlingPlugins(0);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 0");

			testSuiteHelper.addStateToReportBuilder(0);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(0)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(0)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(0)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/P[1]/A[2], element=Element{node=[A: null], tag=A, text=Create user account, attributes={evlist=false, href=/claroline11110/claroline/auth/inscription.php}}, source=HybridStateVertexImpl{id=0, name=index}, target=HybridStateVertexImpl{id=10, name=state10}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/FORM[1]/FIELDSET[1]/INPUT[1]"), "admin"));
			formInputs.add(new FormInput(FormInput.InputType.PASSWORD, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/FORM[1]/FIELDSET[1]/INPUT[2]"), "admin"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/FORM[1]/INPUT[1]"), "QSQEEngq"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(9), "Event fired: Create user account");
			testSuiteHelper.runInCrawlingPlugins(10);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 10");

			testSuiteHelper.addStateToReportBuilder(10);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(10)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(10)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(10)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[1]/SPAN[1]/A[1], element=Element{node=[A: null], tag=A, text=Login, attributes={anyaccess=action, evlist=false, href=/claroline11110/claroline/auth/login.php?sourceUrl=aHR0cDovL2xvY2FsaG9zdDozMDAwL2NsYXJvbGluZTExMTEwL2NsYXJvbGluZS9hdXRoL2luc2NyaXB0aW9uLnBocA%3D%3D, target=_top}}, source=HybridStateVertexImpl{id=10, name=state10}, target=HybridStateVertexImpl{id=3, name=state3}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DL[1]/DD[1]/INPUT[1]"), "Stocco"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DL[1]/DD[2]/INPUT[1]"), "Andrea"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DL[1]/DD[3]/INPUT[1]"), "ogwFoJML"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[2]/DL[1]/DD[2]/INPUT[1]"), "dHBfSzdA"));
			formInputs.add(new FormInput(FormInput.InputType.PASSWORD, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[2]/DL[1]/DD[3]/INPUT[1]"), "admin"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[3]/DL[1]/DD[1]/INPUT[1]"), "astocco@ece.ubc.ca"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[3]/DL[1]/DD[2]/INPUT[1]"), "AGsPKdAk"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[3]/DL[1]/DD[3]/INPUT[1]"), "DgkymZHu"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[4]/DL[1]/DD[1]/INPUT[1]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[4]/DL[1]/DD[1]/INPUT[2]"), "1"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(10), "Event fired: Login");
			testSuiteHelper.runInCrawlingPlugins(3);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 3");

			testSuiteHelper.addStateToReportBuilder(3);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(3)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(3)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(3)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/FORM[1]/FIELDSET[1]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={evlist=false, href=/claroline11110/claroline/}}, source=HybridStateVertexImpl{id=3, name=state3}, target=HybridStateVertexImpl{id=0, name=index}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/FORM[1]/FIELDSET[1]/INPUT[4]"), "admin"));
			formInputs.add(new FormInput(FormInput.InputType.PASSWORD, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/FORM[1]/FIELDSET[1]/INPUT[5]"), "admin"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(11), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(0);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 0");

			testSuiteHelper.addStateToReportBuilder(0);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(0)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(0)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(0)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/FORM[1]/FIELDSET[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Enter, attributes={evlist=false, tabindex=3, type=submit}}, source=HybridStateVertexImpl{id=0, name=index}, target=HybridStateVertexImpl{id=13, name=state13}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/FORM[1]/FIELDSET[1]/INPUT[1]"), "admin"));
			formInputs.add(new FormInput(FormInput.InputType.PASSWORD, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/FORM[1]/FIELDSET[1]/INPUT[2]"), "admin"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/FORM[1]/INPUT[1]"), "YZWkUHaV"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(12), "Event fired: Enter");
			testSuiteHelper.runInCrawlingPlugins(13);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 13");

			testSuiteHelper.addStateToReportBuilder(13);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(13)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(13)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(13)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[2]/SPAN[1]/A[1], element=Element{node=[A: null], tag=A, text=My messages, attributes={evlist=false, href=/claroline11110/claroline/messaging, target=_top}}, source=HybridStateVertexImpl{id=13, name=state13}, target=HybridStateVertexImpl{id=15, name=state15}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(14), "Event fired: My messages");
			testSuiteHelper.runInCrawlingPlugins(15);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 15");

			testSuiteHelper.addStateToReportBuilder(15);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(15)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(15)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(15)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/P[1]/A[1], element=Element{node=[A: null], tag=A, text=Edit text zone, attributes={evlist=false, href=/claroline11110/claroline/admin/managing/editFile.php?cmd=rqEdit&file=textzone_messaging_top.inc.html}}, source=HybridStateVertexImpl{id=15, name=state15}, target=HybridStateVertexImpl{id=17, name=state17}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/FORM[1]/INPUT[1]"), "ywEZYilg"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(16), "Event fired: Edit text zone");
			testSuiteHelper.runInCrawlingPlugins(17);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 17");

			testSuiteHelper.addStateToReportBuilder(17);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(17)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(17)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(17)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/SPAN[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/DIV[1]/SPAN[1]/TABLE[1]/TBODY[1]/TR[1]/TD[11]/A[1], element=Element{node=[A: null], tag=A, text=Subscript, attributes={aria-labelledby=textContent_sub_voice, class=mceButton mceButtonEnabled mce_sub, evlist=false, href=javascript:;, id=textContent_sub, onclick=return false;, onmousedown=return false;, role=button, tabindex=-1, title=Subscript}}, source=HybridStateVertexImpl{id=17, name=state17}, target=HybridStateVertexImpl{id=18, name=state18}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(17), "Event fired: Subscript");
			testSuiteHelper.runInCrawlingPlugins(18);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 18");

			testSuiteHelper.addStateToReportBuilder(18);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(18)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(18)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(18)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/SPAN[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/DIV[1]/SPAN[1]/TABLE[1]/TBODY[1]/TR[1]/TD[14]/A[1], element=Element{node=[A: null], tag=A, text=Undo (Ctrl+Z), attributes={anyaccess=none, aria-disabled=false, aria-labelledby=textContent_undo_voice, class=mceButton mce_undo mceButtonEnabled, evlist=false, href=javascript:;, id=textContent_undo, onclick=return false;, onmousedown=return false;, role=button, tabindex=-1, title=Undo (Ctrl+Z)}}, source=HybridStateVertexImpl{id=18, name=state18}, target=HybridStateVertexImpl{id=17, name=state17}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(18), "Event fired: Undo (Ctrl+Z)");
			testSuiteHelper.runInCrawlingPlugins(17);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 17");

			testSuiteHelper.addStateToReportBuilder(17);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(17)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(17)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(17)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/SPAN[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/DIV[1]/SPAN[1]/TABLE[2]/TBODY[1]/TR[1]/TD[12]/A[1], element=Element{node=[A: null], tag=A, text=Insert/Remove Bulleted List, attributes={aria-labelledby=textContent_bullist_voice, aria-pressed=false, class=mceButton mceButtonEnabled mce_bullist, evlist=false, href=javascript:;, id=textContent_bullist, onclick=return false;, onmousedown=return false;, role=button, tabindex=-1, title=Insert/Remove Bulleted List}}, source=HybridStateVertexImpl{id=17, name=state17}, target=HybridStateVertexImpl{id=20, name=state20}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(19), "Event fired: Insert/Remove Bulleted List");
			testSuiteHelper.runInCrawlingPlugins(20);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 20");

			testSuiteHelper.addStateToReportBuilder(20);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(20)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(20)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(20)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/SPAN[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/DIV[1]/SPAN[1]/TABLE[2]/TBODY[1]/TR[1]/TD[15]/A[1], element=Element{node=[A: null], tag=A, text=Decrease Indent, attributes={anyaccess=none, aria-disabled=false, aria-labelledby=textContent_outdent_voice, class=mceButton mce_outdent mceButtonEnabled, evlist=false, href=javascript:;, id=textContent_outdent, onclick=return false;, onmousedown=return false;, role=button, tabindex=-1, title=Decrease Indent}}, source=HybridStateVertexImpl{id=20, name=state20}, target=HybridStateVertexImpl{id=17, name=state17}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(20), "Event fired: Decrease Indent");
			testSuiteHelper.runInCrawlingPlugins(17);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 17");

			testSuiteHelper.addStateToReportBuilder(17);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(17)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(17)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(17)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/SPAN[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/DIV[1]/SPAN[1]/TABLE[2]/TBODY[1]/TR[1]/TD[13]/A[1], element=Element{node=[A: null], tag=A, text=Insert/Remove Numbered List, attributes={aria-labelledby=textContent_numlist_voice, aria-pressed=false, class=mceButton mceButtonEnabled mce_numlist, evlist=false, href=javascript:;, id=textContent_numlist, onclick=return false;, onmousedown=return false;, role=button, tabindex=-1, title=Insert/Remove Numbered List}}, source=HybridStateVertexImpl{id=17, name=state17}, target=HybridStateVertexImpl{id=20, name=state20}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(21), "Event fired: Insert/Remove Numbered List");
			testSuiteHelper.runInCrawlingPlugins(20);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 20");

			testSuiteHelper.addStateToReportBuilder(20);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(20)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(20)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(20)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/SPAN[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/DIV[1]/SPAN[1]/TABLE[1]/TBODY[1]/TR[1]/TD[4]/SPAN[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/A[1], element=Element{node=[A: null], tag=A, text=Format, attributes={anyaccess=none, class=mceText mceTitle, evlist=false, href=javascript:;, id=textContent_formatselect_text, onclick=return false;, onmousedown=return false;, tabindex=-1}}, source=HybridStateVertexImpl{id=20, name=state20}, target=HybridStateVertexImpl{id=23, name=state23}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(22), "Event fired: Format");
			testSuiteHelper.runInCrawlingPlugins(23);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 23");

			testSuiteHelper.addStateToReportBuilder(23);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(23)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(23)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(23)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/SPAN[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/DIV[1]/SPAN[1]/TABLE[2]/TBODY[1]/TR[1]/TD[18]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[2]/A[1], element=Element{node=[A: null], tag=A, text=▼, attributes={anyaccess=none, class=mceOpen mce_forecolor, evlist=false, href=javascript:;, id=textContent_forecolor_open, onclick=return false;, onmousedown=return false;, role=button, tabindex=-1, title=Select Text Color}}, source=HybridStateVertexImpl{id=23, name=state23}, target=HybridStateVertexImpl{id=24, name=state24}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(23), "Event fired: ▼");
			testSuiteHelper.runInCrawlingPlugins(24);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 24");

			testSuiteHelper.addStateToReportBuilder(24);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(24)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(24)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(24)
					&& allStatesIdentical;	
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=3)
	public void method_BT17_path_14_16_35_36_37_38_39_40_41_42_43_44_45_46_47_48_49_50_51_52_53_54_55(){
		testSuiteHelper.newCurrentTestMethod("method_BT17_path_14_16_35_36_37_38_39_40_41_42_43_44_45_46_47_48_49_50_51_52_53_54_55", 3);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(13);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(13)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(13)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(13)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[2]/SPAN[1]/A[1], element=Element{node=[A: null], tag=A, text=My messages, attributes={evlist=false, href=/claroline11110/claroline/messaging, target=_top}}, source=HybridStateVertexImpl{id=13, name=state13}, target=HybridStateVertexImpl{id=15, name=state15}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(14), "Event fired: My messages");
			testSuiteHelper.runInCrawlingPlugins(15);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 15");

			testSuiteHelper.addStateToReportBuilder(15);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(15)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(15)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(15)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/P[1]/A[1], element=Element{node=[A: null], tag=A, text=Edit text zone, attributes={evlist=false, href=/claroline11110/claroline/admin/managing/editFile.php?cmd=rqEdit&file=textzone_messaging_top.inc.html}}, source=HybridStateVertexImpl{id=15, name=state15}, target=HybridStateVertexImpl{id=17, name=state17}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/FORM[1]/INPUT[1]"), "ywEZYilg"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(16), "Event fired: Edit text zone");
			testSuiteHelper.runInCrawlingPlugins(17);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 17");

			testSuiteHelper.addStateToReportBuilder(17);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(17)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(17)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(17)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/TABLE[1]/TBODY[1]/TR[1]/TD[3]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={evlist=false, href=/claroline11110/claroline/admin/managing/editFile.php?cmd=exView&file=textzone_top.inc.html}}, source=HybridStateVertexImpl{id=17, name=state17}, target=HybridStateVertexImpl{id=38, name=state38}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(35), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(38);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 38");

			testSuiteHelper.addStateToReportBuilder(38);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(38)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(38)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(38)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/TABLE[1]/TBODY[1]/TR[2]/TD[2]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={anyaccess=none, evlist=false, href=/claroline11110/claroline/admin/managing/editFile.php?cmd=rqEdit&file=textzone_top.anonymous.inc.html}}, source=HybridStateVertexImpl{id=38, name=state38}, target=HybridStateVertexImpl{id=17, name=state17}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(36), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(17);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 17");

			testSuiteHelper.addStateToReportBuilder(17);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(17)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(17)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(17)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/TABLE[1]/TBODY[1]/TR[2]/TD[3]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={evlist=false, href=/claroline11110/claroline/admin/managing/editFile.php?cmd=exView&file=textzone_top.anonymous.inc.html}}, source=HybridStateVertexImpl{id=17, name=state17}, target=HybridStateVertexImpl{id=38, name=state38}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(37), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(38);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 38");

			testSuiteHelper.addStateToReportBuilder(38);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(38)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(38)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(38)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/TABLE[1]/TBODY[1]/TR[3]/TD[2]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={anyaccess=none, evlist=false, href=/claroline11110/claroline/admin/managing/editFile.php?cmd=rqEdit&file=textzone_top.authenticated.inc.html}}, source=HybridStateVertexImpl{id=38, name=state38}, target=HybridStateVertexImpl{id=17, name=state17}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(38), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(17);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 17");

			testSuiteHelper.addStateToReportBuilder(17);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(17)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(17)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(17)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/TABLE[1]/TBODY[1]/TR[3]/TD[3]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={evlist=false, href=/claroline11110/claroline/admin/managing/editFile.php?cmd=exView&file=textzone_top.authenticated.inc.html}}, source=HybridStateVertexImpl{id=17, name=state17}, target=HybridStateVertexImpl{id=38, name=state38}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(39), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(38);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 38");

			testSuiteHelper.addStateToReportBuilder(38);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(38)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(38)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(38)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/TABLE[1]/TBODY[1]/TR[4]/TD[2]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={anyaccess=none, evlist=false, href=/claroline11110/claroline/admin/managing/editFile.php?cmd=rqEdit&file=textzone_right.inc.html}}, source=HybridStateVertexImpl{id=38, name=state38}, target=HybridStateVertexImpl{id=17, name=state17}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(40), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(17);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 17");

			testSuiteHelper.addStateToReportBuilder(17);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(17)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(17)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(17)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/TABLE[1]/TBODY[1]/TR[4]/TD[3]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={evlist=false, href=/claroline11110/claroline/admin/managing/editFile.php?cmd=exView&file=textzone_right.inc.html}}, source=HybridStateVertexImpl{id=17, name=state17}, target=HybridStateVertexImpl{id=38, name=state38}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(41), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(38);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 38");

			testSuiteHelper.addStateToReportBuilder(38);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(38)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(38)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(38)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/TABLE[1]/TBODY[1]/TR[5]/TD[2]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={anyaccess=none, evlist=false, href=/claroline11110/claroline/admin/managing/editFile.php?cmd=rqEdit&file=course_subscription_locked.inc.html}}, source=HybridStateVertexImpl{id=38, name=state38}, target=HybridStateVertexImpl{id=17, name=state17}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(42), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(17);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 17");

			testSuiteHelper.addStateToReportBuilder(17);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(17)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(17)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(17)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/TABLE[1]/TBODY[1]/TR[5]/TD[3]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={evlist=false, href=/claroline11110/claroline/admin/managing/editFile.php?cmd=exView&file=course_subscription_locked.inc.html}}, source=HybridStateVertexImpl{id=17, name=state17}, target=HybridStateVertexImpl{id=38, name=state38}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(43), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(38);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 38");

			testSuiteHelper.addStateToReportBuilder(38);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(38)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(38)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(38)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/TABLE[1]/TBODY[1]/TR[6]/TD[2]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={anyaccess=none, evlist=false, href=/claroline11110/claroline/admin/managing/editFile.php?cmd=rqEdit&file=course_subscription_locked_by_key.inc.html}}, source=HybridStateVertexImpl{id=38, name=state38}, target=HybridStateVertexImpl{id=17, name=state17}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(44), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(17);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 17");

			testSuiteHelper.addStateToReportBuilder(17);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(17)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(17)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(17)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/TABLE[1]/TBODY[1]/TR[6]/TD[3]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={evlist=false, href=/claroline11110/claroline/admin/managing/editFile.php?cmd=exView&file=course_subscription_locked_by_key.inc.html}}, source=HybridStateVertexImpl{id=17, name=state17}, target=HybridStateVertexImpl{id=38, name=state38}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(45), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(38);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 38");

			testSuiteHelper.addStateToReportBuilder(38);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(38)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(38)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(38)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/TABLE[1]/TBODY[1]/TR[7]/TD[2]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={anyaccess=none, evlist=false, href=/claroline11110/claroline/admin/managing/editFile.php?cmd=rqEdit&file=textzone_inscription.inc.html}}, source=HybridStateVertexImpl{id=38, name=state38}, target=HybridStateVertexImpl{id=17, name=state17}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(46), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(17);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 17");

			testSuiteHelper.addStateToReportBuilder(17);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(17)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(17)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(17)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/TABLE[1]/TBODY[1]/TR[7]/TD[3]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={evlist=false, href=/claroline11110/claroline/admin/managing/editFile.php?cmd=exView&file=textzone_inscription.inc.html}}, source=HybridStateVertexImpl{id=17, name=state17}, target=HybridStateVertexImpl{id=38, name=state38}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(47), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(38);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 38");

			testSuiteHelper.addStateToReportBuilder(38);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(38)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(38)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(38)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/TABLE[1]/TBODY[1]/TR[8]/TD[2]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={anyaccess=none, evlist=false, href=/claroline11110/claroline/admin/managing/editFile.php?cmd=rqEdit&file=textzone_inscription_form.inc.html}}, source=HybridStateVertexImpl{id=38, name=state38}, target=HybridStateVertexImpl{id=17, name=state17}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(48), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(17);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 17");

			testSuiteHelper.addStateToReportBuilder(17);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(17)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(17)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(17)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/TABLE[1]/TBODY[1]/TR[8]/TD[3]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={evlist=false, href=/claroline11110/claroline/admin/managing/editFile.php?cmd=exView&file=textzone_inscription_form.inc.html}}, source=HybridStateVertexImpl{id=17, name=state17}, target=HybridStateVertexImpl{id=38, name=state38}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(49), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(38);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 38");

			testSuiteHelper.addStateToReportBuilder(38);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(38)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(38)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(38)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/TABLE[1]/TBODY[1]/TR[9]/TD[2]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={anyaccess=none, evlist=false, href=/claroline11110/claroline/admin/managing/editFile.php?cmd=rqEdit&file=textzone_edit_profile_form.inc.html}}, source=HybridStateVertexImpl{id=38, name=state38}, target=HybridStateVertexImpl{id=17, name=state17}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(50), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(17);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 17");

			testSuiteHelper.addStateToReportBuilder(17);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(17)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(17)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(17)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/TABLE[1]/TBODY[1]/TR[9]/TD[3]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={evlist=false, href=/claroline11110/claroline/admin/managing/editFile.php?cmd=exView&file=textzone_edit_profile_form.inc.html}}, source=HybridStateVertexImpl{id=17, name=state17}, target=HybridStateVertexImpl{id=38, name=state38}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(51), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(38);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 38");

			testSuiteHelper.addStateToReportBuilder(38);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(38)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(38)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(38)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/TABLE[1]/TBODY[1]/TR[10]/TD[2]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={anyaccess=none, evlist=false, href=/claroline11110/claroline/admin/managing/editFile.php?cmd=rqEdit&file=textzone_upload_file_disclaimer.inc.html}}, source=HybridStateVertexImpl{id=38, name=state38}, target=HybridStateVertexImpl{id=17, name=state17}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(52), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(17);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 17");

			testSuiteHelper.addStateToReportBuilder(17);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(17)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(17)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(17)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/TABLE[1]/TBODY[1]/TR[10]/TD[3]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={evlist=false, href=/claroline11110/claroline/admin/managing/editFile.php?cmd=exView&file=textzone_upload_file_disclaimer.inc.html}}, source=HybridStateVertexImpl{id=17, name=state17}, target=HybridStateVertexImpl{id=38, name=state38}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(53), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(38);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 38");

			testSuiteHelper.addStateToReportBuilder(38);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(38)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(38)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(38)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/TABLE[1]/TBODY[1]/TR[11]/TD[2]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={anyaccess=none, evlist=false, href=/claroline11110/claroline/admin/managing/editFile.php?cmd=rqEdit&file=textzone_messaging_top.inc.html}}, source=HybridStateVertexImpl{id=38, name=state38}, target=HybridStateVertexImpl{id=17, name=state17}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(54), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(17);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 17");

			testSuiteHelper.addStateToReportBuilder(17);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(17)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(17)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(17)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/TABLE[1]/TBODY[1]/TR[11]/TD[3]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={evlist=false, href=/claroline11110/claroline/admin/managing/editFile.php?cmd=exView&file=textzone_messaging_top.inc.html}}, source=HybridStateVertexImpl{id=17, name=state17}, target=HybridStateVertexImpl{id=38, name=state38}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(55), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(38);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 38");

			testSuiteHelper.addStateToReportBuilder(38);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(38)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(38)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(38)
					&& allStatesIdentical;	
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=4)
	public void method_BT24_failed_path_14_16_1000006_1000007(){
		testSuiteHelper.newCurrentTestMethod("method_BT24_failed_path_14_16_1000006_1000007", 4);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(13);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(13)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(13)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(13)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[2]/SPAN[1]/A[1], element=Element{node=[A: null], tag=A, text=My messages, attributes={evlist=false, href=/claroline11110/claroline/messaging, target=_top}}, source=HybridStateVertexImpl{id=13, name=state13}, target=HybridStateVertexImpl{id=15, name=state15}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(14), "Event fired: My messages");
			testSuiteHelper.runInCrawlingPlugins(15);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 15");

			testSuiteHelper.addStateToReportBuilder(15);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(15)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(15)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(15)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/P[1]/A[1], element=Element{node=[A: null], tag=A, text=Edit text zone, attributes={evlist=false, href=/claroline11110/claroline/admin/managing/editFile.php?cmd=rqEdit&file=textzone_messaging_top.inc.html}}, source=HybridStateVertexImpl{id=15, name=state15}, target=HybridStateVertexImpl{id=17, name=state17}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/FORM[1]/INPUT[1]"), "ywEZYilg"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(16), "Event fired: Edit text zone");
			testSuiteHelper.runInCrawlingPlugins(17);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 17");

			testSuiteHelper.addStateToReportBuilder(17);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(17)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(17)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(17)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/SPAN[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/DIV[1]/SPAN[1]/TABLE[1]/TBODY[1]/TR[1]/TD[4]/SPAN[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/A[1], element=Element{node=[A: null], tag=A, text=Format, attributes={class=mceText, evlist=false, href=javascript:;, id=textContent_formatselect_text, onclick=return false;, onmousedown=return false;, tabindex=-1}}, source=HybridStateVertexImpl{id=17, name=state17}, target=HybridStateVertexImpl{id=63, name=state63}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1000006), "Event fired: Format");
			testSuiteHelper.runInCrawlingPlugins(63);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 63");

			testSuiteHelper.addStateToReportBuilder(63);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(63)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(63)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(63)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/SPAN[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/DIV[1]/SPAN[1]/TABLE[2]/TBODY[1]/TR[1]/TD[18]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[2]/A[1], element=Element{node=[A: null], tag=A, text=▼, attributes={anyaccess=none, class=mceOpen mce_forecolor, evlist=false, href=javascript:;, id=textContent_forecolor_open, onclick=return false;, onmousedown=return false;, role=button, tabindex=-1, title=Select Text Color}}, source=HybridStateVertexImpl{id=63, name=state63}, target=HybridStateVertexImpl{id=64, name=state64}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1000007), "Event fired: ▼");
			testSuiteHelper.runInCrawlingPlugins(64);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 64");

			testSuiteHelper.addStateToReportBuilder(64);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(64)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(64)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(64)
					&& allStatesIdentical;	
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=5)
	public void method_BT24_path_56_58_60_62_65_66(){
		testSuiteHelper.newCurrentTestMethod("method_BT24_path_56_58_60_62_65_66", 5);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(13);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(13)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(13)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(13)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[3]/SPAN[1]/A[1], element=Element{node=[A: null], tag=A, text=Platform administration, attributes={evlist=false, href=/claroline11110/claroline/admin/, target=_top}}, source=HybridStateVertexImpl{id=13, name=state13}, target=HybridStateVertexImpl{id=68, name=state68}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(56), "Event fired: Platform administration");
			testSuiteHelper.runInCrawlingPlugins(68);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 68");

			testSuiteHelper.addStateToReportBuilder(68);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(68)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(68)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(68)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/UL[1]/LI[1]/UL[1]/LI[1]/FORM[1]/SMALL[1]/A[1], element=Element{node=[A: null], tag=A, text=Advanced, attributes={evlist=false, href=advanced_user_search.php}}, source=HybridStateVertexImpl{id=68, name=state68}, target=HybridStateVertexImpl{id=70, name=state70}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/UL[1]/LI[1]/UL[1]/LI[1]/FORM[1]/INPUT[1]"), "EewRXilN"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/UL[1]/LI[2]/UL[1]/LI[1]/FORM[1]/INPUT[1]"), "EIRqChgC"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(58), "Event fired: Advanced");
			testSuiteHelper.runInCrawlingPlugins(70);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 70");

			testSuiteHelper.addStateToReportBuilder(70);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(70)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(70)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(70)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/TABLE[1]/TBODY[1]/TR[7]/TD[2]/INPUT[1], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={class=claroButton, evlist=false, type=submit, value=Search user}}, source=HybridStateVertexImpl{id=70, name=state70}, target=HybridStateVertexImpl{id=72, name=state72}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/TABLE[1]/TBODY[1]/TR[1]/TD[2]/INPUT[1]"), "nAdRVyJU"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/TABLE[1]/TBODY[1]/TR[2]/TD[2]/INPUT[1]"), "TrsDlXDK"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/TABLE[1]/TBODY[1]/TR[3]/TD[2]/INPUT[1]"), "IWmJjRbh"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/TABLE[1]/TBODY[1]/TR[4]/TD[2]/INPUT[1]"), "IJKQpwAr"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/TABLE[1]/TBODY[1]/TR[5]/TD[2]/INPUT[1]"), "IFNMQfjY"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/TABLE[1]/TBODY[1]/TR[6]/TD[2]/SELECT[1]"), "Student"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(60), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(72);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 72");

			testSuiteHelper.addStateToReportBuilder(72);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(72)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(72)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(72)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[2]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Create user, attributes={evlist=false, href=adminaddnewuser.php, style=background-image: url(/claroline11110/web/img/user.png?1232376376); background-repeat: no-repeat; background-position: left center; padding-left: 20px;}}, source=HybridStateVertexImpl{id=72, name=state72}, target=HybridStateVertexImpl{id=74, name=state74}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/FORM[1]/INPUT[1]"), "asrVxCIK"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(62), "Event fired: Create user");
			testSuiteHelper.runInCrawlingPlugins(74);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 74");

			testSuiteHelper.addStateToReportBuilder(74);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(74)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(74)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(74)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/DL[1]/DT[1]/INPUT[1], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={evlist=false, id=applyChange, name=applyChange, type=submit, value=Ok}}, source=HybridStateVertexImpl{id=74, name=state74}, target=HybridStateVertexImpl{id=77, name=state77}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DL[1]/DD[1]/INPUT[1]"), "Stocco"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DL[1]/DD[2]/INPUT[1]"), "Andrea"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DL[1]/DD[3]/INPUT[1]"), "IxIwARIS"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[2]/DL[1]/DD[2]/INPUT[1]"), "UzMJCeqR"));
			formInputs.add(new FormInput(FormInput.InputType.PASSWORD, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[2]/DL[1]/DD[3]/INPUT[1]"), "admin"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[3]/DL[1]/DD[1]/INPUT[1]"), "astocco@ece.ubc.ca"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[3]/DL[1]/DD[2]/INPUT[1]"), "sbuaTwBF"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[3]/DL[1]/DD[3]/INPUT[1]"), "wcIpBTBE"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[4]/DL[1]/DD[1]/INPUT[1]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[4]/DL[1]/DD[1]/INPUT[2]"), "0"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[4]/DL[1]/DD[1]/SPAN[1]/INPUT[1]"), "0"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[2]/DL[1]/DD[5]/SELECT[1]"), "claroline"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(65), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(77);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 77");

			testSuiteHelper.addStateToReportBuilder(77);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(77)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(77)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(77)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/DL[1]/DT[1]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={anyaccess=action, evlist=false, href=http://localhost:3000/claroline11110/claroline/admin/adminaddnewuser.php}}, source=HybridStateVertexImpl{id=77, name=state77}, target=HybridStateVertexImpl{id=74, name=state74}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DL[1]/DD[1]/INPUT[1]"), "Stocco"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DL[1]/DD[2]/INPUT[1]"), "Andrea"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DL[1]/DD[3]/INPUT[1]"), "NmtWbVVz"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[2]/DL[1]/DD[2]/INPUT[1]"), "YcXbKvsL"));
			formInputs.add(new FormInput(FormInput.InputType.PASSWORD, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[2]/DL[1]/DD[3]/INPUT[1]"), "admin"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[3]/DL[1]/DD[1]/INPUT[1]"), "astocco@ece.ubc.ca"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[3]/DL[1]/DD[2]/INPUT[1]"), "OIJmTodw"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[3]/DL[1]/DD[3]/INPUT[1]"), "KJJlOJQO"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[4]/DL[1]/DD[1]/INPUT[1]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[4]/DL[1]/DD[1]/INPUT[2]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[4]/DL[1]/DD[1]/SPAN[1]/INPUT[1]"), "0"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[2]/DL[1]/DD[5]/SELECT[1]"), "claroline"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(66), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(74);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 74");

			testSuiteHelper.addStateToReportBuilder(74);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(74)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(74)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(74)
					&& allStatesIdentical;	
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=6)
	public void method_BT13_path_68_70_71_72_74_75_76_77_78_81_82_83_84(){
		testSuiteHelper.newCurrentTestMethod("method_BT13_path_68_70_71_72_74_75_76_77_78_81_82_83_84", 6);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(13);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(13)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(13)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(13)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[2]/DIV[2]/UL[1]/LI[2]/SPAN[1]/A[1], element=Element{node=[A: null], tag=A, text=Manage my account, attributes={evlist=false, href=/claroline11110/claroline/auth/profile.php, target=_top}}, source=HybridStateVertexImpl{id=13, name=state13}, target=HybridStateVertexImpl{id=81, name=state81}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(68), "Event fired: Manage my account");
			testSuiteHelper.runInCrawlingPlugins(81);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 81");

			testSuiteHelper.addStateToReportBuilder(81);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(81)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(81)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(81)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[2]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=View my statistics, attributes={evlist=false, href=/claroline11110/claroline/tracking/userReport.php?userId=1, style=background-image: url(/claroline11110/web/img/statistics.png?1232376376); background-repeat: no-repeat; background-position: left center; padding-left: 20px;}}, source=HybridStateVertexImpl{id=81, name=state81}, target=HybridStateVertexImpl{id=83, name=state83}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DL[1]/DD[1]/INPUT[1]"), "Stocco"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DL[1]/DD[2]/INPUT[1]"), "Andrea"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DL[1]/DD[3]/INPUT[1]"), "JqtzsGrw"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[2]/DL[1]/DD[2]/INPUT[1]"), "exEyzGKZ"));
			formInputs.add(new FormInput(FormInput.InputType.PASSWORD, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[2]/DL[1]/DD[5]/INPUT[1]"), "admin"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[3]/DL[1]/DD[1]/INPUT[1]"), "astocco@ece.ubc.ca"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[3]/DL[1]/DD[2]/INPUT[1]"), "JGaIzaDm"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[3]/DL[1]/DD[3]/INPUT[1]"), "EemvsySL"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[4]/DL[1]/DD[1]/INPUT[1]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[4]/DL[1]/DD[1]/INPUT[2]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[4]/DL[1]/DD[1]/SPAN[1]/INPUT[1]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[2]/DL[1]/DD[7]/SELECT[1]"), "disabled"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(70), "Event fired: View my statistics");
			testSuiteHelper.runInCrawlingPlugins(83);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 83");

			testSuiteHelper.addStateToReportBuilder(83);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(83)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(83)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(83)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[3]/DIV[1]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=My User Account, attributes={anyaccess=none, evlist=false, href=../auth/profile.php, target=_top}}, source=HybridStateVertexImpl{id=83, name=state83}, target=HybridStateVertexImpl{id=81, name=state81}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(71), "Event fired: My User Account");
			testSuiteHelper.runInCrawlingPlugins(81);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 81");

			testSuiteHelper.addStateToReportBuilder(81);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(81)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(81)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(81)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/DL[1]/DT[1]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={evlist=false, href=http://localhost:3000/claroline11110/}}, source=HybridStateVertexImpl{id=81, name=state81}, target=HybridStateVertexImpl{id=83, name=state83}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DL[1]/DD[1]/INPUT[1]"), "Stocco"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DL[1]/DD[2]/INPUT[1]"), "Andrea"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DL[1]/DD[3]/INPUT[1]"), "resTRSpT"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[2]/DL[1]/DD[2]/INPUT[1]"), "gEIqYWQX"));
			formInputs.add(new FormInput(FormInput.InputType.PASSWORD, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[2]/DL[1]/DD[5]/INPUT[1]"), "admin"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[3]/DL[1]/DD[1]/INPUT[1]"), "astocco@ece.ubc.ca"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[3]/DL[1]/DD[2]/INPUT[1]"), "aaNTiHks"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[3]/DL[1]/DD[3]/INPUT[1]"), "ucWIpGFU"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[4]/DL[1]/DD[1]/INPUT[1]"), "0"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[4]/DL[1]/DD[1]/INPUT[2]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[4]/DL[1]/DD[1]/SPAN[1]/INPUT[1]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[2]/DL[1]/DD[7]/SELECT[1]"), "temp"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(72), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(83);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 83");

			testSuiteHelper.addStateToReportBuilder(83);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(83)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(83)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(83)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/H3[1]/SPAN[1]/A[1], element=Element{node=[A: null], tag=A, text=John Doe, attributes={evlist=false, href=/claroline11110/claroline/desktop/index.php}}, source=HybridStateVertexImpl{id=83, name=state83}, target=HybridStateVertexImpl{id=13, name=state13}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(74), "Event fired: John Doe");
			testSuiteHelper.runInCrawlingPlugins(13);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 13");

			testSuiteHelper.addStateToReportBuilder(13);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(13)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(13)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(13)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[2]/DIV[2]/UL[1]/LI[3]/SPAN[1]/A[1], element=Element{node=[A: null], tag=A, text=Logout, attributes={evlist=false, href=/claroline11110/index.php?logout=true, target=_top}}, source=HybridStateVertexImpl{id=13, name=state13}, target=HybridStateVertexImpl{id=0, name=index}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(75), "Event fired: Logout");
			testSuiteHelper.runInCrawlingPlugins(0);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 0");

			testSuiteHelper.addStateToReportBuilder(0);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(0)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(0)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(0)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Search, attributes={evlist=false, type=submit}}, source=HybridStateVertexImpl{id=0, name=index}, target=HybridStateVertexImpl{id=89, name=state89}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/FORM[1]/FIELDSET[1]/INPUT[1]"), "admin"));
			formInputs.add(new FormInput(FormInput.InputType.PASSWORD, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/FORM[1]/FIELDSET[1]/INPUT[2]"), "admin"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/FORM[1]/INPUT[1]"), "FYZriZLP"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(76), "Event fired: Search");
			testSuiteHelper.runInCrawlingPlugins(89);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 89");

			testSuiteHelper.addStateToReportBuilder(89);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(89)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(89)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(89)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[1]/SPAN[1]/A[1], element=Element{node=[A: null], tag=A, text=Login, attributes={anyaccess=action, evlist=false, href=/claroline11110/claroline/auth/login.php?sourceUrl=aHR0cDovL2xvY2FsaG9zdDozMDAwL2NsYXJvbGluZTExMTEwL2luZGV4LnBocD9sb2dvdXQ9dHJ1ZQ%3D%3D, target=_top}}, source=HybridStateVertexImpl{id=89, name=state89}, target=HybridStateVertexImpl{id=3, name=state3}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/FORM[1]/FIELDSET[1]/INPUT[1]"), "admin"));
			formInputs.add(new FormInput(FormInput.InputType.PASSWORD, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/FORM[1]/FIELDSET[1]/INPUT[2]"), "admin"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/FORM[1]/INPUT[1]"), "HQtjcXGx"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(77), "Event fired: Login");
			testSuiteHelper.runInCrawlingPlugins(3);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 3");

			testSuiteHelper.addStateToReportBuilder(3);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(3)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(3)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(3)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/FORM[1]/FIELDSET[1]/INPUT[6], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={evlist=false, type=submit, value=Ok}}, source=HybridStateVertexImpl{id=3, name=state3}, target=HybridStateVertexImpl{id=13, name=state13}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/FORM[1]/FIELDSET[1]/INPUT[4]"), "admin"));
			formInputs.add(new FormInput(FormInput.InputType.PASSWORD, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/FORM[1]/FIELDSET[1]/INPUT[5]"), "admin"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(78), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(13);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 13");

			testSuiteHelper.addStateToReportBuilder(13);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(13)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(13)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(13)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/P[4]/A[1], element=Element{node=[A: null], tag=A, text=View my statistics, attributes={class=claroCmd, evlist=false, href=/claroline11110/claroline/tracking/userReport.php?userId=1}}, source=HybridStateVertexImpl{id=13, name=state13}, target=HybridStateVertexImpl{id=83, name=state83}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(81), "Event fired: View my statistics");
			testSuiteHelper.runInCrawlingPlugins(83);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 83");

			testSuiteHelper.addStateToReportBuilder(83);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(83)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(83)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(83)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/P[2]/A[1], element=Element{node=[A: null], tag=A, text=Manage my account, attributes={class=claroCmd, evlist=false, href=/claroline11110/claroline/auth/profile.php}}, source=HybridStateVertexImpl{id=83, name=state83}, target=HybridStateVertexImpl{id=81, name=state81}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(82), "Event fired: Manage my account");
			testSuiteHelper.runInCrawlingPlugins(81);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 81");

			testSuiteHelper.addStateToReportBuilder(81);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(81)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(81)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(81)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/DL[1]/DT[1]/INPUT[1], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={evlist=false, id=applyChange, name=applyChange, type=submit, value=Ok}}, source=HybridStateVertexImpl{id=81, name=state81}, target=HybridStateVertexImpl{id=96, name=state96}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DL[1]/DD[1]/INPUT[1]"), "Stocco"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DL[1]/DD[2]/INPUT[1]"), "Andrea"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DL[1]/DD[3]/INPUT[1]"), "TUsXUvWM"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[2]/DL[1]/DD[2]/INPUT[1]"), "KLSjNzCi"));
			formInputs.add(new FormInput(FormInput.InputType.PASSWORD, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[2]/DL[1]/DD[5]/INPUT[1]"), "admin"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[3]/DL[1]/DD[1]/INPUT[1]"), "astocco@ece.ubc.ca"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[3]/DL[1]/DD[2]/INPUT[1]"), "SgfiHJIe"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[3]/DL[1]/DD[3]/INPUT[1]"), "zlSXQTKl"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[4]/DL[1]/DD[1]/INPUT[1]"), "0"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[4]/DL[1]/DD[1]/INPUT[2]"), "0"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[4]/DL[1]/DD[1]/SPAN[1]/INPUT[1]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[2]/DL[1]/DD[7]/SELECT[1]"), "temp"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(83), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(96);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 96");

			testSuiteHelper.addStateToReportBuilder(96);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(96)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(96)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(96)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/DL[1]/DT[1]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={anyaccess=action, evlist=false, href=http://localhost:3000/claroline11110/claroline/auth/profile.php}}, source=HybridStateVertexImpl{id=96, name=state96}, target=HybridStateVertexImpl{id=81, name=state81}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DL[1]/DD[1]/INPUT[1]"), "Stocco"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DL[1]/DD[2]/INPUT[1]"), "Andrea"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DL[1]/DD[3]/INPUT[1]"), "ekLLGGev"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[2]/DL[1]/DD[2]/INPUT[1]"), "jitMDmDq"));
			formInputs.add(new FormInput(FormInput.InputType.PASSWORD, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[2]/DL[1]/DD[5]/INPUT[1]"), "admin"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[3]/DL[1]/DD[1]/INPUT[1]"), "astocco@ece.ubc.ca"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[3]/DL[1]/DD[2]/INPUT[1]"), "CJmITgPm"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[3]/DL[1]/DD[3]/INPUT[1]"), "WPOARkWi"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[4]/DL[1]/DD[1]/INPUT[1]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[4]/DL[1]/DD[1]/INPUT[2]"), "0"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[4]/DL[1]/DD[1]/SPAN[1]/INPUT[1]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[2]/DL[1]/DD[7]/SELECT[1]"), "disabled"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(84), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(81);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 81");

			testSuiteHelper.addStateToReportBuilder(81);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(81)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(81)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(81)
					&& allStatesIdentical;	
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=7)
	public void method_BT6_path_75_5_86(){
		testSuiteHelper.newCurrentTestMethod("method_BT6_path_75_5_86", 7);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(13);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(13)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(13)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(13)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[2]/DIV[2]/UL[1]/LI[3]/SPAN[1]/A[1], element=Element{node=[A: null], tag=A, text=Logout, attributes={evlist=false, href=/claroline11110/index.php?logout=true, target=_top}}, source=HybridStateVertexImpl{id=13, name=state13}, target=HybridStateVertexImpl{id=0, name=index}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(75), "Event fired: Logout");
			testSuiteHelper.runInCrawlingPlugins(0);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 0");

			testSuiteHelper.addStateToReportBuilder(0);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(0)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(0)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(0)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/P[1]/A[1], element=Element{node=[A: null], tag=A, text=Lost password, attributes={evlist=false, href=/claroline11110/claroline/auth/lostPassword.php}}, source=HybridStateVertexImpl{id=0, name=index}, target=HybridStateVertexImpl{id=6, name=state6}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/FORM[1]/FIELDSET[1]/INPUT[1]"), "admin"));
			formInputs.add(new FormInput(FormInput.InputType.PASSWORD, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/FORM[1]/FIELDSET[1]/INPUT[2]"), "admin"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/FORM[1]/INPUT[1]"), "TCAitBQO"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(5), "Event fired: Lost password");
			testSuiteHelper.runInCrawlingPlugins(6);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 6");

			testSuiteHelper.addStateToReportBuilder(6);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(6)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(6)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(6)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[3]/DIV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text= Claroline, attributes={evlist=false, href=/claroline11110/index.php, target=_top}}, source=HybridStateVertexImpl{id=6, name=state6}, target=HybridStateVertexImpl{id=0, name=index}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[2]/FORM[1]/INPUT[2]"), "jzCHcwTq"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(86), "Event fired:  Claroline");
			testSuiteHelper.runInCrawlingPlugins(0);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 0");

			testSuiteHelper.addStateToReportBuilder(0);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(0)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(0)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(0)
					&& allStatesIdentical;	
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=8)
	public void method_BT64_path_12_14_16_1000006_1000007(){
		testSuiteHelper.newCurrentTestMethod("method_BT64_path_12_14_16_1000006_1000007", 8);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(0);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(0)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(0)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(0)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/FORM[1]/FIELDSET[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Enter, attributes={evlist=false, tabindex=3, type=submit}}, source=HybridStateVertexImpl{id=0, name=index}, target=HybridStateVertexImpl{id=13, name=state13}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/FORM[1]/FIELDSET[1]/INPUT[1]"), "admin"));
			formInputs.add(new FormInput(FormInput.InputType.PASSWORD, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/FORM[1]/FIELDSET[1]/INPUT[2]"), "admin"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/FORM[1]/INPUT[1]"), "YZWkUHaV"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(12), "Event fired: Enter");
			testSuiteHelper.runInCrawlingPlugins(13);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 13");

			testSuiteHelper.addStateToReportBuilder(13);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(13)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(13)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(13)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[2]/SPAN[1]/A[1], element=Element{node=[A: null], tag=A, text=My messages, attributes={evlist=false, href=/claroline11110/claroline/messaging, target=_top}}, source=HybridStateVertexImpl{id=13, name=state13}, target=HybridStateVertexImpl{id=15, name=state15}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(14), "Event fired: My messages");
			testSuiteHelper.runInCrawlingPlugins(15);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 15");

			testSuiteHelper.addStateToReportBuilder(15);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(15)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(15)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(15)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/P[1]/A[1], element=Element{node=[A: null], tag=A, text=Edit text zone, attributes={evlist=false, href=/claroline11110/claroline/admin/managing/editFile.php?cmd=rqEdit&file=textzone_messaging_top.inc.html}}, source=HybridStateVertexImpl{id=15, name=state15}, target=HybridStateVertexImpl{id=17, name=state17}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/FORM[1]/INPUT[1]"), "ywEZYilg"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(16), "Event fired: Edit text zone");
			testSuiteHelper.runInCrawlingPlugins(17);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 17");

			testSuiteHelper.addStateToReportBuilder(17);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(17)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(17)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(17)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/SPAN[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/DIV[1]/SPAN[1]/TABLE[1]/TBODY[1]/TR[1]/TD[4]/SPAN[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/A[1], element=Element{node=[A: null], tag=A, text=Format, attributes={class=mceText, evlist=false, href=javascript:;, id=textContent_formatselect_text, onclick=return false;, onmousedown=return false;, tabindex=-1}}, source=HybridStateVertexImpl{id=17, name=state17}, target=HybridStateVertexImpl{id=63, name=state63}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1000006), "Event fired: Format");
			testSuiteHelper.runInCrawlingPlugins(63);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 63");

			testSuiteHelper.addStateToReportBuilder(63);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(63)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(63)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(63)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/SPAN[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/DIV[1]/SPAN[1]/TABLE[2]/TBODY[1]/TR[1]/TD[18]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[2]/A[1], element=Element{node=[A: null], tag=A, text=▼, attributes={anyaccess=none, class=mceOpen mce_forecolor, evlist=false, href=javascript:;, id=textContent_forecolor_open, onclick=return false;, onmousedown=return false;, role=button, tabindex=-1, title=Select Text Color}}, source=HybridStateVertexImpl{id=63, name=state63}, target=HybridStateVertexImpl{id=64, name=state64}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1000007), "Event fired: ▼");
			testSuiteHelper.runInCrawlingPlugins(64);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 64");

			testSuiteHelper.addStateToReportBuilder(64);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(64)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(64)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(64)
					&& allStatesIdentical;	
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=9)
	public void method_BT10_path_75_9_90_91(){
		testSuiteHelper.newCurrentTestMethod("method_BT10_path_75_9_90_91", 9);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(13);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(13)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(13)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(13)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[2]/DIV[2]/UL[1]/LI[3]/SPAN[1]/A[1], element=Element{node=[A: null], tag=A, text=Logout, attributes={evlist=false, href=/claroline11110/index.php?logout=true, target=_top}}, source=HybridStateVertexImpl{id=13, name=state13}, target=HybridStateVertexImpl{id=0, name=index}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(75), "Event fired: Logout");
			testSuiteHelper.runInCrawlingPlugins(0);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 0");

			testSuiteHelper.addStateToReportBuilder(0);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(0)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(0)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(0)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/P[1]/A[2], element=Element{node=[A: null], tag=A, text=Create user account, attributes={evlist=false, href=/claroline11110/claroline/auth/inscription.php}}, source=HybridStateVertexImpl{id=0, name=index}, target=HybridStateVertexImpl{id=10, name=state10}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/FORM[1]/FIELDSET[1]/INPUT[1]"), "admin"));
			formInputs.add(new FormInput(FormInput.InputType.PASSWORD, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/FORM[1]/FIELDSET[1]/INPUT[2]"), "admin"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/FORM[1]/INPUT[1]"), "QSQEEngq"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(9), "Event fired: Create user account");
			testSuiteHelper.runInCrawlingPlugins(10);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 10");

			testSuiteHelper.addStateToReportBuilder(10);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(10)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(10)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(10)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/DL[1]/DT[1]/INPUT[1], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={evlist=false, id=applyChange, name=applyChange, type=submit, value=Ok}}, source=HybridStateVertexImpl{id=10, name=state10}, target=HybridStateVertexImpl{id=114, name=state114}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DL[1]/DD[1]/INPUT[1]"), "Stocco"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DL[1]/DD[2]/INPUT[1]"), "Andrea"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DL[1]/DD[3]/INPUT[1]"), "Anlagcdw"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[2]/DL[1]/DD[2]/INPUT[1]"), "XQoPSFUE"));
			formInputs.add(new FormInput(FormInput.InputType.PASSWORD, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[2]/DL[1]/DD[3]/INPUT[1]"), "admin"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[3]/DL[1]/DD[1]/INPUT[1]"), "astocco@ece.ubc.ca"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[3]/DL[1]/DD[2]/INPUT[1]"), "CuQmnTCh"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[3]/DL[1]/DD[3]/INPUT[1]"), "NMcozCyN"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[4]/DL[1]/DD[1]/INPUT[1]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[4]/DL[1]/DD[1]/INPUT[2]"), "0"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(90), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(114);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 114");

			testSuiteHelper.addStateToReportBuilder(114);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(114)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(114)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(114)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/DL[1]/DT[1]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={anyaccess=action, evlist=false, href=http://localhost:3000/claroline11110/claroline/auth/inscription.php}}, source=HybridStateVertexImpl{id=114, name=state114}, target=HybridStateVertexImpl{id=10, name=state10}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DL[1]/DD[1]/INPUT[1]"), "Stocco"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DL[1]/DD[2]/INPUT[1]"), "Andrea"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DL[1]/DD[3]/INPUT[1]"), "xXqOQbpl"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[2]/DL[1]/DD[2]/INPUT[1]"), "AbxRMGZn"));
			formInputs.add(new FormInput(FormInput.InputType.PASSWORD, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[2]/DL[1]/DD[3]/INPUT[1]"), "admin"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[3]/DL[1]/DD[1]/INPUT[1]"), "astocco@ece.ubc.ca"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[3]/DL[1]/DD[2]/INPUT[1]"), "HTZAihzj"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[3]/DL[1]/DD[3]/INPUT[1]"), "rGuALxPP"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[4]/DL[1]/DD[1]/INPUT[1]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[4]/DL[1]/DD[1]/INPUT[2]"), "0"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(91), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(10);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 10");

			testSuiteHelper.addStateToReportBuilder(10);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(10)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(10)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(10)
					&& allStatesIdentical;	
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=10)
	public void method_BT23_failed_path_12_14_16_1000006(){
		testSuiteHelper.newCurrentTestMethod("method_BT23_failed_path_12_14_16_1000006", 10);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(0);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(0)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(0)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(0)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/FORM[1]/FIELDSET[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Enter, attributes={evlist=false, tabindex=3, type=submit}}, source=HybridStateVertexImpl{id=0, name=index}, target=HybridStateVertexImpl{id=13, name=state13}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/FORM[1]/FIELDSET[1]/INPUT[1]"), "admin"));
			formInputs.add(new FormInput(FormInput.InputType.PASSWORD, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/FORM[1]/FIELDSET[1]/INPUT[2]"), "admin"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/FORM[1]/INPUT[1]"), "YZWkUHaV"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(12), "Event fired: Enter");
			testSuiteHelper.runInCrawlingPlugins(13);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 13");

			testSuiteHelper.addStateToReportBuilder(13);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(13)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(13)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(13)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[2]/SPAN[1]/A[1], element=Element{node=[A: null], tag=A, text=My messages, attributes={evlist=false, href=/claroline11110/claroline/messaging, target=_top}}, source=HybridStateVertexImpl{id=13, name=state13}, target=HybridStateVertexImpl{id=15, name=state15}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(14), "Event fired: My messages");
			testSuiteHelper.runInCrawlingPlugins(15);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 15");

			testSuiteHelper.addStateToReportBuilder(15);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(15)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(15)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(15)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/P[1]/A[1], element=Element{node=[A: null], tag=A, text=Edit text zone, attributes={evlist=false, href=/claroline11110/claroline/admin/managing/editFile.php?cmd=rqEdit&file=textzone_messaging_top.inc.html}}, source=HybridStateVertexImpl{id=15, name=state15}, target=HybridStateVertexImpl{id=17, name=state17}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/FORM[1]/INPUT[1]"), "ywEZYilg"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(16), "Event fired: Edit text zone");
			testSuiteHelper.runInCrawlingPlugins(17);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 17");

			testSuiteHelper.addStateToReportBuilder(17);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(17)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(17)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(17)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/SPAN[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/DIV[1]/SPAN[1]/TABLE[1]/TBODY[1]/TR[1]/TD[4]/SPAN[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/A[1], element=Element{node=[A: null], tag=A, text=Format, attributes={class=mceText, evlist=false, href=javascript:;, id=textContent_formatselect_text, onclick=return false;, onmousedown=return false;, tabindex=-1}}, source=HybridStateVertexImpl{id=17, name=state17}, target=HybridStateVertexImpl{id=63, name=state63}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1000006), "Event fired: Format");
			testSuiteHelper.runInCrawlingPlugins(63);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 63");

			testSuiteHelper.addStateToReportBuilder(63);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(63)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(63)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(63)
					&& allStatesIdentical;	
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=11)
	public void method_BT15_path_14_94_96_97(){
		testSuiteHelper.newCurrentTestMethod("method_BT15_path_14_94_96_97", 11);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(13);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(13)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(13)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(13)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[2]/SPAN[1]/A[1], element=Element{node=[A: null], tag=A, text=My messages, attributes={evlist=false, href=/claroline11110/claroline/messaging, target=_top}}, source=HybridStateVertexImpl{id=13, name=state13}, target=HybridStateVertexImpl{id=15, name=state15}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(14), "Event fired: My messages");
			testSuiteHelper.runInCrawlingPlugins(15);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 15");

			testSuiteHelper.addStateToReportBuilder(15);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(15)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(15)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(15)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Outbox, attributes={evlist=false, href=/claroline11110/claroline/messaging/messagebox.php?box=outbox, id=outbox}}, source=HybridStateVertexImpl{id=15, name=state15}, target=HybridStateVertexImpl{id=127, name=state127}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/FORM[1]/INPUT[1]"), "xrhkyolQ"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(94), "Event fired: Outbox");
			testSuiteHelper.runInCrawlingPlugins(127);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 127");

			testSuiteHelper.addStateToReportBuilder(127);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(127)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(127)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(127)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Inbox(0), attributes={evlist=false, href=/claroline11110/claroline/messaging/messagebox.php?box=inbox, id=inbox}}, source=HybridStateVertexImpl{id=127, name=state127}, target=HybridStateVertexImpl{id=15, name=state15}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/FORM[1]/INPUT[1]"), "tjhTlDrI"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(96), "Event fired: Inbox(0)");
			testSuiteHelper.runInCrawlingPlugins(15);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 15");

			testSuiteHelper.addStateToReportBuilder(15);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(15)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(15)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(15)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/UL[1]/LI[3]/A[1], element=Element{node=[A: null], tag=A, text=Trashbox, attributes={evlist=false, href=/claroline11110/claroline/messaging/messagebox.php?box=trashbox, id=trashbox}}, source=HybridStateVertexImpl{id=15, name=state15}, target=HybridStateVertexImpl{id=130, name=state130}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/FORM[1]/INPUT[1]"), "GSPMXMiy"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(97), "Event fired: Trashbox");
			testSuiteHelper.runInCrawlingPlugins(130);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 130");

			testSuiteHelper.addStateToReportBuilder(130);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(130)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(130)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(130)
					&& allStatesIdentical;	
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=12)
	public void method_BT17_path_14_16_103_104(){
		testSuiteHelper.newCurrentTestMethod("method_BT17_path_14_16_103_104", 12);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(13);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(13)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(13)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(13)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[2]/SPAN[1]/A[1], element=Element{node=[A: null], tag=A, text=My messages, attributes={evlist=false, href=/claroline11110/claroline/messaging, target=_top}}, source=HybridStateVertexImpl{id=13, name=state13}, target=HybridStateVertexImpl{id=15, name=state15}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(14), "Event fired: My messages");
			testSuiteHelper.runInCrawlingPlugins(15);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 15");

			testSuiteHelper.addStateToReportBuilder(15);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(15)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(15)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(15)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/P[1]/A[1], element=Element{node=[A: null], tag=A, text=Edit text zone, attributes={evlist=false, href=/claroline11110/claroline/admin/managing/editFile.php?cmd=rqEdit&file=textzone_messaging_top.inc.html}}, source=HybridStateVertexImpl{id=15, name=state15}, target=HybridStateVertexImpl{id=17, name=state17}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/FORM[1]/INPUT[1]"), "ywEZYilg"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(16), "Event fired: Edit text zone");
			testSuiteHelper.runInCrawlingPlugins(17);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 17");

			testSuiteHelper.addStateToReportBuilder(17);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(17)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(17)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(17)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/SPAN[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/DIV[1]/SPAN[1]/TABLE[1]/TBODY[1]/TR[1]/TD[4]/SPAN[1]/TABLE[1]/TBODY[1]/TR[1]/TD[2]/A[1], element=Element{node=[A: null], tag=A, text=▼, attributes={class=mceOpen, evlist=false, href=javascript:;, id=textContent_formatselect_open, onclick=return false;, onmousedown=return false;, tabindex=-1}}, source=HybridStateVertexImpl{id=17, name=state17}, target=HybridStateVertexImpl{id=63, name=state63}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(103), "Event fired: ▼");
			testSuiteHelper.runInCrawlingPlugins(63);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 63");

			testSuiteHelper.addStateToReportBuilder(63);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(63)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(63)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(63)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[2]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/A[1], element=Element{node=[A: null], tag=A, text=Format, attributes={anyaccess=none, aria-disabled=false, aria-pressed=false, evlist=false, href=javascript:;, id=mce_12_aria, onclick=return false;, onmousedown=return false;, role=option, tabindex=-1}}, source=HybridStateVertexImpl{id=63, name=state63}, target=HybridStateVertexImpl{id=140, name=state140}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(104), "Event fired: Format");
			testSuiteHelper.runInCrawlingPlugins(140);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 140");

			testSuiteHelper.addStateToReportBuilder(140);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(140)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(140)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(140)
					&& allStatesIdentical;	
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=13)
	public void method_BT68_path_56_106_107(){
		testSuiteHelper.newCurrentTestMethod("method_BT68_path_56_106_107", 13);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(13);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(13)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(13)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(13)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[3]/SPAN[1]/A[1], element=Element{node=[A: null], tag=A, text=Platform administration, attributes={evlist=false, href=/claroline11110/claroline/admin/, target=_top}}, source=HybridStateVertexImpl{id=13, name=state13}, target=HybridStateVertexImpl{id=68, name=state68}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(56), "Event fired: Platform administration");
			testSuiteHelper.runInCrawlingPlugins(68);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 68");

			testSuiteHelper.addStateToReportBuilder(68);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(68)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(68)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(68)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/UL[1]/LI[1]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=User list, attributes={evlist=false, href=admin_users.php}}, source=HybridStateVertexImpl{id=68, name=state68}, target=HybridStateVertexImpl{id=145, name=state145}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/UL[1]/LI[1]/UL[1]/LI[1]/FORM[1]/INPUT[1]"), "ebIZwepn"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/UL[1]/LI[2]/UL[1]/LI[1]/FORM[1]/INPUT[1]"), "FPLCMqiI"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(106), "Event fired: User list");
			testSuiteHelper.runInCrawlingPlugins(145);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 145");

			testSuiteHelper.addStateToReportBuilder(145);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(145)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(145)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(145)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/FORM[1]/A[1], element=Element{node=[A: null], tag=A, text=Advanced, attributes={anyaccess=none, class=claroCmd, evlist=false, href=advanced_user_search.php?action=all}}, source=HybridStateVertexImpl{id=145, name=state145}, target=HybridStateVertexImpl{id=70, name=state70}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/FORM[1]/INPUT[1]"), "HHOyIOQc"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(107), "Event fired: Advanced");
			testSuiteHelper.runInCrawlingPlugins(70);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 70");

			testSuiteHelper.addStateToReportBuilder(70);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(70)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(70)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(70)
					&& allStatesIdentical;	
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=14)
	public void method_BT64_path_14_16_1000006_1000007(){
		testSuiteHelper.newCurrentTestMethod("method_BT64_path_14_16_1000006_1000007", 14);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(13);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(13)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(13)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(13)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[2]/SPAN[1]/A[1], element=Element{node=[A: null], tag=A, text=My messages, attributes={evlist=false, href=/claroline11110/claroline/messaging, target=_top}}, source=HybridStateVertexImpl{id=13, name=state13}, target=HybridStateVertexImpl{id=15, name=state15}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(14), "Event fired: My messages");
			testSuiteHelper.runInCrawlingPlugins(15);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 15");

			testSuiteHelper.addStateToReportBuilder(15);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(15)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(15)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(15)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/P[1]/A[1], element=Element{node=[A: null], tag=A, text=Edit text zone, attributes={evlist=false, href=/claroline11110/claroline/admin/managing/editFile.php?cmd=rqEdit&file=textzone_messaging_top.inc.html}}, source=HybridStateVertexImpl{id=15, name=state15}, target=HybridStateVertexImpl{id=17, name=state17}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/FORM[1]/INPUT[1]"), "ywEZYilg"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(16), "Event fired: Edit text zone");
			testSuiteHelper.runInCrawlingPlugins(17);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 17");

			testSuiteHelper.addStateToReportBuilder(17);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(17)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(17)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(17)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/SPAN[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/DIV[1]/SPAN[1]/TABLE[1]/TBODY[1]/TR[1]/TD[4]/SPAN[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/A[1], element=Element{node=[A: null], tag=A, text=Format, attributes={class=mceText, evlist=false, href=javascript:;, id=textContent_formatselect_text, onclick=return false;, onmousedown=return false;, tabindex=-1}}, source=HybridStateVertexImpl{id=17, name=state17}, target=HybridStateVertexImpl{id=63, name=state63}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1000006), "Event fired: Format");
			testSuiteHelper.runInCrawlingPlugins(63);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 63");

			testSuiteHelper.addStateToReportBuilder(63);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(63)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(63)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(63)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/SPAN[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/DIV[1]/SPAN[1]/TABLE[2]/TBODY[1]/TR[1]/TD[18]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[2]/A[1], element=Element{node=[A: null], tag=A, text=▼, attributes={anyaccess=none, class=mceOpen mce_forecolor, evlist=false, href=javascript:;, id=textContent_forecolor_open, onclick=return false;, onmousedown=return false;, role=button, tabindex=-1, title=Select Text Color}}, source=HybridStateVertexImpl{id=63, name=state63}, target=HybridStateVertexImpl{id=64, name=state64}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1000007), "Event fired: ▼");
			testSuiteHelper.runInCrawlingPlugins(64);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 64");

			testSuiteHelper.addStateToReportBuilder(64);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(64)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(64)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(64)
					&& allStatesIdentical;	
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=15)
	public void method_BT72_path_56_58_60_109_116(){
		testSuiteHelper.newCurrentTestMethod("method_BT72_path_56_58_60_109_116", 15);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(13);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(13)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(13)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(13)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[3]/SPAN[1]/A[1], element=Element{node=[A: null], tag=A, text=Platform administration, attributes={evlist=false, href=/claroline11110/claroline/admin/, target=_top}}, source=HybridStateVertexImpl{id=13, name=state13}, target=HybridStateVertexImpl{id=68, name=state68}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(56), "Event fired: Platform administration");
			testSuiteHelper.runInCrawlingPlugins(68);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 68");

			testSuiteHelper.addStateToReportBuilder(68);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(68)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(68)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(68)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/UL[1]/LI[1]/UL[1]/LI[1]/FORM[1]/SMALL[1]/A[1], element=Element{node=[A: null], tag=A, text=Advanced, attributes={evlist=false, href=advanced_user_search.php}}, source=HybridStateVertexImpl{id=68, name=state68}, target=HybridStateVertexImpl{id=70, name=state70}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/UL[1]/LI[1]/UL[1]/LI[1]/FORM[1]/INPUT[1]"), "EewRXilN"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/UL[1]/LI[2]/UL[1]/LI[1]/FORM[1]/INPUT[1]"), "EIRqChgC"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(58), "Event fired: Advanced");
			testSuiteHelper.runInCrawlingPlugins(70);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 70");

			testSuiteHelper.addStateToReportBuilder(70);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(70)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(70)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(70)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/TABLE[1]/TBODY[1]/TR[7]/TD[2]/INPUT[1], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={class=claroButton, evlist=false, type=submit, value=Search user}}, source=HybridStateVertexImpl{id=70, name=state70}, target=HybridStateVertexImpl{id=72, name=state72}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/TABLE[1]/TBODY[1]/TR[1]/TD[2]/INPUT[1]"), "nAdRVyJU"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/TABLE[1]/TBODY[1]/TR[2]/TD[2]/INPUT[1]"), "TrsDlXDK"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/TABLE[1]/TBODY[1]/TR[3]/TD[2]/INPUT[1]"), "IWmJjRbh"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/TABLE[1]/TBODY[1]/TR[4]/TD[2]/INPUT[1]"), "IJKQpwAr"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/TABLE[1]/TBODY[1]/TR[5]/TD[2]/INPUT[1]"), "IFNMQfjY"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/TABLE[1]/TBODY[1]/TR[6]/TD[2]/SELECT[1]"), "Student"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(60), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(72);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 72");

			testSuiteHelper.addStateToReportBuilder(72);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(72)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(72)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(72)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/FORM[1]/INPUT[2], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={evlist=false, type=submit, value= Ok }}, source=HybridStateVertexImpl{id=72, name=state72}, target=HybridStateVertexImpl{id=156, name=state156}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/FORM[1]/INPUT[1]"), "zmUOAYZG"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(109), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(156);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 156");

			testSuiteHelper.addStateToReportBuilder(156);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(156)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(156)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(156)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/TABLE[2]/TBODY[1]/TR[1]/TD[1]/CENTER[1]/A[1], element=Element{node=[A: null], tag=A, text=Search again (advanced), attributes={anyaccess=none, evlist=false, href=advanced_user_search.php?action=all}}, source=HybridStateVertexImpl{id=156, name=state156}, target=HybridStateVertexImpl{id=70, name=state70}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/FORM[1]/INPUT[1]"), "phLcymCL"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(116), "Event fired: Search again (advanced)");
			testSuiteHelper.runInCrawlingPlugins(70);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 70");

			testSuiteHelper.addStateToReportBuilder(70);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(70)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(70)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(70)
					&& allStatesIdentical;	
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=16)
	public void method_BT64_path_14_16_1000006_1000007_dup0(){
		testSuiteHelper.newCurrentTestMethod("method_BT64_path_14_16_1000006_1000007_dup0", 16);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(13);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(13)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(13)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(13)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[2]/SPAN[1]/A[1], element=Element{node=[A: null], tag=A, text=My messages, attributes={evlist=false, href=/claroline11110/claroline/messaging, target=_top}}, source=HybridStateVertexImpl{id=13, name=state13}, target=HybridStateVertexImpl{id=15, name=state15}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(14), "Event fired: My messages");
			testSuiteHelper.runInCrawlingPlugins(15);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 15");

			testSuiteHelper.addStateToReportBuilder(15);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(15)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(15)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(15)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/P[1]/A[1], element=Element{node=[A: null], tag=A, text=Edit text zone, attributes={evlist=false, href=/claroline11110/claroline/admin/managing/editFile.php?cmd=rqEdit&file=textzone_messaging_top.inc.html}}, source=HybridStateVertexImpl{id=15, name=state15}, target=HybridStateVertexImpl{id=17, name=state17}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/FORM[1]/INPUT[1]"), "ywEZYilg"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(16), "Event fired: Edit text zone");
			testSuiteHelper.runInCrawlingPlugins(17);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 17");

			testSuiteHelper.addStateToReportBuilder(17);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(17)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(17)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(17)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/SPAN[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/DIV[1]/SPAN[1]/TABLE[1]/TBODY[1]/TR[1]/TD[4]/SPAN[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/A[1], element=Element{node=[A: null], tag=A, text=Format, attributes={class=mceText, evlist=false, href=javascript:;, id=textContent_formatselect_text, onclick=return false;, onmousedown=return false;, tabindex=-1}}, source=HybridStateVertexImpl{id=17, name=state17}, target=HybridStateVertexImpl{id=63, name=state63}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1000006), "Event fired: Format");
			testSuiteHelper.runInCrawlingPlugins(63);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 63");

			testSuiteHelper.addStateToReportBuilder(63);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(63)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(63)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(63)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/SPAN[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/DIV[1]/SPAN[1]/TABLE[2]/TBODY[1]/TR[1]/TD[18]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[2]/A[1], element=Element{node=[A: null], tag=A, text=▼, attributes={anyaccess=none, class=mceOpen mce_forecolor, evlist=false, href=javascript:;, id=textContent_forecolor_open, onclick=return false;, onmousedown=return false;, role=button, tabindex=-1, title=Select Text Color}}, source=HybridStateVertexImpl{id=63, name=state63}, target=HybridStateVertexImpl{id=64, name=state64}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1000007), "Event fired: ▼");
			testSuiteHelper.runInCrawlingPlugins(64);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 64");

			testSuiteHelper.addStateToReportBuilder(64);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(64)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(64)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(64)
					&& allStatesIdentical;	
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=17)
	public void method_BT17_path_14_16_118(){
		testSuiteHelper.newCurrentTestMethod("method_BT17_path_14_16_118", 17);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(13);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(13)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(13)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(13)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[2]/SPAN[1]/A[1], element=Element{node=[A: null], tag=A, text=My messages, attributes={evlist=false, href=/claroline11110/claroline/messaging, target=_top}}, source=HybridStateVertexImpl{id=13, name=state13}, target=HybridStateVertexImpl{id=15, name=state15}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(14), "Event fired: My messages");
			testSuiteHelper.runInCrawlingPlugins(15);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 15");

			testSuiteHelper.addStateToReportBuilder(15);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(15)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(15)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(15)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/P[1]/A[1], element=Element{node=[A: null], tag=A, text=Edit text zone, attributes={evlist=false, href=/claroline11110/claroline/admin/managing/editFile.php?cmd=rqEdit&file=textzone_messaging_top.inc.html}}, source=HybridStateVertexImpl{id=15, name=state15}, target=HybridStateVertexImpl{id=17, name=state17}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/FORM[1]/INPUT[1]"), "ywEZYilg"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(16), "Event fired: Edit text zone");
			testSuiteHelper.runInCrawlingPlugins(17);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 17");

			testSuiteHelper.addStateToReportBuilder(17);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(17)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(17)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(17)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/SPAN[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/DIV[1]/SPAN[1]/TABLE[1]/TBODY[1]/TR[1]/TD[6]/A[1], element=Element{node=[A: null], tag=A, text=Bold (Ctrl+B), attributes={aria-labelledby=textContent_bold_voice, class=mceButton mceButtonEnabled mce_bold, evlist=false, href=javascript:;, id=textContent_bold, onclick=return false;, onmousedown=return false;, role=button, tabindex=-1, title=Bold (Ctrl+B)}}, source=HybridStateVertexImpl{id=17, name=state17}, target=HybridStateVertexImpl{id=18, name=state18}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(118), "Event fired: Bold (Ctrl+B)");
			testSuiteHelper.runInCrawlingPlugins(18);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 18");

			testSuiteHelper.addStateToReportBuilder(18);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(18)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(18)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(18)
					&& allStatesIdentical;	
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=18)
	public void method_BT77_path_56_58_60_62_65_120(){
		testSuiteHelper.newCurrentTestMethod("method_BT77_path_56_58_60_62_65_120", 18);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(13);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(13)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(13)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(13)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[3]/SPAN[1]/A[1], element=Element{node=[A: null], tag=A, text=Platform administration, attributes={evlist=false, href=/claroline11110/claroline/admin/, target=_top}}, source=HybridStateVertexImpl{id=13, name=state13}, target=HybridStateVertexImpl{id=68, name=state68}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(56), "Event fired: Platform administration");
			testSuiteHelper.runInCrawlingPlugins(68);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 68");

			testSuiteHelper.addStateToReportBuilder(68);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(68)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(68)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(68)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/UL[1]/LI[1]/UL[1]/LI[1]/FORM[1]/SMALL[1]/A[1], element=Element{node=[A: null], tag=A, text=Advanced, attributes={evlist=false, href=advanced_user_search.php}}, source=HybridStateVertexImpl{id=68, name=state68}, target=HybridStateVertexImpl{id=70, name=state70}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/UL[1]/LI[1]/UL[1]/LI[1]/FORM[1]/INPUT[1]"), "EewRXilN"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/UL[1]/LI[2]/UL[1]/LI[1]/FORM[1]/INPUT[1]"), "EIRqChgC"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(58), "Event fired: Advanced");
			testSuiteHelper.runInCrawlingPlugins(70);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 70");

			testSuiteHelper.addStateToReportBuilder(70);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(70)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(70)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(70)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/TABLE[1]/TBODY[1]/TR[7]/TD[2]/INPUT[1], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={class=claroButton, evlist=false, type=submit, value=Search user}}, source=HybridStateVertexImpl{id=70, name=state70}, target=HybridStateVertexImpl{id=72, name=state72}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/TABLE[1]/TBODY[1]/TR[1]/TD[2]/INPUT[1]"), "nAdRVyJU"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/TABLE[1]/TBODY[1]/TR[2]/TD[2]/INPUT[1]"), "TrsDlXDK"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/TABLE[1]/TBODY[1]/TR[3]/TD[2]/INPUT[1]"), "IWmJjRbh"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/TABLE[1]/TBODY[1]/TR[4]/TD[2]/INPUT[1]"), "IJKQpwAr"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/TABLE[1]/TBODY[1]/TR[5]/TD[2]/INPUT[1]"), "IFNMQfjY"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/TABLE[1]/TBODY[1]/TR[6]/TD[2]/SELECT[1]"), "Student"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(60), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(72);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 72");

			testSuiteHelper.addStateToReportBuilder(72);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(72)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(72)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(72)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[2]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Create user, attributes={evlist=false, href=adminaddnewuser.php, style=background-image: url(/claroline11110/web/img/user.png?1232376376); background-repeat: no-repeat; background-position: left center; padding-left: 20px;}}, source=HybridStateVertexImpl{id=72, name=state72}, target=HybridStateVertexImpl{id=74, name=state74}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/FORM[1]/INPUT[1]"), "asrVxCIK"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(62), "Event fired: Create user");
			testSuiteHelper.runInCrawlingPlugins(74);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 74");

			testSuiteHelper.addStateToReportBuilder(74);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(74)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(74)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(74)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/DL[1]/DT[1]/INPUT[1], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={evlist=false, id=applyChange, name=applyChange, type=submit, value=Ok}}, source=HybridStateVertexImpl{id=74, name=state74}, target=HybridStateVertexImpl{id=77, name=state77}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DL[1]/DD[1]/INPUT[1]"), "Stocco"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DL[1]/DD[2]/INPUT[1]"), "Andrea"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DL[1]/DD[3]/INPUT[1]"), "IxIwARIS"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[2]/DL[1]/DD[2]/INPUT[1]"), "UzMJCeqR"));
			formInputs.add(new FormInput(FormInput.InputType.PASSWORD, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[2]/DL[1]/DD[3]/INPUT[1]"), "admin"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[3]/DL[1]/DD[1]/INPUT[1]"), "astocco@ece.ubc.ca"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[3]/DL[1]/DD[2]/INPUT[1]"), "sbuaTwBF"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[3]/DL[1]/DD[3]/INPUT[1]"), "wcIpBTBE"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[4]/DL[1]/DD[1]/INPUT[1]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[4]/DL[1]/DD[1]/INPUT[2]"), "0"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[4]/DL[1]/DD[1]/SPAN[1]/INPUT[1]"), "0"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[2]/DL[1]/DD[5]/SELECT[1]"), "claroline"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(65), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(77);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 77");

			testSuiteHelper.addStateToReportBuilder(77);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(77)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(77)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(77)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/DL[1]/DT[1]/A[1]/INPUT[1], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={anyaccess=none, evlist=false, onclick=document.location='http://localhost:3000/claroline11110/claroline/admin/adminaddnewuser.php';return false, type=button, value=Cancel}}, source=HybridStateVertexImpl{id=77, name=state77}, target=HybridStateVertexImpl{id=74, name=state74}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DL[1]/DD[1]/INPUT[1]"), "Stocco"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DL[1]/DD[2]/INPUT[1]"), "Andrea"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DL[1]/DD[3]/INPUT[1]"), "mirRmFnx"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[2]/DL[1]/DD[2]/INPUT[1]"), "hkbSeSTb"));
			formInputs.add(new FormInput(FormInput.InputType.PASSWORD, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[2]/DL[1]/DD[3]/INPUT[1]"), "admin"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[3]/DL[1]/DD[1]/INPUT[1]"), "astocco@ece.ubc.ca"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[3]/DL[1]/DD[2]/INPUT[1]"), "wjtNCYHr"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[3]/DL[1]/DD[3]/INPUT[1]"), "scbETKMw"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[4]/DL[1]/DD[1]/INPUT[1]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[4]/DL[1]/DD[1]/INPUT[2]"), "0"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[4]/DL[1]/DD[1]/SPAN[1]/INPUT[1]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[2]/DL[1]/DD[5]/SELECT[1]"), "temp"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(120), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(74);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 74");

			testSuiteHelper.addStateToReportBuilder(74);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(74)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(74)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(74)
					&& allStatesIdentical;	
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=19)
	public void method_BT64_path_14_16_1000006_1000007_dup1(){
		testSuiteHelper.newCurrentTestMethod("method_BT64_path_14_16_1000006_1000007_dup1", 19);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(13);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(13)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(13)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(13)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[2]/SPAN[1]/A[1], element=Element{node=[A: null], tag=A, text=My messages, attributes={evlist=false, href=/claroline11110/claroline/messaging, target=_top}}, source=HybridStateVertexImpl{id=13, name=state13}, target=HybridStateVertexImpl{id=15, name=state15}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(14), "Event fired: My messages");
			testSuiteHelper.runInCrawlingPlugins(15);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 15");

			testSuiteHelper.addStateToReportBuilder(15);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(15)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(15)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(15)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/P[1]/A[1], element=Element{node=[A: null], tag=A, text=Edit text zone, attributes={evlist=false, href=/claroline11110/claroline/admin/managing/editFile.php?cmd=rqEdit&file=textzone_messaging_top.inc.html}}, source=HybridStateVertexImpl{id=15, name=state15}, target=HybridStateVertexImpl{id=17, name=state17}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/FORM[1]/INPUT[1]"), "ywEZYilg"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(16), "Event fired: Edit text zone");
			testSuiteHelper.runInCrawlingPlugins(17);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 17");

			testSuiteHelper.addStateToReportBuilder(17);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(17)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(17)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(17)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/SPAN[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/DIV[1]/SPAN[1]/TABLE[1]/TBODY[1]/TR[1]/TD[4]/SPAN[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/A[1], element=Element{node=[A: null], tag=A, text=Format, attributes={class=mceText, evlist=false, href=javascript:;, id=textContent_formatselect_text, onclick=return false;, onmousedown=return false;, tabindex=-1}}, source=HybridStateVertexImpl{id=17, name=state17}, target=HybridStateVertexImpl{id=63, name=state63}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1000006), "Event fired: Format");
			testSuiteHelper.runInCrawlingPlugins(63);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 63");

			testSuiteHelper.addStateToReportBuilder(63);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(63)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(63)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(63)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/SPAN[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/DIV[1]/SPAN[1]/TABLE[2]/TBODY[1]/TR[1]/TD[18]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[2]/A[1], element=Element{node=[A: null], tag=A, text=▼, attributes={anyaccess=none, class=mceOpen mce_forecolor, evlist=false, href=javascript:;, id=textContent_forecolor_open, onclick=return false;, onmousedown=return false;, role=button, tabindex=-1, title=Select Text Color}}, source=HybridStateVertexImpl{id=63, name=state63}, target=HybridStateVertexImpl{id=64, name=state64}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1000007), "Event fired: ▼");
			testSuiteHelper.runInCrawlingPlugins(64);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 64");

			testSuiteHelper.addStateToReportBuilder(64);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(64)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(64)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(64)
					&& allStatesIdentical;	
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=20)
	public void method_BT64_path_14_16_1000006_1000007_dup2(){
		testSuiteHelper.newCurrentTestMethod("method_BT64_path_14_16_1000006_1000007_dup2", 20);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(13);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(13)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(13)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(13)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[2]/SPAN[1]/A[1], element=Element{node=[A: null], tag=A, text=My messages, attributes={evlist=false, href=/claroline11110/claroline/messaging, target=_top}}, source=HybridStateVertexImpl{id=13, name=state13}, target=HybridStateVertexImpl{id=15, name=state15}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(14), "Event fired: My messages");
			testSuiteHelper.runInCrawlingPlugins(15);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 15");

			testSuiteHelper.addStateToReportBuilder(15);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(15)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(15)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(15)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/P[1]/A[1], element=Element{node=[A: null], tag=A, text=Edit text zone, attributes={evlist=false, href=/claroline11110/claroline/admin/managing/editFile.php?cmd=rqEdit&file=textzone_messaging_top.inc.html}}, source=HybridStateVertexImpl{id=15, name=state15}, target=HybridStateVertexImpl{id=17, name=state17}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/FORM[1]/INPUT[1]"), "ywEZYilg"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(16), "Event fired: Edit text zone");
			testSuiteHelper.runInCrawlingPlugins(17);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 17");

			testSuiteHelper.addStateToReportBuilder(17);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(17)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(17)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(17)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/SPAN[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/DIV[1]/SPAN[1]/TABLE[1]/TBODY[1]/TR[1]/TD[4]/SPAN[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/A[1], element=Element{node=[A: null], tag=A, text=Format, attributes={class=mceText, evlist=false, href=javascript:;, id=textContent_formatselect_text, onclick=return false;, onmousedown=return false;, tabindex=-1}}, source=HybridStateVertexImpl{id=17, name=state17}, target=HybridStateVertexImpl{id=63, name=state63}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1000006), "Event fired: Format");
			testSuiteHelper.runInCrawlingPlugins(63);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 63");

			testSuiteHelper.addStateToReportBuilder(63);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(63)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(63)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(63)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/SPAN[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/DIV[1]/SPAN[1]/TABLE[2]/TBODY[1]/TR[1]/TD[18]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[2]/A[1], element=Element{node=[A: null], tag=A, text=▼, attributes={anyaccess=none, class=mceOpen mce_forecolor, evlist=false, href=javascript:;, id=textContent_forecolor_open, onclick=return false;, onmousedown=return false;, role=button, tabindex=-1, title=Select Text Color}}, source=HybridStateVertexImpl{id=63, name=state63}, target=HybridStateVertexImpl{id=64, name=state64}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1000007), "Event fired: ▼");
			testSuiteHelper.runInCrawlingPlugins(64);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 64");

			testSuiteHelper.addStateToReportBuilder(64);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(64)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(64)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(64)
					&& allStatesIdentical;	
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=21)
	public void method_BT64_path_14_16_1000006_1000007_dup3(){
		testSuiteHelper.newCurrentTestMethod("method_BT64_path_14_16_1000006_1000007_dup3", 21);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(13);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(13)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(13)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(13)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[2]/SPAN[1]/A[1], element=Element{node=[A: null], tag=A, text=My messages, attributes={evlist=false, href=/claroline11110/claroline/messaging, target=_top}}, source=HybridStateVertexImpl{id=13, name=state13}, target=HybridStateVertexImpl{id=15, name=state15}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(14), "Event fired: My messages");
			testSuiteHelper.runInCrawlingPlugins(15);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 15");

			testSuiteHelper.addStateToReportBuilder(15);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(15)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(15)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(15)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/P[1]/A[1], element=Element{node=[A: null], tag=A, text=Edit text zone, attributes={evlist=false, href=/claroline11110/claroline/admin/managing/editFile.php?cmd=rqEdit&file=textzone_messaging_top.inc.html}}, source=HybridStateVertexImpl{id=15, name=state15}, target=HybridStateVertexImpl{id=17, name=state17}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/FORM[1]/INPUT[1]"), "ywEZYilg"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(16), "Event fired: Edit text zone");
			testSuiteHelper.runInCrawlingPlugins(17);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 17");

			testSuiteHelper.addStateToReportBuilder(17);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(17)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(17)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(17)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/SPAN[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/DIV[1]/SPAN[1]/TABLE[1]/TBODY[1]/TR[1]/TD[4]/SPAN[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/A[1], element=Element{node=[A: null], tag=A, text=Format, attributes={class=mceText, evlist=false, href=javascript:;, id=textContent_formatselect_text, onclick=return false;, onmousedown=return false;, tabindex=-1}}, source=HybridStateVertexImpl{id=17, name=state17}, target=HybridStateVertexImpl{id=63, name=state63}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1000006), "Event fired: Format");
			testSuiteHelper.runInCrawlingPlugins(63);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 63");

			testSuiteHelper.addStateToReportBuilder(63);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(63)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(63)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(63)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/SPAN[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/DIV[1]/SPAN[1]/TABLE[2]/TBODY[1]/TR[1]/TD[18]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[2]/A[1], element=Element{node=[A: null], tag=A, text=▼, attributes={anyaccess=none, class=mceOpen mce_forecolor, evlist=false, href=javascript:;, id=textContent_forecolor_open, onclick=return false;, onmousedown=return false;, role=button, tabindex=-1, title=Select Text Color}}, source=HybridStateVertexImpl{id=63, name=state63}, target=HybridStateVertexImpl{id=64, name=state64}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1000007), "Event fired: ▼");
			testSuiteHelper.runInCrawlingPlugins(64);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 64");

			testSuiteHelper.addStateToReportBuilder(64);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(64)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(64)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(64)
					&& allStatesIdentical;	
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=22)
	public void method_BT13_path_126(){
		testSuiteHelper.newCurrentTestMethod("method_BT13_path_126", 22);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(13);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(13)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(13)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(13)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/P[5]/A[1], element=Element{node=[A: null], tag=A, text=Manage my account, attributes={class=claroCmd, evlist=false, href=/claroline11110/claroline/auth/profile.php}}, source=HybridStateVertexImpl{id=13, name=state13}, target=HybridStateVertexImpl{id=81, name=state81}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(126), "Event fired: Manage my account");
			testSuiteHelper.runInCrawlingPlugins(81);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 81");

			testSuiteHelper.addStateToReportBuilder(81);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(81)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(81)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(81)
					&& allStatesIdentical;	
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=23)
	public void method_BT17_path_14_16_127(){
		testSuiteHelper.newCurrentTestMethod("method_BT17_path_14_16_127", 23);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(13);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(13)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(13)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(13)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[2]/SPAN[1]/A[1], element=Element{node=[A: null], tag=A, text=My messages, attributes={evlist=false, href=/claroline11110/claroline/messaging, target=_top}}, source=HybridStateVertexImpl{id=13, name=state13}, target=HybridStateVertexImpl{id=15, name=state15}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(14), "Event fired: My messages");
			testSuiteHelper.runInCrawlingPlugins(15);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 15");

			testSuiteHelper.addStateToReportBuilder(15);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(15)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(15)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(15)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/P[1]/A[1], element=Element{node=[A: null], tag=A, text=Edit text zone, attributes={evlist=false, href=/claroline11110/claroline/admin/managing/editFile.php?cmd=rqEdit&file=textzone_messaging_top.inc.html}}, source=HybridStateVertexImpl{id=15, name=state15}, target=HybridStateVertexImpl{id=17, name=state17}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/FORM[1]/INPUT[1]"), "ywEZYilg"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(16), "Event fired: Edit text zone");
			testSuiteHelper.runInCrawlingPlugins(17);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 17");

			testSuiteHelper.addStateToReportBuilder(17);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(17)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(17)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(17)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/SPAN[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/DIV[1]/SPAN[1]/TABLE[1]/TBODY[1]/TR[1]/TD[7]/A[1], element=Element{node=[A: null], tag=A, text=Italic (Ctrl+I), attributes={aria-labelledby=textContent_italic_voice, class=mceButton mceButtonEnabled mce_italic, evlist=false, href=javascript:;, id=textContent_italic, onclick=return false;, onmousedown=return false;, role=button, tabindex=-1, title=Italic (Ctrl+I)}}, source=HybridStateVertexImpl{id=17, name=state17}, target=HybridStateVertexImpl{id=18, name=state18}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(127), "Event fired: Italic (Ctrl+I)");
			testSuiteHelper.runInCrawlingPlugins(18);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 18");

			testSuiteHelper.addStateToReportBuilder(18);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(18)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(18)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(18)
					&& allStatesIdentical;	
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=24)
	public void method_BT64_path_14_16_1000006_1000007_dup4(){
		testSuiteHelper.newCurrentTestMethod("method_BT64_path_14_16_1000006_1000007_dup4", 24);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(13);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(13)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(13)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(13)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[2]/SPAN[1]/A[1], element=Element{node=[A: null], tag=A, text=My messages, attributes={evlist=false, href=/claroline11110/claroline/messaging, target=_top}}, source=HybridStateVertexImpl{id=13, name=state13}, target=HybridStateVertexImpl{id=15, name=state15}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(14), "Event fired: My messages");
			testSuiteHelper.runInCrawlingPlugins(15);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 15");

			testSuiteHelper.addStateToReportBuilder(15);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(15)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(15)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(15)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/P[1]/A[1], element=Element{node=[A: null], tag=A, text=Edit text zone, attributes={evlist=false, href=/claroline11110/claroline/admin/managing/editFile.php?cmd=rqEdit&file=textzone_messaging_top.inc.html}}, source=HybridStateVertexImpl{id=15, name=state15}, target=HybridStateVertexImpl{id=17, name=state17}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/FORM[1]/INPUT[1]"), "ywEZYilg"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(16), "Event fired: Edit text zone");
			testSuiteHelper.runInCrawlingPlugins(17);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 17");

			testSuiteHelper.addStateToReportBuilder(17);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(17)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(17)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(17)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/SPAN[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/DIV[1]/SPAN[1]/TABLE[1]/TBODY[1]/TR[1]/TD[4]/SPAN[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/A[1], element=Element{node=[A: null], tag=A, text=Format, attributes={class=mceText, evlist=false, href=javascript:;, id=textContent_formatselect_text, onclick=return false;, onmousedown=return false;, tabindex=-1}}, source=HybridStateVertexImpl{id=17, name=state17}, target=HybridStateVertexImpl{id=63, name=state63}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1000006), "Event fired: Format");
			testSuiteHelper.runInCrawlingPlugins(63);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 63");

			testSuiteHelper.addStateToReportBuilder(63);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(63)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(63)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(63)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/SPAN[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/DIV[1]/SPAN[1]/TABLE[2]/TBODY[1]/TR[1]/TD[18]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[2]/A[1], element=Element{node=[A: null], tag=A, text=▼, attributes={anyaccess=none, class=mceOpen mce_forecolor, evlist=false, href=javascript:;, id=textContent_forecolor_open, onclick=return false;, onmousedown=return false;, role=button, tabindex=-1, title=Select Text Color}}, source=HybridStateVertexImpl{id=63, name=state63}, target=HybridStateVertexImpl{id=64, name=state64}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1000007), "Event fired: ▼");
			testSuiteHelper.runInCrawlingPlugins(64);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 64");

			testSuiteHelper.addStateToReportBuilder(64);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(64)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(64)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(64)
					&& allStatesIdentical;	
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=25)
	public void method_BT64_path_14_16_1000006_1000007_130(){
		testSuiteHelper.newCurrentTestMethod("method_BT64_path_14_16_1000006_1000007_130", 25);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(13);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(13)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(13)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(13)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[2]/SPAN[1]/A[1], element=Element{node=[A: null], tag=A, text=My messages, attributes={evlist=false, href=/claroline11110/claroline/messaging, target=_top}}, source=HybridStateVertexImpl{id=13, name=state13}, target=HybridStateVertexImpl{id=15, name=state15}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(14), "Event fired: My messages");
			testSuiteHelper.runInCrawlingPlugins(15);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 15");

			testSuiteHelper.addStateToReportBuilder(15);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(15)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(15)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(15)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/P[1]/A[1], element=Element{node=[A: null], tag=A, text=Edit text zone, attributes={evlist=false, href=/claroline11110/claroline/admin/managing/editFile.php?cmd=rqEdit&file=textzone_messaging_top.inc.html}}, source=HybridStateVertexImpl{id=15, name=state15}, target=HybridStateVertexImpl{id=17, name=state17}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/FORM[1]/INPUT[1]"), "ywEZYilg"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(16), "Event fired: Edit text zone");
			testSuiteHelper.runInCrawlingPlugins(17);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 17");

			testSuiteHelper.addStateToReportBuilder(17);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(17)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(17)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(17)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/SPAN[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/DIV[1]/SPAN[1]/TABLE[1]/TBODY[1]/TR[1]/TD[4]/SPAN[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/A[1], element=Element{node=[A: null], tag=A, text=Format, attributes={class=mceText, evlist=false, href=javascript:;, id=textContent_formatselect_text, onclick=return false;, onmousedown=return false;, tabindex=-1}}, source=HybridStateVertexImpl{id=17, name=state17}, target=HybridStateVertexImpl{id=63, name=state63}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1000006), "Event fired: Format");
			testSuiteHelper.runInCrawlingPlugins(63);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 63");

			testSuiteHelper.addStateToReportBuilder(63);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(63)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(63)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(63)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/SPAN[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/DIV[1]/SPAN[1]/TABLE[2]/TBODY[1]/TR[1]/TD[18]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[2]/A[1], element=Element{node=[A: null], tag=A, text=▼, attributes={anyaccess=none, class=mceOpen mce_forecolor, evlist=false, href=javascript:;, id=textContent_forecolor_open, onclick=return false;, onmousedown=return false;, role=button, tabindex=-1, title=Select Text Color}}, source=HybridStateVertexImpl{id=63, name=state63}, target=HybridStateVertexImpl{id=64, name=state64}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1000007), "Event fired: ▼");
			testSuiteHelper.runInCrawlingPlugins(64);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 64");

			testSuiteHelper.addStateToReportBuilder(64);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(64)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(64)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(64)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[3]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={data-mce-color=#000000, evlist=false, href=javascript:;, id=_mce_item_22, role=option, style=background-color: rgb(0, 0, 0);, tabindex=0, title=Black}}, source=HybridStateVertexImpl{id=64, name=state64}, target=HybridStateVertexImpl{id=212, name=state212}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(130), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(212);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 212");

			testSuiteHelper.addStateToReportBuilder(212);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(212)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(212)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(212)
					&& allStatesIdentical;	
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=26)
	public void method_BT89_path_75_76(){
		testSuiteHelper.newCurrentTestMethod("method_BT89_path_75_76", 26);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(13);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(13)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(13)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(13)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[2]/DIV[2]/UL[1]/LI[3]/SPAN[1]/A[1], element=Element{node=[A: null], tag=A, text=Logout, attributes={evlist=false, href=/claroline11110/index.php?logout=true, target=_top}}, source=HybridStateVertexImpl{id=13, name=state13}, target=HybridStateVertexImpl{id=0, name=index}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(75), "Event fired: Logout");
			testSuiteHelper.runInCrawlingPlugins(0);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 0");

			testSuiteHelper.addStateToReportBuilder(0);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(0)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(0)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(0)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Search, attributes={evlist=false, type=submit}}, source=HybridStateVertexImpl{id=0, name=index}, target=HybridStateVertexImpl{id=89, name=state89}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/FORM[1]/FIELDSET[1]/INPUT[1]"), "admin"));
			formInputs.add(new FormInput(FormInput.InputType.PASSWORD, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/FORM[1]/FIELDSET[1]/INPUT[2]"), "admin"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/FORM[1]/INPUT[1]"), "FYZriZLP"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(76), "Event fired: Search");
			testSuiteHelper.runInCrawlingPlugins(89);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 89");

			testSuiteHelper.addStateToReportBuilder(89);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(89)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(89)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(89)
					&& allStatesIdentical;	
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=27)
	public void method_BT3_path_2_133(){
		testSuiteHelper.newCurrentTestMethod("method_BT3_path_2_133", 27);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(0);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(0)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(0)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(0)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[1]/SPAN[1]/A[1], element=Element{node=[A: null], tag=A, text=Login, attributes={evlist=false, href=/claroline11110/claroline/auth/login.php?sourceUrl=aHR0cDovL2xvY2FsaG9zdDozMDAwL2NsYXJvbGluZTExMTEwLw%3D%3D, target=_top}}, source=HybridStateVertexImpl{id=0, name=index}, target=HybridStateVertexImpl{id=3, name=state3}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/FORM[1]/FIELDSET[1]/INPUT[1]"), "admin"));
			formInputs.add(new FormInput(FormInput.InputType.PASSWORD, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/FORM[1]/FIELDSET[1]/INPUT[2]"), "admin"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/FORM[1]/INPUT[1]"), "JPfdFFLi"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(2), "Event fired: Login");
			testSuiteHelper.runInCrawlingPlugins(3);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 3");

			testSuiteHelper.addStateToReportBuilder(3);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(3)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(3)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(3)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/FORM[1]/FIELDSET[1]/A[1]/INPUT[1], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={evlist=false, onclick=document.location='/claroline11110/claroline/';return false, type=button, value=Cancel}}, source=HybridStateVertexImpl{id=3, name=state3}, target=HybridStateVertexImpl{id=0, name=index}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/FORM[1]/FIELDSET[1]/INPUT[4]"), "admin"));
			formInputs.add(new FormInput(FormInput.InputType.PASSWORD, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/FORM[1]/FIELDSET[1]/INPUT[5]"), "admin"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(133), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(0);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 0");

			testSuiteHelper.addStateToReportBuilder(0);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(0)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(0)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(0)
					&& allStatesIdentical;	
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=28)
	public void method_BT64_path_12_14_16_1000006_1000007_134(){
		testSuiteHelper.newCurrentTestMethod("method_BT64_path_12_14_16_1000006_1000007_134", 28);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(0);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(0)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(0)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(0)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/FORM[1]/FIELDSET[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Enter, attributes={evlist=false, tabindex=3, type=submit}}, source=HybridStateVertexImpl{id=0, name=index}, target=HybridStateVertexImpl{id=13, name=state13}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/FORM[1]/FIELDSET[1]/INPUT[1]"), "admin"));
			formInputs.add(new FormInput(FormInput.InputType.PASSWORD, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/FORM[1]/FIELDSET[1]/INPUT[2]"), "admin"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/FORM[1]/INPUT[1]"), "YZWkUHaV"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(12), "Event fired: Enter");
			testSuiteHelper.runInCrawlingPlugins(13);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 13");

			testSuiteHelper.addStateToReportBuilder(13);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(13)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(13)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(13)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[2]/SPAN[1]/A[1], element=Element{node=[A: null], tag=A, text=My messages, attributes={evlist=false, href=/claroline11110/claroline/messaging, target=_top}}, source=HybridStateVertexImpl{id=13, name=state13}, target=HybridStateVertexImpl{id=15, name=state15}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(14), "Event fired: My messages");
			testSuiteHelper.runInCrawlingPlugins(15);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 15");

			testSuiteHelper.addStateToReportBuilder(15);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(15)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(15)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(15)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/P[1]/A[1], element=Element{node=[A: null], tag=A, text=Edit text zone, attributes={evlist=false, href=/claroline11110/claroline/admin/managing/editFile.php?cmd=rqEdit&file=textzone_messaging_top.inc.html}}, source=HybridStateVertexImpl{id=15, name=state15}, target=HybridStateVertexImpl{id=17, name=state17}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/FORM[1]/INPUT[1]"), "ywEZYilg"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(16), "Event fired: Edit text zone");
			testSuiteHelper.runInCrawlingPlugins(17);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 17");

			testSuiteHelper.addStateToReportBuilder(17);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(17)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(17)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(17)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/SPAN[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/DIV[1]/SPAN[1]/TABLE[1]/TBODY[1]/TR[1]/TD[4]/SPAN[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/A[1], element=Element{node=[A: null], tag=A, text=Format, attributes={class=mceText, evlist=false, href=javascript:;, id=textContent_formatselect_text, onclick=return false;, onmousedown=return false;, tabindex=-1}}, source=HybridStateVertexImpl{id=17, name=state17}, target=HybridStateVertexImpl{id=63, name=state63}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1000006), "Event fired: Format");
			testSuiteHelper.runInCrawlingPlugins(63);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 63");

			testSuiteHelper.addStateToReportBuilder(63);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(63)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(63)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(63)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/SPAN[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/DIV[1]/SPAN[1]/TABLE[2]/TBODY[1]/TR[1]/TD[18]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[2]/A[1], element=Element{node=[A: null], tag=A, text=▼, attributes={anyaccess=none, class=mceOpen mce_forecolor, evlist=false, href=javascript:;, id=textContent_forecolor_open, onclick=return false;, onmousedown=return false;, role=button, tabindex=-1, title=Select Text Color}}, source=HybridStateVertexImpl{id=63, name=state63}, target=HybridStateVertexImpl{id=64, name=state64}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1000007), "Event fired: ▼");
			testSuiteHelper.runInCrawlingPlugins(64);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 64");

			testSuiteHelper.addStateToReportBuilder(64);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(64)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(64)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(64)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[3]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[2]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={data-mce-color=#993300, evlist=false, href=javascript:;, id=_mce_item_23, role=option, style=background-color: rgb(153, 51, 0);, tabindex=-1, title=Burnt orange}}, source=HybridStateVertexImpl{id=64, name=state64}, target=HybridStateVertexImpl{id=212, name=state212}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(134), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(212);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 212");

			testSuiteHelper.addStateToReportBuilder(212);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(212)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(212)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(212)
					&& allStatesIdentical;	
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=29)
	public void method_BT6_path_75_5_137(){
		testSuiteHelper.newCurrentTestMethod("method_BT6_path_75_5_137", 29);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(13);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(13)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(13)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(13)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[2]/DIV[2]/UL[1]/LI[3]/SPAN[1]/A[1], element=Element{node=[A: null], tag=A, text=Logout, attributes={evlist=false, href=/claroline11110/index.php?logout=true, target=_top}}, source=HybridStateVertexImpl{id=13, name=state13}, target=HybridStateVertexImpl{id=0, name=index}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(75), "Event fired: Logout");
			testSuiteHelper.runInCrawlingPlugins(0);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 0");

			testSuiteHelper.addStateToReportBuilder(0);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(0)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(0)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(0)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/P[1]/A[1], element=Element{node=[A: null], tag=A, text=Lost password, attributes={evlist=false, href=/claroline11110/claroline/auth/lostPassword.php}}, source=HybridStateVertexImpl{id=0, name=index}, target=HybridStateVertexImpl{id=6, name=state6}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/FORM[1]/FIELDSET[1]/INPUT[1]"), "admin"));
			formInputs.add(new FormInput(FormInput.InputType.PASSWORD, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/FORM[1]/FIELDSET[1]/INPUT[2]"), "admin"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/FORM[1]/INPUT[1]"), "TCAitBQO"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(5), "Event fired: Lost password");
			testSuiteHelper.runInCrawlingPlugins(6);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 6");

			testSuiteHelper.addStateToReportBuilder(6);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(6)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(6)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(6)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[2]/FORM[1]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={evlist=false, href=/claroline11110/index.php}}, source=HybridStateVertexImpl{id=6, name=state6}, target=HybridStateVertexImpl{id=0, name=index}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[2]/FORM[1]/INPUT[2]"), "vTdDbZaS"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(137), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(0);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 0");

			testSuiteHelper.addStateToReportBuilder(0);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(0)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(0)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(0)
					&& allStatesIdentical;	
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=30)
	public void method_BT96_path_12_68_83_139(){
		testSuiteHelper.newCurrentTestMethod("method_BT96_path_12_68_83_139", 30);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(0);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(0)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(0)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(0)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/FORM[1]/FIELDSET[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Enter, attributes={evlist=false, tabindex=3, type=submit}}, source=HybridStateVertexImpl{id=0, name=index}, target=HybridStateVertexImpl{id=13, name=state13}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/FORM[1]/FIELDSET[1]/INPUT[1]"), "admin"));
			formInputs.add(new FormInput(FormInput.InputType.PASSWORD, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/FORM[1]/FIELDSET[1]/INPUT[2]"), "admin"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/FORM[1]/INPUT[1]"), "YZWkUHaV"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(12), "Event fired: Enter");
			testSuiteHelper.runInCrawlingPlugins(13);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 13");

			testSuiteHelper.addStateToReportBuilder(13);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(13)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(13)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(13)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[2]/DIV[2]/UL[1]/LI[2]/SPAN[1]/A[1], element=Element{node=[A: null], tag=A, text=Manage my account, attributes={evlist=false, href=/claroline11110/claroline/auth/profile.php, target=_top}}, source=HybridStateVertexImpl{id=13, name=state13}, target=HybridStateVertexImpl{id=81, name=state81}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(68), "Event fired: Manage my account");
			testSuiteHelper.runInCrawlingPlugins(81);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 81");

			testSuiteHelper.addStateToReportBuilder(81);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(81)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(81)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(81)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/DL[1]/DT[1]/INPUT[1], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={evlist=false, id=applyChange, name=applyChange, type=submit, value=Ok}}, source=HybridStateVertexImpl{id=81, name=state81}, target=HybridStateVertexImpl{id=96, name=state96}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DL[1]/DD[1]/INPUT[1]"), "Stocco"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DL[1]/DD[2]/INPUT[1]"), "Andrea"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DL[1]/DD[3]/INPUT[1]"), "TUsXUvWM"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[2]/DL[1]/DD[2]/INPUT[1]"), "KLSjNzCi"));
			formInputs.add(new FormInput(FormInput.InputType.PASSWORD, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[2]/DL[1]/DD[5]/INPUT[1]"), "admin"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[3]/DL[1]/DD[1]/INPUT[1]"), "astocco@ece.ubc.ca"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[3]/DL[1]/DD[2]/INPUT[1]"), "SgfiHJIe"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[3]/DL[1]/DD[3]/INPUT[1]"), "zlSXQTKl"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[4]/DL[1]/DD[1]/INPUT[1]"), "0"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[4]/DL[1]/DD[1]/INPUT[2]"), "0"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[4]/DL[1]/DD[1]/SPAN[1]/INPUT[1]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[2]/DL[1]/DD[7]/SELECT[1]"), "temp"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(83), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(96);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 96");

			testSuiteHelper.addStateToReportBuilder(96);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(96)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(96)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(96)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/DL[1]/DT[1]/A[1]/INPUT[1], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={anyaccess=none, evlist=false, onclick=document.location='http://localhost:3000/claroline11110/claroline/auth/profile.php';return false, type=button, value=Cancel}}, source=HybridStateVertexImpl{id=96, name=state96}, target=HybridStateVertexImpl{id=81, name=state81}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DL[1]/DD[1]/INPUT[1]"), "Stocco"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DL[1]/DD[2]/INPUT[1]"), "Andrea"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DL[1]/DD[3]/INPUT[1]"), "JtnQscZb"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[2]/DL[1]/DD[2]/INPUT[1]"), "UOIdjIEK"));
			formInputs.add(new FormInput(FormInput.InputType.PASSWORD, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[2]/DL[1]/DD[5]/INPUT[1]"), "admin"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[3]/DL[1]/DD[1]/INPUT[1]"), "astocco@ece.ubc.ca"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[3]/DL[1]/DD[2]/INPUT[1]"), "fhrtDgop"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[3]/DL[1]/DD[3]/INPUT[1]"), "kkeaAoav"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[4]/DL[1]/DD[1]/INPUT[1]"), "0"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[4]/DL[1]/DD[1]/INPUT[2]"), "0"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[4]/DL[1]/DD[1]/SPAN[1]/INPUT[1]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[2]/DL[1]/DD[7]/SELECT[1]"), "temp"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(139), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(81);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 81");

			testSuiteHelper.addStateToReportBuilder(81);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(81)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(81)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(81)
					&& allStatesIdentical;	
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=31)
	public void method_BT68_path_56_140_150(){
		testSuiteHelper.newCurrentTestMethod("method_BT68_path_56_140_150", 31);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(13);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(13)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(13)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(13)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[3]/SPAN[1]/A[1], element=Element{node=[A: null], tag=A, text=Platform administration, attributes={evlist=false, href=/claroline11110/claroline/admin/, target=_top}}, source=HybridStateVertexImpl{id=13, name=state13}, target=HybridStateVertexImpl{id=68, name=state68}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(56), "Event fired: Platform administration");
			testSuiteHelper.runInCrawlingPlugins(68);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 68");

			testSuiteHelper.addStateToReportBuilder(68);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(68)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(68)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(68)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/UL[1]/LI[1]/UL[1]/LI[3]/A[1], element=Element{node=[A: null], tag=A, text=Send a message to all users, attributes={evlist=false, href=../messaging/sendmessage.php?cmd=rqMessageToAllUsers}}, source=HybridStateVertexImpl{id=68, name=state68}, target=HybridStateVertexImpl{id=240, name=state240}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/UL[1]/LI[1]/UL[1]/LI[1]/FORM[1]/INPUT[1]"), "CsBpUdKh"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/UL[1]/LI[2]/UL[1]/LI[1]/FORM[1]/INPUT[1]"), "KVKrEPXf"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(140), "Event fired: Send a message to all users");
			testSuiteHelper.runInCrawlingPlugins(240);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 240");

			testSuiteHelper.addStateToReportBuilder(240);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(240)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(240)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(240)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/SPAN[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/DIV[1]/SPAN[1]/TABLE[2]/TBODY[1]/TR[1]/TD[18]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/A[1], element=Element{node=[A: null], tag=A, text=Select Text Color, attributes={anyaccess=none, class=mceAction mce_forecolor, evlist=false, href=javascript:;, id=message_forecolor_action, onclick=return false;, onmousedown=return false;, role=button, tabindex=-1, title=Select Text Color}}, source=HybridStateVertexImpl{id=240, name=state240}, target=HybridStateVertexImpl{id=250, name=state250}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/INPUT[8]"), "uIaguBfb"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(150), "Event fired: Select Text Color");
			testSuiteHelper.runInCrawlingPlugins(250);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 250");

			testSuiteHelper.addStateToReportBuilder(250);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(250)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(250)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(250)
					&& allStatesIdentical;	
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=32)
	public void method_BT83_path_81_151_152_153_154(){
		testSuiteHelper.newCurrentTestMethod("method_BT83_path_81_151_152_153_154", 32);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(13);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(13)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(13)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(13)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/P[4]/A[1], element=Element{node=[A: null], tag=A, text=View my statistics, attributes={class=claroCmd, evlist=false, href=/claroline11110/claroline/tracking/userReport.php?userId=1}}, source=HybridStateVertexImpl{id=13, name=state13}, target=HybridStateVertexImpl{id=83, name=state83}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(81), "Event fired: View my statistics");
			testSuiteHelper.runInCrawlingPlugins(83);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 83");

			testSuiteHelper.addStateToReportBuilder(83);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(83)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(83)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(83)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[2]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Back to user list, attributes={evlist=false, href=/claroline11110/claroline/user/user.php, style=background-image: url(/claroline11110/web/img/back.png?1306428622); background-repeat: no-repeat; background-position: left center; padding-left: 20px;}}, source=HybridStateVertexImpl{id=83, name=state83}, target=HybridStateVertexImpl{id=253, name=state253}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(151), "Event fired: Back to user list");
			testSuiteHelper.runInCrawlingPlugins(253);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 253");

			testSuiteHelper.addStateToReportBuilder(253);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(253)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(253)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(253)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[3]/DIV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text= Claroline, attributes={evlist=false, href=/claroline11110/index.php, target=_top}}, source=HybridStateVertexImpl{id=253, name=state253}, target=HybridStateVertexImpl{id=13, name=state13}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(152), "Event fired:  Claroline");
			testSuiteHelper.runInCrawlingPlugins(13);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 13");

			testSuiteHelper.addStateToReportBuilder(13);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(13)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(13)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(13)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/P[2]/A[1], element=Element{node=[A: null], tag=A, text=Edit text zone, attributes={evlist=false, href=/claroline11110/claroline/admin/managing/editFile.php?cmd=rqEdit&file=textzone_right.inc.html}}, source=HybridStateVertexImpl{id=13, name=state13}, target=HybridStateVertexImpl{id=17, name=state17}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(153), "Event fired: Edit text zone");
			testSuiteHelper.runInCrawlingPlugins(17);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 17");

			testSuiteHelper.addStateToReportBuilder(17);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(17)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(17)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(17)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/SPAN[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/DIV[1]/SPAN[1]/TABLE[1]/TBODY[1]/TR[1]/TD[8]/A[1], element=Element{node=[A: null], tag=A, text=Underline (Ctrl+U), attributes={aria-labelledby=textContent_underline_voice, class=mceButton mceButtonEnabled mce_underline, evlist=false, href=javascript:;, id=textContent_underline, onclick=return false;, onmousedown=return false;, role=button, tabindex=-1, title=Underline (Ctrl+U)}}, source=HybridStateVertexImpl{id=17, name=state17}, target=HybridStateVertexImpl{id=18, name=state18}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(154), "Event fired: Underline (Ctrl+U)");
			testSuiteHelper.runInCrawlingPlugins(18);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 18");

			testSuiteHelper.addStateToReportBuilder(18);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(18)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(18)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(18)
					&& allStatesIdentical;	
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=33)
	public void method_BT64_path_153_1000006_1000007_155(){
		testSuiteHelper.newCurrentTestMethod("method_BT64_path_153_1000006_1000007_155", 33);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(13);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(13)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(13)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(13)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/P[2]/A[1], element=Element{node=[A: null], tag=A, text=Edit text zone, attributes={evlist=false, href=/claroline11110/claroline/admin/managing/editFile.php?cmd=rqEdit&file=textzone_right.inc.html}}, source=HybridStateVertexImpl{id=13, name=state13}, target=HybridStateVertexImpl{id=17, name=state17}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(153), "Event fired: Edit text zone");
			testSuiteHelper.runInCrawlingPlugins(17);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 17");

			testSuiteHelper.addStateToReportBuilder(17);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(17)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(17)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(17)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/SPAN[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/DIV[1]/SPAN[1]/TABLE[1]/TBODY[1]/TR[1]/TD[4]/SPAN[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/A[1], element=Element{node=[A: null], tag=A, text=Format, attributes={class=mceText, evlist=false, href=javascript:;, id=textContent_formatselect_text, onclick=return false;, onmousedown=return false;, tabindex=-1}}, source=HybridStateVertexImpl{id=17, name=state17}, target=HybridStateVertexImpl{id=63, name=state63}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1000006), "Event fired: Format");
			testSuiteHelper.runInCrawlingPlugins(63);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 63");

			testSuiteHelper.addStateToReportBuilder(63);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(63)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(63)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(63)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/SPAN[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/DIV[1]/SPAN[1]/TABLE[2]/TBODY[1]/TR[1]/TD[18]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[2]/A[1], element=Element{node=[A: null], tag=A, text=▼, attributes={anyaccess=none, class=mceOpen mce_forecolor, evlist=false, href=javascript:;, id=textContent_forecolor_open, onclick=return false;, onmousedown=return false;, role=button, tabindex=-1, title=Select Text Color}}, source=HybridStateVertexImpl{id=63, name=state63}, target=HybridStateVertexImpl{id=64, name=state64}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1000007), "Event fired: ▼");
			testSuiteHelper.runInCrawlingPlugins(64);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 64");

			testSuiteHelper.addStateToReportBuilder(64);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(64)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(64)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(64)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[3]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[3]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={data-mce-color=#333300, evlist=false, href=javascript:;, id=_mce_item_24, role=option, style=background-color: rgb(51, 51, 0);, tabindex=-1, title=Dark olive}}, source=HybridStateVertexImpl{id=64, name=state64}, target=HybridStateVertexImpl{id=212, name=state212}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(155), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(212);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 212");

			testSuiteHelper.addStateToReportBuilder(212);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(212)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(212)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(212)
					&& allStatesIdentical;	
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=34)
	public void method_BT114_path_75_9_90_158(){
		testSuiteHelper.newCurrentTestMethod("method_BT114_path_75_9_90_158", 34);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(13);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(13)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(13)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(13)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[2]/DIV[2]/UL[1]/LI[3]/SPAN[1]/A[1], element=Element{node=[A: null], tag=A, text=Logout, attributes={evlist=false, href=/claroline11110/index.php?logout=true, target=_top}}, source=HybridStateVertexImpl{id=13, name=state13}, target=HybridStateVertexImpl{id=0, name=index}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(75), "Event fired: Logout");
			testSuiteHelper.runInCrawlingPlugins(0);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 0");

			testSuiteHelper.addStateToReportBuilder(0);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(0)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(0)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(0)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/P[1]/A[2], element=Element{node=[A: null], tag=A, text=Create user account, attributes={evlist=false, href=/claroline11110/claroline/auth/inscription.php}}, source=HybridStateVertexImpl{id=0, name=index}, target=HybridStateVertexImpl{id=10, name=state10}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/FORM[1]/FIELDSET[1]/INPUT[1]"), "admin"));
			formInputs.add(new FormInput(FormInput.InputType.PASSWORD, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/FORM[1]/FIELDSET[1]/INPUT[2]"), "admin"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/FORM[1]/INPUT[1]"), "QSQEEngq"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(9), "Event fired: Create user account");
			testSuiteHelper.runInCrawlingPlugins(10);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 10");

			testSuiteHelper.addStateToReportBuilder(10);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(10)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(10)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(10)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/DL[1]/DT[1]/INPUT[1], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={evlist=false, id=applyChange, name=applyChange, type=submit, value=Ok}}, source=HybridStateVertexImpl{id=10, name=state10}, target=HybridStateVertexImpl{id=114, name=state114}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DL[1]/DD[1]/INPUT[1]"), "Stocco"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DL[1]/DD[2]/INPUT[1]"), "Andrea"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DL[1]/DD[3]/INPUT[1]"), "Anlagcdw"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[2]/DL[1]/DD[2]/INPUT[1]"), "XQoPSFUE"));
			formInputs.add(new FormInput(FormInput.InputType.PASSWORD, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[2]/DL[1]/DD[3]/INPUT[1]"), "admin"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[3]/DL[1]/DD[1]/INPUT[1]"), "astocco@ece.ubc.ca"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[3]/DL[1]/DD[2]/INPUT[1]"), "CuQmnTCh"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[3]/DL[1]/DD[3]/INPUT[1]"), "NMcozCyN"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[4]/DL[1]/DD[1]/INPUT[1]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[4]/DL[1]/DD[1]/INPUT[2]"), "0"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(90), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(114);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 114");

			testSuiteHelper.addStateToReportBuilder(114);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(114)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(114)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(114)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/DL[1]/DT[1]/A[1]/INPUT[1], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={anyaccess=none, evlist=false, onclick=document.location='http://localhost:3000/claroline11110/claroline/auth/inscription.php';return false, type=button, value=Cancel}}, source=HybridStateVertexImpl{id=114, name=state114}, target=HybridStateVertexImpl{id=10, name=state10}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DL[1]/DD[1]/INPUT[1]"), "Stocco"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DL[1]/DD[2]/INPUT[1]"), "Andrea"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DL[1]/DD[3]/INPUT[1]"), "aCItLWeq"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[2]/DL[1]/DD[2]/INPUT[1]"), "bTAttsPB"));
			formInputs.add(new FormInput(FormInput.InputType.PASSWORD, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[2]/DL[1]/DD[3]/INPUT[1]"), "admin"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[3]/DL[1]/DD[1]/INPUT[1]"), "astocco@ece.ubc.ca"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[3]/DL[1]/DD[2]/INPUT[1]"), "FPLxElhH"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[3]/DL[1]/DD[3]/INPUT[1]"), "jtGANnjH"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[4]/DL[1]/DD[1]/INPUT[1]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[4]/DL[1]/DD[1]/INPUT[2]"), "1"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(158), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(10);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 10");

			testSuiteHelper.addStateToReportBuilder(10);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(10)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(10)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(10)
					&& allStatesIdentical;	
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=35)
	public void method_BT15_path_12_14(){
		testSuiteHelper.newCurrentTestMethod("method_BT15_path_12_14", 35);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(0);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(0)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(0)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(0)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/FORM[1]/FIELDSET[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Enter, attributes={evlist=false, tabindex=3, type=submit}}, source=HybridStateVertexImpl{id=0, name=index}, target=HybridStateVertexImpl{id=13, name=state13}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/FORM[1]/FIELDSET[1]/INPUT[1]"), "admin"));
			formInputs.add(new FormInput(FormInput.InputType.PASSWORD, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/FORM[1]/FIELDSET[1]/INPUT[2]"), "admin"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/FORM[1]/INPUT[1]"), "YZWkUHaV"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(12), "Event fired: Enter");
			testSuiteHelper.runInCrawlingPlugins(13);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 13");

			testSuiteHelper.addStateToReportBuilder(13);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(13)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(13)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(13)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[2]/SPAN[1]/A[1], element=Element{node=[A: null], tag=A, text=My messages, attributes={evlist=false, href=/claroline11110/claroline/messaging, target=_top}}, source=HybridStateVertexImpl{id=13, name=state13}, target=HybridStateVertexImpl{id=15, name=state15}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(14), "Event fired: My messages");
			testSuiteHelper.runInCrawlingPlugins(15);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 15");

			testSuiteHelper.addStateToReportBuilder(15);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(15)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(15)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(15)
					&& allStatesIdentical;	
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=36)
	public void method_BT63_path_153_1000006_162(){
		testSuiteHelper.newCurrentTestMethod("method_BT63_path_153_1000006_162", 36);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(13);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(13)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(13)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(13)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/P[2]/A[1], element=Element{node=[A: null], tag=A, text=Edit text zone, attributes={evlist=false, href=/claroline11110/claroline/admin/managing/editFile.php?cmd=rqEdit&file=textzone_right.inc.html}}, source=HybridStateVertexImpl{id=13, name=state13}, target=HybridStateVertexImpl{id=17, name=state17}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(153), "Event fired: Edit text zone");
			testSuiteHelper.runInCrawlingPlugins(17);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 17");

			testSuiteHelper.addStateToReportBuilder(17);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(17)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(17)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(17)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/SPAN[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/DIV[1]/SPAN[1]/TABLE[1]/TBODY[1]/TR[1]/TD[4]/SPAN[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/A[1], element=Element{node=[A: null], tag=A, text=Format, attributes={class=mceText, evlist=false, href=javascript:;, id=textContent_formatselect_text, onclick=return false;, onmousedown=return false;, tabindex=-1}}, source=HybridStateVertexImpl{id=17, name=state17}, target=HybridStateVertexImpl{id=63, name=state63}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1000006), "Event fired: Format");
			testSuiteHelper.runInCrawlingPlugins(63);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 63");

			testSuiteHelper.addStateToReportBuilder(63);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(63)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(63)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(63)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[2]/DIV[1]/TABLE[1]/TBODY[1]/TR[2]/TD[1]/A[1], element=Element{node=[A: null], tag=A, text=Paragraph, attributes={anyaccess=none, aria-checked=false, aria-disabled=false, aria-pressed=false, evlist=false, href=javascript:;, id=mce_13_aria, onclick=return false;, onmousedown=return false;, role=option, tabindex=-1}}, source=HybridStateVertexImpl{id=63, name=state63}, target=HybridStateVertexImpl{id=140, name=state140}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(162), "Event fired: Paragraph");
			testSuiteHelper.runInCrawlingPlugins(140);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 140");

			testSuiteHelper.addStateToReportBuilder(140);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(140)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(140)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(140)
					&& allStatesIdentical;	
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=37)
	public void method_BT127_path_14_94(){
		testSuiteHelper.newCurrentTestMethod("method_BT127_path_14_94", 37);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(13);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(13)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(13)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(13)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[2]/SPAN[1]/A[1], element=Element{node=[A: null], tag=A, text=My messages, attributes={evlist=false, href=/claroline11110/claroline/messaging, target=_top}}, source=HybridStateVertexImpl{id=13, name=state13}, target=HybridStateVertexImpl{id=15, name=state15}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(14), "Event fired: My messages");
			testSuiteHelper.runInCrawlingPlugins(15);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 15");

			testSuiteHelper.addStateToReportBuilder(15);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(15)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(15)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(15)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Outbox, attributes={evlist=false, href=/claroline11110/claroline/messaging/messagebox.php?box=outbox, id=outbox}}, source=HybridStateVertexImpl{id=15, name=state15}, target=HybridStateVertexImpl{id=127, name=state127}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/FORM[1]/INPUT[1]"), "xrhkyolQ"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(94), "Event fired: Outbox");
			testSuiteHelper.runInCrawlingPlugins(127);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 127");

			testSuiteHelper.addStateToReportBuilder(127);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(127)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(127)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(127)
					&& allStatesIdentical;	
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=38)
	public void method_BT145_path_56_106_165_166_167_168_169_174(){
		testSuiteHelper.newCurrentTestMethod("method_BT145_path_56_106_165_166_167_168_169_174", 38);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(13);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(13)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(13)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(13)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[3]/SPAN[1]/A[1], element=Element{node=[A: null], tag=A, text=Platform administration, attributes={evlist=false, href=/claroline11110/claroline/admin/, target=_top}}, source=HybridStateVertexImpl{id=13, name=state13}, target=HybridStateVertexImpl{id=68, name=state68}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(56), "Event fired: Platform administration");
			testSuiteHelper.runInCrawlingPlugins(68);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 68");

			testSuiteHelper.addStateToReportBuilder(68);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(68)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(68)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(68)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/UL[1]/LI[1]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=User list, attributes={evlist=false, href=admin_users.php}}, source=HybridStateVertexImpl{id=68, name=state68}, target=HybridStateVertexImpl{id=145, name=state145}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/UL[1]/LI[1]/UL[1]/LI[1]/FORM[1]/INPUT[1]"), "ebIZwepn"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/UL[1]/LI[2]/UL[1]/LI[1]/FORM[1]/INPUT[1]"), "FPLCMqiI"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(106), "Event fired: User list");
			testSuiteHelper.runInCrawlingPlugins(145);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 145");

			testSuiteHelper.addStateToReportBuilder(145);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(145)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(145)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(145)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/TABLE[2]/TBODY[1]/TR[1]/TD[7]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={evlist=false, href=admin_profile.php?uidToEdit=1&cfrom=ulist}}, source=HybridStateVertexImpl{id=145, name=state145}, target=HybridStateVertexImpl{id=286, name=state286}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/FORM[1]/INPUT[1]"), "cpxWnDDK"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(165), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(286);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 286");

			testSuiteHelper.addStateToReportBuilder(286);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(286)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(286)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(286)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[2]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Enrol to a new course, attributes={evlist=false, href=../auth/courses.php?cmd=rqReg&uidToEdit=1&fromAdmin=settings&category=, style=background-image: url(/claroline11110/web/img/enroll.png?1232376376); background-repeat: no-repeat; background-position: left center; padding-left: 20px;}}, source=HybridStateVertexImpl{id=286, name=state286}, target=HybridStateVertexImpl{id=287, name=state287}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DL[1]/DD[1]/INPUT[1]"), "Stocco"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DL[1]/DD[2]/INPUT[1]"), "Andrea"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DL[1]/DD[3]/INPUT[1]"), "OhPWyrzM"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[2]/DL[1]/DD[2]/INPUT[1]"), "BuwKabLI"));
			formInputs.add(new FormInput(FormInput.InputType.PASSWORD, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[2]/DL[1]/DD[5]/INPUT[1]"), "admin"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[3]/DL[1]/DD[1]/INPUT[1]"), "astocco@ece.ubc.ca"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[3]/DL[1]/DD[2]/INPUT[1]"), "RlAjQwNe"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[3]/DL[1]/DD[3]/INPUT[1]"), "OCdHkNjE"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[4]/DL[1]/DD[1]/INPUT[1]"), "0"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[4]/DL[1]/DD[1]/INPUT[2]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[4]/DL[1]/DD[1]/SPAN[1]/INPUT[1]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[2]/DL[1]/DD[7]/SELECT[1]"), "claroline"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(166), "Event fired: Enrol to a new course");
			testSuiteHelper.runInCrawlingPlugins(287);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 287");

			testSuiteHelper.addStateToReportBuilder(287);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(287)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(287)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(287)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[3]/DIV[1]/UL[1]/LI[3]/A[1], element=Element{node=[A: null], tag=A, text=User's course, attributes={anyaccess=action, evlist=false, href=/claroline11110/claroline/auth/courses.php, target=_top}}, source=HybridStateVertexImpl{id=287, name=state287}, target=HybridStateVertexImpl{id=288, name=state288}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/INPUT[1]"), "pOtlOKbV"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(167), "Event fired: User's course");
			testSuiteHelper.runInCrawlingPlugins(288);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 288");

			testSuiteHelper.addStateToReportBuilder(288);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(288)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(288)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(288)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/P[2]/A[1], element=Element{node=[A: null], tag=A, text=Back to my personal course list, attributes={anyaccess=none, class=backLink, evlist=false, href=../../index.php?asTeacher=false, title=Back to my personal course list}}, source=HybridStateVertexImpl{id=288, name=state288}, target=HybridStateVertexImpl{id=13, name=state13}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/INPUT[1]"), "QwBwWghZ"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(168), "Event fired: Back to my personal course list");
			testSuiteHelper.runInCrawlingPlugins(13);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 13");

			testSuiteHelper.addStateToReportBuilder(13);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(13)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(13)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(13)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Create a course site, attributes={class=userCommandsItem, evlist=false, href=/claroline11110/claroline/course/create.php}}, source=HybridStateVertexImpl{id=13, name=state13}, target=HybridStateVertexImpl{id=290, name=state290}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(169), "Event fired: Create a course site");
			testSuiteHelper.runInCrawlingPlugins(290);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 290");

			testSuiteHelper.addStateToReportBuilder(290);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(290)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(290)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(290)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[1]/DL[1]/DD[3]/TABLE[1]/TBODY[1]/TR[1]/TD[2]/A[2], element=Element{node=[A: null], tag=A, text=, attributes={class=msremove, evlist=false, href=#}}, source=HybridStateVertexImpl{id=290, name=state290}, target=HybridStateVertexImpl{id=295, name=state295}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[1]/DL[1]/DD[1]/INPUT[1]"), "kPWZfIaQ"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[1]/DL[1]/DD[2]/INPUT[1]"), "FeUFpzDe"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[1]/DL[1]/DD[5]/INPUT[1]"), "cTFoLAgf"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[1]/DL[1]/DD[6]/INPUT[1]"), "jdoe@mydomain.net"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[1]/DL[1]/DD[7]/INPUT[1]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[1]/DL[1]/DD[7]/INPUT[2]"), "0"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[1]/DL[1]/DD[7]/INPUT[3]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[1]/DL[1]/DD[8]/INPUT[1]"), "0"));
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[1]/DL[1]/DD[8]/BLOCKQUOTE[1]/INPUT[1]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[1]/DL[1]/DD[8]/BLOCKQUOTE[1]/INPUT[2]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "course_registrationKey"), "BYDMPuUI"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(174), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(295);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 295");

			testSuiteHelper.addStateToReportBuilder(295);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(295)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(295)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(295)
					&& allStatesIdentical;	
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=39)
	public void method_BT72_path_56_58_60_175_176(){
		testSuiteHelper.newCurrentTestMethod("method_BT72_path_56_58_60_175_176", 39);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(13);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(13)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(13)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(13)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[3]/SPAN[1]/A[1], element=Element{node=[A: null], tag=A, text=Platform administration, attributes={evlist=false, href=/claroline11110/claroline/admin/, target=_top}}, source=HybridStateVertexImpl{id=13, name=state13}, target=HybridStateVertexImpl{id=68, name=state68}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(56), "Event fired: Platform administration");
			testSuiteHelper.runInCrawlingPlugins(68);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 68");

			testSuiteHelper.addStateToReportBuilder(68);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(68)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(68)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(68)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/UL[1]/LI[1]/UL[1]/LI[1]/FORM[1]/SMALL[1]/A[1], element=Element{node=[A: null], tag=A, text=Advanced, attributes={evlist=false, href=advanced_user_search.php}}, source=HybridStateVertexImpl{id=68, name=state68}, target=HybridStateVertexImpl{id=70, name=state70}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/UL[1]/LI[1]/UL[1]/LI[1]/FORM[1]/INPUT[1]"), "EewRXilN"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/UL[1]/LI[2]/UL[1]/LI[1]/FORM[1]/INPUT[1]"), "EIRqChgC"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(58), "Event fired: Advanced");
			testSuiteHelper.runInCrawlingPlugins(70);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 70");

			testSuiteHelper.addStateToReportBuilder(70);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(70)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(70)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(70)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/TABLE[1]/TBODY[1]/TR[7]/TD[2]/INPUT[1], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={class=claroButton, evlist=false, type=submit, value=Search user}}, source=HybridStateVertexImpl{id=70, name=state70}, target=HybridStateVertexImpl{id=72, name=state72}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/TABLE[1]/TBODY[1]/TR[1]/TD[2]/INPUT[1]"), "nAdRVyJU"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/TABLE[1]/TBODY[1]/TR[2]/TD[2]/INPUT[1]"), "TrsDlXDK"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/TABLE[1]/TBODY[1]/TR[3]/TD[2]/INPUT[1]"), "IWmJjRbh"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/TABLE[1]/TBODY[1]/TR[4]/TD[2]/INPUT[1]"), "IJKQpwAr"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/TABLE[1]/TBODY[1]/TR[5]/TD[2]/INPUT[1]"), "IFNMQfjY"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/TABLE[1]/TBODY[1]/TR[6]/TD[2]/SELECT[1]"), "Student"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(60), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(72);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 72");

			testSuiteHelper.addStateToReportBuilder(72);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(72)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(72)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(72)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[2]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Reset all user passwords, attributes={evlist=false, href=/claroline11110/claroline/admin/admin_users.php?cmd=rqResetAllPasswords, style=background-image: url(/claroline11110/web/img/locked.png?1232376376); background-repeat: no-repeat; background-position: left center; padding-left: 20px;}}, source=HybridStateVertexImpl{id=72, name=state72}, target=HybridStateVertexImpl{id=300, name=state300}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/FORM[1]/INPUT[1]"), "TVwUqtlC"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(175), "Event fired: Reset all user passwords");
			testSuiteHelper.runInCrawlingPlugins(300);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 300");

			testSuiteHelper.addStateToReportBuilder(300);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(300)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(300)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(300)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[2]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Create user, attributes={evlist=false, href=adminaddnewuser.php, style=background-image: url(/claroline11110/web/img/user.png?1232376376); background-repeat: no-repeat; background-position: left center; padding-left: 20px;}}, source=HybridStateVertexImpl{id=300, name=state300}, target=HybridStateVertexImpl{id=74, name=state74}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[2]/FORM[1]/INPUT[2]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/FORM[1]/INPUT[1]"), "NoQLokVV"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(176), "Event fired: Create user");
			testSuiteHelper.runInCrawlingPlugins(74);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 74");

			testSuiteHelper.addStateToReportBuilder(74);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(74)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(74)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(74)
					&& allStatesIdentical;	
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=40)
	public void method_BT64_path_153_1000006_1000007_177(){
		testSuiteHelper.newCurrentTestMethod("method_BT64_path_153_1000006_1000007_177", 40);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(13);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(13)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(13)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(13)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/P[2]/A[1], element=Element{node=[A: null], tag=A, text=Edit text zone, attributes={evlist=false, href=/claroline11110/claroline/admin/managing/editFile.php?cmd=rqEdit&file=textzone_right.inc.html}}, source=HybridStateVertexImpl{id=13, name=state13}, target=HybridStateVertexImpl{id=17, name=state17}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(153), "Event fired: Edit text zone");
			testSuiteHelper.runInCrawlingPlugins(17);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 17");

			testSuiteHelper.addStateToReportBuilder(17);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(17)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(17)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(17)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/SPAN[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/DIV[1]/SPAN[1]/TABLE[1]/TBODY[1]/TR[1]/TD[4]/SPAN[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/A[1], element=Element{node=[A: null], tag=A, text=Format, attributes={class=mceText, evlist=false, href=javascript:;, id=textContent_formatselect_text, onclick=return false;, onmousedown=return false;, tabindex=-1}}, source=HybridStateVertexImpl{id=17, name=state17}, target=HybridStateVertexImpl{id=63, name=state63}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1000006), "Event fired: Format");
			testSuiteHelper.runInCrawlingPlugins(63);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 63");

			testSuiteHelper.addStateToReportBuilder(63);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(63)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(63)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(63)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/SPAN[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/DIV[1]/SPAN[1]/TABLE[2]/TBODY[1]/TR[1]/TD[18]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[2]/A[1], element=Element{node=[A: null], tag=A, text=▼, attributes={anyaccess=none, class=mceOpen mce_forecolor, evlist=false, href=javascript:;, id=textContent_forecolor_open, onclick=return false;, onmousedown=return false;, role=button, tabindex=-1, title=Select Text Color}}, source=HybridStateVertexImpl{id=63, name=state63}, target=HybridStateVertexImpl{id=64, name=state64}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1000007), "Event fired: ▼");
			testSuiteHelper.runInCrawlingPlugins(64);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 64");

			testSuiteHelper.addStateToReportBuilder(64);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(64)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(64)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(64)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[3]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[4]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={data-mce-color=#003300, evlist=false, href=javascript:;, id=_mce_item_25, role=option, style=background-color: rgb(0, 51, 0);, tabindex=-1, title=Dark green}}, source=HybridStateVertexImpl{id=64, name=state64}, target=HybridStateVertexImpl{id=212, name=state212}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(177), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(212);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 212");

			testSuiteHelper.addStateToReportBuilder(212);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(212)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(212)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(212)
					&& allStatesIdentical;	
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=41)
	public void method_BT17_path_153_179(){
		testSuiteHelper.newCurrentTestMethod("method_BT17_path_153_179", 41);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(13);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(13)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(13)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(13)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/P[2]/A[1], element=Element{node=[A: null], tag=A, text=Edit text zone, attributes={evlist=false, href=/claroline11110/claroline/admin/managing/editFile.php?cmd=rqEdit&file=textzone_right.inc.html}}, source=HybridStateVertexImpl{id=13, name=state13}, target=HybridStateVertexImpl{id=17, name=state17}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(153), "Event fired: Edit text zone");
			testSuiteHelper.runInCrawlingPlugins(17);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 17");

			testSuiteHelper.addStateToReportBuilder(17);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(17)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(17)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(17)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/SPAN[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/DIV[1]/SPAN[1]/TABLE[1]/TBODY[1]/TR[1]/TD[9]/A[1], element=Element{node=[A: null], tag=A, text=Strikethrough, attributes={aria-labelledby=textContent_strikethrough_voice, class=mceButton mceButtonEnabled mce_strikethrough, evlist=false, href=javascript:;, id=textContent_strikethrough, onclick=return false;, onmousedown=return false;, role=button, tabindex=-1, title=Strikethrough}}, source=HybridStateVertexImpl{id=17, name=state17}, target=HybridStateVertexImpl{id=18, name=state18}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(179), "Event fired: Strikethrough");
			testSuiteHelper.runInCrawlingPlugins(18);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 18");

			testSuiteHelper.addStateToReportBuilder(18);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(18)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(18)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(18)
					&& allStatesIdentical;	
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=42)
	public void method_BT68_path_56_180(){
		testSuiteHelper.newCurrentTestMethod("method_BT68_path_56_180", 42);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(13);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(13)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(13)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(13)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[3]/SPAN[1]/A[1], element=Element{node=[A: null], tag=A, text=Platform administration, attributes={evlist=false, href=/claroline11110/claroline/admin/, target=_top}}, source=HybridStateVertexImpl{id=13, name=state13}, target=HybridStateVertexImpl{id=68, name=state68}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(56), "Event fired: Platform administration");
			testSuiteHelper.runInCrawlingPlugins(68);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 68");

			testSuiteHelper.addStateToReportBuilder(68);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(68)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(68)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(68)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/UL[1]/LI[1]/UL[1]/LI[4]/A[1], element=Element{node=[A: null], tag=A, text=Create user, attributes={evlist=false, href=adminaddnewuser.php}}, source=HybridStateVertexImpl{id=68, name=state68}, target=HybridStateVertexImpl{id=74, name=state74}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/UL[1]/LI[1]/UL[1]/LI[1]/FORM[1]/INPUT[1]"), "pZAfxibW"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/UL[1]/LI[2]/UL[1]/LI[1]/FORM[1]/INPUT[1]"), "XAndDyzH"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(180), "Event fired: Create user");
			testSuiteHelper.runInCrawlingPlugins(74);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 74");

			testSuiteHelper.addStateToReportBuilder(74);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(74)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(74)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(74)
					&& allStatesIdentical;	
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=43)
	public void method_BT64_path_153_1000006_1000007_181(){
		testSuiteHelper.newCurrentTestMethod("method_BT64_path_153_1000006_1000007_181", 43);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(13);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(13)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(13)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(13)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/P[2]/A[1], element=Element{node=[A: null], tag=A, text=Edit text zone, attributes={evlist=false, href=/claroline11110/claroline/admin/managing/editFile.php?cmd=rqEdit&file=textzone_right.inc.html}}, source=HybridStateVertexImpl{id=13, name=state13}, target=HybridStateVertexImpl{id=17, name=state17}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(153), "Event fired: Edit text zone");
			testSuiteHelper.runInCrawlingPlugins(17);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 17");

			testSuiteHelper.addStateToReportBuilder(17);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(17)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(17)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(17)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/SPAN[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/DIV[1]/SPAN[1]/TABLE[1]/TBODY[1]/TR[1]/TD[4]/SPAN[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/A[1], element=Element{node=[A: null], tag=A, text=Format, attributes={class=mceText, evlist=false, href=javascript:;, id=textContent_formatselect_text, onclick=return false;, onmousedown=return false;, tabindex=-1}}, source=HybridStateVertexImpl{id=17, name=state17}, target=HybridStateVertexImpl{id=63, name=state63}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1000006), "Event fired: Format");
			testSuiteHelper.runInCrawlingPlugins(63);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 63");

			testSuiteHelper.addStateToReportBuilder(63);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(63)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(63)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(63)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/SPAN[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/DIV[1]/SPAN[1]/TABLE[2]/TBODY[1]/TR[1]/TD[18]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[2]/A[1], element=Element{node=[A: null], tag=A, text=▼, attributes={anyaccess=none, class=mceOpen mce_forecolor, evlist=false, href=javascript:;, id=textContent_forecolor_open, onclick=return false;, onmousedown=return false;, role=button, tabindex=-1, title=Select Text Color}}, source=HybridStateVertexImpl{id=63, name=state63}, target=HybridStateVertexImpl{id=64, name=state64}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1000007), "Event fired: ▼");
			testSuiteHelper.runInCrawlingPlugins(64);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 64");

			testSuiteHelper.addStateToReportBuilder(64);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(64)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(64)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(64)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[3]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[5]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={data-mce-color=#003366, evlist=false, href=javascript:;, id=_mce_item_26, role=option, style=background-color: rgb(0, 51, 102);, tabindex=-1, title=Dark azure}}, source=HybridStateVertexImpl{id=64, name=state64}, target=HybridStateVertexImpl{id=212, name=state212}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(181), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(212);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 212");

			testSuiteHelper.addStateToReportBuilder(212);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(212)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(212)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(212)
					&& allStatesIdentical;	
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=44)
	public void method_BT240_path_56_140_183_184(){
		testSuiteHelper.newCurrentTestMethod("method_BT240_path_56_140_183_184", 44);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(13);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(13)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(13)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(13)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[3]/SPAN[1]/A[1], element=Element{node=[A: null], tag=A, text=Platform administration, attributes={evlist=false, href=/claroline11110/claroline/admin/, target=_top}}, source=HybridStateVertexImpl{id=13, name=state13}, target=HybridStateVertexImpl{id=68, name=state68}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(56), "Event fired: Platform administration");
			testSuiteHelper.runInCrawlingPlugins(68);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 68");

			testSuiteHelper.addStateToReportBuilder(68);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(68)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(68)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(68)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/UL[1]/LI[1]/UL[1]/LI[3]/A[1], element=Element{node=[A: null], tag=A, text=Send a message to all users, attributes={evlist=false, href=../messaging/sendmessage.php?cmd=rqMessageToAllUsers}}, source=HybridStateVertexImpl{id=68, name=state68}, target=HybridStateVertexImpl{id=240, name=state240}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/UL[1]/LI[1]/UL[1]/LI[1]/FORM[1]/INPUT[1]"), "CsBpUdKh"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/UL[1]/LI[2]/UL[1]/LI[1]/FORM[1]/INPUT[1]"), "KVKrEPXf"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(140), "Event fired: Send a message to all users");
			testSuiteHelper.runInCrawlingPlugins(240);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 240");

			testSuiteHelper.addStateToReportBuilder(240);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(240)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(240)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(240)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/SPAN[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/DIV[1]/SPAN[1]/TABLE[2]/TBODY[1]/TR[1]/TD[18]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[2]/A[1], element=Element{node=[A: null], tag=A, text=▼, attributes={anyaccess=action, class=mceOpen mce_forecolor, evlist=false, href=javascript:;, id=message_forecolor_open, onclick=return false;, onmousedown=return false;, role=button, tabindex=-1, title=Select Text Color}}, source=HybridStateVertexImpl{id=240, name=state240}, target=HybridStateVertexImpl{id=321, name=state321}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/INPUT[8]"), "XlVwRoRh"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(183), "Event fired: ▼");
			testSuiteHelper.runInCrawlingPlugins(321);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 321");

			testSuiteHelper.addStateToReportBuilder(321);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(321)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(321)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(321)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[2]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={data-mce-color=#000000, evlist=false, href=javascript:;, id=_mce_item_12, role=option, style=background-color: rgb(0, 0, 0);, tabindex=0, title=Black}}, source=HybridStateVertexImpl{id=321, name=state321}, target=HybridStateVertexImpl{id=322, name=state322}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/INPUT[8]"), "QVdIhsLz"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(184), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(322);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 322");

			testSuiteHelper.addStateToReportBuilder(322);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(322)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(322)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(322)
					&& allStatesIdentical;	
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=45)
	public void method_BT6_path_75_5_186_187(){
		testSuiteHelper.newCurrentTestMethod("method_BT6_path_75_5_186_187", 45);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(13);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(13)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(13)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(13)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[2]/DIV[2]/UL[1]/LI[3]/SPAN[1]/A[1], element=Element{node=[A: null], tag=A, text=Logout, attributes={evlist=false, href=/claroline11110/index.php?logout=true, target=_top}}, source=HybridStateVertexImpl{id=13, name=state13}, target=HybridStateVertexImpl{id=0, name=index}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(75), "Event fired: Logout");
			testSuiteHelper.runInCrawlingPlugins(0);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 0");

			testSuiteHelper.addStateToReportBuilder(0);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(0)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(0)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(0)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/P[1]/A[1], element=Element{node=[A: null], tag=A, text=Lost password, attributes={evlist=false, href=/claroline11110/claroline/auth/lostPassword.php}}, source=HybridStateVertexImpl{id=0, name=index}, target=HybridStateVertexImpl{id=6, name=state6}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/FORM[1]/FIELDSET[1]/INPUT[1]"), "admin"));
			formInputs.add(new FormInput(FormInput.InputType.PASSWORD, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/FORM[1]/FIELDSET[1]/INPUT[2]"), "admin"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/FORM[1]/INPUT[1]"), "TCAitBQO"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(5), "Event fired: Lost password");
			testSuiteHelper.runInCrawlingPlugins(6);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 6");

			testSuiteHelper.addStateToReportBuilder(6);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(6)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(6)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(6)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[2]/FORM[1]/INPUT[3], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={evlist=false, name=retrieve, type=submit, value=Ok}}, source=HybridStateVertexImpl{id=6, name=state6}, target=HybridStateVertexImpl{id=326, name=state326}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[2]/FORM[1]/INPUT[2]"), "nnFDQoNC"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(186), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(326);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 326");

			testSuiteHelper.addStateToReportBuilder(326);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(326)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(326)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(326)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[3]/FORM[1]/A[1]/INPUT[1], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={anyaccess=none, evlist=false, onclick=document.location='/claroline11110/index.php';return false, type=button, value=Cancel}}, source=HybridStateVertexImpl{id=326, name=state326}, target=HybridStateVertexImpl{id=0, name=index}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[3]/FORM[1]/INPUT[2]"), "zANsIqJo"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(187), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(0);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 0");

			testSuiteHelper.addStateToReportBuilder(0);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(0)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(0)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(0)
					&& allStatesIdentical;	
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=46)
	public void method_BT64_path_12_153_1000006_1000007_188(){
		testSuiteHelper.newCurrentTestMethod("method_BT64_path_12_153_1000006_1000007_188", 46);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(0);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(0)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(0)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(0)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/FORM[1]/FIELDSET[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Enter, attributes={evlist=false, tabindex=3, type=submit}}, source=HybridStateVertexImpl{id=0, name=index}, target=HybridStateVertexImpl{id=13, name=state13}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/FORM[1]/FIELDSET[1]/INPUT[1]"), "admin"));
			formInputs.add(new FormInput(FormInput.InputType.PASSWORD, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/FORM[1]/FIELDSET[1]/INPUT[2]"), "admin"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/FORM[1]/INPUT[1]"), "YZWkUHaV"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(12), "Event fired: Enter");
			testSuiteHelper.runInCrawlingPlugins(13);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 13");

			testSuiteHelper.addStateToReportBuilder(13);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(13)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(13)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(13)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/P[2]/A[1], element=Element{node=[A: null], tag=A, text=Edit text zone, attributes={evlist=false, href=/claroline11110/claroline/admin/managing/editFile.php?cmd=rqEdit&file=textzone_right.inc.html}}, source=HybridStateVertexImpl{id=13, name=state13}, target=HybridStateVertexImpl{id=17, name=state17}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(153), "Event fired: Edit text zone");
			testSuiteHelper.runInCrawlingPlugins(17);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 17");

			testSuiteHelper.addStateToReportBuilder(17);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(17)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(17)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(17)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/SPAN[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/DIV[1]/SPAN[1]/TABLE[1]/TBODY[1]/TR[1]/TD[4]/SPAN[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/A[1], element=Element{node=[A: null], tag=A, text=Format, attributes={class=mceText, evlist=false, href=javascript:;, id=textContent_formatselect_text, onclick=return false;, onmousedown=return false;, tabindex=-1}}, source=HybridStateVertexImpl{id=17, name=state17}, target=HybridStateVertexImpl{id=63, name=state63}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1000006), "Event fired: Format");
			testSuiteHelper.runInCrawlingPlugins(63);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 63");

			testSuiteHelper.addStateToReportBuilder(63);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(63)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(63)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(63)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/SPAN[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/DIV[1]/SPAN[1]/TABLE[2]/TBODY[1]/TR[1]/TD[18]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[2]/A[1], element=Element{node=[A: null], tag=A, text=▼, attributes={anyaccess=none, class=mceOpen mce_forecolor, evlist=false, href=javascript:;, id=textContent_forecolor_open, onclick=return false;, onmousedown=return false;, role=button, tabindex=-1, title=Select Text Color}}, source=HybridStateVertexImpl{id=63, name=state63}, target=HybridStateVertexImpl{id=64, name=state64}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1000007), "Event fired: ▼");
			testSuiteHelper.runInCrawlingPlugins(64);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 64");

			testSuiteHelper.addStateToReportBuilder(64);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(64)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(64)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(64)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[3]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[6]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={data-mce-color=#000080, evlist=false, href=javascript:;, id=_mce_item_27, role=option, style=background-color: rgb(0, 0, 128);, tabindex=-1, title=Navy Blue}}, source=HybridStateVertexImpl{id=64, name=state64}, target=HybridStateVertexImpl{id=212, name=state212}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(188), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(212);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 212");

			testSuiteHelper.addStateToReportBuilder(212);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(212)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(212)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(212)
					&& allStatesIdentical;	
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=47)
	public void method_BT17_path_153_190(){
		testSuiteHelper.newCurrentTestMethod("method_BT17_path_153_190", 47);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(13);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(13)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(13)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(13)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/P[2]/A[1], element=Element{node=[A: null], tag=A, text=Edit text zone, attributes={evlist=false, href=/claroline11110/claroline/admin/managing/editFile.php?cmd=rqEdit&file=textzone_right.inc.html}}, source=HybridStateVertexImpl{id=13, name=state13}, target=HybridStateVertexImpl{id=17, name=state17}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(153), "Event fired: Edit text zone");
			testSuiteHelper.runInCrawlingPlugins(17);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 17");

			testSuiteHelper.addStateToReportBuilder(17);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(17)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(17)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(17)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/SPAN[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/DIV[1]/SPAN[1]/TABLE[2]/TBODY[1]/TR[1]/TD[19]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/A[1], element=Element{node=[A: null], tag=A, text=Select Background Color, attributes={class=mceAction mce_backcolor, evlist=false, href=javascript:;, id=textContent_backcolor_action, onclick=return false;, onmousedown=return false;, role=button, tabindex=-1, title=Select Background Color}}, source=HybridStateVertexImpl{id=17, name=state17}, target=HybridStateVertexImpl{id=18, name=state18}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(190), "Event fired: Select Background Color");
			testSuiteHelper.runInCrawlingPlugins(18);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 18");

			testSuiteHelper.addStateToReportBuilder(18);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(18)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(18)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(18)
					&& allStatesIdentical;	
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=48)
	public void method_BT64_path_153_1000006_1000007_191(){
		testSuiteHelper.newCurrentTestMethod("method_BT64_path_153_1000006_1000007_191", 48);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(13);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(13)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(13)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(13)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/P[2]/A[1], element=Element{node=[A: null], tag=A, text=Edit text zone, attributes={evlist=false, href=/claroline11110/claroline/admin/managing/editFile.php?cmd=rqEdit&file=textzone_right.inc.html}}, source=HybridStateVertexImpl{id=13, name=state13}, target=HybridStateVertexImpl{id=17, name=state17}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(153), "Event fired: Edit text zone");
			testSuiteHelper.runInCrawlingPlugins(17);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 17");

			testSuiteHelper.addStateToReportBuilder(17);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(17)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(17)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(17)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/SPAN[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/DIV[1]/SPAN[1]/TABLE[1]/TBODY[1]/TR[1]/TD[4]/SPAN[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/A[1], element=Element{node=[A: null], tag=A, text=Format, attributes={class=mceText, evlist=false, href=javascript:;, id=textContent_formatselect_text, onclick=return false;, onmousedown=return false;, tabindex=-1}}, source=HybridStateVertexImpl{id=17, name=state17}, target=HybridStateVertexImpl{id=63, name=state63}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1000006), "Event fired: Format");
			testSuiteHelper.runInCrawlingPlugins(63);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 63");

			testSuiteHelper.addStateToReportBuilder(63);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(63)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(63)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(63)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/SPAN[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/DIV[1]/SPAN[1]/TABLE[2]/TBODY[1]/TR[1]/TD[18]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[2]/A[1], element=Element{node=[A: null], tag=A, text=▼, attributes={anyaccess=none, class=mceOpen mce_forecolor, evlist=false, href=javascript:;, id=textContent_forecolor_open, onclick=return false;, onmousedown=return false;, role=button, tabindex=-1, title=Select Text Color}}, source=HybridStateVertexImpl{id=63, name=state63}, target=HybridStateVertexImpl{id=64, name=state64}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1000007), "Event fired: ▼");
			testSuiteHelper.runInCrawlingPlugins(64);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 64");

			testSuiteHelper.addStateToReportBuilder(64);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(64)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(64)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(64)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[3]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[7]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={data-mce-color=#333399, evlist=false, href=javascript:;, id=_mce_item_28, role=option, style=background-color: rgb(51, 51, 153);, tabindex=-1, title=Indigo}}, source=HybridStateVertexImpl{id=64, name=state64}, target=HybridStateVertexImpl{id=212, name=state212}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(191), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(212);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 212");

			testSuiteHelper.addStateToReportBuilder(212);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(212)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(212)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(212)
					&& allStatesIdentical;	
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=49)
	public void method_BT321_path_56_140_183_193(){
		testSuiteHelper.newCurrentTestMethod("method_BT321_path_56_140_183_193", 49);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(13);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(13)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(13)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(13)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[3]/SPAN[1]/A[1], element=Element{node=[A: null], tag=A, text=Platform administration, attributes={evlist=false, href=/claroline11110/claroline/admin/, target=_top}}, source=HybridStateVertexImpl{id=13, name=state13}, target=HybridStateVertexImpl{id=68, name=state68}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(56), "Event fired: Platform administration");
			testSuiteHelper.runInCrawlingPlugins(68);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 68");

			testSuiteHelper.addStateToReportBuilder(68);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(68)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(68)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(68)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/UL[1]/LI[1]/UL[1]/LI[3]/A[1], element=Element{node=[A: null], tag=A, text=Send a message to all users, attributes={evlist=false, href=../messaging/sendmessage.php?cmd=rqMessageToAllUsers}}, source=HybridStateVertexImpl{id=68, name=state68}, target=HybridStateVertexImpl{id=240, name=state240}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/UL[1]/LI[1]/UL[1]/LI[1]/FORM[1]/INPUT[1]"), "CsBpUdKh"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/UL[1]/LI[2]/UL[1]/LI[1]/FORM[1]/INPUT[1]"), "KVKrEPXf"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(140), "Event fired: Send a message to all users");
			testSuiteHelper.runInCrawlingPlugins(240);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 240");

			testSuiteHelper.addStateToReportBuilder(240);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(240)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(240)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(240)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/SPAN[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/DIV[1]/SPAN[1]/TABLE[2]/TBODY[1]/TR[1]/TD[18]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[2]/A[1], element=Element{node=[A: null], tag=A, text=▼, attributes={anyaccess=action, class=mceOpen mce_forecolor, evlist=false, href=javascript:;, id=message_forecolor_open, onclick=return false;, onmousedown=return false;, role=button, tabindex=-1, title=Select Text Color}}, source=HybridStateVertexImpl{id=240, name=state240}, target=HybridStateVertexImpl{id=321, name=state321}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/INPUT[8]"), "XlVwRoRh"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(183), "Event fired: ▼");
			testSuiteHelper.runInCrawlingPlugins(321);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 321");

			testSuiteHelper.addStateToReportBuilder(321);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(321)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(321)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(321)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[2]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[2]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={data-mce-color=#993300, evlist=false, href=javascript:;, id=_mce_item_13, role=option, style=background-color: rgb(153, 51, 0);, tabindex=-1, title=Burnt orange}}, source=HybridStateVertexImpl{id=321, name=state321}, target=HybridStateVertexImpl{id=322, name=state322}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/INPUT[8]"), "fMUQVjME"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(193), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(322);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 322");

			testSuiteHelper.addStateToReportBuilder(322);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(322)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(322)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(322)
					&& allStatesIdentical;	
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=50)
	public void method_BT64_path_153_1000006_1000007_195(){
		testSuiteHelper.newCurrentTestMethod("method_BT64_path_153_1000006_1000007_195", 50);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(13);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(13)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(13)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(13)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/P[2]/A[1], element=Element{node=[A: null], tag=A, text=Edit text zone, attributes={evlist=false, href=/claroline11110/claroline/admin/managing/editFile.php?cmd=rqEdit&file=textzone_right.inc.html}}, source=HybridStateVertexImpl{id=13, name=state13}, target=HybridStateVertexImpl{id=17, name=state17}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(153), "Event fired: Edit text zone");
			testSuiteHelper.runInCrawlingPlugins(17);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 17");

			testSuiteHelper.addStateToReportBuilder(17);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(17)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(17)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(17)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/SPAN[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/DIV[1]/SPAN[1]/TABLE[1]/TBODY[1]/TR[1]/TD[4]/SPAN[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/A[1], element=Element{node=[A: null], tag=A, text=Format, attributes={class=mceText, evlist=false, href=javascript:;, id=textContent_formatselect_text, onclick=return false;, onmousedown=return false;, tabindex=-1}}, source=HybridStateVertexImpl{id=17, name=state17}, target=HybridStateVertexImpl{id=63, name=state63}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1000006), "Event fired: Format");
			testSuiteHelper.runInCrawlingPlugins(63);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 63");

			testSuiteHelper.addStateToReportBuilder(63);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(63)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(63)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(63)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/SPAN[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/DIV[1]/SPAN[1]/TABLE[2]/TBODY[1]/TR[1]/TD[18]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[2]/A[1], element=Element{node=[A: null], tag=A, text=▼, attributes={anyaccess=none, class=mceOpen mce_forecolor, evlist=false, href=javascript:;, id=textContent_forecolor_open, onclick=return false;, onmousedown=return false;, role=button, tabindex=-1, title=Select Text Color}}, source=HybridStateVertexImpl{id=63, name=state63}, target=HybridStateVertexImpl{id=64, name=state64}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1000007), "Event fired: ▼");
			testSuiteHelper.runInCrawlingPlugins(64);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 64");

			testSuiteHelper.addStateToReportBuilder(64);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(64)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(64)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(64)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[3]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[8]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={data-mce-color=#333333, evlist=false, href=javascript:;, id=_mce_item_29, role=option, style=background-color: rgb(51, 51, 51);, tabindex=-1, title=Very dark gray}}, source=HybridStateVertexImpl{id=64, name=state64}, target=HybridStateVertexImpl{id=212, name=state212}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(195), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(212);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 212");

			testSuiteHelper.addStateToReportBuilder(212);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(212)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(212)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(212)
					&& allStatesIdentical;	
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=51)
	public void method_BT64_path_153_1000006_1000007_197(){
		testSuiteHelper.newCurrentTestMethod("method_BT64_path_153_1000006_1000007_197", 51);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(13);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(13)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(13)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(13)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/P[2]/A[1], element=Element{node=[A: null], tag=A, text=Edit text zone, attributes={evlist=false, href=/claroline11110/claroline/admin/managing/editFile.php?cmd=rqEdit&file=textzone_right.inc.html}}, source=HybridStateVertexImpl{id=13, name=state13}, target=HybridStateVertexImpl{id=17, name=state17}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(153), "Event fired: Edit text zone");
			testSuiteHelper.runInCrawlingPlugins(17);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 17");

			testSuiteHelper.addStateToReportBuilder(17);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(17)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(17)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(17)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/SPAN[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/DIV[1]/SPAN[1]/TABLE[1]/TBODY[1]/TR[1]/TD[4]/SPAN[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/A[1], element=Element{node=[A: null], tag=A, text=Format, attributes={class=mceText, evlist=false, href=javascript:;, id=textContent_formatselect_text, onclick=return false;, onmousedown=return false;, tabindex=-1}}, source=HybridStateVertexImpl{id=17, name=state17}, target=HybridStateVertexImpl{id=63, name=state63}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1000006), "Event fired: Format");
			testSuiteHelper.runInCrawlingPlugins(63);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 63");

			testSuiteHelper.addStateToReportBuilder(63);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(63)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(63)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(63)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/SPAN[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/DIV[1]/SPAN[1]/TABLE[2]/TBODY[1]/TR[1]/TD[18]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[2]/A[1], element=Element{node=[A: null], tag=A, text=▼, attributes={anyaccess=none, class=mceOpen mce_forecolor, evlist=false, href=javascript:;, id=textContent_forecolor_open, onclick=return false;, onmousedown=return false;, role=button, tabindex=-1, title=Select Text Color}}, source=HybridStateVertexImpl{id=63, name=state63}, target=HybridStateVertexImpl{id=64, name=state64}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1000007), "Event fired: ▼");
			testSuiteHelper.runInCrawlingPlugins(64);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 64");

			testSuiteHelper.addStateToReportBuilder(64);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(64)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(64)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(64)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[3]/DIV[1]/TABLE[1]/TBODY[1]/TR[2]/TD[1]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={data-mce-color=#800000, evlist=false, href=javascript:;, id=_mce_item_30, role=option, style=background-color: rgb(128, 0, 0);, tabindex=-1, title=Maroon}}, source=HybridStateVertexImpl{id=64, name=state64}, target=HybridStateVertexImpl{id=212, name=state212}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(197), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(212);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 212");

			testSuiteHelper.addStateToReportBuilder(212);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(212)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(212)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(212)
					&& allStatesIdentical;	
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=52)
	public void method_BT63_path_153_1000006_199(){
		testSuiteHelper.newCurrentTestMethod("method_BT63_path_153_1000006_199", 52);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(13);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(13)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(13)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(13)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/P[2]/A[1], element=Element{node=[A: null], tag=A, text=Edit text zone, attributes={evlist=false, href=/claroline11110/claroline/admin/managing/editFile.php?cmd=rqEdit&file=textzone_right.inc.html}}, source=HybridStateVertexImpl{id=13, name=state13}, target=HybridStateVertexImpl{id=17, name=state17}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(153), "Event fired: Edit text zone");
			testSuiteHelper.runInCrawlingPlugins(17);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 17");

			testSuiteHelper.addStateToReportBuilder(17);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(17)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(17)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(17)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/SPAN[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/DIV[1]/SPAN[1]/TABLE[1]/TBODY[1]/TR[1]/TD[4]/SPAN[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/A[1], element=Element{node=[A: null], tag=A, text=Format, attributes={class=mceText, evlist=false, href=javascript:;, id=textContent_formatselect_text, onclick=return false;, onmousedown=return false;, tabindex=-1}}, source=HybridStateVertexImpl{id=17, name=state17}, target=HybridStateVertexImpl{id=63, name=state63}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1000006), "Event fired: Format");
			testSuiteHelper.runInCrawlingPlugins(63);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 63");

			testSuiteHelper.addStateToReportBuilder(63);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(63)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(63)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(63)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[2]/DIV[1]/TABLE[1]/TBODY[1]/TR[3]/TD[1]/A[1], element=Element{node=[A: null], tag=A, text=Address, attributes={anyaccess=none, aria-checked=false, aria-disabled=false, aria-pressed=false, evlist=false, href=javascript:;, id=mce_14_aria, onclick=return false;, onmousedown=return false;, role=option, tabindex=-1}}, source=HybridStateVertexImpl{id=63, name=state63}, target=HybridStateVertexImpl{id=140, name=state140}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(199), "Event fired: Address");
			testSuiteHelper.runInCrawlingPlugins(140);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 140");

			testSuiteHelper.addStateToReportBuilder(140);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(140)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(140)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(140)
					&& allStatesIdentical;	
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=53)
	public void method_BT321_path_56_140_183_200(){
		testSuiteHelper.newCurrentTestMethod("method_BT321_path_56_140_183_200", 53);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(13);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(13)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(13)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(13)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[3]/SPAN[1]/A[1], element=Element{node=[A: null], tag=A, text=Platform administration, attributes={evlist=false, href=/claroline11110/claroline/admin/, target=_top}}, source=HybridStateVertexImpl{id=13, name=state13}, target=HybridStateVertexImpl{id=68, name=state68}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(56), "Event fired: Platform administration");
			testSuiteHelper.runInCrawlingPlugins(68);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 68");

			testSuiteHelper.addStateToReportBuilder(68);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(68)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(68)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(68)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/UL[1]/LI[1]/UL[1]/LI[3]/A[1], element=Element{node=[A: null], tag=A, text=Send a message to all users, attributes={evlist=false, href=../messaging/sendmessage.php?cmd=rqMessageToAllUsers}}, source=HybridStateVertexImpl{id=68, name=state68}, target=HybridStateVertexImpl{id=240, name=state240}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/UL[1]/LI[1]/UL[1]/LI[1]/FORM[1]/INPUT[1]"), "CsBpUdKh"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/UL[1]/LI[2]/UL[1]/LI[1]/FORM[1]/INPUT[1]"), "KVKrEPXf"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(140), "Event fired: Send a message to all users");
			testSuiteHelper.runInCrawlingPlugins(240);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 240");

			testSuiteHelper.addStateToReportBuilder(240);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(240)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(240)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(240)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/SPAN[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/DIV[1]/SPAN[1]/TABLE[2]/TBODY[1]/TR[1]/TD[18]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[2]/A[1], element=Element{node=[A: null], tag=A, text=▼, attributes={anyaccess=action, class=mceOpen mce_forecolor, evlist=false, href=javascript:;, id=message_forecolor_open, onclick=return false;, onmousedown=return false;, role=button, tabindex=-1, title=Select Text Color}}, source=HybridStateVertexImpl{id=240, name=state240}, target=HybridStateVertexImpl{id=321, name=state321}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/INPUT[8]"), "XlVwRoRh"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(183), "Event fired: ▼");
			testSuiteHelper.runInCrawlingPlugins(321);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 321");

			testSuiteHelper.addStateToReportBuilder(321);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(321)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(321)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(321)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[2]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[3]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={data-mce-color=#333300, evlist=false, href=javascript:;, id=_mce_item_14, role=option, style=background-color: rgb(51, 51, 0);, tabindex=-1, title=Dark olive}}, source=HybridStateVertexImpl{id=321, name=state321}, target=HybridStateVertexImpl{id=322, name=state322}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/INPUT[8]"), "SwJQgaqe"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(200), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(322);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 322");

			testSuiteHelper.addStateToReportBuilder(322);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(322)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(322)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(322)
					&& allStatesIdentical;	
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=54)
	public void method_BT17_path_153_202_203(){
		testSuiteHelper.newCurrentTestMethod("method_BT17_path_153_202_203", 54);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(13);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(13)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(13)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(13)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/P[2]/A[1], element=Element{node=[A: null], tag=A, text=Edit text zone, attributes={evlist=false, href=/claroline11110/claroline/admin/managing/editFile.php?cmd=rqEdit&file=textzone_right.inc.html}}, source=HybridStateVertexImpl{id=13, name=state13}, target=HybridStateVertexImpl{id=17, name=state17}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(153), "Event fired: Edit text zone");
			testSuiteHelper.runInCrawlingPlugins(17);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 17");

			testSuiteHelper.addStateToReportBuilder(17);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(17)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(17)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(17)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/SPAN[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/DIV[1]/SPAN[1]/TABLE[2]/TBODY[1]/TR[1]/TD[19]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[2]/A[1], element=Element{node=[A: null], tag=A, text=▼, attributes={class=mceOpen mce_backcolor, evlist=false, href=javascript:;, id=textContent_backcolor_open, onclick=return false;, onmousedown=return false;, role=button, tabindex=-1, title=Select Background Color}}, source=HybridStateVertexImpl{id=17, name=state17}, target=HybridStateVertexImpl{id=368, name=state368}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(202), "Event fired: ▼");
			testSuiteHelper.runInCrawlingPlugins(368);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 368");

			testSuiteHelper.addStateToReportBuilder(368);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(368)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(368)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(368)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[2]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[4]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={data-mce-color=#003300, evlist=false, href=javascript:;, id=_mce_item_15, role=option, style=background-color: rgb(0, 51, 0);, tabindex=-1, title=Dark green}}, source=HybridStateVertexImpl{id=368, name=state368}, target=HybridStateVertexImpl{id=369, name=state369}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(203), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(369);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 369");

			testSuiteHelper.addStateToReportBuilder(369);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(369)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(369)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(369)
					&& allStatesIdentical;	
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=55)
	public void method_BT64_path_153_1000006_1000007_205(){
		testSuiteHelper.newCurrentTestMethod("method_BT64_path_153_1000006_1000007_205", 55);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(13);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(13)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(13)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(13)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/P[2]/A[1], element=Element{node=[A: null], tag=A, text=Edit text zone, attributes={evlist=false, href=/claroline11110/claroline/admin/managing/editFile.php?cmd=rqEdit&file=textzone_right.inc.html}}, source=HybridStateVertexImpl{id=13, name=state13}, target=HybridStateVertexImpl{id=17, name=state17}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(153), "Event fired: Edit text zone");
			testSuiteHelper.runInCrawlingPlugins(17);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 17");

			testSuiteHelper.addStateToReportBuilder(17);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(17)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(17)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(17)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/SPAN[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/DIV[1]/SPAN[1]/TABLE[1]/TBODY[1]/TR[1]/TD[4]/SPAN[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/A[1], element=Element{node=[A: null], tag=A, text=Format, attributes={class=mceText, evlist=false, href=javascript:;, id=textContent_formatselect_text, onclick=return false;, onmousedown=return false;, tabindex=-1}}, source=HybridStateVertexImpl{id=17, name=state17}, target=HybridStateVertexImpl{id=63, name=state63}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1000006), "Event fired: Format");
			testSuiteHelper.runInCrawlingPlugins(63);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 63");

			testSuiteHelper.addStateToReportBuilder(63);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(63)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(63)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(63)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/SPAN[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/DIV[1]/SPAN[1]/TABLE[2]/TBODY[1]/TR[1]/TD[18]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[2]/A[1], element=Element{node=[A: null], tag=A, text=▼, attributes={anyaccess=none, class=mceOpen mce_forecolor, evlist=false, href=javascript:;, id=textContent_forecolor_open, onclick=return false;, onmousedown=return false;, role=button, tabindex=-1, title=Select Text Color}}, source=HybridStateVertexImpl{id=63, name=state63}, target=HybridStateVertexImpl{id=64, name=state64}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1000007), "Event fired: ▼");
			testSuiteHelper.runInCrawlingPlugins(64);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 64");

			testSuiteHelper.addStateToReportBuilder(64);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(64)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(64)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(64)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[3]/DIV[1]/TABLE[1]/TBODY[1]/TR[2]/TD[2]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={data-mce-color=#FF6600, evlist=false, href=javascript:;, id=_mce_item_31, role=option, style=background-color: rgb(255, 102, 0);, tabindex=-1, title=Orange}}, source=HybridStateVertexImpl{id=64, name=state64}, target=HybridStateVertexImpl{id=212, name=state212}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(205), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(212);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 212");

			testSuiteHelper.addStateToReportBuilder(212);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(212)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(212)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(212)
					&& allStatesIdentical;	
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=56)
	public void method_BT286_path_56_106_165_207_208_209(){
		testSuiteHelper.newCurrentTestMethod("method_BT286_path_56_106_165_207_208_209", 56);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(13);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(13)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(13)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(13)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[3]/SPAN[1]/A[1], element=Element{node=[A: null], tag=A, text=Platform administration, attributes={evlist=false, href=/claroline11110/claroline/admin/, target=_top}}, source=HybridStateVertexImpl{id=13, name=state13}, target=HybridStateVertexImpl{id=68, name=state68}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(56), "Event fired: Platform administration");
			testSuiteHelper.runInCrawlingPlugins(68);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 68");

			testSuiteHelper.addStateToReportBuilder(68);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(68)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(68)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(68)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/UL[1]/LI[1]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=User list, attributes={evlist=false, href=admin_users.php}}, source=HybridStateVertexImpl{id=68, name=state68}, target=HybridStateVertexImpl{id=145, name=state145}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/UL[1]/LI[1]/UL[1]/LI[1]/FORM[1]/INPUT[1]"), "ebIZwepn"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/UL[1]/LI[2]/UL[1]/LI[1]/FORM[1]/INPUT[1]"), "FPLCMqiI"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(106), "Event fired: User list");
			testSuiteHelper.runInCrawlingPlugins(145);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 145");

			testSuiteHelper.addStateToReportBuilder(145);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(145)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(145)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(145)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/TABLE[2]/TBODY[1]/TR[1]/TD[7]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={evlist=false, href=admin_profile.php?uidToEdit=1&cfrom=ulist}}, source=HybridStateVertexImpl{id=145, name=state145}, target=HybridStateVertexImpl{id=286, name=state286}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/FORM[1]/INPUT[1]"), "cpxWnDDK"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(165), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(286);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 286");

			testSuiteHelper.addStateToReportBuilder(286);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(286)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(286)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(286)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[2]/UL[1]/LI[3]/A[1], element=Element{node=[A: null], tag=A, text=User course list, attributes={evlist=false, href=adminusercourses.php?uidToEdit=1, style=background-image: url(/claroline11110/web/img/course.png?1232376376); background-repeat: no-repeat; background-position: left center; padding-left: 20px;}}, source=HybridStateVertexImpl{id=286, name=state286}, target=HybridStateVertexImpl{id=379, name=state379}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DL[1]/DD[1]/INPUT[1]"), "Stocco"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DL[1]/DD[2]/INPUT[1]"), "Andrea"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DL[1]/DD[3]/INPUT[1]"), "vAViFfYy"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[2]/DL[1]/DD[2]/INPUT[1]"), "FrlHTzhZ"));
			formInputs.add(new FormInput(FormInput.InputType.PASSWORD, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[2]/DL[1]/DD[5]/INPUT[1]"), "admin"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[3]/DL[1]/DD[1]/INPUT[1]"), "astocco@ece.ubc.ca"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[3]/DL[1]/DD[2]/INPUT[1]"), "BVdiyXfV"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[3]/DL[1]/DD[3]/INPUT[1]"), "tOHPxxOE"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[4]/DL[1]/DD[1]/INPUT[1]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[4]/DL[1]/DD[1]/INPUT[2]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[4]/DL[1]/DD[1]/SPAN[1]/INPUT[1]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[2]/DL[1]/DD[7]/SELECT[1]"), "temp"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(207), "Event fired: User course list");
			testSuiteHelper.runInCrawlingPlugins(379);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 379");

			testSuiteHelper.addStateToReportBuilder(379);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(379)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(379)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(379)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[3]/DIV[1]/UL[1]/LI[3]/A[1], element=Element{node=[A: null], tag=A, text=User course list, attributes={anyaccess=action, evlist=false, href=/claroline11110/claroline/admin/adminusercourses.php, target=_top}}, source=HybridStateVertexImpl{id=379, name=state379}, target=HybridStateVertexImpl{id=380, name=state380}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(208), "Event fired: User course list");
			testSuiteHelper.runInCrawlingPlugins(380);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 380");

			testSuiteHelper.addStateToReportBuilder(380);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(380)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(380)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(380)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[2]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=User settings, attributes={anyaccess=none, evlist=false, href=admin_profile.php?uidToEdit=0, style=background-image: url(/claroline11110/web/img/usersetting.png?1232376376); background-repeat: no-repeat; background-position: left center; padding-left: 20px;}}, source=HybridStateVertexImpl{id=380, name=state380}, target=HybridStateVertexImpl{id=381, name=state381}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(209), "Event fired: User settings");
			testSuiteHelper.runInCrawlingPlugins(381);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 381");

			testSuiteHelper.addStateToReportBuilder(381);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(381)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(381)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(381)
					&& allStatesIdentical;	
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=57)
	public void method_BT145_path_56_106_211_212_213(){
		testSuiteHelper.newCurrentTestMethod("method_BT145_path_56_106_211_212_213", 57);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(13);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(13)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(13)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(13)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[3]/SPAN[1]/A[1], element=Element{node=[A: null], tag=A, text=Platform administration, attributes={evlist=false, href=/claroline11110/claroline/admin/, target=_top}}, source=HybridStateVertexImpl{id=13, name=state13}, target=HybridStateVertexImpl{id=68, name=state68}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(56), "Event fired: Platform administration");
			testSuiteHelper.runInCrawlingPlugins(68);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 68");

			testSuiteHelper.addStateToReportBuilder(68);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(68)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(68)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(68)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/UL[1]/LI[1]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=User list, attributes={evlist=false, href=admin_users.php}}, source=HybridStateVertexImpl{id=68, name=state68}, target=HybridStateVertexImpl{id=145, name=state145}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/UL[1]/LI[1]/UL[1]/LI[1]/FORM[1]/INPUT[1]"), "ebIZwepn"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/UL[1]/LI[2]/UL[1]/LI[1]/FORM[1]/INPUT[1]"), "FPLCMqiI"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(106), "Event fired: User list");
			testSuiteHelper.runInCrawlingPlugins(145);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 145");

			testSuiteHelper.addStateToReportBuilder(145);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(145)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(145)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(145)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/TABLE[2]/TBODY[1]/TR[1]/TD[9]/A[1], element=Element{node=[A: null], tag=A, text=0 course(s), attributes={class=showUserCourses, evlist=false, href=adminusercourses.php?uidToEdit=1&cfrom=ulist}}, source=HybridStateVertexImpl{id=145, name=state145}, target=HybridStateVertexImpl{id=386, name=state386}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/FORM[1]/INPUT[1]"), "iJCzhbUi"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(211), "Event fired: 0 course(s)");
			testSuiteHelper.runInCrawlingPlugins(386);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 386");

			testSuiteHelper.addStateToReportBuilder(386);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(386)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(386)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(386)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[2]/UL[1]/LI[4]/A[1], element=Element{node=[A: null], tag=A, text=Back to user list, attributes={anyaccess=none, evlist=false, href=admin_users.php, style=background-image: url(/claroline11110/web/img/back.png?1306428622); background-repeat: no-repeat; background-position: left center; padding-left: 20px;}}, source=HybridStateVertexImpl{id=386, name=state386}, target=HybridStateVertexImpl{id=145, name=state145}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(212), "Event fired: Back to user list");
			testSuiteHelper.runInCrawlingPlugins(145);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 145");

			testSuiteHelper.addStateToReportBuilder(145);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(145)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(145)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(145)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/TABLE[2]/TBODY[1]/TR[1]/TD[10]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={evlist=false, href=/claroline11110/claroline/admin/admin_users.php?cmd=exDelete&user_id=1&offset=0, onclick=return ADMIN.confirmationDel('John Doe (1)');}}, source=HybridStateVertexImpl{id=145, name=state145}, target=HybridStateVertexImpl{id=388, name=state388}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/FORM[1]/INPUT[1]"), "ojpdheKJ"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(213), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(388);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 388");

			testSuiteHelper.addStateToReportBuilder(388);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(388)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(388)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(388)
					&& allStatesIdentical;	
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=58)
	public void method_BT68_path_56_214_215_217_218(){
		testSuiteHelper.newCurrentTestMethod("method_BT68_path_56_214_215_217_218", 58);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(13);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(13)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(13)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(13)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[3]/SPAN[1]/A[1], element=Element{node=[A: null], tag=A, text=Platform administration, attributes={evlist=false, href=/claroline11110/claroline/admin/, target=_top}}, source=HybridStateVertexImpl{id=13, name=state13}, target=HybridStateVertexImpl{id=68, name=state68}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(56), "Event fired: Platform administration");
			testSuiteHelper.runInCrawlingPlugins(68);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 68");

			testSuiteHelper.addStateToReportBuilder(68);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(68)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(68)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(68)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/UL[1]/LI[3]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Configuration, attributes={evlist=false, href=tool/config_list.php}}, source=HybridStateVertexImpl{id=68, name=state68}, target=HybridStateVertexImpl{id=391, name=state391}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/UL[1]/LI[1]/UL[1]/LI[1]/FORM[1]/INPUT[1]"), "CXVBwgXO"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/UL[1]/LI[2]/UL[1]/LI[1]/FORM[1]/INPUT[1]"), "HbLjBssU"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(214), "Event fired: Configuration");
			testSuiteHelper.runInCrawlingPlugins(391);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 391");

			testSuiteHelper.addStateToReportBuilder(391);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(391)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(391)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(391)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/UL[7]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Internal messaging system, attributes={anyaccess=none, evlist=false, href=config_edit.php?config_code=CLMSG}}, source=HybridStateVertexImpl{id=391, name=state391}, target=HybridStateVertexImpl{id=392, name=state392}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(215), "Event fired: Internal messaging system");
			testSuiteHelper.runInCrawlingPlugins(392);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 392");

			testSuiteHelper.addStateToReportBuilder(392);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(392)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(392)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(392)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/TABLE[1]/TBODY[1]/TR[4]/TD[2]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={evlist=false, href=/claroline11110}}, source=HybridStateVertexImpl{id=392, name=state392}, target=HybridStateVertexImpl{id=13, name=state13}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/TABLE[1]/TBODY[1]/TR[1]/TD[2]/INPUT[1]"), "wxZAXWKM"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/TABLE[1]/TBODY[1]/TR[2]/TD[2]/INPUT[1]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/TABLE[1]/TBODY[1]/TR[2]/TD[2]/INPUT[2]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/TABLE[1]/TBODY[1]/TR[3]/TD[2]/INPUT[1]"), "0"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/TABLE[1]/TBODY[1]/TR[3]/TD[2]/INPUT[2]"), "1"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(217), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(13);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 13");

			testSuiteHelper.addStateToReportBuilder(13);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(13)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(13)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(13)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Enrol on a new course, attributes={class=userCommandsItem, evlist=false, href=/claroline11110/claroline/auth/courses.php?cmd=rqReg&categoryId=0}}, source=HybridStateVertexImpl{id=13, name=state13}, target=HybridStateVertexImpl{id=288, name=state288}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(218), "Event fired: Enrol on a new course");
			testSuiteHelper.runInCrawlingPlugins(288);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 288");

			testSuiteHelper.addStateToReportBuilder(288);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(288)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(288)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(288)
					&& allStatesIdentical;	
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=59)
	public void method_BT321_path_56_140_183_220(){
		testSuiteHelper.newCurrentTestMethod("method_BT321_path_56_140_183_220", 59);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(13);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(13)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(13)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(13)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[3]/SPAN[1]/A[1], element=Element{node=[A: null], tag=A, text=Platform administration, attributes={evlist=false, href=/claroline11110/claroline/admin/, target=_top}}, source=HybridStateVertexImpl{id=13, name=state13}, target=HybridStateVertexImpl{id=68, name=state68}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(56), "Event fired: Platform administration");
			testSuiteHelper.runInCrawlingPlugins(68);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 68");

			testSuiteHelper.addStateToReportBuilder(68);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(68)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(68)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(68)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/UL[1]/LI[1]/UL[1]/LI[3]/A[1], element=Element{node=[A: null], tag=A, text=Send a message to all users, attributes={evlist=false, href=../messaging/sendmessage.php?cmd=rqMessageToAllUsers}}, source=HybridStateVertexImpl{id=68, name=state68}, target=HybridStateVertexImpl{id=240, name=state240}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/UL[1]/LI[1]/UL[1]/LI[1]/FORM[1]/INPUT[1]"), "CsBpUdKh"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/UL[1]/LI[2]/UL[1]/LI[1]/FORM[1]/INPUT[1]"), "KVKrEPXf"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(140), "Event fired: Send a message to all users");
			testSuiteHelper.runInCrawlingPlugins(240);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 240");

			testSuiteHelper.addStateToReportBuilder(240);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(240)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(240)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(240)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/SPAN[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/DIV[1]/SPAN[1]/TABLE[2]/TBODY[1]/TR[1]/TD[18]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[2]/A[1], element=Element{node=[A: null], tag=A, text=▼, attributes={anyaccess=action, class=mceOpen mce_forecolor, evlist=false, href=javascript:;, id=message_forecolor_open, onclick=return false;, onmousedown=return false;, role=button, tabindex=-1, title=Select Text Color}}, source=HybridStateVertexImpl{id=240, name=state240}, target=HybridStateVertexImpl{id=321, name=state321}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/INPUT[8]"), "XlVwRoRh"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(183), "Event fired: ▼");
			testSuiteHelper.runInCrawlingPlugins(321);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 321");

			testSuiteHelper.addStateToReportBuilder(321);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(321)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(321)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(321)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[2]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[5]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={data-mce-color=#003366, evlist=false, href=javascript:;, id=_mce_item_16, role=option, style=background-color: rgb(0, 51, 102);, tabindex=-1, title=Dark azure}}, source=HybridStateVertexImpl{id=321, name=state321}, target=HybridStateVertexImpl{id=322, name=state322}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/INPUT[8]"), "NeFKZBUT"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(220), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(322);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 322");

			testSuiteHelper.addStateToReportBuilder(322);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(322)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(322)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(322)
					&& allStatesIdentical;	
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=60)
	public void method_BT368_path_153_202_222(){
		testSuiteHelper.newCurrentTestMethod("method_BT368_path_153_202_222", 60);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(13);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(13)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(13)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(13)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/P[2]/A[1], element=Element{node=[A: null], tag=A, text=Edit text zone, attributes={evlist=false, href=/claroline11110/claroline/admin/managing/editFile.php?cmd=rqEdit&file=textzone_right.inc.html}}, source=HybridStateVertexImpl{id=13, name=state13}, target=HybridStateVertexImpl{id=17, name=state17}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(153), "Event fired: Edit text zone");
			testSuiteHelper.runInCrawlingPlugins(17);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 17");

			testSuiteHelper.addStateToReportBuilder(17);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(17)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(17)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(17)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/SPAN[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/DIV[1]/SPAN[1]/TABLE[2]/TBODY[1]/TR[1]/TD[19]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[2]/A[1], element=Element{node=[A: null], tag=A, text=▼, attributes={class=mceOpen mce_backcolor, evlist=false, href=javascript:;, id=textContent_backcolor_open, onclick=return false;, onmousedown=return false;, role=button, tabindex=-1, title=Select Background Color}}, source=HybridStateVertexImpl{id=17, name=state17}, target=HybridStateVertexImpl{id=368, name=state368}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(202), "Event fired: ▼");
			testSuiteHelper.runInCrawlingPlugins(368);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 368");

			testSuiteHelper.addStateToReportBuilder(368);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(368)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(368)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(368)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[2]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[6]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={data-mce-color=#000080, evlist=false, href=javascript:;, id=_mce_item_17, role=option, style=background-color: rgb(0, 0, 128);, tabindex=-1, title=Navy Blue}}, source=HybridStateVertexImpl{id=368, name=state368}, target=HybridStateVertexImpl{id=369, name=state369}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(222), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(369);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 369");

			testSuiteHelper.addStateToReportBuilder(369);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(369)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(369)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(369)
					&& allStatesIdentical;	
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=61)
	public void method_BT64_path_153_1000006_1000007_224(){
		testSuiteHelper.newCurrentTestMethod("method_BT64_path_153_1000006_1000007_224", 61);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(13);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(13)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(13)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(13)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/P[2]/A[1], element=Element{node=[A: null], tag=A, text=Edit text zone, attributes={evlist=false, href=/claroline11110/claroline/admin/managing/editFile.php?cmd=rqEdit&file=textzone_right.inc.html}}, source=HybridStateVertexImpl{id=13, name=state13}, target=HybridStateVertexImpl{id=17, name=state17}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(153), "Event fired: Edit text zone");
			testSuiteHelper.runInCrawlingPlugins(17);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 17");

			testSuiteHelper.addStateToReportBuilder(17);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(17)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(17)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(17)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/SPAN[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/DIV[1]/SPAN[1]/TABLE[1]/TBODY[1]/TR[1]/TD[4]/SPAN[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/A[1], element=Element{node=[A: null], tag=A, text=Format, attributes={class=mceText, evlist=false, href=javascript:;, id=textContent_formatselect_text, onclick=return false;, onmousedown=return false;, tabindex=-1}}, source=HybridStateVertexImpl{id=17, name=state17}, target=HybridStateVertexImpl{id=63, name=state63}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1000006), "Event fired: Format");
			testSuiteHelper.runInCrawlingPlugins(63);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 63");

			testSuiteHelper.addStateToReportBuilder(63);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(63)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(63)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(63)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/SPAN[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/DIV[1]/SPAN[1]/TABLE[2]/TBODY[1]/TR[1]/TD[18]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[2]/A[1], element=Element{node=[A: null], tag=A, text=▼, attributes={anyaccess=none, class=mceOpen mce_forecolor, evlist=false, href=javascript:;, id=textContent_forecolor_open, onclick=return false;, onmousedown=return false;, role=button, tabindex=-1, title=Select Text Color}}, source=HybridStateVertexImpl{id=63, name=state63}, target=HybridStateVertexImpl{id=64, name=state64}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1000007), "Event fired: ▼");
			testSuiteHelper.runInCrawlingPlugins(64);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 64");

			testSuiteHelper.addStateToReportBuilder(64);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(64)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(64)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(64)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[3]/DIV[1]/TABLE[1]/TBODY[1]/TR[2]/TD[3]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={data-mce-color=#808000, evlist=false, href=javascript:;, id=_mce_item_32, role=option, style=background-color: rgb(128, 128, 0);, tabindex=-1, title=Olive}}, source=HybridStateVertexImpl{id=64, name=state64}, target=HybridStateVertexImpl{id=212, name=state212}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(224), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(212);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 212");

			testSuiteHelper.addStateToReportBuilder(212);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(212)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(212)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(212)
					&& allStatesIdentical;	
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=62)
	public void method_BT287_path_56_106_165_166_226_227_228(){
		testSuiteHelper.newCurrentTestMethod("method_BT287_path_56_106_165_166_226_227_228", 62);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(13);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(13)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(13)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(13)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[3]/SPAN[1]/A[1], element=Element{node=[A: null], tag=A, text=Platform administration, attributes={evlist=false, href=/claroline11110/claroline/admin/, target=_top}}, source=HybridStateVertexImpl{id=13, name=state13}, target=HybridStateVertexImpl{id=68, name=state68}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(56), "Event fired: Platform administration");
			testSuiteHelper.runInCrawlingPlugins(68);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 68");

			testSuiteHelper.addStateToReportBuilder(68);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(68)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(68)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(68)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/UL[1]/LI[1]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=User list, attributes={evlist=false, href=admin_users.php}}, source=HybridStateVertexImpl{id=68, name=state68}, target=HybridStateVertexImpl{id=145, name=state145}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/UL[1]/LI[1]/UL[1]/LI[1]/FORM[1]/INPUT[1]"), "ebIZwepn"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/UL[1]/LI[2]/UL[1]/LI[1]/FORM[1]/INPUT[1]"), "FPLCMqiI"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(106), "Event fired: User list");
			testSuiteHelper.runInCrawlingPlugins(145);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 145");

			testSuiteHelper.addStateToReportBuilder(145);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(145)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(145)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(145)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/TABLE[2]/TBODY[1]/TR[1]/TD[7]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={evlist=false, href=admin_profile.php?uidToEdit=1&cfrom=ulist}}, source=HybridStateVertexImpl{id=145, name=state145}, target=HybridStateVertexImpl{id=286, name=state286}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/FORM[1]/INPUT[1]"), "cpxWnDDK"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(165), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(286);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 286");

			testSuiteHelper.addStateToReportBuilder(286);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(286)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(286)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(286)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[2]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Enrol to a new course, attributes={evlist=false, href=../auth/courses.php?cmd=rqReg&uidToEdit=1&fromAdmin=settings&category=, style=background-image: url(/claroline11110/web/img/enroll.png?1232376376); background-repeat: no-repeat; background-position: left center; padding-left: 20px;}}, source=HybridStateVertexImpl{id=286, name=state286}, target=HybridStateVertexImpl{id=287, name=state287}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DL[1]/DD[1]/INPUT[1]"), "Stocco"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DL[1]/DD[2]/INPUT[1]"), "Andrea"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DL[1]/DD[3]/INPUT[1]"), "OhPWyrzM"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[2]/DL[1]/DD[2]/INPUT[1]"), "BuwKabLI"));
			formInputs.add(new FormInput(FormInput.InputType.PASSWORD, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[2]/DL[1]/DD[5]/INPUT[1]"), "admin"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[3]/DL[1]/DD[1]/INPUT[1]"), "astocco@ece.ubc.ca"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[3]/DL[1]/DD[2]/INPUT[1]"), "RlAjQwNe"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[3]/DL[1]/DD[3]/INPUT[1]"), "OCdHkNjE"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[4]/DL[1]/DD[1]/INPUT[1]"), "0"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[4]/DL[1]/DD[1]/INPUT[2]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[4]/DL[1]/DD[1]/SPAN[1]/INPUT[1]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[2]/DL[1]/DD[7]/SELECT[1]"), "claroline"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(166), "Event fired: Enrol to a new course");
			testSuiteHelper.runInCrawlingPlugins(287);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 287");

			testSuiteHelper.addStateToReportBuilder(287);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(287)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(287)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(287)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Search, attributes={evlist=false, type=submit}}, source=HybridStateVertexImpl{id=287, name=state287}, target=HybridStateVertexImpl{id=416, name=state416}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/INPUT[1]"), "BMVrMGBR"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(226), "Event fired: Search");
			testSuiteHelper.runInCrawlingPlugins(416);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 416");

			testSuiteHelper.addStateToReportBuilder(416);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(416)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(416)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(416)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/P[3]/A[1], element=Element{node=[A: null], tag=A, text=Back to user settings, attributes={class=backLink, evlist=false, href=../admin/admin_profile.php?uidToEdit=1&fromAdmin=settings&asTeacher=false, title=Back to user settings}}, source=HybridStateVertexImpl{id=416, name=state416}, target=HybridStateVertexImpl{id=417, name=state417}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/INPUT[1]"), "wwNMGSAS"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(227), "Event fired: Back to user settings");
			testSuiteHelper.runInCrawlingPlugins(417);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 417");

			testSuiteHelper.addStateToReportBuilder(417);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(417)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(417)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(417)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[2]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Enrol to a new course, attributes={anyaccess=none, evlist=false, href=../auth/courses.php?cmd=rqReg&uidToEdit=1&fromAdmin=settings&category=, style=background-image: url(/claroline11110/web/img/enroll.png?1232376376); background-repeat: no-repeat; background-position: left center; padding-left: 20px;}}, source=HybridStateVertexImpl{id=417, name=state417}, target=HybridStateVertexImpl{id=287, name=state287}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DL[1]/DD[1]/INPUT[1]"), "Stocco"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DL[1]/DD[2]/INPUT[1]"), "Andrea"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DL[1]/DD[3]/INPUT[1]"), "nCBJCFbi"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[2]/DL[1]/DD[2]/INPUT[1]"), "CtjScsrx"));
			formInputs.add(new FormInput(FormInput.InputType.PASSWORD, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[2]/DL[1]/DD[5]/INPUT[1]"), "admin"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[3]/DL[1]/DD[1]/INPUT[1]"), "astocco@ece.ubc.ca"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[3]/DL[1]/DD[2]/INPUT[1]"), "WMjHddYR"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[3]/DL[1]/DD[3]/INPUT[1]"), "bJgNEYxf"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[4]/DL[1]/DD[1]/INPUT[1]"), "0"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[4]/DL[1]/DD[1]/INPUT[2]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[4]/DL[1]/DD[1]/SPAN[1]/INPUT[1]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[2]/DL[1]/DD[7]/SELECT[1]"), "temp"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(228), "Event fired: Enrol to a new course");
			testSuiteHelper.runInCrawlingPlugins(287);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 287");

			testSuiteHelper.addStateToReportBuilder(287);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(287)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(287)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(287)
					&& allStatesIdentical;	
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=63)
	public void method_BT240_path_56_140_229(){
		testSuiteHelper.newCurrentTestMethod("method_BT240_path_56_140_229", 63);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(13);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(13)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(13)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(13)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[3]/SPAN[1]/A[1], element=Element{node=[A: null], tag=A, text=Platform administration, attributes={evlist=false, href=/claroline11110/claroline/admin/, target=_top}}, source=HybridStateVertexImpl{id=13, name=state13}, target=HybridStateVertexImpl{id=68, name=state68}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(56), "Event fired: Platform administration");
			testSuiteHelper.runInCrawlingPlugins(68);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 68");

			testSuiteHelper.addStateToReportBuilder(68);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(68)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(68)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(68)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/UL[1]/LI[1]/UL[1]/LI[3]/A[1], element=Element{node=[A: null], tag=A, text=Send a message to all users, attributes={evlist=false, href=../messaging/sendmessage.php?cmd=rqMessageToAllUsers}}, source=HybridStateVertexImpl{id=68, name=state68}, target=HybridStateVertexImpl{id=240, name=state240}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/UL[1]/LI[1]/UL[1]/LI[1]/FORM[1]/INPUT[1]"), "CsBpUdKh"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/UL[1]/LI[2]/UL[1]/LI[1]/FORM[1]/INPUT[1]"), "KVKrEPXf"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(140), "Event fired: Send a message to all users");
			testSuiteHelper.runInCrawlingPlugins(240);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 240");

			testSuiteHelper.addStateToReportBuilder(240);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(240)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(240)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(240)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/SPAN[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/DIV[1]/SPAN[1]/TABLE[1]/TBODY[1]/TR[1]/TD[2]/SPAN[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/A[1], element=Element{node=[A: null], tag=A, text=Font Family, attributes={anyaccess=none, class=mceText mceTitle, evlist=false, href=javascript:;, id=message_fontselect_text, onclick=return false;, onmousedown=return false;, tabindex=-1}}, source=HybridStateVertexImpl{id=240, name=state240}, target=HybridStateVertexImpl{id=422, name=state422}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/INPUT[8]"), "QQCClAoQ"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(229), "Event fired: Font Family");
			testSuiteHelper.runInCrawlingPlugins(422);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 422");

			testSuiteHelper.addStateToReportBuilder(422);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(422)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(422)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(422)
					&& allStatesIdentical;	
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=64)
	public void method_BT17_path_153_232(){
		testSuiteHelper.newCurrentTestMethod("method_BT17_path_153_232", 64);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(13);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(13)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(13)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(13)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/P[2]/A[1], element=Element{node=[A: null], tag=A, text=Edit text zone, attributes={evlist=false, href=/claroline11110/claroline/admin/managing/editFile.php?cmd=rqEdit&file=textzone_right.inc.html}}, source=HybridStateVertexImpl{id=13, name=state13}, target=HybridStateVertexImpl{id=17, name=state17}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(153), "Event fired: Edit text zone");
			testSuiteHelper.runInCrawlingPlugins(17);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 17");

			testSuiteHelper.addStateToReportBuilder(17);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(17)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(17)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(17)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/SPAN[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/DIV[1]/SPAN[1]/TABLE[1]/TBODY[1]/TR[1]/TD[2]/SPAN[1]/TABLE[1]/TBODY[1]/TR[1]/TD[2]/A[1], element=Element{node=[A: null], tag=A, text=▼, attributes={class=mceOpen, evlist=false, href=javascript:;, id=textContent_fontselect_open, onclick=return false;, onmousedown=return false;, tabindex=-1}}, source=HybridStateVertexImpl{id=17, name=state17}, target=HybridStateVertexImpl{id=426, name=state426}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(232), "Event fired: ▼");
			testSuiteHelper.runInCrawlingPlugins(426);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 426");

			testSuiteHelper.addStateToReportBuilder(426);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(426)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(426)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(426)
					&& allStatesIdentical;	
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=65)
	public void method_BT300_path_56_58_60_175_236(){
		testSuiteHelper.newCurrentTestMethod("method_BT300_path_56_58_60_175_236", 65);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(13);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(13)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(13)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(13)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[3]/SPAN[1]/A[1], element=Element{node=[A: null], tag=A, text=Platform administration, attributes={evlist=false, href=/claroline11110/claroline/admin/, target=_top}}, source=HybridStateVertexImpl{id=13, name=state13}, target=HybridStateVertexImpl{id=68, name=state68}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(56), "Event fired: Platform administration");
			testSuiteHelper.runInCrawlingPlugins(68);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 68");

			testSuiteHelper.addStateToReportBuilder(68);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(68)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(68)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(68)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/UL[1]/LI[1]/UL[1]/LI[1]/FORM[1]/SMALL[1]/A[1], element=Element{node=[A: null], tag=A, text=Advanced, attributes={evlist=false, href=advanced_user_search.php}}, source=HybridStateVertexImpl{id=68, name=state68}, target=HybridStateVertexImpl{id=70, name=state70}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/UL[1]/LI[1]/UL[1]/LI[1]/FORM[1]/INPUT[1]"), "EewRXilN"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/UL[1]/LI[2]/UL[1]/LI[1]/FORM[1]/INPUT[1]"), "EIRqChgC"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(58), "Event fired: Advanced");
			testSuiteHelper.runInCrawlingPlugins(70);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 70");

			testSuiteHelper.addStateToReportBuilder(70);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(70)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(70)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(70)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/TABLE[1]/TBODY[1]/TR[7]/TD[2]/INPUT[1], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={class=claroButton, evlist=false, type=submit, value=Search user}}, source=HybridStateVertexImpl{id=70, name=state70}, target=HybridStateVertexImpl{id=72, name=state72}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/TABLE[1]/TBODY[1]/TR[1]/TD[2]/INPUT[1]"), "nAdRVyJU"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/TABLE[1]/TBODY[1]/TR[2]/TD[2]/INPUT[1]"), "TrsDlXDK"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/TABLE[1]/TBODY[1]/TR[3]/TD[2]/INPUT[1]"), "IWmJjRbh"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/TABLE[1]/TBODY[1]/TR[4]/TD[2]/INPUT[1]"), "IJKQpwAr"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/TABLE[1]/TBODY[1]/TR[5]/TD[2]/INPUT[1]"), "IFNMQfjY"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/TABLE[1]/TBODY[1]/TR[6]/TD[2]/SELECT[1]"), "Student"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(60), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(72);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 72");

			testSuiteHelper.addStateToReportBuilder(72);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(72)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(72)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(72)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[2]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Reset all user passwords, attributes={evlist=false, href=/claroline11110/claroline/admin/admin_users.php?cmd=rqResetAllPasswords, style=background-image: url(/claroline11110/web/img/locked.png?1232376376); background-repeat: no-repeat; background-position: left center; padding-left: 20px;}}, source=HybridStateVertexImpl{id=72, name=state72}, target=HybridStateVertexImpl{id=300, name=state300}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/FORM[1]/INPUT[1]"), "TVwUqtlC"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(175), "Event fired: Reset all user passwords");
			testSuiteHelper.runInCrawlingPlugins(300);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 300");

			testSuiteHelper.addStateToReportBuilder(300);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(300)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(300)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(300)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[2]/FORM[1]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={evlist=false, href=/claroline11110/claroline/admin/admin_users.php}}, source=HybridStateVertexImpl{id=300, name=state300}, target=HybridStateVertexImpl{id=72, name=state72}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[2]/FORM[1]/INPUT[2]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/FORM[1]/INPUT[1]"), "tHhjUoqJ"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(236), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(72);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 72");

			testSuiteHelper.addStateToReportBuilder(72);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(72)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(72)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(72)
					&& allStatesIdentical;	
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=66)
	public void method_BT290_path_169_239_240_241_242_244(){
		testSuiteHelper.newCurrentTestMethod("method_BT290_path_169_239_240_241_242_244", 66);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(13);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(13)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(13)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(13)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Create a course site, attributes={class=userCommandsItem, evlist=false, href=/claroline11110/claroline/course/create.php}}, source=HybridStateVertexImpl{id=13, name=state13}, target=HybridStateVertexImpl{id=290, name=state290}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(169), "Event fired: Create a course site");
			testSuiteHelper.runInCrawlingPlugins(290);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 290");

			testSuiteHelper.addStateToReportBuilder(290);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(290)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(290)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(290)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/DL[1]/DT[1]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={evlist=false, href=/claroline11110/index.php}}, source=HybridStateVertexImpl{id=290, name=state290}, target=HybridStateVertexImpl{id=13, name=state13}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[1]/DL[1]/DD[1]/INPUT[1]"), "sLMPxPXL"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[1]/DL[1]/DD[2]/INPUT[1]"), "GnMErrVu"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[1]/DL[1]/DD[5]/INPUT[1]"), "QvLjOvfF"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[1]/DL[1]/DD[6]/INPUT[1]"), "jdoe@mydomain.net"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[1]/DL[1]/DD[7]/INPUT[1]"), "0"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[1]/DL[1]/DD[7]/INPUT[2]"), "0"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[1]/DL[1]/DD[7]/INPUT[3]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[1]/DL[1]/DD[8]/INPUT[1]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[1]/DL[1]/DD[8]/BLOCKQUOTE[1]/INPUT[1]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[1]/DL[1]/DD[8]/BLOCKQUOTE[1]/INPUT[2]"), "0"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[1]/DL[1]/DD[8]/BLOCKQUOTE[1]/INPUT[3]"), "SGEpWuKO"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[1]/DL[1]/DD[8]/INPUT[2]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[2]/DIV[1]/DL[1]/DD[1]/INPUT[1]"), "DSqQFRjm"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[2]/DIV[1]/DL[1]/DD[2]/INPUT[1]"), "azfPCHrs"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[3]/DIV[1]/DL[1]/DD[1]/INPUT[1]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[3]/DIV[1]/DL[1]/DD[1]/INPUT[2]"), "0"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[3]/DIV[1]/DL[1]/DD[2]/INPUT[1]"), "LGPzJElY"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[3]/DIV[1]/DL[2]/DD[1]/INPUT[1]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[3]/DIV[1]/DL[2]/DD[1]/INPUT[2]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[3]/DIV[1]/DL[2]/DD[1]/BLOCKQUOTE[1]/INPUT[1]"), "0"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[3]/DIV[1]/DL[2]/DD[1]/INPUT[3]"), "0"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[3]/DIV[1]/DL[2]/DD[1]/BLOCKQUOTE[2]/INPUT[1]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[3]/DIV[1]/DL[2]/DD[1]/BLOCKQUOTE[2]/INPUT[2]"), "0"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[3]/DIV[1]/DL[2]/DD[1]/BLOCKQUOTE[2]/INPUT[3]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[1]/DL[1]/DD[3]/TABLE[1]/TBODY[1]/TR[1]/TD[3]/SELECT[1]"), "Economics"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[1]/DL[1]/DD[4]/SELECT[1]"), "English"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[3]/DIV[1]/DL[2]/DD[1]/SELECT[1]"), "23"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[3]/DIV[1]/DL[2]/DD[1]/SELECT[2]"), "8"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[3]/DIV[1]/DL[2]/DD[1]/SELECT[3]"), "2021"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.id, "course_expirationDay"), "23"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(239), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(13);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 13");

			testSuiteHelper.addStateToReportBuilder(13);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(13)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(13)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(13)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/UL[1]/LI[3]/A[1], element=Element{node=[A: null], tag=A, text=Remove course enrolment, attributes={class=userCommandsItem, evlist=false, href=/claroline11110/claroline/auth/courses.php?cmd=rqUnreg}}, source=HybridStateVertexImpl{id=13, name=state13}, target=HybridStateVertexImpl{id=440, name=state440}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(240), "Event fired: Remove course enrolment");
			testSuiteHelper.runInCrawlingPlugins(440);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 440");

			testSuiteHelper.addStateToReportBuilder(440);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(440)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(440)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(440)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/P[2]/A[1], element=Element{node=[A: null], tag=A, text=Back to my personal course list, attributes={class=backLink, evlist=false, href=../../index.php?asTeacher=false, title=Back to my personal course list}}, source=HybridStateVertexImpl{id=440, name=state440}, target=HybridStateVertexImpl{id=13, name=state13}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(241), "Event fired: Back to my personal course list");
			testSuiteHelper.runInCrawlingPlugins(13);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 13");

			testSuiteHelper.addStateToReportBuilder(13);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(13)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(13)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(13)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/UL[1]/LI[4]/A[1], element=Element{node=[A: null], tag=A, text=All platform courses, attributes={class=userCommandsItem, evlist=false, href=/claroline11110/claroline/course/platform_courses.php}}, source=HybridStateVertexImpl{id=13, name=state13}, target=HybridStateVertexImpl{id=442, name=state442}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(242), "Event fired: All platform courses");
			testSuiteHelper.runInCrawlingPlugins(442);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 442");

			testSuiteHelper.addStateToReportBuilder(442);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(442)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(442)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(442)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Search, attributes={evlist=false, type=submit}}, source=HybridStateVertexImpl{id=442, name=state442}, target=HybridStateVertexImpl{id=444, name=state444}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/INPUT[1]"), "ZEfkjikB"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(244), "Event fired: Search");
			testSuiteHelper.runInCrawlingPlugins(444);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 444");

			testSuiteHelper.addStateToReportBuilder(444);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(444)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(444)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(444)
					&& allStatesIdentical;	
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=67)
	public void method_BT321_path_56_140_183_245(){
		testSuiteHelper.newCurrentTestMethod("method_BT321_path_56_140_183_245", 67);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(13);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(13)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(13)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(13)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[3]/SPAN[1]/A[1], element=Element{node=[A: null], tag=A, text=Platform administration, attributes={evlist=false, href=/claroline11110/claroline/admin/, target=_top}}, source=HybridStateVertexImpl{id=13, name=state13}, target=HybridStateVertexImpl{id=68, name=state68}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(56), "Event fired: Platform administration");
			testSuiteHelper.runInCrawlingPlugins(68);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 68");

			testSuiteHelper.addStateToReportBuilder(68);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(68)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(68)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(68)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/UL[1]/LI[1]/UL[1]/LI[3]/A[1], element=Element{node=[A: null], tag=A, text=Send a message to all users, attributes={evlist=false, href=../messaging/sendmessage.php?cmd=rqMessageToAllUsers}}, source=HybridStateVertexImpl{id=68, name=state68}, target=HybridStateVertexImpl{id=240, name=state240}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/UL[1]/LI[1]/UL[1]/LI[1]/FORM[1]/INPUT[1]"), "CsBpUdKh"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/UL[1]/LI[2]/UL[1]/LI[1]/FORM[1]/INPUT[1]"), "KVKrEPXf"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(140), "Event fired: Send a message to all users");
			testSuiteHelper.runInCrawlingPlugins(240);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 240");

			testSuiteHelper.addStateToReportBuilder(240);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(240)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(240)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(240)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/SPAN[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/DIV[1]/SPAN[1]/TABLE[2]/TBODY[1]/TR[1]/TD[18]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[2]/A[1], element=Element{node=[A: null], tag=A, text=▼, attributes={anyaccess=action, class=mceOpen mce_forecolor, evlist=false, href=javascript:;, id=message_forecolor_open, onclick=return false;, onmousedown=return false;, role=button, tabindex=-1, title=Select Text Color}}, source=HybridStateVertexImpl{id=240, name=state240}, target=HybridStateVertexImpl{id=321, name=state321}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/INPUT[8]"), "XlVwRoRh"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(183), "Event fired: ▼");
			testSuiteHelper.runInCrawlingPlugins(321);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 321");

			testSuiteHelper.addStateToReportBuilder(321);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(321)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(321)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(321)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[2]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[7]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={data-mce-color=#333399, evlist=false, href=javascript:;, id=_mce_item_18, role=option, style=background-color: rgb(51, 51, 153);, tabindex=-1, title=Indigo}}, source=HybridStateVertexImpl{id=321, name=state321}, target=HybridStateVertexImpl{id=322, name=state322}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/INPUT[8]"), "PziCwNss"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(245), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(322);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 322");

			testSuiteHelper.addStateToReportBuilder(322);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(322)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(322)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(322)
					&& allStatesIdentical;	
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=68)
	public void method_BT368_path_153_202_247(){
		testSuiteHelper.newCurrentTestMethod("method_BT368_path_153_202_247", 68);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(13);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(13)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(13)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(13)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/P[2]/A[1], element=Element{node=[A: null], tag=A, text=Edit text zone, attributes={evlist=false, href=/claroline11110/claroline/admin/managing/editFile.php?cmd=rqEdit&file=textzone_right.inc.html}}, source=HybridStateVertexImpl{id=13, name=state13}, target=HybridStateVertexImpl{id=17, name=state17}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(153), "Event fired: Edit text zone");
			testSuiteHelper.runInCrawlingPlugins(17);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 17");

			testSuiteHelper.addStateToReportBuilder(17);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(17)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(17)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(17)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/SPAN[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/DIV[1]/SPAN[1]/TABLE[2]/TBODY[1]/TR[1]/TD[19]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[2]/A[1], element=Element{node=[A: null], tag=A, text=▼, attributes={class=mceOpen mce_backcolor, evlist=false, href=javascript:;, id=textContent_backcolor_open, onclick=return false;, onmousedown=return false;, role=button, tabindex=-1, title=Select Background Color}}, source=HybridStateVertexImpl{id=17, name=state17}, target=HybridStateVertexImpl{id=368, name=state368}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(202), "Event fired: ▼");
			testSuiteHelper.runInCrawlingPlugins(368);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 368");

			testSuiteHelper.addStateToReportBuilder(368);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(368)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(368)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(368)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[2]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[8]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={data-mce-color=#333333, evlist=false, href=javascript:;, id=_mce_item_19, role=option, style=background-color: rgb(51, 51, 51);, tabindex=-1, title=Very dark gray}}, source=HybridStateVertexImpl{id=368, name=state368}, target=HybridStateVertexImpl{id=369, name=state369}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(247), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(369);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 369");

			testSuiteHelper.addStateToReportBuilder(369);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(369)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(369)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(369)
					&& allStatesIdentical;	
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=69)
	public void method_BT64_path_153_1000006_1000007_249(){
		testSuiteHelper.newCurrentTestMethod("method_BT64_path_153_1000006_1000007_249", 69);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(13);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(13)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(13)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(13)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/P[2]/A[1], element=Element{node=[A: null], tag=A, text=Edit text zone, attributes={evlist=false, href=/claroline11110/claroline/admin/managing/editFile.php?cmd=rqEdit&file=textzone_right.inc.html}}, source=HybridStateVertexImpl{id=13, name=state13}, target=HybridStateVertexImpl{id=17, name=state17}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(153), "Event fired: Edit text zone");
			testSuiteHelper.runInCrawlingPlugins(17);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 17");

			testSuiteHelper.addStateToReportBuilder(17);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(17)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(17)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(17)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/SPAN[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/DIV[1]/SPAN[1]/TABLE[1]/TBODY[1]/TR[1]/TD[4]/SPAN[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/A[1], element=Element{node=[A: null], tag=A, text=Format, attributes={class=mceText, evlist=false, href=javascript:;, id=textContent_formatselect_text, onclick=return false;, onmousedown=return false;, tabindex=-1}}, source=HybridStateVertexImpl{id=17, name=state17}, target=HybridStateVertexImpl{id=63, name=state63}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1000006), "Event fired: Format");
			testSuiteHelper.runInCrawlingPlugins(63);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 63");

			testSuiteHelper.addStateToReportBuilder(63);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(63)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(63)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(63)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/SPAN[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/DIV[1]/SPAN[1]/TABLE[2]/TBODY[1]/TR[1]/TD[18]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[2]/A[1], element=Element{node=[A: null], tag=A, text=▼, attributes={anyaccess=none, class=mceOpen mce_forecolor, evlist=false, href=javascript:;, id=textContent_forecolor_open, onclick=return false;, onmousedown=return false;, role=button, tabindex=-1, title=Select Text Color}}, source=HybridStateVertexImpl{id=63, name=state63}, target=HybridStateVertexImpl{id=64, name=state64}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1000007), "Event fired: ▼");
			testSuiteHelper.runInCrawlingPlugins(64);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 64");

			testSuiteHelper.addStateToReportBuilder(64);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(64)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(64)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(64)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[3]/DIV[1]/TABLE[1]/TBODY[1]/TR[2]/TD[4]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={data-mce-color=#008000, evlist=false, href=javascript:;, id=_mce_item_33, role=option, style=background-color: rgb(0, 128, 0);, tabindex=-1, title=Green}}, source=HybridStateVertexImpl{id=64, name=state64}, target=HybridStateVertexImpl{id=212, name=state212}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(249), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(212);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 212");

			testSuiteHelper.addStateToReportBuilder(212);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(212)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(212)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(212)
					&& allStatesIdentical;	
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=70)
	public void method_BT63_path_153_1000006_251(){
		testSuiteHelper.newCurrentTestMethod("method_BT63_path_153_1000006_251", 70);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(13);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(13)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(13)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(13)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/P[2]/A[1], element=Element{node=[A: null], tag=A, text=Edit text zone, attributes={evlist=false, href=/claroline11110/claroline/admin/managing/editFile.php?cmd=rqEdit&file=textzone_right.inc.html}}, source=HybridStateVertexImpl{id=13, name=state13}, target=HybridStateVertexImpl{id=17, name=state17}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(153), "Event fired: Edit text zone");
			testSuiteHelper.runInCrawlingPlugins(17);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 17");

			testSuiteHelper.addStateToReportBuilder(17);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(17)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(17)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(17)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/SPAN[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/DIV[1]/SPAN[1]/TABLE[1]/TBODY[1]/TR[1]/TD[4]/SPAN[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/A[1], element=Element{node=[A: null], tag=A, text=Format, attributes={class=mceText, evlist=false, href=javascript:;, id=textContent_formatselect_text, onclick=return false;, onmousedown=return false;, tabindex=-1}}, source=HybridStateVertexImpl{id=17, name=state17}, target=HybridStateVertexImpl{id=63, name=state63}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1000006), "Event fired: Format");
			testSuiteHelper.runInCrawlingPlugins(63);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 63");

			testSuiteHelper.addStateToReportBuilder(63);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(63)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(63)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(63)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[2]/DIV[1]/TABLE[1]/TBODY[1]/TR[4]/TD[1]/A[1], element=Element{node=[A: null], tag=A, text=Preformatted, attributes={anyaccess=none, aria-checked=false, aria-disabled=false, aria-pressed=false, evlist=false, href=javascript:;, id=mce_15_aria, onclick=return false;, onmousedown=return false;, role=option, tabindex=-1}}, source=HybridStateVertexImpl{id=63, name=state63}, target=HybridStateVertexImpl{id=140, name=state140}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(251), "Event fired: Preformatted");
			testSuiteHelper.runInCrawlingPlugins(140);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 140");

			testSuiteHelper.addStateToReportBuilder(140);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(140)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(140)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(140)
					&& allStatesIdentical;	
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=71)
	public void method_BT391_path_56_214_252_253_254_255_257_258(){
		testSuiteHelper.newCurrentTestMethod("method_BT391_path_56_214_252_253_254_255_257_258", 71);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(13);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(13)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(13)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(13)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[3]/SPAN[1]/A[1], element=Element{node=[A: null], tag=A, text=Platform administration, attributes={evlist=false, href=/claroline11110/claroline/admin/, target=_top}}, source=HybridStateVertexImpl{id=13, name=state13}, target=HybridStateVertexImpl{id=68, name=state68}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(56), "Event fired: Platform administration");
			testSuiteHelper.runInCrawlingPlugins(68);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 68");

			testSuiteHelper.addStateToReportBuilder(68);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(68)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(68)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(68)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/UL[1]/LI[3]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Configuration, attributes={evlist=false, href=tool/config_list.php}}, source=HybridStateVertexImpl{id=68, name=state68}, target=HybridStateVertexImpl{id=391, name=state391}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/UL[1]/LI[1]/UL[1]/LI[1]/FORM[1]/INPUT[1]"), "CXVBwgXO"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/UL[1]/LI[2]/UL[1]/LI[1]/FORM[1]/INPUT[1]"), "HbLjBssU"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(214), "Event fired: Configuration");
			testSuiteHelper.runInCrawlingPlugins(391);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 391");

			testSuiteHelper.addStateToReportBuilder(391);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(391)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(391)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(391)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/UL[7]/LI[3]/A[1], element=Element{node=[A: null], tag=A, text=Rss (read and write) tool, attributes={anyaccess=none, evlist=false, href=config_edit.php?config_code=CLRSS}}, source=HybridStateVertexImpl{id=391, name=state391}, target=HybridStateVertexImpl{id=466, name=state466}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(252), "Event fired: Rss (read and write) tool");
			testSuiteHelper.runInCrawlingPlugins(466);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 466");

			testSuiteHelper.addStateToReportBuilder(466);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(466)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(466)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(466)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/TABLE[1]/TBODY[1]/TR[5]/TD[2]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={evlist=false, href=/claroline11110}}, source=HybridStateVertexImpl{id=466, name=state466}, target=HybridStateVertexImpl{id=13, name=state13}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/TABLE[1]/TBODY[1]/TR[1]/TD[2]/INPUT[1]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/TABLE[1]/TBODY[1]/TR[1]/TD[2]/INPUT[2]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/TABLE[1]/TBODY[1]/TR[2]/TD[2]/INPUT[1]"), "HUciPtPz"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/TABLE[1]/TBODY[1]/TR[3]/TD[2]/INPUT[1]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/TABLE[1]/TBODY[1]/TR[3]/TD[2]/INPUT[2]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/TABLE[1]/TBODY[1]/TR[4]/TD[2]/INPUT[1]"), "zRojvtEH"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(253), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(13);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 13");

			testSuiteHelper.addStateToReportBuilder(13);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(13)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(13)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(13)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/UL[1]/LI[5]/A[1], element=Element{node=[A: null], tag=A, text=New items to another date, attributes={class=userCommandsItem, evlist=false, href=/claroline11110/claroline/notification_date.php}}, source=HybridStateVertexImpl{id=13, name=state13}, target=HybridStateVertexImpl{id=468, name=state468}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(254), "Event fired: New items to another date");
			testSuiteHelper.runInCrawlingPlugins(468);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 468");

			testSuiteHelper.addStateToReportBuilder(468);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(468)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(468)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(468)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/INPUT[1], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={class=claroButton, evlist=false, name=notificationDate, type=submit, value=Ok}}, source=HybridStateVertexImpl{id=468, name=state468}, target=HybridStateVertexImpl{id=13, name=state13}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DD[1]/SELECT[1]"), "10"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DD[1]/SELECT[2]"), "January"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DD[1]/SELECT[3]"), "2020"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(255), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(13);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 13");

			testSuiteHelper.addStateToReportBuilder(13);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(13)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(13)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(13)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/P[2]/A[1], element=Element{node=[A: null], tag=A, text=Edit text zone, attributes={evlist=false, href=/claroline11110/claroline/admin/managing/editFile.php?cmd=rqEdit&file=textzone_top.authenticated.inc.html}}, source=HybridStateVertexImpl{id=13, name=state13}, target=HybridStateVertexImpl{id=17, name=state17}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(257), "Event fired: Edit text zone");
			testSuiteHelper.runInCrawlingPlugins(17);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 17");

			testSuiteHelper.addStateToReportBuilder(17);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(17)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(17)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(17)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/SPAN[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/DIV[1]/SPAN[1]/TABLE[1]/TBODY[1]/TR[1]/TD[3]/SPAN[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/A[1], element=Element{node=[A: null], tag=A, text=Font Size, attributes={class=mceText mceTitle, evlist=false, href=javascript:;, id=textContent_fontsizeselect_text, onclick=return false;, onmousedown=return false;, tabindex=-1}}, source=HybridStateVertexImpl{id=17, name=state17}, target=HybridStateVertexImpl{id=472, name=state472}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(258), "Event fired: Font Size");
			testSuiteHelper.runInCrawlingPlugins(472);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 472");

			testSuiteHelper.addStateToReportBuilder(472);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(472)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(472)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(472)
					&& allStatesIdentical;	
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=72)
	public void method_BT68_path_56_261_263(){
		testSuiteHelper.newCurrentTestMethod("method_BT68_path_56_261_263", 72);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(13);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(13)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(13)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(13)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[3]/SPAN[1]/A[1], element=Element{node=[A: null], tag=A, text=Platform administration, attributes={evlist=false, href=/claroline11110/claroline/admin/, target=_top}}, source=HybridStateVertexImpl{id=13, name=state13}, target=HybridStateVertexImpl{id=68, name=state68}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(56), "Event fired: Platform administration");
			testSuiteHelper.runInCrawlingPlugins(68);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 68");

			testSuiteHelper.addStateToReportBuilder(68);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(68)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(68)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(68)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/UL[1]/LI[4]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Files statistics, attributes={evlist=false, href=technical/files_stats.php}}, source=HybridStateVertexImpl{id=68, name=state68}, target=HybridStateVertexImpl{id=476, name=state476}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/UL[1]/LI[1]/UL[1]/LI[1]/FORM[1]/INPUT[1]"), "UKsXFBbq"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/UL[1]/LI[2]/UL[1]/LI[1]/FORM[1]/INPUT[1]"), "jQARZmqU"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(261), "Event fired: Files statistics");
			testSuiteHelper.runInCrawlingPlugins(476);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 476");

			testSuiteHelper.addStateToReportBuilder(476);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(476)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(476)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(476)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/FORM[1]/INPUT[3], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={evlist=false, name=changeProperties, type=submit, value=Get HTML statistics}}, source=HybridStateVertexImpl{id=476, name=state476}, target=HybridStateVertexImpl{id=478, name=state478}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(263), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(478);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 478");

			testSuiteHelper.addStateToReportBuilder(478);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(478)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(478)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(478)
					&& allStatesIdentical;	
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=73)
	public void method_BT286_path_56_1000177_1000178_264_265_266_267_269_270(){
		testSuiteHelper.newCurrentTestMethod("method_BT286_path_56_1000177_1000178_264_265_266_267_269_270", 73);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(13);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(13)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(13)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(13)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[3]/SPAN[1]/A[1], element=Element{node=[A: null], tag=A, text=Platform administration, attributes={evlist=false, href=/claroline11110/claroline/admin/, target=_top}}, source=HybridStateVertexImpl{id=13, name=state13}, target=HybridStateVertexImpl{id=68, name=state68}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(56), "Event fired: Platform administration");
			testSuiteHelper.runInCrawlingPlugins(68);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 68");

			testSuiteHelper.addStateToReportBuilder(68);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(68)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(68)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(68)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/UL[1]/LI[1]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=User list, attributes={evlist=false, href=admin_users.php}}, source=HybridStateVertexImpl{id=68, name=state68}, target=HybridStateVertexImpl{id=156, name=state156}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/UL[1]/LI[1]/UL[1]/LI[1]/FORM[1]/INPUT[1]"), "ebIZwepn"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/UL[1]/LI[2]/UL[1]/LI[1]/FORM[1]/INPUT[1]"), "FPLCMqiI"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(1000177), "Event fired: User list");
			testSuiteHelper.runInCrawlingPlugins(156);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 156");

			testSuiteHelper.addStateToReportBuilder(156);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(156)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(156)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(156)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/TABLE[2]/TBODY[1]/TR[1]/TD[7]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={evlist=false, href=admin_profile.php?uidToEdit=1&cfrom=ulist}}, source=HybridStateVertexImpl{id=156, name=state156}, target=HybridStateVertexImpl{id=286, name=state286}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/FORM[1]/INPUT[1]"), "mFBZSLNr"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(1000178), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(286);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 286");

			testSuiteHelper.addStateToReportBuilder(286);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(286)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(286)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(286)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[2]/UL[1]/LI[4]/A[1], element=Element{node=[A: null], tag=A, text=Delete user, attributes={evlist=false, href=adminuserdeleted.php?uidToEdit=1&cmd=rqDelete, style=background-image: url(/claroline11110/web/img/deluser.png?1232376376); background-repeat: no-repeat; background-position: left center; padding-left: 20px;}}, source=HybridStateVertexImpl{id=286, name=state286}, target=HybridStateVertexImpl{id=483, name=state483}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DL[1]/DD[1]/INPUT[1]"), "Stocco"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DL[1]/DD[2]/INPUT[1]"), "Andrea"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DL[1]/DD[3]/INPUT[1]"), "aRNhEkLA"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[2]/DL[1]/DD[2]/INPUT[1]"), "QvCUvDnk"));
			formInputs.add(new FormInput(FormInput.InputType.PASSWORD, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[2]/DL[1]/DD[5]/INPUT[1]"), "admin"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[3]/DL[1]/DD[1]/INPUT[1]"), "astocco@ece.ubc.ca"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[3]/DL[1]/DD[2]/INPUT[1]"), "mFdLCYEC"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[3]/DL[1]/DD[3]/INPUT[1]"), "LCmDwPXm"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[4]/DL[1]/DD[1]/INPUT[1]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[4]/DL[1]/DD[1]/INPUT[2]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[4]/DL[1]/DD[1]/SPAN[1]/INPUT[1]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[2]/DL[1]/DD[7]/SELECT[1]"), "claroline"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(264), "Event fired: Delete user");
			testSuiteHelper.runInCrawlingPlugins(483);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 483");

			testSuiteHelper.addStateToReportBuilder(483);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(483)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(483)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(483)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[3]/DIV[1]/UL[1]/LI[3]/A[1], element=Element{node=[A: null], tag=A, text=User settings, attributes={anyaccess=action, evlist=false, href=/claroline11110/claroline/admin/adminuserdeleted.php, target=_top}}, source=HybridStateVertexImpl{id=483, name=state483}, target=HybridStateVertexImpl{id=484, name=state484}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(265), "Event fired: User settings");
			testSuiteHelper.runInCrawlingPlugins(484);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 484");

			testSuiteHelper.addStateToReportBuilder(484);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(484)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(484)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(484)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/P[1]/SPAN[1]/A[1], element=Element{node=[A: null], tag=A, text=Back to admin page, attributes={class=claroCmd, evlist=false, href=index.php}}, source=HybridStateVertexImpl{id=484, name=state484}, target=HybridStateVertexImpl{id=68, name=state68}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(266), "Event fired: Back to admin page");
			testSuiteHelper.runInCrawlingPlugins(68);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 68");

			testSuiteHelper.addStateToReportBuilder(68);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(68)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(68)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(68)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/UL[1]/LI[4]/UL[1]/LI[3]/A[1], element=Element{node=[A: null], tag=A, text=Platform statistics, attributes={evlist=false, href=../tracking/platform_report.php}}, source=HybridStateVertexImpl{id=68, name=state68}, target=HybridStateVertexImpl{id=486, name=state486}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/UL[1]/LI[1]/UL[1]/LI[1]/FORM[1]/INPUT[1]"), "FzCvOmsg"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/UL[1]/LI[2]/UL[1]/LI[1]/FORM[1]/INPUT[1]"), "zAgCuUSm"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(267), "Event fired: Platform statistics");
			testSuiteHelper.runInCrawlingPlugins(486);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 486");

			testSuiteHelper.addStateToReportBuilder(486);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(486)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(486)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(486)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[2]/A[1], element=Element{node=[A: null], tag=A, text=Traffic Details, attributes={evlist=false, href=platform_access_details.php}}, source=HybridStateVertexImpl{id=486, name=state486}, target=HybridStateVertexImpl{id=488, name=state488}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(269), "Event fired: Traffic Details");
			testSuiteHelper.runInCrawlingPlugins(488);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 488");

			testSuiteHelper.addStateToReportBuilder(488);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(488)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(488)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(488)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[3]/DIV[1]/UL[1]/LI[3]/A[1], element=Element{node=[A: null], tag=A, text=Platform statistics, attributes={anyaccess=none, evlist=false, href=platform_report.php, target=_top}}, source=HybridStateVertexImpl{id=488, name=state488}, target=HybridStateVertexImpl{id=486, name=state486}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(270), "Event fired: Platform statistics");
			testSuiteHelper.runInCrawlingPlugins(486);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 486");

			testSuiteHelper.addStateToReportBuilder(486);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(486)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(486)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(486)
					&& allStatesIdentical;	
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=74)
	public void method_BT379_path_56_1000177_1000178_207_275_277_278(){
		testSuiteHelper.newCurrentTestMethod("method_BT379_path_56_1000177_1000178_207_275_277_278", 74);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(13);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(13)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(13)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(13)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[3]/SPAN[1]/A[1], element=Element{node=[A: null], tag=A, text=Platform administration, attributes={evlist=false, href=/claroline11110/claroline/admin/, target=_top}}, source=HybridStateVertexImpl{id=13, name=state13}, target=HybridStateVertexImpl{id=68, name=state68}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(56), "Event fired: Platform administration");
			testSuiteHelper.runInCrawlingPlugins(68);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 68");

			testSuiteHelper.addStateToReportBuilder(68);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(68)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(68)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(68)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/UL[1]/LI[1]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=User list, attributes={evlist=false, href=admin_users.php}}, source=HybridStateVertexImpl{id=68, name=state68}, target=HybridStateVertexImpl{id=156, name=state156}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/UL[1]/LI[1]/UL[1]/LI[1]/FORM[1]/INPUT[1]"), "ebIZwepn"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/UL[1]/LI[2]/UL[1]/LI[1]/FORM[1]/INPUT[1]"), "FPLCMqiI"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(1000177), "Event fired: User list");
			testSuiteHelper.runInCrawlingPlugins(156);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 156");

			testSuiteHelper.addStateToReportBuilder(156);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(156)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(156)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(156)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/TABLE[2]/TBODY[1]/TR[1]/TD[7]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={evlist=false, href=admin_profile.php?uidToEdit=1&cfrom=ulist}}, source=HybridStateVertexImpl{id=156, name=state156}, target=HybridStateVertexImpl{id=286, name=state286}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/FORM[1]/INPUT[1]"), "mFBZSLNr"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(1000178), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(286);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 286");

			testSuiteHelper.addStateToReportBuilder(286);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(286)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(286)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(286)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[2]/UL[1]/LI[3]/A[1], element=Element{node=[A: null], tag=A, text=User course list, attributes={evlist=false, href=adminusercourses.php?uidToEdit=1, style=background-image: url(/claroline11110/web/img/course.png?1232376376); background-repeat: no-repeat; background-position: left center; padding-left: 20px;}}, source=HybridStateVertexImpl{id=286, name=state286}, target=HybridStateVertexImpl{id=379, name=state379}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DL[1]/DD[1]/INPUT[1]"), "Stocco"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DL[1]/DD[2]/INPUT[1]"), "Andrea"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DL[1]/DD[3]/INPUT[1]"), "vAViFfYy"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[2]/DL[1]/DD[2]/INPUT[1]"), "FrlHTzhZ"));
			formInputs.add(new FormInput(FormInput.InputType.PASSWORD, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[2]/DL[1]/DD[5]/INPUT[1]"), "admin"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[3]/DL[1]/DD[1]/INPUT[1]"), "astocco@ece.ubc.ca"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[3]/DL[1]/DD[2]/INPUT[1]"), "BVdiyXfV"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[3]/DL[1]/DD[3]/INPUT[1]"), "tOHPxxOE"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[4]/DL[1]/DD[1]/INPUT[1]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[4]/DL[1]/DD[1]/INPUT[2]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[4]/DL[1]/DD[1]/SPAN[1]/INPUT[1]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[2]/DL[1]/DD[7]/SELECT[1]"), "temp"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(207), "Event fired: User course list");
			testSuiteHelper.runInCrawlingPlugins(379);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 379");

			testSuiteHelper.addStateToReportBuilder(379);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(379)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(379)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(379)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[2]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Enrol to a new course, attributes={evlist=false, href=../auth/courses.php?cmd=rqReg&uidToEdit=1&category=&fromAdmin=usercourse, style=background-image: url(/claroline11110/web/img/course.png?1232376376); background-repeat: no-repeat; background-position: left center; padding-left: 20px;}}, source=HybridStateVertexImpl{id=379, name=state379}, target=HybridStateVertexImpl{id=499, name=state499}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(275), "Event fired: Enrol to a new course");
			testSuiteHelper.runInCrawlingPlugins(499);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 499");

			testSuiteHelper.addStateToReportBuilder(499);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(499)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(499)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(499)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/P[2]/A[1], element=Element{node=[A: null], tag=A, text=Back to user's course list, attributes={class=backLink, evlist=false, href=../admin/adminusercourses.php?uidToEdit=1&fromAdmin=usercourse&asTeacher=false, title=Back to user's course list}}, source=HybridStateVertexImpl{id=499, name=state499}, target=HybridStateVertexImpl{id=379, name=state379}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/INPUT[1]"), "iukMEeIa"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(277), "Event fired: Back to user's course list");
			testSuiteHelper.runInCrawlingPlugins(379);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 379");

			testSuiteHelper.addStateToReportBuilder(379);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(379)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(379)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(379)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[2]/UL[1]/LI[3]/A[1], element=Element{node=[A: null], tag=A, text=Unregister for all courses, attributes={evlist=false, href=/claroline11110/claroline/admin/adminusercourses.php?cmd=rqRmAll&uidToEdit=1, onclick=return ADMIN.confirmationUnRegForAllCourses('John Doe');, style=background-image: url(/claroline11110/web/img/delete.png?1232376376); background-repeat: no-repeat; background-position: left center; padding-left: 20px;}}, source=HybridStateVertexImpl{id=379, name=state379}, target=HybridStateVertexImpl{id=502, name=state502}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(278), "Event fired: Unregister for all courses");
			testSuiteHelper.runInCrawlingPlugins(502);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 502");

			testSuiteHelper.addStateToReportBuilder(502);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(502)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(502)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(502)
					&& allStatesIdentical;	
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=75)
	public void method_BT380_path_56_1000177_1000178_207_208_279(){
		testSuiteHelper.newCurrentTestMethod("method_BT380_path_56_1000177_1000178_207_208_279", 75);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(13);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(13)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(13)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(13)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[3]/SPAN[1]/A[1], element=Element{node=[A: null], tag=A, text=Platform administration, attributes={evlist=false, href=/claroline11110/claroline/admin/, target=_top}}, source=HybridStateVertexImpl{id=13, name=state13}, target=HybridStateVertexImpl{id=68, name=state68}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(56), "Event fired: Platform administration");
			testSuiteHelper.runInCrawlingPlugins(68);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 68");

			testSuiteHelper.addStateToReportBuilder(68);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(68)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(68)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(68)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/UL[1]/LI[1]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=User list, attributes={evlist=false, href=admin_users.php}}, source=HybridStateVertexImpl{id=68, name=state68}, target=HybridStateVertexImpl{id=156, name=state156}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/UL[1]/LI[1]/UL[1]/LI[1]/FORM[1]/INPUT[1]"), "ebIZwepn"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/UL[1]/LI[2]/UL[1]/LI[1]/FORM[1]/INPUT[1]"), "FPLCMqiI"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(1000177), "Event fired: User list");
			testSuiteHelper.runInCrawlingPlugins(156);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 156");

			testSuiteHelper.addStateToReportBuilder(156);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(156)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(156)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(156)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/TABLE[2]/TBODY[1]/TR[1]/TD[7]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={evlist=false, href=admin_profile.php?uidToEdit=1&cfrom=ulist}}, source=HybridStateVertexImpl{id=156, name=state156}, target=HybridStateVertexImpl{id=286, name=state286}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/FORM[1]/INPUT[1]"), "mFBZSLNr"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(1000178), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(286);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 286");

			testSuiteHelper.addStateToReportBuilder(286);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(286)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(286)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(286)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[2]/UL[1]/LI[3]/A[1], element=Element{node=[A: null], tag=A, text=User course list, attributes={evlist=false, href=adminusercourses.php?uidToEdit=1, style=background-image: url(/claroline11110/web/img/course.png?1232376376); background-repeat: no-repeat; background-position: left center; padding-left: 20px;}}, source=HybridStateVertexImpl{id=286, name=state286}, target=HybridStateVertexImpl{id=379, name=state379}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DL[1]/DD[1]/INPUT[1]"), "Stocco"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DL[1]/DD[2]/INPUT[1]"), "Andrea"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DL[1]/DD[3]/INPUT[1]"), "vAViFfYy"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[2]/DL[1]/DD[2]/INPUT[1]"), "FrlHTzhZ"));
			formInputs.add(new FormInput(FormInput.InputType.PASSWORD, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[2]/DL[1]/DD[5]/INPUT[1]"), "admin"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[3]/DL[1]/DD[1]/INPUT[1]"), "astocco@ece.ubc.ca"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[3]/DL[1]/DD[2]/INPUT[1]"), "BVdiyXfV"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[3]/DL[1]/DD[3]/INPUT[1]"), "tOHPxxOE"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[4]/DL[1]/DD[1]/INPUT[1]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[4]/DL[1]/DD[1]/INPUT[2]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[4]/DL[1]/DD[1]/SPAN[1]/INPUT[1]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[2]/DL[1]/DD[7]/SELECT[1]"), "temp"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(207), "Event fired: User course list");
			testSuiteHelper.runInCrawlingPlugins(379);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 379");

			testSuiteHelper.addStateToReportBuilder(379);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(379)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(379)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(379)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[3]/DIV[1]/UL[1]/LI[3]/A[1], element=Element{node=[A: null], tag=A, text=User course list, attributes={anyaccess=action, evlist=false, href=/claroline11110/claroline/admin/adminusercourses.php, target=_top}}, source=HybridStateVertexImpl{id=379, name=state379}, target=HybridStateVertexImpl{id=380, name=state380}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(208), "Event fired: User course list");
			testSuiteHelper.runInCrawlingPlugins(380);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 380");

			testSuiteHelper.addStateToReportBuilder(380);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(380)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(380)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(380)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[2]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Enrol to a new course, attributes={anyaccess=none, evlist=false, href=../auth/courses.php?cmd=rqReg&uidToEdit=0&category=&fromAdmin=usercourse, style=background-image: url(/claroline11110/web/img/course.png?1232376376); background-repeat: no-repeat; background-position: left center; padding-left: 20px;}}, source=HybridStateVertexImpl{id=380, name=state380}, target=HybridStateVertexImpl{id=499, name=state499}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(279), "Event fired: Enrol to a new course");
			testSuiteHelper.runInCrawlingPlugins(499);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 499");

			testSuiteHelper.addStateToReportBuilder(499);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(499)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(499)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(499)
					&& allStatesIdentical;	
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=76)
	public void method_BT321_path_56_140_183_280(){
		testSuiteHelper.newCurrentTestMethod("method_BT321_path_56_140_183_280", 76);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(13);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(13)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(13)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(13)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[3]/SPAN[1]/A[1], element=Element{node=[A: null], tag=A, text=Platform administration, attributes={evlist=false, href=/claroline11110/claroline/admin/, target=_top}}, source=HybridStateVertexImpl{id=13, name=state13}, target=HybridStateVertexImpl{id=68, name=state68}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(56), "Event fired: Platform administration");
			testSuiteHelper.runInCrawlingPlugins(68);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 68");

			testSuiteHelper.addStateToReportBuilder(68);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(68)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(68)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(68)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/UL[1]/LI[1]/UL[1]/LI[3]/A[1], element=Element{node=[A: null], tag=A, text=Send a message to all users, attributes={evlist=false, href=../messaging/sendmessage.php?cmd=rqMessageToAllUsers}}, source=HybridStateVertexImpl{id=68, name=state68}, target=HybridStateVertexImpl{id=240, name=state240}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/UL[1]/LI[1]/UL[1]/LI[1]/FORM[1]/INPUT[1]"), "CsBpUdKh"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/UL[1]/LI[2]/UL[1]/LI[1]/FORM[1]/INPUT[1]"), "KVKrEPXf"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(140), "Event fired: Send a message to all users");
			testSuiteHelper.runInCrawlingPlugins(240);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 240");

			testSuiteHelper.addStateToReportBuilder(240);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(240)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(240)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(240)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/SPAN[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/DIV[1]/SPAN[1]/TABLE[2]/TBODY[1]/TR[1]/TD[18]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[2]/A[1], element=Element{node=[A: null], tag=A, text=▼, attributes={anyaccess=action, class=mceOpen mce_forecolor, evlist=false, href=javascript:;, id=message_forecolor_open, onclick=return false;, onmousedown=return false;, role=button, tabindex=-1, title=Select Text Color}}, source=HybridStateVertexImpl{id=240, name=state240}, target=HybridStateVertexImpl{id=321, name=state321}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/INPUT[8]"), "XlVwRoRh"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(183), "Event fired: ▼");
			testSuiteHelper.runInCrawlingPlugins(321);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 321");

			testSuiteHelper.addStateToReportBuilder(321);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(321)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(321)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(321)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[2]/DIV[1]/TABLE[1]/TBODY[1]/TR[2]/TD[1]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={data-mce-color=#800000, evlist=false, href=javascript:;, id=_mce_item_20, role=option, style=background-color: rgb(128, 0, 0);, tabindex=-1, title=Maroon}}, source=HybridStateVertexImpl{id=321, name=state321}, target=HybridStateVertexImpl{id=322, name=state322}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/INPUT[8]"), "EzxqSoam"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(280), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(322);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 322");

			testSuiteHelper.addStateToReportBuilder(322);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(322)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(322)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(322)
					&& allStatesIdentical;	
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=77)
	public void method_BT368_path_153_202_282(){
		testSuiteHelper.newCurrentTestMethod("method_BT368_path_153_202_282", 77);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(13);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(13)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(13)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(13)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/P[2]/A[1], element=Element{node=[A: null], tag=A, text=Edit text zone, attributes={evlist=false, href=/claroline11110/claroline/admin/managing/editFile.php?cmd=rqEdit&file=textzone_right.inc.html}}, source=HybridStateVertexImpl{id=13, name=state13}, target=HybridStateVertexImpl{id=17, name=state17}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(153), "Event fired: Edit text zone");
			testSuiteHelper.runInCrawlingPlugins(17);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 17");

			testSuiteHelper.addStateToReportBuilder(17);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(17)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(17)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(17)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/SPAN[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/DIV[1]/SPAN[1]/TABLE[2]/TBODY[1]/TR[1]/TD[19]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[2]/A[1], element=Element{node=[A: null], tag=A, text=▼, attributes={class=mceOpen mce_backcolor, evlist=false, href=javascript:;, id=textContent_backcolor_open, onclick=return false;, onmousedown=return false;, role=button, tabindex=-1, title=Select Background Color}}, source=HybridStateVertexImpl{id=17, name=state17}, target=HybridStateVertexImpl{id=368, name=state368}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(202), "Event fired: ▼");
			testSuiteHelper.runInCrawlingPlugins(368);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 368");

			testSuiteHelper.addStateToReportBuilder(368);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(368)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(368)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(368)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[2]/DIV[1]/TABLE[1]/TBODY[1]/TR[2]/TD[2]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={data-mce-color=#FF6600, evlist=false, href=javascript:;, id=_mce_item_21, role=option, style=background-color: rgb(255, 102, 0);, tabindex=-1, title=Orange}}, source=HybridStateVertexImpl{id=368, name=state368}, target=HybridStateVertexImpl{id=369, name=state369}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(282), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(369);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 369");

			testSuiteHelper.addStateToReportBuilder(369);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(369)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(369)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(369)
					&& allStatesIdentical;	
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=78)
	public void method_BT64_path_153_1000006_1000007_284(){
		testSuiteHelper.newCurrentTestMethod("method_BT64_path_153_1000006_1000007_284", 78);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(13);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(13)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(13)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(13)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/P[2]/A[1], element=Element{node=[A: null], tag=A, text=Edit text zone, attributes={evlist=false, href=/claroline11110/claroline/admin/managing/editFile.php?cmd=rqEdit&file=textzone_right.inc.html}}, source=HybridStateVertexImpl{id=13, name=state13}, target=HybridStateVertexImpl{id=17, name=state17}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(153), "Event fired: Edit text zone");
			testSuiteHelper.runInCrawlingPlugins(17);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 17");

			testSuiteHelper.addStateToReportBuilder(17);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(17)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(17)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(17)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/SPAN[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/DIV[1]/SPAN[1]/TABLE[1]/TBODY[1]/TR[1]/TD[4]/SPAN[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/A[1], element=Element{node=[A: null], tag=A, text=Format, attributes={class=mceText, evlist=false, href=javascript:;, id=textContent_formatselect_text, onclick=return false;, onmousedown=return false;, tabindex=-1}}, source=HybridStateVertexImpl{id=17, name=state17}, target=HybridStateVertexImpl{id=63, name=state63}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1000006), "Event fired: Format");
			testSuiteHelper.runInCrawlingPlugins(63);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 63");

			testSuiteHelper.addStateToReportBuilder(63);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(63)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(63)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(63)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/SPAN[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/DIV[1]/SPAN[1]/TABLE[2]/TBODY[1]/TR[1]/TD[18]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[2]/A[1], element=Element{node=[A: null], tag=A, text=▼, attributes={anyaccess=none, class=mceOpen mce_forecolor, evlist=false, href=javascript:;, id=textContent_forecolor_open, onclick=return false;, onmousedown=return false;, role=button, tabindex=-1, title=Select Text Color}}, source=HybridStateVertexImpl{id=63, name=state63}, target=HybridStateVertexImpl{id=64, name=state64}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1000007), "Event fired: ▼");
			testSuiteHelper.runInCrawlingPlugins(64);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 64");

			testSuiteHelper.addStateToReportBuilder(64);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(64)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(64)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(64)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[3]/DIV[1]/TABLE[1]/TBODY[1]/TR[2]/TD[5]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={data-mce-color=#008080, evlist=false, href=javascript:;, id=_mce_item_34, role=option, style=background-color: rgb(0, 128, 128);, tabindex=-1, title=Teal}}, source=HybridStateVertexImpl{id=64, name=state64}, target=HybridStateVertexImpl{id=212, name=state212}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(284), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(212);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 212");

			testSuiteHelper.addStateToReportBuilder(212);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(212)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(212)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(212)
					&& allStatesIdentical;	
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=79)
	public void method_BT422_path_56_140_229(){
		testSuiteHelper.newCurrentTestMethod("method_BT422_path_56_140_229", 79);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(13);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(13)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(13)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(13)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[3]/SPAN[1]/A[1], element=Element{node=[A: null], tag=A, text=Platform administration, attributes={evlist=false, href=/claroline11110/claroline/admin/, target=_top}}, source=HybridStateVertexImpl{id=13, name=state13}, target=HybridStateVertexImpl{id=68, name=state68}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(56), "Event fired: Platform administration");
			testSuiteHelper.runInCrawlingPlugins(68);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 68");

			testSuiteHelper.addStateToReportBuilder(68);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(68)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(68)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(68)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/UL[1]/LI[1]/UL[1]/LI[3]/A[1], element=Element{node=[A: null], tag=A, text=Send a message to all users, attributes={evlist=false, href=../messaging/sendmessage.php?cmd=rqMessageToAllUsers}}, source=HybridStateVertexImpl{id=68, name=state68}, target=HybridStateVertexImpl{id=240, name=state240}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/UL[1]/LI[1]/UL[1]/LI[1]/FORM[1]/INPUT[1]"), "CsBpUdKh"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/UL[1]/LI[2]/UL[1]/LI[1]/FORM[1]/INPUT[1]"), "KVKrEPXf"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(140), "Event fired: Send a message to all users");
			testSuiteHelper.runInCrawlingPlugins(240);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 240");

			testSuiteHelper.addStateToReportBuilder(240);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(240)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(240)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(240)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/SPAN[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/DIV[1]/SPAN[1]/TABLE[1]/TBODY[1]/TR[1]/TD[2]/SPAN[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/A[1], element=Element{node=[A: null], tag=A, text=Font Family, attributes={anyaccess=none, class=mceText mceTitle, evlist=false, href=javascript:;, id=message_fontselect_text, onclick=return false;, onmousedown=return false;, tabindex=-1}}, source=HybridStateVertexImpl{id=240, name=state240}, target=HybridStateVertexImpl{id=422, name=state422}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/INPUT[8]"), "QQCClAoQ"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(229), "Event fired: Font Family");
			testSuiteHelper.runInCrawlingPlugins(422);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 422");

			testSuiteHelper.addStateToReportBuilder(422);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(422)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(422)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(422)
					&& allStatesIdentical;	
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=80)
	public void method_BT240_path_56_140_288(){
		testSuiteHelper.newCurrentTestMethod("method_BT240_path_56_140_288", 80);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(13);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(13)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(13)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(13)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[3]/SPAN[1]/A[1], element=Element{node=[A: null], tag=A, text=Platform administration, attributes={evlist=false, href=/claroline11110/claroline/admin/, target=_top}}, source=HybridStateVertexImpl{id=13, name=state13}, target=HybridStateVertexImpl{id=68, name=state68}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(56), "Event fired: Platform administration");
			testSuiteHelper.runInCrawlingPlugins(68);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 68");

			testSuiteHelper.addStateToReportBuilder(68);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(68)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(68)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(68)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/UL[1]/LI[1]/UL[1]/LI[3]/A[1], element=Element{node=[A: null], tag=A, text=Send a message to all users, attributes={evlist=false, href=../messaging/sendmessage.php?cmd=rqMessageToAllUsers}}, source=HybridStateVertexImpl{id=68, name=state68}, target=HybridStateVertexImpl{id=240, name=state240}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/UL[1]/LI[1]/UL[1]/LI[1]/FORM[1]/INPUT[1]"), "CsBpUdKh"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/UL[1]/LI[2]/UL[1]/LI[1]/FORM[1]/INPUT[1]"), "KVKrEPXf"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(140), "Event fired: Send a message to all users");
			testSuiteHelper.runInCrawlingPlugins(240);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 240");

			testSuiteHelper.addStateToReportBuilder(240);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(240)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(240)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(240)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/SPAN[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/DIV[1]/SPAN[1]/TABLE[1]/TBODY[1]/TR[1]/TD[3]/SPAN[1]/TABLE[1]/TBODY[1]/TR[1]/TD[2]/A[1], element=Element{node=[A: null], tag=A, text=▼, attributes={anyaccess=none, class=mceOpen, evlist=false, href=javascript:;, id=message_fontsizeselect_open, onclick=return false;, onmousedown=return false;, tabindex=-1}}, source=HybridStateVertexImpl{id=240, name=state240}, target=HybridStateVertexImpl{id=532, name=state532}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/INPUT[8]"), "vcZrczyu"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(288), "Event fired: ▼");
			testSuiteHelper.runInCrawlingPlugins(532);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 532");

			testSuiteHelper.addStateToReportBuilder(532);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(532)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(532)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(532)
					&& allStatesIdentical;	
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=81)
	public void method_BT392_path_56_214_215_291_292_293(){
		testSuiteHelper.newCurrentTestMethod("method_BT392_path_56_214_215_291_292_293", 81);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(13);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(13)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(13)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(13)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[3]/SPAN[1]/A[1], element=Element{node=[A: null], tag=A, text=Platform administration, attributes={evlist=false, href=/claroline11110/claroline/admin/, target=_top}}, source=HybridStateVertexImpl{id=13, name=state13}, target=HybridStateVertexImpl{id=68, name=state68}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(56), "Event fired: Platform administration");
			testSuiteHelper.runInCrawlingPlugins(68);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 68");

			testSuiteHelper.addStateToReportBuilder(68);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(68)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(68)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(68)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/UL[1]/LI[3]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Configuration, attributes={evlist=false, href=tool/config_list.php}}, source=HybridStateVertexImpl{id=68, name=state68}, target=HybridStateVertexImpl{id=391, name=state391}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/UL[1]/LI[1]/UL[1]/LI[1]/FORM[1]/INPUT[1]"), "CXVBwgXO"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/UL[1]/LI[2]/UL[1]/LI[1]/FORM[1]/INPUT[1]"), "HbLjBssU"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(214), "Event fired: Configuration");
			testSuiteHelper.runInCrawlingPlugins(391);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 391");

			testSuiteHelper.addStateToReportBuilder(391);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(391)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(391)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(391)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/UL[7]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Internal messaging system, attributes={anyaccess=none, evlist=false, href=config_edit.php?config_code=CLMSG}}, source=HybridStateVertexImpl{id=391, name=state391}, target=HybridStateVertexImpl{id=392, name=state392}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(215), "Event fired: Internal messaging system");
			testSuiteHelper.runInCrawlingPlugins(392);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 392");

			testSuiteHelper.addStateToReportBuilder(392);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(392)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(392)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(392)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/TABLE[1]/TBODY[1]/TR[4]/TD[2]/INPUT[1], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={evlist=false, type=submit, value=Ok}}, source=HybridStateVertexImpl{id=392, name=state392}, target=HybridStateVertexImpl{id=538, name=state538}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/TABLE[1]/TBODY[1]/TR[1]/TD[2]/INPUT[1]"), "DzPqJQlm"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/TABLE[1]/TBODY[1]/TR[2]/TD[2]/INPUT[1]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/TABLE[1]/TBODY[1]/TR[2]/TD[2]/INPUT[2]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/TABLE[1]/TBODY[1]/TR[3]/TD[2]/INPUT[1]"), "0"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/TABLE[1]/TBODY[1]/TR[3]/TD[2]/INPUT[2]"), "1"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(291), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(538);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 538");

			testSuiteHelper.addStateToReportBuilder(538);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(538)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(538)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(538)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/TABLE[1]/TBODY[1]/TR[4]/TD[2]/A[1]/INPUT[1], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={anyaccess=none, evlist=false, onclick=document.location='/claroline11110';return false, type=button, value=Cancel}}, source=HybridStateVertexImpl{id=538, name=state538}, target=HybridStateVertexImpl{id=13, name=state13}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/TABLE[1]/TBODY[1]/TR[1]/TD[2]/INPUT[1]"), "camckiLN"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/TABLE[1]/TBODY[1]/TR[2]/TD[2]/INPUT[1]"), "0"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/TABLE[1]/TBODY[1]/TR[2]/TD[2]/INPUT[2]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/TABLE[1]/TBODY[1]/TR[3]/TD[2]/INPUT[1]"), "0"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/TABLE[1]/TBODY[1]/TR[3]/TD[2]/INPUT[2]"), "1"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(292), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(13);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 13");

			testSuiteHelper.addStateToReportBuilder(13);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(13)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(13)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(13)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[3]/DIV[2]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=View all my messages, attributes={evlist=false, href=/claroline11110/claroline/messaging/index.php}}, source=HybridStateVertexImpl{id=13, name=state13}, target=HybridStateVertexImpl{id=15, name=state15}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(293), "Event fired: View all my messages");
			testSuiteHelper.runInCrawlingPlugins(15);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 15");

			testSuiteHelper.addStateToReportBuilder(15);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(15)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(15)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(15)
					&& allStatesIdentical;	
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=82)
	public void method_BT426_path_153_232(){
		testSuiteHelper.newCurrentTestMethod("method_BT426_path_153_232", 82);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(13);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(13)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(13)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(13)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/P[2]/A[1], element=Element{node=[A: null], tag=A, text=Edit text zone, attributes={evlist=false, href=/claroline11110/claroline/admin/managing/editFile.php?cmd=rqEdit&file=textzone_right.inc.html}}, source=HybridStateVertexImpl{id=13, name=state13}, target=HybridStateVertexImpl{id=17, name=state17}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(153), "Event fired: Edit text zone");
			testSuiteHelper.runInCrawlingPlugins(17);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 17");

			testSuiteHelper.addStateToReportBuilder(17);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(17)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(17)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(17)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/SPAN[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/DIV[1]/SPAN[1]/TABLE[1]/TBODY[1]/TR[1]/TD[2]/SPAN[1]/TABLE[1]/TBODY[1]/TR[1]/TD[2]/A[1], element=Element{node=[A: null], tag=A, text=▼, attributes={class=mceOpen, evlist=false, href=javascript:;, id=textContent_fontselect_open, onclick=return false;, onmousedown=return false;, tabindex=-1}}, source=HybridStateVertexImpl{id=17, name=state17}, target=HybridStateVertexImpl{id=426, name=state426}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(232), "Event fired: ▼");
			testSuiteHelper.runInCrawlingPlugins(426);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 426");

			testSuiteHelper.addStateToReportBuilder(426);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(426)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(426)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(426)
					&& allStatesIdentical;	
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=83)
	public void method_BT417_path_56_1000177_1000178_166_226_227_296_297_298(){
		testSuiteHelper.newCurrentTestMethod("method_BT417_path_56_1000177_1000178_166_226_227_296_297_298", 83);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(13);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(13)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(13)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(13)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[3]/SPAN[1]/A[1], element=Element{node=[A: null], tag=A, text=Platform administration, attributes={evlist=false, href=/claroline11110/claroline/admin/, target=_top}}, source=HybridStateVertexImpl{id=13, name=state13}, target=HybridStateVertexImpl{id=68, name=state68}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(56), "Event fired: Platform administration");
			testSuiteHelper.runInCrawlingPlugins(68);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 68");

			testSuiteHelper.addStateToReportBuilder(68);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(68)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(68)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(68)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/UL[1]/LI[1]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=User list, attributes={evlist=false, href=admin_users.php}}, source=HybridStateVertexImpl{id=68, name=state68}, target=HybridStateVertexImpl{id=156, name=state156}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/UL[1]/LI[1]/UL[1]/LI[1]/FORM[1]/INPUT[1]"), "ebIZwepn"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/UL[1]/LI[2]/UL[1]/LI[1]/FORM[1]/INPUT[1]"), "FPLCMqiI"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(1000177), "Event fired: User list");
			testSuiteHelper.runInCrawlingPlugins(156);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 156");

			testSuiteHelper.addStateToReportBuilder(156);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(156)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(156)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(156)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/TABLE[2]/TBODY[1]/TR[1]/TD[7]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={evlist=false, href=admin_profile.php?uidToEdit=1&cfrom=ulist}}, source=HybridStateVertexImpl{id=156, name=state156}, target=HybridStateVertexImpl{id=286, name=state286}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/FORM[1]/INPUT[1]"), "mFBZSLNr"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(1000178), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(286);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 286");

			testSuiteHelper.addStateToReportBuilder(286);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(286)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(286)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(286)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[2]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Enrol to a new course, attributes={evlist=false, href=../auth/courses.php?cmd=rqReg&uidToEdit=1&fromAdmin=settings&category=, style=background-image: url(/claroline11110/web/img/enroll.png?1232376376); background-repeat: no-repeat; background-position: left center; padding-left: 20px;}}, source=HybridStateVertexImpl{id=286, name=state286}, target=HybridStateVertexImpl{id=287, name=state287}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DL[1]/DD[1]/INPUT[1]"), "Stocco"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DL[1]/DD[2]/INPUT[1]"), "Andrea"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DL[1]/DD[3]/INPUT[1]"), "OhPWyrzM"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[2]/DL[1]/DD[2]/INPUT[1]"), "BuwKabLI"));
			formInputs.add(new FormInput(FormInput.InputType.PASSWORD, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[2]/DL[1]/DD[5]/INPUT[1]"), "admin"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[3]/DL[1]/DD[1]/INPUT[1]"), "astocco@ece.ubc.ca"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[3]/DL[1]/DD[2]/INPUT[1]"), "RlAjQwNe"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[3]/DL[1]/DD[3]/INPUT[1]"), "OCdHkNjE"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[4]/DL[1]/DD[1]/INPUT[1]"), "0"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[4]/DL[1]/DD[1]/INPUT[2]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[4]/DL[1]/DD[1]/SPAN[1]/INPUT[1]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[2]/DL[1]/DD[7]/SELECT[1]"), "claroline"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(166), "Event fired: Enrol to a new course");
			testSuiteHelper.runInCrawlingPlugins(287);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 287");

			testSuiteHelper.addStateToReportBuilder(287);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(287)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(287)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(287)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Search, attributes={evlist=false, type=submit}}, source=HybridStateVertexImpl{id=287, name=state287}, target=HybridStateVertexImpl{id=416, name=state416}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/INPUT[1]"), "BMVrMGBR"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(226), "Event fired: Search");
			testSuiteHelper.runInCrawlingPlugins(416);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 416");

			testSuiteHelper.addStateToReportBuilder(416);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(416)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(416)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(416)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/P[3]/A[1], element=Element{node=[A: null], tag=A, text=Back to user settings, attributes={class=backLink, evlist=false, href=../admin/admin_profile.php?uidToEdit=1&fromAdmin=settings&asTeacher=false, title=Back to user settings}}, source=HybridStateVertexImpl{id=416, name=state416}, target=HybridStateVertexImpl{id=417, name=state417}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/INPUT[1]"), "wwNMGSAS"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(227), "Event fired: Back to user settings");
			testSuiteHelper.runInCrawlingPlugins(417);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 417");

			testSuiteHelper.addStateToReportBuilder(417);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(417)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(417)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(417)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[2]/UL[1]/LI[4]/A[1], element=Element{node=[A: null], tag=A, text=Delete user, attributes={anyaccess=none, evlist=false, href=adminuserdeleted.php?uidToEdit=1&cmd=rqDelete, style=background-image: url(/claroline11110/web/img/deluser.png?1232376376); background-repeat: no-repeat; background-position: left center; padding-left: 20px;}}, source=HybridStateVertexImpl{id=417, name=state417}, target=HybridStateVertexImpl{id=483, name=state483}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DL[1]/DD[1]/INPUT[1]"), "Stocco"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DL[1]/DD[2]/INPUT[1]"), "Andrea"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DL[1]/DD[3]/INPUT[1]"), "DzltDfde"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[2]/DL[1]/DD[2]/INPUT[1]"), "UhVpnsgD"));
			formInputs.add(new FormInput(FormInput.InputType.PASSWORD, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[2]/DL[1]/DD[5]/INPUT[1]"), "admin"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[3]/DL[1]/DD[1]/INPUT[1]"), "astocco@ece.ubc.ca"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[3]/DL[1]/DD[2]/INPUT[1]"), "GdhvWIwk"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[3]/DL[1]/DD[3]/INPUT[1]"), "VvGAsEbv"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[4]/DL[1]/DD[1]/INPUT[1]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[4]/DL[1]/DD[1]/INPUT[2]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[4]/DL[1]/DD[1]/SPAN[1]/INPUT[1]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[2]/DL[1]/DD[7]/SELECT[1]"), "disabled"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(296), "Event fired: Delete user");
			testSuiteHelper.runInCrawlingPlugins(483);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 483");

			testSuiteHelper.addStateToReportBuilder(483);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(483)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(483)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(483)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=Yes, attributes={evlist=false, href=adminuserdeleted.php?cmd=exDelete&uidToEdit=1}}, source=HybridStateVertexImpl{id=483, name=state483}, target=HybridStateVertexImpl{id=484, name=state484}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(297), "Event fired: Yes");
			testSuiteHelper.runInCrawlingPlugins(484);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 484");

			testSuiteHelper.addStateToReportBuilder(484);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(484)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(484)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(484)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/P[1]/SPAN[1]/A[2], element=Element{node=[A: null], tag=A, text=Back to user list, attributes={class=claroCmd, evlist=false, href=admin_users.php}}, source=HybridStateVertexImpl{id=484, name=state484}, target=HybridStateVertexImpl{id=156, name=state156}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(298), "Event fired: Back to user list");
			testSuiteHelper.runInCrawlingPlugins(156);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 156");

			testSuiteHelper.addStateToReportBuilder(156);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(156)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(156)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(156)
					&& allStatesIdentical;	
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=84)
	public void method_BT17_path_153_300_301_302(){
		testSuiteHelper.newCurrentTestMethod("method_BT17_path_153_300_301_302", 84);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(13);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(13)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(13)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(13)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/P[2]/A[1], element=Element{node=[A: null], tag=A, text=Edit text zone, attributes={evlist=false, href=/claroline11110/claroline/admin/managing/editFile.php?cmd=rqEdit&file=textzone_right.inc.html}}, source=HybridStateVertexImpl{id=13, name=state13}, target=HybridStateVertexImpl{id=17, name=state17}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(153), "Event fired: Edit text zone");
			testSuiteHelper.runInCrawlingPlugins(17);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 17");

			testSuiteHelper.addStateToReportBuilder(17);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(17)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(17)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(17)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[3]/DIV[1]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Administration, attributes={evlist=false, href=/claroline11110/claroline/admin/, target=_top}}, source=HybridStateVertexImpl{id=17, name=state17}, target=HybridStateVertexImpl{id=68, name=state68}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(300), "Event fired: Administration");
			testSuiteHelper.runInCrawlingPlugins(68);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 68");

			testSuiteHelper.addStateToReportBuilder(68);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(68)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(68)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(68)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/UL[1]/LI[4]/UL[1]/LI[5]/A[1], element=Element{node=[A: null], tag=A, text=Upgrade, attributes={evlist=false, href=upgrade/index.php}}, source=HybridStateVertexImpl{id=68, name=state68}, target=HybridStateVertexImpl{id=559, name=state559}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/UL[1]/LI[1]/UL[1]/LI[1]/FORM[1]/INPUT[1]"), "ZYOxacMo"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/UL[1]/LI[2]/UL[1]/LI[1]/FORM[1]/INPUT[1]"), "daTwyWxR"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(301), "Event fired: Upgrade");
			testSuiteHelper.runInCrawlingPlugins(559);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 559");

			testSuiteHelper.addStateToReportBuilder(559);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(559)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(559)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(559)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/CENTER[1]/TABLE[1]/TBODY[1]/TR[2]/TD[1]/DIV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Access to campus, attributes={evlist=false, href=../../../index.php?logout=true}}, source=HybridStateVertexImpl{id=559, name=state559}, target=HybridStateVertexImpl{id=0, name=index}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(302), "Event fired: Access to campus");
			testSuiteHelper.runInCrawlingPlugins(0);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 0");

			testSuiteHelper.addStateToReportBuilder(0);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(0)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(0)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(0)
					&& allStatesIdentical;	
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=85)
	public void method_BT391_path_12_56_214_304_306_307_308_309(){
		testSuiteHelper.newCurrentTestMethod("method_BT391_path_12_56_214_304_306_307_308_309", 85);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(0);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(0)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(0)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(0)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/FORM[1]/FIELDSET[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Enter, attributes={evlist=false, tabindex=3, type=submit}}, source=HybridStateVertexImpl{id=0, name=index}, target=HybridStateVertexImpl{id=13, name=state13}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/FORM[1]/FIELDSET[1]/INPUT[1]"), "admin"));
			formInputs.add(new FormInput(FormInput.InputType.PASSWORD, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/FORM[1]/FIELDSET[1]/INPUT[2]"), "admin"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/FORM[1]/INPUT[1]"), "YZWkUHaV"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(12), "Event fired: Enter");
			testSuiteHelper.runInCrawlingPlugins(13);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 13");

			testSuiteHelper.addStateToReportBuilder(13);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(13)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(13)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(13)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[3]/SPAN[1]/A[1], element=Element{node=[A: null], tag=A, text=Platform administration, attributes={evlist=false, href=/claroline11110/claroline/admin/, target=_top}}, source=HybridStateVertexImpl{id=13, name=state13}, target=HybridStateVertexImpl{id=68, name=state68}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(56), "Event fired: Platform administration");
			testSuiteHelper.runInCrawlingPlugins(68);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 68");

			testSuiteHelper.addStateToReportBuilder(68);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(68)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(68)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(68)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/UL[1]/LI[3]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Configuration, attributes={evlist=false, href=tool/config_list.php}}, source=HybridStateVertexImpl{id=68, name=state68}, target=HybridStateVertexImpl{id=391, name=state391}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/UL[1]/LI[1]/UL[1]/LI[1]/FORM[1]/INPUT[1]"), "CXVBwgXO"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/UL[1]/LI[2]/UL[1]/LI[1]/FORM[1]/INPUT[1]"), "HbLjBssU"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(214), "Event fired: Configuration");
			testSuiteHelper.runInCrawlingPlugins(391);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 391");

			testSuiteHelper.addStateToReportBuilder(391);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(391)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(391)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(391)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Home page, attributes={evlist=false, href=config_edit.php?config_code=CLHOME}}, source=HybridStateVertexImpl{id=391, name=state391}, target=HybridStateVertexImpl{id=566, name=state566}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(304), "Event fired: Home page");
			testSuiteHelper.runInCrawlingPlugins(566);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 566");

			testSuiteHelper.addStateToReportBuilder(566);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(566)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(566)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(566)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Display, attributes={evlist=false, href=/claroline11110/claroline/admin/tool/config_edit.php?config_code=CLHOME&section=display}}, source=HybridStateVertexImpl{id=566, name=state566}, target=HybridStateVertexImpl{id=568, name=state568}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/TABLE[1]/TBODY[1]/TR[2]/TD[2]/INPUT[1]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/TABLE[1]/TBODY[1]/TR[2]/TD[2]/INPUT[2]"), "0"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/TABLE[1]/TBODY[1]/TR[4]/TD[2]/INPUT[1]"), "0"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/TABLE[1]/TBODY[1]/TR[4]/TD[2]/INPUT[2]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/TABLE[1]/TBODY[1]/TR[5]/TD[2]/INPUT[1]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/TABLE[1]/TBODY[1]/TR[5]/TD[2]/INPUT[2]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/TABLE[1]/TBODY[1]/TR[3]/TD[2]/SELECT[1]"), "Alphabetical ascending"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(306), "Event fired: Display");
			testSuiteHelper.runInCrawlingPlugins(568);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 568");

			testSuiteHelper.addStateToReportBuilder(568);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(568)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(568)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(568)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Course list, attributes={evlist=false, href=/claroline11110/claroline/admin/tool/config_edit.php?config_code=CLHOME&section=courselist}}, source=HybridStateVertexImpl{id=568, name=state568}, target=HybridStateVertexImpl{id=566, name=state566}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/TABLE[1]/TBODY[1]/TR[2]/TD[2]/INPUT[1]"), "0"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/TABLE[1]/TBODY[1]/TR[2]/TD[2]/INPUT[2]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/TABLE[1]/TBODY[1]/TR[3]/TD[2]/INPUT[1]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/TABLE[1]/TBODY[1]/TR[3]/TD[2]/INPUT[2]"), "0"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(307), "Event fired: Course list");
			testSuiteHelper.runInCrawlingPlugins(566);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 566");

			testSuiteHelper.addStateToReportBuilder(566);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(566)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(566)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(566)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/UL[1]/LI[3]/A[1], element=Element{node=[A: null], tag=A, text=View all, attributes={evlist=false, href=/claroline11110/claroline/admin/tool/config_edit.php?config_code=CLHOME&section=viewall}}, source=HybridStateVertexImpl{id=566, name=state566}, target=HybridStateVertexImpl{id=570, name=state570}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/TABLE[1]/TBODY[1]/TR[2]/TD[2]/INPUT[1]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/TABLE[1]/TBODY[1]/TR[2]/TD[2]/INPUT[2]"), "0"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/TABLE[1]/TBODY[1]/TR[4]/TD[2]/INPUT[1]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/TABLE[1]/TBODY[1]/TR[4]/TD[2]/INPUT[2]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/TABLE[1]/TBODY[1]/TR[5]/TD[2]/INPUT[1]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/TABLE[1]/TBODY[1]/TR[5]/TD[2]/INPUT[2]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/TABLE[1]/TBODY[1]/TR[3]/TD[2]/SELECT[1]"), "Alphabetical ascending"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(308), "Event fired: View all");
			testSuiteHelper.runInCrawlingPlugins(570);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 570");

			testSuiteHelper.addStateToReportBuilder(570);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(570)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(570)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(570)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/TABLE[1]/TBODY[1]/TR[11]/TD[2]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={evlist=false, href=/claroline11110}}, source=HybridStateVertexImpl{id=570, name=state570}, target=HybridStateVertexImpl{id=13, name=state13}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/TABLE[1]/TBODY[1]/TR[3]/TD[2]/INPUT[1]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/TABLE[1]/TBODY[1]/TR[3]/TD[2]/INPUT[2]"), "0"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/TABLE[1]/TBODY[1]/TR[5]/TD[2]/INPUT[1]"), "0"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/TABLE[1]/TBODY[1]/TR[5]/TD[2]/INPUT[2]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/TABLE[1]/TBODY[1]/TR[6]/TD[2]/INPUT[1]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/TABLE[1]/TBODY[1]/TR[6]/TD[2]/INPUT[2]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/TABLE[1]/TBODY[1]/TR[9]/TD[2]/INPUT[1]"), "0"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/TABLE[1]/TBODY[1]/TR[9]/TD[2]/INPUT[2]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/TABLE[1]/TBODY[1]/TR[10]/TD[2]/INPUT[1]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/TABLE[1]/TBODY[1]/TR[10]/TD[2]/INPUT[2]"), "0"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/TABLE[1]/TBODY[1]/TR[4]/TD[2]/SELECT[1]"), "Alphabetical descending"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(309), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(13);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 13");

			testSuiteHelper.addStateToReportBuilder(13);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(13)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(13)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(13)
					&& allStatesIdentical;	
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=86)
	public void method_BT300_path_56_58_60_175_310(){
		testSuiteHelper.newCurrentTestMethod("method_BT300_path_56_58_60_175_310", 86);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(13);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(13)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(13)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(13)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[3]/SPAN[1]/A[1], element=Element{node=[A: null], tag=A, text=Platform administration, attributes={evlist=false, href=/claroline11110/claroline/admin/, target=_top}}, source=HybridStateVertexImpl{id=13, name=state13}, target=HybridStateVertexImpl{id=68, name=state68}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(56), "Event fired: Platform administration");
			testSuiteHelper.runInCrawlingPlugins(68);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 68");

			testSuiteHelper.addStateToReportBuilder(68);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(68)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(68)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(68)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/UL[1]/LI[1]/UL[1]/LI[1]/FORM[1]/SMALL[1]/A[1], element=Element{node=[A: null], tag=A, text=Advanced, attributes={evlist=false, href=advanced_user_search.php}}, source=HybridStateVertexImpl{id=68, name=state68}, target=HybridStateVertexImpl{id=70, name=state70}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/UL[1]/LI[1]/UL[1]/LI[1]/FORM[1]/INPUT[1]"), "EewRXilN"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/UL[1]/LI[2]/UL[1]/LI[1]/FORM[1]/INPUT[1]"), "EIRqChgC"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(58), "Event fired: Advanced");
			testSuiteHelper.runInCrawlingPlugins(70);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 70");

			testSuiteHelper.addStateToReportBuilder(70);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(70)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(70)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(70)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/TABLE[1]/TBODY[1]/TR[7]/TD[2]/INPUT[1], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={class=claroButton, evlist=false, type=submit, value=Search user}}, source=HybridStateVertexImpl{id=70, name=state70}, target=HybridStateVertexImpl{id=72, name=state72}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/TABLE[1]/TBODY[1]/TR[1]/TD[2]/INPUT[1]"), "nAdRVyJU"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/TABLE[1]/TBODY[1]/TR[2]/TD[2]/INPUT[1]"), "TrsDlXDK"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/TABLE[1]/TBODY[1]/TR[3]/TD[2]/INPUT[1]"), "IWmJjRbh"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/TABLE[1]/TBODY[1]/TR[4]/TD[2]/INPUT[1]"), "IJKQpwAr"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/TABLE[1]/TBODY[1]/TR[5]/TD[2]/INPUT[1]"), "IFNMQfjY"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/TABLE[1]/TBODY[1]/TR[6]/TD[2]/SELECT[1]"), "Student"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(60), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(72);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 72");

			testSuiteHelper.addStateToReportBuilder(72);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(72)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(72)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(72)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[2]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Reset all user passwords, attributes={evlist=false, href=/claroline11110/claroline/admin/admin_users.php?cmd=rqResetAllPasswords, style=background-image: url(/claroline11110/web/img/locked.png?1232376376); background-repeat: no-repeat; background-position: left center; padding-left: 20px;}}, source=HybridStateVertexImpl{id=72, name=state72}, target=HybridStateVertexImpl{id=300, name=state300}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/FORM[1]/INPUT[1]"), "TVwUqtlC"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(175), "Event fired: Reset all user passwords");
			testSuiteHelper.runInCrawlingPlugins(300);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 300");

			testSuiteHelper.addStateToReportBuilder(300);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(300)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(300)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(300)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[2]/FORM[1]/INPUT[3], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={evlist=false, type=submit, value=Yes}}, source=HybridStateVertexImpl{id=300, name=state300}, target=HybridStateVertexImpl{id=577, name=state577}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[2]/FORM[1]/INPUT[2]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/FORM[1]/INPUT[1]"), "QxYyMCvD"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(310), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(577);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 577");

			testSuiteHelper.addStateToReportBuilder(577);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(577)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(577)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(577)
					&& allStatesIdentical;	
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=87)
	public void method_BT290_path_169_311_312_313_314_316_317_320_321_327_332_335_336_338_339_340_342_343_344_346(){
		testSuiteHelper.newCurrentTestMethod("method_BT290_path_169_311_312_313_314_316_317_320_321_327_332_335_336_338_339_340_342_343_344_346", 87);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(13);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(13)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(13)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(13)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Create a course site, attributes={class=userCommandsItem, evlist=false, href=/claroline11110/claroline/course/create.php}}, source=HybridStateVertexImpl{id=13, name=state13}, target=HybridStateVertexImpl{id=290, name=state290}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(169), "Event fired: Create a course site");
			testSuiteHelper.runInCrawlingPlugins(290);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 290");

			testSuiteHelper.addStateToReportBuilder(290);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(290)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(290)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(290)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/DL[1]/DT[1]/INPUT[1], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={evlist=false, name=changeProperties, type=submit, value=Ok}}, source=HybridStateVertexImpl{id=290, name=state290}, target=HybridStateVertexImpl{id=580, name=state580}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[1]/DL[1]/DD[1]/INPUT[1]"), "dWevfnOk"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[1]/DL[1]/DD[2]/INPUT[1]"), "vMMMwIxG"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[1]/DL[1]/DD[5]/INPUT[1]"), "jmznFgzO"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[1]/DL[1]/DD[6]/INPUT[1]"), "jdoe@mydomain.net"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[1]/DL[1]/DD[7]/INPUT[1]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[1]/DL[1]/DD[7]/INPUT[2]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[1]/DL[1]/DD[7]/INPUT[3]"), "0"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[1]/DL[1]/DD[8]/INPUT[1]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[1]/DL[1]/DD[8]/BLOCKQUOTE[1]/INPUT[1]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[1]/DL[1]/DD[8]/BLOCKQUOTE[1]/INPUT[2]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[1]/DL[1]/DD[8]/BLOCKQUOTE[1]/INPUT[3]"), "YypshSCz"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[1]/DL[1]/DD[8]/INPUT[2]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[1]/DL[1]/DD[3]/TABLE[1]/TBODY[1]/TR[1]/TD[3]/SELECT[1]"), "Economics"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[1]/DL[1]/DD[4]/SELECT[1]"), "English"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(311), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(580);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 580");

			testSuiteHelper.addStateToReportBuilder(580);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(580)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(580)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(580)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/P[1]/A[1], element=Element{node=[A: null], tag=A, text=Continue, attributes={class= claroCmd, evlist=false, href=/claroline11110/claroline/course/index.php?cid=VMMMWIXG}}, source=HybridStateVertexImpl{id=580, name=state580}, target=HybridStateVertexImpl{id=581, name=state581}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(312), "Event fired: Continue");
			testSuiteHelper.runInCrawlingPlugins(581);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 581");

			testSuiteHelper.addStateToReportBuilder(581);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(581)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(581)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(581)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[3]/DIV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text= Claroline, attributes={evlist=false, href=/claroline11110/index.php, target=_top}}, source=HybridStateVertexImpl{id=581, name=state581}, target=HybridStateVertexImpl{id=582, name=state582}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(313), "Event fired:  Claroline");
			testSuiteHelper.runInCrawlingPlugins(582);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 582");

			testSuiteHelper.addStateToReportBuilder(582);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(582)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(582)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(582)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DL[1]/DT[1]/SPAN[1]/A[1], element=Element{node=[A: null], tag=A, text=VMMMWIXG - dWevfnOk, attributes={evlist=false, href=/claroline11110/claroline/course/index.php?cid=VMMMWIXG}}, source=HybridStateVertexImpl{id=582, name=state582}, target=HybridStateVertexImpl{id=581, name=state581}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(314), "Event fired: VMMMWIXG - dWevfnOk");
			testSuiteHelper.runInCrawlingPlugins(581);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 581");

			testSuiteHelper.addStateToReportBuilder(581);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(581)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(581)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(581)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[3]/DIV[2]/A[1], element=Element{node=[A: null], tag=A, text=Student, attributes={evlist=false, href=/claroline11110/claroline/course/index.php?cid=VMMMWIXG&viewMode=STUDENT&cidReset=true&cidReq=VMMMWIXG}}, source=HybridStateVertexImpl{id=581, name=state581}, target=HybridStateVertexImpl{id=585, name=state585}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(316), "Event fired: Student");
			testSuiteHelper.runInCrawlingPlugins(585);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 585");

			testSuiteHelper.addStateToReportBuilder(585);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(585)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(585)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(585)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[3]/DIV[2]/A[1], element=Element{node=[A: null], tag=A, text=Course manager, attributes={evlist=false, href=/claroline11110/claroline/course/index.php?cid=VMMMWIXG&cidReset=true&cidReq=VMMMWIXG&viewMode=COURSE_ADMIN}}, source=HybridStateVertexImpl{id=585, name=state585}, target=HybridStateVertexImpl{id=581, name=state581}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(317), "Event fired: Course manager");
			testSuiteHelper.runInCrawlingPlugins(581);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 581");

			testSuiteHelper.addStateToReportBuilder(581);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(581)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(581)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(581)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text= Course description, attributes={class=item, evlist=false, href=/claroline11110/claroline/course_description/index.php?cidReset=true&cidReq=VMMMWIXG, id=CLDSC}}, source=HybridStateVertexImpl{id=581, name=state581}, target=HybridStateVertexImpl{id=589, name=state589}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(320), "Event fired:  Course description");
			testSuiteHelper.runInCrawlingPlugins(589);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 589");

			testSuiteHelper.addStateToReportBuilder(589);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(589)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(589)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(589)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/UL[3]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Edit Tool list, attributes={anyaccess=none, class=claroCmd, evlist=false, href=/claroline11110/claroline/course/tools.php?cidReset=true&cidReq=VMMMWIXG}}, source=HybridStateVertexImpl{id=589, name=state589}, target=HybridStateVertexImpl{id=590, name=state590}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[3]/DIV[2]/FORM[1]/FIELDSET[1]/SELECT[1]"), "Course content"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(321), "Event fired: Edit Tool list");
			testSuiteHelper.runInCrawlingPlugins(590);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 590");

			testSuiteHelper.addStateToReportBuilder(590);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(590)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(590)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(590)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/UL[3]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Course settings, attributes={anyaccess=none, class=claroCmd, evlist=false, href=/claroline11110/claroline/course/settings.php?cidReset=true&cidReq=VMMMWIXG}}, source=HybridStateVertexImpl{id=590, name=state590}, target=HybridStateVertexImpl{id=596, name=state596}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(327), "Event fired: Course settings");
			testSuiteHelper.runInCrawlingPlugins(596);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 596");

			testSuiteHelper.addStateToReportBuilder(596);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(596)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(596)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(596)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[3]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[1]/DL[1]/DD[7]/LABEL[3]/A[1], element=Element{node=[A: null], tag=A, text=course user list, attributes={evlist=false, href=../user/user.php}}, source=HybridStateVertexImpl{id=596, name=state596}, target=HybridStateVertexImpl{id=601, name=state601}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[3]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[1]/DL[1]/DD[1]/INPUT[1]"), "uajeGYnq"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[3]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[1]/DL[1]/DD[2]/INPUT[1]"), "IXpjGilg"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[3]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[1]/DL[1]/DD[5]/INPUT[1]"), "DnWCkJUd"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[3]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[1]/DL[1]/DD[6]/INPUT[1]"), "jdoe@mydomain.net"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[3]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[1]/DL[1]/DD[7]/INPUT[1]"), "0"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[3]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[1]/DL[1]/DD[7]/INPUT[2]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[3]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[1]/DL[1]/DD[7]/INPUT[3]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[3]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[1]/DL[1]/DD[8]/INPUT[1]"), "0"));
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[3]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[1]/DL[1]/DD[8]/BLOCKQUOTE[1]/INPUT[1]"), "0"));
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[3]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[1]/DL[1]/DD[8]/BLOCKQUOTE[1]/INPUT[2]"), "0"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "course_registrationKey"), "SuUkYfgO"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(332), "Event fired: course user list");
			testSuiteHelper.runInCrawlingPlugins(601);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 601");

			testSuiteHelper.addStateToReportBuilder(601);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(601)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(601)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(601)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[3]/DIV[2]/A[1], element=Element{node=[A: null], tag=A, text=Student, attributes={anyaccess=none, evlist=false, href=/claroline11110/claroline/user/user.php?viewMode=STUDENT&cidReset=true&cidReq=VMMMWIXG}}, source=HybridStateVertexImpl{id=601, name=state601}, target=HybridStateVertexImpl{id=604, name=state604}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(335), "Event fired: Student");
			testSuiteHelper.runInCrawlingPlugins(604);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 604");

			testSuiteHelper.addStateToReportBuilder(604);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(604)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(604)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(604)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[3]/DIV[2]/A[1], element=Element{node=[A: null], tag=A, text=Course manager, attributes={evlist=false, href=/claroline11110/claroline/user/user.php?cidReset=true&cidReq=VMMMWIXG&viewMode=COURSE_ADMIN}}, source=HybridStateVertexImpl{id=604, name=state604}, target=HybridStateVertexImpl{id=601, name=state601}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(336), "Event fired: Course manager");
			testSuiteHelper.runInCrawlingPlugins(601);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 601");

			testSuiteHelper.addStateToReportBuilder(601);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(601)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(601)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(601)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[3]/DIV[2]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[2]/UL[1]/LI[8]/A[1], element=Element{node=[A: null], tag=A, text=Enrol class, attributes={anyaccess=none, evlist=false, href=/claroline11110/claroline/user/class_add.php?cidReset=true&cidReq=VMMMWIXG, style=background-image: url(/claroline11110/web/img/class.png?1232376376); background-repeat: no-repeat; background-position: left center; padding-left: 20px;}}, source=HybridStateVertexImpl{id=601, name=state601}, target=HybridStateVertexImpl{id=607, name=state607}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(338), "Event fired: Enrol class");
			testSuiteHelper.runInCrawlingPlugins(607);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 607");

			testSuiteHelper.addStateToReportBuilder(607);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(607)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(607)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(607)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/UL[3]/LI[3]/A[1], element=Element{node=[A: null], tag=A, text=Create a session course, attributes={anyaccess=none, class=claroCmd, evlist=false, href=/claroline11110/claroline/course/create.php?course_sourceCourseId=1}}, source=HybridStateVertexImpl{id=607, name=state607}, target=HybridStateVertexImpl{id=608, name=state608}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(339), "Event fired: Create a session course");
			testSuiteHelper.runInCrawlingPlugins(608);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 608");

			testSuiteHelper.addStateToReportBuilder(608);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(608)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(608)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(608)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/UL[3]/LI[4]/A[1], element=Element{node=[A: null], tag=A, text=Statistics, attributes={anyaccess=none, class=claroCmd, evlist=false, href=/claroline11110/claroline/tracking/courseReport.php?cidReset=true&cidReq=VMMMWIXG}}, source=HybridStateVertexImpl{id=608, name=state608}, target=HybridStateVertexImpl{id=609, name=state609}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[3]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[1]/DL[1]/DD[1]/INPUT[1]"), "uBfTqlRh"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[3]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[1]/DL[1]/DD[2]/INPUT[1]"), "hZhZENvw"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[3]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[1]/DL[1]/DD[5]/INPUT[1]"), "VPnYVlqW"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[3]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[1]/DL[1]/DD[6]/INPUT[1]"), "jdoe@mydomain.net"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[3]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[1]/DL[1]/DD[7]/INPUT[1]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[3]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[1]/DL[1]/DD[7]/INPUT[2]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[3]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[1]/DL[1]/DD[7]/INPUT[3]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[3]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[1]/DL[1]/DD[8]/INPUT[1]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[3]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[1]/DL[1]/DD[8]/BLOCKQUOTE[1]/INPUT[1]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[3]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[1]/DL[1]/DD[8]/BLOCKQUOTE[1]/INPUT[2]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[3]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[1]/DL[1]/DD[8]/BLOCKQUOTE[1]/INPUT[3]"), "DJJZVisv"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[3]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[1]/DL[1]/DD[8]/INPUT[2]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[3]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[1]/DL[1]/DD[3]/TABLE[1]/TBODY[1]/TR[1]/TD[3]/SELECT[1]"), "Economics"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[3]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[1]/DL[1]/DD[4]/SELECT[1]"), "English"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(340), "Event fired: Statistics");
			testSuiteHelper.runInCrawlingPlugins(609);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 609");

			testSuiteHelper.addStateToReportBuilder(609);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(609)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(609)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(609)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[3]/DIV[2]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[2]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Delete all course statistics, attributes={evlist=false, href=delete_course_stats.php?cidReset=true&cidReq=VMMMWIXG, style=background-image: url(/claroline11110/web/img/delete.png?1232376376); background-repeat: no-repeat; background-position: left center; padding-left: 20px;}}, source=HybridStateVertexImpl{id=609, name=state609}, target=HybridStateVertexImpl{id=611, name=state611}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(342), "Event fired: Delete all course statistics");
			testSuiteHelper.runInCrawlingPlugins(611);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 611");

			testSuiteHelper.addStateToReportBuilder(611);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(611)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(611)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(611)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[3]/DIV[2]/DIV[2]/DIV[2]/FORM[1]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={evlist=false, href=/claroline11110/claroline/course/index.php?cid=VMMMWIXG}}, source=HybridStateVertexImpl{id=611, name=state611}, target=HybridStateVertexImpl{id=581, name=state581}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[3]/DIV[2]/DIV[2]/DIV[2]/FORM[1]/INPUT[4]"), "0"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[3]/DIV[2]/DIV[2]/DIV[2]/FORM[1]/INPUT[5]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[3]/DIV[2]/DIV[2]/DIV[2]/FORM[1]/SELECT[1]"), "24"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[3]/DIV[2]/DIV[2]/DIV[2]/FORM[1]/SELECT[2]"), "May"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[3]/DIV[2]/DIV[2]/DIV[2]/FORM[1]/SELECT[3]"), "2022"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(343), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(581);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 581");

			testSuiteHelper.addStateToReportBuilder(581);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(581)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(581)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(581)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/UL[1]/LI[3]/A[1], element=Element{node=[A: null], tag=A, text= Agenda, attributes={class=item, evlist=false, href=/claroline11110/claroline/calendar/agenda.php?cidReset=true&cidReq=VMMMWIXG, id=CLCAL}}, source=HybridStateVertexImpl{id=581, name=state581}, target=HybridStateVertexImpl{id=613, name=state613}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(344), "Event fired:  Agenda");
			testSuiteHelper.runInCrawlingPlugins(613);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 613");

			testSuiteHelper.addStateToReportBuilder(613);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(613)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(613)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(613)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[3]/DIV[2]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[2]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Add an event, attributes={evlist=false, href=/claroline11110/claroline/calendar/agenda.php?cmd=rqAdd&cidReset=true&cidReq=VMMMWIXG, style=background-image: url(/claroline11110/claroline/calendar/img/agenda_new.png?1213264746); background-repeat: no-repeat; background-position: left center; padding-left: 20px;}}, source=HybridStateVertexImpl{id=613, name=state613}, target=HybridStateVertexImpl{id=615, name=state615}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(346), "Event fired: Add an event");
			testSuiteHelper.runInCrawlingPlugins(615);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 615");

			testSuiteHelper.addStateToReportBuilder(615);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(615)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(615)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(615)
					&& allStatesIdentical;	
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}


}	 
