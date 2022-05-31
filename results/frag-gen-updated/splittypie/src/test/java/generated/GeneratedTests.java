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
 * Generated @ Wed Sep 22 01:42:03 CDT 2021
 */

public class GeneratedTests {
	private final boolean mutate = true;
    private final String URL = "http://localhost:4200";
	private TestSuiteHelper testSuiteHelper;
	
	private final String CRAWL_PATH = "/Users/liuyu/projects/tackle-test-generator-ui-level/testlabeling/crawljax_frag/out/splittypie/splittypie_HYBRID_DOM_-1.0_60mins/localhost/crawl0";

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
	public void method_BT0_path_4_5_6_8_10_15_16(){
		testSuiteHelper.newCurrentTestMethod("method_BT0_path_4_5_6_8_10_15_16", 2);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(1);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(1)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(1)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(1)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[3]/NAV[1]/DIV[1]/DIV[2]/UL[1]/LI[4]/A[1], element=Element{node=[A: null], tag=A, text=New Event, attributes={anyaccess=none, href=, title=Create New Event}}, source=HybridStateVertexImpl{id=1, name=state1}, target=HybridStateVertexImpl{id=6, name=state6}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(4), "Event fired: New Event");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/HEADER[1]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={class=navbar-brand ember-view, href=/, id=ember637, title=SplittyPie Home Page}}, source=HybridStateVertexImpl{id=6, name=state6}, target=HybridStateVertexImpl{id=1, name=state1}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"), "dfABwpIN"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"), "vxmeUuWY"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"), "yzcfPMlC"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"), "Select currency..."));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(5), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(1);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 1");

			testSuiteHelper.addStateToReportBuilder(1);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(1)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(1)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(1)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[2]/SECTION[1]/DIV[1]/DIV[1]/P[2]/A[1], element=Element{node=[A: null], tag=A, text=Create New Event, attributes={anyaccess=none, class=btn btn-lg btn-success ember-view, href=/new, id=ember728}}, source=HybridStateVertexImpl{id=1, name=state1}, target=HybridStateVertexImpl{id=6, name=state6}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(6), "Event fired: Create New Event");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[3]/NAV[1]/DIV[1]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={class=navbar-brand ember-view, href=/, id=ember662}}, source=HybridStateVertexImpl{id=6, name=state6}, target=HybridStateVertexImpl{id=1, name=state1}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"), "CmLoKKJn"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"), "syQSMmxA"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"), "HJWBelrx"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"), "United States dollar (USD)"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(8), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(1);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 1");

			testSuiteHelper.addStateToReportBuilder(1);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(1)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(1)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(1)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=New Event, attributes={class=ember-view, href=/new, id=ember644}}, source=HybridStateVertexImpl{id=1, name=state1}, target=HybridStateVertexImpl{id=6, name=state6}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(10), "Event fired: New Event");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Add Participant, attributes={class=btn btn-primary add-user, data-ember-action=, data-ember-action-875=875, type=button}}, source=HybridStateVertexImpl{id=6, name=state6}, target=HybridStateVertexImpl{id=15, name=state15}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"), "ilDCdVNP"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"), "UbkwJlfC"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"), "nBhTZAdd"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"), "Czech koruna (CZK)"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(15), "Event fired: Add Participant");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/HEADER[1]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={class=navbar-brand ember-view, href=/, id=ember685, title=SplittyPie Home Page}}, source=HybridStateVertexImpl{id=15, name=state15}, target=HybridStateVertexImpl{id=1, name=state1}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"), "nhBkjQSe"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"), "qGLHijXz"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"), "LytMtpEN"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[3]/DIV[1]/DIV[1]/INPUT[1]"), "bAHWvfph"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"), "Select currency..."));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(16), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(1);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 1");

			testSuiteHelper.addStateToReportBuilder(1);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(1)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(1)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(1)
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
	public void method_BT15_path_4_15_18_19_20_23_24_25_26_27_29_32_33_34_35_36_37_38_39_41_43_45_46_47_48_51(){
		testSuiteHelper.newCurrentTestMethod("method_BT15_path_4_15_18_19_20_23_24_25_26_27_29_32_33_34_35_36_37_38_39_41_43_45_46_47_48_51", 3);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(1);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(1)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(1)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(1)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[3]/NAV[1]/DIV[1]/DIV[2]/UL[1]/LI[4]/A[1], element=Element{node=[A: null], tag=A, text=New Event, attributes={anyaccess=none, href=, title=Create New Event}}, source=HybridStateVertexImpl{id=1, name=state1}, target=HybridStateVertexImpl{id=6, name=state6}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(4), "Event fired: New Event");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Add Participant, attributes={class=btn btn-primary add-user, data-ember-action=, data-ember-action-875=875, type=button}}, source=HybridStateVertexImpl{id=6, name=state6}, target=HybridStateVertexImpl{id=15, name=state15}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"), "ilDCdVNP"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"), "UbkwJlfC"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"), "nBhTZAdd"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"), "Czech koruna (CZK)"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(15), "Event fired: Add Participant");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=New Event, attributes={class=active ember-view, href=/new, id=ember700}}, source=HybridStateVertexImpl{id=15, name=state15}, target=HybridStateVertexImpl{id=6, name=state6}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"), "XxAsHnaO"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"), "PtSDMbQs"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"), "DvoDkxkz"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[3]/DIV[1]/DIV[1]/INPUT[1]"), "eXJvqjpp"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"), "Russian ruble (RUB)"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(18), "Event fired: New Event");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save, attributes={class=btn btn-success save-event, data-ember-action=, data-ember-action-876=876, type=submit}}, source=HybridStateVertexImpl{id=6, name=state6}, target=HybridStateVertexImpl{id=22, name=state22}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"), "JAMoJeTu"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"), "vOxhyyUD"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"), "OYBhqmBO"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"), "Euro (EUR)"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(19), "Event fired: Save");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=JAMoJeTu, attributes={class=ember-view, href=/-MkBB9oJUtZ5EEqw1exS, id=ember984}}, source=HybridStateVertexImpl{id=22, name=state22}, target=HybridStateVertexImpl{id=23, name=state23}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"), "rxRjyiJb"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"), "iiUNYcdE"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"), "onZJfAyB"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"), "Romanian leu (RON)"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(20), "Event fired: JAMoJeTu");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[2]/DIV[1]/DIV[1]/UL[1]/LI[3]/A[1], element=Element{node=[A: null], tag=A, text=New Event, attributes={class=ember-view, href=/new, id=ember739}}, source=HybridStateVertexImpl{id=23, name=state23}, target=HybridStateVertexImpl{id=26, name=state26}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(23), "Event fired: New Event");
			testSuiteHelper.runInCrawlingPlugins(26);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 26");

			testSuiteHelper.addStateToReportBuilder(26);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(26)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(26)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(26)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Cancel, attributes={anyaccess=none, class=btn btn-link ember-view, id=ember852}}, source=HybridStateVertexImpl{id=26, name=state26}, target=HybridStateVertexImpl{id=23, name=state23}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"), "TIEqRLLc"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"), "kWlgrBiW"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"), "PgtLOiIp"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"), "Croatian kuna (HRK)"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(24), "Event fired: Cancel");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[2]/DIV[3]/NAV[1]/DIV[1]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={class=navbar-brand ember-view, href=/, id=ember757}}, source=HybridStateVertexImpl{id=23, name=state23}, target=HybridStateVertexImpl{id=28, name=state28}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(25), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(28);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 28");

			testSuiteHelper.addStateToReportBuilder(28);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(28)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(28)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(28)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[2]/DIV[1]/HEADER[1]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={class=navbar-brand active ember-view, href=/, id=ember714, title=SplittyPie Home Page}}, source=HybridStateVertexImpl{id=28, name=state28}, target=HybridStateVertexImpl{id=23, name=state23}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(26), "Event fired: ");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[2]/DIV[3]/MAIN[1]/DIV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=vOxhyyUD, attributes={class=btn btn-default, data-ember-action=, data-ember-action-760=760}}, source=HybridStateVertexImpl{id=23, name=state23}, target=HybridStateVertexImpl{id=30, name=state30}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(27), "Event fired: vOxhyyUD");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[2]/DIV[3]/MAIN[1]/DIV[1]/NAV[1]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={class=navbar-btn btn btn-link ember-view, href=/-MkBB9oJUtZ5EEqw1exS/edit, id=ember848, title=Edit Event}}, source=HybridStateVertexImpl{id=30, name=state30}, target=HybridStateVertexImpl{id=32, name=state32}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(29), "Event fired: ");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[2]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[4]/DIV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Delete Event, attributes={anyaccess=none, class=btn btn-danger delete-event, data-ember-action=, data-ember-action-870=870}}, source=HybridStateVertexImpl{id=32, name=state32}, target=HybridStateVertexImpl{id=33, name=state33}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[2]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"), "YVaMobRb"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[2]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"), "AOoyRAxz"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[2]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"), "WetDmOQY"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[2]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"), "Bulgarian lev (BGN)"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(32), "Event fired: Delete Event");
			testSuiteHelper.runInCrawlingPlugins(33);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 33");

			testSuiteHelper.addStateToReportBuilder(33);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(33)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(33)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(33)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[2]/DIV[4]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=×, attributes={aria-hidden=true, aria-label=Dismiss, class=close, data-dismiss=modal, type=button}}, source=HybridStateVertexImpl{id=33, name=state33}, target=HybridStateVertexImpl{id=32, name=state32}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[2]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"), "HdvaXgZl"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[2]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"), "papbGUfR"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[2]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"), "rYbeuPhs"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[2]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"), "Swiss franc (CHF)"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(33), "Event fired: ×");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[2]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save, attributes={anyaccess=none, class=btn btn-success save-event, data-ember-action=, data-ember-action-871=871, type=submit}}, source=HybridStateVertexImpl{id=32, name=state32}, target=HybridStateVertexImpl{id=35, name=state35}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[2]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"), "llylfXdd"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[2]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"), "tTeeEeCM"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[2]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"), "lrTgfECd"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[2]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"), "Swiss franc (CHF)"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(34), "Event fired: Save");
			testSuiteHelper.runInCrawlingPlugins(35);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 35");

			testSuiteHelper.addStateToReportBuilder(35);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(35)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(35)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(35)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[2]/DIV[3]/MAIN[1]/DIV[1]/NAV[1]/DIV[1]/DIV[1]/UL[1]/LI[3]/A[1], element=Element{node=[A: null], tag=A, text=lrTgfECd, attributes={anyaccess=none, data-ember-action=, data-ember-action-1126=1126, href=#}}, source=HybridStateVertexImpl{id=35, name=state35}, target=HybridStateVertexImpl{id=30, name=state30}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(35), "Event fired: lrTgfECd");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[2]/DIV[3]/MAIN[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Add New Event, attributes={class=ember-view, href=/new, id=ember869}}, source=HybridStateVertexImpl{id=30, name=state30}, target=HybridStateVertexImpl{id=26, name=state26}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(36), "Event fired: Add New Event");
			testSuiteHelper.runInCrawlingPlugins(26);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 26");

			testSuiteHelper.addStateToReportBuilder(26);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(26)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(26)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(26)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/HEADER[1]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={class=navbar-brand ember-view, href=/, id=ember722, title=SplittyPie Home Page}}, source=HybridStateVertexImpl{id=26, name=state26}, target=HybridStateVertexImpl{id=30, name=state30}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"), "OMuNLqjI"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"), "EkwAmimv"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"), "ijbbmaZt"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"), "Swiss franc (CHF)"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(37), "Event fired: ");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[2]/DIV[3]/MAIN[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/A[1], element=Element{node=[A: null], tag=A, text=Edit, attributes={class=btn btn-link btn-lg ember-view, href=/-MkBB9oJUtZ5EEqw1exS/edit, id=ember871}}, source=HybridStateVertexImpl{id=30, name=state30}, target=HybridStateVertexImpl{id=32, name=state32}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(38), "Event fired: Edit");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[2]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Cancel, attributes={anyaccess=none, class=btn btn-link ember-view, id=ember872}}, source=HybridStateVertexImpl{id=32, name=state32}, target=HybridStateVertexImpl{id=30, name=state30}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[2]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"), "COJBbHXG"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[2]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"), "zBcVQeiP"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[2]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"), "xofaiYGJ"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[2]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"), "Russian ruble (RUB)"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(39), "Event fired: Cancel");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[2]/DIV[3]/MAIN[1]/DIV[1]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Transactions, attributes={href=, title=Transactions}}, source=HybridStateVertexImpl{id=30, name=state30}, target=HybridStateVertexImpl{id=42, name=state42}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(41), "Event fired: Transactions");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[2]/DIV[3]/MAIN[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Share, attributes={anyaccess=none, class=btn btn-link btn-lg, data-ember-action=, data-ember-action-1105=1105}}, source=HybridStateVertexImpl{id=42, name=state42}, target=HybridStateVertexImpl{id=44, name=state44}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(43), "Event fired: Share");
			testSuiteHelper.runInCrawlingPlugins(44);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 44");

			testSuiteHelper.addStateToReportBuilder(44);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(44)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(44)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(44)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[2]/DIV[4]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=×, attributes={aria-hidden=true, aria-label=Close, class=close, data-dismiss=modal, type=button}}, source=HybridStateVertexImpl{id=44, name=state44}, target=HybridStateVertexImpl{id=42, name=state42}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "ember1197"), "CUKsiUho"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(45), "Event fired: ×");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[2]/DIV[3]/NAV[1]/DIV[1]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={class=navbar-brand ember-view, href=/, id=ember749}}, source=HybridStateVertexImpl{id=42, name=state42}, target=HybridStateVertexImpl{id=28, name=state28}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(46), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(28);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 28");

			testSuiteHelper.addStateToReportBuilder(28);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(28)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(28)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(28)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[2]/DIV[1]/DIV[1]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=JAMoJeTu, attributes={class=ember-view, href=/-MkBB9oJUtZ5EEqw1exS, id=ember729}}, source=HybridStateVertexImpl{id=28, name=state28}, target=HybridStateVertexImpl{id=30, name=state30}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(47), "Event fired: JAMoJeTu");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[2]/DIV[3]/MAIN[1]/DIV[1]/DIV[4]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={class=btn btn-primary btn-circle btn-add-transaction, data-ember-action=, data-ember-action-985=985, href=#, title=Add New Transaction}}, source=HybridStateVertexImpl{id=30, name=state30}, target=HybridStateVertexImpl{id=48, name=state48}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(48), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(48);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 48");

			testSuiteHelper.addStateToReportBuilder(48);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(48)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(48)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(48)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[2]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=×, attributes={aria-hidden=true, aria-label=Dismiss, class=close, data-dismiss=modal, type=button}}, source=HybridStateVertexImpl{id=48, name=state48}, target=HybridStateVertexImpl{id=30, name=state30}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[2]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"), "JJFotHcb"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(51), "Event fired: ×");
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
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=4)
	public void method_BT28_path_41_46_56_57(){
		testSuiteHelper.newCurrentTestMethod("method_BT28_path_41_46_56_57", 4);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(30);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(30)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(30)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(30)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[2]/DIV[3]/MAIN[1]/DIV[1]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Transactions, attributes={href=, title=Transactions}}, source=HybridStateVertexImpl{id=30, name=state30}, target=HybridStateVertexImpl{id=42, name=state42}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(41), "Event fired: Transactions");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[2]/DIV[3]/NAV[1]/DIV[1]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={class=navbar-brand ember-view, href=/, id=ember749}}, source=HybridStateVertexImpl{id=42, name=state42}, target=HybridStateVertexImpl{id=28, name=state28}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(46), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(28);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 28");

			testSuiteHelper.addStateToReportBuilder(28);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(28)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(28)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(28)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[2]/DIV[1]/DIV[1]/UL[1]/LI[3]/A[1], element=Element{node=[A: null], tag=A, text=New Event, attributes={class=ember-view, href=/new, id=ember738}}, source=HybridStateVertexImpl{id=28, name=state28}, target=HybridStateVertexImpl{id=26, name=state26}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(56), "Event fired: New Event");
			testSuiteHelper.runInCrawlingPlugins(26);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 26");

			testSuiteHelper.addStateToReportBuilder(26);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(26)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(26)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(26)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=JAMoJeTu, attributes={class=ember-view, href=/-MkBB9oJUtZ5EEqw1exS, id=ember738}}, source=HybridStateVertexImpl{id=26, name=state26}, target=HybridStateVertexImpl{id=30, name=state30}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"), "VhGrljjI"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"), "vaxxYlOz"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"), "zLpFyOWD"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"), "Pound sterling (GBP)"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(57), "Event fired: JAMoJeTu");
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
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=5)
	public void method_BT28_path_41_46_62_63(){
		testSuiteHelper.newCurrentTestMethod("method_BT28_path_41_46_62_63", 5);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(30);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(30)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(30)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(30)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[2]/DIV[3]/MAIN[1]/DIV[1]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Transactions, attributes={href=, title=Transactions}}, source=HybridStateVertexImpl{id=30, name=state30}, target=HybridStateVertexImpl{id=42, name=state42}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(41), "Event fired: Transactions");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[2]/DIV[3]/NAV[1]/DIV[1]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={class=navbar-brand ember-view, href=/, id=ember749}}, source=HybridStateVertexImpl{id=42, name=state42}, target=HybridStateVertexImpl{id=28, name=state28}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(46), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(28);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 28");

			testSuiteHelper.addStateToReportBuilder(28);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(28)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(28)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(28)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[2]/DIV[3]/NAV[1]/DIV[1]/DIV[2]/UL[1]/LI[5]/A[1], element=Element{node=[A: null], tag=A, text=New Event, attributes={href=, title=Create New Event}}, source=HybridStateVertexImpl{id=28, name=state28}, target=HybridStateVertexImpl{id=63, name=state63}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(62), "Event fired: New Event");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[2]/DIV[1]/DIV[1]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=llylfXdd, attributes={class=ember-view, href=/-MkBB9oJUtZ5EEqw1exS, id=ember730}}, source=HybridStateVertexImpl{id=63, name=state63}, target=HybridStateVertexImpl{id=30, name=state30}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[2]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"), "zqRhioNu"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[2]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"), "YPAfoOEB"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[2]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"), "GpRJgpJZ"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[2]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"), "Croatian kuna (HRK)"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(63), "Event fired: llylfXdd");
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
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=6)
	public void method_BT35_path_29_34_67(){
		testSuiteHelper.newCurrentTestMethod("method_BT35_path_29_34_67", 6);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(30);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(30)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(30)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(30)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[2]/DIV[3]/MAIN[1]/DIV[1]/NAV[1]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={class=navbar-btn btn btn-link ember-view, href=/-MkBB9oJUtZ5EEqw1exS/edit, id=ember848, title=Edit Event}}, source=HybridStateVertexImpl{id=30, name=state30}, target=HybridStateVertexImpl{id=32, name=state32}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(29), "Event fired: ");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[2]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save, attributes={anyaccess=none, class=btn btn-success save-event, data-ember-action=, data-ember-action-871=871, type=submit}}, source=HybridStateVertexImpl{id=32, name=state32}, target=HybridStateVertexImpl{id=35, name=state35}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[2]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"), "llylfXdd"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[2]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"), "tTeeEeCM"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[2]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"), "lrTgfECd"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[2]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"), "Swiss franc (CHF)"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(34), "Event fired: Save");
			testSuiteHelper.runInCrawlingPlugins(35);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 35");

			testSuiteHelper.addStateToReportBuilder(35);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(35)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(35)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(35)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=×, attributes={class=close, data-ember-action=, data-ember-action-1266=1266}}, source=HybridStateVertexImpl{id=35, name=state35}, target=HybridStateVertexImpl{id=30, name=state30}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(67), "Event fired: ×");
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
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=7)
	public void method_BT48_path_48_68_71(){
		testSuiteHelper.newCurrentTestMethod("method_BT48_path_48_68_71", 7);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(30);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(30)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(30)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(30)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[2]/DIV[3]/MAIN[1]/DIV[1]/DIV[4]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={class=btn btn-primary btn-circle btn-add-transaction, data-ember-action=, data-ember-action-985=985, href=#, title=Add New Transaction}}, source=HybridStateVertexImpl{id=30, name=state30}, target=HybridStateVertexImpl{id=48, name=state48}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(48), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(48);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 48");

			testSuiteHelper.addStateToReportBuilder(48);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(48)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(48)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(48)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[2]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Add With Details, attributes={class=btn btn-default pull-left btn-add-with-details, data-dismiss=modal, data-ember-action=, data-ember-action-1120=1120, type=button}}, source=HybridStateVertexImpl{id=48, name=state48}, target=HybridStateVertexImpl{id=75, name=state75}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[2]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"), "nvgYQTCl"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(68), "Event fired: Add With Details");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[2]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save, attributes={class=btn btn-success save-transaction, data-ember-action=, data-ember-action-1394=1394, type=submit}}, source=HybridStateVertexImpl{id=75, name=state75}, target=HybridStateVertexImpl{id=76, name=state76}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[2]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/INPUT[1]"), "dKtThsQd"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[2]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/DIV[1]/INPUT[1]"), "4691"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[2]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[4]/DIV[1]/INPUT[1]"), "WKBbpbDN"));
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[2]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[5]/DIV[1]/LABEL[1]/INPUT[1]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[2]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[5]/DIV[1]/LABEL[2]/INPUT[1]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[2]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/SELECT[1]"), "Select payer..."));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(71), "Event fired: Save");
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
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=8)
	public void method_BT42_path_41_105_106(){
		testSuiteHelper.newCurrentTestMethod("method_BT42_path_41_105_106", 8);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(30);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(30)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(30)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(30)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[2]/DIV[3]/MAIN[1]/DIV[1]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Transactions, attributes={href=, title=Transactions}}, source=HybridStateVertexImpl{id=30, name=state30}, target=HybridStateVertexImpl{id=42, name=state42}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(41), "Event fired: Transactions");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[2]/DIV[3]/MAIN[1]/DIV[1]/NAV[1]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={class=navbar-btn btn btn-link ember-view, href=/-MkBB9oJUtZ5EEqw1exS/edit, id=ember1097, title=Edit Event}}, source=HybridStateVertexImpl{id=42, name=state42}, target=HybridStateVertexImpl{id=32, name=state32}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(105), "Event fired: ");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[2]/DIV[1]/HEADER[1]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={class=navbar-brand ember-view, href=/, id=ember741, title=SplittyPie Home Page}}, source=HybridStateVertexImpl{id=32, name=state32}, target=HybridStateVertexImpl{id=30, name=state30}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[2]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"), "qmBNqEXj"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[2]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"), "gjfTlbos"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[2]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"), "VHrqOVYn"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[2]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"), "Bulgarian lev (BGN)"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(106), "Event fired: ");
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
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=9)
	public void method_BT48_path_48_107(){
		testSuiteHelper.newCurrentTestMethod("method_BT48_path_48_107", 9);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(30);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(30)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(30)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(30)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[2]/DIV[3]/MAIN[1]/DIV[1]/DIV[4]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={class=btn btn-primary btn-circle btn-add-transaction, data-ember-action=, data-ember-action-985=985, href=#, title=Add New Transaction}}, source=HybridStateVertexImpl{id=30, name=state30}, target=HybridStateVertexImpl{id=48, name=state48}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(48), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(48);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 48");

			testSuiteHelper.addStateToReportBuilder(48);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(48)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(48)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(48)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[2]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Add, attributes={class=btn btn-primary btn-add, data-dismiss=modal, data-ember-action=, data-ember-action-1121=1121, disabled=, type=submit}}, source=HybridStateVertexImpl{id=48, name=state48}, target=HybridStateVertexImpl{id=95, name=state95}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[2]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"), "fUvdqjJm"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(107), "Event fired: Add");
			testSuiteHelper.runInCrawlingPlugins(95);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 95");

			testSuiteHelper.addStateToReportBuilder(95);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(95)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(95)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(95)
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
	public void method_BT35_path_29_34(){
		testSuiteHelper.newCurrentTestMethod("method_BT35_path_29_34", 10);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(30);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(30)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(30)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(30)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[2]/DIV[3]/MAIN[1]/DIV[1]/NAV[1]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={class=navbar-btn btn btn-link ember-view, href=/-MkBB9oJUtZ5EEqw1exS/edit, id=ember848, title=Edit Event}}, source=HybridStateVertexImpl{id=30, name=state30}, target=HybridStateVertexImpl{id=32, name=state32}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(29), "Event fired: ");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[2]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save, attributes={anyaccess=none, class=btn btn-success save-event, data-ember-action=, data-ember-action-871=871, type=submit}}, source=HybridStateVertexImpl{id=32, name=state32}, target=HybridStateVertexImpl{id=35, name=state35}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[2]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"), "llylfXdd"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[2]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"), "tTeeEeCM"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[2]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"), "lrTgfECd"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[2]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"), "Swiss franc (CHF)"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(34), "Event fired: Save");
			testSuiteHelper.runInCrawlingPlugins(35);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 35");

			testSuiteHelper.addStateToReportBuilder(35);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(35)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(35)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(35)
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
	public void method_BT42_path_41_110_112_113(){
		testSuiteHelper.newCurrentTestMethod("method_BT42_path_41_110_112_113", 11);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(30);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(30)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(30)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(30)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[2]/DIV[3]/MAIN[1]/DIV[1]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Transactions, attributes={href=, title=Transactions}}, source=HybridStateVertexImpl{id=30, name=state30}, target=HybridStateVertexImpl{id=42, name=state42}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(41), "Event fired: Transactions");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[2]/DIV[3]/MAIN[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Add New Event, attributes={anyaccess=none, class=ember-view, href=/new, id=ember1104}}, source=HybridStateVertexImpl{id=42, name=state42}, target=HybridStateVertexImpl{id=26, name=state26}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(110), "Event fired: Add New Event");
			testSuiteHelper.runInCrawlingPlugins(26);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 26");

			testSuiteHelper.addStateToReportBuilder(26);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(26)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(26)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(26)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[3]/NAV[1]/DIV[1]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={class=navbar-brand ember-view, href=/, id=ember764}}, source=HybridStateVertexImpl{id=26, name=state26}, target=HybridStateVertexImpl{id=104, name=state104}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"), "UXxsEYWR"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"), "GnIoivsT"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"), "yCmDxnNm"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"), "Czech koruna (CZK)"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(112), "Event fired: ");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[2]/SECTION[2]/DIV[1]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=llylfXdd, attributes={anyaccess=none, class=btn btn-default ember-view, href=/-MkBB9oJUtZ5EEqw1exS, id=ember942}}, source=HybridStateVertexImpl{id=104, name=state104}, target=HybridStateVertexImpl{id=30, name=state30}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(113), "Event fired: llylfXdd");
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
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=12)
	public void method_BT104_path_36_112_115_116(){
		testSuiteHelper.newCurrentTestMethod("method_BT104_path_36_112_115_116", 12);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(30);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(30)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(30)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(30)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[2]/DIV[3]/MAIN[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Add New Event, attributes={class=ember-view, href=/new, id=ember869}}, source=HybridStateVertexImpl{id=30, name=state30}, target=HybridStateVertexImpl{id=26, name=state26}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(36), "Event fired: Add New Event");
			testSuiteHelper.runInCrawlingPlugins(26);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 26");

			testSuiteHelper.addStateToReportBuilder(26);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(26)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(26)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(26)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[3]/NAV[1]/DIV[1]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={class=navbar-brand ember-view, href=/, id=ember764}}, source=HybridStateVertexImpl{id=26, name=state26}, target=HybridStateVertexImpl{id=104, name=state104}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"), "UXxsEYWR"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"), "GnIoivsT"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"), "yCmDxnNm"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"), "Czech koruna (CZK)"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(112), "Event fired: ");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[2]/SECTION[2]/DIV[1]/DIV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=, attributes={anyaccess=none, aria-label=Remove event reference locally, class=btn btn-default, data-ember-action=, data-ember-action-943=943, title=Remove reference from this computer. The event will still be reachable by url.}}, source=HybridStateVertexImpl{id=104, name=state104}, target=HybridStateVertexImpl{id=109, name=state109}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(115), "Event fired: ");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=llylfXdd, attributes={class=ember-view, href=/-MkBB9oJUtZ5EEqw1exS, id=ember738}}, source=HybridStateVertexImpl{id=109, name=state109}, target=HybridStateVertexImpl{id=30, name=state30}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(116), "Event fired: llylfXdd");
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
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=13)
	public void method_BT109_path_36_112_115_117_118(){
		testSuiteHelper.newCurrentTestMethod("method_BT109_path_36_112_115_117_118", 13);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(30);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(30)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(30)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(30)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[2]/DIV[3]/MAIN[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Add New Event, attributes={class=ember-view, href=/new, id=ember869}}, source=HybridStateVertexImpl{id=30, name=state30}, target=HybridStateVertexImpl{id=26, name=state26}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(36), "Event fired: Add New Event");
			testSuiteHelper.runInCrawlingPlugins(26);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 26");

			testSuiteHelper.addStateToReportBuilder(26);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(26)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(26)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(26)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[3]/NAV[1]/DIV[1]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={class=navbar-brand ember-view, href=/, id=ember764}}, source=HybridStateVertexImpl{id=26, name=state26}, target=HybridStateVertexImpl{id=104, name=state104}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"), "UXxsEYWR"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"), "GnIoivsT"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"), "yCmDxnNm"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"), "Czech koruna (CZK)"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(112), "Event fired: ");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[2]/SECTION[2]/DIV[1]/DIV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=, attributes={anyaccess=none, aria-label=Remove event reference locally, class=btn btn-default, data-ember-action=, data-ember-action-943=943, title=Remove reference from this computer. The event will still be reachable by url.}}, source=HybridStateVertexImpl{id=104, name=state104}, target=HybridStateVertexImpl{id=109, name=state109}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(115), "Event fired: ");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[4]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=×, attributes={aria-hidden=true, aria-label=Dismiss, class=close, data-dismiss=modal, type=button}}, source=HybridStateVertexImpl{id=109, name=state109}, target=HybridStateVertexImpl{id=104, name=state104}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(117), "Event fired: ×");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/HEADER[1]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={class=navbar-brand active ember-view, href=/, id=ember722, title=SplittyPie Home Page}}, source=HybridStateVertexImpl{id=104, name=state104}, target=HybridStateVertexImpl{id=30, name=state30}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(118), "Event fired: ");
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
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=14)
	public void method_BT109_path_36_112_115_119_120(){
		testSuiteHelper.newCurrentTestMethod("method_BT109_path_36_112_115_119_120", 14);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(30);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(30)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(30)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(30)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[2]/DIV[3]/MAIN[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Add New Event, attributes={class=ember-view, href=/new, id=ember869}}, source=HybridStateVertexImpl{id=30, name=state30}, target=HybridStateVertexImpl{id=26, name=state26}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(36), "Event fired: Add New Event");
			testSuiteHelper.runInCrawlingPlugins(26);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 26");

			testSuiteHelper.addStateToReportBuilder(26);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(26)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(26)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(26)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[3]/NAV[1]/DIV[1]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={class=navbar-brand ember-view, href=/, id=ember764}}, source=HybridStateVertexImpl{id=26, name=state26}, target=HybridStateVertexImpl{id=104, name=state104}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"), "UXxsEYWR"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"), "GnIoivsT"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"), "yCmDxnNm"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"), "Czech koruna (CZK)"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(112), "Event fired: ");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[2]/SECTION[2]/DIV[1]/DIV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=, attributes={anyaccess=none, aria-label=Remove event reference locally, class=btn btn-default, data-ember-action=, data-ember-action-943=943, title=Remove reference from this computer. The event will still be reachable by url.}}, source=HybridStateVertexImpl{id=104, name=state104}, target=HybridStateVertexImpl{id=109, name=state109}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(115), "Event fired: ");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[4]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Yes, don't show this message again, attributes={class=btn btn-primary, data-ember-action=, data-ember-action-961=961, type=button}}, source=HybridStateVertexImpl{id=109, name=state109}, target=HybridStateVertexImpl{id=121, name=state121}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(119), "Event fired: Yes, don't show this message again");
			testSuiteHelper.runInCrawlingPlugins(121);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 121");

			testSuiteHelper.addStateToReportBuilder(121);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(121)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(121)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(121)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/HEADER[1]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={class=navbar-brand active ember-view, href=/, id=ember722, title=SplittyPie Home Page}}, source=HybridStateVertexImpl{id=121, name=state121}, target=HybridStateVertexImpl{id=1, name=state1}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(120), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(1);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 1");

			testSuiteHelper.addStateToReportBuilder(1);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(1)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(1)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(1)
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
	public void method_BT109_failed_path_4_1000025(){
		testSuiteHelper.newCurrentTestMethod("method_BT109_failed_path_4_1000025", 15);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(1);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(1)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(1)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(1)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[3]/NAV[1]/DIV[1]/DIV[2]/UL[1]/LI[4]/A[1], element=Element{node=[A: null], tag=A, text=New Event, attributes={anyaccess=none, href=, title=Create New Event}}, source=HybridStateVertexImpl{id=1, name=state1}, target=HybridStateVertexImpl{id=6, name=state6}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(4), "Event fired: New Event");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save, attributes={class=btn btn-success save-event, data-ember-action=, data-ember-action-876=876, type=submit}}, source=HybridStateVertexImpl{id=6, name=state6}, target=HybridStateVertexImpl{id=125, name=state125}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"), "JAMoJeTu"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"), "vOxhyyUD"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"), "OYBhqmBO"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"), "Euro (EUR)"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(1000025), "Event fired: Save");
			testSuiteHelper.runInCrawlingPlugins(125);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 125");

			testSuiteHelper.addStateToReportBuilder(125);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(125)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(125)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(125)
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
	public void method_BT109_failed_path_36_112_1000029(){
		testSuiteHelper.newCurrentTestMethod("method_BT109_failed_path_36_112_1000029", 16);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(30);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(30)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(30)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(30)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[2]/DIV[3]/MAIN[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Add New Event, attributes={class=ember-view, href=/new, id=ember869}}, source=HybridStateVertexImpl{id=30, name=state30}, target=HybridStateVertexImpl{id=26, name=state26}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(36), "Event fired: Add New Event");
			testSuiteHelper.runInCrawlingPlugins(26);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 26");

			testSuiteHelper.addStateToReportBuilder(26);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(26)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(26)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(26)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[3]/NAV[1]/DIV[1]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={class=navbar-brand ember-view, href=/, id=ember764}}, source=HybridStateVertexImpl{id=26, name=state26}, target=HybridStateVertexImpl{id=104, name=state104}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"), "UXxsEYWR"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"), "GnIoivsT"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"), "yCmDxnNm"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"), "Czech koruna (CZK)"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(112), "Event fired: ");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[2]/SECTION[2]/DIV[1]/DIV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=, attributes={anyaccess=none, aria-label=Remove event reference locally, class=btn btn-default, data-ember-action=, data-ember-action-943=943, title=Remove reference from this computer. The event will still be reachable by url.}}, source=HybridStateVertexImpl{id=104, name=state104}, target=HybridStateVertexImpl{id=121, name=state121}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1000029), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(121);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 121");

			testSuiteHelper.addStateToReportBuilder(121);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(121)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(121)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(121)
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
	public void method_BT104_failed_path_1000030(){
		testSuiteHelper.newCurrentTestMethod("method_BT104_failed_path_1000030", 17);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(1);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(1)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(1)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(1)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[2]/DIV[3]/MAIN[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Add New Event, attributes={class=ember-view, href=/new, id=ember869}}, source=HybridStateVertexImpl{id=1, name=state1}, target=HybridStateVertexImpl{id=6, name=state6}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1000030), "Event fired: Add New Event");
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
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=18)
	public void method_BT33_failed_path_1000034(){
		testSuiteHelper.newCurrentTestMethod("method_BT33_failed_path_1000034", 18);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(1);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(1)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(1)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(1)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[2]/DIV[3]/MAIN[1]/DIV[1]/NAV[1]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={class=navbar-btn btn btn-link ember-view, href=/-MkBB9oJUtZ5EEqw1exS/edit, id=ember848, title=Edit Event}}, source=HybridStateVertexImpl{id=1, name=state1}, target=HybridStateVertexImpl{id=142, name=state142}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1000034), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(142);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 142");

			testSuiteHelper.addStateToReportBuilder(142);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(142)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(142)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(142)
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
	public void method_BT142_path_1000034_121(){
		testSuiteHelper.newCurrentTestMethod("method_BT142_path_1000034_121", 19);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(1);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(1)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(1)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(1)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[2]/DIV[3]/MAIN[1]/DIV[1]/NAV[1]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={class=navbar-btn btn btn-link ember-view, href=/-MkBB9oJUtZ5EEqw1exS/edit, id=ember848, title=Edit Event}}, source=HybridStateVertexImpl{id=1, name=state1}, target=HybridStateVertexImpl{id=142, name=state142}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1000034), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(142);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 142");

			testSuiteHelper.addStateToReportBuilder(142);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(142)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(142)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(142)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[2]/DIV[1]/HEADER[1]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={class=navbar-brand ember-view, href=/, id=ember726, title=SplittyPie Home Page}}, source=HybridStateVertexImpl{id=142, name=state142}, target=HybridStateVertexImpl{id=1, name=state1}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(121), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(1);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 1");

			testSuiteHelper.addStateToReportBuilder(1);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(1)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(1)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(1)
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
	public void method_BT142_path_1000034_122(){
		testSuiteHelper.newCurrentTestMethod("method_BT142_path_1000034_122", 20);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(1);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(1)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(1)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(1)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[2]/DIV[3]/MAIN[1]/DIV[1]/NAV[1]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={class=navbar-btn btn btn-link ember-view, href=/-MkBB9oJUtZ5EEqw1exS/edit, id=ember848, title=Edit Event}}, source=HybridStateVertexImpl{id=1, name=state1}, target=HybridStateVertexImpl{id=142, name=state142}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1000034), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(142);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 142");

			testSuiteHelper.addStateToReportBuilder(142);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(142)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(142)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(142)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[2]/DIV[1]/DIV[1]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=New Event, attributes={class=ember-view, href=/new, id=ember741}}, source=HybridStateVertexImpl{id=142, name=state142}, target=HybridStateVertexImpl{id=6, name=state6}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(122), "Event fired: New Event");
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
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=21)
	public void method_BT142_path_1000034_123_124(){
		testSuiteHelper.newCurrentTestMethod("method_BT142_path_1000034_123_124", 21);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(1);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(1)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(1)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(1)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[2]/DIV[3]/MAIN[1]/DIV[1]/NAV[1]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={class=navbar-btn btn btn-link ember-view, href=/-MkBB9oJUtZ5EEqw1exS/edit, id=ember848, title=Edit Event}}, source=HybridStateVertexImpl{id=1, name=state1}, target=HybridStateVertexImpl{id=142, name=state142}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1000034), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(142);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 142");

			testSuiteHelper.addStateToReportBuilder(142);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(142)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(142)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(142)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[2]/DIV[3]/NAV[1]/DIV[1]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={class=navbar-brand ember-view, href=/, id=ember759}}, source=HybridStateVertexImpl{id=142, name=state142}, target=HybridStateVertexImpl{id=153, name=state153}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(123), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(153);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 153");

			testSuiteHelper.addStateToReportBuilder(153);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(153)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(153)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(153)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[2]/DIV[1]/HEADER[1]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={class=navbar-brand active ember-view, href=/, id=ember726, title=SplittyPie Home Page}}, source=HybridStateVertexImpl{id=153, name=state153}, target=HybridStateVertexImpl{id=1, name=state1}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(124), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(1);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 1");

			testSuiteHelper.addStateToReportBuilder(1);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(1)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(1)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(1)
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
	public void method_BT142_path_1000034_125_126(){
		testSuiteHelper.newCurrentTestMethod("method_BT142_path_1000034_125_126", 22);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(1);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(1)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(1)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(1)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[2]/DIV[3]/MAIN[1]/DIV[1]/NAV[1]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={class=navbar-btn btn btn-link ember-view, href=/-MkBB9oJUtZ5EEqw1exS/edit, id=ember848, title=Edit Event}}, source=HybridStateVertexImpl{id=1, name=state1}, target=HybridStateVertexImpl{id=142, name=state142}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1000034), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(142);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 142");

			testSuiteHelper.addStateToReportBuilder(142);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(142)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(142)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(142)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[2]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/P[1]/A[1], element=Element{node=[A: null], tag=A, text=Home page, attributes={class=ember-view, href=/, id=ember761}}, source=HybridStateVertexImpl{id=142, name=state142}, target=HybridStateVertexImpl{id=153, name=state153}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(125), "Event fired: Home page");
			testSuiteHelper.runInCrawlingPlugins(153);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 153");

			testSuiteHelper.addStateToReportBuilder(153);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(153)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(153)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(153)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[2]/DIV[1]/DIV[1]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=New Event, attributes={class=ember-view, href=/new, id=ember741}}, source=HybridStateVertexImpl{id=153, name=state153}, target=HybridStateVertexImpl{id=6, name=state6}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(126), "Event fired: New Event");
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
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=23)
	public void method_BT23_failed_path_1000030_1000041(){
		testSuiteHelper.newCurrentTestMethod("method_BT23_failed_path_1000030_1000041", 23);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(1);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(1)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(1)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(1)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[2]/DIV[3]/MAIN[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Add New Event, attributes={class=ember-view, href=/new, id=ember869}}, source=HybridStateVertexImpl{id=1, name=state1}, target=HybridStateVertexImpl{id=6, name=state6}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1000030), "Event fired: Add New Event");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Cancel, attributes={class=btn btn-link ember-view, id=ember877}}, source=HybridStateVertexImpl{id=6, name=state6}, target=HybridStateVertexImpl{id=1, name=state1}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"), "IYojzFpY"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"), "Vurbqnqx"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"), "ICCxMyJx"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"), "Euro (EUR)"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(1000041), "Event fired: Cancel");
			testSuiteHelper.runInCrawlingPlugins(1);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 1");

			testSuiteHelper.addStateToReportBuilder(1);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(1)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(1)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(1)
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
	public void method_BT32_failed_path_1000034(){
		testSuiteHelper.newCurrentTestMethod("method_BT32_failed_path_1000034", 24);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(1);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(1)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(1)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(1)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[2]/DIV[3]/MAIN[1]/DIV[1]/NAV[1]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={class=navbar-btn btn btn-link ember-view, href=/-MkBB9oJUtZ5EEqw1exS/edit, id=ember848, title=Edit Event}}, source=HybridStateVertexImpl{id=1, name=state1}, target=HybridStateVertexImpl{id=142, name=state142}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1000034), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(142);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 142");

			testSuiteHelper.addStateToReportBuilder(142);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(142)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(142)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(142)
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
	public void method_BT125_path_4_1000025_127_128_129(){
		testSuiteHelper.newCurrentTestMethod("method_BT125_path_4_1000025_127_128_129", 25);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(1);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(1)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(1)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(1)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[3]/NAV[1]/DIV[1]/DIV[2]/UL[1]/LI[4]/A[1], element=Element{node=[A: null], tag=A, text=New Event, attributes={anyaccess=none, href=, title=Create New Event}}, source=HybridStateVertexImpl{id=1, name=state1}, target=HybridStateVertexImpl{id=6, name=state6}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(4), "Event fired: New Event");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save, attributes={class=btn btn-success save-event, data-ember-action=, data-ember-action-876=876, type=submit}}, source=HybridStateVertexImpl{id=6, name=state6}, target=HybridStateVertexImpl{id=125, name=state125}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"), "JAMoJeTu"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"), "vOxhyyUD"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"), "OYBhqmBO"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"), "Euro (EUR)"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(1000025), "Event fired: Save");
			testSuiteHelper.runInCrawlingPlugins(125);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 125");

			testSuiteHelper.addStateToReportBuilder(125);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(125)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(125)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(125)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[3]/NAV[1]/DIV[1]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={anyaccess=none, class=navbar-brand ember-view, href=/, id=ember716}}, source=HybridStateVertexImpl{id=125, name=state125}, target=HybridStateVertexImpl{id=104, name=state104}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(127), "Event fired: ");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=llylfXdd, attributes={class=ember-view, href=/-MkBB9oJUtZ5EEqw1exS, id=ember738}}, source=HybridStateVertexImpl{id=104, name=state104}, target=HybridStateVertexImpl{id=170, name=state170}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(128), "Event fired: llylfXdd");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/NAV[1]/DIV[1]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={class=navbar-brand, href=/, title=SplittyPie Home}}, source=HybridStateVertexImpl{id=170, name=state170}, target=HybridStateVertexImpl{id=30, name=state30}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(129), "Event fired: ");
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
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=26)
	public void method_BT170_path_36_112_128(){
		testSuiteHelper.newCurrentTestMethod("method_BT170_path_36_112_128", 26);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(30);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(30)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(30)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(30)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[2]/DIV[3]/MAIN[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Add New Event, attributes={class=ember-view, href=/new, id=ember869}}, source=HybridStateVertexImpl{id=30, name=state30}, target=HybridStateVertexImpl{id=26, name=state26}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(36), "Event fired: Add New Event");
			testSuiteHelper.runInCrawlingPlugins(26);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 26");

			testSuiteHelper.addStateToReportBuilder(26);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(26)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(26)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(26)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[3]/NAV[1]/DIV[1]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={class=navbar-brand ember-view, href=/, id=ember764}}, source=HybridStateVertexImpl{id=26, name=state26}, target=HybridStateVertexImpl{id=104, name=state104}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"), "UXxsEYWR"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"), "GnIoivsT"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"), "yCmDxnNm"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"), "Czech koruna (CZK)"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(112), "Event fired: ");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=llylfXdd, attributes={class=ember-view, href=/-MkBB9oJUtZ5EEqw1exS, id=ember738}}, source=HybridStateVertexImpl{id=104, name=state104}, target=HybridStateVertexImpl{id=170, name=state170}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(128), "Event fired: llylfXdd");
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

	@Test(priority=27)
	public void method_BT104_path_36_112_135(){
		testSuiteHelper.newCurrentTestMethod("method_BT104_path_36_112_135", 27);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(30);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(30)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(30)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(30)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[2]/DIV[3]/MAIN[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Add New Event, attributes={class=ember-view, href=/new, id=ember869}}, source=HybridStateVertexImpl{id=30, name=state30}, target=HybridStateVertexImpl{id=26, name=state26}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(36), "Event fired: Add New Event");
			testSuiteHelper.runInCrawlingPlugins(26);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 26");

			testSuiteHelper.addStateToReportBuilder(26);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(26)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(26)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(26)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[3]/NAV[1]/DIV[1]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={class=navbar-brand ember-view, href=/, id=ember764}}, source=HybridStateVertexImpl{id=26, name=state26}, target=HybridStateVertexImpl{id=104, name=state104}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"), "UXxsEYWR"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"), "GnIoivsT"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"), "yCmDxnNm"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"), "Czech koruna (CZK)"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(112), "Event fired: ");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/UL[1]/LI[3]/A[1], element=Element{node=[A: null], tag=A, text=New Event, attributes={class=ember-view, href=/new, id=ember756}}, source=HybridStateVertexImpl{id=104, name=state104}, target=HybridStateVertexImpl{id=26, name=state26}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(135), "Event fired: New Event");
			testSuiteHelper.runInCrawlingPlugins(26);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 26");

			testSuiteHelper.addStateToReportBuilder(26);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(26)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(26)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(26)
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
	public void method_BT125_path_36_112_1000029_120_4_1000025_136(){
		testSuiteHelper.newCurrentTestMethod("method_BT125_path_36_112_1000029_120_4_1000025_136", 28);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(30);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(30)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(30)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(30)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[2]/DIV[3]/MAIN[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Add New Event, attributes={class=ember-view, href=/new, id=ember869}}, source=HybridStateVertexImpl{id=30, name=state30}, target=HybridStateVertexImpl{id=26, name=state26}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(36), "Event fired: Add New Event");
			testSuiteHelper.runInCrawlingPlugins(26);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 26");

			testSuiteHelper.addStateToReportBuilder(26);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(26)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(26)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(26)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[3]/NAV[1]/DIV[1]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={class=navbar-brand ember-view, href=/, id=ember764}}, source=HybridStateVertexImpl{id=26, name=state26}, target=HybridStateVertexImpl{id=104, name=state104}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"), "UXxsEYWR"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"), "GnIoivsT"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"), "yCmDxnNm"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"), "Czech koruna (CZK)"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(112), "Event fired: ");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[2]/SECTION[2]/DIV[1]/DIV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=, attributes={anyaccess=none, aria-label=Remove event reference locally, class=btn btn-default, data-ember-action=, data-ember-action-943=943, title=Remove reference from this computer. The event will still be reachable by url.}}, source=HybridStateVertexImpl{id=104, name=state104}, target=HybridStateVertexImpl{id=121, name=state121}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1000029), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(121);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 121");

			testSuiteHelper.addStateToReportBuilder(121);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(121)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(121)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(121)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/HEADER[1]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={class=navbar-brand active ember-view, href=/, id=ember722, title=SplittyPie Home Page}}, source=HybridStateVertexImpl{id=121, name=state121}, target=HybridStateVertexImpl{id=1, name=state1}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(120), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(1);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 1");

			testSuiteHelper.addStateToReportBuilder(1);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(1)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(1)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(1)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[3]/NAV[1]/DIV[1]/DIV[2]/UL[1]/LI[4]/A[1], element=Element{node=[A: null], tag=A, text=New Event, attributes={anyaccess=none, href=, title=Create New Event}}, source=HybridStateVertexImpl{id=1, name=state1}, target=HybridStateVertexImpl{id=6, name=state6}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(4), "Event fired: New Event");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save, attributes={class=btn btn-success save-event, data-ember-action=, data-ember-action-876=876, type=submit}}, source=HybridStateVertexImpl{id=6, name=state6}, target=HybridStateVertexImpl{id=125, name=state125}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"), "JAMoJeTu"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"), "vOxhyyUD"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"), "OYBhqmBO"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"), "Euro (EUR)"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(1000025), "Event fired: Save");
			testSuiteHelper.runInCrawlingPlugins(125);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 125");

			testSuiteHelper.addStateToReportBuilder(125);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(125)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(125)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(125)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/HEADER[1]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={class=navbar-brand ember-view, href=/, id=ember691, title=SplittyPie Home Page}}, source=HybridStateVertexImpl{id=125, name=state125}, target=HybridStateVertexImpl{id=30, name=state30}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(136), "Event fired: ");
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
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=29)
	public void method_BT125_path_36_112_1000029_120_4_1000025_137(){
		testSuiteHelper.newCurrentTestMethod("method_BT125_path_36_112_1000029_120_4_1000025_137", 29);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(30);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(30)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(30)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(30)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[2]/DIV[3]/MAIN[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Add New Event, attributes={class=ember-view, href=/new, id=ember869}}, source=HybridStateVertexImpl{id=30, name=state30}, target=HybridStateVertexImpl{id=26, name=state26}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(36), "Event fired: Add New Event");
			testSuiteHelper.runInCrawlingPlugins(26);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 26");

			testSuiteHelper.addStateToReportBuilder(26);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(26)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(26)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(26)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[3]/NAV[1]/DIV[1]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={class=navbar-brand ember-view, href=/, id=ember764}}, source=HybridStateVertexImpl{id=26, name=state26}, target=HybridStateVertexImpl{id=104, name=state104}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"), "UXxsEYWR"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"), "GnIoivsT"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"), "yCmDxnNm"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"), "Czech koruna (CZK)"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(112), "Event fired: ");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[2]/SECTION[2]/DIV[1]/DIV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=, attributes={anyaccess=none, aria-label=Remove event reference locally, class=btn btn-default, data-ember-action=, data-ember-action-943=943, title=Remove reference from this computer. The event will still be reachable by url.}}, source=HybridStateVertexImpl{id=104, name=state104}, target=HybridStateVertexImpl{id=121, name=state121}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1000029), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(121);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 121");

			testSuiteHelper.addStateToReportBuilder(121);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(121)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(121)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(121)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/HEADER[1]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={class=navbar-brand active ember-view, href=/, id=ember722, title=SplittyPie Home Page}}, source=HybridStateVertexImpl{id=121, name=state121}, target=HybridStateVertexImpl{id=1, name=state1}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(120), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(1);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 1");

			testSuiteHelper.addStateToReportBuilder(1);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(1)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(1)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(1)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[3]/NAV[1]/DIV[1]/DIV[2]/UL[1]/LI[4]/A[1], element=Element{node=[A: null], tag=A, text=New Event, attributes={anyaccess=none, href=, title=Create New Event}}, source=HybridStateVertexImpl{id=1, name=state1}, target=HybridStateVertexImpl{id=6, name=state6}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(4), "Event fired: New Event");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save, attributes={class=btn btn-success save-event, data-ember-action=, data-ember-action-876=876, type=submit}}, source=HybridStateVertexImpl{id=6, name=state6}, target=HybridStateVertexImpl{id=125, name=state125}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"), "JAMoJeTu"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"), "vOxhyyUD"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"), "OYBhqmBO"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"), "Euro (EUR)"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(1000025), "Event fired: Save");
			testSuiteHelper.runInCrawlingPlugins(125);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 125");

			testSuiteHelper.addStateToReportBuilder(125);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(125)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(125)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(125)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=JAMoJeTu, attributes={class=active ember-view, href=/-MkBCSZ8ER2sAWDPJduB, id=ember1086}}, source=HybridStateVertexImpl{id=125, name=state125}, target=HybridStateVertexImpl{id=170, name=state170}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(137), "Event fired: JAMoJeTu");
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

	@Test(priority=30)
	public void method_BT125_path_36_112_1000029_120_4_1000025_138(){
		testSuiteHelper.newCurrentTestMethod("method_BT125_path_36_112_1000029_120_4_1000025_138", 30);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(30);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(30)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(30)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(30)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[2]/DIV[3]/MAIN[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Add New Event, attributes={class=ember-view, href=/new, id=ember869}}, source=HybridStateVertexImpl{id=30, name=state30}, target=HybridStateVertexImpl{id=26, name=state26}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(36), "Event fired: Add New Event");
			testSuiteHelper.runInCrawlingPlugins(26);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 26");

			testSuiteHelper.addStateToReportBuilder(26);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(26)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(26)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(26)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[3]/NAV[1]/DIV[1]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={class=navbar-brand ember-view, href=/, id=ember764}}, source=HybridStateVertexImpl{id=26, name=state26}, target=HybridStateVertexImpl{id=104, name=state104}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"), "UXxsEYWR"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"), "GnIoivsT"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"), "yCmDxnNm"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"), "Czech koruna (CZK)"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(112), "Event fired: ");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[2]/SECTION[2]/DIV[1]/DIV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=, attributes={anyaccess=none, aria-label=Remove event reference locally, class=btn btn-default, data-ember-action=, data-ember-action-943=943, title=Remove reference from this computer. The event will still be reachable by url.}}, source=HybridStateVertexImpl{id=104, name=state104}, target=HybridStateVertexImpl{id=121, name=state121}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1000029), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(121);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 121");

			testSuiteHelper.addStateToReportBuilder(121);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(121)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(121)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(121)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/HEADER[1]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={class=navbar-brand active ember-view, href=/, id=ember722, title=SplittyPie Home Page}}, source=HybridStateVertexImpl{id=121, name=state121}, target=HybridStateVertexImpl{id=1, name=state1}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(120), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(1);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 1");

			testSuiteHelper.addStateToReportBuilder(1);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(1)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(1)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(1)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[3]/NAV[1]/DIV[1]/DIV[2]/UL[1]/LI[4]/A[1], element=Element{node=[A: null], tag=A, text=New Event, attributes={anyaccess=none, href=, title=Create New Event}}, source=HybridStateVertexImpl{id=1, name=state1}, target=HybridStateVertexImpl{id=6, name=state6}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(4), "Event fired: New Event");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save, attributes={class=btn btn-success save-event, data-ember-action=, data-ember-action-876=876, type=submit}}, source=HybridStateVertexImpl{id=6, name=state6}, target=HybridStateVertexImpl{id=125, name=state125}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"), "JAMoJeTu"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"), "vOxhyyUD"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"), "OYBhqmBO"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"), "Euro (EUR)"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(1000025), "Event fired: Save");
			testSuiteHelper.runInCrawlingPlugins(125);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 125");

			testSuiteHelper.addStateToReportBuilder(125);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(125)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(125)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(125)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/UL[1]/LI[3]/A[1], element=Element{node=[A: null], tag=A, text=New Event, attributes={class=ember-view, href=/new, id=ember698}}, source=HybridStateVertexImpl{id=125, name=state125}, target=HybridStateVertexImpl{id=26, name=state26}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(138), "Event fired: New Event");
			testSuiteHelper.runInCrawlingPlugins(26);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 26");

			testSuiteHelper.addStateToReportBuilder(26);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(26)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(26)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(26)
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
	public void method_BT63_path_41_46_62_139(){
		testSuiteHelper.newCurrentTestMethod("method_BT63_path_41_46_62_139", 31);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(30);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(30)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(30)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(30)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[2]/DIV[3]/MAIN[1]/DIV[1]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Transactions, attributes={href=, title=Transactions}}, source=HybridStateVertexImpl{id=30, name=state30}, target=HybridStateVertexImpl{id=42, name=state42}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(41), "Event fired: Transactions");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[2]/DIV[3]/NAV[1]/DIV[1]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={class=navbar-brand ember-view, href=/, id=ember749}}, source=HybridStateVertexImpl{id=42, name=state42}, target=HybridStateVertexImpl{id=28, name=state28}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(46), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(28);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 28");

			testSuiteHelper.addStateToReportBuilder(28);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(28)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(28)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(28)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[2]/DIV[3]/NAV[1]/DIV[1]/DIV[2]/UL[1]/LI[5]/A[1], element=Element{node=[A: null], tag=A, text=New Event, attributes={href=, title=Create New Event}}, source=HybridStateVertexImpl{id=28, name=state28}, target=HybridStateVertexImpl{id=63, name=state63}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(62), "Event fired: New Event");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[2]/DIV[1]/DIV[1]/UL[1]/LI[3]/A[1], element=Element{node=[A: null], tag=A, text=New Event, attributes={class=active ember-view, href=/new, id=ember731}}, source=HybridStateVertexImpl{id=63, name=state63}, target=HybridStateVertexImpl{id=26, name=state26}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[2]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"), "DDXcKwUr"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[2]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"), "CbQibufR"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[2]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"), "CFgxXuKd"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[2]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"), "Polish złoty (PLN)"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(139), "Event fired: New Event");
			testSuiteHelper.runInCrawlingPlugins(26);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 26");

			testSuiteHelper.addStateToReportBuilder(26);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(26)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(26)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(26)
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
	public void method_BT42_path_41_140_142(){
		testSuiteHelper.newCurrentTestMethod("method_BT42_path_41_140_142", 32);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(30);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(30)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(30)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(30)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[2]/DIV[3]/MAIN[1]/DIV[1]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Transactions, attributes={href=, title=Transactions}}, source=HybridStateVertexImpl{id=30, name=state30}, target=HybridStateVertexImpl{id=42, name=state42}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(41), "Event fired: Transactions");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[2]/DIV[3]/MAIN[1]/DIV[1]/DIV[4]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={class=btn btn-primary btn-circle btn-add-transaction, data-ember-action=, data-ember-action-1124=1124, href=#, title=Add New Transaction}}, source=HybridStateVertexImpl{id=42, name=state42}, target=HybridStateVertexImpl{id=215, name=state215}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(140), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(215);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 215");

			testSuiteHelper.addStateToReportBuilder(215);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(215)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(215)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(215)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[2]/DIV[1]/DIV[1]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=JAMoJeTu, attributes={class=active ember-view, href=/-MkBD60aXheGZhwD3FMl, id=ember730}}, source=HybridStateVertexImpl{id=215, name=state215}, target=HybridStateVertexImpl{id=30, name=state30}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[2]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"), "PHVATcZj"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(142), "Event fired: JAMoJeTu");
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
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=33)
	public void method_BT215_path_41_140_143_144_147(){
		testSuiteHelper.newCurrentTestMethod("method_BT215_path_41_140_143_144_147", 33);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(30);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(30)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(30)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(30)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[2]/DIV[3]/MAIN[1]/DIV[1]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Transactions, attributes={href=, title=Transactions}}, source=HybridStateVertexImpl{id=30, name=state30}, target=HybridStateVertexImpl{id=42, name=state42}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(41), "Event fired: Transactions");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[2]/DIV[3]/MAIN[1]/DIV[1]/DIV[4]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={class=btn btn-primary btn-circle btn-add-transaction, data-ember-action=, data-ember-action-1124=1124, href=#, title=Add New Transaction}}, source=HybridStateVertexImpl{id=42, name=state42}, target=HybridStateVertexImpl{id=215, name=state215}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(140), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(215);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 215");

			testSuiteHelper.addStateToReportBuilder(215);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(215)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(215)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(215)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[2]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Add With Details, attributes={anyaccess=action, class=btn btn-default pull-left btn-add-with-details, data-dismiss=modal, data-ember-action=, data-ember-action-1173=1173, type=button}}, source=HybridStateVertexImpl{id=215, name=state215}, target=HybridStateVertexImpl{id=75, name=state75}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[2]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"), "maDQQtIA"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(143), "Event fired: Add With Details");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[2]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Cancel, attributes={class=btn btn-link ember-view, id=ember1395}}, source=HybridStateVertexImpl{id=75, name=state75}, target=HybridStateVertexImpl{id=42, name=state42}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[2]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/INPUT[1]"), "QjhYaAYn"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[2]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/DIV[1]/INPUT[1]"), "1336"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[2]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[4]/DIV[1]/INPUT[1]"), "lqprNzkq"));
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[2]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[5]/DIV[1]/LABEL[1]/INPUT[1]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[2]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[5]/DIV[1]/LABEL[2]/INPUT[1]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[2]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/SELECT[1]"), "vOxhyyUD"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(144), "Event fired: Cancel");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[2]/DIV[1]/HEADER[1]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={class=navbar-brand ember-view, href=/, id=ember715, title=SplittyPie Home Page}}, source=HybridStateVertexImpl{id=42, name=state42}, target=HybridStateVertexImpl{id=30, name=state30}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(147), "Event fired: ");
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
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=34)
	public void method_BT215_path_41_140_148(){
		testSuiteHelper.newCurrentTestMethod("method_BT215_path_41_140_148", 34);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(30);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(30)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(30)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(30)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[2]/DIV[3]/MAIN[1]/DIV[1]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Transactions, attributes={href=, title=Transactions}}, source=HybridStateVertexImpl{id=30, name=state30}, target=HybridStateVertexImpl{id=42, name=state42}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(41), "Event fired: Transactions");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[2]/DIV[3]/MAIN[1]/DIV[1]/DIV[4]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={class=btn btn-primary btn-circle btn-add-transaction, data-ember-action=, data-ember-action-1124=1124, href=#, title=Add New Transaction}}, source=HybridStateVertexImpl{id=42, name=state42}, target=HybridStateVertexImpl{id=215, name=state215}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(140), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(215);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 215");

			testSuiteHelper.addStateToReportBuilder(215);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(215)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(215)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(215)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[2]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Add, attributes={anyaccess=action, class=btn btn-primary btn-add, data-dismiss=modal, data-ember-action=, data-ember-action-1174=1174, disabled=, type=submit}}, source=HybridStateVertexImpl{id=215, name=state215}, target=HybridStateVertexImpl{id=226, name=state226}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[2]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"), "WqQNroQL"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(148), "Event fired: Add");
			testSuiteHelper.runInCrawlingPlugins(226);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 226");

			testSuiteHelper.addStateToReportBuilder(226);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(226)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(226)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(226)
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
	public void method_BT42_path_41_149(){
		testSuiteHelper.newCurrentTestMethod("method_BT42_path_41_149", 35);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(30);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(30)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(30)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(30)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[2]/DIV[3]/MAIN[1]/DIV[1]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Transactions, attributes={href=, title=Transactions}}, source=HybridStateVertexImpl{id=30, name=state30}, target=HybridStateVertexImpl{id=42, name=state42}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(41), "Event fired: Transactions");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[2]/DIV[1]/DIV[1]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=llylfXdd, attributes={class=active ember-view, href=/-MkBB9oJUtZ5EEqw1exS, id=ember730}}, source=HybridStateVertexImpl{id=42, name=state42}, target=HybridStateVertexImpl{id=170, name=state170}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(149), "Event fired: llylfXdd");
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

	@Test(priority=36)
	public void method_BT42_path_41_150(){
		testSuiteHelper.newCurrentTestMethod("method_BT42_path_41_150", 36);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(30);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(30)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(30)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(30)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[2]/DIV[3]/MAIN[1]/DIV[1]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Transactions, attributes={href=, title=Transactions}}, source=HybridStateVertexImpl{id=30, name=state30}, target=HybridStateVertexImpl{id=42, name=state42}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(41), "Event fired: Transactions");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[2]/DIV[1]/DIV[1]/UL[1]/LI[3]/A[1], element=Element{node=[A: null], tag=A, text=New Event, attributes={class=ember-view, href=/new, id=ember731}}, source=HybridStateVertexImpl{id=42, name=state42}, target=HybridStateVertexImpl{id=26, name=state26}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(150), "Event fired: New Event");
			testSuiteHelper.runInCrawlingPlugins(26);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 26");

			testSuiteHelper.addStateToReportBuilder(26);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(26)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(26)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(26)
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
	public void method_BT28_path_41_46(){
		testSuiteHelper.newCurrentTestMethod("method_BT28_path_41_46", 37);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(30);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(30)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(30)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(30)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[2]/DIV[3]/MAIN[1]/DIV[1]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Transactions, attributes={href=, title=Transactions}}, source=HybridStateVertexImpl{id=30, name=state30}, target=HybridStateVertexImpl{id=42, name=state42}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(41), "Event fired: Transactions");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[2]/DIV[3]/NAV[1]/DIV[1]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={class=navbar-brand ember-view, href=/, id=ember749}}, source=HybridStateVertexImpl{id=42, name=state42}, target=HybridStateVertexImpl{id=28, name=state28}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(46), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(28);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 28");

			testSuiteHelper.addStateToReportBuilder(28);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(28)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(28)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(28)
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
	public void method_BT121_path_36_112_1000029_152(){
		testSuiteHelper.newCurrentTestMethod("method_BT121_path_36_112_1000029_152", 38);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(30);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(30)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(30)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(30)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[2]/DIV[3]/MAIN[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Add New Event, attributes={class=ember-view, href=/new, id=ember869}}, source=HybridStateVertexImpl{id=30, name=state30}, target=HybridStateVertexImpl{id=26, name=state26}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(36), "Event fired: Add New Event");
			testSuiteHelper.runInCrawlingPlugins(26);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 26");

			testSuiteHelper.addStateToReportBuilder(26);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(26)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(26)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(26)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[3]/NAV[1]/DIV[1]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={class=navbar-brand ember-view, href=/, id=ember764}}, source=HybridStateVertexImpl{id=26, name=state26}, target=HybridStateVertexImpl{id=104, name=state104}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"), "UXxsEYWR"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"), "GnIoivsT"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"), "yCmDxnNm"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"), "Czech koruna (CZK)"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(112), "Event fired: ");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[2]/SECTION[2]/DIV[1]/DIV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=, attributes={anyaccess=none, aria-label=Remove event reference locally, class=btn btn-default, data-ember-action=, data-ember-action-943=943, title=Remove reference from this computer. The event will still be reachable by url.}}, source=HybridStateVertexImpl{id=104, name=state104}, target=HybridStateVertexImpl{id=121, name=state121}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1000029), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(121);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 121");

			testSuiteHelper.addStateToReportBuilder(121);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(121)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(121)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(121)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=New Event, attributes={class=ember-view, href=/new, id=ember756}}, source=HybridStateVertexImpl{id=121, name=state121}, target=HybridStateVertexImpl{id=6, name=state6}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(152), "Event fired: New Event");
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
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=39)
	public void method_BT125_path_4_1000025(){
		testSuiteHelper.newCurrentTestMethod("method_BT125_path_4_1000025", 39);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(1);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(1)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(1)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(1)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[3]/NAV[1]/DIV[1]/DIV[2]/UL[1]/LI[4]/A[1], element=Element{node=[A: null], tag=A, text=New Event, attributes={anyaccess=none, href=, title=Create New Event}}, source=HybridStateVertexImpl{id=1, name=state1}, target=HybridStateVertexImpl{id=6, name=state6}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(4), "Event fired: New Event");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save, attributes={class=btn btn-success save-event, data-ember-action=, data-ember-action-876=876, type=submit}}, source=HybridStateVertexImpl{id=6, name=state6}, target=HybridStateVertexImpl{id=125, name=state125}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"), "JAMoJeTu"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"), "vOxhyyUD"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"), "OYBhqmBO"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"), "Euro (EUR)"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(1000025), "Event fired: Save");
			testSuiteHelper.runInCrawlingPlugins(125);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 125");

			testSuiteHelper.addStateToReportBuilder(125);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(125)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(125)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(125)
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
	public void method_BT48_path_48(){
		testSuiteHelper.newCurrentTestMethod("method_BT48_path_48", 40);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(30);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(30)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(30)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(30)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[2]/DIV[3]/MAIN[1]/DIV[1]/DIV[4]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={class=btn btn-primary btn-circle btn-add-transaction, data-ember-action=, data-ember-action-985=985, href=#, title=Add New Transaction}}, source=HybridStateVertexImpl{id=30, name=state30}, target=HybridStateVertexImpl{id=48, name=state48}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(48), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(48);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 48");

			testSuiteHelper.addStateToReportBuilder(48);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(48)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(48)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(48)
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
	public void method_BT104_path_36_112(){
		testSuiteHelper.newCurrentTestMethod("method_BT104_path_36_112", 41);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(30);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(30)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(30)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(30)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[2]/DIV[3]/MAIN[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Add New Event, attributes={class=ember-view, href=/new, id=ember869}}, source=HybridStateVertexImpl{id=30, name=state30}, target=HybridStateVertexImpl{id=26, name=state26}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(36), "Event fired: Add New Event");
			testSuiteHelper.runInCrawlingPlugins(26);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 26");

			testSuiteHelper.addStateToReportBuilder(26);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(26)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(26)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(26)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[3]/NAV[1]/DIV[1]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={class=navbar-brand ember-view, href=/, id=ember764}}, source=HybridStateVertexImpl{id=26, name=state26}, target=HybridStateVertexImpl{id=104, name=state104}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"), "UXxsEYWR"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"), "GnIoivsT"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"), "yCmDxnNm"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"), "Czech koruna (CZK)"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(112), "Event fired: ");
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

	@Test(priority=42)
	public void method_BT153_path_36_112_1000029_120_1000034_123(){
		testSuiteHelper.newCurrentTestMethod("method_BT153_path_36_112_1000029_120_1000034_123", 42);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(30);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(30)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(30)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(30)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[2]/DIV[3]/MAIN[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Add New Event, attributes={class=ember-view, href=/new, id=ember869}}, source=HybridStateVertexImpl{id=30, name=state30}, target=HybridStateVertexImpl{id=26, name=state26}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(36), "Event fired: Add New Event");
			testSuiteHelper.runInCrawlingPlugins(26);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 26");

			testSuiteHelper.addStateToReportBuilder(26);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(26)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(26)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(26)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[3]/NAV[1]/DIV[1]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={class=navbar-brand ember-view, href=/, id=ember764}}, source=HybridStateVertexImpl{id=26, name=state26}, target=HybridStateVertexImpl{id=104, name=state104}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"), "UXxsEYWR"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"), "GnIoivsT"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"), "yCmDxnNm"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"), "Czech koruna (CZK)"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(112), "Event fired: ");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[2]/SECTION[2]/DIV[1]/DIV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=, attributes={anyaccess=none, aria-label=Remove event reference locally, class=btn btn-default, data-ember-action=, data-ember-action-943=943, title=Remove reference from this computer. The event will still be reachable by url.}}, source=HybridStateVertexImpl{id=104, name=state104}, target=HybridStateVertexImpl{id=121, name=state121}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1000029), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(121);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 121");

			testSuiteHelper.addStateToReportBuilder(121);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(121)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(121)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(121)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/HEADER[1]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={class=navbar-brand active ember-view, href=/, id=ember722, title=SplittyPie Home Page}}, source=HybridStateVertexImpl{id=121, name=state121}, target=HybridStateVertexImpl{id=1, name=state1}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(120), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(1);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 1");

			testSuiteHelper.addStateToReportBuilder(1);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(1)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(1)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(1)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[2]/DIV[3]/MAIN[1]/DIV[1]/NAV[1]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={class=navbar-btn btn btn-link ember-view, href=/-MkBB9oJUtZ5EEqw1exS/edit, id=ember848, title=Edit Event}}, source=HybridStateVertexImpl{id=1, name=state1}, target=HybridStateVertexImpl{id=142, name=state142}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1000034), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(142);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 142");

			testSuiteHelper.addStateToReportBuilder(142);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(142)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(142)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(142)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[2]/DIV[3]/NAV[1]/DIV[1]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={class=navbar-brand ember-view, href=/, id=ember759}}, source=HybridStateVertexImpl{id=142, name=state142}, target=HybridStateVertexImpl{id=153, name=state153}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(123), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(153);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 153");

			testSuiteHelper.addStateToReportBuilder(153);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(153)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(153)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(153)
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
	public void method_BT63_path_4_1000025_138_1000097_1000098_62(){
		testSuiteHelper.newCurrentTestMethod("method_BT63_path_4_1000025_138_1000097_1000098_62", 43);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(1);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(1)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(1)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(1)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[3]/NAV[1]/DIV[1]/DIV[2]/UL[1]/LI[4]/A[1], element=Element{node=[A: null], tag=A, text=New Event, attributes={anyaccess=none, href=, title=Create New Event}}, source=HybridStateVertexImpl{id=1, name=state1}, target=HybridStateVertexImpl{id=6, name=state6}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(4), "Event fired: New Event");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save, attributes={class=btn btn-success save-event, data-ember-action=, data-ember-action-876=876, type=submit}}, source=HybridStateVertexImpl{id=6, name=state6}, target=HybridStateVertexImpl{id=125, name=state125}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"), "JAMoJeTu"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"), "vOxhyyUD"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"), "OYBhqmBO"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"), "Euro (EUR)"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(1000025), "Event fired: Save");
			testSuiteHelper.runInCrawlingPlugins(125);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 125");

			testSuiteHelper.addStateToReportBuilder(125);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(125)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(125)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(125)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/UL[1]/LI[3]/A[1], element=Element{node=[A: null], tag=A, text=New Event, attributes={class=ember-view, href=/new, id=ember698}}, source=HybridStateVertexImpl{id=125, name=state125}, target=HybridStateVertexImpl{id=26, name=state26}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(138), "Event fired: New Event");
			testSuiteHelper.runInCrawlingPlugins(26);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 26");

			testSuiteHelper.addStateToReportBuilder(26);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(26)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(26)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(26)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Cancel, attributes={anyaccess=none, class=btn btn-link ember-view, id=ember852}}, source=HybridStateVertexImpl{id=26, name=state26}, target=HybridStateVertexImpl{id=30, name=state30}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"), "TIEqRLLc"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"), "kWlgrBiW"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"), "PgtLOiIp"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"), "Croatian kuna (HRK)"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(1000097), "Event fired: Cancel");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[2]/DIV[3]/NAV[1]/DIV[1]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={class=navbar-brand ember-view, href=/, id=ember757}}, source=HybridStateVertexImpl{id=30, name=state30}, target=HybridStateVertexImpl{id=28, name=state28}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1000098), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(28);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 28");

			testSuiteHelper.addStateToReportBuilder(28);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(28)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(28)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(28)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[2]/DIV[3]/NAV[1]/DIV[1]/DIV[2]/UL[1]/LI[5]/A[1], element=Element{node=[A: null], tag=A, text=New Event, attributes={href=, title=Create New Event}}, source=HybridStateVertexImpl{id=28, name=state28}, target=HybridStateVertexImpl{id=63, name=state63}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(62), "Event fired: New Event");
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

	@Test(priority=44)
	public void method_BT42_path_41(){
		testSuiteHelper.newCurrentTestMethod("method_BT42_path_41", 44);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(30);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(30)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(30)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(30)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[2]/DIV[3]/MAIN[1]/DIV[1]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Transactions, attributes={href=, title=Transactions}}, source=HybridStateVertexImpl{id=30, name=state30}, target=HybridStateVertexImpl{id=42, name=state42}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(41), "Event fired: Transactions");
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
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=45)
	public void method_BT121_path_36_112_1000029(){
		testSuiteHelper.newCurrentTestMethod("method_BT121_path_36_112_1000029", 45);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(30);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(30)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(30)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(30)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[2]/DIV[3]/MAIN[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Add New Event, attributes={class=ember-view, href=/new, id=ember869}}, source=HybridStateVertexImpl{id=30, name=state30}, target=HybridStateVertexImpl{id=26, name=state26}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(36), "Event fired: Add New Event");
			testSuiteHelper.runInCrawlingPlugins(26);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 26");

			testSuiteHelper.addStateToReportBuilder(26);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(26)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(26)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(26)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[3]/NAV[1]/DIV[1]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={class=navbar-brand ember-view, href=/, id=ember764}}, source=HybridStateVertexImpl{id=26, name=state26}, target=HybridStateVertexImpl{id=104, name=state104}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"), "UXxsEYWR"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"), "GnIoivsT"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"), "yCmDxnNm"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"), "Czech koruna (CZK)"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(112), "Event fired: ");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[2]/SECTION[2]/DIV[1]/DIV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=, attributes={anyaccess=none, aria-label=Remove event reference locally, class=btn btn-default, data-ember-action=, data-ember-action-943=943, title=Remove reference from this computer. The event will still be reachable by url.}}, source=HybridStateVertexImpl{id=104, name=state104}, target=HybridStateVertexImpl{id=121, name=state121}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1000029), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(121);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 121");

			testSuiteHelper.addStateToReportBuilder(121);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(121)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(121)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(121)
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
	public void method_BT44_path_4_1000025_136_41_43(){
		testSuiteHelper.newCurrentTestMethod("method_BT44_path_4_1000025_136_41_43", 46);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(1);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(1)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(1)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(1)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[3]/NAV[1]/DIV[1]/DIV[2]/UL[1]/LI[4]/A[1], element=Element{node=[A: null], tag=A, text=New Event, attributes={anyaccess=none, href=, title=Create New Event}}, source=HybridStateVertexImpl{id=1, name=state1}, target=HybridStateVertexImpl{id=6, name=state6}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(4), "Event fired: New Event");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save, attributes={class=btn btn-success save-event, data-ember-action=, data-ember-action-876=876, type=submit}}, source=HybridStateVertexImpl{id=6, name=state6}, target=HybridStateVertexImpl{id=125, name=state125}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"), "JAMoJeTu"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"), "vOxhyyUD"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"), "OYBhqmBO"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"), "Euro (EUR)"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(1000025), "Event fired: Save");
			testSuiteHelper.runInCrawlingPlugins(125);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 125");

			testSuiteHelper.addStateToReportBuilder(125);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(125)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(125)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(125)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/HEADER[1]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={class=navbar-brand ember-view, href=/, id=ember691, title=SplittyPie Home Page}}, source=HybridStateVertexImpl{id=125, name=state125}, target=HybridStateVertexImpl{id=30, name=state30}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(136), "Event fired: ");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[2]/DIV[3]/MAIN[1]/DIV[1]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Transactions, attributes={href=, title=Transactions}}, source=HybridStateVertexImpl{id=30, name=state30}, target=HybridStateVertexImpl{id=42, name=state42}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(41), "Event fired: Transactions");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[2]/DIV[3]/MAIN[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Share, attributes={anyaccess=none, class=btn btn-link btn-lg, data-ember-action=, data-ember-action-1105=1105}}, source=HybridStateVertexImpl{id=42, name=state42}, target=HybridStateVertexImpl{id=44, name=state44}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(43), "Event fired: Share");
			testSuiteHelper.runInCrawlingPlugins(44);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 44");

			testSuiteHelper.addStateToReportBuilder(44);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(44)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(44)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(44)
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
	public void method_BT215_path_41_140(){
		testSuiteHelper.newCurrentTestMethod("method_BT215_path_41_140", 47);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(30);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(30)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(30)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(30)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[2]/DIV[3]/MAIN[1]/DIV[1]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Transactions, attributes={href=, title=Transactions}}, source=HybridStateVertexImpl{id=30, name=state30}, target=HybridStateVertexImpl{id=42, name=state42}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(41), "Event fired: Transactions");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[2]/DIV[3]/MAIN[1]/DIV[1]/DIV[4]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={class=btn btn-primary btn-circle btn-add-transaction, data-ember-action=, data-ember-action-1124=1124, href=#, title=Add New Transaction}}, source=HybridStateVertexImpl{id=42, name=state42}, target=HybridStateVertexImpl{id=215, name=state215}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(140), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(215);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 215");

			testSuiteHelper.addStateToReportBuilder(215);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(215)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(215)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(215)
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
	public void method_BT75_path_48_68(){
		testSuiteHelper.newCurrentTestMethod("method_BT75_path_48_68", 48);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(30);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(30)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(30)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(30)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[2]/DIV[3]/MAIN[1]/DIV[1]/DIV[4]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={class=btn btn-primary btn-circle btn-add-transaction, data-ember-action=, data-ember-action-985=985, href=#, title=Add New Transaction}}, source=HybridStateVertexImpl{id=30, name=state30}, target=HybridStateVertexImpl{id=48, name=state48}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(48), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(48);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 48");

			testSuiteHelper.addStateToReportBuilder(48);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(48)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(48)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(48)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[2]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Add With Details, attributes={class=btn btn-default pull-left btn-add-with-details, data-dismiss=modal, data-ember-action=, data-ember-action-1120=1120, type=button}}, source=HybridStateVertexImpl{id=48, name=state48}, target=HybridStateVertexImpl{id=75, name=state75}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[2]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"), "nvgYQTCl"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(68), "Event fired: Add With Details");
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
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}


}	 
