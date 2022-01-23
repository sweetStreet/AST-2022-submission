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
 * Generated @ Tue Oct 05 21:11:07 CDT 2021
 */

public class GeneratedTests {
	private final boolean mutate = true;
    private final String URL = "http://localhost:3000/addressbook/";
	private TestSuiteHelper testSuiteHelper;
	
	private final String CRAWL_PATH = "/Users/liuyu/projects/tackle-test-generator-ui-level/testlabeling/crawljax_frag/out/addressbook/addressbook_HYBRID_DOM_-1.0_60mins/localhost/crawl0";

	private StateEquivalenceAssertionMode assertionMode = StateEquivalenceAssertionMode.HYBRID;
	
	private CrawljaxConfiguration getTestConfiguration() {
		CrawljaxConfigurationBuilder builder = CrawljaxConfiguration.builderFor(URL);
		builder.crawlRules().waitAfterEvent(500, TimeUnit.MILLISECONDS);
		builder.crawlRules().waitAfterReloadUrl(500, TimeUnit.MILLISECONDS);
		builder.setBrowserConfig(new BrowserConfiguration(BrowserType.CHROME_HEADLESS, 1, new BrowserOptions(false, 2)));
		builder.addPlugin(new AddressbookCleanup());
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
	public void method_BT0_path_2_3(){
		testSuiteHelper.newCurrentTestMethod("method_BT0_path_2_3", 2);
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
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/INPUT[3], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={evlist=false, type=submit, value=Login}}, source=HybridStateVertexImpl{id=0, name=index}, target=HybridStateVertexImpl{id=3, name=state3}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/INPUT[1]"), "admin"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/INPUT[2]"), "secret"));
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/FORM[1]/A[1], element=Element{node=[A: null], tag=A, text=Logout, attributes={evlist=false, href=#, onclick=document.logout.submit();}}, source=HybridStateVertexImpl{id=3, name=state3}, target=HybridStateVertexImpl{id=0, name=index}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/DIV[1]/FORM[1]/INPUT[1]"), "andrea"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/SELECT[1]"), "[all]"));
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[2]/INPUT[2]"), "0"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(3), "Event fired: Logout");
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

	@Test(priority=3)
	public void method_BT3_path_2_7_8(){
		testSuiteHelper.newCurrentTestMethod("method_BT3_path_2_7_8", 3);
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
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/INPUT[3], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={evlist=false, type=submit, value=Login}}, source=HybridStateVertexImpl{id=0, name=index}, target=HybridStateVertexImpl{id=3, name=state3}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/INPUT[1]"), "admin"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/INPUT[2]"), "secret"));
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=add new, attributes={evlist=false, href=edit.php}}, source=HybridStateVertexImpl{id=3, name=state3}, target=HybridStateVertexImpl{id=9, name=state9}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/DIV[1]/FORM[1]/INPUT[1]"), "andrea"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/SELECT[1]"), "[all]"));
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[2]/INPUT[2]"), "0"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(7), "Event fired: add new");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[5]/UL[1]/LI[1]/A[2], element=Element{node=[A: null], tag=A, text=v8.0.0 - r475, attributes={evlist=false, href=notes.htm}}, source=HybridStateVertexImpl{id=9, name=state9}, target=HybridStateVertexImpl{id=10, name=state10}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/TEXTAREA[1]"), "1165 The Castings"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(8), "Event fired: v8.0.0 - r475");
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

	@Test(priority=4)
	public void method_BT3_path_23_24(){
		testSuiteHelper.newCurrentTestMethod("method_BT3_path_23_24", 4);
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
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[3]/UL[1]/LI[3]/A[1], element=Element{node=[A: null], tag=A, text=groups, attributes={evlist=false, href=group.php}}, source=HybridStateVertexImpl{id=3, name=state3}, target=HybridStateVertexImpl{id=17, name=state17}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/DIV[1]/FORM[1]/INPUT[1]"), "andrea"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/SELECT[1]"), "[all]"));
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[2]/INPUT[2]"), "1"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(23), "Event fired: groups");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[5]/UL[1]/LI[1]/A[2], element=Element{node=[A: null], tag=A, text=v8.0.0 - r475, attributes={evlist=false, href=notes.htm}}, source=HybridStateVertexImpl{id=17, name=state17}, target=HybridStateVertexImpl{id=10, name=state10}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(24), "Event fired: v8.0.0 - r475");
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

	@Test(priority=5)
	public void method_BT3_path_25_26(){
		testSuiteHelper.newCurrentTestMethod("method_BT3_path_25_26", 5);
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
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[3]/UL[1]/LI[4]/A[1], element=Element{node=[A: null], tag=A, text=next birthdays, attributes={evlist=false, href=birthdays.php}}, source=HybridStateVertexImpl{id=3, name=state3}, target=HybridStateVertexImpl{id=20, name=state20}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/DIV[1]/FORM[1]/INPUT[1]"), "andrea"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/SELECT[1]"), "[all]"));
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[2]/INPUT[2]"), "1"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(25), "Event fired: next birthdays");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[5]/UL[1]/LI[1]/A[2], element=Element{node=[A: null], tag=A, text=v8.0.0 - r475, attributes={evlist=false, href=notes.htm}}, source=HybridStateVertexImpl{id=20, name=state20}, target=HybridStateVertexImpl{id=10, name=state10}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(26), "Event fired: v8.0.0 - r475");
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

	@Test(priority=6)
	public void method_BT3_path_27_28(){
		testSuiteHelper.newCurrentTestMethod("method_BT3_path_27_28", 6);
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
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[3]/UL[1]/LI[5]/A[1], element=Element{node=[A: null], tag=A, text=print all, attributes={evlist=false, href=view.php?all&print}}, source=HybridStateVertexImpl{id=3, name=state3}, target=HybridStateVertexImpl{id=23, name=state23}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/DIV[1]/FORM[1]/INPUT[1]"), "andrea"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/SELECT[1]"), "[all]"));
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[2]/INPUT[2]"), "0"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(27), "Event fired: print all");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/UL[1]/LI[1]/A[2], element=Element{node=[A: null], tag=A, text=v8.0.0 - r475, attributes={evlist=false, href=notes.htm}}, source=HybridStateVertexImpl{id=23, name=state23}, target=HybridStateVertexImpl{id=10, name=state10}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(28), "Event fired: v8.0.0 - r475");
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

	@Test(priority=7)
	public void method_BT3_path_29(){
		testSuiteHelper.newCurrentTestMethod("method_BT3_path_29", 7);
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
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[3]/UL[1]/LI[6]/A[1], element=Element{node=[A: null], tag=A, text=print phones, attributes={evlist=false, href=view.php?all&print&phones}}, source=HybridStateVertexImpl{id=3, name=state3}, target=HybridStateVertexImpl{id=23, name=state23}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/DIV[1]/FORM[1]/INPUT[1]"), "andrea"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/SELECT[1]"), "[all]"));
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[2]/INPUT[2]"), "0"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(29), "Event fired: print phones");
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
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=8)
	public void method_BT3_path_30_31_33(){
		testSuiteHelper.newCurrentTestMethod("method_BT3_path_30_31_33", 8);
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
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[3]/UL[1]/LI[7]/A[1], element=Element{node=[A: null], tag=A, text=export, attributes={evlist=false, href=export.php}}, source=HybridStateVertexImpl{id=3, name=state3}, target=HybridStateVertexImpl{id=28, name=state28}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/DIV[1]/FORM[1]/INPUT[1]"), "andrea"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/SELECT[1]"), "[all]"));
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[2]/INPUT[2]"), "0"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(30), "Event fired: export");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[3]/UL[1]/LI[8]/A[1], element=Element{node=[A: null], tag=A, text=import, attributes={anyaccess=none, evlist=false, href=import.php}}, source=HybridStateVertexImpl{id=28, name=state28}, target=HybridStateVertexImpl{id=29, name=state29}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(31), "Event fired: import");
			testSuiteHelper.runInCrawlingPlugins(29);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 29");

			testSuiteHelper.addStateToReportBuilder(29);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(29)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(29)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(29)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[5]/UL[1]/LI[1]/A[2], element=Element{node=[A: null], tag=A, text=v8.0.0 - r475, attributes={evlist=false, href=notes.htm}}, source=HybridStateVertexImpl{id=29, name=state29}, target=HybridStateVertexImpl{id=10, name=state10}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(33), "Event fired: v8.0.0 - r475");
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

	@Test(priority=9)
	public void method_BT3_path_34_36_37_38_39(){
		testSuiteHelper.newCurrentTestMethod("method_BT3_path_34_36_37_38_39", 9);
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
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[2]/TABLE[1]/TBODY[1]/TR[1]/TH[2]/A[1], element=Element{node=[A: null], tag=A, text=Last name, attributes={class=fdTableSortTrigger, evlist=false, href=#, title=Sort on “Last name”}}, source=HybridStateVertexImpl{id=3, name=state3}, target=HybridStateVertexImpl{id=33, name=state33}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/DIV[1]/FORM[1]/INPUT[1]"), "andrea"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/SELECT[1]"), "[none]"));
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[2]/INPUT[2]"), "1"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(34), "Event fired: Last name");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[2]/TABLE[1]/TBODY[1]/TR[1]/TH[3]/A[1], element=Element{node=[A: null], tag=A, text=First name, attributes={class=fdTableSortTrigger, evlist=false, href=#, title=Sort on “First name”}}, source=HybridStateVertexImpl{id=33, name=state33}, target=HybridStateVertexImpl{id=35, name=state35}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/DIV[1]/FORM[1]/INPUT[1]"), "andrea"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/SELECT[1]"), "[none]"));
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[2]/INPUT[2]"), "1"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(36), "Event fired: First name");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[2]/TABLE[1]/TBODY[1]/TR[1]/TH[2]/A[1], element=Element{node=[A: null], tag=A, text=Last name, attributes={class=fdTableSortTrigger, evlist=false, href=#, title=Sort on “Last name”}}, source=HybridStateVertexImpl{id=35, name=state35}, target=HybridStateVertexImpl{id=33, name=state33}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/DIV[1]/FORM[1]/INPUT[1]"), "andrea"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/SELECT[1]"), "[none]"));
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[2]/INPUT[2]"), "1"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(37), "Event fired: Last name");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[2]/TABLE[1]/TBODY[1]/TR[1]/TH[4]/A[1], element=Element{node=[A: null], tag=A, text=E-mail, attributes={class=fdTableSortTrigger, evlist=false, href=#, title=Sort on “E-mail”}}, source=HybridStateVertexImpl{id=33, name=state33}, target=HybridStateVertexImpl{id=37, name=state37}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/DIV[1]/FORM[1]/INPUT[1]"), "andrea"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/SELECT[1]"), "[all]"));
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[2]/INPUT[2]"), "1"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(38), "Event fired: E-mail");
			testSuiteHelper.runInCrawlingPlugins(37);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 37");

			testSuiteHelper.addStateToReportBuilder(37);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(37)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(37)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(37)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[2]/TABLE[1]/TBODY[1]/TR[1]/TH[3]/A[1], element=Element{node=[A: null], tag=A, text=First name, attributes={class=fdTableSortTrigger, evlist=false, href=#, title=Sort on “First name”}}, source=HybridStateVertexImpl{id=37, name=state37}, target=HybridStateVertexImpl{id=35, name=state35}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/DIV[1]/FORM[1]/INPUT[1]"), "andrea"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/SELECT[1]"), "[all]"));
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[2]/INPUT[2]"), "1"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(39), "Event fired: First name");
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

	@Test(priority=10)
	public void method_BT28_path_30_42(){
		testSuiteHelper.newCurrentTestMethod("method_BT28_path_30_42", 10);
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
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[3]/UL[1]/LI[7]/A[1], element=Element{node=[A: null], tag=A, text=export, attributes={evlist=false, href=export.php}}, source=HybridStateVertexImpl{id=3, name=state3}, target=HybridStateVertexImpl{id=28, name=state28}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/DIV[1]/FORM[1]/INPUT[1]"), "andrea"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/SELECT[1]"), "[all]"));
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[2]/INPUT[2]"), "0"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(30), "Event fired: export");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[5]/UL[1]/LI[1]/A[2], element=Element{node=[A: null], tag=A, text=v8.0.0 - r475, attributes={evlist=false, href=notes.htm}}, source=HybridStateVertexImpl{id=28, name=state28}, target=HybridStateVertexImpl{id=10, name=state10}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(42), "Event fired: v8.0.0 - r475");
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

	@Test(priority=11)
	public void method_BT3_path_43(){
		testSuiteHelper.newCurrentTestMethod("method_BT3_path_43", 11);
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
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[2]/TABLE[1]/TBODY[1]/TR[1]/TH[3]/A[1], element=Element{node=[A: null], tag=A, text=First name, attributes={class=fdTableSortTrigger, evlist=false, href=#, title=Sort on “First name”}}, source=HybridStateVertexImpl{id=3, name=state3}, target=HybridStateVertexImpl{id=35, name=state35}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/DIV[1]/FORM[1]/INPUT[1]"), "andrea"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/SELECT[1]"), "[all]"));
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[2]/INPUT[2]"), "0"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(43), "Event fired: First name");
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

	@Test(priority=12)
	public void method_BT3_path_44(){
		testSuiteHelper.newCurrentTestMethod("method_BT3_path_44", 12);
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
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[2]/TABLE[1]/TBODY[1]/TR[1]/TH[4]/A[1], element=Element{node=[A: null], tag=A, text=E-mail, attributes={class=fdTableSortTrigger, evlist=false, href=#, title=Sort on “E-mail”}}, source=HybridStateVertexImpl{id=3, name=state3}, target=HybridStateVertexImpl{id=37, name=state37}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/DIV[1]/FORM[1]/INPUT[1]"), "andrea"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/SELECT[1]"), "[all]"));
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[2]/INPUT[2]"), "1"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(44), "Event fired: E-mail");
			testSuiteHelper.runInCrawlingPlugins(37);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 37");

			testSuiteHelper.addStateToReportBuilder(37);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(37)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(37)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(37)
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
	public void method_BT28_path_30(){
		testSuiteHelper.newCurrentTestMethod("method_BT28_path_30", 13);
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
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[3]/UL[1]/LI[7]/A[1], element=Element{node=[A: null], tag=A, text=export, attributes={evlist=false, href=export.php}}, source=HybridStateVertexImpl{id=3, name=state3}, target=HybridStateVertexImpl{id=28, name=state28}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/DIV[1]/FORM[1]/INPUT[1]"), "andrea"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/SELECT[1]"), "[all]"));
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[2]/INPUT[2]"), "0"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(30), "Event fired: export");
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

	@Test(priority=14)
	public void method_BT3_path_51_52(){
		testSuiteHelper.newCurrentTestMethod("method_BT3_path_51_52", 14);
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
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[2]/TABLE[1]/TBODY[1]/TR[1]/TH[5]/A[1], element=Element{node=[A: null], tag=A, text=Telephone, attributes={class=fdTableSortTrigger, evlist=false, href=#, title=Sort on “Telephone”}}, source=HybridStateVertexImpl{id=3, name=state3}, target=HybridStateVertexImpl{id=57, name=state57}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/DIV[1]/FORM[1]/INPUT[1]"), "andrea"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/SELECT[1]"), "[all]"));
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[2]/INPUT[2]"), "1"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(51), "Event fired: Telephone");
			testSuiteHelper.runInCrawlingPlugins(57);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 57");

			testSuiteHelper.addStateToReportBuilder(57);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(57)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(57)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(57)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[2]/TABLE[1]/TBODY[1]/TR[1]/TH[4]/A[1], element=Element{node=[A: null], tag=A, text=E-mail, attributes={class=fdTableSortTrigger, evlist=false, href=#, title=Sort on “E-mail”}}, source=HybridStateVertexImpl{id=57, name=state57}, target=HybridStateVertexImpl{id=37, name=state37}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/DIV[1]/FORM[1]/INPUT[1]"), "andrea"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/SELECT[1]"), "[all]"));
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[2]/INPUT[2]"), "1"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(52), "Event fired: E-mail");
			testSuiteHelper.runInCrawlingPlugins(37);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 37");

			testSuiteHelper.addStateToReportBuilder(37);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(37)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(37)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(37)
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
	public void method_BT17_path_23_53_54(){
		testSuiteHelper.newCurrentTestMethod("method_BT17_path_23_53_54", 15);
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
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[3]/UL[1]/LI[3]/A[1], element=Element{node=[A: null], tag=A, text=groups, attributes={evlist=false, href=group.php}}, source=HybridStateVertexImpl{id=3, name=state3}, target=HybridStateVertexImpl{id=17, name=state17}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/DIV[1]/FORM[1]/INPUT[1]"), "andrea"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/SELECT[1]"), "[all]"));
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[2]/INPUT[2]"), "1"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(23), "Event fired: groups");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/INPUT[1], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={evlist=false, name=new, type=submit, value=New group}}, source=HybridStateVertexImpl{id=17, name=state17}, target=HybridStateVertexImpl{id=61, name=state61}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(53), "Event fired: ");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[5]/UL[1]/LI[1]/A[2], element=Element{node=[A: null], tag=A, text=v8.0.0 - r475, attributes={evlist=false, href=notes.htm}}, source=HybridStateVertexImpl{id=61, name=state61}, target=HybridStateVertexImpl{id=10, name=state10}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/INPUT[1]"), "Cekollhh"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/SELECT[1]"), "[none]"));
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/TEXTAREA[1]"), "TWGzDuTN"));
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/TEXTAREA[2]"), "KRdxHfWT"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(54), "Event fired: v8.0.0 - r475");
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

	@Test(priority=16)
	public void method_BT3_path_55(){
		testSuiteHelper.newCurrentTestMethod("method_BT3_path_55", 16);
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
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[5]/UL[1]/LI[1]/A[2], element=Element{node=[A: null], tag=A, text=v8.0.0 - r475, attributes={evlist=false, href=notes.htm}}, source=HybridStateVertexImpl{id=3, name=state3}, target=HybridStateVertexImpl{id=10, name=state10}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/DIV[1]/FORM[1]/INPUT[1]"), "andrea"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/SELECT[1]"), "[all]"));
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[2]/INPUT[2]"), "0"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(55), "Event fired: v8.0.0 - r475");
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

	@Test(priority=17)
	public void method_BT17_path_23_56_57_58_59(){
		testSuiteHelper.newCurrentTestMethod("method_BT17_path_23_56_57_58_59", 17);
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
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[3]/UL[1]/LI[3]/A[1], element=Element{node=[A: null], tag=A, text=groups, attributes={evlist=false, href=group.php}}, source=HybridStateVertexImpl{id=3, name=state3}, target=HybridStateVertexImpl{id=17, name=state17}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/DIV[1]/FORM[1]/INPUT[1]"), "andrea"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/SELECT[1]"), "[all]"));
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[2]/INPUT[2]"), "1"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(23), "Event fired: groups");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/INPUT[2], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={evlist=false, name=delete, type=submit, value=Delete group(s)}}, source=HybridStateVertexImpl{id=17, name=state17}, target=HybridStateVertexImpl{id=67, name=state67}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(56), "Event fired: ");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[4]/DIV[1]/I[1]/A[1], element=Element{node=[A: null], tag=A, text=group page, attributes={evlist=false, href=group.php}}, source=HybridStateVertexImpl{id=67, name=state67}, target=HybridStateVertexImpl{id=17, name=state17}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(57), "Event fired: group page");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/INPUT[3], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={evlist=false, name=edit, type=submit, value=Edit group}}, source=HybridStateVertexImpl{id=17, name=state17}, target=HybridStateVertexImpl{id=69, name=state69}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(58), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(69);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 69");

			testSuiteHelper.addStateToReportBuilder(69);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(69)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(69)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(69)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[5]/UL[1]/LI[1]/A[2], element=Element{node=[A: null], tag=A, text=v8.0.0 - r475, attributes={evlist=false, href=notes.htm}}, source=HybridStateVertexImpl{id=69, name=state69}, target=HybridStateVertexImpl{id=10, name=state10}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/INPUT[2]"), "wnxVqpEe"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/SELECT[1]"), "[none]"));
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/TEXTAREA[1]"), "YNCubUGJ"));
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/TEXTAREA[2]"), "bGWZHtEY"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(59), "Event fired: v8.0.0 - r475");
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

	@Test(priority=18)
	public void method_BT3_path_60(){
		testSuiteHelper.newCurrentTestMethod("method_BT3_path_60", 18);
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
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[2]/DIV[4]/INPUT[1], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={evlist=false, name=add, type=submit, value=Add to}}, source=HybridStateVertexImpl{id=3, name=state3}, target=HybridStateVertexImpl{id=72, name=state72}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/DIV[1]/FORM[1]/INPUT[1]"), "andrea"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/SELECT[1]"), "[none]"));
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[2]/INPUT[2]"), "0"));
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
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=19)
	public void method_BT17_path_23_63_64_65(){
		testSuiteHelper.newCurrentTestMethod("method_BT17_path_23_63_64_65", 19);
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
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[3]/UL[1]/LI[3]/A[1], element=Element{node=[A: null], tag=A, text=groups, attributes={evlist=false, href=group.php}}, source=HybridStateVertexImpl{id=3, name=state3}, target=HybridStateVertexImpl{id=17, name=state17}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/DIV[1]/FORM[1]/INPUT[1]"), "andrea"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/SELECT[1]"), "[all]"));
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[2]/INPUT[2]"), "1"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(23), "Event fired: groups");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/INPUT[4], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={evlist=false, name=new, type=submit, value=New group}}, source=HybridStateVertexImpl{id=17, name=state17}, target=HybridStateVertexImpl{id=61, name=state61}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(63), "Event fired: ");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/INPUT[2], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={evlist=false, name=submit, type=submit, value=Enter information}}, source=HybridStateVertexImpl{id=61, name=state61}, target=HybridStateVertexImpl{id=79, name=state79}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/INPUT[1]"), "GWmvBZbI"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/SELECT[1]"), "[none]"));
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/TEXTAREA[1]"), "ekvSpaLl"));
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/TEXTAREA[2]"), "sJmsUGPC"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(64), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(79);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 79");

			testSuiteHelper.addStateToReportBuilder(79);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(79)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(79)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(79)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[5]/UL[1]/LI[1]/A[2], element=Element{node=[A: null], tag=A, text=v8.0.0 - r475, attributes={evlist=false, href=notes.htm}}, source=HybridStateVertexImpl{id=79, name=state79}, target=HybridStateVertexImpl{id=10, name=state10}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(65), "Event fired: v8.0.0 - r475");
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

	@Test(priority=20)
	public void method_BT9_path_66_67(){
		testSuiteHelper.newCurrentTestMethod("method_BT9_path_66_67", 20);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(81);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(81)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(81)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(81)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[2]/DIV[4]/INPUT[1], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={evlist=false, name=add, type=submit, value=Add to}}, source=HybridStateVertexImpl{id=81, name=state81}, target=HybridStateVertexImpl{id=82, name=state82}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/DIV[1]/FORM[1]/INPUT[1]"), "andrea"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/SELECT[1]"), "GWmvBZbI"));
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[2]/INPUT[2]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[2]/DIV[4]/SELECT[1]"), "GWmvBZbI"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(66), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(82);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 82");

			testSuiteHelper.addStateToReportBuilder(82);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(82)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(82)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(82)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[5]/UL[1]/LI[1]/A[2], element=Element{node=[A: null], tag=A, text=v8.0.0 - r475, attributes={evlist=false, href=notes.htm}}, source=HybridStateVertexImpl{id=82, name=state82}, target=HybridStateVertexImpl{id=10, name=state10}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(67), "Event fired: v8.0.0 - r475");
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

	@Test(priority=21)
	public void method_BT82_path_66_100068(){
		testSuiteHelper.newCurrentTestMethod("method_BT82_path_66_100068", 21);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(81);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(81)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(81)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(81)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[2]/DIV[4]/INPUT[1], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={evlist=false, name=add, type=submit, value=Add to}}, source=HybridStateVertexImpl{id=81, name=state81}, target=HybridStateVertexImpl{id=82, name=state82}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/DIV[1]/FORM[1]/INPUT[1]"), "andrea"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/SELECT[1]"), "GWmvBZbI"));
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[2]/INPUT[2]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[2]/DIV[4]/SELECT[1]"), "GWmvBZbI"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(66), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(82);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 82");

			testSuiteHelper.addStateToReportBuilder(82);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(82)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(82)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(82)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=home, attributes={anyaccess=action, evlist=false, href=./?group=GWmvBZbI}}, source=HybridStateVertexImpl{id=82, name=state82}, target=HybridStateVertexImpl{id=81, name=state81}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(100068), "Event fired: home");
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

	@Test(priority=22)
	public void method_BT82_path_66_100069_70_72(){
		testSuiteHelper.newCurrentTestMethod("method_BT82_path_66_100069_70_72", 22);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(81);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(81)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(81)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(81)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[2]/DIV[4]/INPUT[1], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={evlist=false, name=add, type=submit, value=Add to}}, source=HybridStateVertexImpl{id=81, name=state81}, target=HybridStateVertexImpl{id=82, name=state82}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/DIV[1]/FORM[1]/INPUT[1]"), "andrea"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/SELECT[1]"), "GWmvBZbI"));
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[2]/INPUT[2]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[2]/DIV[4]/SELECT[1]"), "GWmvBZbI"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(66), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(82);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 82");

			testSuiteHelper.addStateToReportBuilder(82);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(82)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(82)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(82)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=add new, attributes={anyaccess=action, evlist=false, href=edit.php?group=GWmvBZbI}}, source=HybridStateVertexImpl{id=82, name=state82}, target=HybridStateVertexImpl{id=99, name=state99}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(100069), "Event fired: add new");
			testSuiteHelper.runInCrawlingPlugins(99);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 99");

			testSuiteHelper.addStateToReportBuilder(99);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(99)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(99)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(99)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/INPUT[1], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={anyaccess=none, evlist=false, name=quickadd, type=submit, value=Next}}, source=HybridStateVertexImpl{id=99, name=state99}, target=HybridStateVertexImpl{id=100, name=state100}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/TEXTAREA[1]"), "1165 The Castings"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(70), "Event fired: ");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[5]/UL[1]/LI[1]/A[2], element=Element{node=[A: null], tag=A, text=v8.0.0 - r475, attributes={evlist=false, href=notes.htm}}, source=HybridStateVertexImpl{id=100, name=state100}, target=HybridStateVertexImpl{id=10, name=state10}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/INPUT[3]"), "Andrea"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/INPUT[4]"), "Stocco"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/INPUT[5]"), "BZDrXpgy"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/INPUT[6]"), "JmWQOnSF"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/INPUT[7]"), "gKJRcsOq"));
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/TEXTAREA[1]"), "1165 The Castings"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/INPUT[8]"), "XODYWJbX"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/INPUT[9]"), "FKgvZIFS"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/INPUT[10]"), "fgmPVIDJ"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/INPUT[11]"), "ChAhmCqA"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/INPUT[12]"), "tsigalko18@gmail.com"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/INPUT[13]"), "OQMtczNW"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/INPUT[14]"), "SoetPcWc"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/INPUT[15]"), "yZaGUGSN"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/SELECT[1]"), "18"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/SELECT[2]"), "August"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/INPUT[16]"), "August"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/SELECT[3]"), "3"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/SELECT[4]"), "May"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/INPUT[17]"), "yveDtSNZ"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/SELECT[5]"), "GWmvBZbI"));
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/TEXTAREA[2]"), "JXpgRSGP"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/INPUT[18]"), "ORFtrBoX"));
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/TEXTAREA[3]"), "pdItNkAq"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(72), "Event fired: v8.0.0 - r475");
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

	@Test(priority=23)
	public void method_BT99_path_66_100069_73_74_77(){
		testSuiteHelper.newCurrentTestMethod("method_BT99_path_66_100069_73_74_77", 23);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(81);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(81)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(81)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(81)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[2]/DIV[4]/INPUT[1], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={evlist=false, name=add, type=submit, value=Add to}}, source=HybridStateVertexImpl{id=81, name=state81}, target=HybridStateVertexImpl{id=82, name=state82}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/DIV[1]/FORM[1]/INPUT[1]"), "andrea"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/SELECT[1]"), "GWmvBZbI"));
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[2]/INPUT[2]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[2]/DIV[4]/SELECT[1]"), "GWmvBZbI"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(66), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(82);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 82");

			testSuiteHelper.addStateToReportBuilder(82);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(82)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(82)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(82)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=add new, attributes={anyaccess=action, evlist=false, href=edit.php?group=GWmvBZbI}}, source=HybridStateVertexImpl{id=82, name=state82}, target=HybridStateVertexImpl{id=99, name=state99}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(100069), "Event fired: add new");
			testSuiteHelper.runInCrawlingPlugins(99);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 99");

			testSuiteHelper.addStateToReportBuilder(99);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(99)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(99)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(99)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/INPUT[2], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={anyaccess=none, evlist=false, name=quickadd, type=submit, value=Next}}, source=HybridStateVertexImpl{id=99, name=state99}, target=HybridStateVertexImpl{id=100, name=state100}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/TEXTAREA[1]"), "1165 The Castings"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(73), "Event fired: ");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/INPUT[1], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={evlist=false, name=submit, type=submit, value=Enter}}, source=HybridStateVertexImpl{id=100, name=state100}, target=HybridStateVertexImpl{id=106, name=state106}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/INPUT[3]"), "Andrea"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/INPUT[4]"), "Stocco"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/INPUT[5]"), "kQjqtAzL"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/INPUT[6]"), "WMnYrYXm"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/INPUT[7]"), "QAxqdzdk"));
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/TEXTAREA[1]"), "1165 The Castings"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/INPUT[8]"), "qzVORnQc"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/INPUT[9]"), "BawBQYod"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/INPUT[10]"), "aZODjFAo"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/INPUT[11]"), "GuCGlDUf"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/INPUT[12]"), "tsigalko18@gmail.com"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/INPUT[13]"), "vOmbQeuM"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/INPUT[14]"), "CsbVopkX"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/INPUT[15]"), "bLYkqTkt"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/SELECT[1]"), "18"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/SELECT[2]"), "August"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/INPUT[16]"), "August"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/SELECT[3]"), "16"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/SELECT[4]"), "May"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/INPUT[17]"), "NwybHdFb"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/SELECT[5]"), "[none]"));
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/TEXTAREA[2]"), "ntTXXnBe"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/INPUT[18]"), "XAATHJoL"));
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/TEXTAREA[3]"), "zmbwzbsK"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(74), "Event fired: ");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[5]/UL[1]/LI[1]/A[2], element=Element{node=[A: null], tag=A, text=v8.0.0 - r475, attributes={evlist=false, href=notes.htm}}, source=HybridStateVertexImpl{id=106, name=state106}, target=HybridStateVertexImpl{id=10, name=state10}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(77), "Event fired: v8.0.0 - r475");
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

	@Test(priority=24)
	public void method_BT99_path_78_79(){
		testSuiteHelper.newCurrentTestMethod("method_BT99_path_78_79", 24);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(108);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(108)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(108)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(108)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[2]/TABLE[1]/TBODY[1]/TR[2]/TD[6]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={evlist=false, href=view.php?id=1}}, source=HybridStateVertexImpl{id=108, name=state108}, target=HybridStateVertexImpl{id=109, name=state109}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/DIV[1]/FORM[1]/INPUT[1]"), "andrea"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/SELECT[1]"), "[all]"));
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[2]/TABLE[1]/TBODY[1]/TR[2]/TD[1]/INPUT[1]"), "0"));
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[2]/INPUT[2]"), "0"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[2]/DIV[4]/SELECT[1]"), "GWmvBZbI"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(78), "Event fired: ");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[5]/UL[1]/LI[1]/A[2], element=Element{node=[A: null], tag=A, text=v8.0.0 - r475, attributes={evlist=false, href=notes.htm}}, source=HybridStateVertexImpl{id=109, name=state109}, target=HybridStateVertexImpl{id=10, name=state10}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(79), "Event fired: v8.0.0 - r475");
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

	@Test(priority=25)
	public void method_BT108_path_80_82(){
		testSuiteHelper.newCurrentTestMethod("method_BT108_path_80_82", 25);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(108);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(108)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(108)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(108)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[2]/TABLE[1]/TBODY[1]/TR[2]/TD[7]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={evlist=false, href=edit.php?id=1}}, source=HybridStateVertexImpl{id=108, name=state108}, target=HybridStateVertexImpl{id=112, name=state112}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/DIV[1]/FORM[1]/INPUT[1]"), "andrea"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/SELECT[1]"), "[all]"));
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[2]/TABLE[1]/TBODY[1]/TR[2]/TD[1]/INPUT[1]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[2]/INPUT[2]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[2]/DIV[4]/SELECT[1]"), "GWmvBZbI"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(80), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(112);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 112");

			testSuiteHelper.addStateToReportBuilder(112);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(112)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(112)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(112)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[5]/UL[1]/LI[1]/A[2], element=Element{node=[A: null], tag=A, text=v8.0.0 - r475, attributes={evlist=false, href=notes.htm}}, source=HybridStateVertexImpl{id=112, name=state112}, target=HybridStateVertexImpl{id=10, name=state10}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/INPUT[3]"), "Andrea"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/INPUT[4]"), "Stocco"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/INPUT[5]"), "uYkAcrko"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/INPUT[6]"), "uchBzfRs"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/INPUT[7]"), "gQoouzZQ"));
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/TEXTAREA[1]"), "1165 The Castings"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/INPUT[8]"), "cWVHMVRB"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/INPUT[9]"), "pjYZzeNs"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/INPUT[10]"), "OINRBxIN"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/INPUT[11]"), "CiYuaBPv"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/INPUT[12]"), "tsigalko18@gmail.com"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/INPUT[13]"), "ickQsqcX"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/INPUT[14]"), "NfuoDeAN"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/INPUT[15]"), "ljMAyGBR"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/SELECT[1]"), "18"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/SELECT[2]"), "August"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/INPUT[16]"), "August"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/SELECT[3]"), "2"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/SELECT[4]"), "November"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/INPUT[17]"), "oVBWtjkw"));
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/TEXTAREA[2]"), "IGBmVTAE"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/INPUT[18]"), "mhkdaRFR"));
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/TEXTAREA[3]"), "mNreGlIX"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(82), "Event fired: v8.0.0 - r475");
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

	@Test(priority=26)
	public void method_BT108_path_84(){
		testSuiteHelper.newCurrentTestMethod("method_BT108_path_84", 26);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(108);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(108)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(108)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(108)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[5]/UL[1]/LI[1]/A[2], element=Element{node=[A: null], tag=A, text=v8.0.0 - r475, attributes={evlist=false, href=notes.htm}}, source=HybridStateVertexImpl{id=108, name=state108}, target=HybridStateVertexImpl{id=10, name=state10}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/DIV[1]/FORM[1]/INPUT[1]"), "andrea"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/SELECT[1]"), "[none]"));
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[2]/TABLE[1]/TBODY[1]/TR[2]/TD[1]/INPUT[1]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[2]/INPUT[2]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[2]/DIV[4]/SELECT[1]"), "GWmvBZbI"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(84), "Event fired: v8.0.0 - r475");
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

	@Test(priority=27)
	public void method_BT108_path_85(){
		testSuiteHelper.newCurrentTestMethod("method_BT108_path_85", 27);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(108);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(108)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(108)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(108)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[2]/DIV[4]/INPUT[1], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={evlist=false, name=add, type=submit, value=Add to}}, source=HybridStateVertexImpl{id=108, name=state108}, target=HybridStateVertexImpl{id=118, name=state118}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/DIV[1]/FORM[1]/INPUT[1]"), "andrea"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/SELECT[1]"), "[none]"));
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[2]/TABLE[1]/TBODY[1]/TR[2]/TD[1]/INPUT[1]"), "0"));
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[2]/INPUT[2]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[2]/DIV[4]/SELECT[1]"), "GWmvBZbI"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(85), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(118);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 118");

			testSuiteHelper.addStateToReportBuilder(118);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(118)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(118)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(118)
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
	public void method_BT108_path_87(){
		testSuiteHelper.newCurrentTestMethod("method_BT108_path_87", 28);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(108);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(108)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(108)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(108)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[2]/DIV[2]/INPUT[1], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={evlist=false, onclick=DeleteSel(), type=button, value=Delete}}, source=HybridStateVertexImpl{id=108, name=state108}, target=HybridStateVertexImpl{id=121, name=state121}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/DIV[1]/FORM[1]/INPUT[1]"), "andrea"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/SELECT[1]"), "[all]"));
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[2]/TABLE[1]/TBODY[1]/TR[2]/TD[1]/INPUT[1]"), "0"));
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[2]/INPUT[2]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[2]/DIV[4]/SELECT[1]"), "GWmvBZbI"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(87), "Event fired: ");
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

	@Test(priority=29)
	public void method_BT100_path_66_100069_70_88(){
		testSuiteHelper.newCurrentTestMethod("method_BT100_path_66_100069_70_88", 29);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(81);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(81)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(81)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(81)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[2]/DIV[4]/INPUT[1], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={evlist=false, name=add, type=submit, value=Add to}}, source=HybridStateVertexImpl{id=81, name=state81}, target=HybridStateVertexImpl{id=82, name=state82}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/DIV[1]/FORM[1]/INPUT[1]"), "andrea"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/SELECT[1]"), "GWmvBZbI"));
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[2]/INPUT[2]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[2]/DIV[4]/SELECT[1]"), "GWmvBZbI"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(66), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(82);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 82");

			testSuiteHelper.addStateToReportBuilder(82);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(82)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(82)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(82)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=add new, attributes={anyaccess=action, evlist=false, href=edit.php?group=GWmvBZbI}}, source=HybridStateVertexImpl{id=82, name=state82}, target=HybridStateVertexImpl{id=99, name=state99}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(100069), "Event fired: add new");
			testSuiteHelper.runInCrawlingPlugins(99);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 99");

			testSuiteHelper.addStateToReportBuilder(99);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(99)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(99)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(99)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/INPUT[1], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={anyaccess=none, evlist=false, name=quickadd, type=submit, value=Next}}, source=HybridStateVertexImpl{id=99, name=state99}, target=HybridStateVertexImpl{id=100, name=state100}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/TEXTAREA[1]"), "1165 The Castings"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(70), "Event fired: ");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/INPUT[19], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={evlist=false, name=submit, type=submit, value=Enter}}, source=HybridStateVertexImpl{id=100, name=state100}, target=HybridStateVertexImpl{id=106, name=state106}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/INPUT[3]"), "Andrea"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/INPUT[4]"), "Stocco"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/INPUT[5]"), "zKlshMjV"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/INPUT[6]"), "tkmLrdXn"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/INPUT[7]"), "jntFEnrD"));
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/TEXTAREA[1]"), "1165 The Castings"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/INPUT[8]"), "avjbWWax"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/INPUT[9]"), "hcxIesAu"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/INPUT[10]"), "MXAMZqLB"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/INPUT[11]"), "xhJHQEPm"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/INPUT[12]"), "tsigalko18@gmail.com"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/INPUT[13]"), "lyetyiUd"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/INPUT[14]"), "UTdjONhP"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/INPUT[15]"), "HfMeqXEg"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/SELECT[1]"), "18"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/SELECT[2]"), "August"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/INPUT[16]"), "August"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/SELECT[3]"), "26"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/SELECT[4]"), "March"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/INPUT[17]"), "HhyxFINT"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/SELECT[5]"), "GWmvBZbI"));
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/TEXTAREA[2]"), "cYuDwEWV"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/INPUT[18]"), "aWxNBHEj"));
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/TEXTAREA[3]"), "eBNFMPNj"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(88), "Event fired: ");
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

	@Test(priority=30)
	public void method_BT99_path_100089(){
		testSuiteHelper.newCurrentTestMethod("method_BT99_path_100089", 30);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(108);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(108)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(108)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(108)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[2]/TABLE[1]/TBODY[1]/TR[1]/TH[2]/A[1], element=Element{node=[A: null], tag=A, text=Last name, attributes={anyaccess=action, class=fdTableSortTrigger, evlist=false, href=#, title=Sort on “Last name”}}, source=HybridStateVertexImpl{id=108, name=state108}, target=HybridStateVertexImpl{id=130, name=state130}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/DIV[1]/FORM[1]/INPUT[1]"), "andrea"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/SELECT[1]"), "[none]"));
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[2]/INPUT[2]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[2]/DIV[4]/SELECT[1]"), "GWmvBZbI"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(100089), "Event fired: Last name");
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

	@Test(priority=31)
	public void method_BT108_path_100090_91_100092_93_94(){
		testSuiteHelper.newCurrentTestMethod("method_BT108_path_100090_91_100092_93_94", 31);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(108);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(108)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(108)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(108)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[2]/TABLE[1]/TBODY[1]/TR[1]/TH[3]/A[1], element=Element{node=[A: null], tag=A, text=First name, attributes={anyaccess=action, class=fdTableSortTrigger, evlist=false, href=#, title=Sort on “First name”}}, source=HybridStateVertexImpl{id=108, name=state108}, target=HybridStateVertexImpl{id=132, name=state132}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/DIV[1]/FORM[1]/INPUT[1]"), "andrea"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/SELECT[1]"), "[all]"));
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[2]/INPUT[2]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[2]/DIV[4]/SELECT[1]"), "GWmvBZbI"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(100090), "Event fired: First name");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[2]/TABLE[1]/TBODY[1]/TR[1]/TH[4]/A[1], element=Element{node=[A: null], tag=A, text=E-mail, attributes={anyaccess=none, class=fdTableSortTrigger, evlist=false, href=#, title=Sort on “E-mail”}}, source=HybridStateVertexImpl{id=132, name=state132}, target=HybridStateVertexImpl{id=133, name=state133}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/DIV[1]/FORM[1]/INPUT[1]"), "andrea"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/SELECT[1]"), "[all]"));
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[2]/TABLE[1]/TBODY[1]/TR[2]/TD[1]/INPUT[1]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[2]/INPUT[2]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[2]/DIV[4]/SELECT[1]"), "GWmvBZbI"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(91), "Event fired: E-mail");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[2]/TABLE[1]/TBODY[1]/TR[2]/TD[6]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={anyaccess=action, evlist=false, href=view.php?id=2}}, source=HybridStateVertexImpl{id=133, name=state133}, target=HybridStateVertexImpl{id=134, name=state134}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/DIV[1]/FORM[1]/INPUT[1]"), "andrea"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/SELECT[1]"), "GWmvBZbI"));
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[2]/TABLE[1]/TBODY[1]/TR[2]/TD[1]/INPUT[1]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[2]/INPUT[2]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[2]/DIV[4]/SELECT[1]"), "GWmvBZbI"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(100092), "Event fired: ");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/INPUT[2], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={anyaccess=none, evlist=false, name=modifiy, type=submit, value=Modify}}, source=HybridStateVertexImpl{id=134, name=state134}, target=HybridStateVertexImpl{id=112, name=state112}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(93), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(112);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 112");

			testSuiteHelper.addStateToReportBuilder(112);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(112)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(112)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(112)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/INPUT[1], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={evlist=false, name=update, type=submit, value=Update}}, source=HybridStateVertexImpl{id=112, name=state112}, target=HybridStateVertexImpl{id=79, name=state79}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/INPUT[3]"), "Andrea"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/INPUT[4]"), "Stocco"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/INPUT[5]"), "dLTkLiEr"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/INPUT[6]"), "tVUoNYnq"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/INPUT[7]"), "BVChtqiC"));
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/TEXTAREA[1]"), "1165 The Castings"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/INPUT[8]"), "wHRRvPuW"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/INPUT[9]"), "dEQkZole"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/INPUT[10]"), "rJMiyfqK"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/INPUT[11]"), "rbLBzjCd"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/INPUT[12]"), "tsigalko18@gmail.com"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/INPUT[13]"), "OPXmTDuX"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/INPUT[14]"), "hJNOYizV"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/INPUT[15]"), "POhlXoRu"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/SELECT[1]"), "18"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/SELECT[2]"), "August"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/INPUT[16]"), "August"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/SELECT[3]"), "14"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/SELECT[4]"), "August"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/INPUT[17]"), "hUpdBqFa"));
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/TEXTAREA[2]"), "HDkFCTFa"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/INPUT[18]"), "sfjtNVhz"));
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/TEXTAREA[3]"), "GMufDRkf"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(94), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(79);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 79");

			testSuiteHelper.addStateToReportBuilder(79);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(79)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(79)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(79)
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
	public void method_BT132_path_100090_95(){
		testSuiteHelper.newCurrentTestMethod("method_BT132_path_100090_95", 32);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(108);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(108)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(108)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(108)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[2]/TABLE[1]/TBODY[1]/TR[1]/TH[3]/A[1], element=Element{node=[A: null], tag=A, text=First name, attributes={anyaccess=action, class=fdTableSortTrigger, evlist=false, href=#, title=Sort on “First name”}}, source=HybridStateVertexImpl{id=108, name=state108}, target=HybridStateVertexImpl{id=132, name=state132}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/DIV[1]/FORM[1]/INPUT[1]"), "andrea"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/SELECT[1]"), "[all]"));
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[2]/INPUT[2]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[2]/DIV[4]/SELECT[1]"), "GWmvBZbI"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(100090), "Event fired: First name");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[2]/TABLE[1]/TBODY[1]/TR[1]/TH[5]/A[1], element=Element{node=[A: null], tag=A, text=Telephone, attributes={anyaccess=none, class=fdTableSortTrigger, evlist=false, href=#, title=Sort on “Telephone”}}, source=HybridStateVertexImpl{id=132, name=state132}, target=HybridStateVertexImpl{id=139, name=state139}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/DIV[1]/FORM[1]/INPUT[1]"), "andrea"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/SELECT[1]"), "[none]"));
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.id, "2"), "1"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(95), "Event fired: Telephone");
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

	@Test(priority=33)
	public void method_BT132_path_100090_96_97(){
		testSuiteHelper.newCurrentTestMethod("method_BT132_path_100090_96_97", 33);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(108);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(108)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(108)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(108)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[2]/TABLE[1]/TBODY[1]/TR[1]/TH[3]/A[1], element=Element{node=[A: null], tag=A, text=First name, attributes={anyaccess=action, class=fdTableSortTrigger, evlist=false, href=#, title=Sort on “First name”}}, source=HybridStateVertexImpl{id=108, name=state108}, target=HybridStateVertexImpl{id=132, name=state132}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/DIV[1]/FORM[1]/INPUT[1]"), "andrea"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/SELECT[1]"), "[all]"));
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[2]/INPUT[2]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[2]/DIV[4]/SELECT[1]"), "GWmvBZbI"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(100090), "Event fired: First name");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[2]/DIV[1]/INPUT[1], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={evlist=false, onclick=MailSelection(), type=button, value=Send e-Mail}}, source=HybridStateVertexImpl{id=132, name=state132}, target=HybridStateVertexImpl{id=142, name=state142}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/DIV[1]/FORM[1]/INPUT[1]"), "andrea"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/SELECT[1]"), "GWmvBZbI"));
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[2]/TABLE[1]/TBODY[1]/TR[2]/TD[1]/INPUT[1]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[2]/INPUT[2]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[2]/DIV[4]/SELECT[1]"), "GWmvBZbI"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(96), "Event fired: ");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[5]/UL[1]/LI[1]/A[2], element=Element{node=[A: null], tag=A, text=v8.0.0 - r475, attributes={evlist=false, href=notes.htm}}, source=HybridStateVertexImpl{id=142, name=state142}, target=HybridStateVertexImpl{id=10, name=state10}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/DIV[1]/FORM[1]/INPUT[1]"), "andrea"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/SELECT[1]"), "GWmvBZbI"));
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[2]/TABLE[1]/TBODY[1]/TR[2]/TD[1]/INPUT[1]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[2]/INPUT[2]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[2]/DIV[4]/SELECT[1]"), "GWmvBZbI"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(97), "Event fired: v8.0.0 - r475");
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

	@Test(priority=34)
	public void method_BT142_path_100090_96_99(){
		testSuiteHelper.newCurrentTestMethod("method_BT142_path_100090_96_99", 34);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(108);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(108)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(108)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(108)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[2]/TABLE[1]/TBODY[1]/TR[1]/TH[3]/A[1], element=Element{node=[A: null], tag=A, text=First name, attributes={anyaccess=action, class=fdTableSortTrigger, evlist=false, href=#, title=Sort on “First name”}}, source=HybridStateVertexImpl{id=108, name=state108}, target=HybridStateVertexImpl{id=132, name=state132}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/DIV[1]/FORM[1]/INPUT[1]"), "andrea"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/SELECT[1]"), "[all]"));
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[2]/INPUT[2]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[2]/DIV[4]/SELECT[1]"), "GWmvBZbI"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(100090), "Event fired: First name");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[2]/DIV[1]/INPUT[1], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={evlist=false, onclick=MailSelection(), type=button, value=Send e-Mail}}, source=HybridStateVertexImpl{id=132, name=state132}, target=HybridStateVertexImpl{id=142, name=state142}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/DIV[1]/FORM[1]/INPUT[1]"), "andrea"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/SELECT[1]"), "GWmvBZbI"));
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[2]/TABLE[1]/TBODY[1]/TR[2]/TD[1]/INPUT[1]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[2]/INPUT[2]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[2]/DIV[4]/SELECT[1]"), "GWmvBZbI"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(96), "Event fired: ");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[2]/DIV[4]/INPUT[1], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={evlist=false, name=add, type=submit, value=Add to}}, source=HybridStateVertexImpl{id=142, name=state142}, target=HybridStateVertexImpl{id=82, name=state82}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/DIV[1]/FORM[1]/INPUT[1]"), "andrea"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/SELECT[1]"), "GWmvBZbI"));
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[2]/INPUT[2]"), "0"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[2]/DIV[4]/SELECT[1]"), "GWmvBZbI"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(99), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(82);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 82");

			testSuiteHelper.addStateToReportBuilder(82);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(82)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(82)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(82)
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
	public void method_BT142_path_100090_96_100(){
		testSuiteHelper.newCurrentTestMethod("method_BT142_path_100090_96_100", 35);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(108);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(108)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(108)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(108)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[2]/TABLE[1]/TBODY[1]/TR[1]/TH[3]/A[1], element=Element{node=[A: null], tag=A, text=First name, attributes={anyaccess=action, class=fdTableSortTrigger, evlist=false, href=#, title=Sort on “First name”}}, source=HybridStateVertexImpl{id=108, name=state108}, target=HybridStateVertexImpl{id=132, name=state132}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/DIV[1]/FORM[1]/INPUT[1]"), "andrea"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/SELECT[1]"), "[all]"));
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[2]/INPUT[2]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[2]/DIV[4]/SELECT[1]"), "GWmvBZbI"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(100090), "Event fired: First name");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[2]/DIV[1]/INPUT[1], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={evlist=false, onclick=MailSelection(), type=button, value=Send e-Mail}}, source=HybridStateVertexImpl{id=132, name=state132}, target=HybridStateVertexImpl{id=142, name=state142}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/DIV[1]/FORM[1]/INPUT[1]"), "andrea"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/SELECT[1]"), "GWmvBZbI"));
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[2]/TABLE[1]/TBODY[1]/TR[2]/TD[1]/INPUT[1]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[2]/INPUT[2]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[2]/DIV[4]/SELECT[1]"), "GWmvBZbI"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(96), "Event fired: ");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[2]/DIV[1]/INPUT[1], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={evlist=false, onclick=MailSelection(), type=button, value=Send e-Mail}}, source=HybridStateVertexImpl{id=142, name=state142}, target=HybridStateVertexImpl{id=108, name=state108}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/DIV[1]/FORM[1]/INPUT[1]"), "andrea"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/SELECT[1]"), "[all]"));
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[2]/TABLE[1]/TBODY[1]/TR[2]/TD[1]/INPUT[1]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[2]/INPUT[2]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[2]/DIV[4]/SELECT[1]"), "GWmvBZbI"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(100), "Event fired: ");
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
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=36)
	public void method_BT142_path_100090_96_101(){
		testSuiteHelper.newCurrentTestMethod("method_BT142_path_100090_96_101", 36);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(108);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(108)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(108)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(108)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[2]/TABLE[1]/TBODY[1]/TR[1]/TH[3]/A[1], element=Element{node=[A: null], tag=A, text=First name, attributes={anyaccess=action, class=fdTableSortTrigger, evlist=false, href=#, title=Sort on “First name”}}, source=HybridStateVertexImpl{id=108, name=state108}, target=HybridStateVertexImpl{id=132, name=state132}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/DIV[1]/FORM[1]/INPUT[1]"), "andrea"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/SELECT[1]"), "[all]"));
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[2]/INPUT[2]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[2]/DIV[4]/SELECT[1]"), "GWmvBZbI"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(100090), "Event fired: First name");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[2]/DIV[1]/INPUT[1], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={evlist=false, onclick=MailSelection(), type=button, value=Send e-Mail}}, source=HybridStateVertexImpl{id=132, name=state132}, target=HybridStateVertexImpl{id=142, name=state142}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/DIV[1]/FORM[1]/INPUT[1]"), "andrea"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/SELECT[1]"), "GWmvBZbI"));
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[2]/TABLE[1]/TBODY[1]/TR[2]/TD[1]/INPUT[1]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[2]/INPUT[2]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[2]/DIV[4]/SELECT[1]"), "GWmvBZbI"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(96), "Event fired: ");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[2]/DIV[2]/INPUT[1], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={evlist=false, onclick=DeleteSel(), type=button, value=Delete}}, source=HybridStateVertexImpl{id=142, name=state142}, target=HybridStateVertexImpl{id=121, name=state121}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/DIV[1]/FORM[1]/INPUT[1]"), "andrea"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/SELECT[1]"), "[all]"));
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[2]/TABLE[1]/TBODY[1]/TR[2]/TD[1]/INPUT[1]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[2]/INPUT[2]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[2]/DIV[4]/SELECT[1]"), "GWmvBZbI"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(101), "Event fired: ");
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

	@Test(priority=37)
	public void method_BT99_path_66_100069_102(){
		testSuiteHelper.newCurrentTestMethod("method_BT99_path_66_100069_102", 37);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(81);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(81)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(81)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(81)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[2]/DIV[4]/INPUT[1], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={evlist=false, name=add, type=submit, value=Add to}}, source=HybridStateVertexImpl{id=81, name=state81}, target=HybridStateVertexImpl{id=82, name=state82}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/DIV[1]/FORM[1]/INPUT[1]"), "andrea"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/SELECT[1]"), "GWmvBZbI"));
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[2]/INPUT[2]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[2]/DIV[4]/SELECT[1]"), "GWmvBZbI"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(66), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(82);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 82");

			testSuiteHelper.addStateToReportBuilder(82);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(82)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(82)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(82)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=add new, attributes={anyaccess=action, evlist=false, href=edit.php?group=GWmvBZbI}}, source=HybridStateVertexImpl{id=82, name=state82}, target=HybridStateVertexImpl{id=99, name=state99}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(100069), "Event fired: add new");
			testSuiteHelper.runInCrawlingPlugins(99);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 99");

			testSuiteHelper.addStateToReportBuilder(99);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(99)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(99)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(99)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[5]/UL[1]/LI[1]/A[2], element=Element{node=[A: null], tag=A, text=v8.0.0 - r475, attributes={evlist=false, href=notes.htm}}, source=HybridStateVertexImpl{id=99, name=state99}, target=HybridStateVertexImpl{id=10, name=state10}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/TEXTAREA[1]"), "1165 The Castings"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(102), "Event fired: v8.0.0 - r475");
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

	@Test(priority=38)
	public void method_BT82_path_66_100103_104(){
		testSuiteHelper.newCurrentTestMethod("method_BT82_path_66_100103_104", 38);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(81);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(81)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(81)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(81)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[2]/DIV[4]/INPUT[1], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={evlist=false, name=add, type=submit, value=Add to}}, source=HybridStateVertexImpl{id=81, name=state81}, target=HybridStateVertexImpl{id=82, name=state82}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/DIV[1]/FORM[1]/INPUT[1]"), "andrea"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/SELECT[1]"), "GWmvBZbI"));
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[2]/INPUT[2]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[2]/DIV[4]/SELECT[1]"), "GWmvBZbI"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(66), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(82);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 82");

			testSuiteHelper.addStateToReportBuilder(82);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(82)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(82)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(82)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[3]/UL[1]/LI[3]/A[1], element=Element{node=[A: null], tag=A, text=groups, attributes={anyaccess=action, evlist=false, href=group.php?group=GWmvBZbI}}, source=HybridStateVertexImpl{id=82, name=state82}, target=HybridStateVertexImpl{id=171, name=state171}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(100103), "Event fired: groups");
			testSuiteHelper.runInCrawlingPlugins(171);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 171");

			testSuiteHelper.addStateToReportBuilder(171);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(171)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(171)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(171)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[5]/UL[1]/LI[1]/A[2], element=Element{node=[A: null], tag=A, text=v8.0.0 - r475, attributes={evlist=false, href=notes.htm}}, source=HybridStateVertexImpl{id=171, name=state171}, target=HybridStateVertexImpl{id=10, name=state10}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/INPUT[4]"), "1"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(104), "Event fired: v8.0.0 - r475");
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

	@Test(priority=39)
	public void method_BT171_path_66_100103_105(){
		testSuiteHelper.newCurrentTestMethod("method_BT171_path_66_100103_105", 39);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(81);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(81)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(81)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(81)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[2]/DIV[4]/INPUT[1], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={evlist=false, name=add, type=submit, value=Add to}}, source=HybridStateVertexImpl{id=81, name=state81}, target=HybridStateVertexImpl{id=82, name=state82}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/DIV[1]/FORM[1]/INPUT[1]"), "andrea"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/SELECT[1]"), "GWmvBZbI"));
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[2]/INPUT[2]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[2]/DIV[4]/SELECT[1]"), "GWmvBZbI"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(66), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(82);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 82");

			testSuiteHelper.addStateToReportBuilder(82);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(82)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(82)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(82)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[3]/UL[1]/LI[3]/A[1], element=Element{node=[A: null], tag=A, text=groups, attributes={anyaccess=action, evlist=false, href=group.php?group=GWmvBZbI}}, source=HybridStateVertexImpl{id=82, name=state82}, target=HybridStateVertexImpl{id=171, name=state171}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(100103), "Event fired: groups");
			testSuiteHelper.runInCrawlingPlugins(171);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 171");

			testSuiteHelper.addStateToReportBuilder(171);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(171)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(171)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(171)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/INPUT[1], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={evlist=false, name=new, type=submit, value=New group}}, source=HybridStateVertexImpl{id=171, name=state171}, target=HybridStateVertexImpl{id=61, name=state61}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/INPUT[4]"), "0"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(105), "Event fired: ");
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
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=40)
	public void method_BT171_path_66_100103_106_107(){
		testSuiteHelper.newCurrentTestMethod("method_BT171_path_66_100103_106_107", 40);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(81);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(81)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(81)
				&& allStatesIdentical;
		}
		if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
			allStatesIdentical = testSuiteHelper.fragDiffBool(81)
				&& allStatesIdentical;				
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[2]/DIV[4]/INPUT[1], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={evlist=false, name=add, type=submit, value=Add to}}, source=HybridStateVertexImpl{id=81, name=state81}, target=HybridStateVertexImpl{id=82, name=state82}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/DIV[1]/FORM[1]/INPUT[1]"), "andrea"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/SELECT[1]"), "GWmvBZbI"));
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[2]/INPUT[2]"), "1"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[2]/DIV[4]/SELECT[1]"), "GWmvBZbI"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(66), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(82);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 82");

			testSuiteHelper.addStateToReportBuilder(82);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(82)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(82)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(82)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[3]/UL[1]/LI[3]/A[1], element=Element{node=[A: null], tag=A, text=groups, attributes={anyaccess=action, evlist=false, href=group.php?group=GWmvBZbI}}, source=HybridStateVertexImpl{id=82, name=state82}, target=HybridStateVertexImpl{id=171, name=state171}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(100103), "Event fired: groups");
			testSuiteHelper.runInCrawlingPlugins(171);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 171");

			testSuiteHelper.addStateToReportBuilder(171);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(171)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(171)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(171)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/INPUT[2], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={evlist=false, name=delete, type=submit, value=Delete group(s)}}, source=HybridStateVertexImpl{id=171, name=state171}, target=HybridStateVertexImpl{id=67, name=state67}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/INPUT[4]"), "1"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(106), "Event fired: ");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[5]/UL[1]/LI[1]/A[2], element=Element{node=[A: null], tag=A, text=v8.0.0 - r475, attributes={evlist=false, href=notes.htm}}, source=HybridStateVertexImpl{id=67, name=state67}, target=HybridStateVertexImpl{id=10, name=state10}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(107), "Event fired: v8.0.0 - r475");
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

	@Test(priority=41)
	public void method_BT17_path_23_108(){
		testSuiteHelper.newCurrentTestMethod("method_BT17_path_23_108", 41);
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
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[3]/UL[1]/LI[3]/A[1], element=Element{node=[A: null], tag=A, text=groups, attributes={evlist=false, href=group.php}}, source=HybridStateVertexImpl{id=3, name=state3}, target=HybridStateVertexImpl{id=17, name=state17}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/DIV[1]/FORM[1]/INPUT[1]"), "andrea"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/SELECT[1]"), "[all]"));
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[2]/INPUT[2]"), "1"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(23), "Event fired: groups");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/INPUT[5], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={evlist=false, name=delete, type=submit, value=Delete group(s)}}, source=HybridStateVertexImpl{id=17, name=state17}, target=HybridStateVertexImpl{id=67, name=state67}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(108), "Event fired: ");
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
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=42)
	public void method_BT17_path_23_109_110_100111(){
		testSuiteHelper.newCurrentTestMethod("method_BT17_path_23_109_110_100111", 42);
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
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[3]/UL[1]/LI[3]/A[1], element=Element{node=[A: null], tag=A, text=groups, attributes={evlist=false, href=group.php}}, source=HybridStateVertexImpl{id=3, name=state3}, target=HybridStateVertexImpl{id=17, name=state17}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/DIV[1]/FORM[1]/INPUT[1]"), "andrea"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/SELECT[1]"), "[all]"));
			formInputs.add(new FormInput(FormInput.InputType.CHECKBOX, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[2]/INPUT[2]"), "1"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(23), "Event fired: groups");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/INPUT[6], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={evlist=false, name=edit, type=submit, value=Edit group}}, source=HybridStateVertexImpl{id=17, name=state17}, target=HybridStateVertexImpl{id=69, name=state69}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(109), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(69);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 69");

			testSuiteHelper.addStateToReportBuilder(69);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(69)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(69)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(69)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/INPUT[3], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={evlist=false, name=update, type=submit, value=Update}}, source=HybridStateVertexImpl{id=69, name=state69}, target=HybridStateVertexImpl{id=79, name=state79}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/INPUT[2]"), "LrSRjhUE"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/SELECT[1]"), "[none]"));
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/TEXTAREA[1]"), "XJzJWrRC"));
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/TEXTAREA[2]"), "gtVOOulo"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(110), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(79);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 79");

			testSuiteHelper.addStateToReportBuilder(79);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(79)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(79)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(79)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[4]/DIV[1]/I[1]/A[1], element=Element{node=[A: null], tag=A, text=group page, attributes={anyaccess=action, evlist=false, href=group.php}}, source=HybridStateVertexImpl{id=79, name=state79}, target=HybridStateVertexImpl{id=17, name=state17}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(100111), "Event fired: group page");
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
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}


}	 
