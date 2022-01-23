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
 * Generated @ Wed Oct 06 17:44:18 CDT 2021
 */

public class GeneratedTests {
	private final boolean mutate = true;
    private final String URL = "http://localhost:4200/petclinic/";
	private TestSuiteHelper testSuiteHelper;
	
	private final String CRAWL_PATH = "/Users/liuyu/projects/tackle-test-generator-ui-level/testlabeling/crawljax_frag/out/petclinic/petclinic_HYBRID_DOM_-1.0_60mins/localhost/crawl0";

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
	public void method_BT0_path_4_5_6_7_8_10_11_12_13_14_15_16_18_19_21(){
		testSuiteHelper.newCurrentTestMethod("method_BT0_path_4_5_6_7_8_10_11_12_13_14_15_16_18_19_21", 2);
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
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Search, attributes={_ngcontent-gio-c0=, evlist=false, href=/petclinic/owners, ng-reflect-router-link=/owners, routerlink=/owners}}, source=HybridStateVertexImpl{id=0, name=index}, target=HybridStateVertexImpl{id=5, name=state5}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(4), "Event fired: Search");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={_ngcontent-cph-c0=, class=navbar-brand, evlist=false, href=#}}, source=HybridStateVertexImpl{id=5, name=state5}, target=HybridStateVertexImpl{id=0, name=index}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-LIST[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"), "yu"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(5), "Event fired: ");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Add New, attributes={_ngcontent-gio-c0=, evlist=false, href=/petclinic/owners/add, ng-reflect-router-link=/owners/add, routerlink=/owners/add}}, source=HybridStateVertexImpl{id=0, name=index}, target=HybridStateVertexImpl{id=7, name=state7}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(6), "Event fired: Add New");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Search, attributes={_ngcontent-wts-c0=, anyaccess=action, evlist=false, href=/petclinic/owners, ng-reflect-router-link=/owners, routerlink=/owners}}, source=HybridStateVertexImpl{id=7, name=state7}, target=HybridStateVertexImpl{id=5, name=state5}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"), "pipi"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"), "yu"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[4]/DIV[1]/INPUT[1]"), "2710"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[5]/DIV[1]/INPUT[1]"), "Austin"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[6]/DIV[1]/INPUT[1]"), "5122005208"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(7), "Event fired: Search");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Home, attributes={_ngcontent-cph-c0=, evlist=false, href=/petclinic/welcome, ng-reflect-router-link=welcome, routerlink=welcome, title=home page}}, source=HybridStateVertexImpl{id=5, name=state5}, target=HybridStateVertexImpl{id=0, name=index}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-LIST[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"), "yu"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(8), "Event fired: Home");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[4]/A[1], element=Element{node=[A: null], tag=A, text=Pet Types, attributes={_ngcontent-gio-c0=, evlist=false, href=/petclinic/pettypes, ng-reflect-router-link=/pettypes, ng-reflect-router-link-active=active, routerlink=/pettypes, routerlinkactive=active, title=pettypes}}, source=HybridStateVertexImpl{id=0, name=index}, target=HybridStateVertexImpl{id=11, name=state11}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(10), "Event fired: Pet Types");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Add New, attributes={_ngcontent-ccf-c0=, anyaccess=action, evlist=false, href=/petclinic/owners/add, ng-reflect-router-link=/owners/add, routerlink=/owners/add}}, source=HybridStateVertexImpl{id=11, name=state11}, target=HybridStateVertexImpl{id=7, name=state7}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(11), "Event fired: Add New");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[3]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=All, attributes={_ngcontent-wts-c0=, anyaccess=none, evlist=false, href=/petclinic/vets, ng-reflect-router-link=/vets, routerlink=/vets}}, source=HybridStateVertexImpl{id=7, name=state7}, target=HybridStateVertexImpl{id=13, name=state13}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"), "pipi"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"), "yu"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[4]/DIV[1]/INPUT[1]"), "2710"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[5]/DIV[1]/INPUT[1]"), "Austin"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[6]/DIV[1]/INPUT[1]"), "5122005208"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(12), "Event fired: All");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[3]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Add New, attributes={_ngcontent-jqi-c0=, anyaccess=none, evlist=false, href=/petclinic/vets/add, ng-reflect-router-link=/vets/add, routerlink=/vets/add}}, source=HybridStateVertexImpl{id=13, name=state13}, target=HybridStateVertexImpl{id=14, name=state14}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(13), "Event fired: Add New");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[5]/A[1], element=Element{node=[A: null], tag=A, text=Specialties, attributes={_ngcontent-wkb-c0=, anyaccess=none, evlist=false, href=/petclinic/specialties, ng-reflect-router-link=/specialties, ng-reflect-router-link-active=active, routerlink=/specialties, routerlinkactive=active, title=specialties}}, source=HybridStateVertexImpl{id=14, name=state14}, target=HybridStateVertexImpl{id=15, name=state15}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"), "pipi"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"), "yu"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[4]/DIV[1]/DIV[1]/SELECT[1]"), "surgery"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(14), "Event fired: Specialties");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[2]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Edit, attributes={_ngcontent-wkb-c2=, class=btn btn-default, evlist=false}}, source=HybridStateVertexImpl{id=15, name=state15}, target=HybridStateVertexImpl{id=16, name=state16}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(15), "Event fired: Edit");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-SPECIALTY-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Update, attributes={_ngcontent-wkb-c4=, class=btn btn-default, evlist=false, type=submit}}, source=HybridStateVertexImpl{id=16, name=state16}, target=HybridStateVertexImpl{id=15, name=state15}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-SPECIALTY-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"), "pig"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(16), "Event fired: Update");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/TABLE[1]/TBODY[1]/TR[2]/TD[2]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Edit, attributes={_ngcontent-wkb-c2=, class=btn btn-default, evlist=false}}, source=HybridStateVertexImpl{id=15, name=state15}, target=HybridStateVertexImpl{id=16, name=state16}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(18), "Event fired: Edit");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-SPECIALTY-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Cancel, attributes={_ngcontent-wkb-c4=, class=btn btn-default, evlist=false}}, source=HybridStateVertexImpl{id=16, name=state16}, target=HybridStateVertexImpl{id=15, name=state15}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-SPECIALTY-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"), "pig"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(19), "Event fired: Cancel");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/TABLE[1]/TBODY[1]/TR[3]/TD[2]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Edit, attributes={_ngcontent-wkb-c2=, class=btn btn-default, evlist=false}}, source=HybridStateVertexImpl{id=15, name=state15}, target=HybridStateVertexImpl{id=16, name=state16}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(21), "Event fired: Edit");
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

	@Test(priority=3)
	public void method_BT11_path_10_22(){
		testSuiteHelper.newCurrentTestMethod("method_BT11_path_10_22", 3);
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
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[4]/A[1], element=Element{node=[A: null], tag=A, text=Pet Types, attributes={_ngcontent-gio-c0=, evlist=false, href=/petclinic/pettypes, ng-reflect-router-link=/pettypes, ng-reflect-router-link-active=active, routerlink=/pettypes, routerlinkactive=active, title=pettypes}}, source=HybridStateVertexImpl{id=0, name=index}, target=HybridStateVertexImpl{id=11, name=state11}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(10), "Event fired: Pet Types");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={_ngcontent-ccf-c0=, class=navbar-brand, evlist=false, href=#}}, source=HybridStateVertexImpl{id=11, name=state11}, target=HybridStateVertexImpl{id=0, name=index}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(22), "Event fired: ");
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

	@Test(priority=4)
	public void method_BT11_path_10_23_24(){
		testSuiteHelper.newCurrentTestMethod("method_BT11_path_10_23_24", 4);
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
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[4]/A[1], element=Element{node=[A: null], tag=A, text=Pet Types, attributes={_ngcontent-gio-c0=, evlist=false, href=/petclinic/pettypes, ng-reflect-router-link=/pettypes, ng-reflect-router-link-active=active, routerlink=/pettypes, routerlinkactive=active, title=pettypes}}, source=HybridStateVertexImpl{id=0, name=index}, target=HybridStateVertexImpl{id=11, name=state11}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(10), "Event fired: Pet Types");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-PETTYPE-LIST[1]/DIV[1]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[2]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Edit, attributes={_ngcontent-ccf-c3=, class=btn btn-default, evlist=false}}, source=HybridStateVertexImpl{id=11, name=state11}, target=HybridStateVertexImpl{id=28, name=state28}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(23), "Event fired: Edit");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={_ngcontent-jfy-c0=, class=navbar-brand, evlist=false, href=#}}, source=HybridStateVertexImpl{id=28, name=state28}, target=HybridStateVertexImpl{id=0, name=index}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-PETTYPE-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"), "pig"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(24), "Event fired: ");
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

	@Test(priority=5)
	public void method_BT13_path_6_12_25_26_27_28(){
		testSuiteHelper.newCurrentTestMethod("method_BT13_path_6_12_25_26_27_28", 5);
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
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Add New, attributes={_ngcontent-gio-c0=, evlist=false, href=/petclinic/owners/add, ng-reflect-router-link=/owners/add, routerlink=/owners/add}}, source=HybridStateVertexImpl{id=0, name=index}, target=HybridStateVertexImpl{id=7, name=state7}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(6), "Event fired: Add New");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[3]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=All, attributes={_ngcontent-wts-c0=, anyaccess=none, evlist=false, href=/petclinic/vets, ng-reflect-router-link=/vets, routerlink=/vets}}, source=HybridStateVertexImpl{id=7, name=state7}, target=HybridStateVertexImpl{id=13, name=state13}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"), "pipi"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"), "yu"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[4]/DIV[1]/INPUT[1]"), "2710"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[5]/DIV[1]/INPUT[1]"), "Austin"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[6]/DIV[1]/INPUT[1]"), "5122005208"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(12), "Event fired: All");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-VET-LIST[1]/DIV[1]/DIV[1]/TABLE[1]/TBODY[1]/TR[2]/TD[3]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Edit Vet, attributes={_ngcontent-jqi-c1=, anyaccess=none, class=btn btn-default, evlist=false}}, source=HybridStateVertexImpl{id=13, name=state13}, target=HybridStateVertexImpl{id=33, name=state33}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(25), "Event fired: Edit Vet");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-VET-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[5]/DIV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=< Back, attributes={_ngcontent-gin-c2=, anyaccess=none, class=btn btn-default, evlist=false, type=button}}, source=HybridStateVertexImpl{id=33, name=state33}, target=HybridStateVertexImpl{id=34, name=state34}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-VET-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"), "pipi"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-VET-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"), "yu"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(26), "Event fired: < Back");
			testSuiteHelper.runInCrawlingPlugins(34);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 34");

			testSuiteHelper.addStateToReportBuilder(34);
			
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-VET-LIST[1]/DIV[1]/DIV[1]/TABLE[1]/TBODY[1]/TR[4]/TD[3]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Delete Vet, attributes={_ngcontent-gin-c1=, anyaccess=none, class=btn btn-default, evlist=false}}, source=HybridStateVertexImpl{id=34, name=state34}, target=HybridStateVertexImpl{id=35, name=state35}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(27), "Event fired: Delete Vet");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-VET-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Home, attributes={_ngcontent-gin-c1=, class=btn btn-default, evlist=false}}, source=HybridStateVertexImpl{id=35, name=state35}, target=HybridStateVertexImpl{id=36, name=state36}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(28), "Event fired: Home");
			testSuiteHelper.runInCrawlingPlugins(36);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 36");

			testSuiteHelper.addStateToReportBuilder(36);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(36)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(36)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(36)
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
	public void method_BT11_path_10_29_30(){
		testSuiteHelper.newCurrentTestMethod("method_BT11_path_10_29_30", 6);
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
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[4]/A[1], element=Element{node=[A: null], tag=A, text=Pet Types, attributes={_ngcontent-gio-c0=, evlist=false, href=/petclinic/pettypes, ng-reflect-router-link=/pettypes, ng-reflect-router-link-active=active, routerlink=/pettypes, routerlinkactive=active, title=pettypes}}, source=HybridStateVertexImpl{id=0, name=index}, target=HybridStateVertexImpl{id=11, name=state11}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(10), "Event fired: Pet Types");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-PETTYPE-LIST[1]/DIV[1]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[2]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Delete, attributes={_ngcontent-ccf-c3=, class=btn btn-default, evlist=false}}, source=HybridStateVertexImpl{id=11, name=state11}, target=HybridStateVertexImpl{id=39, name=state39}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(29), "Event fired: Delete");
			testSuiteHelper.runInCrawlingPlugins(39);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 39");

			testSuiteHelper.addStateToReportBuilder(39);
			
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={_ngcontent-afn-c0=, class=navbar-brand, evlist=false, href=#}}, source=HybridStateVertexImpl{id=39, name=state39}, target=HybridStateVertexImpl{id=0, name=index}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(30), "Event fired: ");
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

	@Test(priority=7)
	public void method_BT11_failed_path_1000006(){
		testSuiteHelper.newCurrentTestMethod("method_BT11_failed_path_1000006", 7);
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
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[4]/A[1], element=Element{node=[A: null], tag=A, text=Pet Types, attributes={_ngcontent-gio-c0=, evlist=false, href=/petclinic/pettypes, ng-reflect-router-link=/pettypes, ng-reflect-router-link-active=active, routerlink=/pettypes, routerlinkactive=active, title=pettypes}}, source=HybridStateVertexImpl{id=0, name=index}, target=HybridStateVertexImpl{id=39, name=state39}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1000006), "Event fired: Pet Types");
			testSuiteHelper.runInCrawlingPlugins(39);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 39");

			testSuiteHelper.addStateToReportBuilder(39);
			
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
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=8)
	public void method_BT39_path_1000006_31(){
		testSuiteHelper.newCurrentTestMethod("method_BT39_path_1000006_31", 8);
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
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[4]/A[1], element=Element{node=[A: null], tag=A, text=Pet Types, attributes={_ngcontent-gio-c0=, evlist=false, href=/petclinic/pettypes, ng-reflect-router-link=/pettypes, ng-reflect-router-link-active=active, routerlink=/pettypes, routerlinkactive=active, title=pettypes}}, source=HybridStateVertexImpl{id=0, name=index}, target=HybridStateVertexImpl{id=39, name=state39}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1000006), "Event fired: Pet Types");
			testSuiteHelper.runInCrawlingPlugins(39);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 39");

			testSuiteHelper.addStateToReportBuilder(39);
			
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-PETTYPE-LIST[1]/DIV[1]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[2]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Edit, attributes={_ngcontent-afn-c2=, class=btn btn-default, evlist=false}}, source=HybridStateVertexImpl{id=39, name=state39}, target=HybridStateVertexImpl{id=28, name=state28}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(31), "Event fired: Edit");
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

	@Test(priority=9)
	public void method_BT13_failed_49_path_6_1000009_32_33_34(){
		testSuiteHelper.newCurrentTestMethod("method_BT13_failed_49_path_6_1000009_32_33_34", 9);
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
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Add New, attributes={_ngcontent-gio-c0=, evlist=false, href=/petclinic/owners/add, ng-reflect-router-link=/owners/add, routerlink=/owners/add}}, source=HybridStateVertexImpl{id=0, name=index}, target=HybridStateVertexImpl{id=7, name=state7}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(6), "Event fired: Add New");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[3]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=All, attributes={_ngcontent-wts-c0=, anyaccess=none, evlist=false, href=/petclinic/vets, ng-reflect-router-link=/vets, routerlink=/vets}}, source=HybridStateVertexImpl{id=7, name=state7}, target=HybridStateVertexImpl{id=49, name=state49}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"), "pipi"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"), "yu"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[4]/DIV[1]/INPUT[1]"), "2710"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[5]/DIV[1]/INPUT[1]"), "Austin"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[6]/DIV[1]/INPUT[1]"), "5122005208"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(1000009), "Event fired: All");
			testSuiteHelper.runInCrawlingPlugins(49);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 49");

			testSuiteHelper.addStateToReportBuilder(49);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(49)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(49)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(49)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-VET-LIST[1]/DIV[1]/DIV[1]/TABLE[1]/TBODY[1]/TR[3]/TD[3]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Edit Vet, attributes={_ngcontent-ysy-c1=, anyaccess=none, class=btn btn-default, evlist=false}}, source=HybridStateVertexImpl{id=49, name=state49}, target=HybridStateVertexImpl{id=33, name=state33}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(32), "Event fired: Edit Vet");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-VET-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[5]/DIV[1]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save Vet, attributes={_ngcontent-gin-c2=, anyaccess=none, class=btn btn-default, evlist=false, type=submit}}, source=HybridStateVertexImpl{id=33, name=state33}, target=HybridStateVertexImpl{id=35, name=state35}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-VET-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"), "pipi"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-VET-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"), "yu"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(33), "Event fired: Save Vet");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-VET-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Add Vet, attributes={_ngcontent-gin-c1=, class=btn btn-default, evlist=false}}, source=HybridStateVertexImpl{id=35, name=state35}, target=HybridStateVertexImpl{id=52, name=state52}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(34), "Event fired: Add Vet");
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
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=10)
	public void method_BT39_path_1000006_35_36(){
		testSuiteHelper.newCurrentTestMethod("method_BT39_path_1000006_35_36", 10);
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
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[4]/A[1], element=Element{node=[A: null], tag=A, text=Pet Types, attributes={_ngcontent-gio-c0=, evlist=false, href=/petclinic/pettypes, ng-reflect-router-link=/pettypes, ng-reflect-router-link-active=active, routerlink=/pettypes, routerlinkactive=active, title=pettypes}}, source=HybridStateVertexImpl{id=0, name=index}, target=HybridStateVertexImpl{id=39, name=state39}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1000006), "Event fired: Pet Types");
			testSuiteHelper.runInCrawlingPlugins(39);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 39");

			testSuiteHelper.addStateToReportBuilder(39);
			
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-PETTYPE-LIST[1]/DIV[1]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[2]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Delete, attributes={_ngcontent-afn-c2=, class=btn btn-default, evlist=false}}, source=HybridStateVertexImpl{id=39, name=state39}, target=HybridStateVertexImpl{id=55, name=state55}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(35), "Event fired: Delete");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={_ngcontent-lje-c0=, class=navbar-brand, evlist=false, href=#}}, source=HybridStateVertexImpl{id=55, name=state55}, target=HybridStateVertexImpl{id=0, name=index}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(36), "Event fired: ");
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

	@Test(priority=11)
	public void method_BT39_failed_path_1000011(){
		testSuiteHelper.newCurrentTestMethod("method_BT39_failed_path_1000011", 11);
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
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[4]/A[1], element=Element{node=[A: null], tag=A, text=Pet Types, attributes={_ngcontent-gio-c0=, evlist=false, href=/petclinic/pettypes, ng-reflect-router-link=/pettypes, ng-reflect-router-link-active=active, routerlink=/pettypes, routerlinkactive=active, title=pettypes}}, source=HybridStateVertexImpl{id=0, name=index}, target=HybridStateVertexImpl{id=55, name=state55}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1000011), "Event fired: Pet Types");
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
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=12)
	public void method_BT55_path_1000011_37(){
		testSuiteHelper.newCurrentTestMethod("method_BT55_path_1000011_37", 12);
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
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[4]/A[1], element=Element{node=[A: null], tag=A, text=Pet Types, attributes={_ngcontent-gio-c0=, evlist=false, href=/petclinic/pettypes, ng-reflect-router-link=/pettypes, ng-reflect-router-link-active=active, routerlink=/pettypes, routerlinkactive=active, title=pettypes}}, source=HybridStateVertexImpl{id=0, name=index}, target=HybridStateVertexImpl{id=55, name=state55}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1000011), "Event fired: Pet Types");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-PETTYPE-LIST[1]/DIV[1]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[2]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Edit, attributes={_ngcontent-lje-c2=, class=btn btn-default, evlist=false}}, source=HybridStateVertexImpl{id=55, name=state55}, target=HybridStateVertexImpl{id=28, name=state28}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(37), "Event fired: Edit");
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

	@Test(priority=13)
	public void method_BT55_path_1000011_38_39_40(){
		testSuiteHelper.newCurrentTestMethod("method_BT55_path_1000011_38_39_40", 13);
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
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[4]/A[1], element=Element{node=[A: null], tag=A, text=Pet Types, attributes={_ngcontent-gio-c0=, evlist=false, href=/petclinic/pettypes, ng-reflect-router-link=/pettypes, ng-reflect-router-link-active=active, routerlink=/pettypes, routerlinkactive=active, title=pettypes}}, source=HybridStateVertexImpl{id=0, name=index}, target=HybridStateVertexImpl{id=55, name=state55}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1000011), "Event fired: Pet Types");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-PETTYPE-LIST[1]/DIV[1]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[2]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Delete, attributes={_ngcontent-lje-c2=, class=btn btn-default, evlist=false}}, source=HybridStateVertexImpl{id=55, name=state55}, target=HybridStateVertexImpl{id=65, name=state65}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(38), "Event fired: Delete");
			testSuiteHelper.runInCrawlingPlugins(65);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 65");

			testSuiteHelper.addStateToReportBuilder(65);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(65)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(65)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(65)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-PETTYPE-LIST[1]/DIV[1]/DIV[1]/TABLE[1]/TBODY[1]/TR[3]/TD[2]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Delete, attributes={_ngcontent-oks-c2=, anyaccess=none, class=btn btn-default, evlist=false}}, source=HybridStateVertexImpl{id=65, name=state65}, target=HybridStateVertexImpl{id=66, name=state66}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(39), "Event fired: Delete");
			testSuiteHelper.runInCrawlingPlugins(66);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 66");

			testSuiteHelper.addStateToReportBuilder(66);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(66)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(66)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(66)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-PETTYPE-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Home, attributes={_ngcontent-oks-c2=, class=btn btn-default, evlist=false}}, source=HybridStateVertexImpl{id=66, name=state66}, target=HybridStateVertexImpl{id=0, name=index}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(40), "Event fired: Home");
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

	@Test(priority=14)
	public void method_BT55_failed_path_1000014(){
		testSuiteHelper.newCurrentTestMethod("method_BT55_failed_path_1000014", 14);
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
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[4]/A[1], element=Element{node=[A: null], tag=A, text=Pet Types, attributes={_ngcontent-gio-c0=, evlist=false, href=/petclinic/pettypes, ng-reflect-router-link=/pettypes, ng-reflect-router-link-active=active, routerlink=/pettypes, routerlinkactive=active, title=pettypes}}, source=HybridStateVertexImpl{id=0, name=index}, target=HybridStateVertexImpl{id=66, name=state66}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1000014), "Event fired: Pet Types");
			testSuiteHelper.runInCrawlingPlugins(66);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 66");

			testSuiteHelper.addStateToReportBuilder(66);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(66)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(66)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(66)
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
	public void method_BT7_path_6_41(){
		testSuiteHelper.newCurrentTestMethod("method_BT7_path_6_41", 15);
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
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Add New, attributes={_ngcontent-gio-c0=, evlist=false, href=/petclinic/owners/add, ng-reflect-router-link=/owners/add, routerlink=/owners/add}}, source=HybridStateVertexImpl{id=0, name=index}, target=HybridStateVertexImpl{id=7, name=state7}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(6), "Event fired: Add New");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={_ngcontent-wts-c0=, class=navbar-brand, evlist=false, href=#}}, source=HybridStateVertexImpl{id=7, name=state7}, target=HybridStateVertexImpl{id=0, name=index}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"), "pipi"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"), "yu"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[4]/DIV[1]/INPUT[1]"), "2710"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[5]/DIV[1]/INPUT[1]"), "Austin"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[6]/DIV[1]/INPUT[1]"), "5122005208"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(41), "Event fired: ");
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

	@Test(priority=16)
	public void method_BT33_path_6_1000009_32_42(){
		testSuiteHelper.newCurrentTestMethod("method_BT33_path_6_1000009_32_42", 16);
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
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Add New, attributes={_ngcontent-gio-c0=, evlist=false, href=/petclinic/owners/add, ng-reflect-router-link=/owners/add, routerlink=/owners/add}}, source=HybridStateVertexImpl{id=0, name=index}, target=HybridStateVertexImpl{id=7, name=state7}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(6), "Event fired: Add New");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[3]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=All, attributes={_ngcontent-wts-c0=, anyaccess=none, evlist=false, href=/petclinic/vets, ng-reflect-router-link=/vets, routerlink=/vets}}, source=HybridStateVertexImpl{id=7, name=state7}, target=HybridStateVertexImpl{id=49, name=state49}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"), "pipi"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"), "yu"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[4]/DIV[1]/INPUT[1]"), "2710"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[5]/DIV[1]/INPUT[1]"), "Austin"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[6]/DIV[1]/INPUT[1]"), "5122005208"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(1000009), "Event fired: All");
			testSuiteHelper.runInCrawlingPlugins(49);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 49");

			testSuiteHelper.addStateToReportBuilder(49);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(49)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(49)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(49)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-VET-LIST[1]/DIV[1]/DIV[1]/TABLE[1]/TBODY[1]/TR[3]/TD[3]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Edit Vet, attributes={_ngcontent-ysy-c1=, anyaccess=none, class=btn btn-default, evlist=false}}, source=HybridStateVertexImpl{id=49, name=state49}, target=HybridStateVertexImpl{id=33, name=state33}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(32), "Event fired: Edit Vet");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={_ngcontent-gin-c0=, class=navbar-brand, evlist=false, href=#}}, source=HybridStateVertexImpl{id=33, name=state33}, target=HybridStateVertexImpl{id=0, name=index}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-VET-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"), "pipi"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-VET-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"), "yu"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(42), "Event fired: ");
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

	@Test(priority=17)
	public void method_BT7_path_6_43_44(){
		testSuiteHelper.newCurrentTestMethod("method_BT7_path_6_43_44", 17);
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
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Add New, attributes={_ngcontent-gio-c0=, evlist=false, href=/petclinic/owners/add, ng-reflect-router-link=/owners/add, routerlink=/owners/add}}, source=HybridStateVertexImpl{id=0, name=index}, target=HybridStateVertexImpl{id=7, name=state7}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(6), "Event fired: Add New");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[7]/DIV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Back, attributes={_ngcontent-wts-c1=, class=btn btn-default, evlist=false, type=button}}, source=HybridStateVertexImpl{id=7, name=state7}, target=HybridStateVertexImpl{id=82, name=state82}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"), "pipi"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"), "yu"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[4]/DIV[1]/INPUT[1]"), "2710"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[5]/DIV[1]/INPUT[1]"), "Austin"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[6]/DIV[1]/INPUT[1]"), "5122005208"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(43), "Event fired: Back");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={_ngcontent-tid-c0=, class=navbar-brand, evlist=false, href=#}}, source=HybridStateVertexImpl{id=82, name=state82}, target=HybridStateVertexImpl{id=0, name=index}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-LIST[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"), "yu"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(44), "Event fired: ");
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

	@Test(priority=18)
	public void method_BT7_path_6_45_46(){
		testSuiteHelper.newCurrentTestMethod("method_BT7_path_6_45_46", 18);
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
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Add New, attributes={_ngcontent-gio-c0=, evlist=false, href=/petclinic/owners/add, ng-reflect-router-link=/owners/add, routerlink=/owners/add}}, source=HybridStateVertexImpl{id=0, name=index}, target=HybridStateVertexImpl{id=7, name=state7}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(6), "Event fired: Add New");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[7]/DIV[1]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Add Owner, attributes={_ngcontent-wts-c1=, class=btn btn-default, disabled=, evlist=false, type=submit}}, source=HybridStateVertexImpl{id=7, name=state7}, target=HybridStateVertexImpl{id=86, name=state86}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"), "pipi"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"), "yu"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[4]/DIV[1]/INPUT[1]"), "2710"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[5]/DIV[1]/INPUT[1]"), "Austin"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[6]/DIV[1]/INPUT[1]"), "5122005208"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(45), "Event fired: Add Owner");
			testSuiteHelper.runInCrawlingPlugins(86);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 86");

			testSuiteHelper.addStateToReportBuilder(86);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(86)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(86)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(86)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={_ngcontent-foo-c0=, class=navbar-brand, evlist=false, href=#}}, source=HybridStateVertexImpl{id=86, name=state86}, target=HybridStateVertexImpl{id=0, name=index}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-LIST[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"), "yu"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(46), "Event fired: ");
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

	@Test(priority=19)
	public void method_BT66_path_1000014_47_48(){
		testSuiteHelper.newCurrentTestMethod("method_BT66_path_1000014_47_48", 19);
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
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[4]/A[1], element=Element{node=[A: null], tag=A, text=Pet Types, attributes={_ngcontent-gio-c0=, evlist=false, href=/petclinic/pettypes, ng-reflect-router-link=/pettypes, ng-reflect-router-link-active=active, routerlink=/pettypes, routerlinkactive=active, title=pettypes}}, source=HybridStateVertexImpl{id=0, name=index}, target=HybridStateVertexImpl{id=66, name=state66}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1000014), "Event fired: Pet Types");
			testSuiteHelper.runInCrawlingPlugins(66);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 66");

			testSuiteHelper.addStateToReportBuilder(66);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(66)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(66)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(66)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-PETTYPE-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Add, attributes={_ngcontent-oks-c2=, class=btn btn-default, evlist=false}}, source=HybridStateVertexImpl{id=66, name=state66}, target=HybridStateVertexImpl{id=90, name=state90}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(47), "Event fired: Add");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-PETTYPE-LIST[1]/DIV[1]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[2]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Edit, attributes={_ngcontent-mjt-c2=, anyaccess=none, class=btn btn-default, evlist=false}}, source=HybridStateVertexImpl{id=90, name=state90}, target=HybridStateVertexImpl{id=28, name=state28}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-PETTYPE-LIST[1]/DIV[1]/DIV[1]/DIV[1]/APP-PETTYPE-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"), "pig"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(48), "Event fired: Edit");
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

	@Test(priority=20)
	public void method_BT90_path_1000014_47_49_50(){
		testSuiteHelper.newCurrentTestMethod("method_BT90_path_1000014_47_49_50", 20);
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
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[4]/A[1], element=Element{node=[A: null], tag=A, text=Pet Types, attributes={_ngcontent-gio-c0=, evlist=false, href=/petclinic/pettypes, ng-reflect-router-link=/pettypes, ng-reflect-router-link-active=active, routerlink=/pettypes, routerlinkactive=active, title=pettypes}}, source=HybridStateVertexImpl{id=0, name=index}, target=HybridStateVertexImpl{id=66, name=state66}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1000014), "Event fired: Pet Types");
			testSuiteHelper.runInCrawlingPlugins(66);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 66");

			testSuiteHelper.addStateToReportBuilder(66);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(66)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(66)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(66)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-PETTYPE-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Add, attributes={_ngcontent-oks-c2=, class=btn btn-default, evlist=false}}, source=HybridStateVertexImpl{id=66, name=state66}, target=HybridStateVertexImpl{id=90, name=state90}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(47), "Event fired: Add");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-PETTYPE-LIST[1]/DIV[1]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[2]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Delete, attributes={_ngcontent-mjt-c2=, anyaccess=none, class=btn btn-default, evlist=false}}, source=HybridStateVertexImpl{id=90, name=state90}, target=HybridStateVertexImpl{id=95, name=state95}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-PETTYPE-LIST[1]/DIV[1]/DIV[1]/DIV[1]/APP-PETTYPE-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"), "pig"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(49), "Event fired: Delete");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-PETTYPE-LIST[1]/DIV[1]/DIV[1]/DIV[1]/APP-PETTYPE-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save, attributes={_ngcontent-qha-c3=, anyaccess=none, class=btn btn-default, evlist=false, type=submit}}, source=HybridStateVertexImpl{id=95, name=state95}, target=HybridStateVertexImpl{id=66, name=state66}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-PETTYPE-LIST[1]/DIV[1]/DIV[1]/DIV[1]/APP-PETTYPE-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"), "pig"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(50), "Event fired: Save");
			testSuiteHelper.runInCrawlingPlugins(66);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 66");

			testSuiteHelper.addStateToReportBuilder(66);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(66)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(66)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(66)
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
	public void method_BT90_path_1000014_47_51(){
		testSuiteHelper.newCurrentTestMethod("method_BT90_path_1000014_47_51", 21);
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
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[4]/A[1], element=Element{node=[A: null], tag=A, text=Pet Types, attributes={_ngcontent-gio-c0=, evlist=false, href=/petclinic/pettypes, ng-reflect-router-link=/pettypes, ng-reflect-router-link-active=active, routerlink=/pettypes, routerlinkactive=active, title=pettypes}}, source=HybridStateVertexImpl{id=0, name=index}, target=HybridStateVertexImpl{id=66, name=state66}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1000014), "Event fired: Pet Types");
			testSuiteHelper.runInCrawlingPlugins(66);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 66");

			testSuiteHelper.addStateToReportBuilder(66);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(66)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(66)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(66)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-PETTYPE-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Add, attributes={_ngcontent-oks-c2=, class=btn btn-default, evlist=false}}, source=HybridStateVertexImpl{id=66, name=state66}, target=HybridStateVertexImpl{id=90, name=state90}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(47), "Event fired: Add");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-PETTYPE-LIST[1]/DIV[1]/DIV[1]/TABLE[1]/TBODY[1]/TR[2]/TD[2]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Edit, attributes={_ngcontent-mjt-c2=, anyaccess=none, class=btn btn-default, evlist=false}}, source=HybridStateVertexImpl{id=90, name=state90}, target=HybridStateVertexImpl{id=28, name=state28}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-PETTYPE-LIST[1]/DIV[1]/DIV[1]/DIV[1]/APP-PETTYPE-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"), "pig"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(51), "Event fired: Edit");
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

	@Test(priority=22)
	public void method_BT95_path_1000014_47_49_52(){
		testSuiteHelper.newCurrentTestMethod("method_BT95_path_1000014_47_49_52", 22);
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
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[4]/A[1], element=Element{node=[A: null], tag=A, text=Pet Types, attributes={_ngcontent-gio-c0=, evlist=false, href=/petclinic/pettypes, ng-reflect-router-link=/pettypes, ng-reflect-router-link-active=active, routerlink=/pettypes, routerlinkactive=active, title=pettypes}}, source=HybridStateVertexImpl{id=0, name=index}, target=HybridStateVertexImpl{id=66, name=state66}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1000014), "Event fired: Pet Types");
			testSuiteHelper.runInCrawlingPlugins(66);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 66");

			testSuiteHelper.addStateToReportBuilder(66);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(66)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(66)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(66)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-PETTYPE-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Add, attributes={_ngcontent-oks-c2=, class=btn btn-default, evlist=false}}, source=HybridStateVertexImpl{id=66, name=state66}, target=HybridStateVertexImpl{id=90, name=state90}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(47), "Event fired: Add");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-PETTYPE-LIST[1]/DIV[1]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[2]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Delete, attributes={_ngcontent-mjt-c2=, anyaccess=none, class=btn btn-default, evlist=false}}, source=HybridStateVertexImpl{id=90, name=state90}, target=HybridStateVertexImpl{id=95, name=state95}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-PETTYPE-LIST[1]/DIV[1]/DIV[1]/DIV[1]/APP-PETTYPE-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"), "pig"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(49), "Event fired: Delete");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-PETTYPE-LIST[1]/DIV[1]/DIV[1]/DIV[2]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Home, attributes={_ngcontent-qha-c2=, class=btn btn-default, evlist=false}}, source=HybridStateVertexImpl{id=95, name=state95}, target=HybridStateVertexImpl{id=0, name=index}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-PETTYPE-LIST[1]/DIV[1]/DIV[1]/DIV[1]/APP-PETTYPE-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"), "pig"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(52), "Event fired: Home");
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

	@Test(priority=23)
	public void method_BT90_failed_path_1000029_1000030(){
		testSuiteHelper.newCurrentTestMethod("method_BT90_failed_path_1000029_1000030", 23);
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
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[4]/A[1], element=Element{node=[A: null], tag=A, text=Pet Types, attributes={_ngcontent-gio-c0=, evlist=false, href=/petclinic/pettypes, ng-reflect-router-link=/pettypes, ng-reflect-router-link-active=active, routerlink=/pettypes, routerlinkactive=active, title=pettypes}}, source=HybridStateVertexImpl{id=0, name=index}, target=HybridStateVertexImpl{id=107, name=state107}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1000029), "Event fired: Pet Types");
			testSuiteHelper.runInCrawlingPlugins(107);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 107");

			testSuiteHelper.addStateToReportBuilder(107);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(107)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(107)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(107)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-PETTYPE-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Add, attributes={_ngcontent-rkt-c2=, class=btn btn-default, evlist=false}}, source=HybridStateVertexImpl{id=107, name=state107}, target=HybridStateVertexImpl{id=95, name=state95}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1000030), "Event fired: Add");
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

	@Test(priority=24)
	public void method_BT107_path_1000029_53(){
		testSuiteHelper.newCurrentTestMethod("method_BT107_path_1000029_53", 24);
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
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[4]/A[1], element=Element{node=[A: null], tag=A, text=Pet Types, attributes={_ngcontent-gio-c0=, evlist=false, href=/petclinic/pettypes, ng-reflect-router-link=/pettypes, ng-reflect-router-link-active=active, routerlink=/pettypes, routerlinkactive=active, title=pettypes}}, source=HybridStateVertexImpl{id=0, name=index}, target=HybridStateVertexImpl{id=107, name=state107}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1000029), "Event fired: Pet Types");
			testSuiteHelper.runInCrawlingPlugins(107);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 107");

			testSuiteHelper.addStateToReportBuilder(107);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(107)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(107)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(107)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-PETTYPE-LIST[1]/DIV[1]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[2]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Edit, attributes={_ngcontent-rkt-c2=, anyaccess=none, class=btn btn-default, evlist=false}}, source=HybridStateVertexImpl{id=107, name=state107}, target=HybridStateVertexImpl{id=28, name=state28}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(53), "Event fired: Edit");
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

	@Test(priority=25)
	public void method_BT107_path_1000029_54_55(){
		testSuiteHelper.newCurrentTestMethod("method_BT107_path_1000029_54_55", 25);
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
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[4]/A[1], element=Element{node=[A: null], tag=A, text=Pet Types, attributes={_ngcontent-gio-c0=, evlist=false, href=/petclinic/pettypes, ng-reflect-router-link=/pettypes, ng-reflect-router-link-active=active, routerlink=/pettypes, routerlinkactive=active, title=pettypes}}, source=HybridStateVertexImpl{id=0, name=index}, target=HybridStateVertexImpl{id=107, name=state107}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1000029), "Event fired: Pet Types");
			testSuiteHelper.runInCrawlingPlugins(107);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 107");

			testSuiteHelper.addStateToReportBuilder(107);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(107)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(107)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(107)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-PETTYPE-LIST[1]/DIV[1]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[2]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Delete, attributes={_ngcontent-rkt-c2=, anyaccess=none, class=btn btn-default, evlist=false}}, source=HybridStateVertexImpl{id=107, name=state107}, target=HybridStateVertexImpl{id=115, name=state115}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(54), "Event fired: Delete");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={_ngcontent-uji-c0=, class=navbar-brand, evlist=false, href=#}}, source=HybridStateVertexImpl{id=115, name=state115}, target=HybridStateVertexImpl{id=0, name=index}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(55), "Event fired: ");
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

	@Test(priority=26)
	public void method_BT95_failed_path_1000033_1000034(){
		testSuiteHelper.newCurrentTestMethod("method_BT95_failed_path_1000033_1000034", 26);
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
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[4]/A[1], element=Element{node=[A: null], tag=A, text=Pet Types, attributes={_ngcontent-gio-c0=, evlist=false, href=/petclinic/pettypes, ng-reflect-router-link=/pettypes, ng-reflect-router-link-active=active, routerlink=/pettypes, routerlinkactive=active, title=pettypes}}, source=HybridStateVertexImpl{id=0, name=index}, target=HybridStateVertexImpl{id=115, name=state115}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1000033), "Event fired: Pet Types");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-PETTYPE-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Add, attributes={_ngcontent-uji-c2=, class=btn btn-default, evlist=false}}, source=HybridStateVertexImpl{id=115, name=state115}, target=HybridStateVertexImpl{id=119, name=state119}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1000034), "Event fired: Add");
			testSuiteHelper.runInCrawlingPlugins(119);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 119");

			testSuiteHelper.addStateToReportBuilder(119);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(119)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(119)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(119)
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
	public void method_BT119_path_1000033_1000034_56_57(){
		testSuiteHelper.newCurrentTestMethod("method_BT119_path_1000033_1000034_56_57", 27);
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
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[4]/A[1], element=Element{node=[A: null], tag=A, text=Pet Types, attributes={_ngcontent-gio-c0=, evlist=false, href=/petclinic/pettypes, ng-reflect-router-link=/pettypes, ng-reflect-router-link-active=active, routerlink=/pettypes, routerlinkactive=active, title=pettypes}}, source=HybridStateVertexImpl{id=0, name=index}, target=HybridStateVertexImpl{id=115, name=state115}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1000033), "Event fired: Pet Types");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-PETTYPE-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Add, attributes={_ngcontent-uji-c2=, class=btn btn-default, evlist=false}}, source=HybridStateVertexImpl{id=115, name=state115}, target=HybridStateVertexImpl{id=119, name=state119}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1000034), "Event fired: Add");
			testSuiteHelper.runInCrawlingPlugins(119);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 119");

			testSuiteHelper.addStateToReportBuilder(119);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(119)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(119)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(119)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-PETTYPE-LIST[1]/DIV[1]/DIV[1]/DIV[2]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Add, attributes={_ngcontent-cph-c2=, class=btn btn-default, evlist=false}}, source=HybridStateVertexImpl{id=119, name=state119}, target=HybridStateVertexImpl{id=115, name=state115}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-PETTYPE-LIST[1]/DIV[1]/DIV[1]/DIV[1]/APP-PETTYPE-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"), "pig"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(56), "Event fired: Add");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-PETTYPE-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Home, attributes={_ngcontent-uji-c2=, class=btn btn-default, evlist=false}}, source=HybridStateVertexImpl{id=115, name=state115}, target=HybridStateVertexImpl{id=0, name=index}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(57), "Event fired: Home");
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
	public void method_BT119_path_1000033_1000034_58(){
		testSuiteHelper.newCurrentTestMethod("method_BT119_path_1000033_1000034_58", 28);
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
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[4]/A[1], element=Element{node=[A: null], tag=A, text=Pet Types, attributes={_ngcontent-gio-c0=, evlist=false, href=/petclinic/pettypes, ng-reflect-router-link=/pettypes, ng-reflect-router-link-active=active, routerlink=/pettypes, routerlinkactive=active, title=pettypes}}, source=HybridStateVertexImpl{id=0, name=index}, target=HybridStateVertexImpl{id=115, name=state115}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1000033), "Event fired: Pet Types");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-PETTYPE-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Add, attributes={_ngcontent-uji-c2=, class=btn btn-default, evlist=false}}, source=HybridStateVertexImpl{id=115, name=state115}, target=HybridStateVertexImpl{id=119, name=state119}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1000034), "Event fired: Add");
			testSuiteHelper.runInCrawlingPlugins(119);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 119");

			testSuiteHelper.addStateToReportBuilder(119);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(119)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(119)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(119)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={_ngcontent-cph-c0=, class=navbar-brand, evlist=false, href=#}}, source=HybridStateVertexImpl{id=119, name=state119}, target=HybridStateVertexImpl{id=0, name=index}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-PETTYPE-LIST[1]/DIV[1]/DIV[1]/DIV[1]/APP-PETTYPE-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"), "pig"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(58), "Event fired: ");
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

	@Test(priority=29)
	public void method_BT5_failed_path_1000039(){
		testSuiteHelper.newCurrentTestMethod("method_BT5_failed_path_1000039", 29);
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
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Search, attributes={_ngcontent-gio-c0=, evlist=false, href=/petclinic/owners, ng-reflect-router-link=/owners, routerlink=/owners}}, source=HybridStateVertexImpl{id=0, name=index}, target=HybridStateVertexImpl{id=133, name=state133}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1000039), "Event fired: Search");
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
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=30)
	public void method_BT133_path_1000039_59_60(){
		testSuiteHelper.newCurrentTestMethod("method_BT133_path_1000039_59_60", 30);
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
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Search, attributes={_ngcontent-gio-c0=, evlist=false, href=/petclinic/owners, ng-reflect-router-link=/owners, routerlink=/owners}}, source=HybridStateVertexImpl{id=0, name=index}, target=HybridStateVertexImpl{id=133, name=state133}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1000039), "Event fired: Search");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-LIST[1]/DIV[1]/DIV[1]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/A[1], element=Element{node=[A: null], tag=A, text=George Franklin, attributes={_ngcontent-ssn-c1=, anyaccess=none, evlist=false, href=/petclinic/owners/1, ng-reflect-router-link=/owners/1, ng-reflect-router-link-active=active, routerlinkactive=active}}, source=HybridStateVertexImpl{id=133, name=state133}, target=HybridStateVertexImpl{id=137, name=state137}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-LIST[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"), "yu"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(59), "Event fired: George Franklin");
			testSuiteHelper.runInCrawlingPlugins(137);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 137");

			testSuiteHelper.addStateToReportBuilder(137);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(137)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(137)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(137)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={_ngcontent-yvs-c0=, class=navbar-brand, evlist=false, href=#}}, source=HybridStateVertexImpl{id=137, name=state137}, target=HybridStateVertexImpl{id=0, name=index}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(60), "Event fired: ");
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

	@Test(priority=31)
	public void method_BT133_path_1000039_61(){
		testSuiteHelper.newCurrentTestMethod("method_BT133_path_1000039_61", 31);
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
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Search, attributes={_ngcontent-gio-c0=, evlist=false, href=/petclinic/owners, ng-reflect-router-link=/owners, routerlink=/owners}}, source=HybridStateVertexImpl{id=0, name=index}, target=HybridStateVertexImpl{id=133, name=state133}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1000039), "Event fired: Search");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={_ngcontent-ssn-c0=, class=navbar-brand, evlist=false, href=#}}, source=HybridStateVertexImpl{id=133, name=state133}, target=HybridStateVertexImpl{id=0, name=index}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-LIST[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"), "yu"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(61), "Event fired: ");
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

	@Test(priority=32)
	public void method_BT133_path_1000039_62_63(){
		testSuiteHelper.newCurrentTestMethod("method_BT133_path_1000039_62_63", 32);
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
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Search, attributes={_ngcontent-gio-c0=, evlist=false, href=/petclinic/owners, ng-reflect-router-link=/owners, routerlink=/owners}}, source=HybridStateVertexImpl{id=0, name=index}, target=HybridStateVertexImpl{id=133, name=state133}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1000039), "Event fired: Search");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-LIST[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Find Owner, attributes={_ngcontent-ssn-c1=, class=btn btn-default, evlist=false, type=submit}}, source=HybridStateVertexImpl{id=133, name=state133}, target=HybridStateVertexImpl{id=144, name=state144}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-LIST[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"), "yu"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(62), "Event fired: Find Owner");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-LIST[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Add Owner, attributes={_ngcontent-wuc-c1=, class=btn btn-default, evlist=false}}, source=HybridStateVertexImpl{id=144, name=state144}, target=HybridStateVertexImpl{id=7, name=state7}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-LIST[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"), "yu"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(63), "Event fired: Add Owner");
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
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=33)
	public void method_BT33_path_6_1000009_32(){
		testSuiteHelper.newCurrentTestMethod("method_BT33_path_6_1000009_32", 33);
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
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Add New, attributes={_ngcontent-gio-c0=, evlist=false, href=/petclinic/owners/add, ng-reflect-router-link=/owners/add, routerlink=/owners/add}}, source=HybridStateVertexImpl{id=0, name=index}, target=HybridStateVertexImpl{id=7, name=state7}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(6), "Event fired: Add New");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[3]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=All, attributes={_ngcontent-wts-c0=, anyaccess=none, evlist=false, href=/petclinic/vets, ng-reflect-router-link=/vets, routerlink=/vets}}, source=HybridStateVertexImpl{id=7, name=state7}, target=HybridStateVertexImpl{id=49, name=state49}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"), "pipi"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"), "yu"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[4]/DIV[1]/INPUT[1]"), "2710"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[5]/DIV[1]/INPUT[1]"), "Austin"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[6]/DIV[1]/INPUT[1]"), "5122005208"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(1000009), "Event fired: All");
			testSuiteHelper.runInCrawlingPlugins(49);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 49");

			testSuiteHelper.addStateToReportBuilder(49);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(49)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(49)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(49)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-VET-LIST[1]/DIV[1]/DIV[1]/TABLE[1]/TBODY[1]/TR[3]/TD[3]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Edit Vet, attributes={_ngcontent-ysy-c1=, anyaccess=none, class=btn btn-default, evlist=false}}, source=HybridStateVertexImpl{id=49, name=state49}, target=HybridStateVertexImpl{id=33, name=state33}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(32), "Event fired: Edit Vet");
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
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=34)
	public void method_BT34_failed_35_path_6_1000009_32_1000049(){
		testSuiteHelper.newCurrentTestMethod("method_BT34_failed_35_path_6_1000009_32_1000049", 34);
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
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Add New, attributes={_ngcontent-gio-c0=, evlist=false, href=/petclinic/owners/add, ng-reflect-router-link=/owners/add, routerlink=/owners/add}}, source=HybridStateVertexImpl{id=0, name=index}, target=HybridStateVertexImpl{id=7, name=state7}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(6), "Event fired: Add New");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[3]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=All, attributes={_ngcontent-wts-c0=, anyaccess=none, evlist=false, href=/petclinic/vets, ng-reflect-router-link=/vets, routerlink=/vets}}, source=HybridStateVertexImpl{id=7, name=state7}, target=HybridStateVertexImpl{id=49, name=state49}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"), "pipi"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"), "yu"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[4]/DIV[1]/INPUT[1]"), "2710"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[5]/DIV[1]/INPUT[1]"), "Austin"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[6]/DIV[1]/INPUT[1]"), "5122005208"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(1000009), "Event fired: All");
			testSuiteHelper.runInCrawlingPlugins(49);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 49");

			testSuiteHelper.addStateToReportBuilder(49);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(49)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(49)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(49)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-VET-LIST[1]/DIV[1]/DIV[1]/TABLE[1]/TBODY[1]/TR[3]/TD[3]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Edit Vet, attributes={_ngcontent-ysy-c1=, anyaccess=none, class=btn btn-default, evlist=false}}, source=HybridStateVertexImpl{id=49, name=state49}, target=HybridStateVertexImpl{id=33, name=state33}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(32), "Event fired: Edit Vet");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-VET-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[5]/DIV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=< Back, attributes={_ngcontent-gin-c2=, anyaccess=none, class=btn btn-default, evlist=false, type=button}}, source=HybridStateVertexImpl{id=33, name=state33}, target=HybridStateVertexImpl{id=35, name=state35}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-VET-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"), "pipi"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-VET-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"), "yu"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(1000049), "Event fired: < Back");
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

	@Test(priority=35)
	public void method_BT49_path_6_1000009_64_65(){
		testSuiteHelper.newCurrentTestMethod("method_BT49_path_6_1000009_64_65", 35);
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
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Add New, attributes={_ngcontent-gio-c0=, evlist=false, href=/petclinic/owners/add, ng-reflect-router-link=/owners/add, routerlink=/owners/add}}, source=HybridStateVertexImpl{id=0, name=index}, target=HybridStateVertexImpl{id=7, name=state7}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(6), "Event fired: Add New");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[3]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=All, attributes={_ngcontent-wts-c0=, anyaccess=none, evlist=false, href=/petclinic/vets, ng-reflect-router-link=/vets, routerlink=/vets}}, source=HybridStateVertexImpl{id=7, name=state7}, target=HybridStateVertexImpl{id=49, name=state49}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"), "pipi"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"), "yu"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[4]/DIV[1]/INPUT[1]"), "2710"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[5]/DIV[1]/INPUT[1]"), "Austin"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[6]/DIV[1]/INPUT[1]"), "5122005208"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(1000009), "Event fired: All");
			testSuiteHelper.runInCrawlingPlugins(49);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 49");

			testSuiteHelper.addStateToReportBuilder(49);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(49)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(49)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(49)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-VET-LIST[1]/DIV[1]/DIV[1]/TABLE[1]/TBODY[1]/TR[3]/TD[3]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Delete Vet, attributes={_ngcontent-ysy-c1=, anyaccess=none, class=btn btn-default, evlist=false}}, source=HybridStateVertexImpl{id=49, name=state49}, target=HybridStateVertexImpl{id=159, name=state159}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(64), "Event fired: Delete Vet");
			testSuiteHelper.runInCrawlingPlugins(159);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 159");

			testSuiteHelper.addStateToReportBuilder(159);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(159)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(159)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(159)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={_ngcontent-hbn-c0=, class=navbar-brand, evlist=false, href=#}}, source=HybridStateVertexImpl{id=159, name=state159}, target=HybridStateVertexImpl{id=0, name=index}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(65), "Event fired: ");
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

	@Test(priority=36)
	public void method_BT159_path_6_1000053_66(){
		testSuiteHelper.newCurrentTestMethod("method_BT159_path_6_1000053_66", 36);
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
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Add New, attributes={_ngcontent-gio-c0=, evlist=false, href=/petclinic/owners/add, ng-reflect-router-link=/owners/add, routerlink=/owners/add}}, source=HybridStateVertexImpl{id=0, name=index}, target=HybridStateVertexImpl{id=7, name=state7}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(6), "Event fired: Add New");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[3]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=All, attributes={_ngcontent-wts-c0=, anyaccess=none, evlist=false, href=/petclinic/vets, ng-reflect-router-link=/vets, routerlink=/vets}}, source=HybridStateVertexImpl{id=7, name=state7}, target=HybridStateVertexImpl{id=159, name=state159}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"), "pipi"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"), "yu"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[4]/DIV[1]/INPUT[1]"), "2710"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[5]/DIV[1]/INPUT[1]"), "Austin"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[6]/DIV[1]/INPUT[1]"), "5122005208"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(1000053), "Event fired: All");
			testSuiteHelper.runInCrawlingPlugins(159);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 159");

			testSuiteHelper.addStateToReportBuilder(159);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(159)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(159)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(159)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-VET-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Home, attributes={_ngcontent-hbn-c1=, class=btn btn-default, evlist=false}}, source=HybridStateVertexImpl{id=159, name=state159}, target=HybridStateVertexImpl{id=0, name=index}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(66), "Event fired: Home");
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

	@Test(priority=37)
	public void method_BT159_path_6_1000053_67_68(){
		testSuiteHelper.newCurrentTestMethod("method_BT159_path_6_1000053_67_68", 37);
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
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Add New, attributes={_ngcontent-gio-c0=, evlist=false, href=/petclinic/owners/add, ng-reflect-router-link=/owners/add, routerlink=/owners/add}}, source=HybridStateVertexImpl{id=0, name=index}, target=HybridStateVertexImpl{id=7, name=state7}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(6), "Event fired: Add New");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[3]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=All, attributes={_ngcontent-wts-c0=, anyaccess=none, evlist=false, href=/petclinic/vets, ng-reflect-router-link=/vets, routerlink=/vets}}, source=HybridStateVertexImpl{id=7, name=state7}, target=HybridStateVertexImpl{id=159, name=state159}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"), "pipi"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"), "yu"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[4]/DIV[1]/INPUT[1]"), "2710"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[5]/DIV[1]/INPUT[1]"), "Austin"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[6]/DIV[1]/INPUT[1]"), "5122005208"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(1000053), "Event fired: All");
			testSuiteHelper.runInCrawlingPlugins(159);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 159");

			testSuiteHelper.addStateToReportBuilder(159);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(159)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(159)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(159)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-VET-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Add Vet, attributes={_ngcontent-hbn-c1=, class=btn btn-default, evlist=false}}, source=HybridStateVertexImpl{id=159, name=state159}, target=HybridStateVertexImpl{id=14, name=state14}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(67), "Event fired: Add Vet");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={_ngcontent-wkb-c0=, class=navbar-brand, evlist=false, href=#}}, source=HybridStateVertexImpl{id=14, name=state14}, target=HybridStateVertexImpl{id=0, name=index}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"), "pipi"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"), "yu"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[4]/DIV[1]/DIV[1]/SELECT[1]"), "surgery"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(68), "Event fired: ");
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

	@Test(priority=38)
	public void method_BT82_failed_path_6_1000057(){
		testSuiteHelper.newCurrentTestMethod("method_BT82_failed_path_6_1000057", 38);
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
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Add New, attributes={_ngcontent-gio-c0=, evlist=false, href=/petclinic/owners/add, ng-reflect-router-link=/owners/add, routerlink=/owners/add}}, source=HybridStateVertexImpl{id=0, name=index}, target=HybridStateVertexImpl{id=7, name=state7}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(6), "Event fired: Add New");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[7]/DIV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Back, attributes={_ngcontent-wts-c1=, class=btn btn-default, evlist=false, type=button}}, source=HybridStateVertexImpl{id=7, name=state7}, target=HybridStateVertexImpl{id=133, name=state133}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"), "pipi"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"), "yu"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[4]/DIV[1]/INPUT[1]"), "2710"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[5]/DIV[1]/INPUT[1]"), "Austin"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[6]/DIV[1]/INPUT[1]"), "5122005208"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(1000057), "Event fired: Back");
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
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=39)
	public void method_BT86_failed_path_6_1000059(){
		testSuiteHelper.newCurrentTestMethod("method_BT86_failed_path_6_1000059", 39);
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
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Add New, attributes={_ngcontent-gio-c0=, evlist=false, href=/petclinic/owners/add, ng-reflect-router-link=/owners/add, routerlink=/owners/add}}, source=HybridStateVertexImpl{id=0, name=index}, target=HybridStateVertexImpl{id=7, name=state7}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(6), "Event fired: Add New");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[7]/DIV[1]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Add Owner, attributes={_ngcontent-wts-c1=, class=btn btn-default, disabled=, evlist=false, type=submit}}, source=HybridStateVertexImpl{id=7, name=state7}, target=HybridStateVertexImpl{id=176, name=state176}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"), "pipi"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"), "yu"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[4]/DIV[1]/INPUT[1]"), "2710"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[5]/DIV[1]/INPUT[1]"), "Austin"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[6]/DIV[1]/INPUT[1]"), "5122005208"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(1000059), "Event fired: Add Owner");
			testSuiteHelper.runInCrawlingPlugins(176);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 176");

			testSuiteHelper.addStateToReportBuilder(176);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(176)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(176)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(176)
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
	public void method_BT115_path_1000033(){
		testSuiteHelper.newCurrentTestMethod("method_BT115_path_1000033", 40);
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
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[4]/A[1], element=Element{node=[A: null], tag=A, text=Pet Types, attributes={_ngcontent-gio-c0=, evlist=false, href=/petclinic/pettypes, ng-reflect-router-link=/pettypes, ng-reflect-router-link-active=active, routerlink=/pettypes, routerlinkactive=active, title=pettypes}}, source=HybridStateVertexImpl{id=0, name=index}, target=HybridStateVertexImpl{id=115, name=state115}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1000033), "Event fired: Pet Types");
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
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=41)
	public void method_BT119_path_1000033_1000034(){
		testSuiteHelper.newCurrentTestMethod("method_BT119_path_1000033_1000034", 41);
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
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[4]/A[1], element=Element{node=[A: null], tag=A, text=Pet Types, attributes={_ngcontent-gio-c0=, evlist=false, href=/petclinic/pettypes, ng-reflect-router-link=/pettypes, ng-reflect-router-link-active=active, routerlink=/pettypes, routerlinkactive=active, title=pettypes}}, source=HybridStateVertexImpl{id=0, name=index}, target=HybridStateVertexImpl{id=115, name=state115}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1000033), "Event fired: Pet Types");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-PETTYPE-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Add, attributes={_ngcontent-uji-c2=, class=btn btn-default, evlist=false}}, source=HybridStateVertexImpl{id=115, name=state115}, target=HybridStateVertexImpl{id=119, name=state119}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1000034), "Event fired: Add");
			testSuiteHelper.runInCrawlingPlugins(119);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 119");

			testSuiteHelper.addStateToReportBuilder(119);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(119)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(119)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(119)
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
	public void method_BT133_failed_176_path_1000063(){
		testSuiteHelper.newCurrentTestMethod("method_BT133_failed_176_path_1000063", 42);
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
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Search, attributes={_ngcontent-gio-c0=, evlist=false, href=/petclinic/owners, ng-reflect-router-link=/owners, routerlink=/owners}}, source=HybridStateVertexImpl{id=0, name=index}, target=HybridStateVertexImpl{id=176, name=state176}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1000063), "Event fired: Search");
			testSuiteHelper.runInCrawlingPlugins(176);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 176");

			testSuiteHelper.addStateToReportBuilder(176);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(176)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(176)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(176)
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
	public void method_BT137_path_6_1000065_1000066_69(){
		testSuiteHelper.newCurrentTestMethod("method_BT137_path_6_1000065_1000066_69", 43);
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
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Add New, attributes={_ngcontent-gio-c0=, evlist=false, href=/petclinic/owners/add, ng-reflect-router-link=/owners/add, routerlink=/owners/add}}, source=HybridStateVertexImpl{id=0, name=index}, target=HybridStateVertexImpl{id=7, name=state7}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(6), "Event fired: Add New");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[7]/DIV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Back, attributes={_ngcontent-wts-c1=, class=btn btn-default, evlist=false, type=button}}, source=HybridStateVertexImpl{id=7, name=state7}, target=HybridStateVertexImpl{id=176, name=state176}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"), "pipi"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"), "yu"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[4]/DIV[1]/INPUT[1]"), "2710"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[5]/DIV[1]/INPUT[1]"), "Austin"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[6]/DIV[1]/INPUT[1]"), "5122005208"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(1000065), "Event fired: Back");
			testSuiteHelper.runInCrawlingPlugins(176);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 176");

			testSuiteHelper.addStateToReportBuilder(176);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(176)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(176)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(176)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-LIST[1]/DIV[1]/DIV[1]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/A[1], element=Element{node=[A: null], tag=A, text=George Franklin, attributes={_ngcontent-wdx-c2=, anyaccess=action, evlist=false, href=/petclinic/owners/1, ng-reflect-router-link=/owners/1, ng-reflect-router-link-active=active, routerlinkactive=active}}, source=HybridStateVertexImpl{id=176, name=state176}, target=HybridStateVertexImpl{id=137, name=state137}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-LIST[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"), "yu"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(1000066), "Event fired: George Franklin");
			testSuiteHelper.runInCrawlingPlugins(137);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 137");

			testSuiteHelper.addStateToReportBuilder(137);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(137)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(137)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(137)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Home, attributes={_ngcontent-yvs-c0=, evlist=false, href=/petclinic/welcome, ng-reflect-router-link=welcome, routerlink=welcome, title=home page}}, source=HybridStateVertexImpl{id=137, name=state137}, target=HybridStateVertexImpl{id=0, name=index}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(69), "Event fired: Home");
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

	@Test(priority=44)
	public void method_BT159_path_6_1000053(){
		testSuiteHelper.newCurrentTestMethod("method_BT159_path_6_1000053", 44);
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
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Add New, attributes={_ngcontent-gio-c0=, evlist=false, href=/petclinic/owners/add, ng-reflect-router-link=/owners/add, routerlink=/owners/add}}, source=HybridStateVertexImpl{id=0, name=index}, target=HybridStateVertexImpl{id=7, name=state7}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(6), "Event fired: Add New");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[3]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=All, attributes={_ngcontent-wts-c0=, anyaccess=none, evlist=false, href=/petclinic/vets, ng-reflect-router-link=/vets, routerlink=/vets}}, source=HybridStateVertexImpl{id=7, name=state7}, target=HybridStateVertexImpl{id=159, name=state159}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"), "pipi"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"), "yu"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[4]/DIV[1]/INPUT[1]"), "2710"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[5]/DIV[1]/INPUT[1]"), "Austin"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[6]/DIV[1]/INPUT[1]"), "5122005208"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(1000053), "Event fired: All");
			testSuiteHelper.runInCrawlingPlugins(159);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 159");

			testSuiteHelper.addStateToReportBuilder(159);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(159)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(159)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(159)
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
	public void method_BT14_path_6_1000053_67(){
		testSuiteHelper.newCurrentTestMethod("method_BT14_path_6_1000053_67", 45);
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
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Add New, attributes={_ngcontent-gio-c0=, evlist=false, href=/petclinic/owners/add, ng-reflect-router-link=/owners/add, routerlink=/owners/add}}, source=HybridStateVertexImpl{id=0, name=index}, target=HybridStateVertexImpl{id=7, name=state7}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(6), "Event fired: Add New");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[3]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=All, attributes={_ngcontent-wts-c0=, anyaccess=none, evlist=false, href=/petclinic/vets, ng-reflect-router-link=/vets, routerlink=/vets}}, source=HybridStateVertexImpl{id=7, name=state7}, target=HybridStateVertexImpl{id=159, name=state159}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"), "pipi"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"), "yu"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[4]/DIV[1]/INPUT[1]"), "2710"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[5]/DIV[1]/INPUT[1]"), "Austin"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[6]/DIV[1]/INPUT[1]"), "5122005208"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(1000053), "Event fired: All");
			testSuiteHelper.runInCrawlingPlugins(159);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 159");

			testSuiteHelper.addStateToReportBuilder(159);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(159)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(159)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(159)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-VET-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Add Vet, attributes={_ngcontent-hbn-c1=, class=btn btn-default, evlist=false}}, source=HybridStateVertexImpl{id=159, name=state159}, target=HybridStateVertexImpl{id=14, name=state14}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(67), "Event fired: Add Vet");
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

	@Test(priority=46)
	public void method_BT137_path_1000063_1000066_71(){
		testSuiteHelper.newCurrentTestMethod("method_BT137_path_1000063_1000066_71", 46);
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
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Search, attributes={_ngcontent-gio-c0=, evlist=false, href=/petclinic/owners, ng-reflect-router-link=/owners, routerlink=/owners}}, source=HybridStateVertexImpl{id=0, name=index}, target=HybridStateVertexImpl{id=176, name=state176}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1000063), "Event fired: Search");
			testSuiteHelper.runInCrawlingPlugins(176);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 176");

			testSuiteHelper.addStateToReportBuilder(176);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(176)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(176)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(176)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-LIST[1]/DIV[1]/DIV[1]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/A[1], element=Element{node=[A: null], tag=A, text=George Franklin, attributes={_ngcontent-wdx-c2=, anyaccess=action, evlist=false, href=/petclinic/owners/1, ng-reflect-router-link=/owners/1, ng-reflect-router-link-active=active, routerlinkactive=active}}, source=HybridStateVertexImpl{id=176, name=state176}, target=HybridStateVertexImpl{id=137, name=state137}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-LIST[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"), "yu"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(1000066), "Event fired: George Franklin");
			testSuiteHelper.runInCrawlingPlugins(137);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 137");

			testSuiteHelper.addStateToReportBuilder(137);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(137)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(137)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(137)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Search, attributes={_ngcontent-yvs-c0=, evlist=false, href=/petclinic/owners, ng-reflect-router-link=/owners, routerlink=/owners}}, source=HybridStateVertexImpl{id=137, name=state137}, target=HybridStateVertexImpl{id=176, name=state176}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(71), "Event fired: Search");
			testSuiteHelper.runInCrawlingPlugins(176);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 176");

			testSuiteHelper.addStateToReportBuilder(176);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(176)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(176)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(176)
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
	public void method_BT137_path_1000063_1000066_72(){
		testSuiteHelper.newCurrentTestMethod("method_BT137_path_1000063_1000066_72", 47);
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
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Search, attributes={_ngcontent-gio-c0=, evlist=false, href=/petclinic/owners, ng-reflect-router-link=/owners, routerlink=/owners}}, source=HybridStateVertexImpl{id=0, name=index}, target=HybridStateVertexImpl{id=176, name=state176}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1000063), "Event fired: Search");
			testSuiteHelper.runInCrawlingPlugins(176);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 176");

			testSuiteHelper.addStateToReportBuilder(176);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(176)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(176)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(176)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-LIST[1]/DIV[1]/DIV[1]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/A[1], element=Element{node=[A: null], tag=A, text=George Franklin, attributes={_ngcontent-wdx-c2=, anyaccess=action, evlist=false, href=/petclinic/owners/1, ng-reflect-router-link=/owners/1, ng-reflect-router-link-active=active, routerlinkactive=active}}, source=HybridStateVertexImpl{id=176, name=state176}, target=HybridStateVertexImpl{id=137, name=state137}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-LIST[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"), "yu"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(1000066), "Event fired: George Franklin");
			testSuiteHelper.runInCrawlingPlugins(137);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 137");

			testSuiteHelper.addStateToReportBuilder(137);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(137)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(137)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(137)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Add New, attributes={_ngcontent-yvs-c0=, evlist=false, href=/petclinic/owners/add, ng-reflect-router-link=/owners/add, routerlink=/owners/add}}, source=HybridStateVertexImpl{id=137, name=state137}, target=HybridStateVertexImpl{id=7, name=state7}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(72), "Event fired: Add New");
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
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=48)
	public void method_BT137_path_1000063_1000066_74(){
		testSuiteHelper.newCurrentTestMethod("method_BT137_path_1000063_1000066_74", 48);
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
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Search, attributes={_ngcontent-gio-c0=, evlist=false, href=/petclinic/owners, ng-reflect-router-link=/owners, routerlink=/owners}}, source=HybridStateVertexImpl{id=0, name=index}, target=HybridStateVertexImpl{id=176, name=state176}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1000063), "Event fired: Search");
			testSuiteHelper.runInCrawlingPlugins(176);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 176");

			testSuiteHelper.addStateToReportBuilder(176);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(176)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(176)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(176)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-LIST[1]/DIV[1]/DIV[1]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/A[1], element=Element{node=[A: null], tag=A, text=George Franklin, attributes={_ngcontent-wdx-c2=, anyaccess=action, evlist=false, href=/petclinic/owners/1, ng-reflect-router-link=/owners/1, ng-reflect-router-link-active=active, routerlinkactive=active}}, source=HybridStateVertexImpl{id=176, name=state176}, target=HybridStateVertexImpl{id=137, name=state137}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-LIST[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"), "yu"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(1000066), "Event fired: George Franklin");
			testSuiteHelper.runInCrawlingPlugins(137);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 137");

			testSuiteHelper.addStateToReportBuilder(137);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(137)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(137)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(137)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[3]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=All, attributes={_ngcontent-yvs-c0=, evlist=false, href=/petclinic/vets, ng-reflect-router-link=/vets, routerlink=/vets}}, source=HybridStateVertexImpl{id=137, name=state137}, target=HybridStateVertexImpl{id=159, name=state159}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(74), "Event fired: All");
			testSuiteHelper.runInCrawlingPlugins(159);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 159");

			testSuiteHelper.addStateToReportBuilder(159);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(159)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(159)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(159)
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
	public void method_BT137_path_1000063_1000066_75(){
		testSuiteHelper.newCurrentTestMethod("method_BT137_path_1000063_1000066_75", 49);
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
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Search, attributes={_ngcontent-gio-c0=, evlist=false, href=/petclinic/owners, ng-reflect-router-link=/owners, routerlink=/owners}}, source=HybridStateVertexImpl{id=0, name=index}, target=HybridStateVertexImpl{id=176, name=state176}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1000063), "Event fired: Search");
			testSuiteHelper.runInCrawlingPlugins(176);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 176");

			testSuiteHelper.addStateToReportBuilder(176);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(176)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(176)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(176)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-LIST[1]/DIV[1]/DIV[1]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/A[1], element=Element{node=[A: null], tag=A, text=George Franklin, attributes={_ngcontent-wdx-c2=, anyaccess=action, evlist=false, href=/petclinic/owners/1, ng-reflect-router-link=/owners/1, ng-reflect-router-link-active=active, routerlinkactive=active}}, source=HybridStateVertexImpl{id=176, name=state176}, target=HybridStateVertexImpl{id=137, name=state137}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-LIST[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"), "yu"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(1000066), "Event fired: George Franklin");
			testSuiteHelper.runInCrawlingPlugins(137);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 137");

			testSuiteHelper.addStateToReportBuilder(137);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(137)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(137)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(137)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[3]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Add New, attributes={_ngcontent-yvs-c0=, evlist=false, href=/petclinic/vets/add, ng-reflect-router-link=/vets/add, routerlink=/vets/add}}, source=HybridStateVertexImpl{id=137, name=state137}, target=HybridStateVertexImpl{id=14, name=state14}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(75), "Event fired: Add New");
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

	@Test(priority=50)
	public void method_BT137_path_1000063_1000066_76(){
		testSuiteHelper.newCurrentTestMethod("method_BT137_path_1000063_1000066_76", 50);
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
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Search, attributes={_ngcontent-gio-c0=, evlist=false, href=/petclinic/owners, ng-reflect-router-link=/owners, routerlink=/owners}}, source=HybridStateVertexImpl{id=0, name=index}, target=HybridStateVertexImpl{id=176, name=state176}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1000063), "Event fired: Search");
			testSuiteHelper.runInCrawlingPlugins(176);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 176");

			testSuiteHelper.addStateToReportBuilder(176);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(176)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(176)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(176)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-LIST[1]/DIV[1]/DIV[1]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/A[1], element=Element{node=[A: null], tag=A, text=George Franklin, attributes={_ngcontent-wdx-c2=, anyaccess=action, evlist=false, href=/petclinic/owners/1, ng-reflect-router-link=/owners/1, ng-reflect-router-link-active=active, routerlinkactive=active}}, source=HybridStateVertexImpl{id=176, name=state176}, target=HybridStateVertexImpl{id=137, name=state137}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-LIST[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"), "yu"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(1000066), "Event fired: George Franklin");
			testSuiteHelper.runInCrawlingPlugins(137);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 137");

			testSuiteHelper.addStateToReportBuilder(137);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(137)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(137)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(137)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[4]/A[1], element=Element{node=[A: null], tag=A, text=Pet Types, attributes={_ngcontent-yvs-c0=, evlist=false, href=/petclinic/pettypes, ng-reflect-router-link=/pettypes, ng-reflect-router-link-active=active, routerlink=/pettypes, routerlinkactive=active, title=pettypes}}, source=HybridStateVertexImpl{id=137, name=state137}, target=HybridStateVertexImpl{id=115, name=state115}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(76), "Event fired: Pet Types");
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
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=51)
	public void method_BT137_path_1000063_1000066_77_78(){
		testSuiteHelper.newCurrentTestMethod("method_BT137_path_1000063_1000066_77_78", 51);
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
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Search, attributes={_ngcontent-gio-c0=, evlist=false, href=/petclinic/owners, ng-reflect-router-link=/owners, routerlink=/owners}}, source=HybridStateVertexImpl{id=0, name=index}, target=HybridStateVertexImpl{id=176, name=state176}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1000063), "Event fired: Search");
			testSuiteHelper.runInCrawlingPlugins(176);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 176");

			testSuiteHelper.addStateToReportBuilder(176);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(176)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(176)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(176)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-LIST[1]/DIV[1]/DIV[1]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/A[1], element=Element{node=[A: null], tag=A, text=George Franklin, attributes={_ngcontent-wdx-c2=, anyaccess=action, evlist=false, href=/petclinic/owners/1, ng-reflect-router-link=/owners/1, ng-reflect-router-link-active=active, routerlinkactive=active}}, source=HybridStateVertexImpl{id=176, name=state176}, target=HybridStateVertexImpl{id=137, name=state137}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-LIST[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"), "yu"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(1000066), "Event fired: George Franklin");
			testSuiteHelper.runInCrawlingPlugins(137);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 137");

			testSuiteHelper.addStateToReportBuilder(137);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(137)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(137)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(137)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[5]/A[1], element=Element{node=[A: null], tag=A, text=Specialties, attributes={_ngcontent-yvs-c0=, evlist=false, href=/petclinic/specialties, ng-reflect-router-link=/specialties, ng-reflect-router-link-active=active, routerlink=/specialties, routerlinkactive=active, title=specialties}}, source=HybridStateVertexImpl{id=137, name=state137}, target=HybridStateVertexImpl{id=15, name=state15}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(77), "Event fired: Specialties");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Home, attributes={_ngcontent-wkb-c2=, class=btn btn-default, evlist=false}}, source=HybridStateVertexImpl{id=15, name=state15}, target=HybridStateVertexImpl{id=0, name=index}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(78), "Event fired: Home");
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

	@Test(priority=52)
	public void method_BT15_path_1000063_1000066_77_79_80(){
		testSuiteHelper.newCurrentTestMethod("method_BT15_path_1000063_1000066_77_79_80", 52);
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
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Search, attributes={_ngcontent-gio-c0=, evlist=false, href=/petclinic/owners, ng-reflect-router-link=/owners, routerlink=/owners}}, source=HybridStateVertexImpl{id=0, name=index}, target=HybridStateVertexImpl{id=176, name=state176}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1000063), "Event fired: Search");
			testSuiteHelper.runInCrawlingPlugins(176);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 176");

			testSuiteHelper.addStateToReportBuilder(176);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(176)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(176)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(176)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-LIST[1]/DIV[1]/DIV[1]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/A[1], element=Element{node=[A: null], tag=A, text=George Franklin, attributes={_ngcontent-wdx-c2=, anyaccess=action, evlist=false, href=/petclinic/owners/1, ng-reflect-router-link=/owners/1, ng-reflect-router-link-active=active, routerlinkactive=active}}, source=HybridStateVertexImpl{id=176, name=state176}, target=HybridStateVertexImpl{id=137, name=state137}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-LIST[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"), "yu"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(1000066), "Event fired: George Franklin");
			testSuiteHelper.runInCrawlingPlugins(137);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 137");

			testSuiteHelper.addStateToReportBuilder(137);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(137)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(137)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(137)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[5]/A[1], element=Element{node=[A: null], tag=A, text=Specialties, attributes={_ngcontent-yvs-c0=, evlist=false, href=/petclinic/specialties, ng-reflect-router-link=/specialties, ng-reflect-router-link-active=active, routerlink=/specialties, routerlinkactive=active, title=specialties}}, source=HybridStateVertexImpl{id=137, name=state137}, target=HybridStateVertexImpl{id=15, name=state15}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(77), "Event fired: Specialties");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Add, attributes={_ngcontent-wkb-c2=, class=btn btn-default, evlist=false}}, source=HybridStateVertexImpl{id=15, name=state15}, target=HybridStateVertexImpl{id=230, name=state230}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(79), "Event fired: Add");
			testSuiteHelper.runInCrawlingPlugins(230);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 230");

			testSuiteHelper.addStateToReportBuilder(230);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(230)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(230)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(230)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={_ngcontent-nos-c0=, class=navbar-brand, evlist=false, href=#}}, source=HybridStateVertexImpl{id=230, name=state230}, target=HybridStateVertexImpl{id=0, name=index}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/APP-SPECIALTY-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"), "pig"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(80), "Event fired: ");
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

	@Test(priority=53)
	public void method_BT230_path_1000063_1000066_77_79_82(){
		testSuiteHelper.newCurrentTestMethod("method_BT230_path_1000063_1000066_77_79_82", 53);
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
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Search, attributes={_ngcontent-gio-c0=, evlist=false, href=/petclinic/owners, ng-reflect-router-link=/owners, routerlink=/owners}}, source=HybridStateVertexImpl{id=0, name=index}, target=HybridStateVertexImpl{id=176, name=state176}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1000063), "Event fired: Search");
			testSuiteHelper.runInCrawlingPlugins(176);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 176");

			testSuiteHelper.addStateToReportBuilder(176);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(176)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(176)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(176)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-LIST[1]/DIV[1]/DIV[1]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/A[1], element=Element{node=[A: null], tag=A, text=George Franklin, attributes={_ngcontent-wdx-c2=, anyaccess=action, evlist=false, href=/petclinic/owners/1, ng-reflect-router-link=/owners/1, ng-reflect-router-link-active=active, routerlinkactive=active}}, source=HybridStateVertexImpl{id=176, name=state176}, target=HybridStateVertexImpl{id=137, name=state137}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-LIST[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"), "yu"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(1000066), "Event fired: George Franklin");
			testSuiteHelper.runInCrawlingPlugins(137);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 137");

			testSuiteHelper.addStateToReportBuilder(137);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(137)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(137)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(137)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[5]/A[1], element=Element{node=[A: null], tag=A, text=Specialties, attributes={_ngcontent-yvs-c0=, evlist=false, href=/petclinic/specialties, ng-reflect-router-link=/specialties, ng-reflect-router-link-active=active, routerlink=/specialties, routerlinkactive=active, title=specialties}}, source=HybridStateVertexImpl{id=137, name=state137}, target=HybridStateVertexImpl{id=15, name=state15}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(77), "Event fired: Specialties");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Add, attributes={_ngcontent-wkb-c2=, class=btn btn-default, evlist=false}}, source=HybridStateVertexImpl{id=15, name=state15}, target=HybridStateVertexImpl{id=230, name=state230}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(79), "Event fired: Add");
			testSuiteHelper.runInCrawlingPlugins(230);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 230");

			testSuiteHelper.addStateToReportBuilder(230);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(230)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(230)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(230)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[2]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Home, attributes={_ngcontent-nos-c4=, class=btn btn-default, evlist=false}}, source=HybridStateVertexImpl{id=230, name=state230}, target=HybridStateVertexImpl{id=0, name=index}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/APP-SPECIALTY-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"), "pig"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(82), "Event fired: Home");
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

	@Test(priority=54)
	public void method_BT230_path_1000063_1000066_77_79_83(){
		testSuiteHelper.newCurrentTestMethod("method_BT230_path_1000063_1000066_77_79_83", 54);
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
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Search, attributes={_ngcontent-gio-c0=, evlist=false, href=/petclinic/owners, ng-reflect-router-link=/owners, routerlink=/owners}}, source=HybridStateVertexImpl{id=0, name=index}, target=HybridStateVertexImpl{id=176, name=state176}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1000063), "Event fired: Search");
			testSuiteHelper.runInCrawlingPlugins(176);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 176");

			testSuiteHelper.addStateToReportBuilder(176);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(176)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(176)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(176)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-LIST[1]/DIV[1]/DIV[1]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/A[1], element=Element{node=[A: null], tag=A, text=George Franklin, attributes={_ngcontent-wdx-c2=, anyaccess=action, evlist=false, href=/petclinic/owners/1, ng-reflect-router-link=/owners/1, ng-reflect-router-link-active=active, routerlinkactive=active}}, source=HybridStateVertexImpl{id=176, name=state176}, target=HybridStateVertexImpl{id=137, name=state137}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-LIST[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"), "yu"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(1000066), "Event fired: George Franklin");
			testSuiteHelper.runInCrawlingPlugins(137);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 137");

			testSuiteHelper.addStateToReportBuilder(137);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(137)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(137)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(137)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[5]/A[1], element=Element{node=[A: null], tag=A, text=Specialties, attributes={_ngcontent-yvs-c0=, evlist=false, href=/petclinic/specialties, ng-reflect-router-link=/specialties, ng-reflect-router-link-active=active, routerlink=/specialties, routerlinkactive=active, title=specialties}}, source=HybridStateVertexImpl{id=137, name=state137}, target=HybridStateVertexImpl{id=15, name=state15}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(77), "Event fired: Specialties");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Add, attributes={_ngcontent-wkb-c2=, class=btn btn-default, evlist=false}}, source=HybridStateVertexImpl{id=15, name=state15}, target=HybridStateVertexImpl{id=230, name=state230}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(79), "Event fired: Add");
			testSuiteHelper.runInCrawlingPlugins(230);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 230");

			testSuiteHelper.addStateToReportBuilder(230);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(230)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(230)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(230)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[2]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Add, attributes={_ngcontent-nos-c4=, class=btn btn-default, evlist=false}}, source=HybridStateVertexImpl{id=230, name=state230}, target=HybridStateVertexImpl{id=15, name=state15}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/APP-SPECIALTY-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"), "pig"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(83), "Event fired: Add");
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

	@Test(priority=55)
	public void method_BT137_path_1000063_1000066_84(){
		testSuiteHelper.newCurrentTestMethod("method_BT137_path_1000063_1000066_84", 55);
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
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Search, attributes={_ngcontent-gio-c0=, evlist=false, href=/petclinic/owners, ng-reflect-router-link=/owners, routerlink=/owners}}, source=HybridStateVertexImpl{id=0, name=index}, target=HybridStateVertexImpl{id=176, name=state176}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1000063), "Event fired: Search");
			testSuiteHelper.runInCrawlingPlugins(176);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 176");

			testSuiteHelper.addStateToReportBuilder(176);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(176)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(176)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(176)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-LIST[1]/DIV[1]/DIV[1]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/A[1], element=Element{node=[A: null], tag=A, text=George Franklin, attributes={_ngcontent-wdx-c2=, anyaccess=action, evlist=false, href=/petclinic/owners/1, ng-reflect-router-link=/owners/1, ng-reflect-router-link-active=active, routerlinkactive=active}}, source=HybridStateVertexImpl{id=176, name=state176}, target=HybridStateVertexImpl{id=137, name=state137}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-LIST[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"), "yu"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(1000066), "Event fired: George Franklin");
			testSuiteHelper.runInCrawlingPlugins(137);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 137");

			testSuiteHelper.addStateToReportBuilder(137);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(137)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(137)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(137)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-DETAIL[1]/DIV[1]/DIV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=< Back, attributes={_ngcontent-yvs-c2=, class=btn btn-default, evlist=false}}, source=HybridStateVertexImpl{id=137, name=state137}, target=HybridStateVertexImpl{id=176, name=state176}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(84), "Event fired: < Back");
			testSuiteHelper.runInCrawlingPlugins(176);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 176");

			testSuiteHelper.addStateToReportBuilder(176);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(176)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(176)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(176)
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
	public void method_BT230_path_1000063_1000066_77_79(){
		testSuiteHelper.newCurrentTestMethod("method_BT230_path_1000063_1000066_77_79", 56);
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
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Search, attributes={_ngcontent-gio-c0=, evlist=false, href=/petclinic/owners, ng-reflect-router-link=/owners, routerlink=/owners}}, source=HybridStateVertexImpl{id=0, name=index}, target=HybridStateVertexImpl{id=176, name=state176}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1000063), "Event fired: Search");
			testSuiteHelper.runInCrawlingPlugins(176);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 176");

			testSuiteHelper.addStateToReportBuilder(176);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(176)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(176)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(176)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-LIST[1]/DIV[1]/DIV[1]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/A[1], element=Element{node=[A: null], tag=A, text=George Franklin, attributes={_ngcontent-wdx-c2=, anyaccess=action, evlist=false, href=/petclinic/owners/1, ng-reflect-router-link=/owners/1, ng-reflect-router-link-active=active, routerlinkactive=active}}, source=HybridStateVertexImpl{id=176, name=state176}, target=HybridStateVertexImpl{id=137, name=state137}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-LIST[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"), "yu"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(1000066), "Event fired: George Franklin");
			testSuiteHelper.runInCrawlingPlugins(137);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 137");

			testSuiteHelper.addStateToReportBuilder(137);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(137)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(137)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(137)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[5]/A[1], element=Element{node=[A: null], tag=A, text=Specialties, attributes={_ngcontent-yvs-c0=, evlist=false, href=/petclinic/specialties, ng-reflect-router-link=/specialties, ng-reflect-router-link-active=active, routerlink=/specialties, routerlinkactive=active, title=specialties}}, source=HybridStateVertexImpl{id=137, name=state137}, target=HybridStateVertexImpl{id=15, name=state15}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(77), "Event fired: Specialties");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Add, attributes={_ngcontent-wkb-c2=, class=btn btn-default, evlist=false}}, source=HybridStateVertexImpl{id=15, name=state15}, target=HybridStateVertexImpl{id=230, name=state230}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(79), "Event fired: Add");
			testSuiteHelper.runInCrawlingPlugins(230);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 230");

			testSuiteHelper.addStateToReportBuilder(230);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(230)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(230)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(230)
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
	public void method_BT137_path_1000063_1000066_85_86(){
		testSuiteHelper.newCurrentTestMethod("method_BT137_path_1000063_1000066_85_86", 57);
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
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Search, attributes={_ngcontent-gio-c0=, evlist=false, href=/petclinic/owners, ng-reflect-router-link=/owners, routerlink=/owners}}, source=HybridStateVertexImpl{id=0, name=index}, target=HybridStateVertexImpl{id=176, name=state176}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1000063), "Event fired: Search");
			testSuiteHelper.runInCrawlingPlugins(176);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 176");

			testSuiteHelper.addStateToReportBuilder(176);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(176)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(176)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(176)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-LIST[1]/DIV[1]/DIV[1]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/A[1], element=Element{node=[A: null], tag=A, text=George Franklin, attributes={_ngcontent-wdx-c2=, anyaccess=action, evlist=false, href=/petclinic/owners/1, ng-reflect-router-link=/owners/1, ng-reflect-router-link-active=active, routerlinkactive=active}}, source=HybridStateVertexImpl{id=176, name=state176}, target=HybridStateVertexImpl{id=137, name=state137}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-LIST[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"), "yu"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(1000066), "Event fired: George Franklin");
			testSuiteHelper.runInCrawlingPlugins(137);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 137");

			testSuiteHelper.addStateToReportBuilder(137);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(137)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(137)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(137)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-DETAIL[1]/DIV[1]/DIV[1]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Edit Owner, attributes={_ngcontent-yvs-c2=, class=btn btn-default, evlist=false}}, source=HybridStateVertexImpl{id=137, name=state137}, target=HybridStateVertexImpl{id=257, name=state257}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(85), "Event fired: Edit Owner");
			testSuiteHelper.runInCrawlingPlugins(257);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 257");

			testSuiteHelper.addStateToReportBuilder(257);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(257)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(257)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(257)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={_ngcontent-toc-c0=, class=navbar-brand, evlist=false, href=#}}, source=HybridStateVertexImpl{id=257, name=state257}, target=HybridStateVertexImpl{id=0, name=index}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"), "pipi"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"), "yu"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[4]/DIV[1]/INPUT[1]"), "2710"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[5]/DIV[1]/INPUT[1]"), "Austin"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[6]/DIV[1]/INPUT[1]"), "5122005208"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(86), "Event fired: ");
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

	@Test(priority=58)
	public void method_BT137_path_1000063_1000066_87_88(){
		testSuiteHelper.newCurrentTestMethod("method_BT137_path_1000063_1000066_87_88", 58);
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
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Search, attributes={_ngcontent-gio-c0=, evlist=false, href=/petclinic/owners, ng-reflect-router-link=/owners, routerlink=/owners}}, source=HybridStateVertexImpl{id=0, name=index}, target=HybridStateVertexImpl{id=176, name=state176}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1000063), "Event fired: Search");
			testSuiteHelper.runInCrawlingPlugins(176);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 176");

			testSuiteHelper.addStateToReportBuilder(176);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(176)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(176)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(176)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-LIST[1]/DIV[1]/DIV[1]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/A[1], element=Element{node=[A: null], tag=A, text=George Franklin, attributes={_ngcontent-wdx-c2=, anyaccess=action, evlist=false, href=/petclinic/owners/1, ng-reflect-router-link=/owners/1, ng-reflect-router-link-active=active, routerlinkactive=active}}, source=HybridStateVertexImpl{id=176, name=state176}, target=HybridStateVertexImpl{id=137, name=state137}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-LIST[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"), "yu"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(1000066), "Event fired: George Franklin");
			testSuiteHelper.runInCrawlingPlugins(137);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 137");

			testSuiteHelper.addStateToReportBuilder(137);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(137)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(137)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(137)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-DETAIL[1]/DIV[1]/DIV[1]/BUTTON[3], element=Element{node=[BUTTON: null], tag=BUTTON, text=Add New Pet, attributes={_ngcontent-yvs-c2=, class=btn btn-default, evlist=false}}, source=HybridStateVertexImpl{id=137, name=state137}, target=HybridStateVertexImpl{id=262, name=state262}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(87), "Event fired: Add New Pet");
			testSuiteHelper.runInCrawlingPlugins(262);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 262");

			testSuiteHelper.addStateToReportBuilder(262);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(262)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(262)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(262)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={_ngcontent-lao-c0=, class=navbar-brand, evlist=false, href=#}}, source=HybridStateVertexImpl{id=262, name=state262}, target=HybridStateVertexImpl{id=0, name=index}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[4]/DIV[1]/INPUT[1]"), "2020/06/30"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[5]/DIV[1]/DIV[1]/SELECT[1]"), "cat"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(88), "Event fired: ");
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

	@Test(priority=59)
	public void method_BT262_path_1000063_1000066_87_89_90(){
		testSuiteHelper.newCurrentTestMethod("method_BT262_path_1000063_1000066_87_89_90", 59);
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
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Search, attributes={_ngcontent-gio-c0=, evlist=false, href=/petclinic/owners, ng-reflect-router-link=/owners, routerlink=/owners}}, source=HybridStateVertexImpl{id=0, name=index}, target=HybridStateVertexImpl{id=176, name=state176}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1000063), "Event fired: Search");
			testSuiteHelper.runInCrawlingPlugins(176);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 176");

			testSuiteHelper.addStateToReportBuilder(176);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(176)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(176)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(176)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-LIST[1]/DIV[1]/DIV[1]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/A[1], element=Element{node=[A: null], tag=A, text=George Franklin, attributes={_ngcontent-wdx-c2=, anyaccess=action, evlist=false, href=/petclinic/owners/1, ng-reflect-router-link=/owners/1, ng-reflect-router-link-active=active, routerlinkactive=active}}, source=HybridStateVertexImpl{id=176, name=state176}, target=HybridStateVertexImpl{id=137, name=state137}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-LIST[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"), "yu"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(1000066), "Event fired: George Franklin");
			testSuiteHelper.runInCrawlingPlugins(137);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 137");

			testSuiteHelper.addStateToReportBuilder(137);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(137)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(137)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(137)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-DETAIL[1]/DIV[1]/DIV[1]/BUTTON[3], element=Element{node=[BUTTON: null], tag=BUTTON, text=Add New Pet, attributes={_ngcontent-yvs-c2=, class=btn btn-default, evlist=false}}, source=HybridStateVertexImpl{id=137, name=state137}, target=HybridStateVertexImpl{id=262, name=state262}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(87), "Event fired: Add New Pet");
			testSuiteHelper.runInCrawlingPlugins(262);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 262");

			testSuiteHelper.addStateToReportBuilder(262);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(262)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(262)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(262)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[4]/DIV[1]/MAT-DATEPICKER-TOGGLE[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=, attributes={aria-haspopup=dialog, aria-label=Open calendar, class=mat-icon-button, evlist=false, mat-icon-button=, ng-reflect-disabled=false, tabindex=0, type=button}}, source=HybridStateVertexImpl{id=262, name=state262}, target=HybridStateVertexImpl{id=268, name=state268}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[4]/DIV[1]/INPUT[1]"), "2020/06/30"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[5]/DIV[1]/DIV[1]/SELECT[1]"), "cat"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(89), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(268);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 268");

			testSuiteHelper.addStateToReportBuilder(268);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(268)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(268)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(268)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/MAT-DATEPICKER-CONTENT[1]/MAT-CALENDAR[1]/MAT-CALENDAR-HEADER[1]/DIV[1]/DIV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=06 2020, attributes={aria-label=Choose month and year, cdkarialive=polite, class=mat-calendar-period-button mat-button, evlist=false, mat-button=, ng-reflect-politeness=polite, type=button}}, source=HybridStateVertexImpl{id=268, name=state268}, target=HybridStateVertexImpl{id=269, name=state269}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[4]/DIV[1]/INPUT[1]"), "2020/06/30"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[5]/DIV[1]/DIV[1]/SELECT[1]"), "cat"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(90), "Event fired: 06 2020");
			testSuiteHelper.runInCrawlingPlugins(269);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 269");

			testSuiteHelper.addStateToReportBuilder(269);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(269)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(269)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(269)
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
	public void method_BT268_path_1000063_1000066_87_89(){
		testSuiteHelper.newCurrentTestMethod("method_BT268_path_1000063_1000066_87_89", 60);
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
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Search, attributes={_ngcontent-gio-c0=, evlist=false, href=/petclinic/owners, ng-reflect-router-link=/owners, routerlink=/owners}}, source=HybridStateVertexImpl{id=0, name=index}, target=HybridStateVertexImpl{id=176, name=state176}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1000063), "Event fired: Search");
			testSuiteHelper.runInCrawlingPlugins(176);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 176");

			testSuiteHelper.addStateToReportBuilder(176);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(176)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(176)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(176)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-LIST[1]/DIV[1]/DIV[1]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/A[1], element=Element{node=[A: null], tag=A, text=George Franklin, attributes={_ngcontent-wdx-c2=, anyaccess=action, evlist=false, href=/petclinic/owners/1, ng-reflect-router-link=/owners/1, ng-reflect-router-link-active=active, routerlinkactive=active}}, source=HybridStateVertexImpl{id=176, name=state176}, target=HybridStateVertexImpl{id=137, name=state137}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-LIST[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"), "yu"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(1000066), "Event fired: George Franklin");
			testSuiteHelper.runInCrawlingPlugins(137);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 137");

			testSuiteHelper.addStateToReportBuilder(137);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(137)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(137)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(137)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-DETAIL[1]/DIV[1]/DIV[1]/BUTTON[3], element=Element{node=[BUTTON: null], tag=BUTTON, text=Add New Pet, attributes={_ngcontent-yvs-c2=, class=btn btn-default, evlist=false}}, source=HybridStateVertexImpl{id=137, name=state137}, target=HybridStateVertexImpl{id=262, name=state262}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(87), "Event fired: Add New Pet");
			testSuiteHelper.runInCrawlingPlugins(262);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 262");

			testSuiteHelper.addStateToReportBuilder(262);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(262)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(262)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(262)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[4]/DIV[1]/MAT-DATEPICKER-TOGGLE[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=, attributes={aria-haspopup=dialog, aria-label=Open calendar, class=mat-icon-button, evlist=false, mat-icon-button=, ng-reflect-disabled=false, tabindex=0, type=button}}, source=HybridStateVertexImpl{id=262, name=state262}, target=HybridStateVertexImpl{id=268, name=state268}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[4]/DIV[1]/INPUT[1]"), "2020/06/30"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[5]/DIV[1]/DIV[1]/SELECT[1]"), "cat"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(89), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(268);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 268");

			testSuiteHelper.addStateToReportBuilder(268);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(268)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(268)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(268)
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
	public void method_BT257_path_1000063_1000066_85(){
		testSuiteHelper.newCurrentTestMethod("method_BT257_path_1000063_1000066_85", 61);
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
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Search, attributes={_ngcontent-gio-c0=, evlist=false, href=/petclinic/owners, ng-reflect-router-link=/owners, routerlink=/owners}}, source=HybridStateVertexImpl{id=0, name=index}, target=HybridStateVertexImpl{id=176, name=state176}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1000063), "Event fired: Search");
			testSuiteHelper.runInCrawlingPlugins(176);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 176");

			testSuiteHelper.addStateToReportBuilder(176);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(176)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(176)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(176)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-LIST[1]/DIV[1]/DIV[1]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/A[1], element=Element{node=[A: null], tag=A, text=George Franklin, attributes={_ngcontent-wdx-c2=, anyaccess=action, evlist=false, href=/petclinic/owners/1, ng-reflect-router-link=/owners/1, ng-reflect-router-link-active=active, routerlinkactive=active}}, source=HybridStateVertexImpl{id=176, name=state176}, target=HybridStateVertexImpl{id=137, name=state137}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-LIST[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"), "yu"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(1000066), "Event fired: George Franklin");
			testSuiteHelper.runInCrawlingPlugins(137);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 137");

			testSuiteHelper.addStateToReportBuilder(137);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(137)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(137)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(137)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-DETAIL[1]/DIV[1]/DIV[1]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Edit Owner, attributes={_ngcontent-yvs-c2=, class=btn btn-default, evlist=false}}, source=HybridStateVertexImpl{id=137, name=state137}, target=HybridStateVertexImpl{id=257, name=state257}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(85), "Event fired: Edit Owner");
			testSuiteHelper.runInCrawlingPlugins(257);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 257");

			testSuiteHelper.addStateToReportBuilder(257);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(257)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(257)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(257)
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
	public void method_BT262_path_1000063_1000066_87(){
		testSuiteHelper.newCurrentTestMethod("method_BT262_path_1000063_1000066_87", 62);
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
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Search, attributes={_ngcontent-gio-c0=, evlist=false, href=/petclinic/owners, ng-reflect-router-link=/owners, routerlink=/owners}}, source=HybridStateVertexImpl{id=0, name=index}, target=HybridStateVertexImpl{id=176, name=state176}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1000063), "Event fired: Search");
			testSuiteHelper.runInCrawlingPlugins(176);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 176");

			testSuiteHelper.addStateToReportBuilder(176);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(176)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(176)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(176)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-LIST[1]/DIV[1]/DIV[1]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/A[1], element=Element{node=[A: null], tag=A, text=George Franklin, attributes={_ngcontent-wdx-c2=, anyaccess=action, evlist=false, href=/petclinic/owners/1, ng-reflect-router-link=/owners/1, ng-reflect-router-link-active=active, routerlinkactive=active}}, source=HybridStateVertexImpl{id=176, name=state176}, target=HybridStateVertexImpl{id=137, name=state137}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-LIST[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"), "yu"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(1000066), "Event fired: George Franklin");
			testSuiteHelper.runInCrawlingPlugins(137);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 137");

			testSuiteHelper.addStateToReportBuilder(137);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(137)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(137)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(137)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-DETAIL[1]/DIV[1]/DIV[1]/BUTTON[3], element=Element{node=[BUTTON: null], tag=BUTTON, text=Add New Pet, attributes={_ngcontent-yvs-c2=, class=btn btn-default, evlist=false}}, source=HybridStateVertexImpl{id=137, name=state137}, target=HybridStateVertexImpl{id=262, name=state262}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(87), "Event fired: Add New Pet");
			testSuiteHelper.runInCrawlingPlugins(262);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 262");

			testSuiteHelper.addStateToReportBuilder(262);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(262)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(262)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(262)
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
