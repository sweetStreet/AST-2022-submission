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
 * Generated @ Tue Oct 05 00:05:08 CDT 2021
 */

public class GeneratedTests {
	private final boolean mutate = true;
    private final String URL = "http://localhost:3000/pagekit/index.php/admin/login";
	private TestSuiteHelper testSuiteHelper;
	
	private final String CRAWL_PATH = "/Users/liuyu/projects/tackle-test-generator-ui-level/testlabeling/crawljax_frag/out/pagekit/pagekit_HYBRID_DOM_-1.0_60mins/localhost/crawl2";

	private StateEquivalenceAssertionMode assertionMode = StateEquivalenceAssertionMode.HYBRID;
	
	private CrawljaxConfiguration getTestConfiguration() {
		CrawljaxConfigurationBuilder builder = CrawljaxConfiguration.builderFor(URL);
		builder.crawlRules().waitAfterEvent(1000, TimeUnit.MILLISECONDS);
		builder.crawlRules().waitAfterReloadUrl(1000, TimeUnit.MILLISECONDS);
		builder.setBrowserConfig(new BrowserConfiguration(BrowserType.CHROME_HEADLESS, 1, new BrowserOptions(false, 2)));
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
	public void method_BT0_path_1(){
		testSuiteHelper.newCurrentTestMethod("method_BT0_path_1", 2);
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
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/FORM[1]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Request Password, attributes={class=uk-link, data-uk-toggle={ target: '.js-toggle' }, evlist=false}}, source=HybridStateVertexImpl{id=0, name=index}, target=HybridStateVertexImpl{id=2, name=state2}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/INPUT[1]"), "admin"));
			formInputs.add(new FormInput(FormInput.InputType.PASSWORD, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[2]/INPUT[1]"), "asdfghjkl123"));
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[1]/FORM[1]/UL[1]/LI[1]/LABEL[1]/INPUT[1]"), "1"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(1), "Event fired: Request Password");
			testSuiteHelper.runInCrawlingPlugins(2);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 2");

			testSuiteHelper.addStateToReportBuilder(2);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(2)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(2)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(2)
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
	public void method_BT0_path_5_7_8_9_10_11_12_13(){
		testSuiteHelper.newCurrentTestMethod("method_BT0_path_5_7_8_9_10_11_12_13", 3);
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
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/P[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Login, attributes={class=uk-button uk-button-primary uk-button-large uk-width-1-1, evlist=false}}, source=HybridStateVertexImpl{id=0, name=index}, target=HybridStateVertexImpl{id=5, name=state5}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/INPUT[1]"), "admin"));
			formInputs.add(new FormInput(FormInput.InputType.PASSWORD, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[2]/INPUT[1]"), "asdfghjkl123"));
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[1]/FORM[1]/UL[1]/LI[1]/LABEL[1]/INPUT[1]"), "0"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(5), "Event fired: Login");
			testSuiteHelper.runInCrawlingPlugins(5);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 5");

			testSuiteHelper.addStateToReportBuilder(5);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(5)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(5)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(5)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/HEADER[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Site, attributes={class=uk-panel tm-panel-icon, evlist=false, href=/pagekit/index.php/admin/site/page}}, source=HybridStateVertexImpl{id=5, name=state5}, target=HybridStateVertexImpl{id=7, name=state7}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(7), "Event fired: Site");
			testSuiteHelper.runInCrawlingPlugins(7);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 7");

			testSuiteHelper.addStateToReportBuilder(7);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(7)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(7)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(7)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/HEADER[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[4]/A[1], element=Element{node=[A: null], tag=A, text=admin, attributes={anyaccess=none, evlist=false, href=/pagekit/index.php/admin/user/edit?id=1, title=Profile}}, source=HybridStateVertexImpl{id=7, name=state7}, target=HybridStateVertexImpl{id=8, name=state8}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"), "0"));
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[2]/DIV[2]/UL[1]/LI[1]/DIV[1]/DIV[2]/INPUT[1]"), "0"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(8), "Event fired: admin");
			testSuiteHelper.runInCrawlingPlugins(8);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 8");

			testSuiteHelper.addStateToReportBuilder(8);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(8)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(8)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(8)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/HEADER[1]/DIV[1]/NAV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=List, attributes={anyaccess=none, evlist=false, href=/pagekit/index.php/admin/user}}, source=HybridStateVertexImpl{id=8, name=state8}, target=HybridStateVertexImpl{id=9, name=state9}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"), "example"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"), "example123"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/DIV[1]/INPUT[1]"), "example@example.com"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[5]/DIV[1]/P[1]/LABEL[1]/INPUT[1]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[5]/DIV[1]/P[2]/LABEL[1]/INPUT[1]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[6]/DIV[1]/P[1]/LABEL[1]/INPUT[1]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[6]/DIV[1]/P[2]/LABEL[1]/INPUT[1]"), "1"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(9), "Event fired: List");
			testSuiteHelper.runInCrawlingPlugins(9);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 9");

			testSuiteHelper.addStateToReportBuilder(9);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(9)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(9)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(9)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[2]/A[1], element=Element{node=[A: null], tag=A, text=Add User, attributes={class=uk-button uk-button-primary, evlist=false, href=/pagekit/index.php/admin/user/edit}}, source=HybridStateVertexImpl{id=9, name=state9}, target=HybridStateVertexImpl{id=10, name=state10}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"), "sKwSOKjO"));
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[2]/TABLE[1]/THEAD[1]/TR[1]/TH[1]/INPUT[1]"), "0"));
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[2]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/INPUT[1]"), "0"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(10), "Event fired: Add User");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/FORM[1]/DIV[1]/DIV[2]/A[1], element=Element{node=[A: null], tag=A, text=Cancel, attributes={class=uk-button uk-margin-small-right, evlist=false, href=/pagekit/index.php/admin/user}}, source=HybridStateVertexImpl{id=10, name=state10}, target=HybridStateVertexImpl{id=11, name=state11}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"), "example"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"), "example123"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/DIV[1]/INPUT[1]"), "example@example.com"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[5]/DIV[1]/P[1]/LABEL[1]/INPUT[1]"), "0"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[5]/DIV[1]/P[2]/LABEL[1]/INPUT[1]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[6]/DIV[1]/P[1]/LABEL[1]/INPUT[1]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[6]/DIV[1]/P[2]/LABEL[1]/INPUT[1]"), "0"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(11), "Event fired: Cancel");
			testSuiteHelper.runInCrawlingPlugins(11);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 11");

			testSuiteHelper.addStateToReportBuilder(11);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(11)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(11)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(11)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[2]/A[1], element=Element{node=[A: null], tag=A, text=Add User, attributes={class=uk-button uk-button-primary, evlist=false, href=/pagekit/index.php/admin/user/edit}}, source=HybridStateVertexImpl{id=11, name=state11}, target=HybridStateVertexImpl{id=10, name=state10}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"), "KgqVIsUw"));
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[2]/TABLE[1]/THEAD[1]/TR[1]/TH[1]/INPUT[1]"), "1"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(12), "Event fired: Add User");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[4]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=Change password, attributes={evlist=false, href=#}}, source=HybridStateVertexImpl{id=10, name=state10}, target=HybridStateVertexImpl{id=13, name=state13}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"), "example"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"), "example123"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/DIV[1]/INPUT[1]"), "example@example.com"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[5]/DIV[1]/P[1]/LABEL[1]/INPUT[1]"), "0"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[5]/DIV[1]/P[2]/LABEL[1]/INPUT[1]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[6]/DIV[1]/P[1]/LABEL[1]/INPUT[1]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[6]/DIV[1]/P[2]/LABEL[1]/INPUT[1]"), "0"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(13), "Event fired: Change password");
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

	@Test(priority=4)
	public void method_BT5_path_15(){
		testSuiteHelper.newCurrentTestMethod("method_BT5_path_15", 4);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(5);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(5)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(5)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(5)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/HEADER[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[3]/A[1], element=Element{node=[A: null], tag=A, text=Users, attributes={class=uk-panel tm-panel-icon, evlist=false, href=/pagekit/index.php/admin/user}}, source=HybridStateVertexImpl{id=5, name=state5}, target=HybridStateVertexImpl{id=11, name=state11}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(15), "Event fired: Users");
			testSuiteHelper.runInCrawlingPlugins(11);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 11");

			testSuiteHelper.addStateToReportBuilder(11);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(11)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(11)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(11)
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
	public void method_BT7_path_7_16_18_19_20_21_22_24(){
		testSuiteHelper.newCurrentTestMethod("method_BT7_path_7_16_18_19_20_21_22_24", 5);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(5);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(5)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(5)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(5)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/HEADER[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Site, attributes={class=uk-panel tm-panel-icon, evlist=false, href=/pagekit/index.php/admin/site/page}}, source=HybridStateVertexImpl{id=5, name=state5}, target=HybridStateVertexImpl{id=7, name=state7}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(7), "Event fired: Site");
			testSuiteHelper.runInCrawlingPlugins(7);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 7");

			testSuiteHelper.addStateToReportBuilder(7);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(7)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(7)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(7)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/HEADER[1]/DIV[1]/NAV[1]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Widgets, attributes={evlist=false, href=/pagekit/index.php/admin/site/widget}}, source=HybridStateVertexImpl{id=7, name=state7}, target=HybridStateVertexImpl{id=19, name=state19}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"), "0"));
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[2]/DIV[2]/UL[1]/LI[1]/DIV[1]/DIV[2]/INPUT[1]"), "0"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(16), "Event fired: Widgets");
			testSuiteHelper.runInCrawlingPlugins(19);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 19");

			testSuiteHelper.addStateToReportBuilder(19);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(19)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(19)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(19)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Unassigned 2, attributes={evlist=false}}, source=HybridStateVertexImpl{id=19, name=state19}, target=HybridStateVertexImpl{id=21, name=state21}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"), "YXhNpnqX"));
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"), "1"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(18), "Event fired: Unassigned 2");
			testSuiteHelper.runInCrawlingPlugins(21);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 21");

			testSuiteHelper.addStateToReportBuilder(21);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(21)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(21)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(21)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Menu, attributes={anyaccess=none, evlist=false, href=/pagekit/index.php/admin/site/widget/edit?type=system%2Fmenu&position=_unassigned}}, source=HybridStateVertexImpl{id=21, name=state21}, target=HybridStateVertexImpl{id=22, name=state22}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"), "DnRnmZcf"));
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"), "1"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(19), "Event fired: Menu");
			testSuiteHelper.runInCrawlingPlugins(22);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 22");

			testSuiteHelper.addStateToReportBuilder(22);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(22)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(22)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(22)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/FORM[1]/DIV[1]/DIV[2]/A[1], element=Element{node=[A: null], tag=A, text=Cancel, attributes={class=uk-button uk-margin-small-right, evlist=false, href=/pagekit/index.php/admin/site/widget}}, source=HybridStateVertexImpl{id=22, name=state22}, target=HybridStateVertexImpl{id=21, name=state21}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"), "sncHEsAm"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[5]/DIV[1]/P[1]/LABEL[1]/INPUT[1]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[5]/DIV[1]/P[2]/LABEL[1]/INPUT[1]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[3]/DIV[1]/P[1]/LABEL[1]/INPUT[1]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[3]/DIV[1]/P[2]/LABEL[1]/INPUT[1]"), "0"));
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[3]/DIV[1]/P[3]/LABEL[1]/INPUT[1]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"), "Not Linked"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/DIV[1]/SELECT[1]"), "10"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[4]/DIV[1]/SELECT[1]"), "10"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/SELECT[1]"), "Disabled"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"), "- Assign -"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(20), "Event fired: Cancel");
			testSuiteHelper.runInCrawlingPlugins(21);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 21");

			testSuiteHelper.addStateToReportBuilder(21);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(21)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(21)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(21)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Text, attributes={anyaccess=none, evlist=false, href=/pagekit/index.php/admin/site/widget/edit?type=system%2Ftext&position=_unassigned}}, source=HybridStateVertexImpl{id=21, name=state21}, target=HybridStateVertexImpl{id=24, name=state24}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"), "qHqdNUSE"));
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"), "1"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(21), "Event fired: Text");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/HEADER[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[4]/A[1], element=Element{node=[A: null], tag=A, text=System, attributes={anyaccess=none, class=uk-panel tm-panel-icon, evlist=false, href=/pagekit/index.php/admin/system/settings}}, source=HybridStateVertexImpl{id=24, name=state24}, target=HybridStateVertexImpl{id=25, name=state25}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"), "uDwBkMpq"));
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/P[1]/LABEL[1]/INPUT[1]"), "0"));
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[3]/DIV[1]/P[1]/LABEL[1]/INPUT[1]"), "0"));
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[3]/DIV[1]/P[2]/LABEL[1]/INPUT[1]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[3]/DIV[1]/P[3]/LABEL[1]/INPUT[1]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/TEXTAREA[1]"), "PLyEjgGA"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/SELECT[1]"), "Disabled"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"), "- Assign -"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(22), "Event fired: System");
			testSuiteHelper.runInCrawlingPlugins(25);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 25");

			testSuiteHelper.addStateToReportBuilder(25);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(25)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(25)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(25)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/HEADER[1]/DIV[1]/NAV[1]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Extensions, attributes={evlist=false, href=/pagekit/index.php/admin/system/package/extensions}}, source=HybridStateVertexImpl{id=25, name=state25}, target=HybridStateVertexImpl{id=27, name=state27}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/FORM[1]/DIV[1]/DIV[2]/UL[1]/LI[1]/DIV[2]/DIV[1]/INPUT[1]"), "oYiwLOfN"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/FORM[1]/DIV[1]/DIV[2]/UL[1]/LI[1]/DIV[3]/DIV[1]/INPUT[1]"), "sEOUCuKs"));
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/FORM[1]/DIV[1]/DIV[2]/UL[1]/LI[1]/DIV[4]/DIV[1]/P[1]/LABEL[1]/INPUT[1]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/FORM[1]/DIV[1]/DIV[2]/UL[1]/LI[1]/DIV[4]/DIV[1]/P[2]/LABEL[1]/INPUT[1]"), "1"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(24), "Event fired: Extensions");
			testSuiteHelper.runInCrawlingPlugins(27);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 27");

			testSuiteHelper.addStateToReportBuilder(27);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(27)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(27)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(27)
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
	public void method_BT5_path_28_29_30(){
		testSuiteHelper.newCurrentTestMethod("method_BT5_path_28_29_30", 6);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(5);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(5)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(5)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(5)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/HEADER[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[5]/A[1], element=Element{node=[A: null], tag=A, text=Marketplace, attributes={class=uk-panel tm-panel-icon, evlist=false, href=/pagekit/index.php/admin/system/marketplace/extensions}}, source=HybridStateVertexImpl{id=5, name=state5}, target=HybridStateVertexImpl{id=30, name=state30}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(28), "Event fired: Marketplace");
			testSuiteHelper.runInCrawlingPlugins(30);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 30");

			testSuiteHelper.addStateToReportBuilder(30);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(30)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(30)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(30)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[2]/DIV[1]/DIV[9]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={anyaccess=none, class=uk-position-cover, evlist=false}}, source=HybridStateVertexImpl{id=30, name=state30}, target=HybridStateVertexImpl{id=31, name=state31}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"), "vGdnkiru"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(29), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(31);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 31");

			testSuiteHelper.addStateToReportBuilder(31);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(31)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(31)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(31)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/HEADER[1]/DIV[1]/NAV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Extensions, attributes={anyaccess=none, evlist=false, href=/pagekit/index.php/admin/system/marketplace/extensions}}, source=HybridStateVertexImpl{id=31, name=state31}, target=HybridStateVertexImpl{id=32, name=state32}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"), "PsswZgTl"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(30), "Event fired: Extensions");
			testSuiteHelper.runInCrawlingPlugins(32);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 32");

			testSuiteHelper.addStateToReportBuilder(32);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(32)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(32)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(32)
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
	public void method_BT30_failed_path_1000002(){
		testSuiteHelper.newCurrentTestMethod("method_BT30_failed_path_1000002", 7);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(5);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(5)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(5)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(5)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/HEADER[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[5]/A[1], element=Element{node=[A: null], tag=A, text=Marketplace, attributes={class=uk-panel tm-panel-icon, evlist=false, href=/pagekit/index.php/admin/system/marketplace/extensions}}, source=HybridStateVertexImpl{id=5, name=state5}, target=HybridStateVertexImpl{id=32, name=state32}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1000002), "Event fired: Marketplace");
			testSuiteHelper.runInCrawlingPlugins(32);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 32");

			testSuiteHelper.addStateToReportBuilder(32);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(32)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(32)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(32)
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
	public void method_BT30_path_33(){
		testSuiteHelper.newCurrentTestMethod("method_BT30_path_33", 8);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(5);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(5)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(5)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(5)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=Update now!, attributes={evlist=false, href=/pagekit/admin/system/update}}, source=HybridStateVertexImpl{id=5, name=state5}, target=HybridStateVertexImpl{id=38, name=state38}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(33), "Event fired: Update now!");
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

	@Test(priority=9)
	public void method_BT5_path_34_35_39_40_41_42_43(){
		testSuiteHelper.newCurrentTestMethod("method_BT5_path_34_35_39_40_41_42_43", 9);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(5);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(5)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(5)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(5)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=Add Widget, attributes={class=uk-button uk-button-primary, evlist=false}}, source=HybridStateVertexImpl{id=5, name=state5}, target=HybridStateVertexImpl{id=40, name=state40}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(34), "Event fired: Add Widget");
			testSuiteHelper.runInCrawlingPlugins(40);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 40");

			testSuiteHelper.addStateToReportBuilder(40);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(40)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(40)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(40)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=User, attributes={class=uk-dropdown-close, evlist=false}}, source=HybridStateVertexImpl{id=40, name=state40}, target=HybridStateVertexImpl{id=41, name=state41}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(35), "Event fired: User");
			testSuiteHelper.runInCrawlingPlugins(41);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 41");

			testSuiteHelper.addStateToReportBuilder(41);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(41)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(41)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(41)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/HEADER[1]/DIV[1]/DIV[2]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={class=tm-icon-menu, data-uk-offcanvas=, evlist=false, href=#offcanvas}}, source=HybridStateVertexImpl{id=41, name=state41}, target=HybridStateVertexImpl{id=42, name=state42}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[2]/DIV[1]/COMPONENT[1]/FORM[1]/DIV[1]/DIV[1]/P[1]/LABEL[1]/INPUT[1]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[2]/DIV[1]/COMPONENT[1]/FORM[1]/DIV[1]/DIV[1]/P[2]/LABEL[1]/INPUT[1]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[2]/DIV[1]/COMPONENT[1]/FORM[1]/DIV[2]/DIV[1]/P[1]/LABEL[1]/INPUT[1]"), "0"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[2]/DIV[1]/COMPONENT[1]/FORM[1]/DIV[2]/DIV[1]/P[2]/LABEL[1]/INPUT[1]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[2]/DIV[1]/COMPONENT[1]/FORM[1]/DIV[3]/DIV[1]/P[1]/LABEL[1]/INPUT[1]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[2]/DIV[1]/COMPONENT[1]/FORM[1]/DIV[3]/DIV[1]/P[2]/LABEL[1]/INPUT[1]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[2]/DIV[1]/COMPONENT[1]/FORM[1]/DIV[4]/DIV[1]/SELECT[1]"), "18"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(39), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(42);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 42");

			testSuiteHelper.addStateToReportBuilder(42);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(42)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(42)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(42)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/HEADER[1]/DIV[1]/DIV[2]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={class=tm-icon-menu, data-uk-offcanvas=, evlist=false, href=#offcanvas}}, source=HybridStateVertexImpl{id=42, name=state42}, target=HybridStateVertexImpl{id=43, name=state43}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[2]/DIV[1]/COMPONENT[1]/FORM[1]/DIV[1]/DIV[1]/P[1]/LABEL[1]/INPUT[1]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[2]/DIV[1]/COMPONENT[1]/FORM[1]/DIV[1]/DIV[1]/P[2]/LABEL[1]/INPUT[1]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[2]/DIV[1]/COMPONENT[1]/FORM[1]/DIV[2]/DIV[1]/P[1]/LABEL[1]/INPUT[1]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[2]/DIV[1]/COMPONENT[1]/FORM[1]/DIV[2]/DIV[1]/P[2]/LABEL[1]/INPUT[1]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[2]/DIV[1]/COMPONENT[1]/FORM[1]/DIV[3]/DIV[1]/P[1]/LABEL[1]/INPUT[1]"), "0"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[2]/DIV[1]/COMPONENT[1]/FORM[1]/DIV[3]/DIV[1]/P[2]/LABEL[1]/INPUT[1]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[2]/DIV[1]/COMPONENT[1]/FORM[1]/DIV[4]/DIV[1]/SELECT[1]"), "12"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(40), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(43);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 43");

			testSuiteHelper.addStateToReportBuilder(43);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(43)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(43)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(43)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[2]/DIV[1]/COMPONENT[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={anyaccess=none, evlist=false, href=/pagekit/index.php/admin/user/edit?id=1, title=admin}}, source=HybridStateVertexImpl{id=43, name=state43}, target=HybridStateVertexImpl{id=8, name=state8}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(41), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(8);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 8");

			testSuiteHelper.addStateToReportBuilder(8);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(8)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(8)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(8)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/HEADER[1]/DIV[1]/NAV[1]/UL[1]/LI[3]/A[1], element=Element{node=[A: null], tag=A, text=Roles, attributes={anyaccess=none, evlist=false, href=/pagekit/index.php/admin/user/roles}}, source=HybridStateVertexImpl{id=8, name=state8}, target=HybridStateVertexImpl{id=45, name=state45}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"), "example"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"), "example123"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/DIV[1]/INPUT[1]"), "example@example.com"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[5]/DIV[1]/P[1]/LABEL[1]/INPUT[1]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[5]/DIV[1]/P[2]/LABEL[1]/INPUT[1]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[6]/DIV[1]/P[1]/LABEL[1]/INPUT[1]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[6]/DIV[1]/P[2]/LABEL[1]/INPUT[1]"), "1"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(42), "Event fired: Roles");
			testSuiteHelper.runInCrawlingPlugins(45);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 45");

			testSuiteHelper.addStateToReportBuilder(45);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(45)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(45)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(45)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/HEADER[1]/DIV[1]/DIV[2]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={anyaccess=none, class=tm-icon-menu, data-uk-offcanvas=, evlist=false, href=#offcanvas}}, source=HybridStateVertexImpl{id=45, name=state45}, target=HybridStateVertexImpl{id=46, name=state46}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[3]/INPUT[1]"), "0"));
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/TABLE[1]/TBODY[1]/TR[2]/TD[3]/INPUT[1]"), "0"));
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[2]/DIV[2]/TABLE[1]/TBODY[1]/TR[1]/TD[3]/INPUT[1]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[2]/DIV[3]/TABLE[1]/TBODY[1]/TR[1]/TD[3]/INPUT[1]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[2]/DIV[3]/TABLE[1]/TBODY[1]/TR[2]/TD[3]/INPUT[1]"), "0"));
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[2]/DIV[4]/TABLE[1]/TBODY[1]/TR[1]/TD[3]/INPUT[1]"), "0"));
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[2]/DIV[5]/TABLE[1]/TBODY[1]/TR[1]/TD[3]/INPUT[1]"), "0"));
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[2]/DIV[5]/TABLE[1]/TBODY[1]/TR[2]/TD[3]/INPUT[1]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[2]/DIV[6]/TABLE[1]/TBODY[1]/TR[1]/TD[3]/INPUT[1]"), "0"));
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[2]/DIV[6]/TABLE[1]/TBODY[1]/TR[2]/TD[3]/INPUT[1]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[2]/DIV[6]/TABLE[1]/TBODY[1]/TR[3]/TD[3]/INPUT[1]"), "0"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(43), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(46);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 46");

			testSuiteHelper.addStateToReportBuilder(46);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(46)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(46)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(46)
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
	public void method_BT7_path_1000004_45_46_53_55_57(){
		testSuiteHelper.newCurrentTestMethod("method_BT7_path_1000004_45_46_53_55_57", 10);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(43);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(43)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(43)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(43)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/HEADER[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Site, attributes={class=uk-panel tm-panel-icon, evlist=false, href=/pagekit/index.php/admin/site/page}}, source=HybridStateVertexImpl{id=43, name=state43}, target=HybridStateVertexImpl{id=7, name=state7}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1000004), "Event fired: Site");
			testSuiteHelper.runInCrawlingPlugins(7);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 7");

			testSuiteHelper.addStateToReportBuilder(7);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(7)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(7)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(7)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/HEADER[1]/DIV[1]/NAV[1]/UL[1]/LI[4]/A[1], element=Element{node=[A: null], tag=A, text=Settings, attributes={evlist=false, href=/pagekit/index.php/admin/site/settings}}, source=HybridStateVertexImpl{id=7, name=state7}, target=HybridStateVertexImpl{id=51, name=state51}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"), "0"));
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[2]/DIV[2]/UL[1]/LI[1]/DIV[1]/DIV[2]/INPUT[1]"), "0"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(45), "Event fired: Settings");
			testSuiteHelper.runInCrawlingPlugins(51);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 51");

			testSuiteHelper.addStateToReportBuilder(51);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(51)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(51)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(51)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/FORM[1]/DIV[1]/DIV[2]/UL[1]/LI[1]/DIV[2]/DIV[3]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=Select Image, attributes={anyaccess=none, class=uk-placeholder uk-text-center uk-display-block uk-margin-remove, evlist=false}}, source=HybridStateVertexImpl{id=51, name=state51}, target=HybridStateVertexImpl{id=52, name=state52}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/FORM[1]/DIV[1]/DIV[2]/UL[1]/LI[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"), "JFwPbjbL"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(46), "Event fired: Select Image");
			testSuiteHelper.runInCrawlingPlugins(52);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 52");

			testSuiteHelper.addStateToReportBuilder(52);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(52)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(52)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(52)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[5]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={class=pk-icon-table pk-icon-hover, data-uk-tooltip={delay: 500}, evlist=false, title=Table View}}, source=HybridStateVertexImpl{id=52, name=state52}, target=HybridStateVertexImpl{id=53, name=state53}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/FORM[1]/DIV[1]/DIV[2]/UL[1]/LI[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"), "zLvFeEzq"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[5]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"), "PokzaWMe"));
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[5]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/TABLE[1]/THEAD[1]/TR[1]/TH[1]/INPUT[1]"), "1"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(53), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(53);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 53");

			testSuiteHelper.addStateToReportBuilder(53);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(53)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(53)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(53)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[5]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[2]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Add Folder, attributes={anyaccess=none, class=uk-button uk-margin-small-right, evlist=false}}, source=HybridStateVertexImpl{id=53, name=state53}, target=HybridStateVertexImpl{id=55, name=state55}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/FORM[1]/DIV[1]/DIV[2]/UL[1]/LI[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"), "UJexKlyR"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[5]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"), "gLbuJDFV"));
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[5]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/TABLE[1]/THEAD[1]/TR[1]/TH[1]/INPUT[1]"), "1"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(55), "Event fired: Add Folder");
			testSuiteHelper.runInCrawlingPlugins(55);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 55");

			testSuiteHelper.addStateToReportBuilder(55);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(55)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(55)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(55)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[10]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Cancel, attributes={class=uk-button uk-button-link uk-modal-close, evlist=false}}, source=HybridStateVertexImpl{id=55, name=state55}, target=HybridStateVertexImpl{id=56, name=state56}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/FORM[1]/DIV[1]/DIV[2]/UL[1]/LI[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"), "CMbaKIgp"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[5]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"), "LbhsNeos"));
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[5]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/TABLE[1]/THEAD[1]/TR[1]/TH[1]/INPUT[1]"), "0"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[10]/DIV[1]/DIV[1]/DIV[2]/P[1]/INPUT[1]"), "ezyxIOhs"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(57), "Event fired: Cancel");
			testSuiteHelper.runInCrawlingPlugins(56);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 56");

			testSuiteHelper.addStateToReportBuilder(56);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(56)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(56)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(56)
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
	public void method_BT7_path_1000004_59_62_65(){
		testSuiteHelper.newCurrentTestMethod("method_BT7_path_1000004_59_62_65", 11);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(43);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(43)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(43)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(43)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/HEADER[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Site, attributes={class=uk-panel tm-panel-icon, evlist=false, href=/pagekit/index.php/admin/site/page}}, source=HybridStateVertexImpl{id=43, name=state43}, target=HybridStateVertexImpl{id=7, name=state7}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1000004), "Event fired: Site");
			testSuiteHelper.runInCrawlingPlugins(7);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 7");

			testSuiteHelper.addStateToReportBuilder(7);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(7)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(7)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(7)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/UL[1]/LI[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={class=pk-icon-edit pk-icon-hover, data-uk-tooltip={delay: 500}, evlist=false, title=Edit}}, source=HybridStateVertexImpl{id=7, name=state7}, target=HybridStateVertexImpl{id=60, name=state60}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"), "0"));
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[2]/DIV[2]/UL[1]/LI[1]/DIV[1]/DIV[2]/INPUT[1]"), "0"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(59), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(60);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 60");

			testSuiteHelper.addStateToReportBuilder(60);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(60)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(60)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(60)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[2]/DIV[2]/UL[1]/LI[1]/DIV[1]/DIV[3]/A[1], element=Element{node=[A: null], tag=A, text=Home, attributes={anyaccess=none, evlist=false, href=/pagekit/index.php/admin/site/page/edit?id=1}}, source=HybridStateVertexImpl{id=60, name=state60}, target=HybridStateVertexImpl{id=61, name=state61}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"), "0"));
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[2]/DIV[2]/UL[1]/LI[1]/DIV[1]/DIV[2]/INPUT[1]"), "0"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[4]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"), "example123"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(62), "Event fired: Home");
			testSuiteHelper.runInCrawlingPlugins(61);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 61");

			testSuiteHelper.addStateToReportBuilder(61);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(61)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(61)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(61)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/FORM[1]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Meta, attributes={anyaccess=none, evlist=false}}, source=HybridStateVertexImpl{id=61, name=state61}, target=HybridStateVertexImpl{id=64, name=state64}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"), "oEUaczjo"));
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/P[1]/LABEL[1]/INPUT[1]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"), "omqDHPGv"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"), "HZuBNeMB"));
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[4]/DIV[1]/P[1]/LABEL[1]/INPUT[1]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[4]/DIV[1]/P[2]/LABEL[1]/INPUT[1]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[4]/DIV[1]/P[3]/LABEL[1]/INPUT[1]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[5]/DIV[1]/LABEL[1]/INPUT[1]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/TEXTAREA[1]"), "GiXNdLYV"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[3]/DIV[1]/SELECT[1]"), "Disabled"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(65), "Event fired: Meta");
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

	@Test(priority=12)
	public void method_BT7_path_1000004_67_69(){
		testSuiteHelper.newCurrentTestMethod("method_BT7_path_1000004_67_69", 12);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(43);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(43)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(43)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(43)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/HEADER[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Site, attributes={class=uk-panel tm-panel-icon, evlist=false, href=/pagekit/index.php/admin/site/page}}, source=HybridStateVertexImpl{id=43, name=state43}, target=HybridStateVertexImpl{id=7, name=state7}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1000004), "Event fired: Site");
			testSuiteHelper.runInCrawlingPlugins(7);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 7");

			testSuiteHelper.addStateToReportBuilder(7);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(7)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(7)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(7)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/UL[1]/LI[1]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={class=pk-icon-delete pk-icon-hover, data-uk-tooltip={delay: 500}, evlist=false, title=Delete}}, source=HybridStateVertexImpl{id=7, name=state7}, target=HybridStateVertexImpl{id=67, name=state67}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"), "0"));
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[2]/DIV[2]/UL[1]/LI[1]/DIV[1]/DIV[2]/INPUT[1]"), "0"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(67), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(67);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 67");

			testSuiteHelper.addStateToReportBuilder(67);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(67)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(67)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(67)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[6]/DIV[1]/DIV[1]/DIV[2]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Cancel, attributes={class=uk-button uk-button-link uk-modal-close, evlist=false}}, source=HybridStateVertexImpl{id=67, name=state67}, target=HybridStateVertexImpl{id=68, name=state68}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"), "1"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(69), "Event fired: Cancel");
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
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=13)
	public void method_BT25_path_1000004_1000008_21_22_71_74_75_76(){
		testSuiteHelper.newCurrentTestMethod("method_BT25_path_1000004_1000008_21_22_71_74_75_76", 13);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(43);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(43)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(43)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(43)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/HEADER[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Site, attributes={class=uk-panel tm-panel-icon, evlist=false, href=/pagekit/index.php/admin/site/page}}, source=HybridStateVertexImpl{id=43, name=state43}, target=HybridStateVertexImpl{id=7, name=state7}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1000004), "Event fired: Site");
			testSuiteHelper.runInCrawlingPlugins(7);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 7");

			testSuiteHelper.addStateToReportBuilder(7);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(7)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(7)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(7)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/HEADER[1]/DIV[1]/NAV[1]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Widgets, attributes={evlist=false, href=/pagekit/index.php/admin/site/widget}}, source=HybridStateVertexImpl{id=7, name=state7}, target=HybridStateVertexImpl{id=21, name=state21}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"), "0"));
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[2]/DIV[2]/UL[1]/LI[1]/DIV[1]/DIV[2]/INPUT[1]"), "0"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(1000008), "Event fired: Widgets");
			testSuiteHelper.runInCrawlingPlugins(21);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 21");

			testSuiteHelper.addStateToReportBuilder(21);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(21)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(21)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(21)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Text, attributes={anyaccess=none, evlist=false, href=/pagekit/index.php/admin/site/widget/edit?type=system%2Ftext&position=_unassigned}}, source=HybridStateVertexImpl{id=21, name=state21}, target=HybridStateVertexImpl{id=24, name=state24}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"), "qHqdNUSE"));
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"), "1"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(21), "Event fired: Text");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/HEADER[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[4]/A[1], element=Element{node=[A: null], tag=A, text=System, attributes={anyaccess=none, class=uk-panel tm-panel-icon, evlist=false, href=/pagekit/index.php/admin/system/settings}}, source=HybridStateVertexImpl{id=24, name=state24}, target=HybridStateVertexImpl{id=25, name=state25}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"), "uDwBkMpq"));
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/P[1]/LABEL[1]/INPUT[1]"), "0"));
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[3]/DIV[1]/P[1]/LABEL[1]/INPUT[1]"), "0"));
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[3]/DIV[1]/P[2]/LABEL[1]/INPUT[1]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[3]/DIV[1]/P[3]/LABEL[1]/INPUT[1]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/TEXTAREA[1]"), "PLyEjgGA"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/SELECT[1]"), "Disabled"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"), "- Assign -"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(22), "Event fired: System");
			testSuiteHelper.runInCrawlingPlugins(25);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 25");

			testSuiteHelper.addStateToReportBuilder(25);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(25)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(25)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(25)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Localisation, attributes={evlist=false}}, source=HybridStateVertexImpl{id=25, name=state25}, target=HybridStateVertexImpl{id=75, name=state75}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/FORM[1]/DIV[1]/DIV[2]/UL[1]/LI[1]/DIV[2]/DIV[1]/INPUT[1]"), "cJCyhjlR"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/FORM[1]/DIV[1]/DIV[2]/UL[1]/LI[1]/DIV[3]/DIV[1]/INPUT[1]"), "JthFAGZd"));
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/FORM[1]/DIV[1]/DIV[2]/UL[1]/LI[1]/DIV[4]/DIV[1]/P[1]/LABEL[1]/INPUT[1]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/FORM[1]/DIV[1]/DIV[2]/UL[1]/LI[1]/DIV[4]/DIV[1]/P[2]/LABEL[1]/INPUT[1]"), "1"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(71), "Event fired: Localisation");
			testSuiteHelper.runInCrawlingPlugins(75);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 75");

			testSuiteHelper.addStateToReportBuilder(75);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(75)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(75)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(75)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/FORM[1]/DIV[1]/DIV[2]/UL[1]/LI[2]/DIV[1]/DIV[2]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save, attributes={class=uk-button uk-button-primary, evlist=false, type=submit}}, source=HybridStateVertexImpl{id=75, name=state75}, target=HybridStateVertexImpl{id=76, name=state76}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/FORM[1]/DIV[1]/DIV[2]/UL[1]/LI[2]/DIV[2]/DIV[1]/SELECT[1]"), "English - United Kingdom"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/FORM[1]/DIV[1]/DIV[2]/UL[1]/LI[2]/DIV[3]/DIV[1]/SELECT[1]"), "Tamil"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(74), "Event fired: Save");
			testSuiteHelper.runInCrawlingPlugins(76);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 76");

			testSuiteHelper.addStateToReportBuilder(76);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(76)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(76)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(76)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/UL[1]/LI[3]/A[1], element=Element{node=[A: null], tag=A, text=Cache, attributes={anyaccess=action, evlist=false}}, source=HybridStateVertexImpl{id=76, name=state76}, target=HybridStateVertexImpl{id=77, name=state77}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/FORM[1]/DIV[1]/DIV[2]/UL[1]/LI[2]/DIV[2]/DIV[1]/SELECT[1]"), "Kurdish"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/FORM[1]/DIV[1]/DIV[2]/UL[1]/LI[2]/DIV[3]/DIV[1]/SELECT[1]"), "Hebrew - Israel"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(75), "Event fired: Cache");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/FORM[1]/DIV[1]/DIV[2]/UL[1]/LI[3]/DIV[1]/DIV[2]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save, attributes={class=uk-button uk-button-primary, evlist=false, type=submit}}, source=HybridStateVertexImpl{id=77, name=state77}, target=HybridStateVertexImpl{id=78, name=state78}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/FORM[1]/DIV[1]/DIV[2]/UL[1]/LI[3]/DIV[2]/DIV[1]/P[1]/LABEL[1]/INPUT[1]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/FORM[1]/DIV[1]/DIV[2]/UL[1]/LI[3]/DIV[2]/DIV[1]/P[2]/LABEL[1]/INPUT[1]"), "0"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/FORM[1]/DIV[1]/DIV[2]/UL[1]/LI[3]/DIV[2]/DIV[1]/P[3]/LABEL[1]/INPUT[1]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/FORM[1]/DIV[1]/DIV[2]/UL[1]/LI[3]/DIV[2]/DIV[1]/P[4]/LABEL[1]/INPUT[1]"), "0"));
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/FORM[1]/DIV[1]/DIV[2]/UL[1]/LI[3]/DIV[3]/DIV[1]/P[1]/LABEL[1]/INPUT[1]"), "1"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(76), "Event fired: Save");
			testSuiteHelper.runInCrawlingPlugins(78);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 78");

			testSuiteHelper.addStateToReportBuilder(78);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(78)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(78)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(78)
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
	public void method_BT7_path_1000004_77_79(){
		testSuiteHelper.newCurrentTestMethod("method_BT7_path_1000004_77_79", 14);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(43);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(43)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(43)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(43)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/HEADER[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Site, attributes={class=uk-panel tm-panel-icon, evlist=false, href=/pagekit/index.php/admin/site/page}}, source=HybridStateVertexImpl{id=43, name=state43}, target=HybridStateVertexImpl{id=7, name=state7}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1000004), "Event fired: Site");
			testSuiteHelper.runInCrawlingPlugins(7);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 7");

			testSuiteHelper.addStateToReportBuilder(7);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(7)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(7)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(7)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/UL[1]/LI[3]/A[1], element=Element{node=[A: null], tag=A, text=Not Linked, attributes={evlist=false}}, source=HybridStateVertexImpl{id=7, name=state7}, target=HybridStateVertexImpl{id=81, name=state81}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"), "0"));
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[2]/DIV[2]/UL[1]/LI[1]/DIV[1]/DIV[2]/INPUT[1]"), "1"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(77), "Event fired: Not Linked");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/HEADER[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[3]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={anyaccess=none, class=tm-icon-logout, evlist=false, href=/pagekit/index.php/user/logout?redirect=admin/login, title=התנתק}}, source=HybridStateVertexImpl{id=81, name=state81}, target=HybridStateVertexImpl{id=0, name=index}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"), "0"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(79), "Event fired: ");
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

	@Test(priority=15)
	public void method_BT5_failed_path_1000012(){
		testSuiteHelper.newCurrentTestMethod("method_BT5_failed_path_1000012", 15);
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
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/P[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Login, attributes={class=uk-button uk-button-primary uk-button-large uk-width-1-1, evlist=false}}, source=HybridStateVertexImpl{id=0, name=index}, target=HybridStateVertexImpl{id=43, name=state43}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/INPUT[1]"), "admin"));
			formInputs.add(new FormInput(FormInput.InputType.PASSWORD, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[2]/INPUT[1]"), "asdfghjkl123"));
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[1]/FORM[1]/UL[1]/LI[1]/LABEL[1]/INPUT[1]"), "0"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(1000012), "Event fired: Login");
			testSuiteHelper.runInCrawlingPlugins(43);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 43");

			testSuiteHelper.addStateToReportBuilder(43);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(43)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(43)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(43)
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
	public void method_BT7_path_1000004_81_87(){
		testSuiteHelper.newCurrentTestMethod("method_BT7_path_1000004_81_87", 16);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(43);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(43)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(43)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(43)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/HEADER[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Site, attributes={class=uk-panel tm-panel-icon, evlist=false, href=/pagekit/index.php/admin/site/page}}, source=HybridStateVertexImpl{id=43, name=state43}, target=HybridStateVertexImpl{id=7, name=state7}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1000004), "Event fired: Site");
			testSuiteHelper.runInCrawlingPlugins(7);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 7");

			testSuiteHelper.addStateToReportBuilder(7);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(7)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(7)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(7)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/P[1]/A[1], element=Element{node=[A: null], tag=A, text=Add Menu, attributes={class=uk-button, evlist=false}}, source=HybridStateVertexImpl{id=7, name=state7}, target=HybridStateVertexImpl{id=90, name=state90}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[2]/DIV[2]/UL[1]/LI[1]/DIV[1]/DIV[2]/INPUT[1]"), "1"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(81), "Event fired: Add Menu");
			testSuiteHelper.runInCrawlingPlugins(90);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 90");

			testSuiteHelper.addStateToReportBuilder(90);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(90)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(90)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(90)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[4]/DIV[1]/DIV[1]/FORM[1]/DIV[4]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=ביטול, attributes={anyaccess=none, class=uk-button uk-button-link uk-modal-close, evlist=false, type=button}}, source=HybridStateVertexImpl{id=90, name=state90}, target=HybridStateVertexImpl{id=91, name=state91}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[2]/DIV[2]/UL[1]/LI[1]/DIV[1]/DIV[2]/INPUT[1]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[4]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"), "example123"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(87), "Event fired: ביטול");
			testSuiteHelper.runInCrawlingPlugins(91);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 91");

			testSuiteHelper.addStateToReportBuilder(91);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(91)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(91)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(91)
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
	public void method_BT25_failed_path_1000004_1000015_1000016_1000017(){
		testSuiteHelper.newCurrentTestMethod("method_BT25_failed_path_1000004_1000015_1000016_1000017", 17);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(43);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(43)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(43)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(43)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/HEADER[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Site, attributes={class=uk-panel tm-panel-icon, evlist=false, href=/pagekit/index.php/admin/site/page}}, source=HybridStateVertexImpl{id=43, name=state43}, target=HybridStateVertexImpl{id=7, name=state7}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1000004), "Event fired: Site");
			testSuiteHelper.runInCrawlingPlugins(7);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 7");

			testSuiteHelper.addStateToReportBuilder(7);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(7)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(7)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(7)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/HEADER[1]/DIV[1]/NAV[1]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Widgets, attributes={evlist=false, href=/pagekit/index.php/admin/site/widget}}, source=HybridStateVertexImpl{id=7, name=state7}, target=HybridStateVertexImpl{id=19, name=state19}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"), "0"));
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[2]/DIV[2]/UL[1]/LI[1]/DIV[1]/DIV[2]/INPUT[1]"), "0"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(1000015), "Event fired: Widgets");
			testSuiteHelper.runInCrawlingPlugins(19);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 19");

			testSuiteHelper.addStateToReportBuilder(19);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(19)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(19)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(19)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Text, attributes={evlist=false, href=/pagekit/index.php/admin/site/widget/edit?type=system%2Ftext&position=}}, source=HybridStateVertexImpl{id=19, name=state19}, target=HybridStateVertexImpl{id=24, name=state24}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"), "IMZZLWge"));
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"), "0"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(1000016), "Event fired: Text");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/HEADER[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[4]/A[1], element=Element{node=[A: null], tag=A, text=System, attributes={anyaccess=none, class=uk-panel tm-panel-icon, evlist=false, href=/pagekit/index.php/admin/system/settings}}, source=HybridStateVertexImpl{id=24, name=state24}, target=HybridStateVertexImpl{id=96, name=state96}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"), "uDwBkMpq"));
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/P[1]/LABEL[1]/INPUT[1]"), "0"));
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[3]/DIV[1]/P[1]/LABEL[1]/INPUT[1]"), "0"));
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[3]/DIV[1]/P[2]/LABEL[1]/INPUT[1]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[3]/DIV[1]/P[3]/LABEL[1]/INPUT[1]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/TEXTAREA[1]"), "PLyEjgGA"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/SELECT[1]"), "Disabled"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"), "- Assign -"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(1000017), "Event fired: System");
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
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=18)
	public void method_BT7_path_1000004_88_89(){
		testSuiteHelper.newCurrentTestMethod("method_BT7_path_1000004_88_89", 18);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(43);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(43)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(43)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(43)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/HEADER[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Site, attributes={class=uk-panel tm-panel-icon, evlist=false, href=/pagekit/index.php/admin/site/page}}, source=HybridStateVertexImpl{id=43, name=state43}, target=HybridStateVertexImpl{id=7, name=state7}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1000004), "Event fired: Site");
			testSuiteHelper.runInCrawlingPlugins(7);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 7");

			testSuiteHelper.addStateToReportBuilder(7);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(7)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(7)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(7)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[2]/DIV[2]/UL[1]/LI[1]/DIV[1]/DIV[5]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={class=pk-icon-circle-success, evlist=false}}, source=HybridStateVertexImpl{id=7, name=state7}, target=HybridStateVertexImpl{id=100, name=state100}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[2]/DIV[2]/UL[1]/LI[1]/DIV[1]/DIV[2]/INPUT[1]"), "1"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(88), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(100);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 100");

			testSuiteHelper.addStateToReportBuilder(100);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(100)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(100)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(100)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[2]/DIV[2]/UL[1]/LI[1]/DIV[1]/DIV[5]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={class=pk-icon-circle-danger, evlist=false}}, source=HybridStateVertexImpl{id=100, name=state100}, target=HybridStateVertexImpl{id=101, name=state101}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[2]/DIV[2]/UL[1]/LI[1]/DIV[1]/DIV[2]/INPUT[1]"), "1"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(89), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(101);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 101");

			testSuiteHelper.addStateToReportBuilder(101);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(101)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(101)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(101)
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
	public void method_BT7_path_1000004_90(){
		testSuiteHelper.newCurrentTestMethod("method_BT7_path_1000004_90", 19);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(43);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(43)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(43)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(43)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/HEADER[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Site, attributes={class=uk-panel tm-panel-icon, evlist=false, href=/pagekit/index.php/admin/site/page}}, source=HybridStateVertexImpl{id=43, name=state43}, target=HybridStateVertexImpl{id=7, name=state7}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1000004), "Event fired: Site");
			testSuiteHelper.runInCrawlingPlugins(7);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 7");

			testSuiteHelper.addStateToReportBuilder(7);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(7)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(7)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(7)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={class=pk-icon-check pk-icon-hover, data-uk-tooltip={delay: 500}, evlist=false, title=Publish}}, source=HybridStateVertexImpl{id=7, name=state7}, target=HybridStateVertexImpl{id=104, name=state104}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"), "0"));
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[2]/DIV[2]/UL[1]/LI[1]/DIV[1]/DIV[2]/INPUT[1]"), "1"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(90), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(104);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 104");

			testSuiteHelper.addStateToReportBuilder(104);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(104)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(104)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(104)
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
	public void method_BT7_path_1000004_97_99_100_101_102_104(){
		testSuiteHelper.newCurrentTestMethod("method_BT7_path_1000004_97_99_100_101_102_104", 20);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(43);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(43)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(43)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(43)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/HEADER[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Site, attributes={class=uk-panel tm-panel-icon, evlist=false, href=/pagekit/index.php/admin/site/page}}, source=HybridStateVertexImpl{id=43, name=state43}, target=HybridStateVertexImpl{id=7, name=state7}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1000004), "Event fired: Site");
			testSuiteHelper.runInCrawlingPlugins(7);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 7");

			testSuiteHelper.addStateToReportBuilder(7);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(7)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(7)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(7)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/UL[1]/LI[4]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={class=pk-icon-delete pk-icon-hover, data-uk-tooltip={delay: 500}, evlist=false, title=Delete}}, source=HybridStateVertexImpl{id=7, name=state7}, target=HybridStateVertexImpl{id=108, name=state108}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[2]/DIV[2]/UL[1]/LI[1]/DIV[1]/DIV[2]/INPUT[1]"), "1"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(97), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(108);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 108");

			testSuiteHelper.addStateToReportBuilder(108);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(108)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(108)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(108)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[6]/DIV[1]/DIV[1]/DIV[2]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=אישור, attributes={anyaccess=none, class=uk-button uk-button-link js-modal-confirm, evlist=false}}, source=HybridStateVertexImpl{id=108, name=state108}, target=HybridStateVertexImpl{id=109, name=state109}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[2]/DIV[2]/UL[1]/LI[1]/DIV[1]/DIV[2]/INPUT[1]"), "1"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(99), "Event fired: אישור");
			testSuiteHelper.runInCrawlingPlugins(109);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 109");

			testSuiteHelper.addStateToReportBuilder(109);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(109)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(109)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(109)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/UL[1]/LI[3]/A[1], element=Element{node=[A: null], tag=A, text=Not Linked, attributes={evlist=false}}, source=HybridStateVertexImpl{id=109, name=state109}, target=HybridStateVertexImpl{id=110, name=state110}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"), "1"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(100), "Event fired: Not Linked");
			testSuiteHelper.runInCrawlingPlugins(110);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 110");

			testSuiteHelper.addStateToReportBuilder(110);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(110)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(110)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(110)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/UL[1]/LI[4]/A[1], element=Element{node=[A: null], tag=A, text=Trash, attributes={anyaccess=none, evlist=false}}, source=HybridStateVertexImpl{id=110, name=state110}, target=HybridStateVertexImpl{id=111, name=state111}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"), "1"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(101), "Event fired: Trash");
			testSuiteHelper.runInCrawlingPlugins(111);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 111");

			testSuiteHelper.addStateToReportBuilder(111);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(111)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(111)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(111)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[2]/DIV[2]/UL[1]/LI[1]/DIV[1]/DIV[3]/A[1], element=Element{node=[A: null], tag=A, text=Home, attributes={anyaccess=none, evlist=false, href=/pagekit/index.php/admin/site/page/edit?id=1}}, source=HybridStateVertexImpl{id=111, name=state111}, target=HybridStateVertexImpl{id=61, name=state61}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"), "0"));
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[2]/DIV[2]/UL[1]/LI[1]/DIV[1]/DIV[2]/INPUT[1]"), "1"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(102), "Event fired: Home");
			testSuiteHelper.runInCrawlingPlugins(61);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 61");

			testSuiteHelper.addStateToReportBuilder(61);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(61)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(61)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(61)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/FORM[1]/DIV[1]/DIV[2]/A[1], element=Element{node=[A: null], tag=A, text=Close, attributes={class=uk-button uk-margin-small-right, evlist=false, href=/pagekit/index.php/admin/site/page}}, source=HybridStateVertexImpl{id=61, name=state61}, target=HybridStateVertexImpl{id=113, name=state113}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"), "XjesArKo"));
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/P[1]/LABEL[1]/INPUT[1]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"), "lpctcsHz"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"), "pNfDwCvu"));
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[4]/DIV[1]/P[1]/LABEL[1]/INPUT[1]"), "0"));
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[4]/DIV[1]/P[2]/LABEL[1]/INPUT[1]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[4]/DIV[1]/P[3]/LABEL[1]/INPUT[1]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[5]/DIV[1]/LABEL[1]/INPUT[1]"), "0"));
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/TEXTAREA[1]"), "hUyxhmTp"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[3]/DIV[1]/SELECT[1]"), "מאופשר"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(104), "Event fired: Close");
			testSuiteHelper.runInCrawlingPlugins(113);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 113");

			testSuiteHelper.addStateToReportBuilder(113);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(113)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(113)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(113)
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
	public void method_BT42_failed_path_1000021_1000022_1000023(){
		testSuiteHelper.newCurrentTestMethod("method_BT42_failed_path_1000021_1000022_1000023", 21);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(43);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(43)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(43)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(43)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=Add Widget, attributes={class=uk-button uk-button-primary, evlist=false}}, source=HybridStateVertexImpl{id=43, name=state43}, target=HybridStateVertexImpl{id=115, name=state115}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1000021), "Event fired: Add Widget");
			testSuiteHelper.runInCrawlingPlugins(115);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 115");

			testSuiteHelper.addStateToReportBuilder(115);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(115)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(115)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(115)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=User, attributes={class=uk-dropdown-close, evlist=false}}, source=HybridStateVertexImpl{id=115, name=state115}, target=HybridStateVertexImpl{id=116, name=state116}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1000022), "Event fired: User");
			testSuiteHelper.runInCrawlingPlugins(116);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 116");

			testSuiteHelper.addStateToReportBuilder(116);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(116)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(116)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(116)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/HEADER[1]/DIV[1]/DIV[2]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={class=tm-icon-menu, data-uk-offcanvas=, evlist=false, href=#offcanvas}}, source=HybridStateVertexImpl{id=116, name=state116}, target=HybridStateVertexImpl{id=117, name=state117}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[2]/DIV[2]/UL[1]/LI[2]/DIV[1]/COMPONENT[1]/FORM[1]/DIV[1]/DIV[1]/P[1]/LABEL[1]/INPUT[1]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[2]/DIV[2]/UL[1]/LI[2]/DIV[1]/COMPONENT[1]/FORM[1]/DIV[1]/DIV[1]/P[2]/LABEL[1]/INPUT[1]"), "0"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[2]/DIV[2]/UL[1]/LI[2]/DIV[1]/COMPONENT[1]/FORM[1]/DIV[2]/DIV[1]/P[1]/LABEL[1]/INPUT[1]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[2]/DIV[2]/UL[1]/LI[2]/DIV[1]/COMPONENT[1]/FORM[1]/DIV[2]/DIV[1]/P[2]/LABEL[1]/INPUT[1]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[2]/DIV[2]/UL[1]/LI[2]/DIV[1]/COMPONENT[1]/FORM[1]/DIV[3]/DIV[1]/P[1]/LABEL[1]/INPUT[1]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[2]/DIV[2]/UL[1]/LI[2]/DIV[1]/COMPONENT[1]/FORM[1]/DIV[3]/DIV[1]/P[2]/LABEL[1]/INPUT[1]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[2]/DIV[2]/UL[1]/LI[2]/DIV[1]/COMPONENT[1]/FORM[1]/DIV[4]/DIV[1]/SELECT[1]"), "24"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(1000023), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(117);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 117");

			testSuiteHelper.addStateToReportBuilder(117);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(117)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(117)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(117)
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
	public void method_BT117_failed_path_1000025_1000026(){
		testSuiteHelper.newCurrentTestMethod("method_BT117_failed_path_1000025_1000026", 22);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(118);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(118)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(118)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(118)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=Add Widget, attributes={class=uk-button uk-button-primary, evlist=false}}, source=HybridStateVertexImpl{id=118, name=state118}, target=HybridStateVertexImpl{id=122, name=state122}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1000025), "Event fired: Add Widget");
			testSuiteHelper.runInCrawlingPlugins(122);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 122");

			testSuiteHelper.addStateToReportBuilder(122);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(122)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(122)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(122)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=User, attributes={class=uk-dropdown-close, evlist=false}}, source=HybridStateVertexImpl{id=122, name=state122}, target=HybridStateVertexImpl{id=123, name=state123}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1000026), "Event fired: User");
			testSuiteHelper.runInCrawlingPlugins(123);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 123");

			testSuiteHelper.addStateToReportBuilder(123);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(123)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(123)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(123)
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
	public void method_BT117_failed_path_1000028_1000029_1000030(){
		testSuiteHelper.newCurrentTestMethod("method_BT117_failed_path_1000028_1000029_1000030", 23);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(125);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(125)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(125)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(125)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=Add Widget, attributes={class=uk-button uk-button-primary, evlist=false}}, source=HybridStateVertexImpl{id=125, name=state125}, target=HybridStateVertexImpl{id=126, name=state126}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1000028), "Event fired: Add Widget");
			testSuiteHelper.runInCrawlingPlugins(126);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 126");

			testSuiteHelper.addStateToReportBuilder(126);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(126)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(126)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(126)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=User, attributes={class=uk-dropdown-close, evlist=false}}, source=HybridStateVertexImpl{id=126, name=state126}, target=HybridStateVertexImpl{id=127, name=state127}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1000029), "Event fired: User");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/HEADER[1]/DIV[1]/DIV[2]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={class=tm-icon-menu, data-uk-offcanvas=, evlist=false, href=#offcanvas}}, source=HybridStateVertexImpl{id=127, name=state127}, target=HybridStateVertexImpl{id=128, name=state128}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[3]/DIV[1]/COMPONENT[1]/FORM[1]/DIV[1]/DIV[1]/P[1]/LABEL[1]/INPUT[1]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[3]/DIV[1]/COMPONENT[1]/FORM[1]/DIV[1]/DIV[1]/P[2]/LABEL[1]/INPUT[1]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[3]/DIV[1]/COMPONENT[1]/FORM[1]/DIV[2]/DIV[1]/P[1]/LABEL[1]/INPUT[1]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[3]/DIV[1]/COMPONENT[1]/FORM[1]/DIV[2]/DIV[1]/P[2]/LABEL[1]/INPUT[1]"), "0"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[3]/DIV[1]/COMPONENT[1]/FORM[1]/DIV[3]/DIV[1]/P[1]/LABEL[1]/INPUT[1]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[3]/DIV[1]/COMPONENT[1]/FORM[1]/DIV[3]/DIV[1]/P[2]/LABEL[1]/INPUT[1]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[3]/DIV[1]/COMPONENT[1]/FORM[1]/DIV[4]/DIV[1]/SELECT[1]"), "12"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(1000030), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(128);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 128");

			testSuiteHelper.addStateToReportBuilder(128);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(128)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(128)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(128)
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
	public void method_BT117_path_119_121_123(){
		testSuiteHelper.newCurrentTestMethod("method_BT117_path_119_121_123", 24);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(129);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(129)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(129)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(129)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[3]/DIV[1]/DIV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={class=pk-icon-edit pk-icon-hover, data-uk-tooltip={delay: 500}, evlist=false, title=Edit}}, source=HybridStateVertexImpl{id=129, name=state129}, target=HybridStateVertexImpl{id=132, name=state132}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(119), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(132);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 132");

			testSuiteHelper.addStateToReportBuilder(132);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(132)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(132)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(132)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[3]/DIV[1]/DIV[1]/UL[1]/LI[3]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={anyaccess=none, class=pk-icon-delete pk-icon-hover, data-uk-tooltip={delay: 500}, evlist=false}}, source=HybridStateVertexImpl{id=132, name=state132}, target=HybridStateVertexImpl{id=133, name=state133}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[3]/DIV[1]/COMPONENT[1]/FORM[1]/DIV[1]/DIV[1]/P[1]/LABEL[1]/INPUT[1]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[3]/DIV[1]/COMPONENT[1]/FORM[1]/DIV[1]/DIV[1]/P[2]/LABEL[1]/INPUT[1]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[3]/DIV[1]/COMPONENT[1]/FORM[1]/DIV[2]/DIV[1]/P[1]/LABEL[1]/INPUT[1]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[3]/DIV[1]/COMPONENT[1]/FORM[1]/DIV[2]/DIV[1]/P[2]/LABEL[1]/INPUT[1]"), "0"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[3]/DIV[1]/COMPONENT[1]/FORM[1]/DIV[3]/DIV[1]/P[1]/LABEL[1]/INPUT[1]"), "0"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[3]/DIV[1]/COMPONENT[1]/FORM[1]/DIV[3]/DIV[1]/P[2]/LABEL[1]/INPUT[1]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[3]/DIV[1]/COMPONENT[1]/FORM[1]/DIV[4]/DIV[1]/SELECT[1]"), "12"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(121), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(133);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 133");

			testSuiteHelper.addStateToReportBuilder(133);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(133)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(133)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(133)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[5]/DIV[1]/DIV[1]/DIV[2]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=ביטול, attributes={anyaccess=action, class=uk-button uk-button-link uk-modal-close, evlist=false}}, source=HybridStateVertexImpl{id=133, name=state133}, target=HybridStateVertexImpl{id=134, name=state134}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[3]/DIV[1]/COMPONENT[1]/FORM[1]/DIV[1]/DIV[1]/P[1]/LABEL[1]/INPUT[1]"), "1"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(123), "Event fired: ביטול");
			testSuiteHelper.runInCrawlingPlugins(134);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 134");

			testSuiteHelper.addStateToReportBuilder(134);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(134)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(134)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(134)
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
	public void method_BT129_path_124(){
		testSuiteHelper.newCurrentTestMethod("method_BT129_path_124", 25);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(129);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(129)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(129)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(129)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[3]/DIV[1]/DIV[1]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={class=pk-icon-handle pk-icon-hover uk-sortable-handle, data-uk-tooltip={delay: 500}, evlist=false, title=Drag}}, source=HybridStateVertexImpl{id=129, name=state129}, target=HybridStateVertexImpl{id=136, name=state136}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(124), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(136);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 136");

			testSuiteHelper.addStateToReportBuilder(136);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(136)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(136)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(136)
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
	public void method_BT128_failed_path_1000031_1000032(){
		testSuiteHelper.newCurrentTestMethod("method_BT128_failed_path_1000031_1000032", 26);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(129);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(129)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(129)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(129)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=Add Widget, attributes={class=uk-button uk-button-primary, evlist=false}}, source=HybridStateVertexImpl{id=129, name=state129}, target=HybridStateVertexImpl{id=138, name=state138}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1000031), "Event fired: Add Widget");
			testSuiteHelper.runInCrawlingPlugins(138);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 138");

			testSuiteHelper.addStateToReportBuilder(138);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(138)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(138)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(138)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=User, attributes={class=uk-dropdown-close, evlist=false}}, source=HybridStateVertexImpl{id=138, name=state138}, target=HybridStateVertexImpl{id=139, name=state139}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1000032), "Event fired: User");
			testSuiteHelper.runInCrawlingPlugins(139);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 139");

			testSuiteHelper.addStateToReportBuilder(139);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(139)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(139)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(139)
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
	public void method_BT128_path_133_135_136_137_138_141_142(){
		testSuiteHelper.newCurrentTestMethod("method_BT128_path_133_135_136_137_138_141_142", 27);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(141);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(141)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(141)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(141)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[2]/DIV[2]/UL[1]/LI[3]/DIV[1]/DIV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={class=pk-icon-edit pk-icon-hover, data-uk-tooltip={delay: 500}, evlist=false, title=Edit}}, source=HybridStateVertexImpl{id=141, name=state141}, target=HybridStateVertexImpl{id=144, name=state144}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(133), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(144);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 144");

			testSuiteHelper.addStateToReportBuilder(144);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(144)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(144)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(144)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[2]/DIV[2]/UL[1]/LI[3]/DIV[1]/DIV[1]/UL[1]/LI[3]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={anyaccess=none, class=pk-icon-delete pk-icon-hover, data-uk-tooltip={delay: 500}, evlist=false}}, source=HybridStateVertexImpl{id=144, name=state144}, target=HybridStateVertexImpl{id=145, name=state145}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[2]/DIV[2]/UL[1]/LI[3]/DIV[1]/COMPONENT[1]/FORM[1]/DIV[1]/DIV[1]/P[1]/LABEL[1]/INPUT[1]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[2]/DIV[2]/UL[1]/LI[3]/DIV[1]/COMPONENT[1]/FORM[1]/DIV[1]/DIV[1]/P[2]/LABEL[1]/INPUT[1]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[2]/DIV[2]/UL[1]/LI[3]/DIV[1]/COMPONENT[1]/FORM[1]/DIV[2]/DIV[1]/P[1]/LABEL[1]/INPUT[1]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[2]/DIV[2]/UL[1]/LI[3]/DIV[1]/COMPONENT[1]/FORM[1]/DIV[2]/DIV[1]/P[2]/LABEL[1]/INPUT[1]"), "0"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[2]/DIV[2]/UL[1]/LI[3]/DIV[1]/COMPONENT[1]/FORM[1]/DIV[3]/DIV[1]/P[1]/LABEL[1]/INPUT[1]"), "0"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[2]/DIV[2]/UL[1]/LI[3]/DIV[1]/COMPONENT[1]/FORM[1]/DIV[3]/DIV[1]/P[2]/LABEL[1]/INPUT[1]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[2]/DIV[2]/UL[1]/LI[3]/DIV[1]/COMPONENT[1]/FORM[1]/DIV[4]/DIV[1]/SELECT[1]"), "18"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(135), "Event fired: ");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[2]/DIV[2]/UL[1]/LI[3]/DIV[1]/COMPONENT[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={anyaccess=none, evlist=false, href=/pagekit/index.php/admin/user/edit?id=1, title=admin}}, source=HybridStateVertexImpl{id=145, name=state145}, target=HybridStateVertexImpl{id=8, name=state8}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[2]/DIV[2]/UL[1]/LI[3]/DIV[1]/COMPONENT[1]/FORM[1]/DIV[1]/DIV[1]/P[1]/LABEL[1]/INPUT[1]"), "1"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(136), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(8);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 8");

			testSuiteHelper.addStateToReportBuilder(8);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(8)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(8)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(8)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/FORM[1]/DIV[1]/DIV[2]/A[1], element=Element{node=[A: null], tag=A, text=Close, attributes={class=uk-button uk-margin-small-right, evlist=false, href=/pagekit/index.php/admin/user}}, source=HybridStateVertexImpl{id=8, name=state8}, target=HybridStateVertexImpl{id=9, name=state9}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"), "example"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"), "example123"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/DIV[1]/INPUT[1]"), "example@example.com"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[5]/DIV[1]/P[1]/LABEL[1]/INPUT[1]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[5]/DIV[1]/P[2]/LABEL[1]/INPUT[1]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[6]/DIV[1]/P[1]/LABEL[1]/INPUT[1]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[6]/DIV[1]/P[2]/LABEL[1]/INPUT[1]"), "1"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(137), "Event fired: Close");
			testSuiteHelper.runInCrawlingPlugins(9);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 9");

			testSuiteHelper.addStateToReportBuilder(9);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(9)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(9)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(9)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[2]/TABLE[1]/TBODY[1]/TR[1]/TD[3]/A[1], element=Element{node=[A: null], tag=A, text=admin, attributes={evlist=false, href=/pagekit/index.php/admin/user/edit?id=1}}, source=HybridStateVertexImpl{id=9, name=state9}, target=HybridStateVertexImpl{id=8, name=state8}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"), "ivKtevnV"));
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[2]/TABLE[1]/THEAD[1]/TR[1]/TH[1]/INPUT[1]"), "0"));
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[2]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/INPUT[1]"), "1"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(138), "Event fired: admin");
			testSuiteHelper.runInCrawlingPlugins(8);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 8");

			testSuiteHelper.addStateToReportBuilder(8);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(8)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(8)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(8)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[4]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=Change password, attributes={evlist=false, href=#}}, source=HybridStateVertexImpl{id=8, name=state8}, target=HybridStateVertexImpl{id=149, name=state149}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"), "example"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"), "example123"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/DIV[1]/INPUT[1]"), "example@example.com"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[5]/DIV[1]/P[1]/LABEL[1]/INPUT[1]"), "0"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[5]/DIV[1]/P[2]/LABEL[1]/INPUT[1]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[6]/DIV[1]/P[1]/LABEL[1]/INPUT[1]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[6]/DIV[1]/P[2]/LABEL[1]/INPUT[1]"), "1"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(141), "Event fired: Change password");
			testSuiteHelper.runInCrawlingPlugins(149);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 149");

			testSuiteHelper.addStateToReportBuilder(149);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(149)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(149)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(149)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/FORM[1]/DIV[1]/DIV[2]/A[1], element=Element{node=[A: null], tag=A, text=Close, attributes={class=uk-button uk-margin-small-right, evlist=false, href=/pagekit/index.php/admin/user}}, source=HybridStateVertexImpl{id=149, name=state149}, target=HybridStateVertexImpl{id=11, name=state11}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"), "example"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"), "example123"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/DIV[1]/INPUT[1]"), "example@example.com"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[5]/DIV[1]/P[1]/LABEL[1]/INPUT[1]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[5]/DIV[1]/P[2]/LABEL[1]/INPUT[1]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[6]/DIV[1]/P[1]/LABEL[1]/INPUT[1]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[6]/DIV[1]/P[2]/LABEL[1]/INPUT[1]"), "1"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(142), "Event fired: Close");
			testSuiteHelper.runInCrawlingPlugins(11);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 11");

			testSuiteHelper.addStateToReportBuilder(11);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(11)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(11)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(11)
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
	public void method_BT141_path_143(){
		testSuiteHelper.newCurrentTestMethod("method_BT141_path_143", 28);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(141);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(141)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(141)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(141)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[2]/DIV[2]/UL[1]/LI[3]/DIV[1]/DIV[1]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={class=pk-icon-handle pk-icon-hover uk-sortable-handle, data-uk-tooltip={delay: 500}, evlist=false, title=Drag}}, source=HybridStateVertexImpl{id=141, name=state141}, target=HybridStateVertexImpl{id=152, name=state152}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(143), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(152);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 152");

			testSuiteHelper.addStateToReportBuilder(152);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(152)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(152)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(152)
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
	public void method_BT141_path_147(){
		testSuiteHelper.newCurrentTestMethod("method_BT141_path_147", 29);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(141);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(141)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(141)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(141)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[2]/DIV[1]/UL[1]/LI[5]/A[1], element=Element{node=[A: null], tag=A, text=Site, attributes={evlist=false, href=/pagekit/index.php/admin/site/page}}, source=HybridStateVertexImpl{id=141, name=state141}, target=HybridStateVertexImpl{id=113, name=state113}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(147), "Event fired: Site");
			testSuiteHelper.runInCrawlingPlugins(113);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 113");

			testSuiteHelper.addStateToReportBuilder(113);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(113)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(113)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(113)
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
	public void method_BT129_path_148(){
		testSuiteHelper.newCurrentTestMethod("method_BT129_path_148", 30);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(141);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(141)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(141)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(141)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[2]/DIV[1]/UL[1]/LI[6]/A[1], element=Element{node=[A: null], tag=A, text=משתמשים, attributes={evlist=false, href=/pagekit/index.php/admin/user}}, source=HybridStateVertexImpl{id=141, name=state141}, target=HybridStateVertexImpl{id=11, name=state11}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(148), "Event fired: משתמשים");
			testSuiteHelper.runInCrawlingPlugins(11);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 11");

			testSuiteHelper.addStateToReportBuilder(11);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(11)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(11)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(11)
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
	public void method_BT141_path_149_150_151_152(){
		testSuiteHelper.newCurrentTestMethod("method_BT141_path_149_150_151_152", 31);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(141);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(141)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(141)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(141)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[2]/DIV[1]/UL[1]/LI[7]/A[1], element=Element{node=[A: null], tag=A, text=מערכת, attributes={evlist=false, href=/pagekit/index.php/admin/system/settings}}, source=HybridStateVertexImpl{id=141, name=state141}, target=HybridStateVertexImpl{id=96, name=state96}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(149), "Event fired: מערכת");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/UL[1]/LI[4]/A[1], element=Element{node=[A: null], tag=A, text=דוא"ל, attributes={anyaccess=action, evlist=false}}, source=HybridStateVertexImpl{id=96, name=state96}, target=HybridStateVertexImpl{id=161, name=state161}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/FORM[1]/DIV[1]/DIV[2]/UL[1]/LI[1]/DIV[2]/DIV[1]/INPUT[1]"), "fClHPBXq"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/FORM[1]/DIV[1]/DIV[2]/UL[1]/LI[1]/DIV[3]/DIV[1]/INPUT[1]"), "MGyUcJPu"));
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/FORM[1]/DIV[1]/DIV[2]/UL[1]/LI[1]/DIV[4]/DIV[1]/P[1]/LABEL[1]/INPUT[1]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/FORM[1]/DIV[1]/DIV[2]/UL[1]/LI[1]/DIV[4]/DIV[1]/P[2]/LABEL[1]/INPUT[1]"), "0"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(150), "Event fired: דוא\"ל");
			testSuiteHelper.runInCrawlingPlugins(161);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 161");

			testSuiteHelper.addStateToReportBuilder(161);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(161)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(161)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(161)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/FORM[1]/DIV[1]/DIV[2]/UL[1]/LI[4]/DIV[1]/DIV[2]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=שמור, attributes={class=uk-button uk-button-primary, evlist=false, type=submit}}, source=HybridStateVertexImpl{id=161, name=state161}, target=HybridStateVertexImpl{id=162, name=state162}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/FORM[1]/DIV[1]/DIV[2]/UL[1]/LI[4]/DIV[2]/DIV[1]/INPUT[1]"), "fGswYZZu"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/FORM[1]/DIV[1]/DIV[2]/UL[1]/LI[4]/DIV[3]/DIV[1]/INPUT[1]"), "kjPhEXbK"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/FORM[1]/DIV[1]/DIV[2]/UL[1]/LI[4]/DIV[4]/DIV[1]/SELECT[1]"), "SMTP Mailer"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(151), "Event fired: שמור");
			testSuiteHelper.runInCrawlingPlugins(162);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 162");

			testSuiteHelper.addStateToReportBuilder(162);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(162)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(162)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(162)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/HEADER[1]/DIV[1]/NAV[1]/UL[1]/LI[3]/A[1], element=Element{node=[A: null], tag=A, text=תבניות עיצוב, attributes={anyaccess=none, evlist=false, href=/pagekit/index.php/admin/system/package/themes}}, source=HybridStateVertexImpl{id=162, name=state162}, target=HybridStateVertexImpl{id=163, name=state163}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/FORM[1]/DIV[1]/DIV[2]/UL[1]/LI[4]/DIV[2]/DIV[1]/INPUT[1]"), "GGQyshkV"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/FORM[1]/DIV[1]/DIV[2]/UL[1]/LI[4]/DIV[3]/DIV[1]/INPUT[1]"), "hOPPTNkS"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/FORM[1]/DIV[1]/DIV[2]/UL[1]/LI[4]/DIV[5]/DIV[1]/DIV[1]/INPUT[1]"), "AjPqQbEO"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/FORM[1]/DIV[1]/DIV[2]/UL[1]/LI[4]/DIV[5]/DIV[2]/DIV[1]/INPUT[1]"), "XmHmNchB"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/FORM[1]/DIV[1]/DIV[2]/UL[1]/LI[4]/DIV[5]/DIV[3]/DIV[1]/INPUT[1]"), "IPBghoyV"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/FORM[1]/DIV[1]/DIV[2]/UL[1]/LI[4]/DIV[4]/DIV[1]/SELECT[1]"), "SMTP Mailer"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/FORM[1]/DIV[1]/DIV[2]/UL[1]/LI[4]/DIV[5]/DIV[5]/DIV[1]/SELECT[1]"), "כלום"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(152), "Event fired: תבניות עיצוב");
			testSuiteHelper.runInCrawlingPlugins(163);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 163");

			testSuiteHelper.addStateToReportBuilder(163);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(163)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(163)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(163)
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
	public void method_BT139_failed_path_1000034_1000035(){
		testSuiteHelper.newCurrentTestMethod("method_BT139_failed_path_1000034_1000035", 32);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(141);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(141)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(141)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(141)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=Add Widget, attributes={class=uk-button uk-button-primary, evlist=false}}, source=HybridStateVertexImpl{id=141, name=state141}, target=HybridStateVertexImpl{id=165, name=state165}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1000034), "Event fired: Add Widget");
			testSuiteHelper.runInCrawlingPlugins(165);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 165");

			testSuiteHelper.addStateToReportBuilder(165);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(165)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(165)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(165)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=User, attributes={class=uk-dropdown-close, evlist=false}}, source=HybridStateVertexImpl{id=165, name=state165}, target=HybridStateVertexImpl{id=166, name=state166}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1000035), "Event fired: User");
			testSuiteHelper.runInCrawlingPlugins(166);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 166");

			testSuiteHelper.addStateToReportBuilder(166);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(166)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(166)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(166)
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
	public void method_BT166_failed_path_1000036_1000037(){
		testSuiteHelper.newCurrentTestMethod("method_BT166_failed_path_1000036_1000037", 33);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(167);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(167)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(167)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(167)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=Add Widget, attributes={class=uk-button uk-button-primary, evlist=false}}, source=HybridStateVertexImpl{id=167, name=state167}, target=HybridStateVertexImpl{id=169, name=state169}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1000036), "Event fired: Add Widget");
			testSuiteHelper.runInCrawlingPlugins(169);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 169");

			testSuiteHelper.addStateToReportBuilder(169);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(169)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(169)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(169)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=User, attributes={class=uk-dropdown-close, evlist=false}}, source=HybridStateVertexImpl{id=169, name=state169}, target=HybridStateVertexImpl{id=170, name=state170}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1000037), "Event fired: User");
			testSuiteHelper.runInCrawlingPlugins(170);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 170");

			testSuiteHelper.addStateToReportBuilder(170);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(170)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(170)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(170)
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
	public void method_BT166_path_167_169_170_171(){
		testSuiteHelper.newCurrentTestMethod("method_BT166_path_167_169_170_171", 34);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(171);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(171)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(171)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(171)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[4]/DIV[1]/DIV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={class=pk-icon-edit pk-icon-hover, data-uk-tooltip={delay: 500}, evlist=false, title=Edit}}, source=HybridStateVertexImpl{id=171, name=state171}, target=HybridStateVertexImpl{id=174, name=state174}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(167), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(174);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 174");

			testSuiteHelper.addStateToReportBuilder(174);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(174)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(174)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(174)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[4]/DIV[1]/DIV[1]/UL[1]/LI[3]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={anyaccess=none, class=pk-icon-delete pk-icon-hover, data-uk-tooltip={delay: 500}, evlist=false}}, source=HybridStateVertexImpl{id=174, name=state174}, target=HybridStateVertexImpl{id=175, name=state175}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[4]/DIV[1]/COMPONENT[1]/FORM[1]/DIV[1]/DIV[1]/P[1]/LABEL[1]/INPUT[1]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[4]/DIV[1]/COMPONENT[1]/FORM[1]/DIV[1]/DIV[1]/P[2]/LABEL[1]/INPUT[1]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[4]/DIV[1]/COMPONENT[1]/FORM[1]/DIV[2]/DIV[1]/P[1]/LABEL[1]/INPUT[1]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[4]/DIV[1]/COMPONENT[1]/FORM[1]/DIV[2]/DIV[1]/P[2]/LABEL[1]/INPUT[1]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[4]/DIV[1]/COMPONENT[1]/FORM[1]/DIV[3]/DIV[1]/P[1]/LABEL[1]/INPUT[1]"), "0"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[4]/DIV[1]/COMPONENT[1]/FORM[1]/DIV[3]/DIV[1]/P[2]/LABEL[1]/INPUT[1]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[4]/DIV[1]/COMPONENT[1]/FORM[1]/DIV[4]/DIV[1]/SELECT[1]"), "6"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(169), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(175);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 175");

			testSuiteHelper.addStateToReportBuilder(175);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(175)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(175)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(175)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[4]/DIV[1]/COMPONENT[1]/UL[1]/LI[1]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=admin, attributes={anyaccess=none, evlist=false, href=/pagekit/index.php/admin/user/edit?id=1, title=admin}}, source=HybridStateVertexImpl{id=175, name=state175}, target=HybridStateVertexImpl{id=8, name=state8}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[4]/DIV[1]/COMPONENT[1]/FORM[1]/DIV[1]/DIV[1]/P[1]/LABEL[1]/INPUT[1]"), "0"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[4]/DIV[1]/COMPONENT[1]/FORM[1]/DIV[1]/DIV[1]/P[2]/LABEL[1]/INPUT[1]"), "1"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(170), "Event fired: admin");
			testSuiteHelper.runInCrawlingPlugins(8);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 8");

			testSuiteHelper.addStateToReportBuilder(8);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(8)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(8)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(8)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[4]/DIV[2]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=Show, attributes={class=uk-form-password-toggle, evlist=false, href=#}}, source=HybridStateVertexImpl{id=8, name=state8}, target=HybridStateVertexImpl{id=177, name=state177}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"), "example"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"), "example123"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/DIV[1]/INPUT[1]"), "example@example.com"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[5]/DIV[1]/P[1]/LABEL[1]/INPUT[1]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[5]/DIV[1]/P[2]/LABEL[1]/INPUT[1]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[6]/DIV[1]/P[1]/LABEL[1]/INPUT[1]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[6]/DIV[1]/P[2]/LABEL[1]/INPUT[1]"), "1"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(171), "Event fired: Show");
			testSuiteHelper.runInCrawlingPlugins(177);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 177");

			testSuiteHelper.addStateToReportBuilder(177);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(177)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(177)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(177)
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
	public void method_BT171_path_172(){
		testSuiteHelper.newCurrentTestMethod("method_BT171_path_172", 35);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(171);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(171)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(171)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(171)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[4]/DIV[1]/DIV[1]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={class=pk-icon-handle pk-icon-hover uk-sortable-handle, data-uk-tooltip={delay: 500}, evlist=false, title=Drag}}, source=HybridStateVertexImpl{id=171, name=state171}, target=HybridStateVertexImpl{id=179, name=state179}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(172), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(179);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 179");

			testSuiteHelper.addStateToReportBuilder(179);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(179)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(179)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(179)
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
	public void method_BT170_failed_path_1000038_1000039(){
		testSuiteHelper.newCurrentTestMethod("method_BT170_failed_path_1000038_1000039", 36);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(171);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(171)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(171)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(171)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=Add Widget, attributes={class=uk-button uk-button-primary, evlist=false}}, source=HybridStateVertexImpl{id=171, name=state171}, target=HybridStateVertexImpl{id=181, name=state181}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1000038), "Event fired: Add Widget");
			testSuiteHelper.runInCrawlingPlugins(181);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 181");

			testSuiteHelper.addStateToReportBuilder(181);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(181)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(181)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(181)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=User, attributes={class=uk-dropdown-close, evlist=false}}, source=HybridStateVertexImpl{id=181, name=state181}, target=HybridStateVertexImpl{id=182, name=state182}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1000039), "Event fired: User");
			testSuiteHelper.runInCrawlingPlugins(182);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 182");

			testSuiteHelper.addStateToReportBuilder(182);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(182)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(182)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(182)
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
	public void method_BT170_path_183_185_196_197(){
		testSuiteHelper.newCurrentTestMethod("method_BT170_path_183_185_196_197", 37);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(183);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(183)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(183)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(183)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[2]/DIV[2]/UL[1]/LI[4]/DIV[1]/DIV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={class=pk-icon-edit pk-icon-hover, data-uk-tooltip={delay: 500}, evlist=false, title=Edit}}, source=HybridStateVertexImpl{id=183, name=state183}, target=HybridStateVertexImpl{id=186, name=state186}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(183), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(186);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 186");

			testSuiteHelper.addStateToReportBuilder(186);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(186)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(186)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(186)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[2]/DIV[2]/UL[1]/LI[4]/DIV[1]/DIV[1]/UL[1]/LI[3]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={anyaccess=none, class=pk-icon-delete pk-icon-hover, data-uk-tooltip={delay: 500}, evlist=false}}, source=HybridStateVertexImpl{id=186, name=state186}, target=HybridStateVertexImpl{id=187, name=state187}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[2]/DIV[2]/UL[1]/LI[4]/DIV[1]/COMPONENT[1]/FORM[1]/DIV[1]/DIV[1]/P[1]/LABEL[1]/INPUT[1]"), "0"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[2]/DIV[2]/UL[1]/LI[4]/DIV[1]/COMPONENT[1]/FORM[1]/DIV[1]/DIV[1]/P[2]/LABEL[1]/INPUT[1]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[2]/DIV[2]/UL[1]/LI[4]/DIV[1]/COMPONENT[1]/FORM[1]/DIV[2]/DIV[1]/P[1]/LABEL[1]/INPUT[1]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[2]/DIV[2]/UL[1]/LI[4]/DIV[1]/COMPONENT[1]/FORM[1]/DIV[2]/DIV[1]/P[2]/LABEL[1]/INPUT[1]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[2]/DIV[2]/UL[1]/LI[4]/DIV[1]/COMPONENT[1]/FORM[1]/DIV[3]/DIV[1]/P[1]/LABEL[1]/INPUT[1]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[2]/DIV[2]/UL[1]/LI[4]/DIV[1]/COMPONENT[1]/FORM[1]/DIV[3]/DIV[1]/P[2]/LABEL[1]/INPUT[1]"), "0"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[2]/DIV[2]/UL[1]/LI[4]/DIV[1]/COMPONENT[1]/FORM[1]/DIV[4]/DIV[1]/SELECT[1]"), "24"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(185), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(187);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 187");

			testSuiteHelper.addStateToReportBuilder(187);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(187)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(187)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(187)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[2]/DIV[1]/UL[1]/LI[4]/A[1], element=Element{node=[A: null], tag=A, text=ניהול, attributes={evlist=false, href=/pagekit/index.php/admin/dashboard}}, source=HybridStateVertexImpl{id=187, name=state187}, target=HybridStateVertexImpl{id=183, name=state183}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[2]/DIV[2]/UL[1]/LI[4]/DIV[1]/COMPONENT[1]/FORM[1]/DIV[1]/DIV[1]/P[1]/LABEL[1]/INPUT[1]"), "0"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[2]/DIV[2]/UL[1]/LI[4]/DIV[1]/COMPONENT[1]/FORM[1]/DIV[1]/DIV[1]/P[2]/LABEL[1]/INPUT[1]"), "1"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(196), "Event fired: ניהול");
			testSuiteHelper.runInCrawlingPlugins(183);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 183");

			testSuiteHelper.addStateToReportBuilder(183);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(183)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(183)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(183)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[2]/DIV[2]/UL[1]/LI[4]/DIV[1]/DIV[1]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={class=pk-icon-handle pk-icon-hover uk-sortable-handle, data-uk-tooltip={delay: 500}, evlist=false, title=Drag}}, source=HybridStateVertexImpl{id=183, name=state183}, target=HybridStateVertexImpl{id=191, name=state191}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(197), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(191);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 191");

			testSuiteHelper.addStateToReportBuilder(191);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(191)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(191)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(191)
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
	public void method_BT183_path_201(){
		testSuiteHelper.newCurrentTestMethod("method_BT183_path_201", 38);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(183);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(183)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(183)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(183)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[2]/DIV[1]/UL[1]/LI[5]/A[1], element=Element{node=[A: null], tag=A, text=Site, attributes={evlist=false, href=/pagekit/index.php/admin/site/page}}, source=HybridStateVertexImpl{id=183, name=state183}, target=HybridStateVertexImpl{id=113, name=state113}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(201), "Event fired: Site");
			testSuiteHelper.runInCrawlingPlugins(113);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 113");

			testSuiteHelper.addStateToReportBuilder(113);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(113)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(113)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(113)
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
	public void method_BT182_failed_path_1000040_1000041(){
		testSuiteHelper.newCurrentTestMethod("method_BT182_failed_path_1000040_1000041", 39);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(183);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(183)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(183)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(183)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=Add Widget, attributes={class=uk-button uk-button-primary, evlist=false}}, source=HybridStateVertexImpl{id=183, name=state183}, target=HybridStateVertexImpl{id=196, name=state196}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1000040), "Event fired: Add Widget");
			testSuiteHelper.runInCrawlingPlugins(196);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 196");

			testSuiteHelper.addStateToReportBuilder(196);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(196)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(196)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(196)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=User, attributes={class=uk-dropdown-close, evlist=false}}, source=HybridStateVertexImpl{id=196, name=state196}, target=HybridStateVertexImpl{id=197, name=state197}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1000041), "Event fired: User");
			testSuiteHelper.runInCrawlingPlugins(197);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 197");

			testSuiteHelper.addStateToReportBuilder(197);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(197)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(197)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(197)
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
	public void method_BT197_failed_path_1000042_1000043(){
		testSuiteHelper.newCurrentTestMethod("method_BT197_failed_path_1000042_1000043", 40);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(198);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(198)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(198)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(198)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=Add Widget, attributes={class=uk-button uk-button-primary, evlist=false}}, source=HybridStateVertexImpl{id=198, name=state198}, target=HybridStateVertexImpl{id=200, name=state200}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1000042), "Event fired: Add Widget");
			testSuiteHelper.runInCrawlingPlugins(200);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 200");

			testSuiteHelper.addStateToReportBuilder(200);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(200)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(200)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(200)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=User, attributes={class=uk-dropdown-close, evlist=false}}, source=HybridStateVertexImpl{id=200, name=state200}, target=HybridStateVertexImpl{id=201, name=state201}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1000043), "Event fired: User");
			testSuiteHelper.runInCrawlingPlugins(201);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 201");

			testSuiteHelper.addStateToReportBuilder(201);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(201)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(201)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(201)
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
	public void method_BT201_failed_path_1000044_1000045(){
		testSuiteHelper.newCurrentTestMethod("method_BT201_failed_path_1000044_1000045", 41);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(202);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(202)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(202)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(202)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=Add Widget, attributes={class=uk-button uk-button-primary, evlist=false}}, source=HybridStateVertexImpl{id=202, name=state202}, target=HybridStateVertexImpl{id=204, name=state204}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1000044), "Event fired: Add Widget");
			testSuiteHelper.runInCrawlingPlugins(204);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 204");

			testSuiteHelper.addStateToReportBuilder(204);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(204)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(204)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(204)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=User, attributes={class=uk-dropdown-close, evlist=false}}, source=HybridStateVertexImpl{id=204, name=state204}, target=HybridStateVertexImpl{id=205, name=state205}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1000045), "Event fired: User");
			testSuiteHelper.runInCrawlingPlugins(205);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 205");

			testSuiteHelper.addStateToReportBuilder(205);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(205)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(205)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(205)
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
	public void method_BT201_path_230_232_245_246(){
		testSuiteHelper.newCurrentTestMethod("method_BT201_path_230_232_245_246", 42);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(206);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(206)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(206)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(206)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[2]/DIV[2]/UL[1]/LI[5]/DIV[1]/DIV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={class=pk-icon-edit pk-icon-hover, data-uk-tooltip={delay: 500}, evlist=false, title=Edit}}, source=HybridStateVertexImpl{id=206, name=state206}, target=HybridStateVertexImpl{id=209, name=state209}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(230), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(209);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 209");

			testSuiteHelper.addStateToReportBuilder(209);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(209)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(209)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(209)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[2]/DIV[2]/UL[1]/LI[5]/DIV[1]/DIV[1]/UL[1]/LI[3]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={anyaccess=none, class=pk-icon-delete pk-icon-hover, data-uk-tooltip={delay: 500}, evlist=false}}, source=HybridStateVertexImpl{id=209, name=state209}, target=HybridStateVertexImpl{id=210, name=state210}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[2]/DIV[2]/UL[1]/LI[5]/DIV[1]/COMPONENT[1]/FORM[1]/DIV[1]/DIV[1]/P[1]/LABEL[1]/INPUT[1]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[2]/DIV[2]/UL[1]/LI[5]/DIV[1]/COMPONENT[1]/FORM[1]/DIV[1]/DIV[1]/P[2]/LABEL[1]/INPUT[1]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[2]/DIV[2]/UL[1]/LI[5]/DIV[1]/COMPONENT[1]/FORM[1]/DIV[2]/DIV[1]/P[1]/LABEL[1]/INPUT[1]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[2]/DIV[2]/UL[1]/LI[5]/DIV[1]/COMPONENT[1]/FORM[1]/DIV[2]/DIV[1]/P[2]/LABEL[1]/INPUT[1]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[2]/DIV[2]/UL[1]/LI[5]/DIV[1]/COMPONENT[1]/FORM[1]/DIV[3]/DIV[1]/P[1]/LABEL[1]/INPUT[1]"), "0"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[2]/DIV[2]/UL[1]/LI[5]/DIV[1]/COMPONENT[1]/FORM[1]/DIV[3]/DIV[1]/P[2]/LABEL[1]/INPUT[1]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[2]/DIV[2]/UL[1]/LI[5]/DIV[1]/COMPONENT[1]/FORM[1]/DIV[4]/DIV[1]/SELECT[1]"), "6"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(232), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(210);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 210");

			testSuiteHelper.addStateToReportBuilder(210);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(210)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(210)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(210)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[2]/DIV[1]/UL[1]/LI[4]/A[1], element=Element{node=[A: null], tag=A, text=ניהול, attributes={evlist=false, href=/pagekit/index.php/admin/dashboard}}, source=HybridStateVertexImpl{id=210, name=state210}, target=HybridStateVertexImpl{id=206, name=state206}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[2]/DIV[2]/UL[1]/LI[5]/DIV[1]/COMPONENT[1]/FORM[1]/DIV[1]/DIV[1]/P[1]/LABEL[1]/INPUT[1]"), "0"));
			formInputs.add(new FormInput(FormInput.InputType.RADIO, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[2]/DIV[2]/UL[1]/LI[5]/DIV[1]/COMPONENT[1]/FORM[1]/DIV[1]/DIV[1]/P[2]/LABEL[1]/INPUT[1]"), "1"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(245), "Event fired: ניהול");
			testSuiteHelper.runInCrawlingPlugins(206);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 206");

			testSuiteHelper.addStateToReportBuilder(206);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(206)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(206)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(206)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[2]/DIV[2]/UL[1]/LI[5]/DIV[1]/DIV[1]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={class=pk-icon-handle pk-icon-hover uk-sortable-handle, data-uk-tooltip={delay: 500}, evlist=false, title=Drag}}, source=HybridStateVertexImpl{id=206, name=state206}, target=HybridStateVertexImpl{id=214, name=state214}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(246), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(214);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 214");

			testSuiteHelper.addStateToReportBuilder(214);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(214)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(214)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(214)
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
	public void method_BT206_path_250(){
		testSuiteHelper.newCurrentTestMethod("method_BT206_path_250", 43);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(206);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(206)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(206)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(206)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[2]/DIV[1]/UL[1]/LI[5]/A[1], element=Element{node=[A: null], tag=A, text=Site, attributes={evlist=false, href=/pagekit/index.php/admin/site/page}}, source=HybridStateVertexImpl{id=206, name=state206}, target=HybridStateVertexImpl{id=113, name=state113}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(250), "Event fired: Site");
			testSuiteHelper.runInCrawlingPlugins(113);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 113");

			testSuiteHelper.addStateToReportBuilder(113);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(113)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(113)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(113)
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
