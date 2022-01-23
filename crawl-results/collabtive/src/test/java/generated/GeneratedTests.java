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
 * Generated @ Tue Oct 05 21:31:03 CDT 2021
 */

public class GeneratedTests {
	private final boolean mutate = true;
    private final String URL = "http://localhost:3000/collabtive";
	private TestSuiteHelper testSuiteHelper;
	
	private final String CRAWL_PATH = "/Users/liuyu/projects/tackle-test-generator-ui-level/testlabeling/crawljax_frag/out/collabtive/collabtive_HYBRID_DOM_-1.0_60mins/localhost/crawl0";

	private StateEquivalenceAssertionMode assertionMode = StateEquivalenceAssertionMode.HYBRID;
	
	private CrawljaxConfiguration getTestConfiguration() {
		CrawljaxConfigurationBuilder builder = CrawljaxConfiguration.builderFor(URL);
		builder.crawlRules().waitAfterEvent(500, TimeUnit.MILLISECONDS);
		builder.crawlRules().waitAfterReloadUrl(500, TimeUnit.MILLISECONDS);
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
	public void method_BT0_path_1_2_5_6(){
		testSuiteHelper.newCurrentTestMethod("method_BT0_path_1_2_5_6", 2);
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
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/FORM[1]/FIELDSET[1]/DIV[4]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=, attributes={class=loginbutn, evlist=false, onfocus=this.blur();, title=Login, type=submit}}, source=HybridStateVertexImpl{id=0, name=index}, target=HybridStateVertexImpl{id=2, name=state2}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[1]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"), "admin"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[1]/FORM[1]/FIELDSET[1]/DIV[2]/INPUT[1]"), "admin"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(1), "Event fired: ");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/H1[1]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={evlist=false, href=index.php, title=Desktop}}, source=HybridStateVertexImpl{id=2, name=state2}, target=HybridStateVertexImpl{id=3, name=state3}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"), "ENZQGHyH"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(2), "Event fired: ");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/H2[1]/A[1], element=Element{node=[A: null], tag=A, text=My projects, attributes={evlist=false, href=myprojects.php, title=My projects}}, source=HybridStateVertexImpl{id=3, name=state3}, target=HybridStateVertexImpl{id=6, name=state6}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"), "hJgFHkpk"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(5), "Event fired: My projects");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Desktop, attributes={anyaccess=none, class=desktop, evlist=false, href=index.php}}, source=HybridStateVertexImpl{id=6, name=state6}, target=HybridStateVertexImpl{id=3, name=state3}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"), "UzLbJCRd"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(6), "Event fired: Desktop");
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
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=3)
	public void method_BT6_path_5_8_9_11_12_13(){
		testSuiteHelper.newCurrentTestMethod("method_BT6_path_5_8_9_11_12_13", 3);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(3);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(3)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(3)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(3)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/H2[1]/A[1], element=Element{node=[A: null], tag=A, text=My projects, attributes={evlist=false, href=myprojects.php, title=My projects}}, source=HybridStateVertexImpl{id=3, name=state3}, target=HybridStateVertexImpl{id=6, name=state6}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"), "hJgFHkpk"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(5), "Event fired: My projects");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=My account, attributes={anyaccess=none, class=profil, evlist=false, href=manageuser.php?action=profile&id=1}}, source=HybridStateVertexImpl{id=6, name=state6}, target=HybridStateVertexImpl{id=13, name=state13}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"), "ngeNcZJK"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(8), "Event fired: My account");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[3]/DIV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Project administration, attributes={anyaccess=none, class=overview, evlist=false, href=admin.php?action=projects}}, source=HybridStateVertexImpl{id=13, name=state13}, target=HybridStateVertexImpl{id=14, name=state14}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"), "QJJXkcnY"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(9), "Event fired: Project administration");
			testSuiteHelper.runInCrawlingPlugins(14);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 14");

			testSuiteHelper.addStateToReportBuilder(14);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(14)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(14)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(14)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[3]/DIV[1]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=User administration, attributes={anyaccess=none, class=users, evlist=false, href=admin.php?action=users}}, source=HybridStateVertexImpl{id=14, name=state14}, target=HybridStateVertexImpl{id=16, name=state16}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"), "BjhwfAOo"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(11), "Event fired: User administration");
			testSuiteHelper.runInCrawlingPlugins(16);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 16");

			testSuiteHelper.addStateToReportBuilder(16);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(16)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(16)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(16)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Project administration, attributes={evlist=false, href=admin.php?action=projects}}, source=HybridStateVertexImpl{id=16, name=state16}, target=HybridStateVertexImpl{id=14, name=state14}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "pass"), "admin"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(12), "Event fired: Project administration");
			testSuiteHelper.runInCrawlingPlugins(14);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 14");

			testSuiteHelper.addStateToReportBuilder(14);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(14)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(14)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(14)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[3]/DIV[1]/UL[1]/LI[3]/A[1], element=Element{node=[A: null], tag=A, text=System administration, attributes={anyaccess=none, class=system, evlist=false, href=admin.php?action=system}}, source=HybridStateVertexImpl{id=14, name=state14}, target=HybridStateVertexImpl{id=18, name=state18}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"), "jPZXqoOG"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(13), "Event fired: System administration");
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

	@Test(priority=4)
	public void method_BT16_path_5_8_9_11(){
		testSuiteHelper.newCurrentTestMethod("method_BT16_path_5_8_9_11", 4);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(3);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(3)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(3)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(3)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/H2[1]/A[1], element=Element{node=[A: null], tag=A, text=My projects, attributes={evlist=false, href=myprojects.php, title=My projects}}, source=HybridStateVertexImpl{id=3, name=state3}, target=HybridStateVertexImpl{id=6, name=state6}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"), "hJgFHkpk"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(5), "Event fired: My projects");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=My account, attributes={anyaccess=none, class=profil, evlist=false, href=manageuser.php?action=profile&id=1}}, source=HybridStateVertexImpl{id=6, name=state6}, target=HybridStateVertexImpl{id=13, name=state13}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"), "ngeNcZJK"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(8), "Event fired: My account");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[3]/DIV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Project administration, attributes={anyaccess=none, class=overview, evlist=false, href=admin.php?action=projects}}, source=HybridStateVertexImpl{id=13, name=state13}, target=HybridStateVertexImpl{id=14, name=state14}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"), "QJJXkcnY"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(9), "Event fired: Project administration");
			testSuiteHelper.runInCrawlingPlugins(14);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 14");

			testSuiteHelper.addStateToReportBuilder(14);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(14)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(14)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(14)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[3]/DIV[1]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=User administration, attributes={anyaccess=none, class=users, evlist=false, href=admin.php?action=users}}, source=HybridStateVertexImpl{id=14, name=state14}, target=HybridStateVertexImpl{id=16, name=state16}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"), "BjhwfAOo"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(11), "Event fired: User administration");
			testSuiteHelper.runInCrawlingPlugins(16);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 16");

			testSuiteHelper.addStateToReportBuilder(16);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(16)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(16)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(16)
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
	public void method_BT14_path_5_8_9_29_30_32_33(){
		testSuiteHelper.newCurrentTestMethod("method_BT14_path_5_8_9_29_30_32_33", 5);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(3);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(3)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(3)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(3)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/H2[1]/A[1], element=Element{node=[A: null], tag=A, text=My projects, attributes={evlist=false, href=myprojects.php, title=My projects}}, source=HybridStateVertexImpl{id=3, name=state3}, target=HybridStateVertexImpl{id=6, name=state6}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"), "hJgFHkpk"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(5), "Event fired: My projects");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=My account, attributes={anyaccess=none, class=profil, evlist=false, href=manageuser.php?action=profile&id=1}}, source=HybridStateVertexImpl{id=6, name=state6}, target=HybridStateVertexImpl{id=13, name=state13}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"), "ngeNcZJK"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(8), "Event fired: My account");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[3]/DIV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Project administration, attributes={anyaccess=none, class=overview, evlist=false, href=admin.php?action=projects}}, source=HybridStateVertexImpl{id=13, name=state13}, target=HybridStateVertexImpl{id=14, name=state14}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"), "QJJXkcnY"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(9), "Event fired: Project administration");
			testSuiteHelper.runInCrawlingPlugins(14);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 14");

			testSuiteHelper.addStateToReportBuilder(14);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(14)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(14)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(14)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=User administration, attributes={evlist=false, href=admin.php?action=users}}, source=HybridStateVertexImpl{id=14, name=state14}, target=HybridStateVertexImpl{id=16, name=state16}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"), "JUjNcCNT"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(29), "Event fired: User administration");
			testSuiteHelper.runInCrawlingPlugins(16);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 16");

			testSuiteHelper.addStateToReportBuilder(16);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(16)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(16)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(16)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[3]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/UL[1]/LI[1]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[2]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={evlist=false, href=manageuser.php?action=profile&id=1, title=admin}}, source=HybridStateVertexImpl{id=16, name=state16}, target=HybridStateVertexImpl{id=13, name=state13}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "pass"), "admin"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(30), "Event fired: ");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Edit, attributes={evlist=false, href=manageuser.php?action=editform&id=1}}, source=HybridStateVertexImpl{id=13, name=state13}, target=HybridStateVertexImpl{id=41, name=state41}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"), "xHpJbrIO"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(32), "Event fired: Edit");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=My account, attributes={evlist=false, href=manageuser.php?action=profile&id=1}}, source=HybridStateVertexImpl{id=41, name=state41}, target=HybridStateVertexImpl{id=13, name=state13}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/FIELDSET[1]/TABLE[1]/TBODY[1]/TR[1]/TD[2]/DIV[1]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[2]/INPUT[1]"), "RgzmycYd"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/FIELDSET[1]/TABLE[1]/TBODY[1]/TR[1]/TD[2]/DIV[1]/DIV[1]/TABLE[1]/TBODY[2]/TR[1]/TD[2]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/INPUT[1]"), "VlczOHbR"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/FIELDSET[1]/TABLE[1]/TBODY[1]/TR[1]/TD[2]/DIV[1]/DIV[1]/TABLE[1]/TBODY[4]/TR[1]/TD[2]/INPUT[1]"), "fCtpTpwH"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/FIELDSET[1]/TABLE[1]/TBODY[1]/TR[1]/TD[2]/DIV[1]/DIV[1]/TABLE[1]/TBODY[5]/TR[1]/TD[2]/INPUT[1]"), "AspBbtsy"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/FIELDSET[1]/TABLE[1]/TBODY[1]/TR[1]/TD[2]/DIV[1]/DIV[1]/TABLE[1]/TBODY[6]/TR[1]/TD[2]/INPUT[1]"), "TCwirYVr"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/FIELDSET[1]/TABLE[1]/TBODY[1]/TR[1]/TD[2]/DIV[1]/DIV[1]/TABLE[1]/TBODY[7]/TR[1]/TD[2]/INPUT[1]"), "nvYwMrBB"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/FIELDSET[1]/TABLE[1]/TBODY[1]/TR[1]/TD[2]/DIV[1]/DIV[1]/TABLE[1]/TBODY[8]/TR[1]/TD[2]/INPUT[1]"), "hjNHlTvg"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/FIELDSET[1]/TABLE[1]/TBODY[1]/TR[1]/TD[2]/DIV[1]/DIV[1]/TABLE[1]/TBODY[10]/TR[1]/TD[2]/INPUT[1]"), "jFRBrnNr"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/FIELDSET[1]/TABLE[1]/TBODY[1]/TR[1]/TD[2]/DIV[1]/DIV[1]/TABLE[1]/TBODY[11]/TR[1]/TD[2]/INPUT[1]"), "qariYKQm"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/FIELDSET[1]/TABLE[1]/TBODY[1]/TR[1]/TD[2]/DIV[1]/DIV[1]/TABLE[1]/TBODY[12]/TR[1]/TD[2]/INPUT[1]"), "vfTBUQCO"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/FIELDSET[1]/TABLE[1]/TBODY[1]/TR[1]/TD[2]/DIV[1]/DIV[1]/TABLE[1]/TBODY[13]/TR[1]/TD[2]/INPUT[1]"), "XTcgnEcC"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/FIELDSET[1]/TABLE[1]/TBODY[1]/TR[1]/TD[2]/DIV[1]/DIV[1]/TABLE[1]/TBODY[14]/TR[1]/TD[2]/INPUT[1]"), "cjKObsIJ"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"), "qJJmKLAS"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/FIELDSET[1]/TABLE[1]/TBODY[1]/TR[1]/TD[2]/DIV[1]/DIV[1]/TABLE[1]/TBODY[16]/TR[1]/TD[2]/SELECT[1]"), "Please choose"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/FIELDSET[1]/TABLE[1]/TBODY[1]/TR[1]/TD[2]/DIV[1]/DIV[1]/TABLE[1]/TBODY[17]/TR[1]/TD[2]/SELECT[1]"), "Italian (100%)"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(33), "Event fired: My account");
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

	@Test(priority=6)
	public void method_BT6_path_5_37(){
		testSuiteHelper.newCurrentTestMethod("method_BT6_path_5_37", 6);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(3);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(3)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(3)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(3)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/H2[1]/A[1], element=Element{node=[A: null], tag=A, text=My projects, attributes={evlist=false, href=myprojects.php, title=My projects}}, source=HybridStateVertexImpl{id=3, name=state3}, target=HybridStateVertexImpl{id=6, name=state6}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"), "hJgFHkpk"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(5), "Event fired: My projects");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Desktop, attributes={evlist=false, href=index.php}}, source=HybridStateVertexImpl{id=6, name=state6}, target=HybridStateVertexImpl{id=3, name=state3}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"), "RBTrLval"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(37), "Event fired: Desktop");
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
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=7)
	public void method_BT6_path_5(){
		testSuiteHelper.newCurrentTestMethod("method_BT6_path_5", 7);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(3);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(3)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(3)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(3)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/H2[1]/A[1], element=Element{node=[A: null], tag=A, text=My projects, attributes={evlist=false, href=myprojects.php, title=My projects}}, source=HybridStateVertexImpl{id=3, name=state3}, target=HybridStateVertexImpl{id=6, name=state6}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"), "hJgFHkpk"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(5), "Event fired: My projects");
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

	@Test(priority=8)
	public void method_BT6_path_5_dup0(){
		testSuiteHelper.newCurrentTestMethod("method_BT6_path_5_dup0", 8);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(3);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(3)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(3)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(3)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/H2[1]/A[1], element=Element{node=[A: null], tag=A, text=My projects, attributes={evlist=false, href=myprojects.php, title=My projects}}, source=HybridStateVertexImpl{id=3, name=state3}, target=HybridStateVertexImpl{id=6, name=state6}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"), "hJgFHkpk"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(5), "Event fired: My projects");
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

	@Test(priority=9)
	public void method_BT6_path_5_dup1(){
		testSuiteHelper.newCurrentTestMethod("method_BT6_path_5_dup1", 9);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(3);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(3)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(3)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(3)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/H2[1]/A[1], element=Element{node=[A: null], tag=A, text=My projects, attributes={evlist=false, href=myprojects.php, title=My projects}}, source=HybridStateVertexImpl{id=3, name=state3}, target=HybridStateVertexImpl{id=6, name=state6}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"), "hJgFHkpk"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(5), "Event fired: My projects");
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

	@Test(priority=10)
	public void method_BT6_path_5_dup2(){
		testSuiteHelper.newCurrentTestMethod("method_BT6_path_5_dup2", 10);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(3);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(3)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(3)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(3)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/H2[1]/A[1], element=Element{node=[A: null], tag=A, text=My projects, attributes={evlist=false, href=myprojects.php, title=My projects}}, source=HybridStateVertexImpl{id=3, name=state3}, target=HybridStateVertexImpl{id=6, name=state6}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"), "hJgFHkpk"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(5), "Event fired: My projects");
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

	@Test(priority=11)
	public void method_BT6_path_5_dup3(){
		testSuiteHelper.newCurrentTestMethod("method_BT6_path_5_dup3", 11);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(3);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(3)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(3)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(3)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/H2[1]/A[1], element=Element{node=[A: null], tag=A, text=My projects, attributes={evlist=false, href=myprojects.php, title=My projects}}, source=HybridStateVertexImpl{id=3, name=state3}, target=HybridStateVertexImpl{id=6, name=state6}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"), "hJgFHkpk"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(5), "Event fired: My projects");
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

	@Test(priority=12)
	public void method_BT6_path_5_dup4(){
		testSuiteHelper.newCurrentTestMethod("method_BT6_path_5_dup4", 12);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(3);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(3)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(3)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(3)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/H2[1]/A[1], element=Element{node=[A: null], tag=A, text=My projects, attributes={evlist=false, href=myprojects.php, title=My projects}}, source=HybridStateVertexImpl{id=3, name=state3}, target=HybridStateVertexImpl{id=6, name=state6}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"), "hJgFHkpk"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(5), "Event fired: My projects");
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

	@Test(priority=13)
	public void method_BT6_path_5_53(){
		testSuiteHelper.newCurrentTestMethod("method_BT6_path_5_53", 13);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(3);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(3)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(3)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(3)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/H2[1]/A[1], element=Element{node=[A: null], tag=A, text=My projects, attributes={evlist=false, href=myprojects.php, title=My projects}}, source=HybridStateVertexImpl{id=3, name=state3}, target=HybridStateVertexImpl{id=6, name=state6}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"), "hJgFHkpk"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(5), "Event fired: My projects");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/FORM[1]/FIELDSET[1]/DIV[2]/DIV[1]/SPAN[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={accesskey=z, evlist=false, href=#, onfocus=tinyMCE.getInstanceById('desc').focus();, title=Jump to tool buttons - Alt+Q, Jump to editor - Alt-Z, Jump to element path - Alt-X}}, source=HybridStateVertexImpl{id=6, name=state6}, target=HybridStateVertexImpl{id=64, name=state64}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"), "HBRcsHbL"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(53), "Event fired: ");
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

	@Test(priority=14)
	public void method_BT14_path_5_8_9_54(){
		testSuiteHelper.newCurrentTestMethod("method_BT14_path_5_8_9_54", 14);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(3);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(3)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(3)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(3)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/H2[1]/A[1], element=Element{node=[A: null], tag=A, text=My projects, attributes={evlist=false, href=myprojects.php, title=My projects}}, source=HybridStateVertexImpl{id=3, name=state3}, target=HybridStateVertexImpl{id=6, name=state6}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"), "hJgFHkpk"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(5), "Event fired: My projects");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=My account, attributes={anyaccess=none, class=profil, evlist=false, href=manageuser.php?action=profile&id=1}}, source=HybridStateVertexImpl{id=6, name=state6}, target=HybridStateVertexImpl{id=13, name=state13}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"), "ngeNcZJK"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(8), "Event fired: My account");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[3]/DIV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Project administration, attributes={anyaccess=none, class=overview, evlist=false, href=admin.php?action=projects}}, source=HybridStateVertexImpl{id=13, name=state13}, target=HybridStateVertexImpl{id=14, name=state14}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"), "QJJXkcnY"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(9), "Event fired: Project administration");
			testSuiteHelper.runInCrawlingPlugins(14);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 14");

			testSuiteHelper.addStateToReportBuilder(14);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(14)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(14)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(14)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[3]/A[1], element=Element{node=[A: null], tag=A, text=System administration, attributes={evlist=false, href=admin.php?action=system}}, source=HybridStateVertexImpl{id=14, name=state14}, target=HybridStateVertexImpl{id=18, name=state18}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"), "HDHDtmPE"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(54), "Event fired: System administration");
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

	@Test(priority=15)
	public void method_BT14_path_5_8_9(){
		testSuiteHelper.newCurrentTestMethod("method_BT14_path_5_8_9", 15);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(3);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(3)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(3)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(3)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/H2[1]/A[1], element=Element{node=[A: null], tag=A, text=My projects, attributes={evlist=false, href=myprojects.php, title=My projects}}, source=HybridStateVertexImpl{id=3, name=state3}, target=HybridStateVertexImpl{id=6, name=state6}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"), "hJgFHkpk"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(5), "Event fired: My projects");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=My account, attributes={anyaccess=none, class=profil, evlist=false, href=manageuser.php?action=profile&id=1}}, source=HybridStateVertexImpl{id=6, name=state6}, target=HybridStateVertexImpl{id=13, name=state13}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"), "ngeNcZJK"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(8), "Event fired: My account");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[3]/DIV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Project administration, attributes={anyaccess=none, class=overview, evlist=false, href=admin.php?action=projects}}, source=HybridStateVertexImpl{id=13, name=state13}, target=HybridStateVertexImpl{id=14, name=state14}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"), "QJJXkcnY"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(9), "Event fired: Project administration");
			testSuiteHelper.runInCrawlingPlugins(14);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 14");

			testSuiteHelper.addStateToReportBuilder(14);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(14)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(14)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(14)
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
	public void method_BT14_path_5_8_9_dup0(){
		testSuiteHelper.newCurrentTestMethod("method_BT14_path_5_8_9_dup0", 16);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(3);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(3)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(3)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(3)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/H2[1]/A[1], element=Element{node=[A: null], tag=A, text=My projects, attributes={evlist=false, href=myprojects.php, title=My projects}}, source=HybridStateVertexImpl{id=3, name=state3}, target=HybridStateVertexImpl{id=6, name=state6}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"), "hJgFHkpk"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(5), "Event fired: My projects");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=My account, attributes={anyaccess=none, class=profil, evlist=false, href=manageuser.php?action=profile&id=1}}, source=HybridStateVertexImpl{id=6, name=state6}, target=HybridStateVertexImpl{id=13, name=state13}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"), "ngeNcZJK"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(8), "Event fired: My account");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[3]/DIV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Project administration, attributes={anyaccess=none, class=overview, evlist=false, href=admin.php?action=projects}}, source=HybridStateVertexImpl{id=13, name=state13}, target=HybridStateVertexImpl{id=14, name=state14}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"), "QJJXkcnY"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(9), "Event fired: Project administration");
			testSuiteHelper.runInCrawlingPlugins(14);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 14");

			testSuiteHelper.addStateToReportBuilder(14);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(14)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(14)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(14)
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
	public void method_BT14_path_5_8_9_dup1(){
		testSuiteHelper.newCurrentTestMethod("method_BT14_path_5_8_9_dup1", 17);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(3);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(3)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(3)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(3)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/H2[1]/A[1], element=Element{node=[A: null], tag=A, text=My projects, attributes={evlist=false, href=myprojects.php, title=My projects}}, source=HybridStateVertexImpl{id=3, name=state3}, target=HybridStateVertexImpl{id=6, name=state6}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"), "hJgFHkpk"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(5), "Event fired: My projects");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=My account, attributes={anyaccess=none, class=profil, evlist=false, href=manageuser.php?action=profile&id=1}}, source=HybridStateVertexImpl{id=6, name=state6}, target=HybridStateVertexImpl{id=13, name=state13}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"), "ngeNcZJK"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(8), "Event fired: My account");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[3]/DIV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Project administration, attributes={anyaccess=none, class=overview, evlist=false, href=admin.php?action=projects}}, source=HybridStateVertexImpl{id=13, name=state13}, target=HybridStateVertexImpl{id=14, name=state14}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"), "QJJXkcnY"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(9), "Event fired: Project administration");
			testSuiteHelper.runInCrawlingPlugins(14);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 14");

			testSuiteHelper.addStateToReportBuilder(14);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(14)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(14)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(14)
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
	public void method_BT14_path_5_8_9_dup2(){
		testSuiteHelper.newCurrentTestMethod("method_BT14_path_5_8_9_dup2", 18);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(3);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(3)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(3)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(3)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/H2[1]/A[1], element=Element{node=[A: null], tag=A, text=My projects, attributes={evlist=false, href=myprojects.php, title=My projects}}, source=HybridStateVertexImpl{id=3, name=state3}, target=HybridStateVertexImpl{id=6, name=state6}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"), "hJgFHkpk"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(5), "Event fired: My projects");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=My account, attributes={anyaccess=none, class=profil, evlist=false, href=manageuser.php?action=profile&id=1}}, source=HybridStateVertexImpl{id=6, name=state6}, target=HybridStateVertexImpl{id=13, name=state13}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"), "ngeNcZJK"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(8), "Event fired: My account");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[3]/DIV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Project administration, attributes={anyaccess=none, class=overview, evlist=false, href=admin.php?action=projects}}, source=HybridStateVertexImpl{id=13, name=state13}, target=HybridStateVertexImpl{id=14, name=state14}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"), "QJJXkcnY"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(9), "Event fired: Project administration");
			testSuiteHelper.runInCrawlingPlugins(14);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 14");

			testSuiteHelper.addStateToReportBuilder(14);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(14)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(14)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(14)
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
	public void method_BT14_path_5_8_9_dup3(){
		testSuiteHelper.newCurrentTestMethod("method_BT14_path_5_8_9_dup3", 19);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(3);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(3)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(3)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(3)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/H2[1]/A[1], element=Element{node=[A: null], tag=A, text=My projects, attributes={evlist=false, href=myprojects.php, title=My projects}}, source=HybridStateVertexImpl{id=3, name=state3}, target=HybridStateVertexImpl{id=6, name=state6}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"), "hJgFHkpk"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(5), "Event fired: My projects");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=My account, attributes={anyaccess=none, class=profil, evlist=false, href=manageuser.php?action=profile&id=1}}, source=HybridStateVertexImpl{id=6, name=state6}, target=HybridStateVertexImpl{id=13, name=state13}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"), "ngeNcZJK"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(8), "Event fired: My account");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[3]/DIV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Project administration, attributes={anyaccess=none, class=overview, evlist=false, href=admin.php?action=projects}}, source=HybridStateVertexImpl{id=13, name=state13}, target=HybridStateVertexImpl{id=14, name=state14}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"), "QJJXkcnY"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(9), "Event fired: Project administration");
			testSuiteHelper.runInCrawlingPlugins(14);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 14");

			testSuiteHelper.addStateToReportBuilder(14);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(14)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(14)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(14)
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
	public void method_BT14_path_5_8_9_dup4(){
		testSuiteHelper.newCurrentTestMethod("method_BT14_path_5_8_9_dup4", 20);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(3);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(3)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(3)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(3)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/H2[1]/A[1], element=Element{node=[A: null], tag=A, text=My projects, attributes={evlist=false, href=myprojects.php, title=My projects}}, source=HybridStateVertexImpl{id=3, name=state3}, target=HybridStateVertexImpl{id=6, name=state6}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"), "hJgFHkpk"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(5), "Event fired: My projects");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=My account, attributes={anyaccess=none, class=profil, evlist=false, href=manageuser.php?action=profile&id=1}}, source=HybridStateVertexImpl{id=6, name=state6}, target=HybridStateVertexImpl{id=13, name=state13}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"), "ngeNcZJK"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(8), "Event fired: My account");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[3]/DIV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Project administration, attributes={anyaccess=none, class=overview, evlist=false, href=admin.php?action=projects}}, source=HybridStateVertexImpl{id=13, name=state13}, target=HybridStateVertexImpl{id=14, name=state14}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"), "QJJXkcnY"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(9), "Event fired: Project administration");
			testSuiteHelper.runInCrawlingPlugins(14);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 14");

			testSuiteHelper.addStateToReportBuilder(14);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(14)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(14)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(14)
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
	public void method_BT14_path_5_8_9_69(){
		testSuiteHelper.newCurrentTestMethod("method_BT14_path_5_8_9_69", 21);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(3);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(3)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(3)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(3)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/H2[1]/A[1], element=Element{node=[A: null], tag=A, text=My projects, attributes={evlist=false, href=myprojects.php, title=My projects}}, source=HybridStateVertexImpl{id=3, name=state3}, target=HybridStateVertexImpl{id=6, name=state6}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"), "hJgFHkpk"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(5), "Event fired: My projects");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=My account, attributes={anyaccess=none, class=profil, evlist=false, href=manageuser.php?action=profile&id=1}}, source=HybridStateVertexImpl{id=6, name=state6}, target=HybridStateVertexImpl{id=13, name=state13}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"), "ngeNcZJK"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(8), "Event fired: My account");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[3]/DIV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Project administration, attributes={anyaccess=none, class=overview, evlist=false, href=admin.php?action=projects}}, source=HybridStateVertexImpl{id=13, name=state13}, target=HybridStateVertexImpl{id=14, name=state14}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"), "QJJXkcnY"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(9), "Event fired: Project administration");
			testSuiteHelper.runInCrawlingPlugins(14);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 14");

			testSuiteHelper.addStateToReportBuilder(14);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(14)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(14)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(14)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[3]/DIV[1]/DIV[1]/FORM[1]/FIELDSET[1]/DIV[2]/DIV[1]/SPAN[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={accesskey=z, evlist=false, href=#, onfocus=tinyMCE.getInstanceById('desc').focus();, title=Jump to tool buttons - Alt+Q, Jump to editor - Alt-Z, Jump to element path - Alt-X}}, source=HybridStateVertexImpl{id=14, name=state14}, target=HybridStateVertexImpl{id=100, name=state100}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"), "aSNKTtnB"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(69), "Event fired: ");
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
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=22)
	public void method_BT16_path_5_8_9_11_70(){
		testSuiteHelper.newCurrentTestMethod("method_BT16_path_5_8_9_11_70", 22);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(3);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(3)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(3)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(3)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/H2[1]/A[1], element=Element{node=[A: null], tag=A, text=My projects, attributes={evlist=false, href=myprojects.php, title=My projects}}, source=HybridStateVertexImpl{id=3, name=state3}, target=HybridStateVertexImpl{id=6, name=state6}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"), "hJgFHkpk"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(5), "Event fired: My projects");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=My account, attributes={anyaccess=none, class=profil, evlist=false, href=manageuser.php?action=profile&id=1}}, source=HybridStateVertexImpl{id=6, name=state6}, target=HybridStateVertexImpl{id=13, name=state13}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"), "ngeNcZJK"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(8), "Event fired: My account");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[3]/DIV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Project administration, attributes={anyaccess=none, class=overview, evlist=false, href=admin.php?action=projects}}, source=HybridStateVertexImpl{id=13, name=state13}, target=HybridStateVertexImpl{id=14, name=state14}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"), "QJJXkcnY"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(9), "Event fired: Project administration");
			testSuiteHelper.runInCrawlingPlugins(14);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 14");

			testSuiteHelper.addStateToReportBuilder(14);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(14)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(14)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(14)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[3]/DIV[1]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=User administration, attributes={anyaccess=none, class=users, evlist=false, href=admin.php?action=users}}, source=HybridStateVertexImpl{id=14, name=state14}, target=HybridStateVertexImpl{id=16, name=state16}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"), "BjhwfAOo"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(11), "Event fired: User administration");
			testSuiteHelper.runInCrawlingPlugins(16);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 16");

			testSuiteHelper.addStateToReportBuilder(16);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(16)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(16)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(16)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[3]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/UL[1]/LI[1]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[3]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={class=edit, evlist=false, href=admin.php?action=editform&id=1, title=Edit}}, source=HybridStateVertexImpl{id=16, name=state16}, target=HybridStateVertexImpl{id=106, name=state106}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "pass"), "admin"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(70), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(106);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 106");

			testSuiteHelper.addStateToReportBuilder(106);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(106)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(106)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(106)
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
	public void method_BT16_path_5_8_9_11_72_73(){
		testSuiteHelper.newCurrentTestMethod("method_BT16_path_5_8_9_11_72_73", 23);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(3);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(3)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(3)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(3)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/H2[1]/A[1], element=Element{node=[A: null], tag=A, text=My projects, attributes={evlist=false, href=myprojects.php, title=My projects}}, source=HybridStateVertexImpl{id=3, name=state3}, target=HybridStateVertexImpl{id=6, name=state6}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"), "hJgFHkpk"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(5), "Event fired: My projects");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=My account, attributes={anyaccess=none, class=profil, evlist=false, href=manageuser.php?action=profile&id=1}}, source=HybridStateVertexImpl{id=6, name=state6}, target=HybridStateVertexImpl{id=13, name=state13}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"), "ngeNcZJK"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(8), "Event fired: My account");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[3]/DIV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Project administration, attributes={anyaccess=none, class=overview, evlist=false, href=admin.php?action=projects}}, source=HybridStateVertexImpl{id=13, name=state13}, target=HybridStateVertexImpl{id=14, name=state14}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"), "QJJXkcnY"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(9), "Event fired: Project administration");
			testSuiteHelper.runInCrawlingPlugins(14);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 14");

			testSuiteHelper.addStateToReportBuilder(14);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(14)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(14)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(14)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[3]/DIV[1]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=User administration, attributes={anyaccess=none, class=users, evlist=false, href=admin.php?action=users}}, source=HybridStateVertexImpl{id=14, name=state14}, target=HybridStateVertexImpl{id=16, name=state16}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"), "BjhwfAOo"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(11), "Event fired: User administration");
			testSuiteHelper.runInCrawlingPlugins(16);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 16");

			testSuiteHelper.addStateToReportBuilder(16);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(16)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(16)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(16)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[3]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/UL[1]/LI[1]/DIV[1]/TABLE[1]/TBODY[1]/TR[2]/TD[1]/SPAN[1]/A[1], element=Element{node=[A: null], tag=A, text=admin, attributes={evlist=false, href=manageuser.php?action=profile&id=1, title=admin}}, source=HybridStateVertexImpl{id=16, name=state16}, target=HybridStateVertexImpl{id=13, name=state13}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "pass"), "admin"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(72), "Event fired: admin");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/TABLE[1]/TBODY[1]/TR[1]/TD[2]/DIV[1]/DIV[1]/TABLE[1]/TBODY[3]/TR[1]/TD[2]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={evlist=false, href=, target=_blank}}, source=HybridStateVertexImpl{id=13, name=state13}, target=HybridStateVertexImpl{id=3, name=state3}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"), "ucHpZpXC"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(73), "Event fired: ");
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
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=24)
	public void method_BT6_path_5_dup5(){
		testSuiteHelper.newCurrentTestMethod("method_BT6_path_5_dup5", 24);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(3);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(3)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(3)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(3)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/H2[1]/A[1], element=Element{node=[A: null], tag=A, text=My projects, attributes={evlist=false, href=myprojects.php, title=My projects}}, source=HybridStateVertexImpl{id=3, name=state3}, target=HybridStateVertexImpl{id=6, name=state6}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"), "hJgFHkpk"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(5), "Event fired: My projects");
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

	@Test(priority=25)
	public void method_BT6_path_5_dup6(){
		testSuiteHelper.newCurrentTestMethod("method_BT6_path_5_dup6", 25);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(3);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(3)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(3)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(3)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/H2[1]/A[1], element=Element{node=[A: null], tag=A, text=My projects, attributes={evlist=false, href=myprojects.php, title=My projects}}, source=HybridStateVertexImpl{id=3, name=state3}, target=HybridStateVertexImpl{id=6, name=state6}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"), "hJgFHkpk"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(5), "Event fired: My projects");
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

	@Test(priority=26)
	public void method_BT6_path_5_dup7(){
		testSuiteHelper.newCurrentTestMethod("method_BT6_path_5_dup7", 26);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(3);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(3)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(3)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(3)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/H2[1]/A[1], element=Element{node=[A: null], tag=A, text=My projects, attributes={evlist=false, href=myprojects.php, title=My projects}}, source=HybridStateVertexImpl{id=3, name=state3}, target=HybridStateVertexImpl{id=6, name=state6}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"), "hJgFHkpk"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(5), "Event fired: My projects");
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

	@Test(priority=27)
	public void method_BT6_path_5_dup8(){
		testSuiteHelper.newCurrentTestMethod("method_BT6_path_5_dup8", 27);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(3);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(3)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(3)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(3)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/H2[1]/A[1], element=Element{node=[A: null], tag=A, text=My projects, attributes={evlist=false, href=myprojects.php, title=My projects}}, source=HybridStateVertexImpl{id=3, name=state3}, target=HybridStateVertexImpl{id=6, name=state6}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"), "hJgFHkpk"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(5), "Event fired: My projects");
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

	@Test(priority=28)
	public void method_BT16_path_5_8_9_11_dup0(){
		testSuiteHelper.newCurrentTestMethod("method_BT16_path_5_8_9_11_dup0", 28);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(3);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(3)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(3)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(3)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/H2[1]/A[1], element=Element{node=[A: null], tag=A, text=My projects, attributes={evlist=false, href=myprojects.php, title=My projects}}, source=HybridStateVertexImpl{id=3, name=state3}, target=HybridStateVertexImpl{id=6, name=state6}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"), "hJgFHkpk"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(5), "Event fired: My projects");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=My account, attributes={anyaccess=none, class=profil, evlist=false, href=manageuser.php?action=profile&id=1}}, source=HybridStateVertexImpl{id=6, name=state6}, target=HybridStateVertexImpl{id=13, name=state13}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"), "ngeNcZJK"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(8), "Event fired: My account");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[3]/DIV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Project administration, attributes={anyaccess=none, class=overview, evlist=false, href=admin.php?action=projects}}, source=HybridStateVertexImpl{id=13, name=state13}, target=HybridStateVertexImpl{id=14, name=state14}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"), "QJJXkcnY"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(9), "Event fired: Project administration");
			testSuiteHelper.runInCrawlingPlugins(14);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 14");

			testSuiteHelper.addStateToReportBuilder(14);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(14)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(14)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(14)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[3]/DIV[1]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=User administration, attributes={anyaccess=none, class=users, evlist=false, href=admin.php?action=users}}, source=HybridStateVertexImpl{id=14, name=state14}, target=HybridStateVertexImpl{id=16, name=state16}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"), "BjhwfAOo"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(11), "Event fired: User administration");
			testSuiteHelper.runInCrawlingPlugins(16);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 16");

			testSuiteHelper.addStateToReportBuilder(16);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(16)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(16)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(16)
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
	public void method_BT14_path_5_8_9_dup5(){
		testSuiteHelper.newCurrentTestMethod("method_BT14_path_5_8_9_dup5", 29);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(3);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(3)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(3)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(3)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/H2[1]/A[1], element=Element{node=[A: null], tag=A, text=My projects, attributes={evlist=false, href=myprojects.php, title=My projects}}, source=HybridStateVertexImpl{id=3, name=state3}, target=HybridStateVertexImpl{id=6, name=state6}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"), "hJgFHkpk"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(5), "Event fired: My projects");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=My account, attributes={anyaccess=none, class=profil, evlist=false, href=manageuser.php?action=profile&id=1}}, source=HybridStateVertexImpl{id=6, name=state6}, target=HybridStateVertexImpl{id=13, name=state13}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"), "ngeNcZJK"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(8), "Event fired: My account");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[3]/DIV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Project administration, attributes={anyaccess=none, class=overview, evlist=false, href=admin.php?action=projects}}, source=HybridStateVertexImpl{id=13, name=state13}, target=HybridStateVertexImpl{id=14, name=state14}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"), "QJJXkcnY"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(9), "Event fired: Project administration");
			testSuiteHelper.runInCrawlingPlugins(14);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 14");

			testSuiteHelper.addStateToReportBuilder(14);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(14)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(14)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(14)
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
	public void method_BT14_path_5_8_9_dup6(){
		testSuiteHelper.newCurrentTestMethod("method_BT14_path_5_8_9_dup6", 30);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(3);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(3)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(3)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(3)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/H2[1]/A[1], element=Element{node=[A: null], tag=A, text=My projects, attributes={evlist=false, href=myprojects.php, title=My projects}}, source=HybridStateVertexImpl{id=3, name=state3}, target=HybridStateVertexImpl{id=6, name=state6}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"), "hJgFHkpk"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(5), "Event fired: My projects");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=My account, attributes={anyaccess=none, class=profil, evlist=false, href=manageuser.php?action=profile&id=1}}, source=HybridStateVertexImpl{id=6, name=state6}, target=HybridStateVertexImpl{id=13, name=state13}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"), "ngeNcZJK"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(8), "Event fired: My account");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[3]/DIV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Project administration, attributes={anyaccess=none, class=overview, evlist=false, href=admin.php?action=projects}}, source=HybridStateVertexImpl{id=13, name=state13}, target=HybridStateVertexImpl{id=14, name=state14}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"), "QJJXkcnY"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(9), "Event fired: Project administration");
			testSuiteHelper.runInCrawlingPlugins(14);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 14");

			testSuiteHelper.addStateToReportBuilder(14);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(14)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(14)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(14)
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
	public void method_BT14_path_5_8_9_dup7(){
		testSuiteHelper.newCurrentTestMethod("method_BT14_path_5_8_9_dup7", 31);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(3);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(3)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(3)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(3)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/H2[1]/A[1], element=Element{node=[A: null], tag=A, text=My projects, attributes={evlist=false, href=myprojects.php, title=My projects}}, source=HybridStateVertexImpl{id=3, name=state3}, target=HybridStateVertexImpl{id=6, name=state6}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"), "hJgFHkpk"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(5), "Event fired: My projects");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=My account, attributes={anyaccess=none, class=profil, evlist=false, href=manageuser.php?action=profile&id=1}}, source=HybridStateVertexImpl{id=6, name=state6}, target=HybridStateVertexImpl{id=13, name=state13}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"), "ngeNcZJK"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(8), "Event fired: My account");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[3]/DIV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Project administration, attributes={anyaccess=none, class=overview, evlist=false, href=admin.php?action=projects}}, source=HybridStateVertexImpl{id=13, name=state13}, target=HybridStateVertexImpl{id=14, name=state14}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"), "QJJXkcnY"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(9), "Event fired: Project administration");
			testSuiteHelper.runInCrawlingPlugins(14);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 14");

			testSuiteHelper.addStateToReportBuilder(14);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(14)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(14)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(14)
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
	public void method_BT14_path_5_8_9_dup8(){
		testSuiteHelper.newCurrentTestMethod("method_BT14_path_5_8_9_dup8", 32);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(3);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(3)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(3)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(3)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/H2[1]/A[1], element=Element{node=[A: null], tag=A, text=My projects, attributes={evlist=false, href=myprojects.php, title=My projects}}, source=HybridStateVertexImpl{id=3, name=state3}, target=HybridStateVertexImpl{id=6, name=state6}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"), "hJgFHkpk"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(5), "Event fired: My projects");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=My account, attributes={anyaccess=none, class=profil, evlist=false, href=manageuser.php?action=profile&id=1}}, source=HybridStateVertexImpl{id=6, name=state6}, target=HybridStateVertexImpl{id=13, name=state13}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"), "ngeNcZJK"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(8), "Event fired: My account");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[3]/DIV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Project administration, attributes={anyaccess=none, class=overview, evlist=false, href=admin.php?action=projects}}, source=HybridStateVertexImpl{id=13, name=state13}, target=HybridStateVertexImpl{id=14, name=state14}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"), "QJJXkcnY"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(9), "Event fired: Project administration");
			testSuiteHelper.runInCrawlingPlugins(14);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 14");

			testSuiteHelper.addStateToReportBuilder(14);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(14)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(14)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(14)
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
	public void method_BT3_path_104(){
		testSuiteHelper.newCurrentTestMethod("method_BT3_path_104", 33);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(3);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(3)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(3)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(3)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/FORM[1]/FIELDSET[1]/DIV[2]/DIV[1]/SPAN[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={accesskey=z, evlist=false, href=#, onfocus=tinyMCE.getInstanceById('desc').focus();, title=Jump to tool buttons - Alt+Q, Jump to editor - Alt-Z, Jump to element path - Alt-X}}, source=HybridStateVertexImpl{id=3, name=state3}, target=HybridStateVertexImpl{id=153, name=state153}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"), "PGNXnrRn"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(104), "Event fired: ");
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

	@Test(priority=34)
	public void method_BT16_path_5_8_9_11_dup1(){
		testSuiteHelper.newCurrentTestMethod("method_BT16_path_5_8_9_11_dup1", 34);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(3);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(3)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(3)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(3)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/H2[1]/A[1], element=Element{node=[A: null], tag=A, text=My projects, attributes={evlist=false, href=myprojects.php, title=My projects}}, source=HybridStateVertexImpl{id=3, name=state3}, target=HybridStateVertexImpl{id=6, name=state6}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"), "hJgFHkpk"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(5), "Event fired: My projects");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=My account, attributes={anyaccess=none, class=profil, evlist=false, href=manageuser.php?action=profile&id=1}}, source=HybridStateVertexImpl{id=6, name=state6}, target=HybridStateVertexImpl{id=13, name=state13}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"), "ngeNcZJK"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(8), "Event fired: My account");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[3]/DIV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Project administration, attributes={anyaccess=none, class=overview, evlist=false, href=admin.php?action=projects}}, source=HybridStateVertexImpl{id=13, name=state13}, target=HybridStateVertexImpl{id=14, name=state14}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"), "QJJXkcnY"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(9), "Event fired: Project administration");
			testSuiteHelper.runInCrawlingPlugins(14);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 14");

			testSuiteHelper.addStateToReportBuilder(14);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(14)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(14)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(14)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[3]/DIV[1]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=User administration, attributes={anyaccess=none, class=users, evlist=false, href=admin.php?action=users}}, source=HybridStateVertexImpl{id=14, name=state14}, target=HybridStateVertexImpl{id=16, name=state16}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"), "BjhwfAOo"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(11), "Event fired: User administration");
			testSuiteHelper.runInCrawlingPlugins(16);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 16");

			testSuiteHelper.addStateToReportBuilder(16);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(16)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(16)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(16)
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
	public void method_BT106_failed_path_5_8_9_1000077_1000078(){
		testSuiteHelper.newCurrentTestMethod("method_BT106_failed_path_5_8_9_1000077_1000078", 35);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(3);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(3)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(3)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(3)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/H2[1]/A[1], element=Element{node=[A: null], tag=A, text=My projects, attributes={evlist=false, href=myprojects.php, title=My projects}}, source=HybridStateVertexImpl{id=3, name=state3}, target=HybridStateVertexImpl{id=6, name=state6}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"), "hJgFHkpk"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(5), "Event fired: My projects");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=My account, attributes={anyaccess=none, class=profil, evlist=false, href=manageuser.php?action=profile&id=1}}, source=HybridStateVertexImpl{id=6, name=state6}, target=HybridStateVertexImpl{id=13, name=state13}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"), "ngeNcZJK"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(8), "Event fired: My account");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[3]/DIV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Project administration, attributes={anyaccess=none, class=overview, evlist=false, href=admin.php?action=projects}}, source=HybridStateVertexImpl{id=13, name=state13}, target=HybridStateVertexImpl{id=14, name=state14}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"), "QJJXkcnY"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(9), "Event fired: Project administration");
			testSuiteHelper.runInCrawlingPlugins(14);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 14");

			testSuiteHelper.addStateToReportBuilder(14);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(14)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(14)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(14)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[3]/DIV[1]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=User administration, attributes={anyaccess=none, class=users, evlist=false, href=admin.php?action=users}}, source=HybridStateVertexImpl{id=14, name=state14}, target=HybridStateVertexImpl{id=177, name=state177}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"), "BjhwfAOo"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(1000077), "Event fired: User administration");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[3]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/UL[1]/LI[1]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[3]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={class=edit, evlist=false, href=admin.php?action=editform&id=1, title=Edit}}, source=HybridStateVertexImpl{id=177, name=state177}, target=HybridStateVertexImpl{id=178, name=state178}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "pass"), "admin"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(1000078), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(178);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 178");

			testSuiteHelper.addStateToReportBuilder(178);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(178)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(178)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(178)
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
	public void method_BT13_path_5_8_129_131(){
		testSuiteHelper.newCurrentTestMethod("method_BT13_path_5_8_129_131", 36);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(3);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(3)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(3)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(3)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/H2[1]/A[1], element=Element{node=[A: null], tag=A, text=My projects, attributes={evlist=false, href=myprojects.php, title=My projects}}, source=HybridStateVertexImpl{id=3, name=state3}, target=HybridStateVertexImpl{id=6, name=state6}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"), "hJgFHkpk"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(5), "Event fired: My projects");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=My account, attributes={anyaccess=none, class=profil, evlist=false, href=manageuser.php?action=profile&id=1}}, source=HybridStateVertexImpl{id=6, name=state6}, target=HybridStateVertexImpl{id=13, name=state13}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"), "ngeNcZJK"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(8), "Event fired: My account");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/TABLE[1]/TBODY[1]/TR[1]/TD[2]/DIV[1]/DIV[1]/TABLE[1]/TBODY[9]/TR[1]/TD[2]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={evlist=false, href=managetags.php?action=gettag&tag=&id=0}}, source=HybridStateVertexImpl{id=13, name=state13}, target=HybridStateVertexImpl{id=185, name=state185}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"), "KxJRZawN"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(129), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(185);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 185");

			testSuiteHelper.addStateToReportBuilder(185);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(185)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(185)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(185)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/UL[1]/LI[1]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[2]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={evlist=false, href=manageuser.php?action=profile&id=1, title=admin}}, source=HybridStateVertexImpl{id=185, name=state185}, target=HybridStateVertexImpl{id=13, name=state13}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"), "erQlujbV"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(131), "Event fired: ");
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

	@Test(priority=37)
	public void method_BT41_path_5_8_32(){
		testSuiteHelper.newCurrentTestMethod("method_BT41_path_5_8_32", 37);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(3);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(3)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(3)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(3)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/H2[1]/A[1], element=Element{node=[A: null], tag=A, text=My projects, attributes={evlist=false, href=myprojects.php, title=My projects}}, source=HybridStateVertexImpl{id=3, name=state3}, target=HybridStateVertexImpl{id=6, name=state6}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"), "hJgFHkpk"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(5), "Event fired: My projects");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=My account, attributes={anyaccess=none, class=profil, evlist=false, href=manageuser.php?action=profile&id=1}}, source=HybridStateVertexImpl{id=6, name=state6}, target=HybridStateVertexImpl{id=13, name=state13}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"), "ngeNcZJK"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(8), "Event fired: My account");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Edit, attributes={evlist=false, href=manageuser.php?action=editform&id=1}}, source=HybridStateVertexImpl{id=13, name=state13}, target=HybridStateVertexImpl{id=41, name=state41}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"), "xHpJbrIO"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(32), "Event fired: Edit");
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
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=38)
	public void method_BT41_path_5_8_32_dup0(){
		testSuiteHelper.newCurrentTestMethod("method_BT41_path_5_8_32_dup0", 38);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(3);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(3)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(3)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(3)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/H2[1]/A[1], element=Element{node=[A: null], tag=A, text=My projects, attributes={evlist=false, href=myprojects.php, title=My projects}}, source=HybridStateVertexImpl{id=3, name=state3}, target=HybridStateVertexImpl{id=6, name=state6}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"), "hJgFHkpk"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(5), "Event fired: My projects");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=My account, attributes={anyaccess=none, class=profil, evlist=false, href=manageuser.php?action=profile&id=1}}, source=HybridStateVertexImpl{id=6, name=state6}, target=HybridStateVertexImpl{id=13, name=state13}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"), "ngeNcZJK"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(8), "Event fired: My account");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Edit, attributes={evlist=false, href=manageuser.php?action=editform&id=1}}, source=HybridStateVertexImpl{id=13, name=state13}, target=HybridStateVertexImpl{id=41, name=state41}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"), "xHpJbrIO"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(32), "Event fired: Edit");
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
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=39)
	public void method_BT177_path_5_8_9_1000077(){
		testSuiteHelper.newCurrentTestMethod("method_BT177_path_5_8_9_1000077", 39);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(3);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(3)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(3)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(3)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/H2[1]/A[1], element=Element{node=[A: null], tag=A, text=My projects, attributes={evlist=false, href=myprojects.php, title=My projects}}, source=HybridStateVertexImpl{id=3, name=state3}, target=HybridStateVertexImpl{id=6, name=state6}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"), "hJgFHkpk"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(5), "Event fired: My projects");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=My account, attributes={anyaccess=none, class=profil, evlist=false, href=manageuser.php?action=profile&id=1}}, source=HybridStateVertexImpl{id=6, name=state6}, target=HybridStateVertexImpl{id=13, name=state13}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"), "ngeNcZJK"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(8), "Event fired: My account");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[3]/DIV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Project administration, attributes={anyaccess=none, class=overview, evlist=false, href=admin.php?action=projects}}, source=HybridStateVertexImpl{id=13, name=state13}, target=HybridStateVertexImpl{id=14, name=state14}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"), "QJJXkcnY"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(9), "Event fired: Project administration");
			testSuiteHelper.runInCrawlingPlugins(14);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 14");

			testSuiteHelper.addStateToReportBuilder(14);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(14)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(14)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(14)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[3]/DIV[1]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=User administration, attributes={anyaccess=none, class=users, evlist=false, href=admin.php?action=users}}, source=HybridStateVertexImpl{id=14, name=state14}, target=HybridStateVertexImpl{id=177, name=state177}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"), "BjhwfAOo"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(1000077), "Event fired: User administration");
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

	@Test(priority=40)
	public void method_BT185_path_5_8_129_137(){
		testSuiteHelper.newCurrentTestMethod("method_BT185_path_5_8_129_137", 40);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(3);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(3)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(3)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(3)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/H2[1]/A[1], element=Element{node=[A: null], tag=A, text=My projects, attributes={evlist=false, href=myprojects.php, title=My projects}}, source=HybridStateVertexImpl{id=3, name=state3}, target=HybridStateVertexImpl{id=6, name=state6}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"), "hJgFHkpk"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(5), "Event fired: My projects");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=My account, attributes={anyaccess=none, class=profil, evlist=false, href=manageuser.php?action=profile&id=1}}, source=HybridStateVertexImpl{id=6, name=state6}, target=HybridStateVertexImpl{id=13, name=state13}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"), "ngeNcZJK"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(8), "Event fired: My account");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/TABLE[1]/TBODY[1]/TR[1]/TD[2]/DIV[1]/DIV[1]/TABLE[1]/TBODY[9]/TR[1]/TD[2]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={evlist=false, href=managetags.php?action=gettag&tag=&id=0}}, source=HybridStateVertexImpl{id=13, name=state13}, target=HybridStateVertexImpl{id=185, name=state185}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"), "KxJRZawN"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(129), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(185);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 185");

			testSuiteHelper.addStateToReportBuilder(185);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(185)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(185)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(185)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/UL[1]/LI[1]/DIV[1]/TABLE[1]/TBODY[1]/TR[2]/TD[1]/SPAN[1]/A[1], element=Element{node=[A: null], tag=A, text=admin, attributes={evlist=false, href=manageuser.php?action=profile&id=1, title=admin}}, source=HybridStateVertexImpl{id=185, name=state185}, target=HybridStateVertexImpl{id=13, name=state13}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"), "letSWDZI"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(137), "Event fired: admin");
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


}	 
