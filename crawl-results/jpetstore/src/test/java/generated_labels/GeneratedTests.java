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
 * Generated @ Fri Oct 08 13:11:34 CDT 2021
 */

public class GeneratedTests {
	private final boolean mutate = true;
    private final String URL = "http://localhost:8080/jpetstore/";
	private TestSuiteHelper testSuiteHelper;
	
	private final String CRAWL_PATH = "/Users/liuyu/projects/tackle-test-generator-ui-level/testlabeling/results/frag-gen-updated/jpetstore";

	private StateEquivalenceAssertionMode assertionMode = StateEquivalenceAssertionMode.BOTH;
	
	private CrawljaxConfiguration getTestConfiguration() {
		CrawljaxConfigurationBuilder builder = CrawljaxConfiguration.builderFor(URL);
		builder.crawlRules().waitAfterEvent(500, TimeUnit.MILLISECONDS);
		builder.crawlRules().waitAfterReloadUrl(500, TimeUnit.MILLISECONDS);
		builder.setBrowserConfig(new BrowserConfiguration(BrowserType.CHROME, 1, new BrowserOptions(false, -1)));
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
			
			if (assertionMode != StateEquivalenceAssertionMode.NONE){
				
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
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=2)
	public void method_BT0_path_1_3_4_5_6_7(){
		testSuiteHelper.newCurrentTestMethod("method_BT0_path_1_3_4_5_6_7", 2);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(0);

		if (assertionMode != StateEquivalenceAssertionMode.NONE){
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
		}
		try {
			/* Label - store */
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/P[1]/A[1], element=Element{node=null, tag=A, text=Enter the Store, attributes={evlist=false, href=actions/Catalog.action}}, source=0, target=2} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1), "Event fired: Enter the Store");
			testSuiteHelper.runInCrawlingPlugins(2);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 2");

			testSuiteHelper.addStateToReportBuilder(2);
			
			if (assertionMode != StateEquivalenceAssertionMode.NONE){
				
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
			}
			
			/* Label - view cart */
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/A[1], element=Element{node=null, tag=A, text=, attributes={evlist=false, href=/jpetstore/actions/Cart.action;jsessionid=CBE38E7BFD1E93E99C2B87D154700A6F?viewCart=}}, source=2, target=4} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/DIV[1]/FORM[1]/INPUT[1]"), "Bulldog"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(3), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(4);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 4");

			testSuiteHelper.addStateToReportBuilder(4);
			
			if (assertionMode != StateEquivalenceAssertionMode.NONE){
				
				if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(4)
										&& allStatesIdentical;
				}
	
				if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
				    /* Perform a visual diff on the two states. */
				    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(4)
						&& allStatesIdentical;
				}
				if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
					allStatesIdentical = testSuiteHelper.fragDiffBool(4)
						&& allStatesIdentical;	
				}
			}
			
			/* Label - account none username password */
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/A[2], element=Element{node=null, tag=A, text=Sign In, attributes={evlist=false, anyaccess=none, href=/jpetstore/actions/Account.action?signonForm=}}, source=4, target=5} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/DIV[1]/FORM[1]/INPUT[1]"), "Bulldog"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(4), "Event fired: Sign In");
			testSuiteHelper.runInCrawlingPlugins(5);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 5");

			testSuiteHelper.addStateToReportBuilder(5);
			
			if (assertionMode != StateEquivalenceAssertionMode.NONE){
				
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
			}
			
			/* Label - account password new repeat */
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[2]/DIV[1]/A[1], element=Element{node=null, tag=A, text=Register Now!, attributes={evlist=false, href=/jpetstore/actions/Account.action?newAccountForm=}}, source=5, target=6} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/DIV[1]/FORM[1]/INPUT[1]"), "Bulldog"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[2]/DIV[1]/FORM[1]/P[2]/INPUT[1]"), "123"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[2]/DIV[1]/FORM[1]/P[2]/INPUT[2]"), "123123"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(5), "Event fired: Register Now!");
			testSuiteHelper.runInCrawlingPlugins(6);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 6");

			testSuiteHelper.addStateToReportBuilder(6);
			
			if (assertionMode != StateEquivalenceAssertionMode.NONE){
				
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
			}
			
			/* Label - account save id category */
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[2]/DIV[1]/FORM[1]/INPUT[1], element=Element{node=null, tag=INPUT, text=, attributes={evlist=false, name=newAccount, type=submit, value=Save Account Information}}, source=6, target=2} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/DIV[1]/FORM[1]/INPUT[1]"), "Bulldog"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[2]/DIV[1]/FORM[1]/TABLE[1]/TBODY[1]/TR[1]/TD[2]/INPUT[1]"), "123"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[2]/DIV[1]/FORM[1]/TABLE[1]/TBODY[1]/TR[2]/TD[2]/INPUT[1]"), "123123"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[2]/DIV[1]/FORM[1]/TABLE[1]/TBODY[1]/TR[3]/TD[2]/INPUT[1]"), "123123"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[2]/DIV[1]/FORM[1]/TABLE[2]/TBODY[1]/TR[1]/TD[2]/INPUT[1]"), "Y"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[2]/DIV[1]/FORM[1]/TABLE[2]/TBODY[1]/TR[2]/TD[2]/INPUT[1]"), "L"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[2]/DIV[1]/FORM[1]/TABLE[2]/TBODY[1]/TR[3]/TD[2]/INPUT[1]"), "yul@utexas.edu"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[2]/DIV[1]/FORM[1]/TABLE[2]/TBODY[1]/TR[4]/TD[2]/INPUT[1]"), "5122005208"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[2]/DIV[1]/FORM[1]/TABLE[2]/TBODY[1]/TR[5]/TD[2]/INPUT[1]"), "27 nu st"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[2]/DIV[1]/FORM[1]/TABLE[2]/TBODY[1]/TR[6]/TD[2]/INPUT[1]"), "apt 223"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[2]/DIV[1]/FORM[1]/TABLE[2]/TBODY[1]/TR[7]/TD[2]/INPUT[1]"), "Austin"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[2]/DIV[1]/FORM[1]/TABLE[2]/TBODY[1]/TR[8]/TD[2]/INPUT[1]"), "TX"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[2]/DIV[1]/FORM[1]/TABLE[2]/TBODY[1]/TR[9]/TD[2]/INPUT[1]"), "78705"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[2]/DIV[1]/FORM[1]/TABLE[2]/TBODY[1]/TR[10]/TD[2]/INPUT[1]"), "US"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(6), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(2);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 2");

			testSuiteHelper.addStateToReportBuilder(2);
			
			if (assertionMode != StateEquivalenceAssertionMode.NONE){
				
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
			}
			
			/* Label - help pet store */
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/A[3], element=Element{node=null, tag=A, text=?, attributes={evlist=false, href=../help.html}}, source=2, target=8} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/DIV[1]/FORM[1]/INPUT[1]"), "Bulldog"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(7), "Event fired: ?");
			testSuiteHelper.runInCrawlingPlugins(8);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 8");

			testSuiteHelper.addStateToReportBuilder(8);
			
			if (assertionMode != StateEquivalenceAssertionMode.NONE){
				
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
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=3)
	public void method_BT2_path_1_29_30_31_32_33_34_35_36_37_38_39_40_41_42(){
		testSuiteHelper.newCurrentTestMethod("method_BT2_path_1_29_30_31_32_33_34_35_36_37_38_39_40_41_42", 3);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(0);

		if (assertionMode != StateEquivalenceAssertionMode.NONE){
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
		}
		try {
			/* Label - id attribute store catalog */
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/P[1]/A[1], element=Element{node=null, tag=A, text=Enter the Store, attributes={evlist=false, href=actions/Catalog.action}}, source=0, target=2} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1), "Event fired: Enter the Store");
			testSuiteHelper.runInCrawlingPlugins(2);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 2");

			testSuiteHelper.addStateToReportBuilder(2);
			
			if (assertionMode != StateEquivalenceAssertionMode.NONE){
				
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
			}
			
			/* Label - id view category catalog action */
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[4]/A[1], element=Element{node=null, tag=A, text=, attributes={evlist=false, href=/jpetstore/actions/Catalog.action;jsessionid=CBE38E7BFD1E93E99C2B87D154700A6F?viewCategory=&categoryId=FISH}}, source=2, target=23} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/DIV[1]/FORM[1]/INPUT[1]"), "Bulldog"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(29), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(23);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 23");

			testSuiteHelper.addStateToReportBuilder(23);
			
			if (assertionMode != StateEquivalenceAssertionMode.NONE){
				
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
			}
			
			/* Label - id value product angelfish */
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[2]/DIV[2]/TABLE[1]/TBODY[1]/TR[2]/TD[1]/A[1], element=Element{node=null, tag=A, text=FI-SW-01, attributes={evlist=false, href=/jpetstore/actions/Catalog.action?viewProduct=&productId=FI-SW-01}}, source=23, target=24} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/DIV[1]/FORM[1]/INPUT[1]"), "Bulldog"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(30), "Event fired: FI-SW-01");
			testSuiteHelper.runInCrawlingPlugins(24);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 24");

			testSuiteHelper.addStateToReportBuilder(24);
			
			if (assertionMode != StateEquivalenceAssertionMode.NONE){
				
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
			}
			
			/* Label - id item image fish */
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[2]/DIV[2]/TABLE[1]/TBODY[1]/TR[2]/TD[1]/A[1], element=Element{node=null, tag=A, text=EST-1, attributes={evlist=false, anyaccess=none, href=/jpetstore/actions/Catalog.action?viewItem=&itemId=EST-1}}, source=24, target=25} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/DIV[1]/FORM[1]/INPUT[1]"), "Bulldog"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(31), "Event fired: EST-1");
			testSuiteHelper.runInCrawlingPlugins(25);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 25");

			testSuiteHelper.addStateToReportBuilder(25);
			
			if (assertionMode != StateEquivalenceAssertionMode.NONE){
				
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
			}
			
			/* Label - id value cart product */
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[2]/DIV[1]/A[1], element=Element{node=null, tag=A, text=Return to FI-SW-01, attributes={evlist=false, href=/jpetstore/actions/Catalog.action?viewProduct=&productId=FI-SW-01}}, source=25, target=24} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/DIV[1]/FORM[1]/INPUT[1]"), "Bulldog"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(32), "Event fired: Return to FI-SW-01");
			testSuiteHelper.runInCrawlingPlugins(24);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 24");

			testSuiteHelper.addStateToReportBuilder(24);
			
			if (assertionMode != StateEquivalenceAssertionMode.NONE){
				
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
			}
			
			/* Label - cart add action */
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[2]/DIV[2]/TABLE[1]/TBODY[1]/TR[2]/TD[5]/A[1], element=Element{node=null, tag=A, text=Add to Cart, attributes={evlist=false, anyaccess=none, href=/jpetstore/actions/Cart.action?addItemToCart=&workingItemId=EST-1, class=Button}}, source=24, target=27} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/DIV[1]/FORM[1]/INPUT[1]"), "Bulldog"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(33), "Event fired: Add to Cart");
			testSuiteHelper.runInCrawlingPlugins(27);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 27");

			testSuiteHelper.addStateToReportBuilder(27);
			
			if (assertionMode != StateEquivalenceAssertionMode.NONE){
				
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
			}
			
			/* Label - id item fish attribute */
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[2]/DIV[2]/DIV[1]/FORM[1]/TABLE[1]/TBODY[1]/TR[2]/TD[1]/A[1], element=Element{node=null, tag=A, text=EST-1, attributes={evlist=false, href=/jpetstore/actions/Catalog.action?viewItem=&itemId=EST-1}}, source=27, target=25} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/DIV[1]/FORM[1]/INPUT[1]"), "Bulldog"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(34), "Event fired: EST-1");
			testSuiteHelper.runInCrawlingPlugins(25);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 25");

			testSuiteHelper.addStateToReportBuilder(25);
			
			if (assertionMode != StateEquivalenceAssertionMode.NONE){
				
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
			}
			
			/* Label - item cart add */
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[2]/DIV[2]/TABLE[1]/TBODY[1]/TR[7]/TD[1]/A[1], element=Element{node=null, tag=A, text=Add to Cart, attributes={evlist=false, href=/jpetstore/actions/Cart.action?addItemToCart=&workingItemId=EST-1, class=Button}}, source=25, target=27} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/DIV[1]/FORM[1]/INPUT[1]"), "Bulldog"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(35), "Event fired: Add to Cart");
			testSuiteHelper.runInCrawlingPlugins(27);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 27");

			testSuiteHelper.addStateToReportBuilder(27);
			
			if (assertionMode != StateEquivalenceAssertionMode.NONE){
				
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
			}
			
			/* Label - total cart remove */
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[2]/DIV[2]/DIV[1]/FORM[1]/TABLE[1]/TBODY[1]/TR[2]/TD[8]/A[1], element=Element{node=null, tag=A, text=Remove, attributes={evlist=false, href=/jpetstore/actions/Cart.action?removeItemFromCart=&workingItemId=EST-1, class=Button}}, source=27, target=4} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/DIV[1]/FORM[1]/INPUT[1]"), "Bulldog"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(36), "Event fired: Remove");
			testSuiteHelper.runInCrawlingPlugins(4);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 4");

			testSuiteHelper.addStateToReportBuilder(4);
			
			if (assertionMode != StateEquivalenceAssertionMode.NONE){
				
				if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(4)
										&& allStatesIdentical;
				}
	
				if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
				    /* Perform a visual diff on the two states. */
				    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(4)
						&& allStatesIdentical;
				}
				if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
					allStatesIdentical = testSuiteHelper.fragDiffBool(4)
						&& allStatesIdentical;	
				}
			}
			
			/* Label - id dog view category value */
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[4]/A[2], element=Element{node=null, tag=A, text=, attributes={evlist=false, anyaccess=none, href=/jpetstore/actions/Catalog.action?viewCategory=&categoryId=DOGS}}, source=4, target=31} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/DIV[1]/FORM[1]/INPUT[1]"), "Bulldog"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(37), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(31);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 31");

			testSuiteHelper.addStateToReportBuilder(31);
			
			if (assertionMode != StateEquivalenceAssertionMode.NONE){
				
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
			}
			
			/* Label - id value product angelfish */
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[2]/DIV[2]/TABLE[1]/TBODY[1]/TR[2]/TD[1]/A[1], element=Element{node=null, tag=A, text=K9-BD-01, attributes={evlist=false, href=/jpetstore/actions/Catalog.action?viewProduct=&productId=K9-BD-01}}, source=31, target=24} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/DIV[1]/FORM[1]/INPUT[1]"), "Bulldog"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(38), "Event fired: K9-BD-01");
			testSuiteHelper.runInCrawlingPlugins(24);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 24");

			testSuiteHelper.addStateToReportBuilder(24);
			
			if (assertionMode != StateEquivalenceAssertionMode.NONE){
				
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
			}
			
			/* Label - id bulldog value category */
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[2]/DIV[1]/A[1], element=Element{node=null, tag=A, text=Return to FISH, attributes={evlist=false, href=/jpetstore/actions/Catalog.action?viewCategory=&categoryId=FISH}}, source=24, target=31} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/DIV[1]/FORM[1]/INPUT[1]"), "Bulldog"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(39), "Event fired: Return to FISH");
			testSuiteHelper.runInCrawlingPlugins(31);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 31");

			testSuiteHelper.addStateToReportBuilder(31);
			
			if (assertionMode != StateEquivalenceAssertionMode.NONE){
				
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
			}
			
			/* Label - id catalog product action */
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[2]/DIV[2]/TABLE[1]/TBODY[1]/TR[3]/TD[1]/A[1], element=Element{node=null, tag=A, text=K9-PO-02, attributes={evlist=false, href=/jpetstore/actions/Catalog.action?viewProduct=&productId=K9-PO-02}}, source=31, target=34} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/DIV[1]/FORM[1]/INPUT[1]"), "Bulldog"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(40), "Event fired: K9-PO-02");
			testSuiteHelper.runInCrawlingPlugins(34);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 34");

			testSuiteHelper.addStateToReportBuilder(34);
			
			if (assertionMode != StateEquivalenceAssertionMode.NONE){
				
				if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(34)
										&& allStatesIdentical;
				}
	
				if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
				    /* Perform a visual diff on the two states. */
				    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(34)
						&& allStatesIdentical;
				}
				if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
					allStatesIdentical = testSuiteHelper.fragDiffBool(34)
						&& allStatesIdentical;	
				}
			}
			
			/* Label - id bulldog value category */
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[2]/DIV[1]/A[1], element=Element{node=null, tag=A, text=Return to DOGS, attributes={evlist=false, href=/jpetstore/actions/Catalog.action?viewCategory=&categoryId=DOGS}}, source=34, target=31} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/DIV[1]/FORM[1]/INPUT[1]"), "Bulldog"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(41), "Event fired: Return to DOGS");
			testSuiteHelper.runInCrawlingPlugins(31);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 31");

			testSuiteHelper.addStateToReportBuilder(31);
			
			if (assertionMode != StateEquivalenceAssertionMode.NONE){
				
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
			}
			
			/* Label - id action product angelfish */
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[2]/DIV[2]/TABLE[1]/TBODY[1]/TR[4]/TD[1]/A[1], element=Element{node=null, tag=A, text=K9-DL-01, attributes={evlist=false, href=/jpetstore/actions/Catalog.action?viewProduct=&productId=K9-DL-01}}, source=31, target=24} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/DIV[1]/FORM[1]/INPUT[1]"), "Bulldog"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(42), "Event fired: K9-DL-01");
			testSuiteHelper.runInCrawlingPlugins(24);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 24");

			testSuiteHelper.addStateToReportBuilder(24);
			
			if (assertionMode != StateEquivalenceAssertionMode.NONE){
				
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
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=4)
	public void method_BT2_path_1_43_44(){
		testSuiteHelper.newCurrentTestMethod("method_BT2_path_1_43_44", 4);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(0);

		if (assertionMode != StateEquivalenceAssertionMode.NONE){
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
		}
		try {
			/* Label - id attribute store catalog */
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/P[1]/A[1], element=Element{node=null, tag=A, text=Enter the Store, attributes={evlist=false, href=actions/Catalog.action}}, source=0, target=2} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1), "Event fired: Enter the Store");
			testSuiteHelper.runInCrawlingPlugins(2);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 2");

			testSuiteHelper.addStateToReportBuilder(2);
			
			if (assertionMode != StateEquivalenceAssertionMode.NONE){
				
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
			}
			
			/* Label - id view category catalog action */
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[4]/A[3], element=Element{node=null, tag=A, text=, attributes={evlist=false, href=/jpetstore/actions/Catalog.action;jsessionid=CBE38E7BFD1E93E99C2B87D154700A6F?viewCategory=&categoryId=REPTILES}}, source=2, target=39} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/DIV[1]/FORM[1]/INPUT[1]"), "Bulldog"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(43), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(39);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 39");

			testSuiteHelper.addStateToReportBuilder(39);
			
			if (assertionMode != StateEquivalenceAssertionMode.NONE){
				
				if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(39)
										&& allStatesIdentical;
				}
	
				if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
				    /* Perform a visual diff on the two states. */
				    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(39)
						&& allStatesIdentical;
				}
				if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
					allStatesIdentical = testSuiteHelper.fragDiffBool(39)
						&& allStatesIdentical;	
				}
			}
			
			/* Label - id value product angelfish */
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[2]/DIV[2]/TABLE[1]/TBODY[1]/TR[2]/TD[1]/A[1], element=Element{node=null, tag=A, text=RP-SN-01, attributes={evlist=false, href=/jpetstore/actions/Catalog.action?viewProduct=&productId=RP-SN-01}}, source=39, target=24} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/DIV[1]/FORM[1]/INPUT[1]"), "Bulldog"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(44), "Event fired: RP-SN-01");
			testSuiteHelper.runInCrawlingPlugins(24);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 24");

			testSuiteHelper.addStateToReportBuilder(24);
			
			if (assertionMode != StateEquivalenceAssertionMode.NONE){
				
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
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=5)
	public void method_BT2_path_1_45_46(){
		testSuiteHelper.newCurrentTestMethod("method_BT2_path_1_45_46", 5);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(0);

		if (assertionMode != StateEquivalenceAssertionMode.NONE){
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
		}
		try {
			/* Label - id attribute store catalog */
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/P[1]/A[1], element=Element{node=null, tag=A, text=Enter the Store, attributes={evlist=false, href=actions/Catalog.action}}, source=0, target=2} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1), "Event fired: Enter the Store");
			testSuiteHelper.runInCrawlingPlugins(2);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 2");

			testSuiteHelper.addStateToReportBuilder(2);
			
			if (assertionMode != StateEquivalenceAssertionMode.NONE){
				
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
			}
			
			/* Label - id view category catalog action */
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[4]/A[4], element=Element{node=null, tag=A, text=, attributes={evlist=false, href=/jpetstore/actions/Catalog.action;jsessionid=CBE38E7BFD1E93E99C2B87D154700A6F?viewCategory=&categoryId=CATS}}, source=2, target=39} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/DIV[1]/FORM[1]/INPUT[1]"), "Bulldog"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(45), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(39);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 39");

			testSuiteHelper.addStateToReportBuilder(39);
			
			if (assertionMode != StateEquivalenceAssertionMode.NONE){
				
				if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(39)
										&& allStatesIdentical;
				}
	
				if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
				    /* Perform a visual diff on the two states. */
				    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(39)
						&& allStatesIdentical;
				}
				if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
					allStatesIdentical = testSuiteHelper.fragDiffBool(39)
						&& allStatesIdentical;	
				}
			}
			
			/* Label - id product add angelfish */
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[2]/DIV[2]/TABLE[1]/TBODY[1]/TR[3]/TD[1]/A[1], element=Element{node=null, tag=A, text=RP-LI-02, attributes={evlist=false, href=/jpetstore/actions/Catalog.action?viewProduct=&productId=RP-LI-02}}, source=39, target=24} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/DIV[1]/FORM[1]/INPUT[1]"), "Bulldog"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(46), "Event fired: RP-LI-02");
			testSuiteHelper.runInCrawlingPlugins(24);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 24");

			testSuiteHelper.addStateToReportBuilder(24);
			
			if (assertionMode != StateEquivalenceAssertionMode.NONE){
				
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
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=6)
	public void method_BT2_path_1_47(){
		testSuiteHelper.newCurrentTestMethod("method_BT2_path_1_47", 6);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(0);

		if (assertionMode != StateEquivalenceAssertionMode.NONE){
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
		}
		try {
			/* Label - id attribute store catalog */
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/P[1]/A[1], element=Element{node=null, tag=A, text=Enter the Store, attributes={evlist=false, href=actions/Catalog.action}}, source=0, target=2} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1), "Event fired: Enter the Store");
			testSuiteHelper.runInCrawlingPlugins(2);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 2");

			testSuiteHelper.addStateToReportBuilder(2);
			
			if (assertionMode != StateEquivalenceAssertionMode.NONE){
				
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
			}
			
			/* Label - id view category catalog action */
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[4]/A[5], element=Element{node=null, tag=A, text=, attributes={evlist=false, href=/jpetstore/actions/Catalog.action;jsessionid=CBE38E7BFD1E93E99C2B87D154700A6F?viewCategory=&categoryId=BIRDS}}, source=2, target=39} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/DIV[1]/FORM[1]/INPUT[1]"), "Bulldog"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(47), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(39);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 39");

			testSuiteHelper.addStateToReportBuilder(39);
			
			if (assertionMode != StateEquivalenceAssertionMode.NONE){
				
				if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(39)
										&& allStatesIdentical;
				}
	
				if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
				    /* Perform a visual diff on the two states. */
				    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(39)
						&& allStatesIdentical;
				}
				if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
					allStatesIdentical = testSuiteHelper.fragDiffBool(39)
						&& allStatesIdentical;	
				}
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=7)
	public void method_BT2_path_1_48_49_50_51(){
		testSuiteHelper.newCurrentTestMethod("method_BT2_path_1_48_49_50_51", 7);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(0);

		if (assertionMode != StateEquivalenceAssertionMode.NONE){
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
		}
		try {
			/* Label - id attribute store catalog */
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/P[1]/A[1], element=Element{node=null, tag=A, text=Enter the Store, attributes={evlist=false, href=actions/Catalog.action}}, source=0, target=2} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1), "Event fired: Enter the Store");
			testSuiteHelper.runInCrawlingPlugins(2);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 2");

			testSuiteHelper.addStateToReportBuilder(2);
			
			if (assertionMode != StateEquivalenceAssertionMode.NONE){
				
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
			}
			
			/* Label - catalog product search action */
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[3]/DIV[1]/FORM[1]/INPUT[2], element=Element{node=null, tag=INPUT, text=, attributes={evlist=false, name=searchProducts, type=submit, value=Search}}, source=2, target=50} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/DIV[1]/FORM[1]/INPUT[1]"), "Bulldog"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(48), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(50);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 50");

			testSuiteHelper.addStateToReportBuilder(50);
			
			if (assertionMode != StateEquivalenceAssertionMode.NONE){
				
				if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(50)
										&& allStatesIdentical;
				}
	
				if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
				    /* Perform a visual diff on the two states. */
				    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(50)
						&& allStatesIdentical;
				}
				if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
					allStatesIdentical = testSuiteHelper.fragDiffBool(50)
						&& allStatesIdentical;	
				}
			}
			
			/* Label - id category menu catalog */
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[2]/DIV[1]/A[1], element=Element{node=null, tag=A, text=Return to Main Menu, attributes={evlist=false, href=/jpetstore/actions/Catalog.action}}, source=50, target=2} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/DIV[1]/FORM[1]/INPUT[1]"), "Bulldog"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(49), "Event fired: Return to Main Menu");
			testSuiteHelper.runInCrawlingPlugins(2);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 2");

			testSuiteHelper.addStateToReportBuilder(2);
			
			if (assertionMode != StateEquivalenceAssertionMode.NONE){
				
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
			}
			
			/* Label - id view category catalog action */
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/A[1], element=Element{node=null, tag=A, text=, attributes={evlist=false, href=/jpetstore/actions/Catalog.action;jsessionid=CBE38E7BFD1E93E99C2B87D154700A6F?viewCategory=&categoryId=FISH}}, source=2, target=23} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/DIV[1]/FORM[1]/INPUT[1]"), "Bulldog"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(50), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(23);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 23");

			testSuiteHelper.addStateToReportBuilder(23);
			
			if (assertionMode != StateEquivalenceAssertionMode.NONE){
				
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
			}
			
			/* Label - id catalog product action */
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[2]/DIV[2]/TABLE[1]/TBODY[1]/TR[3]/TD[1]/A[1], element=Element{node=null, tag=A, text=FI-SW-02, attributes={evlist=false, href=/jpetstore/actions/Catalog.action?viewProduct=&productId=FI-SW-02}}, source=23, target=34} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/DIV[1]/FORM[1]/INPUT[1]"), "Bulldog"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(51), "Event fired: FI-SW-02");
			testSuiteHelper.runInCrawlingPlugins(34);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 34");

			testSuiteHelper.addStateToReportBuilder(34);
			
			if (assertionMode != StateEquivalenceAssertionMode.NONE){
				
				if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(34)
										&& allStatesIdentical;
				}
	
				if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
				    /* Perform a visual diff on the two states. */
				    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(34)
						&& allStatesIdentical;
				}
				if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
					allStatesIdentical = testSuiteHelper.fragDiffBool(34)
						&& allStatesIdentical;	
				}
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=8)
	public void method_BT4_path_1_3_52_53_54(){
		testSuiteHelper.newCurrentTestMethod("method_BT4_path_1_3_52_53_54", 8);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(0);

		if (assertionMode != StateEquivalenceAssertionMode.NONE){
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
		}
		try {
			/* Label - id attribute store catalog */
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/P[1]/A[1], element=Element{node=null, tag=A, text=Enter the Store, attributes={evlist=false, href=actions/Catalog.action}}, source=0, target=2} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1), "Event fired: Enter the Store");
			testSuiteHelper.runInCrawlingPlugins(2);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 2");

			testSuiteHelper.addStateToReportBuilder(2);
			
			if (assertionMode != StateEquivalenceAssertionMode.NONE){
				
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
			}
			
			/* Label - view catalog action cart image */
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/A[1], element=Element{node=null, tag=A, text=, attributes={evlist=false, href=/jpetstore/actions/Cart.action;jsessionid=CBE38E7BFD1E93E99C2B87D154700A6F?viewCart=}}, source=2, target=4} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/DIV[1]/FORM[1]/INPUT[1]"), "Bulldog"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(3), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(4);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 4");

			testSuiteHelper.addStateToReportBuilder(4);
			
			if (assertionMode != StateEquivalenceAssertionMode.NONE){
				
				if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(4)
										&& allStatesIdentical;
				}
	
				if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
				    /* Perform a visual diff on the two states. */
				    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(4)
						&& allStatesIdentical;
				}
				if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
					allStatesIdentical = testSuiteHelper.fragDiffBool(4)
						&& allStatesIdentical;	
				}
			}
			
			/* Label - id category menu catalog */
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[2]/DIV[1]/A[1], element=Element{node=null, tag=A, text=Return to Main Menu, attributes={evlist=false, href=/jpetstore/actions/Catalog.action}}, source=4, target=2} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/DIV[1]/FORM[1]/INPUT[1]"), "Bulldog"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(52), "Event fired: Return to Main Menu");
			testSuiteHelper.runInCrawlingPlugins(2);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 2");

			testSuiteHelper.addStateToReportBuilder(2);
			
			if (assertionMode != StateEquivalenceAssertionMode.NONE){
				
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
			}
			
			/* Label - id view category action value */
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/A[2], element=Element{node=null, tag=A, text=, attributes={evlist=false, href=/jpetstore/actions/Catalog.action;jsessionid=CBE38E7BFD1E93E99C2B87D154700A6F?viewCategory=&categoryId=DOGS}}, source=2, target=31} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/DIV[1]/FORM[1]/INPUT[1]"), "Bulldog"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(53), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(31);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 31");

			testSuiteHelper.addStateToReportBuilder(31);
			
			if (assertionMode != StateEquivalenceAssertionMode.NONE){
				
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
			}
			
			/* Label - id catalog product action */
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[2]/DIV[2]/TABLE[1]/TBODY[1]/TR[5]/TD[1]/A[1], element=Element{node=null, tag=A, text=K9-RT-01, attributes={evlist=false, href=/jpetstore/actions/Catalog.action?viewProduct=&productId=K9-RT-01}}, source=31, target=34} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/DIV[1]/FORM[1]/INPUT[1]"), "Bulldog"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(54), "Event fired: K9-RT-01");
			testSuiteHelper.runInCrawlingPlugins(34);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 34");

			testSuiteHelper.addStateToReportBuilder(34);
			
			if (assertionMode != StateEquivalenceAssertionMode.NONE){
				
				if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(34)
										&& allStatesIdentical;
				}
	
				if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
				    /* Perform a visual diff on the two states. */
				    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(34)
						&& allStatesIdentical;
				}
				if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
					allStatesIdentical = testSuiteHelper.fragDiffBool(34)
						&& allStatesIdentical;	
				}
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=9)
	public void method_BT4_path_1_3(){
		testSuiteHelper.newCurrentTestMethod("method_BT4_path_1_3", 9);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(0);

		if (assertionMode != StateEquivalenceAssertionMode.NONE){
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
		}
		try {
			/* Label - id attribute store catalog */
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/P[1]/A[1], element=Element{node=null, tag=A, text=Enter the Store, attributes={evlist=false, href=actions/Catalog.action}}, source=0, target=2} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1), "Event fired: Enter the Store");
			testSuiteHelper.runInCrawlingPlugins(2);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 2");

			testSuiteHelper.addStateToReportBuilder(2);
			
			if (assertionMode != StateEquivalenceAssertionMode.NONE){
				
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
			}
			
			/* Label - view catalog action cart image */
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/A[1], element=Element{node=null, tag=A, text=, attributes={evlist=false, href=/jpetstore/actions/Cart.action;jsessionid=CBE38E7BFD1E93E99C2B87D154700A6F?viewCart=}}, source=2, target=4} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/DIV[1]/FORM[1]/INPUT[1]"), "Bulldog"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(3), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(4);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 4");

			testSuiteHelper.addStateToReportBuilder(4);
			
			if (assertionMode != StateEquivalenceAssertionMode.NONE){
				
				if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(4)
										&& allStatesIdentical;
				}
	
				if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
				    /* Perform a visual diff on the two states. */
				    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(4)
						&& allStatesIdentical;
				}
				if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
					allStatesIdentical = testSuiteHelper.fragDiffBool(4)
						&& allStatesIdentical;	
				}
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=10)
	public void method_BT2_path_1_56(){
		testSuiteHelper.newCurrentTestMethod("method_BT2_path_1_56", 10);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(0);

		if (assertionMode != StateEquivalenceAssertionMode.NONE){
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
		}
		try {
			/* Label - id attribute store catalog */
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/P[1]/A[1], element=Element{node=null, tag=A, text=Enter the Store, attributes={evlist=false, href=actions/Catalog.action}}, source=0, target=2} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1), "Event fired: Enter the Store");
			testSuiteHelper.runInCrawlingPlugins(2);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 2");

			testSuiteHelper.addStateToReportBuilder(2);
			
			if (assertionMode != StateEquivalenceAssertionMode.NONE){
				
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
			}
			
			/* Label - id view category catalog action */
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/A[3], element=Element{node=null, tag=A, text=, attributes={evlist=false, href=/jpetstore/actions/Catalog.action;jsessionid=CBE38E7BFD1E93E99C2B87D154700A6F?viewCategory=&categoryId=CATS}}, source=2, target=39} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/DIV[1]/FORM[1]/INPUT[1]"), "Bulldog"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(56), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(39);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 39");

			testSuiteHelper.addStateToReportBuilder(39);
			
			if (assertionMode != StateEquivalenceAssertionMode.NONE){
				
				if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(39)
										&& allStatesIdentical;
				}
	
				if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
				    /* Perform a visual diff on the two states. */
				    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(39)
						&& allStatesIdentical;
				}
				if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
					allStatesIdentical = testSuiteHelper.fragDiffBool(39)
						&& allStatesIdentical;	
				}
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=11)
	public void method_BT23_path_1_29_57(){
		testSuiteHelper.newCurrentTestMethod("method_BT23_path_1_29_57", 11);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(0);

		if (assertionMode != StateEquivalenceAssertionMode.NONE){
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
		}
		try {
			/* Label - id attribute store catalog */
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/P[1]/A[1], element=Element{node=null, tag=A, text=Enter the Store, attributes={evlist=false, href=actions/Catalog.action}}, source=0, target=2} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1), "Event fired: Enter the Store");
			testSuiteHelper.runInCrawlingPlugins(2);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 2");

			testSuiteHelper.addStateToReportBuilder(2);
			
			if (assertionMode != StateEquivalenceAssertionMode.NONE){
				
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
			}
			
			/* Label - id view category catalog action */
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[4]/A[1], element=Element{node=null, tag=A, text=, attributes={evlist=false, href=/jpetstore/actions/Catalog.action;jsessionid=CBE38E7BFD1E93E99C2B87D154700A6F?viewCategory=&categoryId=FISH}}, source=2, target=23} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/DIV[1]/FORM[1]/INPUT[1]"), "Bulldog"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(29), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(23);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 23");

			testSuiteHelper.addStateToReportBuilder(23);
			
			if (assertionMode != StateEquivalenceAssertionMode.NONE){
				
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
			}
			
			/* Label - id action product angelfish */
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[2]/DIV[2]/TABLE[1]/TBODY[1]/TR[4]/TD[1]/A[1], element=Element{node=null, tag=A, text=FI-FW-01, attributes={evlist=false, href=/jpetstore/actions/Catalog.action?viewProduct=&productId=FI-FW-01}}, source=23, target=24} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/DIV[1]/FORM[1]/INPUT[1]"), "Bulldog"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(57), "Event fired: FI-FW-01");
			testSuiteHelper.runInCrawlingPlugins(24);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 24");

			testSuiteHelper.addStateToReportBuilder(24);
			
			if (assertionMode != StateEquivalenceAssertionMode.NONE){
				
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
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=12)
	public void method_BT50_path_1_48_58(){
		testSuiteHelper.newCurrentTestMethod("method_BT50_path_1_48_58", 12);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(0);

		if (assertionMode != StateEquivalenceAssertionMode.NONE){
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
		}
		try {
			/* Label - id attribute store catalog */
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/P[1]/A[1], element=Element{node=null, tag=A, text=Enter the Store, attributes={evlist=false, href=actions/Catalog.action}}, source=0, target=2} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1), "Event fired: Enter the Store");
			testSuiteHelper.runInCrawlingPlugins(2);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 2");

			testSuiteHelper.addStateToReportBuilder(2);
			
			if (assertionMode != StateEquivalenceAssertionMode.NONE){
				
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
			}
			
			/* Label - catalog product search action */
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[3]/DIV[1]/FORM[1]/INPUT[2], element=Element{node=null, tag=INPUT, text=, attributes={evlist=false, name=searchProducts, type=submit, value=Search}}, source=2, target=50} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/DIV[1]/FORM[1]/INPUT[1]"), "Bulldog"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(48), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(50);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 50");

			testSuiteHelper.addStateToReportBuilder(50);
			
			if (assertionMode != StateEquivalenceAssertionMode.NONE){
				
				if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(50)
										&& allStatesIdentical;
				}
	
				if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
				    /* Perform a visual diff on the two states. */
				    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(50)
						&& allStatesIdentical;
				}
				if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
					allStatesIdentical = testSuiteHelper.fragDiffBool(50)
						&& allStatesIdentical;	
				}
			}
			
			/* Label - id value product angelfish */
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[2]/DIV[2]/TABLE[1]/TBODY[1]/TR[2]/TD[1]/A[1], element=Element{node=null, tag=A, text=Friendly dog from England, attributes={evlist=false, href=/jpetstore/actions/Catalog.action?viewProduct=&productId=K9-BD-01}}, source=50, target=24} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/DIV[1]/FORM[1]/INPUT[1]"), "Bulldog"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(58), "Event fired: Friendly dog from England");
			testSuiteHelper.runInCrawlingPlugins(24);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 24");

			testSuiteHelper.addStateToReportBuilder(24);
			
			if (assertionMode != StateEquivalenceAssertionMode.NONE){
				
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
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=13)
	public void method_BT2_path_1_59(){
		testSuiteHelper.newCurrentTestMethod("method_BT2_path_1_59", 13);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(0);

		if (assertionMode != StateEquivalenceAssertionMode.NONE){
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
		}
		try {
			/* Label - id attribute store catalog */
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/P[1]/A[1], element=Element{node=null, tag=A, text=Enter the Store, attributes={evlist=false, href=actions/Catalog.action}}, source=0, target=2} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1), "Event fired: Enter the Store");
			testSuiteHelper.runInCrawlingPlugins(2);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 2");

			testSuiteHelper.addStateToReportBuilder(2);
			
			if (assertionMode != StateEquivalenceAssertionMode.NONE){
				
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
			}
			
			/* Label - id view category catalog action */
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/A[4], element=Element{node=null, tag=A, text=, attributes={evlist=false, href=/jpetstore/actions/Catalog.action;jsessionid=CBE38E7BFD1E93E99C2B87D154700A6F?viewCategory=&categoryId=REPTILES}}, source=2, target=39} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/DIV[1]/FORM[1]/INPUT[1]"), "Bulldog"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(59), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(39);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 39");

			testSuiteHelper.addStateToReportBuilder(39);
			
			if (assertionMode != StateEquivalenceAssertionMode.NONE){
				
				if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(39)
										&& allStatesIdentical;
				}
	
				if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
				    /* Perform a visual diff on the two states. */
				    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(39)
						&& allStatesIdentical;
				}
				if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
					allStatesIdentical = testSuiteHelper.fragDiffBool(39)
						&& allStatesIdentical;	
				}
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=14)
	public void method_BT27_path_1_29_30_33_60_61_62_63(){
		testSuiteHelper.newCurrentTestMethod("method_BT27_path_1_29_30_33_60_61_62_63", 14);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(0);

		if (assertionMode != StateEquivalenceAssertionMode.NONE){
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
		}
		try {
			/* Label - id attribute store catalog */
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/P[1]/A[1], element=Element{node=null, tag=A, text=Enter the Store, attributes={evlist=false, href=actions/Catalog.action}}, source=0, target=2} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1), "Event fired: Enter the Store");
			testSuiteHelper.runInCrawlingPlugins(2);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 2");

			testSuiteHelper.addStateToReportBuilder(2);
			
			if (assertionMode != StateEquivalenceAssertionMode.NONE){
				
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
			}
			
			/* Label - id view category catalog action */
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[4]/A[1], element=Element{node=null, tag=A, text=, attributes={evlist=false, href=/jpetstore/actions/Catalog.action;jsessionid=CBE38E7BFD1E93E99C2B87D154700A6F?viewCategory=&categoryId=FISH}}, source=2, target=23} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/DIV[1]/FORM[1]/INPUT[1]"), "Bulldog"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(29), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(23);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 23");

			testSuiteHelper.addStateToReportBuilder(23);
			
			if (assertionMode != StateEquivalenceAssertionMode.NONE){
				
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
			}
			
			/* Label - id value product angelfish */
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[2]/DIV[2]/TABLE[1]/TBODY[1]/TR[2]/TD[1]/A[1], element=Element{node=null, tag=A, text=FI-SW-01, attributes={evlist=false, href=/jpetstore/actions/Catalog.action?viewProduct=&productId=FI-SW-01}}, source=23, target=24} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/DIV[1]/FORM[1]/INPUT[1]"), "Bulldog"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(30), "Event fired: FI-SW-01");
			testSuiteHelper.runInCrawlingPlugins(24);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 24");

			testSuiteHelper.addStateToReportBuilder(24);
			
			if (assertionMode != StateEquivalenceAssertionMode.NONE){
				
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
			}
			
			/* Label - cart add action */
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[2]/DIV[2]/TABLE[1]/TBODY[1]/TR[2]/TD[5]/A[1], element=Element{node=null, tag=A, text=Add to Cart, attributes={evlist=false, anyaccess=none, href=/jpetstore/actions/Cart.action?addItemToCart=&workingItemId=EST-1, class=Button}}, source=24, target=27} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/DIV[1]/FORM[1]/INPUT[1]"), "Bulldog"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(33), "Event fired: Add to Cart");
			testSuiteHelper.runInCrawlingPlugins(27);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 27");

			testSuiteHelper.addStateToReportBuilder(27);
			
			if (assertionMode != StateEquivalenceAssertionMode.NONE){
				
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
			}
			
			/* Label - action order checkout */
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[2]/DIV[2]/DIV[1]/A[1], element=Element{node=null, tag=A, text=Proceed to Checkout, attributes={evlist=false, href=/jpetstore/actions/Order.action?newOrderForm=, class=Button}}, source=27, target=83} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/DIV[1]/FORM[1]/INPUT[1]"), "Bulldog"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(60), "Event fired: Proceed to Checkout");
			testSuiteHelper.runInCrawlingPlugins(83);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 83");

			testSuiteHelper.addStateToReportBuilder(83);
			
			if (assertionMode != StateEquivalenceAssertionMode.NONE){
				
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
			}
			
			/* Label - continue value order */
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[2]/DIV[1]/FORM[1]/INPUT[1], element=Element{node=null, tag=INPUT, text=, attributes={evlist=false, name=newOrder, type=submit, value=Continue}}, source=83, target=84} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/DIV[1]/FORM[1]/INPUT[1]"), "Bulldog"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(61), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(84);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 84");

			testSuiteHelper.addStateToReportBuilder(84);
			
			if (assertionMode != StateEquivalenceAssertionMode.NONE){
				
				if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(84)
										&& allStatesIdentical;
				}
	
				if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
				    /* Perform a visual diff on the two states. */
				    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(84)
						&& allStatesIdentical;
				}
				if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
					allStatesIdentical = testSuiteHelper.fragDiffBool(84)
						&& allStatesIdentical;	
				}
			}
			
			/* Label - id category menu catalog */
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[2]/DIV[1]/A[1], element=Element{node=null, tag=A, text=Return to Main Menu, attributes={evlist=false, href=/jpetstore/actions/Catalog.action}}, source=84, target=2} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/DIV[1]/FORM[1]/INPUT[1]"), "Bulldog"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(62), "Event fired: Return to Main Menu");
			testSuiteHelper.runInCrawlingPlugins(2);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 2");

			testSuiteHelper.addStateToReportBuilder(2);
			
			if (assertionMode != StateEquivalenceAssertionMode.NONE){
				
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
			}
			
			/* Label - id view category catalog action */
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/A[5], element=Element{node=null, tag=A, text=, attributes={evlist=false, href=/jpetstore/actions/Catalog.action;jsessionid=CBE38E7BFD1E93E99C2B87D154700A6F?viewCategory=&categoryId=BIRDS}}, source=2, target=39} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/DIV[1]/FORM[1]/INPUT[1]"), "Bulldog"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(63), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(39);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 39");

			testSuiteHelper.addStateToReportBuilder(39);
			
			if (assertionMode != StateEquivalenceAssertionMode.NONE){
				
				if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(39)
										&& allStatesIdentical;
				}
	
				if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
				    /* Perform a visual diff on the two states. */
				    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(39)
						&& allStatesIdentical;
				}
				if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
					allStatesIdentical = testSuiteHelper.fragDiffBool(39)
						&& allStatesIdentical;	
				}
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=15)
	public void method_BT5_failed_path_1_1000021(){
		testSuiteHelper.newCurrentTestMethod("method_BT5_failed_path_1_1000021", 15);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(0);

		if (assertionMode != StateEquivalenceAssertionMode.NONE){
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
		}
		try {
			/* Label - id attribute store catalog */
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/P[1]/A[1], element=Element{node=null, tag=A, text=Enter the Store, attributes={evlist=false, href=actions/Catalog.action}}, source=0, target=2} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1), "Event fired: Enter the Store");
			testSuiteHelper.runInCrawlingPlugins(2);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 2");

			testSuiteHelper.addStateToReportBuilder(2);
			
			if (assertionMode != StateEquivalenceAssertionMode.NONE){
				
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
			}
			
			/* Label - view cart value class image */
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/A[1], element=Element{node=null, tag=A, text=, attributes={evlist=false, href=/jpetstore/actions/Cart.action;jsessionid=CBE38E7BFD1E93E99C2B87D154700A6F?viewCart=}}, source=2, target=27} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/DIV[1]/FORM[1]/INPUT[1]"), "Bulldog"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(1000021), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(27);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 27");

			testSuiteHelper.addStateToReportBuilder(27);
			
			if (assertionMode != StateEquivalenceAssertionMode.NONE){
				
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
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=16)
	public void method_BT23_path_1_29_64(){
		testSuiteHelper.newCurrentTestMethod("method_BT23_path_1_29_64", 16);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(0);

		if (assertionMode != StateEquivalenceAssertionMode.NONE){
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
		}
		try {
			/* Label - id attribute store catalog */
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/P[1]/A[1], element=Element{node=null, tag=A, text=Enter the Store, attributes={evlist=false, href=actions/Catalog.action}}, source=0, target=2} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1), "Event fired: Enter the Store");
			testSuiteHelper.runInCrawlingPlugins(2);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 2");

			testSuiteHelper.addStateToReportBuilder(2);
			
			if (assertionMode != StateEquivalenceAssertionMode.NONE){
				
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
			}
			
			/* Label - id view category catalog action */
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[4]/A[1], element=Element{node=null, tag=A, text=, attributes={evlist=false, href=/jpetstore/actions/Catalog.action;jsessionid=CBE38E7BFD1E93E99C2B87D154700A6F?viewCategory=&categoryId=FISH}}, source=2, target=23} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/DIV[1]/FORM[1]/INPUT[1]"), "Bulldog"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(29), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(23);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 23");

			testSuiteHelper.addStateToReportBuilder(23);
			
			if (assertionMode != StateEquivalenceAssertionMode.NONE){
				
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
			}
			
			/* Label - id value product angelfish */
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[2]/DIV[2]/TABLE[1]/TBODY[1]/TR[5]/TD[1]/A[1], element=Element{node=null, tag=A, text=FI-FW-02, attributes={evlist=false, href=/jpetstore/actions/Catalog.action?viewProduct=&productId=FI-FW-02}}, source=23, target=24} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/DIV[1]/FORM[1]/INPUT[1]"), "Bulldog"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(64), "Event fired: FI-FW-02");
			testSuiteHelper.runInCrawlingPlugins(24);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 24");

			testSuiteHelper.addStateToReportBuilder(24);
			
			if (assertionMode != StateEquivalenceAssertionMode.NONE){
				
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
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=17)
	public void method_BT50_path_1_48_65(){
		testSuiteHelper.newCurrentTestMethod("method_BT50_path_1_48_65", 17);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(0);

		if (assertionMode != StateEquivalenceAssertionMode.NONE){
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
		}
		try {
			/* Label - id attribute store catalog */
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/P[1]/A[1], element=Element{node=null, tag=A, text=Enter the Store, attributes={evlist=false, href=actions/Catalog.action}}, source=0, target=2} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1), "Event fired: Enter the Store");
			testSuiteHelper.runInCrawlingPlugins(2);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 2");

			testSuiteHelper.addStateToReportBuilder(2);
			
			if (assertionMode != StateEquivalenceAssertionMode.NONE){
				
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
			}
			
			/* Label - catalog product search action */
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[3]/DIV[1]/FORM[1]/INPUT[2], element=Element{node=null, tag=INPUT, text=, attributes={evlist=false, name=searchProducts, type=submit, value=Search}}, source=2, target=50} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/DIV[1]/FORM[1]/INPUT[1]"), "Bulldog"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(48), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(50);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 50");

			testSuiteHelper.addStateToReportBuilder(50);
			
			if (assertionMode != StateEquivalenceAssertionMode.NONE){
				
				if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(50)
										&& allStatesIdentical;
				}
	
				if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
				    /* Perform a visual diff on the two states. */
				    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(50)
						&& allStatesIdentical;
				}
				if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
					allStatesIdentical = testSuiteHelper.fragDiffBool(50)
						&& allStatesIdentical;	
				}
			}
			
			/* Label - id angelfish product view item */
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[2]/DIV[2]/TABLE[1]/TBODY[1]/TR[2]/TD[2]/B[1]/A[1], element=Element{node=null, tag=A, text=K9-BD-01, attributes={evlist=false, href=/jpetstore/actions/Catalog.action?viewProduct=&productId=K9-BD-01}}, source=50, target=24} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/DIV[1]/FORM[1]/INPUT[1]"), "Bulldog"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(65), "Event fired: K9-BD-01");
			testSuiteHelper.runInCrawlingPlugins(24);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 24");

			testSuiteHelper.addStateToReportBuilder(24);
			
			if (assertionMode != StateEquivalenceAssertionMode.NONE){
				
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
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=18)
	public void method_BT84_path_1_1000021_60_61_66_67(){
		testSuiteHelper.newCurrentTestMethod("method_BT84_path_1_1000021_60_61_66_67", 18);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(0);

		if (assertionMode != StateEquivalenceAssertionMode.NONE){
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
		}
		try {
			/* Label - id attribute store catalog */
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/P[1]/A[1], element=Element{node=null, tag=A, text=Enter the Store, attributes={evlist=false, href=actions/Catalog.action}}, source=0, target=2} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1), "Event fired: Enter the Store");
			testSuiteHelper.runInCrawlingPlugins(2);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 2");

			testSuiteHelper.addStateToReportBuilder(2);
			
			if (assertionMode != StateEquivalenceAssertionMode.NONE){
				
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
			}
			
			/* Label - view cart value class image */
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/A[1], element=Element{node=null, tag=A, text=, attributes={evlist=false, href=/jpetstore/actions/Cart.action;jsessionid=CBE38E7BFD1E93E99C2B87D154700A6F?viewCart=}}, source=2, target=27} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/DIV[1]/FORM[1]/INPUT[1]"), "Bulldog"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(1000021), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(27);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 27");

			testSuiteHelper.addStateToReportBuilder(27);
			
			if (assertionMode != StateEquivalenceAssertionMode.NONE){
				
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
			}
			
			/* Label - action order checkout */
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[2]/DIV[2]/DIV[1]/A[1], element=Element{node=null, tag=A, text=Proceed to Checkout, attributes={evlist=false, href=/jpetstore/actions/Order.action?newOrderForm=, class=Button}}, source=27, target=83} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/DIV[1]/FORM[1]/INPUT[1]"), "Bulldog"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(60), "Event fired: Proceed to Checkout");
			testSuiteHelper.runInCrawlingPlugins(83);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 83");

			testSuiteHelper.addStateToReportBuilder(83);
			
			if (assertionMode != StateEquivalenceAssertionMode.NONE){
				
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
			}
			
			/* Label - continue value order */
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[2]/DIV[1]/FORM[1]/INPUT[1], element=Element{node=null, tag=INPUT, text=, attributes={evlist=false, name=newOrder, type=submit, value=Continue}}, source=83, target=84} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/DIV[1]/FORM[1]/INPUT[1]"), "Bulldog"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(61), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(84);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 84");

			testSuiteHelper.addStateToReportBuilder(84);
			
			if (assertionMode != StateEquivalenceAssertionMode.NONE){
				
				if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(84)
										&& allStatesIdentical;
				}
	
				if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
				    /* Perform a visual diff on the two states. */
				    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(84)
						&& allStatesIdentical;
				}
				if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
					allStatesIdentical = testSuiteHelper.fragDiffBool(84)
						&& allStatesIdentical;	
				}
			}
			
			/* Label - angelfish confirmed total order */
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[2]/DIV[2]/A[1], element=Element{node=null, tag=A, text=Confirm, attributes={evlist=false, href=/jpetstore/actions/Order.action?newOrder=&confirmed=true, class=Button}}, source=84, target=104} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/DIV[1]/FORM[1]/INPUT[1]"), "Bulldog"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(66), "Event fired: Confirm");
			testSuiteHelper.runInCrawlingPlugins(104);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 104");

			testSuiteHelper.addStateToReportBuilder(104);
			
			if (assertionMode != StateEquivalenceAssertionMode.NONE){
				
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
			}
			
			/* Label - id category menu catalog */
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[2]/DIV[1]/A[1], element=Element{node=null, tag=A, text=Return to Main Menu, attributes={evlist=false, href=/jpetstore/actions/Catalog.action}}, source=104, target=2} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/DIV[1]/FORM[1]/INPUT[1]"), "Bulldog"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(67), "Event fired: Return to Main Menu");
			testSuiteHelper.runInCrawlingPlugins(2);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 2");

			testSuiteHelper.addStateToReportBuilder(2);
			
			if (assertionMode != StateEquivalenceAssertionMode.NONE){
				
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
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=19)
	public void method_BT104_failed_path_1_1000031(){
		testSuiteHelper.newCurrentTestMethod("method_BT104_failed_path_1_1000031", 19);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(0);

		if (assertionMode != StateEquivalenceAssertionMode.NONE){
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
		}
		try {
			/* Label - id attribute store catalog */
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/P[1]/A[1], element=Element{node=null, tag=A, text=Enter the Store, attributes={evlist=false, href=actions/Catalog.action}}, source=0, target=2} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1), "Event fired: Enter the Store");
			testSuiteHelper.runInCrawlingPlugins(2);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 2");

			testSuiteHelper.addStateToReportBuilder(2);
			
			if (assertionMode != StateEquivalenceAssertionMode.NONE){
				
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
			}
			
			/* Label - view catalog action cart image */
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/A[1], element=Element{node=null, tag=A, text=, attributes={evlist=false, href=/jpetstore/actions/Cart.action;jsessionid=CBE38E7BFD1E93E99C2B87D154700A6F?viewCart=}}, source=2, target=4} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/DIV[1]/FORM[1]/INPUT[1]"), "Bulldog"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(1000031), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(4);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 4");

			testSuiteHelper.addStateToReportBuilder(4);
			
			if (assertionMode != StateEquivalenceAssertionMode.NONE){
				
				if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(4)
										&& allStatesIdentical;
				}
	
				if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
				    /* Perform a visual diff on the two states. */
				    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(4)
						&& allStatesIdentical;
				}
				if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
					allStatesIdentical = testSuiteHelper.fragDiffBool(4)
						&& allStatesIdentical;	
				}
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=20)
	public void method_BT5_path_1_1000031_4_68_69(){
		testSuiteHelper.newCurrentTestMethod("method_BT5_path_1_1000031_4_68_69", 20);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(0);

		if (assertionMode != StateEquivalenceAssertionMode.NONE){
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
		}
		try {
			/* Label - id attribute store catalog */
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/P[1]/A[1], element=Element{node=null, tag=A, text=Enter the Store, attributes={evlist=false, href=actions/Catalog.action}}, source=0, target=2} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1), "Event fired: Enter the Store");
			testSuiteHelper.runInCrawlingPlugins(2);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 2");

			testSuiteHelper.addStateToReportBuilder(2);
			
			if (assertionMode != StateEquivalenceAssertionMode.NONE){
				
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
			}
			
			/* Label - view catalog action cart image */
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/A[1], element=Element{node=null, tag=A, text=, attributes={evlist=false, href=/jpetstore/actions/Cart.action;jsessionid=CBE38E7BFD1E93E99C2B87D154700A6F?viewCart=}}, source=2, target=4} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/DIV[1]/FORM[1]/INPUT[1]"), "Bulldog"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(1000031), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(4);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 4");

			testSuiteHelper.addStateToReportBuilder(4);
			
			if (assertionMode != StateEquivalenceAssertionMode.NONE){
				
				if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(4)
										&& allStatesIdentical;
				}
	
				if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
				    /* Perform a visual diff on the two states. */
				    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(4)
						&& allStatesIdentical;
				}
				if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
					allStatesIdentical = testSuiteHelper.fragDiffBool(4)
						&& allStatesIdentical;	
				}
			}
			
			/* Label - account none username password */
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/A[2], element=Element{node=null, tag=A, text=Sign In, attributes={evlist=false, anyaccess=none, href=/jpetstore/actions/Account.action?signonForm=}}, source=4, target=5} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/DIV[1]/FORM[1]/INPUT[1]"), "Bulldog"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(4), "Event fired: Sign In");
			testSuiteHelper.runInCrawlingPlugins(5);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 5");

			testSuiteHelper.addStateToReportBuilder(5);
			
			if (assertionMode != StateEquivalenceAssertionMode.NONE){
				
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
			}
			
			/* Label - login id category */
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[2]/DIV[1]/FORM[1]/INPUT[1], element=Element{node=null, tag=INPUT, text=, attributes={evlist=false, name=signon, type=submit, value=Login}}, source=5, target=114} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/DIV[1]/FORM[1]/INPUT[1]"), "Bulldog"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[2]/DIV[1]/FORM[1]/P[2]/INPUT[1]"), "123"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[2]/DIV[1]/FORM[1]/P[2]/INPUT[2]"), "123123"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(68), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(114);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 114");

			testSuiteHelper.addStateToReportBuilder(114);
			
			if (assertionMode != StateEquivalenceAssertionMode.NONE){
				
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
			}
			
			/* Label - view action catalog cart image */
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/A[1], element=Element{node=null, tag=A, text=, attributes={evlist=false, href=/jpetstore/actions/Cart.action?viewCart=}}, source=114, target=115} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[3]/DIV[1]/FORM[1]/INPUT[1]"), "Bulldog"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(69), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(115);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 115");

			testSuiteHelper.addStateToReportBuilder(115);
			
			if (assertionMode != StateEquivalenceAssertionMode.NONE){
				
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
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=21)
	public void method_BT114_failed_path_1000035(){
		testSuiteHelper.newCurrentTestMethod("method_BT114_failed_path_1000035", 21);
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(0);

		if (assertionMode != StateEquivalenceAssertionMode.NONE){
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
		}
		try {
			/* Label - id store category catalog */
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/P[1]/A[1], element=Element{node=null, tag=A, text=Enter the Store, attributes={evlist=false, href=actions/Catalog.action}}, source=0, target=114} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1000035), "Event fired: Enter the Store");
			testSuiteHelper.runInCrawlingPlugins(114);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 114");

			testSuiteHelper.addStateToReportBuilder(114);
			
			if (assertionMode != StateEquivalenceAssertionMode.NONE){
				
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
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}


}	 
