//package generated;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.concurrent.TimeUnit;
//
//import org.testng.Assert;
//import org.testng.ITestResult;
//import org.testng.annotations.AfterClass;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;
//
//import com.crawljax.browser.EmbeddedBrowser.BrowserType;
//import com.crawljax.core.configuration.BrowserConfiguration;
//import com.crawljax.core.configuration.BrowserOptions;
//import com.crawljax.core.configuration.CrawljaxConfiguration;
//import com.crawljax.core.configuration.CrawljaxConfiguration.CrawljaxConfigurationBuilder;
//import com.crawljax.core.state.Identification;
//import com.crawljax.core.state.Identification.How;
//import com.crawljax.core.state.StatePair.StateComparision;
//import com.crawljax.forms.FormInput;
//import com.crawljax.plugins.testcasegenerator.TestConfiguration.StateEquivalenceAssertionMode;
//import com.crawljax.plugins.testcasegenerator.TestSuiteHelper;
//
//import com.crawljax.plugins.testcasegenerator.crawlPlugins.*;
//
//
///*
// * Generated @ Fri Oct 08 14:12:29 CDT 2021
// */
//
//public class GeneratedTests {
//	private final boolean mutate = true;
//    private final String URL = "http://localhost:3000/ppma";
//	private TestSuiteHelper testSuiteHelper;
//
//	private final String CRAWL_PATH = "/Users/liuyu/projects/tackle-test-generator-ui-level/testlabeling/results/frag-gen-updated/ppma";
//
//	private StateEquivalenceAssertionMode assertionMode = StateEquivalenceAssertionMode.BOTH;
//
//	private CrawljaxConfiguration getTestConfiguration() {
//		CrawljaxConfigurationBuilder builder = CrawljaxConfiguration.builderFor(URL);
//		builder.crawlRules().waitAfterEvent(500, TimeUnit.MILLISECONDS);
//		builder.crawlRules().waitAfterReloadUrl(500, TimeUnit.MILLISECONDS);
//		builder.setBrowserConfig(new BrowserConfiguration(BrowserType.CHROME, 1, new BrowserOptions(false, -1)));
//		return builder.build();
//	}
//
//	@BeforeClass
//	public void oneTimeSetUp(){
//		try {
//			//load needed data from json files
//			testSuiteHelper = new TestSuiteHelper(
//					getTestConfiguration(),
//					CRAWL_PATH, URL, mutate);
//
//		}
//		catch (Exception e) {
//			Assert.fail(e.getMessage());
//		}
//	}
//
//	@AfterClass
//	public void oneTimeTearDown(){
//		try {
//			testSuiteHelper.tearDown();
//		}catch (Exception e) {
//			Assert.fail(e.getMessage());
//		}
//	}
//
//	@BeforeMethod
//	public void setUp(){
//		try {
//			testSuiteHelper.goToInitialUrl();
//		}catch (Exception e) {
//			Assert.fail(e.getMessage());
//		}
//	}
//
//	@AfterMethod
//	public void getStatusAndDuration(ITestResult tr) {
//		long duration = tr.getEndMillis() - tr.getStartMillis();
//		long nanos = TimeUnit.MILLISECONDS.toNanos(duration);
//		String message = "none";
//		if (tr.getThrowable() != null) {
//			message = tr.getThrowable().getMessage();
//		}
//
//		switch (tr.getStatus()) {
//			case ITestResult.SUCCESS:
//				testSuiteHelper.markLastMethodAsSucceeded(nanos);
//				break;
//			case ITestResult.FAILURE:
//				testSuiteHelper.markLastMethodAsFailed(message, nanos);
//				break;
//			case ITestResult.SKIP:
//				testSuiteHelper.markLastMethodAsSkipped(nanos);
//				break;
//		}
//	}
//
//	/*
//	 * Test Cases
//	 */
//
//	@Test(priority=1)
//	public void method_0(){
//		testSuiteHelper.newCurrentTestMethod("method_0", 1);
//		List<FormInput> formInputs;
//
//		boolean allStatesIdentical = true;
//
//		try {
//			//initial state
//			testSuiteHelper.runInCrawlingPlugins(0);
//			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 0");
//
//			testSuiteHelper.addStateToReportBuilder(0);
//
//			if (assertionMode != StateEquivalenceAssertionMode.NONE){
//
//				if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(0)
//										&& allStatesIdentical;
//				}
//
//				if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    /* Perform a visual diff on the two states. */
//				    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(0)
//						&& allStatesIdentical;
//				}
//				if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
//					allStatesIdentical = testSuiteHelper.fragDiffBool(0)
//						&& allStatesIdentical;
//				}
//			}
//
//		} catch (Exception e) {
//			Assert.fail(e.getMessage());
//		}
//		if(!allStatesIdentical) {
//			Assert.fail("At least one state is different.");
//		}
//	}
//
//	@Test(priority=2)
//	public void method_BT0_path_1_5_6_7_9_10_15_16_17(){
//		testSuiteHelper.newCurrentTestMethod("method_BT0_path_1_5_6_7_9_10_15_16_17", 2);
//		List<FormInput> formInputs;
//
//		boolean allStatesIdentical = true;
//
//		testSuiteHelper.addStateToReportBuilder(0);
//
//		if (assertionMode != StateEquivalenceAssertionMode.NONE){
//			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(0)
//										&& allStatesIdentical;
//			}
//
//			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(0)
//					&& allStatesIdentical;
//			}
//			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
//				allStatesIdentical = testSuiteHelper.fragDiffBool(0)
//					&& allStatesIdentical;
//			}
//		}
//		try {
//			/* Label - remember login entry secondary expand tag */
//			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[2]/A[1], element=Element{node=null, tag=A, text=, attributes={class=postfix button secondary expand}}, source=0, target=2} */
//			formInputs = new ArrayList<FormInput>();
//			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/INPUT[1]"), "admin"));
//			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/INPUT[1]"), "admin"));
//			testSuiteHelper.handleFormInputs(formInputs);
//			Thread.sleep(100);
//			Assert.assertTrue(testSuiteHelper.fireEvent(1), "Event fired: ");
//			testSuiteHelper.runInCrawlingPlugins(2);
//			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 2");
//
//			testSuiteHelper.addStateToReportBuilder(2);
//
//			if (assertionMode != StateEquivalenceAssertionMode.NONE){
//
//				if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(2)
//										&& allStatesIdentical;
//				}
//
//				if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    /* Perform a visual diff on the two states. */
//				    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(2)
//						&& allStatesIdentical;
//				}
//				if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
//					allStatesIdentical = testSuiteHelper.fragDiffBool(2)
//						&& allStatesIdentical;
//				}
//			}
//
//			/* Label - index create entry */
//			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/NAV[1]/SECTION[1]/UL[1]/LI[1]/UL[1]/LI[2]/A[1], element=Element{node=null, tag=A, text=Create, attributes={href=/ppma/index.php?r=entry/create}}, source=2, target=6} */
//			formInputs = new ArrayList<FormInput>();
//			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "Entry_name"), "Random Website"));
//			testSuiteHelper.handleFormInputs(formInputs);
//			Thread.sleep(100);
//			Assert.assertTrue(testSuiteHelper.fireEvent(5), "Event fired: Create");
//			testSuiteHelper.runInCrawlingPlugins(6);
//			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 6");
//
//			testSuiteHelper.addStateToReportBuilder(6);
//
//			if (assertionMode != StateEquivalenceAssertionMode.NONE){
//
//				if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(6)
//										&& allStatesIdentical;
//				}
//
//				if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    /* Perform a visual diff on the two states. */
//				    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(6)
//						&& allStatesIdentical;
//				}
//				if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
//					allStatesIdentical = testSuiteHelper.fragDiffBool(6)
//						&& allStatesIdentical;
//				}
//			}
//
//			/* Label - submit button entry save index radius */
//			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/INPUT[7], element=Element{node=null, tag=INPUT, text=, attributes={name=yt0, type=submit, class=button radius, value=Save}}, source=6, target=7} */
//			formInputs = new ArrayList<FormInput>();
//			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/INPUT[2]"), "Random Website"));
//			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/INPUT[3]"), "jdoe"));
//			formInputs.add(new FormInput(FormInput.InputType.PASSWORD, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/INPUT[1]"), "123456"));
//			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/INPUT[4]"), "nrzmfmkJ"));
//			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/INPUT[5]"), "POFeABBy"));
//			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/TEXTAREA[1]"), "jtQbbrpV"));
//			testSuiteHelper.handleFormInputs(formInputs);
//			Thread.sleep(100);
//			Assert.assertTrue(testSuiteHelper.fireEvent(6), "Event fired: ");
//			testSuiteHelper.runInCrawlingPlugins(7);
//			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 7");
//
//			testSuiteHelper.addStateToReportBuilder(7);
//
//			if (assertionMode != StateEquivalenceAssertionMode.NONE){
//
//				if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(7)
//										&& allStatesIdentical;
//				}
//
//				if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    /* Perform a visual diff on the two states. */
//				    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(7)
//						&& allStatesIdentical;
//				}
//				if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
//					allStatesIdentical = testSuiteHelper.fragDiffBool(7)
//						&& allStatesIdentical;
//				}
//			}
//
//			/* Label - index sort entry */
//			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[4]/TABLE[1]/THEAD[1]/TR[1]/TH[1]/A[1], element=Element{node=null, tag=A, text=Name, attributes={anyaccess=none, href=/ppma/index.php?r=entry/index&Entry_sort=name.desc, class=sort-link asc}}, source=7, target=8} */
//			formInputs = new ArrayList<FormInput>();
//			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "Entry_name"), "Random Website"));
//			testSuiteHelper.handleFormInputs(formInputs);
//			Thread.sleep(100);
//			Assert.assertTrue(testSuiteHelper.fireEvent(7), "Event fired: Name");
//			testSuiteHelper.runInCrawlingPlugins(8);
//			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 8");
//
//			testSuiteHelper.addStateToReportBuilder(8);
//
//			if (assertionMode != StateEquivalenceAssertionMode.NONE){
//
//				if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(8)
//										&& allStatesIdentical;
//				}
//
//				if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    /* Perform a visual diff on the two states. */
//				    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(8)
//						&& allStatesIdentical;
//				}
//				if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
//					allStatesIdentical = testSuiteHelper.fragDiffBool(8)
//						&& allStatesIdentical;
//				}
//			}
//
//			/* Label - index update id entry */
//			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/A[1], element=Element{node=null, tag=A, text=Random Website, attributes={data-reveal-id=entry-form-modal, rel=/ppma/index.php?r=entry/getData&id=1&withPassword=1, anyaccess=none, href=/ppma/index.php?r=entry/update&id=1&returnUrl=%2Fppma%2Findex.php%3Fr%3Dentry%2Findex%26Entry_sort%3Dname.desc, class=update-entry}}, source=8, target=10} */
//			formInputs = new ArrayList<FormInput>();
//			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "Entry_name"), "Random Website"));
//			testSuiteHelper.handleFormInputs(formInputs);
//			Thread.sleep(100);
//			Assert.assertTrue(testSuiteHelper.fireEvent(9), "Event fired: Random Website");
//			testSuiteHelper.runInCrawlingPlugins(10);
//			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 10");
//
//			testSuiteHelper.addStateToReportBuilder(10);
//
//			if (assertionMode != StateEquivalenceAssertionMode.NONE){
//
//				if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(10)
//										&& allStatesIdentical;
//				}
//
//				if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    /* Perform a visual diff on the two states. */
//				    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(10)
//						&& allStatesIdentical;
//				}
//				if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
//					allStatesIdentical = testSuiteHelper.fragDiffBool(10)
//						&& allStatesIdentical;
//				}
//			}
//
//			/* Label - none */
//			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/ASIDE[1]/DIV[1]/SPAN[1]/A[1], element=Element{node=null, tag=A, text=POFeABBy, attributes={anyaccess=none, href=/ppma/index.php?r=entry/index&Entry%5BtagList%5D=POFeABBy}}, source=10, target=8} */
//			formInputs = new ArrayList<FormInput>();
//			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "Entry_name"), "Random Website"));
//			testSuiteHelper.handleFormInputs(formInputs);
//			Thread.sleep(100);
//			Assert.assertTrue(testSuiteHelper.fireEvent(10), "Event fired: POFeABBy");
//			testSuiteHelper.runInCrawlingPlugins(8);
//			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 8");
//
//			testSuiteHelper.addStateToReportBuilder(8);
//
//			if (assertionMode != StateEquivalenceAssertionMode.NONE){
//
//				if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(8)
//										&& allStatesIdentical;
//				}
//
//				if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    /* Perform a visual diff on the two states. */
//				    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(8)
//						&& allStatesIdentical;
//				}
//				if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
//					allStatesIdentical = testSuiteHelper.fragDiffBool(8)
//						&& allStatesIdentical;
//				}
//			}
//
//			/* Label - index update id entry */
//			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/TABLE[1]/TBODY[1]/TR[1]/TD[4]/A[4], element=Element{node=null, tag=A, text=, attributes={data-reveal-id=entry-form-modal, rel=/ppma/index.php?r=entry/getData&id=1&withPassword=1, anyaccess=none, href=/ppma/index.php?r=entry/update&id=1&returnUrl=%2Fppma%2Findex.php%3Fr%3Dentry%2Findex%26Entry_sort%3Dname.desc, title=Update, class=update-entry}}, source=8, target=10} */
//			formInputs = new ArrayList<FormInput>();
//			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "Entry_name"), "Random Website"));
//			testSuiteHelper.handleFormInputs(formInputs);
//			Thread.sleep(100);
//			Assert.assertTrue(testSuiteHelper.fireEvent(15), "Event fired: ");
//			testSuiteHelper.runInCrawlingPlugins(10);
//			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 10");
//
//			testSuiteHelper.addStateToReportBuilder(10);
//
//			if (assertionMode != StateEquivalenceAssertionMode.NONE){
//
//				if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(10)
//										&& allStatesIdentical;
//				}
//
//				if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    /* Perform a visual diff on the two states. */
//				    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(10)
//						&& allStatesIdentical;
//				}
//				if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
//					allStatesIdentical = testSuiteHelper.fragDiffBool(10)
//						&& allStatesIdentical;
//				}
//			}
//
//			/* Label - update id */
//			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/ASIDE[1]/DIV[2]/UL[1]/LI[1]/A[1], element=Element{node=null, tag=A, text=Random Website, attributes={data-reveal-id=entry-form-modal, rel=/ppma/index.php?r=entry/getData&id=1&withPassword=1, anyaccess=none, href=/ppma/index.php?r=entry/update&id=1, title=has been viewed 0 time(s), class=update-entry}}, source=10, target=17} */
//			formInputs = new ArrayList<FormInput>();
//			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "Entry_name"), "Random Website"));
//			testSuiteHelper.handleFormInputs(formInputs);
//			Thread.sleep(100);
//			Assert.assertTrue(testSuiteHelper.fireEvent(16), "Event fired: Random Website");
//			testSuiteHelper.runInCrawlingPlugins(17);
//			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 17");
//
//			testSuiteHelper.addStateToReportBuilder(17);
//
//			if (assertionMode != StateEquivalenceAssertionMode.NONE){
//
//				if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(17)
//										&& allStatesIdentical;
//				}
//
//				if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    /* Perform a visual diff on the two states. */
//				    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(17)
//						&& allStatesIdentical;
//				}
//				if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
//					allStatesIdentical = testSuiteHelper.fragDiffBool(17)
//						&& allStatesIdentical;
//				}
//			}
//
//			/* Label - update id */
//			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/ASIDE[1]/DIV[3]/UL[1]/LI[1]/A[1], element=Element{node=null, tag=A, text=Random Website, attributes={data-reveal-id=entry-form-modal, rel=/ppma/index.php?r=entry/getData&id=1&withPassword=1, anyaccess=none, href=/ppma/index.php?r=entry/update&id=1, class=update-entry}}, source=17, target=18} */
//			formInputs = new ArrayList<FormInput>();
//			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/INPUT[2]"), "Random Website"));
//			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/INPUT[3]"), "jdoe"));
//			formInputs.add(new FormInput(FormInput.InputType.PASSWORD, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/INPUT[1]"), "123456"));
//			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/INPUT[4]"), "SroHibTY"));
//			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/INPUT[5]"), "bCOnZkZM"));
//			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/TEXTAREA[1]"), "yOcJzNIE"));
//			testSuiteHelper.handleFormInputs(formInputs);
//			Thread.sleep(100);
//			Assert.assertTrue(testSuiteHelper.fireEvent(17), "Event fired: Random Website");
//			testSuiteHelper.runInCrawlingPlugins(18);
//			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 18");
//
//			testSuiteHelper.addStateToReportBuilder(18);
//
//			if (assertionMode != StateEquivalenceAssertionMode.NONE){
//
//				if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(18)
//										&& allStatesIdentical;
//				}
//
//				if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    /* Perform a visual diff on the two states. */
//				    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(18)
//						&& allStatesIdentical;
//				}
//				if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
//					allStatesIdentical = testSuiteHelper.fragDiffBool(18)
//						&& allStatesIdentical;
//				}
//			}
//
//		} catch (Exception e) {
//			Assert.fail(e.getMessage());
//		}
//		if(!allStatesIdentical) {
//			Assert.fail("At least one state is different.");
//		}
//	}
//
//	@Test(priority=3)
//	public void method_BT10_path_9(){
//		testSuiteHelper.newCurrentTestMethod("method_BT10_path_9", 3);
//		List<FormInput> formInputs;
//
//		boolean allStatesIdentical = true;
//
//		testSuiteHelper.addStateToReportBuilder(8);
//
//		if (assertionMode != StateEquivalenceAssertionMode.NONE){
//			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(8)
//										&& allStatesIdentical;
//			}
//
//			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(8)
//					&& allStatesIdentical;
//			}
//			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
//				allStatesIdentical = testSuiteHelper.fragDiffBool(8)
//					&& allStatesIdentical;
//			}
//		}
//		try {
//			/* Label - index update id entry */
//			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/A[1], element=Element{node=null, tag=A, text=Random Website, attributes={data-reveal-id=entry-form-modal, rel=/ppma/index.php?r=entry/getData&id=1&withPassword=1, anyaccess=none, href=/ppma/index.php?r=entry/update&id=1&returnUrl=%2Fppma%2Findex.php%3Fr%3Dentry%2Findex%26Entry_sort%3Dname.desc, class=update-entry}}, source=8, target=10} */
//			formInputs = new ArrayList<FormInput>();
//			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "Entry_name"), "Random Website"));
//			testSuiteHelper.handleFormInputs(formInputs);
//			Thread.sleep(100);
//			Assert.assertTrue(testSuiteHelper.fireEvent(9), "Event fired: Random Website");
//			testSuiteHelper.runInCrawlingPlugins(10);
//			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 10");
//
//			testSuiteHelper.addStateToReportBuilder(10);
//
//			if (assertionMode != StateEquivalenceAssertionMode.NONE){
//
//				if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(10)
//										&& allStatesIdentical;
//				}
//
//				if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    /* Perform a visual diff on the two states. */
//				    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(10)
//						&& allStatesIdentical;
//				}
//				if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
//					allStatesIdentical = testSuiteHelper.fragDiffBool(10)
//						&& allStatesIdentical;
//				}
//			}
//
//		} catch (Exception e) {
//			Assert.fail(e.getMessage());
//		}
//		if(!allStatesIdentical) {
//			Assert.fail("At least one state is different.");
//		}
//	}
//
//	@Test(priority=4)
//	public void method_BT17_path_9_16(){
//		testSuiteHelper.newCurrentTestMethod("method_BT17_path_9_16", 4);
//		List<FormInput> formInputs;
//
//		boolean allStatesIdentical = true;
//
//		testSuiteHelper.addStateToReportBuilder(8);
//
//		if (assertionMode != StateEquivalenceAssertionMode.NONE){
//			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(8)
//										&& allStatesIdentical;
//			}
//
//			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(8)
//					&& allStatesIdentical;
//			}
//			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
//				allStatesIdentical = testSuiteHelper.fragDiffBool(8)
//					&& allStatesIdentical;
//			}
//		}
//		try {
//			/* Label - index update id entry */
//			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/A[1], element=Element{node=null, tag=A, text=Random Website, attributes={data-reveal-id=entry-form-modal, rel=/ppma/index.php?r=entry/getData&id=1&withPassword=1, anyaccess=none, href=/ppma/index.php?r=entry/update&id=1&returnUrl=%2Fppma%2Findex.php%3Fr%3Dentry%2Findex%26Entry_sort%3Dname.desc, class=update-entry}}, source=8, target=10} */
//			formInputs = new ArrayList<FormInput>();
//			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "Entry_name"), "Random Website"));
//			testSuiteHelper.handleFormInputs(formInputs);
//			Thread.sleep(100);
//			Assert.assertTrue(testSuiteHelper.fireEvent(9), "Event fired: Random Website");
//			testSuiteHelper.runInCrawlingPlugins(10);
//			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 10");
//
//			testSuiteHelper.addStateToReportBuilder(10);
//
//			if (assertionMode != StateEquivalenceAssertionMode.NONE){
//
//				if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(10)
//										&& allStatesIdentical;
//				}
//
//				if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    /* Perform a visual diff on the two states. */
//				    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(10)
//						&& allStatesIdentical;
//				}
//				if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
//					allStatesIdentical = testSuiteHelper.fragDiffBool(10)
//						&& allStatesIdentical;
//				}
//			}
//
//			/* Label - update id */
//			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/ASIDE[1]/DIV[2]/UL[1]/LI[1]/A[1], element=Element{node=null, tag=A, text=Random Website, attributes={data-reveal-id=entry-form-modal, rel=/ppma/index.php?r=entry/getData&id=1&withPassword=1, anyaccess=none, href=/ppma/index.php?r=entry/update&id=1, title=has been viewed 0 time(s), class=update-entry}}, source=10, target=17} */
//			formInputs = new ArrayList<FormInput>();
//			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "Entry_name"), "Random Website"));
//			testSuiteHelper.handleFormInputs(formInputs);
//			Thread.sleep(100);
//			Assert.assertTrue(testSuiteHelper.fireEvent(16), "Event fired: Random Website");
//			testSuiteHelper.runInCrawlingPlugins(17);
//			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 17");
//
//			testSuiteHelper.addStateToReportBuilder(17);
//
//			if (assertionMode != StateEquivalenceAssertionMode.NONE){
//
//				if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(17)
//										&& allStatesIdentical;
//				}
//
//				if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    /* Perform a visual diff on the two states. */
//				    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(17)
//						&& allStatesIdentical;
//				}
//				if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
//					allStatesIdentical = testSuiteHelper.fragDiffBool(17)
//						&& allStatesIdentical;
//				}
//			}
//
//		} catch (Exception e) {
//			Assert.fail(e.getMessage());
//		}
//		if(!allStatesIdentical) {
//			Assert.fail("At least one state is different.");
//		}
//	}
//
//	@Test(priority=5)
//	public void method_BT8_path_22_23(){
//		testSuiteHelper.newCurrentTestMethod("method_BT8_path_22_23", 5);
//		List<FormInput> formInputs;
//
//		boolean allStatesIdentical = true;
//
//		testSuiteHelper.addStateToReportBuilder(8);
//
//		if (assertionMode != StateEquivalenceAssertionMode.NONE){
//			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(8)
//										&& allStatesIdentical;
//			}
//
//			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(8)
//					&& allStatesIdentical;
//			}
//			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
//				allStatesIdentical = testSuiteHelper.fragDiffBool(8)
//					&& allStatesIdentical;
//			}
//		}
//		try {
//			/* Label - index delete entry */
//			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/TABLE[1]/TBODY[1]/TR[1]/TD[4]/A[5], element=Element{node=null, tag=A, text=, attributes={anyaccess=none, href=/ppma/index.php?r=entry/delete&id=1, title=Delete, class=delete}}, source=8, target=2} */
//			formInputs = new ArrayList<FormInput>();
//			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "Entry_name"), "Random Website"));
//			testSuiteHelper.handleFormInputs(formInputs);
//			Thread.sleep(100);
//			Assert.assertTrue(testSuiteHelper.fireEvent(22), "Event fired: ");
//			testSuiteHelper.runInCrawlingPlugins(2);
//			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 2");
//
//			testSuiteHelper.addStateToReportBuilder(2);
//
//			if (assertionMode != StateEquivalenceAssertionMode.NONE){
//
//				if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(2)
//										&& allStatesIdentical;
//				}
//
//				if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    /* Perform a visual diff on the two states. */
//				    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(2)
//						&& allStatesIdentical;
//				}
//				if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
//					allStatesIdentical = testSuiteHelper.fragDiffBool(2)
//						&& allStatesIdentical;
//				}
//			}
//
//			/* Label - import index */
//			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/NAV[1]/SECTION[1]/UL[1]/LI[1]/UL[1]/LI[4]/A[1], element=Element{node=null, tag=A, text=Import from CSV, attributes={href=/ppma/index.php?r=import/csv}}, source=2, target=30} */
//			formInputs = new ArrayList<FormInput>();
//			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "Entry_name"), "Random Website"));
//			testSuiteHelper.handleFormInputs(formInputs);
//			Thread.sleep(100);
//			Assert.assertTrue(testSuiteHelper.fireEvent(23), "Event fired: Import from CSV");
//			testSuiteHelper.runInCrawlingPlugins(30);
//			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 30");
//
//			testSuiteHelper.addStateToReportBuilder(30);
//
//			if (assertionMode != StateEquivalenceAssertionMode.NONE){
//
//				if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(30)
//										&& allStatesIdentical;
//				}
//
//				if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    /* Perform a visual diff on the two states. */
//				    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(30)
//						&& allStatesIdentical;
//				}
//				if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
//					allStatesIdentical = testSuiteHelper.fragDiffBool(30)
//						&& allStatesIdentical;
//				}
//			}
//
//		} catch (Exception e) {
//			Assert.fail(e.getMessage());
//		}
//		if(!allStatesIdentical) {
//			Assert.fail("At least one state is different.");
//		}
//	}
//
//	@Test(priority=6)
//	public void method_BT2_path_24(){
//		testSuiteHelper.newCurrentTestMethod("method_BT2_path_24", 6);
//		List<FormInput> formInputs;
//
//		boolean allStatesIdentical = true;
//
//		testSuiteHelper.addStateToReportBuilder(2);
//
//		if (assertionMode != StateEquivalenceAssertionMode.NONE){
//			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(2)
//										&& allStatesIdentical;
//			}
//
//			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(2)
//					&& allStatesIdentical;
//			}
//			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
//				allStatesIdentical = testSuiteHelper.fragDiffBool(2)
//					&& allStatesIdentical;
//			}
//		}
//		try {
//			/* Label - vac import index password */
//			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/NAV[1]/SECTION[1]/UL[1]/LI[1]/UL[1]/LI[5]/A[1], element=Element{node=null, tag=A, text=Import from phpPasswordManager, attributes={href=/ppma/index.php?r=import/phppassmanager}}, source=2, target=32} */
//			formInputs = new ArrayList<FormInput>();
//			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "Entry_name"), "Random Website"));
//			testSuiteHelper.handleFormInputs(formInputs);
//			Thread.sleep(100);
//			Assert.assertTrue(testSuiteHelper.fireEvent(24), "Event fired: Import from phpPasswordManager");
//			testSuiteHelper.runInCrawlingPlugins(32);
//			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 32");
//
//			testSuiteHelper.addStateToReportBuilder(32);
//
//			if (assertionMode != StateEquivalenceAssertionMode.NONE){
//
//				if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(32)
//										&& allStatesIdentical;
//				}
//
//				if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    /* Perform a visual diff on the two states. */
//				    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(32)
//						&& allStatesIdentical;
//				}
//				if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
//					allStatesIdentical = testSuiteHelper.fragDiffBool(32)
//						&& allStatesIdentical;
//				}
//			}
//
//		} catch (Exception e) {
//			Assert.fail(e.getMessage());
//		}
//		if(!allStatesIdentical) {
//			Assert.fail("At least one state is different.");
//		}
//	}
//
//	@Test(priority=7)
//	public void method_BT2_path_25_26_27_28_29_30(){
//		testSuiteHelper.newCurrentTestMethod("method_BT2_path_25_26_27_28_29_30", 7);
//		List<FormInput> formInputs;
//
//		boolean allStatesIdentical = true;
//
//		testSuiteHelper.addStateToReportBuilder(2);
//
//		if (assertionMode != StateEquivalenceAssertionMode.NONE){
//			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(2)
//										&& allStatesIdentical;
//			}
//
//			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(2)
//					&& allStatesIdentical;
//			}
//			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
//				allStatesIdentical = testSuiteHelper.fragDiffBool(2)
//					&& allStatesIdentical;
//			}
//		}
//		try {
//			/* Label - index tag */
//			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/NAV[1]/SECTION[1]/UL[1]/LI[2]/A[1], element=Element{node=null, tag=A, text=Tags, attributes={href=/ppma/index.php?r=tag/index}}, source=2, target=34} */
//			formInputs = new ArrayList<FormInput>();
//			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "Entry_name"), "Random Website"));
//			testSuiteHelper.handleFormInputs(formInputs);
//			Thread.sleep(100);
//			Assert.assertTrue(testSuiteHelper.fireEvent(25), "Event fired: Tags");
//			testSuiteHelper.runInCrawlingPlugins(34);
//			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 34");
//
//			testSuiteHelper.addStateToReportBuilder(34);
//
//			if (assertionMode != StateEquivalenceAssertionMode.NONE){
//
//				if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(34)
//										&& allStatesIdentical;
//				}
//
//				if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    /* Perform a visual diff on the two states. */
//				    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(34)
//						&& allStatesIdentical;
//				}
//				if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
//					allStatesIdentical = testSuiteHelper.fragDiffBool(34)
//						&& allStatesIdentical;
//				}
//			}
//
//			/* Label - index entry tag */
//			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/TABLE[1]/TBODY[1]/TR[1]/TD[3]/A[1], element=Element{node=null, tag=A, text=, attributes={anyaccess=none, href=/ppma/index.php?r=entry/index&Entry%5BtagList%5D=FfjJpAkJ, title=View}}, source=34, target=2} */
//			formInputs = new ArrayList<FormInput>();
//			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "Entry_name"), "Random Website"));
//			testSuiteHelper.handleFormInputs(formInputs);
//			Thread.sleep(100);
//			Assert.assertTrue(testSuiteHelper.fireEvent(26), "Event fired: ");
//			testSuiteHelper.runInCrawlingPlugins(2);
//			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 2");
//
//			testSuiteHelper.addStateToReportBuilder(2);
//
//			if (assertionMode != StateEquivalenceAssertionMode.NONE){
//
//				if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(2)
//										&& allStatesIdentical;
//				}
//
//				if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    /* Perform a visual diff on the two states. */
//				    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(2)
//						&& allStatesIdentical;
//				}
//				if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
//					allStatesIdentical = testSuiteHelper.fragDiffBool(2)
//						&& allStatesIdentical;
//				}
//			}
//
//			/* Label - index tag */
//			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/NAV[1]/SECTION[1]/UL[1]/LI[2]/UL[1]/LI[1]/A[1], element=Element{node=null, tag=A, text=Overview, attributes={href=/ppma/index.php?r=tag/index}}, source=2, target=34} */
//			formInputs = new ArrayList<FormInput>();
//			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "Entry_name"), "Random Website"));
//			testSuiteHelper.handleFormInputs(formInputs);
//			Thread.sleep(100);
//			Assert.assertTrue(testSuiteHelper.fireEvent(27), "Event fired: Overview");
//			testSuiteHelper.runInCrawlingPlugins(34);
//			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 34");
//
//			testSuiteHelper.addStateToReportBuilder(34);
//
//			if (assertionMode != StateEquivalenceAssertionMode.NONE){
//
//				if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(34)
//										&& allStatesIdentical;
//				}
//
//				if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    /* Perform a visual diff on the two states. */
//				    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(34)
//						&& allStatesIdentical;
//				}
//				if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
//					allStatesIdentical = testSuiteHelper.fragDiffBool(34)
//						&& allStatesIdentical;
//				}
//			}
//
//			/* Label - update index tag */
//			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/TABLE[1]/TBODY[1]/TR[1]/TD[3]/A[2], element=Element{node=null, tag=A, text=, attributes={anyaccess=none, href=/ppma/index.php?r=tag/update&id=2&returnUrl=%2Fppma%2Findex.php%3Fr%3Dtag%2Findex, title=Update}}, source=34, target=37} */
//			formInputs = new ArrayList<FormInput>();
//			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "Entry_name"), "Random Website"));
//			testSuiteHelper.handleFormInputs(formInputs);
//			Thread.sleep(100);
//			Assert.assertTrue(testSuiteHelper.fireEvent(28), "Event fired: ");
//			testSuiteHelper.runInCrawlingPlugins(37);
//			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 37");
//
//			testSuiteHelper.addStateToReportBuilder(37);
//
//			if (assertionMode != StateEquivalenceAssertionMode.NONE){
//
//				if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(37)
//										&& allStatesIdentical;
//				}
//
//				if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    /* Perform a visual diff on the two states. */
//				    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(37)
//						&& allStatesIdentical;
//				}
//				if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
//					allStatesIdentical = testSuiteHelper.fragDiffBool(37)
//						&& allStatesIdentical;
//				}
//			}
//
//			/* Label - submit button save index tag radius */
//			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/INPUT[4], element=Element{node=null, tag=INPUT, text=, attributes={name=yt0, type=submit, class=button radius, value=Save}}, source=37, target=38} */
//			formInputs = new ArrayList<FormInput>();
//			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/INPUT[2]"), "KnDeYLIA"));
//			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "Entry_name"), "Random Website"));
//			testSuiteHelper.handleFormInputs(formInputs);
//			Thread.sleep(100);
//			Assert.assertTrue(testSuiteHelper.fireEvent(29), "Event fired: ");
//			testSuiteHelper.runInCrawlingPlugins(38);
//			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 38");
//
//			testSuiteHelper.addStateToReportBuilder(38);
//
//			if (assertionMode != StateEquivalenceAssertionMode.NONE){
//
//				if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(38)
//										&& allStatesIdentical;
//				}
//
//				if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    /* Perform a visual diff on the two states. */
//				    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(38)
//						&& allStatesIdentical;
//				}
//				if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
//					allStatesIdentical = testSuiteHelper.fragDiffBool(38)
//						&& allStatesIdentical;
//				}
//			}
//
//			/* Label - i u a tag t d o r e delete l g n p y s f index */
//			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[4]/TABLE[1]/TBODY[1]/TR[2]/TD[3]/A[3], element=Element{node=null, tag=A, text=, attributes={anyaccess=none, href=/ppma/index.php?r=tag/delete&id=1, title=Delete, class=delete}}, source=38, target=39} */
//			formInputs = new ArrayList<FormInput>();
//			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "Entry_name"), "Random Website"));
//			testSuiteHelper.handleFormInputs(formInputs);
//			Thread.sleep(100);
//			Assert.assertTrue(testSuiteHelper.fireEvent(30), "Event fired: ");
//			testSuiteHelper.runInCrawlingPlugins(39);
//			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 39");
//
//			testSuiteHelper.addStateToReportBuilder(39);
//
//			if (assertionMode != StateEquivalenceAssertionMode.NONE){
//
//				if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(39)
//										&& allStatesIdentical;
//				}
//
//				if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    /* Perform a visual diff on the two states. */
//				    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(39)
//						&& allStatesIdentical;
//				}
//				if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
//					allStatesIdentical = testSuiteHelper.fragDiffBool(39)
//						&& allStatesIdentical;
//				}
//			}
//
//		} catch (Exception e) {
//			Assert.fail(e.getMessage());
//		}
//		if(!allStatesIdentical) {
//			Assert.fail("At least one state is different.");
//		}
//	}
//
//	@Test(priority=8)
//	public void method_BT2_path_32(){
//		testSuiteHelper.newCurrentTestMethod("method_BT2_path_32", 8);
//		List<FormInput> formInputs;
//
//		boolean allStatesIdentical = true;
//
//		testSuiteHelper.addStateToReportBuilder(2);
//
//		if (assertionMode != StateEquivalenceAssertionMode.NONE){
//			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(2)
//										&& allStatesIdentical;
//			}
//
//			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(2)
//					&& allStatesIdentical;
//			}
//			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
//				allStatesIdentical = testSuiteHelper.fragDiffBool(2)
//					&& allStatesIdentical;
//			}
//		}
//		try {
//			/* Label - index update create tag */
//			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/NAV[1]/SECTION[1]/UL[1]/LI[2]/UL[1]/LI[2]/A[1], element=Element{node=null, tag=A, text=Create, attributes={href=/ppma/index.php?r=tag/create}}, source=2, target=37} */
//			formInputs = new ArrayList<FormInput>();
//			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "Entry_name"), "Random Website"));
//			testSuiteHelper.handleFormInputs(formInputs);
//			Thread.sleep(100);
//			Assert.assertTrue(testSuiteHelper.fireEvent(32), "Event fired: Create");
//			testSuiteHelper.runInCrawlingPlugins(37);
//			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 37");
//
//			testSuiteHelper.addStateToReportBuilder(37);
//
//			if (assertionMode != StateEquivalenceAssertionMode.NONE){
//
//				if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(37)
//										&& allStatesIdentical;
//				}
//
//				if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    /* Perform a visual diff on the two states. */
//				    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(37)
//						&& allStatesIdentical;
//				}
//				if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
//					allStatesIdentical = testSuiteHelper.fragDiffBool(37)
//						&& allStatesIdentical;
//				}
//			}
//
//		} catch (Exception e) {
//			Assert.fail(e.getMessage());
//		}
//		if(!allStatesIdentical) {
//			Assert.fail("At least one state is different.");
//		}
//	}
//
//	@Test(priority=9)
//	public void method_BT34_failed_path_1000004(){
//		testSuiteHelper.newCurrentTestMethod("method_BT34_failed_path_1000004", 9);
//		List<FormInput> formInputs;
//
//		boolean allStatesIdentical = true;
//
//		testSuiteHelper.addStateToReportBuilder(2);
//
//		if (assertionMode != StateEquivalenceAssertionMode.NONE){
//			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(2)
//										&& allStatesIdentical;
//			}
//
//			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(2)
//					&& allStatesIdentical;
//			}
//			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
//				allStatesIdentical = testSuiteHelper.fragDiffBool(2)
//					&& allStatesIdentical;
//			}
//		}
//		try {
//			/* Label - index tag */
//			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/NAV[1]/SECTION[1]/UL[1]/LI[2]/A[1], element=Element{node=null, tag=A, text=Tags, attributes={href=/ppma/index.php?r=tag/index}}, source=2, target=39} */
//			formInputs = new ArrayList<FormInput>();
//			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "Entry_name"), "Random Website"));
//			testSuiteHelper.handleFormInputs(formInputs);
//			Thread.sleep(100);
//			Assert.assertTrue(testSuiteHelper.fireEvent(1000004), "Event fired: Tags");
//			testSuiteHelper.runInCrawlingPlugins(39);
//			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 39");
//
//			testSuiteHelper.addStateToReportBuilder(39);
//
//			if (assertionMode != StateEquivalenceAssertionMode.NONE){
//
//				if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(39)
//										&& allStatesIdentical;
//				}
//
//				if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    /* Perform a visual diff on the two states. */
//				    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(39)
//						&& allStatesIdentical;
//				}
//				if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
//					allStatesIdentical = testSuiteHelper.fragDiffBool(39)
//						&& allStatesIdentical;
//				}
//			}
//
//		} catch (Exception e) {
//			Assert.fail(e.getMessage());
//		}
//		if(!allStatesIdentical) {
//			Assert.fail("At least one state is different.");
//		}
//	}
//
//	@Test(priority=10)
//	public void method_BT34_path_34_35(){
//		testSuiteHelper.newCurrentTestMethod("method_BT34_path_34_35", 10);
//		List<FormInput> formInputs;
//
//		boolean allStatesIdentical = true;
//
//		testSuiteHelper.addStateToReportBuilder(2);
//
//		if (assertionMode != StateEquivalenceAssertionMode.NONE){
//			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(2)
//										&& allStatesIdentical;
//			}
//
//			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(2)
//					&& allStatesIdentical;
//			}
//			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
//				allStatesIdentical = testSuiteHelper.fragDiffBool(2)
//					&& allStatesIdentical;
//			}
//		}
//		try {
//			/* Label - widget index setting entry */
//			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/NAV[1]/SECTION[1]/UL[1]/LI[3]/UL[1]/LI[1]/A[1], element=Element{node=null, tag=A, text=General, attributes={href=/ppma/index.php?r=settings/application}}, source=2, target=47} */
//			formInputs = new ArrayList<FormInput>();
//			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "Entry_name"), "Random Website"));
//			testSuiteHelper.handleFormInputs(formInputs);
//			Thread.sleep(100);
//			Assert.assertTrue(testSuiteHelper.fireEvent(34), "Event fired: General");
//			testSuiteHelper.runInCrawlingPlugins(47);
//			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 47");
//
//			testSuiteHelper.addStateToReportBuilder(47);
//
//			if (assertionMode != StateEquivalenceAssertionMode.NONE){
//
//				if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(47)
//										&& allStatesIdentical;
//				}
//
//				if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    /* Perform a visual diff on the two states. */
//				    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(47)
//						&& allStatesIdentical;
//				}
//				if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
//					allStatesIdentical = testSuiteHelper.fragDiffBool(47)
//						&& allStatesIdentical;
//				}
//			}
//
//			/* Label - none */
//			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/INPUT[1], element=Element{node=null, tag=INPUT, text=, attributes={name=yt0, type=submit, class=button radius, value=Save}}, source=47, target=48} */
//			formInputs = new ArrayList<FormInput>();
//			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/INPUT[1]"), "uNAndmwX"));
//			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"), "zbAZawAD"));
//			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "Entry_name"), "Random Website"));
//			testSuiteHelper.handleFormInputs(formInputs);
//			Thread.sleep(100);
//			Assert.assertTrue(testSuiteHelper.fireEvent(35), "Event fired: ");
//			testSuiteHelper.runInCrawlingPlugins(48);
//			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 48");
//
//			testSuiteHelper.addStateToReportBuilder(48);
//
//			if (assertionMode != StateEquivalenceAssertionMode.NONE){
//
//				if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(48)
//										&& allStatesIdentical;
//				}
//
//				if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    /* Perform a visual diff on the two states. */
//				    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(48)
//						&& allStatesIdentical;
//				}
//				if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
//					allStatesIdentical = testSuiteHelper.fragDiffBool(48)
//						&& allStatesIdentical;
//				}
//			}
//
//		} catch (Exception e) {
//			Assert.fail(e.getMessage());
//		}
//		if(!allStatesIdentical) {
//			Assert.fail("At least one state is different.");
//		}
//	}
//
//	@Test(priority=11)
//	public void method_BT2_path_38_39(){
//		testSuiteHelper.newCurrentTestMethod("method_BT2_path_38_39", 11);
//		List<FormInput> formInputs;
//
//		boolean allStatesIdentical = true;
//
//		testSuiteHelper.addStateToReportBuilder(2);
//
//		if (assertionMode != StateEquivalenceAssertionMode.NONE){
//			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(2)
//										&& allStatesIdentical;
//			}
//
//			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(2)
//					&& allStatesIdentical;
//			}
//			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
//				allStatesIdentical = testSuiteHelper.fragDiffBool(2)
//					&& allStatesIdentical;
//			}
//		}
//		try {
//			/* Label - change manager index password */
//			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/NAV[1]/SECTION[1]/UL[1]/LI[4]/UL[1]/LI[1]/A[1], element=Element{node=null, tag=A, text=Change Password, attributes={href=/ppma/index.php?r=settings/password}}, source=2, target=52} */
//			formInputs = new ArrayList<FormInput>();
//			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "Entry_name"), "Random Website"));
//			testSuiteHelper.handleFormInputs(formInputs);
//			Thread.sleep(100);
//			Assert.assertTrue(testSuiteHelper.fireEvent(38), "Event fired: Change Password");
//			testSuiteHelper.runInCrawlingPlugins(52);
//			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 52");
//
//			testSuiteHelper.addStateToReportBuilder(52);
//
//			if (assertionMode != StateEquivalenceAssertionMode.NONE){
//
//				if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(52)
//										&& allStatesIdentical;
//				}
//
//				if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    /* Perform a visual diff on the two states. */
//				    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(52)
//						&& allStatesIdentical;
//				}
//				if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
//					allStatesIdentical = testSuiteHelper.fragDiffBool(52)
//						&& allStatesIdentical;
//				}
//			}
//
//			/* Label - submit password button repeat save radius */
//			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/INPUT[4], element=Element{node=null, tag=INPUT, text=, attributes={name=yt0, type=submit, class=button radius, value=Save}}, source=52, target=53} */
//			formInputs = new ArrayList<FormInput>();
//			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "Entry_name"), "Random Website"));
//			testSuiteHelper.handleFormInputs(formInputs);
//			Thread.sleep(100);
//			Assert.assertTrue(testSuiteHelper.fireEvent(39), "Event fired: ");
//			testSuiteHelper.runInCrawlingPlugins(53);
//			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 53");
//
//			testSuiteHelper.addStateToReportBuilder(53);
//
//			if (assertionMode != StateEquivalenceAssertionMode.NONE){
//
//				if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(53)
//										&& allStatesIdentical;
//				}
//
//				if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    /* Perform a visual diff on the two states. */
//				    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(53)
//						&& allStatesIdentical;
//				}
//				if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
//					allStatesIdentical = testSuiteHelper.fragDiffBool(53)
//						&& allStatesIdentical;
//				}
//			}
//
//		} catch (Exception e) {
//			Assert.fail(e.getMessage());
//		}
//		if(!allStatesIdentical) {
//			Assert.fail("At least one state is different.");
//		}
//	}
//
//	@Test(priority=12)
//	public void method_BT38_failed_path_32_1000006(){
//		testSuiteHelper.newCurrentTestMethod("method_BT38_failed_path_32_1000006", 12);
//		List<FormInput> formInputs;
//
//		boolean allStatesIdentical = true;
//
//		testSuiteHelper.addStateToReportBuilder(2);
//
//		if (assertionMode != StateEquivalenceAssertionMode.NONE){
//			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(2)
//										&& allStatesIdentical;
//			}
//
//			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(2)
//					&& allStatesIdentical;
//			}
//			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
//				allStatesIdentical = testSuiteHelper.fragDiffBool(2)
//					&& allStatesIdentical;
//			}
//		}
//		try {
//			/* Label - index update create tag */
//			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/NAV[1]/SECTION[1]/UL[1]/LI[2]/UL[1]/LI[2]/A[1], element=Element{node=null, tag=A, text=Create, attributes={href=/ppma/index.php?r=tag/create}}, source=2, target=37} */
//			formInputs = new ArrayList<FormInput>();
//			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "Entry_name"), "Random Website"));
//			testSuiteHelper.handleFormInputs(formInputs);
//			Thread.sleep(100);
//			Assert.assertTrue(testSuiteHelper.fireEvent(32), "Event fired: Create");
//			testSuiteHelper.runInCrawlingPlugins(37);
//			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 37");
//
//			testSuiteHelper.addStateToReportBuilder(37);
//
//			if (assertionMode != StateEquivalenceAssertionMode.NONE){
//
//				if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(37)
//										&& allStatesIdentical;
//				}
//
//				if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    /* Perform a visual diff on the two states. */
//				    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(37)
//						&& allStatesIdentical;
//				}
//				if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
//					allStatesIdentical = testSuiteHelper.fragDiffBool(37)
//						&& allStatesIdentical;
//				}
//			}
//
//			/* Label - submit create button save tag radius */
//			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/INPUT[4], element=Element{node=null, tag=INPUT, text=, attributes={name=yt0, type=submit, class=button radius, value=Save}}, source=37, target=57} */
//			formInputs = new ArrayList<FormInput>();
//			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/INPUT[2]"), "KnDeYLIA"));
//			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "Entry_name"), "Random Website"));
//			testSuiteHelper.handleFormInputs(formInputs);
//			Thread.sleep(100);
//			Assert.assertTrue(testSuiteHelper.fireEvent(1000006), "Event fired: ");
//			testSuiteHelper.runInCrawlingPlugins(57);
//			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 57");
//
//			testSuiteHelper.addStateToReportBuilder(57);
//
//			if (assertionMode != StateEquivalenceAssertionMode.NONE){
//
//				if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(57)
//										&& allStatesIdentical;
//				}
//
//				if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    /* Perform a visual diff on the two states. */
//				    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(57)
//						&& allStatesIdentical;
//				}
//				if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
//					allStatesIdentical = testSuiteHelper.fragDiffBool(57)
//						&& allStatesIdentical;
//				}
//			}
//
//		} catch (Exception e) {
//			Assert.fail(e.getMessage());
//		}
//		if(!allStatesIdentical) {
//			Assert.fail("At least one state is different.");
//		}
//	}
//
//	@Test(priority=13)
//	public void method_BT38_path_41(){
//		testSuiteHelper.newCurrentTestMethod("method_BT38_path_41", 13);
//		List<FormInput> formInputs;
//
//		boolean allStatesIdentical = true;
//
//		testSuiteHelper.addStateToReportBuilder(2);
//
//		if (assertionMode != StateEquivalenceAssertionMode.NONE){
//			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(2)
//										&& allStatesIdentical;
//			}
//
//			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(2)
//					&& allStatesIdentical;
//			}
//			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
//				allStatesIdentical = testSuiteHelper.fragDiffBool(2)
//					&& allStatesIdentical;
//			}
//		}
//		try {
//			/* Label - logout password login index user */
//			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/NAV[1]/SECTION[1]/UL[1]/LI[4]/UL[1]/LI[2]/A[1], element=Element{node=null, tag=A, text=Logout, attributes={href=/ppma/index.php?r=user/logout}}, source=2, target=0} */
//			formInputs = new ArrayList<FormInput>();
//			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "Entry_name"), "Random Website"));
//			testSuiteHelper.handleFormInputs(formInputs);
//			Thread.sleep(100);
//			Assert.assertTrue(testSuiteHelper.fireEvent(41), "Event fired: Logout");
//			testSuiteHelper.runInCrawlingPlugins(0);
//			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 0");
//
//			testSuiteHelper.addStateToReportBuilder(0);
//
//			if (assertionMode != StateEquivalenceAssertionMode.NONE){
//
//				if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(0)
//										&& allStatesIdentical;
//				}
//
//				if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    /* Perform a visual diff on the two states. */
//				    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(0)
//						&& allStatesIdentical;
//				}
//				if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
//					allStatesIdentical = testSuiteHelper.fragDiffBool(0)
//						&& allStatesIdentical;
//				}
//			}
//
//		} catch (Exception e) {
//			Assert.fail(e.getMessage());
//		}
//		if(!allStatesIdentical) {
//			Assert.fail("At least one state is different.");
//		}
//	}
//
//	@Test(priority=14)
//	public void method_BT2_path_1(){
//		testSuiteHelper.newCurrentTestMethod("method_BT2_path_1", 14);
//		List<FormInput> formInputs;
//
//		boolean allStatesIdentical = true;
//
//		testSuiteHelper.addStateToReportBuilder(0);
//
//		if (assertionMode != StateEquivalenceAssertionMode.NONE){
//			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(0)
//										&& allStatesIdentical;
//			}
//
//			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(0)
//					&& allStatesIdentical;
//			}
//			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
//				allStatesIdentical = testSuiteHelper.fragDiffBool(0)
//					&& allStatesIdentical;
//			}
//		}
//		try {
//			/* Label - remember login entry secondary expand tag */
//			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[2]/A[1], element=Element{node=null, tag=A, text=, attributes={class=postfix button secondary expand}}, source=0, target=2} */
//			formInputs = new ArrayList<FormInput>();
//			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/INPUT[1]"), "admin"));
//			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/INPUT[1]"), "admin"));
//			testSuiteHelper.handleFormInputs(formInputs);
//			Thread.sleep(100);
//			Assert.assertTrue(testSuiteHelper.fireEvent(1), "Event fired: ");
//			testSuiteHelper.runInCrawlingPlugins(2);
//			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 2");
//
//			testSuiteHelper.addStateToReportBuilder(2);
//
//			if (assertionMode != StateEquivalenceAssertionMode.NONE){
//
//				if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(2)
//										&& allStatesIdentical;
//				}
//
//				if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    /* Perform a visual diff on the two states. */
//				    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(2)
//						&& allStatesIdentical;
//				}
//				if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
//					allStatesIdentical = testSuiteHelper.fragDiffBool(2)
//						&& allStatesIdentical;
//				}
//			}
//
//		} catch (Exception e) {
//			Assert.fail(e.getMessage());
//		}
//		if(!allStatesIdentical) {
//			Assert.fail("At least one state is different.");
//		}
//	}
//
//	@Test(priority=15)
//	public void method_BT57_path_32_1000006_46_47(){
//		testSuiteHelper.newCurrentTestMethod("method_BT57_path_32_1000006_46_47", 15);
//		List<FormInput> formInputs;
//
//		boolean allStatesIdentical = true;
//
//		testSuiteHelper.addStateToReportBuilder(2);
//
//		if (assertionMode != StateEquivalenceAssertionMode.NONE){
//			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(2)
//										&& allStatesIdentical;
//			}
//
//			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(2)
//					&& allStatesIdentical;
//			}
//			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
//				allStatesIdentical = testSuiteHelper.fragDiffBool(2)
//					&& allStatesIdentical;
//			}
//		}
//		try {
//			/* Label - index update create tag */
//			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/NAV[1]/SECTION[1]/UL[1]/LI[2]/UL[1]/LI[2]/A[1], element=Element{node=null, tag=A, text=Create, attributes={href=/ppma/index.php?r=tag/create}}, source=2, target=37} */
//			formInputs = new ArrayList<FormInput>();
//			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "Entry_name"), "Random Website"));
//			testSuiteHelper.handleFormInputs(formInputs);
//			Thread.sleep(100);
//			Assert.assertTrue(testSuiteHelper.fireEvent(32), "Event fired: Create");
//			testSuiteHelper.runInCrawlingPlugins(37);
//			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 37");
//
//			testSuiteHelper.addStateToReportBuilder(37);
//
//			if (assertionMode != StateEquivalenceAssertionMode.NONE){
//
//				if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(37)
//										&& allStatesIdentical;
//				}
//
//				if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    /* Perform a visual diff on the two states. */
//				    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(37)
//						&& allStatesIdentical;
//				}
//				if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
//					allStatesIdentical = testSuiteHelper.fragDiffBool(37)
//						&& allStatesIdentical;
//				}
//			}
//
//			/* Label - submit create button save tag radius */
//			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/INPUT[4], element=Element{node=null, tag=INPUT, text=, attributes={name=yt0, type=submit, class=button radius, value=Save}}, source=37, target=57} */
//			formInputs = new ArrayList<FormInput>();
//			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/INPUT[2]"), "KnDeYLIA"));
//			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "Entry_name"), "Random Website"));
//			testSuiteHelper.handleFormInputs(formInputs);
//			Thread.sleep(100);
//			Assert.assertTrue(testSuiteHelper.fireEvent(1000006), "Event fired: ");
//			testSuiteHelper.runInCrawlingPlugins(57);
//			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 57");
//
//			testSuiteHelper.addStateToReportBuilder(57);
//
//			if (assertionMode != StateEquivalenceAssertionMode.NONE){
//
//				if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(57)
//										&& allStatesIdentical;
//				}
//
//				if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    /* Perform a visual diff on the two states. */
//				    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(57)
//						&& allStatesIdentical;
//				}
//				if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
//					allStatesIdentical = testSuiteHelper.fragDiffBool(57)
//						&& allStatesIdentical;
//				}
//			}
//
//			/* Label - submit button save index tag radius */
//			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/INPUT[4], element=Element{node=null, tag=INPUT, text=, attributes={name=yt0, type=submit, class=button radius, value=Save}}, source=57, target=38} */
//			formInputs = new ArrayList<FormInput>();
//			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/INPUT[2]"), "eNadsUHO"));
//			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "Entry_name"), "Random Website"));
//			testSuiteHelper.handleFormInputs(formInputs);
//			Thread.sleep(100);
//			Assert.assertTrue(testSuiteHelper.fireEvent(46), "Event fired: ");
//			testSuiteHelper.runInCrawlingPlugins(38);
//			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 38");
//
//			testSuiteHelper.addStateToReportBuilder(38);
//
//			if (assertionMode != StateEquivalenceAssertionMode.NONE){
//
//				if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(38)
//										&& allStatesIdentical;
//				}
//
//				if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    /* Perform a visual diff on the two states. */
//				    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(38)
//						&& allStatesIdentical;
//				}
//				if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
//					allStatesIdentical = testSuiteHelper.fragDiffBool(38)
//						&& allStatesIdentical;
//				}
//			}
//
//			/* Label - index sort entry tag */
//			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[4]/TABLE[1]/THEAD[1]/TR[1]/TH[1]/A[1], element=Element{node=null, tag=A, text=Name, attributes={anyaccess=none, href=/ppma/index.php?r=tag/index&Tag_sort=name.desc, class=sort-link asc}}, source=38, target=34} */
//			formInputs = new ArrayList<FormInput>();
//			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "Entry_name"), "Random Website"));
//			testSuiteHelper.handleFormInputs(formInputs);
//			Thread.sleep(100);
//			Assert.assertTrue(testSuiteHelper.fireEvent(47), "Event fired: Name");
//			testSuiteHelper.runInCrawlingPlugins(34);
//			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 34");
//
//			testSuiteHelper.addStateToReportBuilder(34);
//
//			if (assertionMode != StateEquivalenceAssertionMode.NONE){
//
//				if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(34)
//										&& allStatesIdentical;
//				}
//
//				if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    /* Perform a visual diff on the two states. */
//				    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(34)
//						&& allStatesIdentical;
//				}
//				if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
//					allStatesIdentical = testSuiteHelper.fragDiffBool(34)
//						&& allStatesIdentical;
//				}
//			}
//
//		} catch (Exception e) {
//			Assert.fail(e.getMessage());
//		}
//		if(!allStatesIdentical) {
//			Assert.fail("At least one state is different.");
//		}
//	}
//
//	@Test(priority=16)
//	public void method_BT38_failed_path_32_1000006_dup0(){
//		testSuiteHelper.newCurrentTestMethod("method_BT38_failed_path_32_1000006_dup0", 16);
//		List<FormInput> formInputs;
//
//		boolean allStatesIdentical = true;
//
//		testSuiteHelper.addStateToReportBuilder(2);
//
//		if (assertionMode != StateEquivalenceAssertionMode.NONE){
//			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(2)
//										&& allStatesIdentical;
//			}
//
//			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(2)
//					&& allStatesIdentical;
//			}
//			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
//				allStatesIdentical = testSuiteHelper.fragDiffBool(2)
//					&& allStatesIdentical;
//			}
//		}
//		try {
//			/* Label - index update create tag */
//			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/NAV[1]/SECTION[1]/UL[1]/LI[2]/UL[1]/LI[2]/A[1], element=Element{node=null, tag=A, text=Create, attributes={href=/ppma/index.php?r=tag/create}}, source=2, target=37} */
//			formInputs = new ArrayList<FormInput>();
//			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "Entry_name"), "Random Website"));
//			testSuiteHelper.handleFormInputs(formInputs);
//			Thread.sleep(100);
//			Assert.assertTrue(testSuiteHelper.fireEvent(32), "Event fired: Create");
//			testSuiteHelper.runInCrawlingPlugins(37);
//			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 37");
//
//			testSuiteHelper.addStateToReportBuilder(37);
//
//			if (assertionMode != StateEquivalenceAssertionMode.NONE){
//
//				if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(37)
//										&& allStatesIdentical;
//				}
//
//				if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    /* Perform a visual diff on the two states. */
//				    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(37)
//						&& allStatesIdentical;
//				}
//				if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
//					allStatesIdentical = testSuiteHelper.fragDiffBool(37)
//						&& allStatesIdentical;
//				}
//			}
//
//			/* Label - submit create button save tag radius */
//			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/INPUT[4], element=Element{node=null, tag=INPUT, text=, attributes={name=yt0, type=submit, class=button radius, value=Save}}, source=37, target=57} */
//			formInputs = new ArrayList<FormInput>();
//			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/INPUT[2]"), "KnDeYLIA"));
//			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "Entry_name"), "Random Website"));
//			testSuiteHelper.handleFormInputs(formInputs);
//			Thread.sleep(100);
//			Assert.assertTrue(testSuiteHelper.fireEvent(1000006), "Event fired: ");
//			testSuiteHelper.runInCrawlingPlugins(57);
//			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 57");
//
//			testSuiteHelper.addStateToReportBuilder(57);
//
//			if (assertionMode != StateEquivalenceAssertionMode.NONE){
//
//				if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(57)
//										&& allStatesIdentical;
//				}
//
//				if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    /* Perform a visual diff on the two states. */
//				    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(57)
//						&& allStatesIdentical;
//				}
//				if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
//					allStatesIdentical = testSuiteHelper.fragDiffBool(57)
//						&& allStatesIdentical;
//				}
//			}
//
//		} catch (Exception e) {
//			Assert.fail(e.getMessage());
//		}
//		if(!allStatesIdentical) {
//			Assert.fail("At least one state is different.");
//		}
//	}
//
//	@Test(priority=17)
//	public void method_BT10_path_5_6_7_9_100049(){
//		testSuiteHelper.newCurrentTestMethod("method_BT10_path_5_6_7_9_100049", 17);
//		List<FormInput> formInputs;
//
//		boolean allStatesIdentical = true;
//
//		testSuiteHelper.addStateToReportBuilder(2);
//
//		if (assertionMode != StateEquivalenceAssertionMode.NONE){
//			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(2)
//										&& allStatesIdentical;
//			}
//
//			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(2)
//					&& allStatesIdentical;
//			}
//			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
//				allStatesIdentical = testSuiteHelper.fragDiffBool(2)
//					&& allStatesIdentical;
//			}
//		}
//		try {
//			/* Label - index create entry */
//			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/NAV[1]/SECTION[1]/UL[1]/LI[1]/UL[1]/LI[2]/A[1], element=Element{node=null, tag=A, text=Create, attributes={href=/ppma/index.php?r=entry/create}}, source=2, target=6} */
//			formInputs = new ArrayList<FormInput>();
//			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "Entry_name"), "Random Website"));
//			testSuiteHelper.handleFormInputs(formInputs);
//			Thread.sleep(100);
//			Assert.assertTrue(testSuiteHelper.fireEvent(5), "Event fired: Create");
//			testSuiteHelper.runInCrawlingPlugins(6);
//			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 6");
//
//			testSuiteHelper.addStateToReportBuilder(6);
//
//			if (assertionMode != StateEquivalenceAssertionMode.NONE){
//
//				if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(6)
//										&& allStatesIdentical;
//				}
//
//				if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    /* Perform a visual diff on the two states. */
//				    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(6)
//						&& allStatesIdentical;
//				}
//				if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
//					allStatesIdentical = testSuiteHelper.fragDiffBool(6)
//						&& allStatesIdentical;
//				}
//			}
//
//			/* Label - submit button entry save index radius */
//			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/INPUT[7], element=Element{node=null, tag=INPUT, text=, attributes={name=yt0, type=submit, class=button radius, value=Save}}, source=6, target=7} */
//			formInputs = new ArrayList<FormInput>();
//			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/INPUT[2]"), "Random Website"));
//			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/INPUT[3]"), "jdoe"));
//			formInputs.add(new FormInput(FormInput.InputType.PASSWORD, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/INPUT[1]"), "123456"));
//			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/INPUT[4]"), "nrzmfmkJ"));
//			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/INPUT[5]"), "POFeABBy"));
//			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/TEXTAREA[1]"), "jtQbbrpV"));
//			testSuiteHelper.handleFormInputs(formInputs);
//			Thread.sleep(100);
//			Assert.assertTrue(testSuiteHelper.fireEvent(6), "Event fired: ");
//			testSuiteHelper.runInCrawlingPlugins(7);
//			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 7");
//
//			testSuiteHelper.addStateToReportBuilder(7);
//
//			if (assertionMode != StateEquivalenceAssertionMode.NONE){
//
//				if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(7)
//										&& allStatesIdentical;
//				}
//
//				if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    /* Perform a visual diff on the two states. */
//				    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(7)
//						&& allStatesIdentical;
//				}
//				if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
//					allStatesIdentical = testSuiteHelper.fragDiffBool(7)
//						&& allStatesIdentical;
//				}
//			}
//
//			/* Label - index sort entry */
//			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[4]/TABLE[1]/THEAD[1]/TR[1]/TH[1]/A[1], element=Element{node=null, tag=A, text=Name, attributes={anyaccess=none, href=/ppma/index.php?r=entry/index&Entry_sort=name.desc, class=sort-link asc}}, source=7, target=8} */
//			formInputs = new ArrayList<FormInput>();
//			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "Entry_name"), "Random Website"));
//			testSuiteHelper.handleFormInputs(formInputs);
//			Thread.sleep(100);
//			Assert.assertTrue(testSuiteHelper.fireEvent(7), "Event fired: Name");
//			testSuiteHelper.runInCrawlingPlugins(8);
//			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 8");
//
//			testSuiteHelper.addStateToReportBuilder(8);
//
//			if (assertionMode != StateEquivalenceAssertionMode.NONE){
//
//				if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(8)
//										&& allStatesIdentical;
//				}
//
//				if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    /* Perform a visual diff on the two states. */
//				    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(8)
//						&& allStatesIdentical;
//				}
//				if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
//					allStatesIdentical = testSuiteHelper.fragDiffBool(8)
//						&& allStatesIdentical;
//				}
//			}
//
//			/* Label - index update id entry */
//			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/A[1], element=Element{node=null, tag=A, text=Random Website, attributes={data-reveal-id=entry-form-modal, rel=/ppma/index.php?r=entry/getData&id=1&withPassword=1, anyaccess=none, href=/ppma/index.php?r=entry/update&id=1&returnUrl=%2Fppma%2Findex.php%3Fr%3Dentry%2Findex%26Entry_sort%3Dname.desc, class=update-entry}}, source=8, target=10} */
//			formInputs = new ArrayList<FormInput>();
//			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "Entry_name"), "Random Website"));
//			testSuiteHelper.handleFormInputs(formInputs);
//			Thread.sleep(100);
//			Assert.assertTrue(testSuiteHelper.fireEvent(9), "Event fired: Random Website");
//			testSuiteHelper.runInCrawlingPlugins(10);
//			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 10");
//
//			testSuiteHelper.addStateToReportBuilder(10);
//
//			if (assertionMode != StateEquivalenceAssertionMode.NONE){
//
//				if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(10)
//										&& allStatesIdentical;
//				}
//
//				if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    /* Perform a visual diff on the two states. */
//				    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(10)
//						&& allStatesIdentical;
//				}
//				if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
//					allStatesIdentical = testSuiteHelper.fragDiffBool(10)
//						&& allStatesIdentical;
//				}
//			}
//
//			/* Label - none */
//			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/ASIDE[1]/DIV[3]/UL[1]/LI[1]/A[1], element=Element{node=null, tag=A, text=Random Website, attributes={data-reveal-id=entry-form-modal, rel=/ppma/index.php?r=entry/getData&id=1&withPassword=1, anyaccess=none, href=/ppma/index.php?r=entry/update&id=1, class=update-entry}}, source=10, target=78} */
//			formInputs = new ArrayList<FormInput>();
//			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "Entry_name"), "Random Website"));
//			testSuiteHelper.handleFormInputs(formInputs);
//			Thread.sleep(100);
//			Assert.assertTrue(testSuiteHelper.fireEvent(100049), "Event fired: Random Website");
//			testSuiteHelper.runInCrawlingPlugins(78);
//			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 78");
//
//			testSuiteHelper.addStateToReportBuilder(78);
//
//			if (assertionMode != StateEquivalenceAssertionMode.NONE){
//
//				if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(78)
//										&& allStatesIdentical;
//				}
//
//				if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    /* Perform a visual diff on the two states. */
//				    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(78)
//						&& allStatesIdentical;
//				}
//				if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
//					allStatesIdentical = testSuiteHelper.fragDiffBool(78)
//						&& allStatesIdentical;
//				}
//			}
//
//		} catch (Exception e) {
//			Assert.fail(e.getMessage());
//		}
//		if(!allStatesIdentical) {
//			Assert.fail("At least one state is different.");
//		}
//	}
//
//	@Test(priority=18)
//	public void method_BT7_path_22_5_6_50(){
//		testSuiteHelper.newCurrentTestMethod("method_BT7_path_22_5_6_50", 18);
//		List<FormInput> formInputs;
//
//		boolean allStatesIdentical = true;
//
//		testSuiteHelper.addStateToReportBuilder(8);
//
//		if (assertionMode != StateEquivalenceAssertionMode.NONE){
//			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(8)
//										&& allStatesIdentical;
//			}
//
//			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(8)
//					&& allStatesIdentical;
//			}
//			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
//				allStatesIdentical = testSuiteHelper.fragDiffBool(8)
//					&& allStatesIdentical;
//			}
//		}
//		try {
//			/* Label - index delete entry */
//			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/TABLE[1]/TBODY[1]/TR[1]/TD[4]/A[5], element=Element{node=null, tag=A, text=, attributes={anyaccess=none, href=/ppma/index.php?r=entry/delete&id=1, title=Delete, class=delete}}, source=8, target=2} */
//			formInputs = new ArrayList<FormInput>();
//			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "Entry_name"), "Random Website"));
//			testSuiteHelper.handleFormInputs(formInputs);
//			Thread.sleep(100);
//			Assert.assertTrue(testSuiteHelper.fireEvent(22), "Event fired: ");
//			testSuiteHelper.runInCrawlingPlugins(2);
//			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 2");
//
//			testSuiteHelper.addStateToReportBuilder(2);
//
//			if (assertionMode != StateEquivalenceAssertionMode.NONE){
//
//				if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(2)
//										&& allStatesIdentical;
//				}
//
//				if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    /* Perform a visual diff on the two states. */
//				    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(2)
//						&& allStatesIdentical;
//				}
//				if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
//					allStatesIdentical = testSuiteHelper.fragDiffBool(2)
//						&& allStatesIdentical;
//				}
//			}
//
//			/* Label - index create entry */
//			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/NAV[1]/SECTION[1]/UL[1]/LI[1]/UL[1]/LI[2]/A[1], element=Element{node=null, tag=A, text=Create, attributes={href=/ppma/index.php?r=entry/create}}, source=2, target=6} */
//			formInputs = new ArrayList<FormInput>();
//			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "Entry_name"), "Random Website"));
//			testSuiteHelper.handleFormInputs(formInputs);
//			Thread.sleep(100);
//			Assert.assertTrue(testSuiteHelper.fireEvent(5), "Event fired: Create");
//			testSuiteHelper.runInCrawlingPlugins(6);
//			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 6");
//
//			testSuiteHelper.addStateToReportBuilder(6);
//
//			if (assertionMode != StateEquivalenceAssertionMode.NONE){
//
//				if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(6)
//										&& allStatesIdentical;
//				}
//
//				if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    /* Perform a visual diff on the two states. */
//				    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(6)
//						&& allStatesIdentical;
//				}
//				if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
//					allStatesIdentical = testSuiteHelper.fragDiffBool(6)
//						&& allStatesIdentical;
//				}
//			}
//
//			/* Label - submit button entry save index radius */
//			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/INPUT[7], element=Element{node=null, tag=INPUT, text=, attributes={name=yt0, type=submit, class=button radius, value=Save}}, source=6, target=7} */
//			formInputs = new ArrayList<FormInput>();
//			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/INPUT[2]"), "Random Website"));
//			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/INPUT[3]"), "jdoe"));
//			formInputs.add(new FormInput(FormInput.InputType.PASSWORD, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/INPUT[1]"), "123456"));
//			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/INPUT[4]"), "nrzmfmkJ"));
//			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/INPUT[5]"), "POFeABBy"));
//			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/TEXTAREA[1]"), "jtQbbrpV"));
//			testSuiteHelper.handleFormInputs(formInputs);
//			Thread.sleep(100);
//			Assert.assertTrue(testSuiteHelper.fireEvent(6), "Event fired: ");
//			testSuiteHelper.runInCrawlingPlugins(7);
//			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 7");
//
//			testSuiteHelper.addStateToReportBuilder(7);
//
//			if (assertionMode != StateEquivalenceAssertionMode.NONE){
//
//				if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(7)
//										&& allStatesIdentical;
//				}
//
//				if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    /* Perform a visual diff on the two states. */
//				    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(7)
//						&& allStatesIdentical;
//				}
//				if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
//					allStatesIdentical = testSuiteHelper.fragDiffBool(7)
//						&& allStatesIdentical;
//				}
//			}
//
//			/* Label - none */
//			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1], element=Element{node=null, tag=A, text=×, attributes={href=, class=close}}, source=7, target=8} */
//			formInputs = new ArrayList<FormInput>();
//			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "Entry_name"), "Random Website"));
//			testSuiteHelper.handleFormInputs(formInputs);
//			Thread.sleep(100);
//			Assert.assertTrue(testSuiteHelper.fireEvent(50), "Event fired: ×");
//			testSuiteHelper.runInCrawlingPlugins(8);
//			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 8");
//
//			testSuiteHelper.addStateToReportBuilder(8);
//
//			if (assertionMode != StateEquivalenceAssertionMode.NONE){
//
//				if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(8)
//										&& allStatesIdentical;
//				}
//
//				if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    /* Perform a visual diff on the two states. */
//				    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(8)
//						&& allStatesIdentical;
//				}
//				if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
//					allStatesIdentical = testSuiteHelper.fragDiffBool(8)
//						&& allStatesIdentical;
//				}
//			}
//
//		} catch (Exception e) {
//			Assert.fail(e.getMessage());
//		}
//		if(!allStatesIdentical) {
//			Assert.fail("At least one state is different.");
//		}
//	}
//
//	@Test(priority=19)
//	public void method_BT7_path_22_5_6_52(){
//		testSuiteHelper.newCurrentTestMethod("method_BT7_path_22_5_6_52", 19);
//		List<FormInput> formInputs;
//
//		boolean allStatesIdentical = true;
//
//		testSuiteHelper.addStateToReportBuilder(8);
//
//		if (assertionMode != StateEquivalenceAssertionMode.NONE){
//			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(8)
//										&& allStatesIdentical;
//			}
//
//			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(8)
//					&& allStatesIdentical;
//			}
//			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
//				allStatesIdentical = testSuiteHelper.fragDiffBool(8)
//					&& allStatesIdentical;
//			}
//		}
//		try {
//			/* Label - index delete entry */
//			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/TABLE[1]/TBODY[1]/TR[1]/TD[4]/A[5], element=Element{node=null, tag=A, text=, attributes={anyaccess=none, href=/ppma/index.php?r=entry/delete&id=1, title=Delete, class=delete}}, source=8, target=2} */
//			formInputs = new ArrayList<FormInput>();
//			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "Entry_name"), "Random Website"));
//			testSuiteHelper.handleFormInputs(formInputs);
//			Thread.sleep(100);
//			Assert.assertTrue(testSuiteHelper.fireEvent(22), "Event fired: ");
//			testSuiteHelper.runInCrawlingPlugins(2);
//			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 2");
//
//			testSuiteHelper.addStateToReportBuilder(2);
//
//			if (assertionMode != StateEquivalenceAssertionMode.NONE){
//
//				if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(2)
//										&& allStatesIdentical;
//				}
//
//				if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    /* Perform a visual diff on the two states. */
//				    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(2)
//						&& allStatesIdentical;
//				}
//				if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
//					allStatesIdentical = testSuiteHelper.fragDiffBool(2)
//						&& allStatesIdentical;
//				}
//			}
//
//			/* Label - index create entry */
//			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/NAV[1]/SECTION[1]/UL[1]/LI[1]/UL[1]/LI[2]/A[1], element=Element{node=null, tag=A, text=Create, attributes={href=/ppma/index.php?r=entry/create}}, source=2, target=6} */
//			formInputs = new ArrayList<FormInput>();
//			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "Entry_name"), "Random Website"));
//			testSuiteHelper.handleFormInputs(formInputs);
//			Thread.sleep(100);
//			Assert.assertTrue(testSuiteHelper.fireEvent(5), "Event fired: Create");
//			testSuiteHelper.runInCrawlingPlugins(6);
//			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 6");
//
//			testSuiteHelper.addStateToReportBuilder(6);
//
//			if (assertionMode != StateEquivalenceAssertionMode.NONE){
//
//				if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(6)
//										&& allStatesIdentical;
//				}
//
//				if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    /* Perform a visual diff on the two states. */
//				    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(6)
//						&& allStatesIdentical;
//				}
//				if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
//					allStatesIdentical = testSuiteHelper.fragDiffBool(6)
//						&& allStatesIdentical;
//				}
//			}
//
//			/* Label - submit button entry save index radius */
//			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/INPUT[7], element=Element{node=null, tag=INPUT, text=, attributes={name=yt0, type=submit, class=button radius, value=Save}}, source=6, target=7} */
//			formInputs = new ArrayList<FormInput>();
//			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/INPUT[2]"), "Random Website"));
//			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/INPUT[3]"), "jdoe"));
//			formInputs.add(new FormInput(FormInput.InputType.PASSWORD, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/INPUT[1]"), "123456"));
//			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/INPUT[4]"), "nrzmfmkJ"));
//			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/INPUT[5]"), "POFeABBy"));
//			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/TEXTAREA[1]"), "jtQbbrpV"));
//			testSuiteHelper.handleFormInputs(formInputs);
//			Thread.sleep(100);
//			Assert.assertTrue(testSuiteHelper.fireEvent(6), "Event fired: ");
//			testSuiteHelper.runInCrawlingPlugins(7);
//			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 7");
//
//			testSuiteHelper.addStateToReportBuilder(7);
//
//			if (assertionMode != StateEquivalenceAssertionMode.NONE){
//
//				if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(7)
//										&& allStatesIdentical;
//				}
//
//				if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    /* Perform a visual diff on the two states. */
//				    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(7)
//						&& allStatesIdentical;
//				}
//				if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
//					allStatesIdentical = testSuiteHelper.fragDiffBool(7)
//						&& allStatesIdentical;
//				}
//			}
//
//			/* Label - submit radius update button entry secondary search */
//			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/INPUT[6], element=Element{node=null, tag=INPUT, text=, attributes={name=yt0, type=submit, class=secondary button radius, value=Search}}, source=7, target=89} */
//			formInputs = new ArrayList<FormInput>();
//			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/INPUT[1]"), "Random Website"));
//			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/INPUT[2]"), "JnOsXovb"));
//			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/INPUT[3]"), "jdoe"));
//			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/INPUT[4]"), "paPGtinr"));
//			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/INPUT[5]"), "QYSQRFaY"));
//			formInputs.add(new FormInput(FormInput.InputType.PASSWORD, new Identification(How.id, "Entry_password"), "123456"));
//			testSuiteHelper.handleFormInputs(formInputs);
//			Thread.sleep(100);
//			Assert.assertTrue(testSuiteHelper.fireEvent(52), "Event fired: ");
//			testSuiteHelper.runInCrawlingPlugins(89);
//			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 89");
//
//			testSuiteHelper.addStateToReportBuilder(89);
//
//			if (assertionMode != StateEquivalenceAssertionMode.NONE){
//
//				if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(89)
//										&& allStatesIdentical;
//				}
//
//				if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    /* Perform a visual diff on the two states. */
//				    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(89)
//						&& allStatesIdentical;
//				}
//				if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
//					allStatesIdentical = testSuiteHelper.fragDiffBool(89)
//						&& allStatesIdentical;
//				}
//			}
//
//		} catch (Exception e) {
//			Assert.fail(e.getMessage());
//		}
//		if(!allStatesIdentical) {
//			Assert.fail("At least one state is different.");
//		}
//	}
//
//	@Test(priority=20)
//	public void method_BT18_failed_path_9_1000023(){
//		testSuiteHelper.newCurrentTestMethod("method_BT18_failed_path_9_1000023", 20);
//		List<FormInput> formInputs;
//
//		boolean allStatesIdentical = true;
//
//		testSuiteHelper.addStateToReportBuilder(8);
//
//		if (assertionMode != StateEquivalenceAssertionMode.NONE){
//			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(8)
//										&& allStatesIdentical;
//			}
//
//			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(8)
//					&& allStatesIdentical;
//			}
//			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
//				allStatesIdentical = testSuiteHelper.fragDiffBool(8)
//					&& allStatesIdentical;
//			}
//		}
//		try {
//			/* Label - index update id entry */
//			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/A[1], element=Element{node=null, tag=A, text=Random Website, attributes={data-reveal-id=entry-form-modal, rel=/ppma/index.php?r=entry/getData&id=1&withPassword=1, anyaccess=none, href=/ppma/index.php?r=entry/update&id=1&returnUrl=%2Fppma%2Findex.php%3Fr%3Dentry%2Findex%26Entry_sort%3Dname.desc, class=update-entry}}, source=8, target=10} */
//			formInputs = new ArrayList<FormInput>();
//			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "Entry_name"), "Random Website"));
//			testSuiteHelper.handleFormInputs(formInputs);
//			Thread.sleep(100);
//			Assert.assertTrue(testSuiteHelper.fireEvent(9), "Event fired: Random Website");
//			testSuiteHelper.runInCrawlingPlugins(10);
//			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 10");
//
//			testSuiteHelper.addStateToReportBuilder(10);
//
//			if (assertionMode != StateEquivalenceAssertionMode.NONE){
//
//				if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(10)
//										&& allStatesIdentical;
//				}
//
//				if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    /* Perform a visual diff on the two states. */
//				    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(10)
//						&& allStatesIdentical;
//				}
//				if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
//					allStatesIdentical = testSuiteHelper.fragDiffBool(10)
//						&& allStatesIdentical;
//				}
//			}
//
//			/* Label - none */
//			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/ASIDE[1]/DIV[2]/UL[1]/LI[1]/A[1], element=Element{node=null, tag=A, text=Random Website, attributes={data-reveal-id=entry-form-modal, rel=/ppma/index.php?r=entry/getData&id=1&withPassword=1, anyaccess=none, href=/ppma/index.php?r=entry/update&id=1, title=has been viewed 0 time(s), class=update-entry}}, source=10, target=78} */
//			formInputs = new ArrayList<FormInput>();
//			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "Entry_name"), "Random Website"));
//			testSuiteHelper.handleFormInputs(formInputs);
//			Thread.sleep(100);
//			Assert.assertTrue(testSuiteHelper.fireEvent(1000023), "Event fired: Random Website");
//			testSuiteHelper.runInCrawlingPlugins(78);
//			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 78");
//
//			testSuiteHelper.addStateToReportBuilder(78);
//
//			if (assertionMode != StateEquivalenceAssertionMode.NONE){
//
//				if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(78)
//										&& allStatesIdentical;
//				}
//
//				if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    /* Perform a visual diff on the two states. */
//				    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(78)
//						&& allStatesIdentical;
//				}
//				if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
//					allStatesIdentical = testSuiteHelper.fragDiffBool(78)
//						&& allStatesIdentical;
//				}
//			}
//
//		} catch (Exception e) {
//			Assert.fail(e.getMessage());
//		}
//		if(!allStatesIdentical) {
//			Assert.fail("At least one state is different.");
//		}
//	}
//
//	@Test(priority=21)
//	public void method_BT17_path_100054_100055_100056(){
//		testSuiteHelper.newCurrentTestMethod("method_BT17_path_100054_100055_100056", 21);
//		List<FormInput> formInputs;
//
//		boolean allStatesIdentical = true;
//
//		testSuiteHelper.addStateToReportBuilder(8);
//
//		if (assertionMode != StateEquivalenceAssertionMode.NONE){
//			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(8)
//										&& allStatesIdentical;
//			}
//
//			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(8)
//					&& allStatesIdentical;
//			}
//			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
//				allStatesIdentical = testSuiteHelper.fragDiffBool(8)
//					&& allStatesIdentical;
//			}
//		}
//		try {
//			/* Label - index update id entry */
//			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/ASIDE[1]/DIV[2]/UL[1]/LI[1]/A[1], element=Element{node=null, tag=A, text=Random Website, attributes={data-reveal-id=entry-form-modal, rel=/ppma/index.php?r=entry/getData&id=1&withPassword=1, anyaccess=none, href=/ppma/index.php?r=entry/update&id=1, title=has been viewed 0 time(s), class=update-entry}}, source=8, target=10} */
//			formInputs = new ArrayList<FormInput>();
//			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "Entry_name"), "Random Website"));
//			testSuiteHelper.handleFormInputs(formInputs);
//			Thread.sleep(100);
//			Assert.assertTrue(testSuiteHelper.fireEvent(100054), "Event fired: Random Website");
//			testSuiteHelper.runInCrawlingPlugins(10);
//			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 10");
//
//			testSuiteHelper.addStateToReportBuilder(10);
//
//			if (assertionMode != StateEquivalenceAssertionMode.NONE){
//
//				if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(10)
//										&& allStatesIdentical;
//				}
//
//				if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    /* Perform a visual diff on the two states. */
//				    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(10)
//						&& allStatesIdentical;
//				}
//				if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
//					allStatesIdentical = testSuiteHelper.fragDiffBool(10)
//						&& allStatesIdentical;
//				}
//			}
//
//			/* Label - submit button entry save index radius */
//			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[2]/FORM[1]/INPUT[7], element=Element{node=null, tag=INPUT, text=, attributes={name=yt1, anyaccess=action, type=submit, class=button radius, value=Save}}, source=10, target=7} */
//			formInputs = new ArrayList<FormInput>();
//			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "Entry_name"), "Random Website"));
//			testSuiteHelper.handleFormInputs(formInputs);
//			Thread.sleep(100);
//			Assert.assertTrue(testSuiteHelper.fireEvent(100055), "Event fired: ");
//			testSuiteHelper.runInCrawlingPlugins(7);
//			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 7");
//
//			testSuiteHelper.addStateToReportBuilder(7);
//
//			if (assertionMode != StateEquivalenceAssertionMode.NONE){
//
//				if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(7)
//										&& allStatesIdentical;
//				}
//
//				if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    /* Perform a visual diff on the two states. */
//				    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(7)
//						&& allStatesIdentical;
//				}
//				if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
//					allStatesIdentical = testSuiteHelper.fragDiffBool(7)
//						&& allStatesIdentical;
//				}
//			}
//
//			/* Label - index username sort entry */
//			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[4]/TABLE[1]/THEAD[1]/TR[1]/TH[2]/A[1], element=Element{node=null, tag=A, text=Username, attributes={anyaccess=none, href=/ppma/index.php?r=entry/index&Entry_sort=username, class=sort-link}}, source=7, target=8} */
//			formInputs = new ArrayList<FormInput>();
//			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "Entry_name"), "Random Website"));
//			testSuiteHelper.handleFormInputs(formInputs);
//			Thread.sleep(100);
//			Assert.assertTrue(testSuiteHelper.fireEvent(100056), "Event fired: Username");
//			testSuiteHelper.runInCrawlingPlugins(8);
//			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 8");
//
//			testSuiteHelper.addStateToReportBuilder(8);
//
//			if (assertionMode != StateEquivalenceAssertionMode.NONE){
//
//				if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(8)
//										&& allStatesIdentical;
//				}
//
//				if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    /* Perform a visual diff on the two states. */
//				    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(8)
//						&& allStatesIdentical;
//				}
//				if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
//					allStatesIdentical = testSuiteHelper.fragDiffBool(8)
//						&& allStatesIdentical;
//				}
//			}
//
//		} catch (Exception e) {
//			Assert.fail(e.getMessage());
//		}
//		if(!allStatesIdentical) {
//			Assert.fail("At least one state is different.");
//		}
//	}
//
//	@Test(priority=22)
//	public void method_BT39_failed_path_22_1000025(){
//		testSuiteHelper.newCurrentTestMethod("method_BT39_failed_path_22_1000025", 22);
//		List<FormInput> formInputs;
//
//		boolean allStatesIdentical = true;
//
//		testSuiteHelper.addStateToReportBuilder(8);
//
//		if (assertionMode != StateEquivalenceAssertionMode.NONE){
//			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(8)
//										&& allStatesIdentical;
//			}
//
//			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(8)
//					&& allStatesIdentical;
//			}
//			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
//				allStatesIdentical = testSuiteHelper.fragDiffBool(8)
//					&& allStatesIdentical;
//			}
//		}
//		try {
//			/* Label - index delete entry */
//			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/TABLE[1]/TBODY[1]/TR[1]/TD[4]/A[5], element=Element{node=null, tag=A, text=, attributes={anyaccess=none, href=/ppma/index.php?r=entry/delete&id=1, title=Delete, class=delete}}, source=8, target=2} */
//			formInputs = new ArrayList<FormInput>();
//			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "Entry_name"), "Random Website"));
//			testSuiteHelper.handleFormInputs(formInputs);
//			Thread.sleep(100);
//			Assert.assertTrue(testSuiteHelper.fireEvent(22), "Event fired: ");
//			testSuiteHelper.runInCrawlingPlugins(2);
//			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 2");
//
//			testSuiteHelper.addStateToReportBuilder(2);
//
//			if (assertionMode != StateEquivalenceAssertionMode.NONE){
//
//				if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(2)
//										&& allStatesIdentical;
//				}
//
//				if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    /* Perform a visual diff on the two states. */
//				    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(2)
//						&& allStatesIdentical;
//				}
//				if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
//					allStatesIdentical = testSuiteHelper.fragDiffBool(2)
//						&& allStatesIdentical;
//				}
//			}
//
//			/* Label - none */
//			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/NAV[1]/SECTION[1]/UL[1]/LI[2]/A[1], element=Element{node=null, tag=A, text=Tags, attributes={href=/ppma/index.php?r=tag/index}}, source=2, target=103} */
//			formInputs = new ArrayList<FormInput>();
//			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "Entry_name"), "Random Website"));
//			testSuiteHelper.handleFormInputs(formInputs);
//			Thread.sleep(100);
//			Assert.assertTrue(testSuiteHelper.fireEvent(1000025), "Event fired: Tags");
//			testSuiteHelper.runInCrawlingPlugins(103);
//			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 103");
//
//			testSuiteHelper.addStateToReportBuilder(103);
//
//			if (assertionMode != StateEquivalenceAssertionMode.NONE){
//
//				if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(103)
//										&& allStatesIdentical;
//				}
//
//				if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    /* Perform a visual diff on the two states. */
//				    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(103)
//						&& allStatesIdentical;
//				}
//				if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
//					allStatesIdentical = testSuiteHelper.fragDiffBool(103)
//						&& allStatesIdentical;
//				}
//			}
//
//		} catch (Exception e) {
//			Assert.fail(e.getMessage());
//		}
//		if(!allStatesIdentical) {
//			Assert.fail("At least one state is different.");
//		}
//	}
//
//	@Test(priority=23)
//	public void method_BT103_path_1000025_100058(){
//		testSuiteHelper.newCurrentTestMethod("method_BT103_path_1000025_100058", 23);
//		List<FormInput> formInputs;
//
//		boolean allStatesIdentical = true;
//
//		testSuiteHelper.addStateToReportBuilder(2);
//
//		if (assertionMode != StateEquivalenceAssertionMode.NONE){
//			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(2)
//										&& allStatesIdentical;
//			}
//
//			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(2)
//					&& allStatesIdentical;
//			}
//			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
//				allStatesIdentical = testSuiteHelper.fragDiffBool(2)
//					&& allStatesIdentical;
//			}
//		}
//		try {
//			/* Label - none */
//			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/NAV[1]/SECTION[1]/UL[1]/LI[2]/A[1], element=Element{node=null, tag=A, text=Tags, attributes={href=/ppma/index.php?r=tag/index}}, source=2, target=103} */
//			formInputs = new ArrayList<FormInput>();
//			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "Entry_name"), "Random Website"));
//			testSuiteHelper.handleFormInputs(formInputs);
//			Thread.sleep(100);
//			Assert.assertTrue(testSuiteHelper.fireEvent(1000025), "Event fired: Tags");
//			testSuiteHelper.runInCrawlingPlugins(103);
//			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 103");
//
//			testSuiteHelper.addStateToReportBuilder(103);
//
//			if (assertionMode != StateEquivalenceAssertionMode.NONE){
//
//				if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(103)
//										&& allStatesIdentical;
//				}
//
//				if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    /* Perform a visual diff on the two states. */
//				    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(103)
//						&& allStatesIdentical;
//				}
//				if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
//					allStatesIdentical = testSuiteHelper.fragDiffBool(103)
//						&& allStatesIdentical;
//				}
//			}
//
//			/* Label - index entry tag */
//			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/TABLE[1]/TBODY[1]/TR[1]/TD[3]/A[1], element=Element{node=null, tag=A, text=, attributes={anyaccess=action, href=/ppma/index.php?r=entry/index&Entry%5BtagList%5D=eNadsUHO, title=View}}, source=103, target=2} */
//			formInputs = new ArrayList<FormInput>();
//			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "Entry_name"), "Random Website"));
//			testSuiteHelper.handleFormInputs(formInputs);
//			Thread.sleep(100);
//			Assert.assertTrue(testSuiteHelper.fireEvent(100058), "Event fired: ");
//			testSuiteHelper.runInCrawlingPlugins(2);
//			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 2");
//
//			testSuiteHelper.addStateToReportBuilder(2);
//
//			if (assertionMode != StateEquivalenceAssertionMode.NONE){
//
//				if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(2)
//										&& allStatesIdentical;
//				}
//
//				if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    /* Perform a visual diff on the two states. */
//				    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(2)
//						&& allStatesIdentical;
//				}
//				if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
//					allStatesIdentical = testSuiteHelper.fragDiffBool(2)
//						&& allStatesIdentical;
//				}
//			}
//
//		} catch (Exception e) {
//			Assert.fail(e.getMessage());
//		}
//		if(!allStatesIdentical) {
//			Assert.fail("At least one state is different.");
//		}
//	}
//
//	@Test(priority=24)
//	public void method_BT34_failed_path_1000025(){
//		testSuiteHelper.newCurrentTestMethod("method_BT34_failed_path_1000025", 24);
//		List<FormInput> formInputs;
//
//		boolean allStatesIdentical = true;
//
//		testSuiteHelper.addStateToReportBuilder(2);
//
//		if (assertionMode != StateEquivalenceAssertionMode.NONE){
//			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(2)
//										&& allStatesIdentical;
//			}
//
//			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(2)
//					&& allStatesIdentical;
//			}
//			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
//				allStatesIdentical = testSuiteHelper.fragDiffBool(2)
//					&& allStatesIdentical;
//			}
//		}
//		try {
//			/* Label - none */
//			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/NAV[1]/SECTION[1]/UL[1]/LI[2]/A[1], element=Element{node=null, tag=A, text=Tags, attributes={href=/ppma/index.php?r=tag/index}}, source=2, target=103} */
//			formInputs = new ArrayList<FormInput>();
//			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "Entry_name"), "Random Website"));
//			testSuiteHelper.handleFormInputs(formInputs);
//			Thread.sleep(100);
//			Assert.assertTrue(testSuiteHelper.fireEvent(1000025), "Event fired: Tags");
//			testSuiteHelper.runInCrawlingPlugins(103);
//			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 103");
//
//			testSuiteHelper.addStateToReportBuilder(103);
//
//			if (assertionMode != StateEquivalenceAssertionMode.NONE){
//
//				if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(103)
//										&& allStatesIdentical;
//				}
//
//				if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    /* Perform a visual diff on the two states. */
//				    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(103)
//						&& allStatesIdentical;
//				}
//				if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
//					allStatesIdentical = testSuiteHelper.fragDiffBool(103)
//						&& allStatesIdentical;
//				}
//			}
//
//		} catch (Exception e) {
//			Assert.fail(e.getMessage());
//		}
//		if(!allStatesIdentical) {
//			Assert.fail("At least one state is different.");
//		}
//	}
//
//	@Test(priority=25)
//	public void method_BT89_failed_path_5_6(){
//		testSuiteHelper.newCurrentTestMethod("method_BT89_failed_path_5_6", 25);
//		List<FormInput> formInputs;
//
//		boolean allStatesIdentical = true;
//
//		testSuiteHelper.addStateToReportBuilder(2);
//
//		if (assertionMode != StateEquivalenceAssertionMode.NONE){
//			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(2)
//										&& allStatesIdentical;
//			}
//
//			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(2)
//					&& allStatesIdentical;
//			}
//			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
//				allStatesIdentical = testSuiteHelper.fragDiffBool(2)
//					&& allStatesIdentical;
//			}
//		}
//		try {
//			/* Label - index create entry */
//			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/NAV[1]/SECTION[1]/UL[1]/LI[1]/UL[1]/LI[2]/A[1], element=Element{node=null, tag=A, text=Create, attributes={href=/ppma/index.php?r=entry/create}}, source=2, target=6} */
//			formInputs = new ArrayList<FormInput>();
//			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "Entry_name"), "Random Website"));
//			testSuiteHelper.handleFormInputs(formInputs);
//			Thread.sleep(100);
//			Assert.assertTrue(testSuiteHelper.fireEvent(5), "Event fired: Create");
//			testSuiteHelper.runInCrawlingPlugins(6);
//			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 6");
//
//			testSuiteHelper.addStateToReportBuilder(6);
//
//			if (assertionMode != StateEquivalenceAssertionMode.NONE){
//
//				if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(6)
//										&& allStatesIdentical;
//				}
//
//				if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    /* Perform a visual diff on the two states. */
//				    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(6)
//						&& allStatesIdentical;
//				}
//				if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
//					allStatesIdentical = testSuiteHelper.fragDiffBool(6)
//						&& allStatesIdentical;
//				}
//			}
//
//			/* Label - submit button entry save index radius */
//			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/INPUT[7], element=Element{node=null, tag=INPUT, text=, attributes={name=yt0, type=submit, class=button radius, value=Save}}, source=6, target=7} */
//			formInputs = new ArrayList<FormInput>();
//			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/INPUT[2]"), "Random Website"));
//			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/INPUT[3]"), "jdoe"));
//			formInputs.add(new FormInput(FormInput.InputType.PASSWORD, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/INPUT[1]"), "123456"));
//			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/INPUT[4]"), "nrzmfmkJ"));
//			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/INPUT[5]"), "POFeABBy"));
//			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/TEXTAREA[1]"), "jtQbbrpV"));
//			testSuiteHelper.handleFormInputs(formInputs);
//			Thread.sleep(100);
//			Assert.assertTrue(testSuiteHelper.fireEvent(6), "Event fired: ");
//			testSuiteHelper.runInCrawlingPlugins(7);
//			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 7");
//
//			testSuiteHelper.addStateToReportBuilder(7);
//
//			if (assertionMode != StateEquivalenceAssertionMode.NONE){
//
//				if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(7)
//										&& allStatesIdentical;
//				}
//
//				if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    /* Perform a visual diff on the two states. */
//				    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(7)
//						&& allStatesIdentical;
//				}
//				if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
//					allStatesIdentical = testSuiteHelper.fragDiffBool(7)
//						&& allStatesIdentical;
//				}
//			}
//
//		} catch (Exception e) {
//			Assert.fail(e.getMessage());
//		}
//		if(!allStatesIdentical) {
//			Assert.fail("At least one state is different.");
//		}
//	}
//
//	@Test(priority=26)
//	public void method_BT103_path_22_1000025_100060(){
//		testSuiteHelper.newCurrentTestMethod("method_BT103_path_22_1000025_100060", 26);
//		List<FormInput> formInputs;
//
//		boolean allStatesIdentical = true;
//
//		testSuiteHelper.addStateToReportBuilder(8);
//
//		if (assertionMode != StateEquivalenceAssertionMode.NONE){
//			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(8)
//										&& allStatesIdentical;
//			}
//
//			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(8)
//					&& allStatesIdentical;
//			}
//			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
//				allStatesIdentical = testSuiteHelper.fragDiffBool(8)
//					&& allStatesIdentical;
//			}
//		}
//		try {
//			/* Label - index delete entry */
//			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/TABLE[1]/TBODY[1]/TR[1]/TD[4]/A[5], element=Element{node=null, tag=A, text=, attributes={anyaccess=none, href=/ppma/index.php?r=entry/delete&id=1, title=Delete, class=delete}}, source=8, target=2} */
//			formInputs = new ArrayList<FormInput>();
//			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "Entry_name"), "Random Website"));
//			testSuiteHelper.handleFormInputs(formInputs);
//			Thread.sleep(100);
//			Assert.assertTrue(testSuiteHelper.fireEvent(22), "Event fired: ");
//			testSuiteHelper.runInCrawlingPlugins(2);
//			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 2");
//
//			testSuiteHelper.addStateToReportBuilder(2);
//
//			if (assertionMode != StateEquivalenceAssertionMode.NONE){
//
//				if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(2)
//										&& allStatesIdentical;
//				}
//
//				if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    /* Perform a visual diff on the two states. */
//				    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(2)
//						&& allStatesIdentical;
//				}
//				if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
//					allStatesIdentical = testSuiteHelper.fragDiffBool(2)
//						&& allStatesIdentical;
//				}
//			}
//
//			/* Label - none */
//			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/NAV[1]/SECTION[1]/UL[1]/LI[2]/A[1], element=Element{node=null, tag=A, text=Tags, attributes={href=/ppma/index.php?r=tag/index}}, source=2, target=103} */
//			formInputs = new ArrayList<FormInput>();
//			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "Entry_name"), "Random Website"));
//			testSuiteHelper.handleFormInputs(formInputs);
//			Thread.sleep(100);
//			Assert.assertTrue(testSuiteHelper.fireEvent(1000025), "Event fired: Tags");
//			testSuiteHelper.runInCrawlingPlugins(103);
//			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 103");
//
//			testSuiteHelper.addStateToReportBuilder(103);
//
//			if (assertionMode != StateEquivalenceAssertionMode.NONE){
//
//				if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(103)
//										&& allStatesIdentical;
//				}
//
//				if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    /* Perform a visual diff on the two states. */
//				    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(103)
//						&& allStatesIdentical;
//				}
//				if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
//					allStatesIdentical = testSuiteHelper.fragDiffBool(103)
//						&& allStatesIdentical;
//				}
//			}
//
//			/* Label - update index tag */
//			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/TABLE[1]/TBODY[1]/TR[1]/TD[3]/A[2], element=Element{node=null, tag=A, text=, attributes={anyaccess=action, href=/ppma/index.php?r=tag/update&id=3&returnUrl=%2Fppma%2Findex.php%3Fr%3Dtag%2Findex, title=Update}}, source=103, target=37} */
//			formInputs = new ArrayList<FormInput>();
//			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "Entry_name"), "Random Website"));
//			testSuiteHelper.handleFormInputs(formInputs);
//			Thread.sleep(100);
//			Assert.assertTrue(testSuiteHelper.fireEvent(100060), "Event fired: ");
//			testSuiteHelper.runInCrawlingPlugins(37);
//			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 37");
//
//			testSuiteHelper.addStateToReportBuilder(37);
//
//			if (assertionMode != StateEquivalenceAssertionMode.NONE){
//
//				if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(37)
//										&& allStatesIdentical;
//				}
//
//				if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    /* Perform a visual diff on the two states. */
//				    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(37)
//						&& allStatesIdentical;
//				}
//				if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
//					allStatesIdentical = testSuiteHelper.fragDiffBool(37)
//						&& allStatesIdentical;
//				}
//			}
//
//		} catch (Exception e) {
//			Assert.fail(e.getMessage());
//		}
//		if(!allStatesIdentical) {
//			Assert.fail("At least one state is different.");
//		}
//	}
//
//	@Test(priority=27)
//	public void method_BT10_path_5_6_7_9_100061(){
//		testSuiteHelper.newCurrentTestMethod("method_BT10_path_5_6_7_9_100061", 27);
//		List<FormInput> formInputs;
//
//		boolean allStatesIdentical = true;
//
//		testSuiteHelper.addStateToReportBuilder(2);
//
//		if (assertionMode != StateEquivalenceAssertionMode.NONE){
//			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(2)
//										&& allStatesIdentical;
//			}
//
//			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(2)
//					&& allStatesIdentical;
//			}
//			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
//				allStatesIdentical = testSuiteHelper.fragDiffBool(2)
//					&& allStatesIdentical;
//			}
//		}
//		try {
//			/* Label - index create entry */
//			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/NAV[1]/SECTION[1]/UL[1]/LI[1]/UL[1]/LI[2]/A[1], element=Element{node=null, tag=A, text=Create, attributes={href=/ppma/index.php?r=entry/create}}, source=2, target=6} */
//			formInputs = new ArrayList<FormInput>();
//			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "Entry_name"), "Random Website"));
//			testSuiteHelper.handleFormInputs(formInputs);
//			Thread.sleep(100);
//			Assert.assertTrue(testSuiteHelper.fireEvent(5), "Event fired: Create");
//			testSuiteHelper.runInCrawlingPlugins(6);
//			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 6");
//
//			testSuiteHelper.addStateToReportBuilder(6);
//
//			if (assertionMode != StateEquivalenceAssertionMode.NONE){
//
//				if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(6)
//										&& allStatesIdentical;
//				}
//
//				if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    /* Perform a visual diff on the two states. */
//				    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(6)
//						&& allStatesIdentical;
//				}
//				if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
//					allStatesIdentical = testSuiteHelper.fragDiffBool(6)
//						&& allStatesIdentical;
//				}
//			}
//
//			/* Label - submit button entry save index radius */
//			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/INPUT[7], element=Element{node=null, tag=INPUT, text=, attributes={name=yt0, type=submit, class=button radius, value=Save}}, source=6, target=7} */
//			formInputs = new ArrayList<FormInput>();
//			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/INPUT[2]"), "Random Website"));
//			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/INPUT[3]"), "jdoe"));
//			formInputs.add(new FormInput(FormInput.InputType.PASSWORD, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/INPUT[1]"), "123456"));
//			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/INPUT[4]"), "nrzmfmkJ"));
//			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/INPUT[5]"), "POFeABBy"));
//			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/TEXTAREA[1]"), "jtQbbrpV"));
//			testSuiteHelper.handleFormInputs(formInputs);
//			Thread.sleep(100);
//			Assert.assertTrue(testSuiteHelper.fireEvent(6), "Event fired: ");
//			testSuiteHelper.runInCrawlingPlugins(7);
//			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 7");
//
//			testSuiteHelper.addStateToReportBuilder(7);
//
//			if (assertionMode != StateEquivalenceAssertionMode.NONE){
//
//				if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(7)
//										&& allStatesIdentical;
//				}
//
//				if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    /* Perform a visual diff on the two states. */
//				    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(7)
//						&& allStatesIdentical;
//				}
//				if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
//					allStatesIdentical = testSuiteHelper.fragDiffBool(7)
//						&& allStatesIdentical;
//				}
//			}
//
//			/* Label - index sort entry */
//			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[4]/TABLE[1]/THEAD[1]/TR[1]/TH[1]/A[1], element=Element{node=null, tag=A, text=Name, attributes={anyaccess=none, href=/ppma/index.php?r=entry/index&Entry_sort=name.desc, class=sort-link asc}}, source=7, target=8} */
//			formInputs = new ArrayList<FormInput>();
//			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "Entry_name"), "Random Website"));
//			testSuiteHelper.handleFormInputs(formInputs);
//			Thread.sleep(100);
//			Assert.assertTrue(testSuiteHelper.fireEvent(7), "Event fired: Name");
//			testSuiteHelper.runInCrawlingPlugins(8);
//			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 8");
//
//			testSuiteHelper.addStateToReportBuilder(8);
//
//			if (assertionMode != StateEquivalenceAssertionMode.NONE){
//
//				if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(8)
//										&& allStatesIdentical;
//				}
//
//				if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    /* Perform a visual diff on the two states. */
//				    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(8)
//						&& allStatesIdentical;
//				}
//				if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
//					allStatesIdentical = testSuiteHelper.fragDiffBool(8)
//						&& allStatesIdentical;
//				}
//			}
//
//			/* Label - index update id entry */
//			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/A[1], element=Element{node=null, tag=A, text=Random Website, attributes={data-reveal-id=entry-form-modal, rel=/ppma/index.php?r=entry/getData&id=1&withPassword=1, anyaccess=none, href=/ppma/index.php?r=entry/update&id=1&returnUrl=%2Fppma%2Findex.php%3Fr%3Dentry%2Findex%26Entry_sort%3Dname.desc, class=update-entry}}, source=8, target=10} */
//			formInputs = new ArrayList<FormInput>();
//			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "Entry_name"), "Random Website"));
//			testSuiteHelper.handleFormInputs(formInputs);
//			Thread.sleep(100);
//			Assert.assertTrue(testSuiteHelper.fireEvent(9), "Event fired: Random Website");
//			testSuiteHelper.runInCrawlingPlugins(10);
//			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 10");
//
//			testSuiteHelper.addStateToReportBuilder(10);
//
//			if (assertionMode != StateEquivalenceAssertionMode.NONE){
//
//				if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(10)
//										&& allStatesIdentical;
//				}
//
//				if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    /* Perform a visual diff on the two states. */
//				    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(10)
//						&& allStatesIdentical;
//				}
//				if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
//					allStatesIdentical = testSuiteHelper.fragDiffBool(10)
//						&& allStatesIdentical;
//				}
//			}
//
//			/* Label - none */
//			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/A[1], element=Element{node=null, tag=A, text=Random Website, attributes={data-reveal-id=entry-form-modal, rel=/ppma/index.php?r=entry/getData&id=1&withPassword=1, anyaccess=action, href=/ppma/index.php?r=entry/update&id=1&returnUrl=%2Fppma%2Findex.php%3Fr%3Dentry%2Findex%26Entry_sort%3Dusername, class=update-entry}}, source=10, target=78} */
//			formInputs = new ArrayList<FormInput>();
//			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "Entry_name"), "Random Website"));
//			testSuiteHelper.handleFormInputs(formInputs);
//			Thread.sleep(100);
//			Assert.assertTrue(testSuiteHelper.fireEvent(100061), "Event fired: Random Website");
//			testSuiteHelper.runInCrawlingPlugins(78);
//			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 78");
//
//			testSuiteHelper.addStateToReportBuilder(78);
//
//			if (assertionMode != StateEquivalenceAssertionMode.NONE){
//
//				if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(78)
//										&& allStatesIdentical;
//				}
//
//				if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    /* Perform a visual diff on the two states. */
//				    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(78)
//						&& allStatesIdentical;
//				}
//				if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
//					allStatesIdentical = testSuiteHelper.fragDiffBool(78)
//						&& allStatesIdentical;
//				}
//			}
//
//		} catch (Exception e) {
//			Assert.fail(e.getMessage());
//		}
//		if(!allStatesIdentical) {
//			Assert.fail("At least one state is different.");
//		}
//	}
//
//	@Test(priority=28)
//	public void method_BT103_path_22_1000025_100062_200063(){
//		testSuiteHelper.newCurrentTestMethod("method_BT103_path_22_1000025_100062_200063", 28);
//		List<FormInput> formInputs;
//
//		boolean allStatesIdentical = true;
//
//		testSuiteHelper.addStateToReportBuilder(8);
//
//		if (assertionMode != StateEquivalenceAssertionMode.NONE){
//			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(8)
//										&& allStatesIdentical;
//			}
//
//			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(8)
//					&& allStatesIdentical;
//			}
//			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
//				allStatesIdentical = testSuiteHelper.fragDiffBool(8)
//					&& allStatesIdentical;
//			}
//		}
//		try {
//			/* Label - index delete entry */
//			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/TABLE[1]/TBODY[1]/TR[1]/TD[4]/A[5], element=Element{node=null, tag=A, text=, attributes={anyaccess=none, href=/ppma/index.php?r=entry/delete&id=1, title=Delete, class=delete}}, source=8, target=2} */
//			formInputs = new ArrayList<FormInput>();
//			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "Entry_name"), "Random Website"));
//			testSuiteHelper.handleFormInputs(formInputs);
//			Thread.sleep(100);
//			Assert.assertTrue(testSuiteHelper.fireEvent(22), "Event fired: ");
//			testSuiteHelper.runInCrawlingPlugins(2);
//			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 2");
//
//			testSuiteHelper.addStateToReportBuilder(2);
//
//			if (assertionMode != StateEquivalenceAssertionMode.NONE){
//
//				if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(2)
//										&& allStatesIdentical;
//				}
//
//				if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    /* Perform a visual diff on the two states. */
//				    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(2)
//						&& allStatesIdentical;
//				}
//				if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
//					allStatesIdentical = testSuiteHelper.fragDiffBool(2)
//						&& allStatesIdentical;
//				}
//			}
//
//			/* Label - none */
//			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/NAV[1]/SECTION[1]/UL[1]/LI[2]/A[1], element=Element{node=null, tag=A, text=Tags, attributes={href=/ppma/index.php?r=tag/index}}, source=2, target=103} */
//			formInputs = new ArrayList<FormInput>();
//			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "Entry_name"), "Random Website"));
//			testSuiteHelper.handleFormInputs(formInputs);
//			Thread.sleep(100);
//			Assert.assertTrue(testSuiteHelper.fireEvent(1000025), "Event fired: Tags");
//			testSuiteHelper.runInCrawlingPlugins(103);
//			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 103");
//
//			testSuiteHelper.addStateToReportBuilder(103);
//
//			if (assertionMode != StateEquivalenceAssertionMode.NONE){
//
//				if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(103)
//										&& allStatesIdentical;
//				}
//
//				if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    /* Perform a visual diff on the two states. */
//				    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(103)
//						&& allStatesIdentical;
//				}
//				if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
//					allStatesIdentical = testSuiteHelper.fragDiffBool(103)
//						&& allStatesIdentical;
//				}
//			}
//
//			/* Label - index delete entry tag */
//			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/TABLE[1]/TBODY[1]/TR[1]/TD[3]/A[3], element=Element{node=null, tag=A, text=, attributes={anyaccess=action, href=/ppma/index.php?r=tag/delete&id=3, title=Delete, class=delete}}, source=103, target=34} */
//			formInputs = new ArrayList<FormInput>();
//			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "Entry_name"), "Random Website"));
//			testSuiteHelper.handleFormInputs(formInputs);
//			Thread.sleep(100);
//			Assert.assertTrue(testSuiteHelper.fireEvent(100062), "Event fired: ");
//			testSuiteHelper.runInCrawlingPlugins(34);
//			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 34");
//
//			testSuiteHelper.addStateToReportBuilder(34);
//
//			if (assertionMode != StateEquivalenceAssertionMode.NONE){
//
//				if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(34)
//										&& allStatesIdentical;
//				}
//
//				if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    /* Perform a visual diff on the two states. */
//				    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(34)
//						&& allStatesIdentical;
//				}
//				if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
//					allStatesIdentical = testSuiteHelper.fragDiffBool(34)
//						&& allStatesIdentical;
//				}
//			}
//
//			/* Label - index none entry tag */
//			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/TABLE[1]/TBODY[1]/TR[2]/TD[3]/A[1], element=Element{node=null, tag=A, text=, attributes={anyaccess=none, href=/ppma/index.php?r=entry/index&Entry%5BtagList%5D=POFeABBy, title=View}}, source=34, target=2} */
//			formInputs = new ArrayList<FormInput>();
//			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "Entry_name"), "Random Website"));
//			testSuiteHelper.handleFormInputs(formInputs);
//			Thread.sleep(100);
//			Assert.assertTrue(testSuiteHelper.fireEvent(200063), "Event fired: ");
//			testSuiteHelper.runInCrawlingPlugins(2);
//			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 2");
//
//			testSuiteHelper.addStateToReportBuilder(2);
//
//			if (assertionMode != StateEquivalenceAssertionMode.NONE){
//
//				if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(2)
//										&& allStatesIdentical;
//				}
//
//				if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    /* Perform a visual diff on the two states. */
//				    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(2)
//						&& allStatesIdentical;
//				}
//				if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
//					allStatesIdentical = testSuiteHelper.fragDiffBool(2)
//						&& allStatesIdentical;
//				}
//			}
//
//		} catch (Exception e) {
//			Assert.fail(e.getMessage());
//		}
//		if(!allStatesIdentical) {
//			Assert.fail("At least one state is different.");
//		}
//	}
//
//	@Test(priority=29)
//	public void method_BT7_path_5_6_100065_100066(){
//		testSuiteHelper.newCurrentTestMethod("method_BT7_path_5_6_100065_100066", 29);
//		List<FormInput> formInputs;
//
//		boolean allStatesIdentical = true;
//
//		testSuiteHelper.addStateToReportBuilder(2);
//
//		if (assertionMode != StateEquivalenceAssertionMode.NONE){
//			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(2)
//										&& allStatesIdentical;
//			}
//
//			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(2)
//					&& allStatesIdentical;
//			}
//			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
//				allStatesIdentical = testSuiteHelper.fragDiffBool(2)
//					&& allStatesIdentical;
//			}
//		}
//		try {
//			/* Label - index create entry */
//			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/NAV[1]/SECTION[1]/UL[1]/LI[1]/UL[1]/LI[2]/A[1], element=Element{node=null, tag=A, text=Create, attributes={href=/ppma/index.php?r=entry/create}}, source=2, target=6} */
//			formInputs = new ArrayList<FormInput>();
//			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "Entry_name"), "Random Website"));
//			testSuiteHelper.handleFormInputs(formInputs);
//			Thread.sleep(100);
//			Assert.assertTrue(testSuiteHelper.fireEvent(5), "Event fired: Create");
//			testSuiteHelper.runInCrawlingPlugins(6);
//			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 6");
//
//			testSuiteHelper.addStateToReportBuilder(6);
//
//			if (assertionMode != StateEquivalenceAssertionMode.NONE){
//
//				if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(6)
//										&& allStatesIdentical;
//				}
//
//				if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    /* Perform a visual diff on the two states. */
//				    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(6)
//						&& allStatesIdentical;
//				}
//				if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
//					allStatesIdentical = testSuiteHelper.fragDiffBool(6)
//						&& allStatesIdentical;
//				}
//			}
//
//			/* Label - submit button entry save index radius */
//			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/INPUT[7], element=Element{node=null, tag=INPUT, text=, attributes={name=yt0, type=submit, class=button radius, value=Save}}, source=6, target=7} */
//			formInputs = new ArrayList<FormInput>();
//			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/INPUT[2]"), "Random Website"));
//			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/INPUT[3]"), "jdoe"));
//			formInputs.add(new FormInput(FormInput.InputType.PASSWORD, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/INPUT[1]"), "123456"));
//			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/INPUT[4]"), "nrzmfmkJ"));
//			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/INPUT[5]"), "POFeABBy"));
//			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/TEXTAREA[1]"), "jtQbbrpV"));
//			testSuiteHelper.handleFormInputs(formInputs);
//			Thread.sleep(100);
//			Assert.assertTrue(testSuiteHelper.fireEvent(6), "Event fired: ");
//			testSuiteHelper.runInCrawlingPlugins(7);
//			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 7");
//
//			testSuiteHelper.addStateToReportBuilder(7);
//
//			if (assertionMode != StateEquivalenceAssertionMode.NONE){
//
//				if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(7)
//										&& allStatesIdentical;
//				}
//
//				if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    /* Perform a visual diff on the two states. */
//				    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(7)
//						&& allStatesIdentical;
//				}
//				if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
//					allStatesIdentical = testSuiteHelper.fragDiffBool(7)
//						&& allStatesIdentical;
//				}
//			}
//
//			/* Label - none */
//			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[4]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/A[1], element=Element{node=null, tag=A, text=Random Website, attributes={data-reveal-id=entry-form-modal, rel=/ppma/index.php?r=entry/getData&id=1&withPassword=1, href=/ppma/index.php?r=entry/update&id=1&returnUrl=%2Fppma%2Findex.php%3Fr%3Dentry%2Findex, class=update-entry}}, source=7, target=135} */
//			formInputs = new ArrayList<FormInput>();
//			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "Entry_name"), "Random Website"));
//			testSuiteHelper.handleFormInputs(formInputs);
//			Thread.sleep(100);
//			Assert.assertTrue(testSuiteHelper.fireEvent(100065), "Event fired: Random Website");
//			testSuiteHelper.runInCrawlingPlugins(135);
//			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 135");
//
//			testSuiteHelper.addStateToReportBuilder(135);
//
//			if (assertionMode != StateEquivalenceAssertionMode.NONE){
//
//				if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(135)
//										&& allStatesIdentical;
//				}
//
//				if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    /* Perform a visual diff on the two states. */
//				    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(135)
//						&& allStatesIdentical;
//				}
//				if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
//					allStatesIdentical = testSuiteHelper.fragDiffBool(135)
//						&& allStatesIdentical;
//				}
//			}
//
//			/* Label - none */
//			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1], element=Element{node=null, tag=A, text=×, attributes={anyaccess=action, href=, class=close}}, source=135, target=8} */
//			formInputs = new ArrayList<FormInput>();
//			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "Entry_name"), "Random Website"));
//			testSuiteHelper.handleFormInputs(formInputs);
//			Thread.sleep(100);
//			Assert.assertTrue(testSuiteHelper.fireEvent(100066), "Event fired: ×");
//			testSuiteHelper.runInCrawlingPlugins(8);
//			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 8");
//
//			testSuiteHelper.addStateToReportBuilder(8);
//
//			if (assertionMode != StateEquivalenceAssertionMode.NONE){
//
//				if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(8)
//										&& allStatesIdentical;
//				}
//
//				if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    /* Perform a visual diff on the two states. */
//				    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(8)
//						&& allStatesIdentical;
//				}
//				if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
//					allStatesIdentical = testSuiteHelper.fragDiffBool(8)
//						&& allStatesIdentical;
//				}
//			}
//
//		} catch (Exception e) {
//			Assert.fail(e.getMessage());
//		}
//		if(!allStatesIdentical) {
//			Assert.fail("At least one state is different.");
//		}
//	}
//
//	@Test(priority=30)
//	public void method_BT103_failed_path_22_25(){
//		testSuiteHelper.newCurrentTestMethod("method_BT103_failed_path_22_25", 30);
//		List<FormInput> formInputs;
//
//		boolean allStatesIdentical = true;
//
//		testSuiteHelper.addStateToReportBuilder(8);
//
//		if (assertionMode != StateEquivalenceAssertionMode.NONE){
//			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(8)
//										&& allStatesIdentical;
//			}
//
//			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(8)
//					&& allStatesIdentical;
//			}
//			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
//				allStatesIdentical = testSuiteHelper.fragDiffBool(8)
//					&& allStatesIdentical;
//			}
//		}
//		try {
//			/* Label - index delete entry */
//			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/TABLE[1]/TBODY[1]/TR[1]/TD[4]/A[5], element=Element{node=null, tag=A, text=, attributes={anyaccess=none, href=/ppma/index.php?r=entry/delete&id=1, title=Delete, class=delete}}, source=8, target=2} */
//			formInputs = new ArrayList<FormInput>();
//			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "Entry_name"), "Random Website"));
//			testSuiteHelper.handleFormInputs(formInputs);
//			Thread.sleep(100);
//			Assert.assertTrue(testSuiteHelper.fireEvent(22), "Event fired: ");
//			testSuiteHelper.runInCrawlingPlugins(2);
//			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 2");
//
//			testSuiteHelper.addStateToReportBuilder(2);
//
//			if (assertionMode != StateEquivalenceAssertionMode.NONE){
//
//				if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(2)
//										&& allStatesIdentical;
//				}
//
//				if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    /* Perform a visual diff on the two states. */
//				    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(2)
//						&& allStatesIdentical;
//				}
//				if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
//					allStatesIdentical = testSuiteHelper.fragDiffBool(2)
//						&& allStatesIdentical;
//				}
//			}
//
//			/* Label - index tag */
//			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/NAV[1]/SECTION[1]/UL[1]/LI[2]/A[1], element=Element{node=null, tag=A, text=Tags, attributes={href=/ppma/index.php?r=tag/index}}, source=2, target=34} */
//			formInputs = new ArrayList<FormInput>();
//			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "Entry_name"), "Random Website"));
//			testSuiteHelper.handleFormInputs(formInputs);
//			Thread.sleep(100);
//			Assert.assertTrue(testSuiteHelper.fireEvent(25), "Event fired: Tags");
//			testSuiteHelper.runInCrawlingPlugins(34);
//			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 34");
//
//			testSuiteHelper.addStateToReportBuilder(34);
//
//			if (assertionMode != StateEquivalenceAssertionMode.NONE){
//
//				if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(34)
//										&& allStatesIdentical;
//				}
//
//				if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    /* Perform a visual diff on the two states. */
//				    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(34)
//						&& allStatesIdentical;
//				}
//				if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
//					allStatesIdentical = testSuiteHelper.fragDiffBool(34)
//						&& allStatesIdentical;
//				}
//			}
//
//		} catch (Exception e) {
//			Assert.fail(e.getMessage());
//		}
//		if(!allStatesIdentical) {
//			Assert.fail("At least one state is different.");
//		}
//	}
//
//	@Test(priority=31)
//	public void method_BT10_path_5_6_7_9_100067(){
//		testSuiteHelper.newCurrentTestMethod("method_BT10_path_5_6_7_9_100067", 31);
//		List<FormInput> formInputs;
//
//		boolean allStatesIdentical = true;
//
//		testSuiteHelper.addStateToReportBuilder(2);
//
//		if (assertionMode != StateEquivalenceAssertionMode.NONE){
//			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(2)
//										&& allStatesIdentical;
//			}
//
//			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(2)
//					&& allStatesIdentical;
//			}
//			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
//				allStatesIdentical = testSuiteHelper.fragDiffBool(2)
//					&& allStatesIdentical;
//			}
//		}
//		try {
//			/* Label - index create entry */
//			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/NAV[1]/SECTION[1]/UL[1]/LI[1]/UL[1]/LI[2]/A[1], element=Element{node=null, tag=A, text=Create, attributes={href=/ppma/index.php?r=entry/create}}, source=2, target=6} */
//			formInputs = new ArrayList<FormInput>();
//			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "Entry_name"), "Random Website"));
//			testSuiteHelper.handleFormInputs(formInputs);
//			Thread.sleep(100);
//			Assert.assertTrue(testSuiteHelper.fireEvent(5), "Event fired: Create");
//			testSuiteHelper.runInCrawlingPlugins(6);
//			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 6");
//
//			testSuiteHelper.addStateToReportBuilder(6);
//
//			if (assertionMode != StateEquivalenceAssertionMode.NONE){
//
//				if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(6)
//										&& allStatesIdentical;
//				}
//
//				if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    /* Perform a visual diff on the two states. */
//				    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(6)
//						&& allStatesIdentical;
//				}
//				if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
//					allStatesIdentical = testSuiteHelper.fragDiffBool(6)
//						&& allStatesIdentical;
//				}
//			}
//
//			/* Label - submit button entry save index radius */
//			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/INPUT[7], element=Element{node=null, tag=INPUT, text=, attributes={name=yt0, type=submit, class=button radius, value=Save}}, source=6, target=7} */
//			formInputs = new ArrayList<FormInput>();
//			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/INPUT[2]"), "Random Website"));
//			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/INPUT[3]"), "jdoe"));
//			formInputs.add(new FormInput(FormInput.InputType.PASSWORD, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/INPUT[1]"), "123456"));
//			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/INPUT[4]"), "nrzmfmkJ"));
//			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/INPUT[5]"), "POFeABBy"));
//			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/TEXTAREA[1]"), "jtQbbrpV"));
//			testSuiteHelper.handleFormInputs(formInputs);
//			Thread.sleep(100);
//			Assert.assertTrue(testSuiteHelper.fireEvent(6), "Event fired: ");
//			testSuiteHelper.runInCrawlingPlugins(7);
//			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 7");
//
//			testSuiteHelper.addStateToReportBuilder(7);
//
//			if (assertionMode != StateEquivalenceAssertionMode.NONE){
//
//				if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(7)
//										&& allStatesIdentical;
//				}
//
//				if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    /* Perform a visual diff on the two states. */
//				    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(7)
//						&& allStatesIdentical;
//				}
//				if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
//					allStatesIdentical = testSuiteHelper.fragDiffBool(7)
//						&& allStatesIdentical;
//				}
//			}
//
//			/* Label - index sort entry */
//			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[4]/TABLE[1]/THEAD[1]/TR[1]/TH[1]/A[1], element=Element{node=null, tag=A, text=Name, attributes={anyaccess=none, href=/ppma/index.php?r=entry/index&Entry_sort=name.desc, class=sort-link asc}}, source=7, target=8} */
//			formInputs = new ArrayList<FormInput>();
//			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "Entry_name"), "Random Website"));
//			testSuiteHelper.handleFormInputs(formInputs);
//			Thread.sleep(100);
//			Assert.assertTrue(testSuiteHelper.fireEvent(7), "Event fired: Name");
//			testSuiteHelper.runInCrawlingPlugins(8);
//			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 8");
//
//			testSuiteHelper.addStateToReportBuilder(8);
//
//			if (assertionMode != StateEquivalenceAssertionMode.NONE){
//
//				if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(8)
//										&& allStatesIdentical;
//				}
//
//				if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    /* Perform a visual diff on the two states. */
//				    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(8)
//						&& allStatesIdentical;
//				}
//				if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
//					allStatesIdentical = testSuiteHelper.fragDiffBool(8)
//						&& allStatesIdentical;
//				}
//			}
//
//			/* Label - index update id entry */
//			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/A[1], element=Element{node=null, tag=A, text=Random Website, attributes={data-reveal-id=entry-form-modal, rel=/ppma/index.php?r=entry/getData&id=1&withPassword=1, anyaccess=none, href=/ppma/index.php?r=entry/update&id=1&returnUrl=%2Fppma%2Findex.php%3Fr%3Dentry%2Findex%26Entry_sort%3Dname.desc, class=update-entry}}, source=8, target=10} */
//			formInputs = new ArrayList<FormInput>();
//			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "Entry_name"), "Random Website"));
//			testSuiteHelper.handleFormInputs(formInputs);
//			Thread.sleep(100);
//			Assert.assertTrue(testSuiteHelper.fireEvent(9), "Event fired: Random Website");
//			testSuiteHelper.runInCrawlingPlugins(10);
//			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 10");
//
//			testSuiteHelper.addStateToReportBuilder(10);
//
//			if (assertionMode != StateEquivalenceAssertionMode.NONE){
//
//				if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(10)
//										&& allStatesIdentical;
//				}
//
//				if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    /* Perform a visual diff on the two states. */
//				    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(10)
//						&& allStatesIdentical;
//				}
//				if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
//					allStatesIdentical = testSuiteHelper.fragDiffBool(10)
//						&& allStatesIdentical;
//				}
//			}
//
//			/* Label - none */
//			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/TABLE[1]/TBODY[1]/TR[1]/TD[3]/A[1], element=Element{node=null, tag=A, text=POFeABBy, attributes={anyaccess=none, href=/ppma/index.php?r=entry/index&Entry%5BtagList%5D=POFeABBy}}, source=10, target=8} */
//			formInputs = new ArrayList<FormInput>();
//			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "Entry_name"), "Random Website"));
//			testSuiteHelper.handleFormInputs(formInputs);
//			Thread.sleep(100);
//			Assert.assertTrue(testSuiteHelper.fireEvent(100067), "Event fired: POFeABBy");
//			testSuiteHelper.runInCrawlingPlugins(8);
//			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 8");
//
//			testSuiteHelper.addStateToReportBuilder(8);
//
//			if (assertionMode != StateEquivalenceAssertionMode.NONE){
//
//				if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(8)
//										&& allStatesIdentical;
//				}
//
//				if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    /* Perform a visual diff on the two states. */
//				    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(8)
//						&& allStatesIdentical;
//				}
//				if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
//					allStatesIdentical = testSuiteHelper.fragDiffBool(8)
//						&& allStatesIdentical;
//				}
//			}
//
//		} catch (Exception e) {
//			Assert.fail(e.getMessage());
//		}
//		if(!allStatesIdentical) {
//			Assert.fail("At least one state is different.");
//		}
//	}
//
//	@Test(priority=32)
//	public void method_BT135_path_9_100055_100065_100069(){
//		testSuiteHelper.newCurrentTestMethod("method_BT135_path_9_100055_100065_100069", 32);
//		List<FormInput> formInputs;
//
//		boolean allStatesIdentical = true;
//
//		testSuiteHelper.addStateToReportBuilder(8);
//
//		if (assertionMode != StateEquivalenceAssertionMode.NONE){
//			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(8)
//										&& allStatesIdentical;
//			}
//
//			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(8)
//					&& allStatesIdentical;
//			}
//			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
//				allStatesIdentical = testSuiteHelper.fragDiffBool(8)
//					&& allStatesIdentical;
//			}
//		}
//		try {
//			/* Label - index update id entry */
//			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/A[1], element=Element{node=null, tag=A, text=Random Website, attributes={data-reveal-id=entry-form-modal, rel=/ppma/index.php?r=entry/getData&id=1&withPassword=1, anyaccess=none, href=/ppma/index.php?r=entry/update&id=1&returnUrl=%2Fppma%2Findex.php%3Fr%3Dentry%2Findex%26Entry_sort%3Dname.desc, class=update-entry}}, source=8, target=10} */
//			formInputs = new ArrayList<FormInput>();
//			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "Entry_name"), "Random Website"));
//			testSuiteHelper.handleFormInputs(formInputs);
//			Thread.sleep(100);
//			Assert.assertTrue(testSuiteHelper.fireEvent(9), "Event fired: Random Website");
//			testSuiteHelper.runInCrawlingPlugins(10);
//			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 10");
//
//			testSuiteHelper.addStateToReportBuilder(10);
//
//			if (assertionMode != StateEquivalenceAssertionMode.NONE){
//
//				if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(10)
//										&& allStatesIdentical;
//				}
//
//				if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    /* Perform a visual diff on the two states. */
//				    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(10)
//						&& allStatesIdentical;
//				}
//				if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
//					allStatesIdentical = testSuiteHelper.fragDiffBool(10)
//						&& allStatesIdentical;
//				}
//			}
//
//			/* Label - submit button entry save index radius */
//			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[2]/FORM[1]/INPUT[7], element=Element{node=null, tag=INPUT, text=, attributes={name=yt1, anyaccess=action, type=submit, class=button radius, value=Save}}, source=10, target=7} */
//			formInputs = new ArrayList<FormInput>();
//			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "Entry_name"), "Random Website"));
//			testSuiteHelper.handleFormInputs(formInputs);
//			Thread.sleep(100);
//			Assert.assertTrue(testSuiteHelper.fireEvent(100055), "Event fired: ");
//			testSuiteHelper.runInCrawlingPlugins(7);
//			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 7");
//
//			testSuiteHelper.addStateToReportBuilder(7);
//
//			if (assertionMode != StateEquivalenceAssertionMode.NONE){
//
//				if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(7)
//										&& allStatesIdentical;
//				}
//
//				if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    /* Perform a visual diff on the two states. */
//				    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(7)
//						&& allStatesIdentical;
//				}
//				if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
//					allStatesIdentical = testSuiteHelper.fragDiffBool(7)
//						&& allStatesIdentical;
//				}
//			}
//
//			/* Label - none */
//			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[4]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/A[1], element=Element{node=null, tag=A, text=Random Website, attributes={data-reveal-id=entry-form-modal, rel=/ppma/index.php?r=entry/getData&id=1&withPassword=1, href=/ppma/index.php?r=entry/update&id=1&returnUrl=%2Fppma%2Findex.php%3Fr%3Dentry%2Findex, class=update-entry}}, source=7, target=135} */
//			formInputs = new ArrayList<FormInput>();
//			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "Entry_name"), "Random Website"));
//			testSuiteHelper.handleFormInputs(formInputs);
//			Thread.sleep(100);
//			Assert.assertTrue(testSuiteHelper.fireEvent(100065), "Event fired: Random Website");
//			testSuiteHelper.runInCrawlingPlugins(135);
//			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 135");
//
//			testSuiteHelper.addStateToReportBuilder(135);
//
//			if (assertionMode != StateEquivalenceAssertionMode.NONE){
//
//				if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(135)
//										&& allStatesIdentical;
//				}
//
//				if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    /* Perform a visual diff on the two states. */
//				    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(135)
//						&& allStatesIdentical;
//				}
//				if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
//					allStatesIdentical = testSuiteHelper.fragDiffBool(135)
//						&& allStatesIdentical;
//				}
//			}
//
//			/* Label - none */
//			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[4]/TABLE[1]/TBODY[1]/TR[1]/TD[3]/A[1], element=Element{node=null, tag=A, text=POFeABBy, attributes={anyaccess=action, href=/ppma/index.php?r=entry/index&Entry%5BtagList%5D=POFeABBy}}, source=135, target=8} */
//			formInputs = new ArrayList<FormInput>();
//			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "Entry_name"), "Random Website"));
//			testSuiteHelper.handleFormInputs(formInputs);
//			Thread.sleep(100);
//			Assert.assertTrue(testSuiteHelper.fireEvent(100069), "Event fired: POFeABBy");
//			testSuiteHelper.runInCrawlingPlugins(8);
//			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 8");
//
//			testSuiteHelper.addStateToReportBuilder(8);
//
//			if (assertionMode != StateEquivalenceAssertionMode.NONE){
//
//				if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(8)
//										&& allStatesIdentical;
//				}
//
//				if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    /* Perform a visual diff on the two states. */
//				    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(8)
//						&& allStatesIdentical;
//				}
//				if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
//					allStatesIdentical = testSuiteHelper.fragDiffBool(8)
//						&& allStatesIdentical;
//				}
//			}
//
//		} catch (Exception e) {
//			Assert.fail(e.getMessage());
//		}
//		if(!allStatesIdentical) {
//			Assert.fail("At least one state is different.");
//		}
//	}
//
//	@Test(priority=33)
//	public void method_BT34_path_22_25_200070(){
//		testSuiteHelper.newCurrentTestMethod("method_BT34_path_22_25_200070", 33);
//		List<FormInput> formInputs;
//
//		boolean allStatesIdentical = true;
//
//		testSuiteHelper.addStateToReportBuilder(8);
//
//		if (assertionMode != StateEquivalenceAssertionMode.NONE){
//			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(8)
//										&& allStatesIdentical;
//			}
//
//			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(8)
//					&& allStatesIdentical;
//			}
//			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
//				allStatesIdentical = testSuiteHelper.fragDiffBool(8)
//					&& allStatesIdentical;
//			}
//		}
//		try {
//			/* Label - index delete entry */
//			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/TABLE[1]/TBODY[1]/TR[1]/TD[4]/A[5], element=Element{node=null, tag=A, text=, attributes={anyaccess=none, href=/ppma/index.php?r=entry/delete&id=1, title=Delete, class=delete}}, source=8, target=2} */
//			formInputs = new ArrayList<FormInput>();
//			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "Entry_name"), "Random Website"));
//			testSuiteHelper.handleFormInputs(formInputs);
//			Thread.sleep(100);
//			Assert.assertTrue(testSuiteHelper.fireEvent(22), "Event fired: ");
//			testSuiteHelper.runInCrawlingPlugins(2);
//			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 2");
//
//			testSuiteHelper.addStateToReportBuilder(2);
//
//			if (assertionMode != StateEquivalenceAssertionMode.NONE){
//
//				if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(2)
//										&& allStatesIdentical;
//				}
//
//				if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    /* Perform a visual diff on the two states. */
//				    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(2)
//						&& allStatesIdentical;
//				}
//				if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
//					allStatesIdentical = testSuiteHelper.fragDiffBool(2)
//						&& allStatesIdentical;
//				}
//			}
//
//			/* Label - index tag */
//			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/NAV[1]/SECTION[1]/UL[1]/LI[2]/A[1], element=Element{node=null, tag=A, text=Tags, attributes={href=/ppma/index.php?r=tag/index}}, source=2, target=34} */
//			formInputs = new ArrayList<FormInput>();
//			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "Entry_name"), "Random Website"));
//			testSuiteHelper.handleFormInputs(formInputs);
//			Thread.sleep(100);
//			Assert.assertTrue(testSuiteHelper.fireEvent(25), "Event fired: Tags");
//			testSuiteHelper.runInCrawlingPlugins(34);
//			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 34");
//
//			testSuiteHelper.addStateToReportBuilder(34);
//
//			if (assertionMode != StateEquivalenceAssertionMode.NONE){
//
//				if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(34)
//										&& allStatesIdentical;
//				}
//
//				if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    /* Perform a visual diff on the two states. */
//				    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(34)
//						&& allStatesIdentical;
//				}
//				if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
//					allStatesIdentical = testSuiteHelper.fragDiffBool(34)
//						&& allStatesIdentical;
//				}
//			}
//
//			/* Label - update index tag */
//			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/TABLE[1]/TBODY[1]/TR[2]/TD[3]/A[2], element=Element{node=null, tag=A, text=, attributes={anyaccess=none, href=/ppma/index.php?r=tag/update&id=1&returnUrl=%2Fppma%2Findex.php%3Fr%3Dtag%2Findex, title=Update}}, source=34, target=37} */
//			formInputs = new ArrayList<FormInput>();
//			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "Entry_name"), "Random Website"));
//			testSuiteHelper.handleFormInputs(formInputs);
//			Thread.sleep(100);
//			Assert.assertTrue(testSuiteHelper.fireEvent(200070), "Event fired: ");
//			testSuiteHelper.runInCrawlingPlugins(37);
//			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 37");
//
//			testSuiteHelper.addStateToReportBuilder(37);
//
//			if (assertionMode != StateEquivalenceAssertionMode.NONE){
//
//				if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(37)
//										&& allStatesIdentical;
//				}
//
//				if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    /* Perform a visual diff on the two states. */
//				    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(37)
//						&& allStatesIdentical;
//				}
//				if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
//					allStatesIdentical = testSuiteHelper.fragDiffBool(37)
//						&& allStatesIdentical;
//				}
//			}
//
//		} catch (Exception e) {
//			Assert.fail(e.getMessage());
//		}
//		if(!allStatesIdentical) {
//			Assert.fail("At least one state is different.");
//		}
//	}
//
//	@Test(priority=34)
//	public void method_BT7_path_5_6_100071(){
//		testSuiteHelper.newCurrentTestMethod("method_BT7_path_5_6_100071", 34);
//		List<FormInput> formInputs;
//
//		boolean allStatesIdentical = true;
//
//		testSuiteHelper.addStateToReportBuilder(2);
//
//		if (assertionMode != StateEquivalenceAssertionMode.NONE){
//			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(2)
//										&& allStatesIdentical;
//			}
//
//			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(2)
//					&& allStatesIdentical;
//			}
//			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
//				allStatesIdentical = testSuiteHelper.fragDiffBool(2)
//					&& allStatesIdentical;
//			}
//		}
//		try {
//			/* Label - index create entry */
//			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/NAV[1]/SECTION[1]/UL[1]/LI[1]/UL[1]/LI[2]/A[1], element=Element{node=null, tag=A, text=Create, attributes={href=/ppma/index.php?r=entry/create}}, source=2, target=6} */
//			formInputs = new ArrayList<FormInput>();
//			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "Entry_name"), "Random Website"));
//			testSuiteHelper.handleFormInputs(formInputs);
//			Thread.sleep(100);
//			Assert.assertTrue(testSuiteHelper.fireEvent(5), "Event fired: Create");
//			testSuiteHelper.runInCrawlingPlugins(6);
//			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 6");
//
//			testSuiteHelper.addStateToReportBuilder(6);
//
//			if (assertionMode != StateEquivalenceAssertionMode.NONE){
//
//				if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(6)
//										&& allStatesIdentical;
//				}
//
//				if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    /* Perform a visual diff on the two states. */
//				    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(6)
//						&& allStatesIdentical;
//				}
//				if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
//					allStatesIdentical = testSuiteHelper.fragDiffBool(6)
//						&& allStatesIdentical;
//				}
//			}
//
//			/* Label - submit button entry save index radius */
//			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/INPUT[7], element=Element{node=null, tag=INPUT, text=, attributes={name=yt0, type=submit, class=button radius, value=Save}}, source=6, target=7} */
//			formInputs = new ArrayList<FormInput>();
//			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/INPUT[2]"), "Random Website"));
//			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/INPUT[3]"), "jdoe"));
//			formInputs.add(new FormInput(FormInput.InputType.PASSWORD, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/INPUT[1]"), "123456"));
//			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/INPUT[4]"), "nrzmfmkJ"));
//			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/INPUT[5]"), "POFeABBy"));
//			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/TEXTAREA[1]"), "jtQbbrpV"));
//			testSuiteHelper.handleFormInputs(formInputs);
//			Thread.sleep(100);
//			Assert.assertTrue(testSuiteHelper.fireEvent(6), "Event fired: ");
//			testSuiteHelper.runInCrawlingPlugins(7);
//			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 7");
//
//			testSuiteHelper.addStateToReportBuilder(7);
//
//			if (assertionMode != StateEquivalenceAssertionMode.NONE){
//
//				if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(7)
//										&& allStatesIdentical;
//				}
//
//				if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    /* Perform a visual diff on the two states. */
//				    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(7)
//						&& allStatesIdentical;
//				}
//				if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
//					allStatesIdentical = testSuiteHelper.fragDiffBool(7)
//						&& allStatesIdentical;
//				}
//			}
//
//			/* Label - none */
//			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[4]/TABLE[1]/TBODY[1]/TR[1]/TD[3]/A[1], element=Element{node=null, tag=A, text=POFeABBy, attributes={href=/ppma/index.php?r=entry/index&Entry%5BtagList%5D=POFeABBy}}, source=7, target=8} */
//			formInputs = new ArrayList<FormInput>();
//			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "Entry_name"), "Random Website"));
//			testSuiteHelper.handleFormInputs(formInputs);
//			Thread.sleep(100);
//			Assert.assertTrue(testSuiteHelper.fireEvent(100071), "Event fired: POFeABBy");
//			testSuiteHelper.runInCrawlingPlugins(8);
//			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 8");
//
//			testSuiteHelper.addStateToReportBuilder(8);
//
//			if (assertionMode != StateEquivalenceAssertionMode.NONE){
//
//				if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(8)
//										&& allStatesIdentical;
//				}
//
//				if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    /* Perform a visual diff on the two states. */
//				    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(8)
//						&& allStatesIdentical;
//				}
//				if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
//					allStatesIdentical = testSuiteHelper.fragDiffBool(8)
//						&& allStatesIdentical;
//				}
//			}
//
//		} catch (Exception e) {
//			Assert.fail(e.getMessage());
//		}
//		if(!allStatesIdentical) {
//			Assert.fail("At least one state is different.");
//		}
//	}
//
//	@Test(priority=35)
//	public void method_BT135_path_9_100055_100065_100073(){
//		testSuiteHelper.newCurrentTestMethod("method_BT135_path_9_100055_100065_100073", 35);
//		List<FormInput> formInputs;
//
//		boolean allStatesIdentical = true;
//
//		testSuiteHelper.addStateToReportBuilder(8);
//
//		if (assertionMode != StateEquivalenceAssertionMode.NONE){
//			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(8)
//										&& allStatesIdentical;
//			}
//
//			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(8)
//					&& allStatesIdentical;
//			}
//			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
//				allStatesIdentical = testSuiteHelper.fragDiffBool(8)
//					&& allStatesIdentical;
//			}
//		}
//		try {
//			/* Label - index update id entry */
//			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/A[1], element=Element{node=null, tag=A, text=Random Website, attributes={data-reveal-id=entry-form-modal, rel=/ppma/index.php?r=entry/getData&id=1&withPassword=1, anyaccess=none, href=/ppma/index.php?r=entry/update&id=1&returnUrl=%2Fppma%2Findex.php%3Fr%3Dentry%2Findex%26Entry_sort%3Dname.desc, class=update-entry}}, source=8, target=10} */
//			formInputs = new ArrayList<FormInput>();
//			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "Entry_name"), "Random Website"));
//			testSuiteHelper.handleFormInputs(formInputs);
//			Thread.sleep(100);
//			Assert.assertTrue(testSuiteHelper.fireEvent(9), "Event fired: Random Website");
//			testSuiteHelper.runInCrawlingPlugins(10);
//			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 10");
//
//			testSuiteHelper.addStateToReportBuilder(10);
//
//			if (assertionMode != StateEquivalenceAssertionMode.NONE){
//
//				if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(10)
//										&& allStatesIdentical;
//				}
//
//				if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    /* Perform a visual diff on the two states. */
//				    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(10)
//						&& allStatesIdentical;
//				}
//				if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
//					allStatesIdentical = testSuiteHelper.fragDiffBool(10)
//						&& allStatesIdentical;
//				}
//			}
//
//			/* Label - submit button entry save index radius */
//			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[2]/FORM[1]/INPUT[7], element=Element{node=null, tag=INPUT, text=, attributes={name=yt1, anyaccess=action, type=submit, class=button radius, value=Save}}, source=10, target=7} */
//			formInputs = new ArrayList<FormInput>();
//			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "Entry_name"), "Random Website"));
//			testSuiteHelper.handleFormInputs(formInputs);
//			Thread.sleep(100);
//			Assert.assertTrue(testSuiteHelper.fireEvent(100055), "Event fired: ");
//			testSuiteHelper.runInCrawlingPlugins(7);
//			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 7");
//
//			testSuiteHelper.addStateToReportBuilder(7);
//
//			if (assertionMode != StateEquivalenceAssertionMode.NONE){
//
//				if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(7)
//										&& allStatesIdentical;
//				}
//
//				if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    /* Perform a visual diff on the two states. */
//				    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(7)
//						&& allStatesIdentical;
//				}
//				if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
//					allStatesIdentical = testSuiteHelper.fragDiffBool(7)
//						&& allStatesIdentical;
//				}
//			}
//
//			/* Label - none */
//			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[4]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/A[1], element=Element{node=null, tag=A, text=Random Website, attributes={data-reveal-id=entry-form-modal, rel=/ppma/index.php?r=entry/getData&id=1&withPassword=1, href=/ppma/index.php?r=entry/update&id=1&returnUrl=%2Fppma%2Findex.php%3Fr%3Dentry%2Findex, class=update-entry}}, source=7, target=135} */
//			formInputs = new ArrayList<FormInput>();
//			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "Entry_name"), "Random Website"));
//			testSuiteHelper.handleFormInputs(formInputs);
//			Thread.sleep(100);
//			Assert.assertTrue(testSuiteHelper.fireEvent(100065), "Event fired: Random Website");
//			testSuiteHelper.runInCrawlingPlugins(135);
//			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 135");
//
//			testSuiteHelper.addStateToReportBuilder(135);
//
//			if (assertionMode != StateEquivalenceAssertionMode.NONE){
//
//				if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(135)
//										&& allStatesIdentical;
//				}
//
//				if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    /* Perform a visual diff on the two states. */
//				    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(135)
//						&& allStatesIdentical;
//				}
//				if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
//					allStatesIdentical = testSuiteHelper.fragDiffBool(135)
//						&& allStatesIdentical;
//				}
//			}
//
//			/* Label - none */
//			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[4]/TABLE[1]/TBODY[1]/TR[1]/TD[4]/A[4], element=Element{node=null, tag=A, text=, attributes={data-reveal-id=entry-form-modal, rel=/ppma/index.php?r=entry/getData&id=7&withPassword=1, anyaccess=action, href=/ppma/index.php?r=entry/update&id=7&returnUrl=%2Fppma%2Findex.php%3Fr%3Dentry%2Findex, title=Update, class=update-entry}}, source=135, target=78} */
//			formInputs = new ArrayList<FormInput>();
//			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "Entry_name"), "Random Website"));
//			testSuiteHelper.handleFormInputs(formInputs);
//			Thread.sleep(100);
//			Assert.assertTrue(testSuiteHelper.fireEvent(100073), "Event fired: ");
//			testSuiteHelper.runInCrawlingPlugins(78);
//			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 78");
//
//			testSuiteHelper.addStateToReportBuilder(78);
//
//			if (assertionMode != StateEquivalenceAssertionMode.NONE){
//
//				if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(78)
//										&& allStatesIdentical;
//				}
//
//				if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    /* Perform a visual diff on the two states. */
//				    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(78)
//						&& allStatesIdentical;
//				}
//				if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
//					allStatesIdentical = testSuiteHelper.fragDiffBool(78)
//						&& allStatesIdentical;
//				}
//			}
//
//		} catch (Exception e) {
//			Assert.fail(e.getMessage());
//		}
//		if(!allStatesIdentical) {
//			Assert.fail("At least one state is different.");
//		}
//	}
//
//	@Test(priority=36)
//	public void method_BT10_path_9_100075(){
//		testSuiteHelper.newCurrentTestMethod("method_BT10_path_9_100075", 36);
//		List<FormInput> formInputs;
//
//		boolean allStatesIdentical = true;
//
//		testSuiteHelper.addStateToReportBuilder(8);
//
//		if (assertionMode != StateEquivalenceAssertionMode.NONE){
//			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(8)
//										&& allStatesIdentical;
//			}
//
//			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(8)
//					&& allStatesIdentical;
//			}
//			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
//				allStatesIdentical = testSuiteHelper.fragDiffBool(8)
//					&& allStatesIdentical;
//			}
//		}
//		try {
//			/* Label - index update id entry */
//			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/A[1], element=Element{node=null, tag=A, text=Random Website, attributes={data-reveal-id=entry-form-modal, rel=/ppma/index.php?r=entry/getData&id=1&withPassword=1, anyaccess=none, href=/ppma/index.php?r=entry/update&id=1&returnUrl=%2Fppma%2Findex.php%3Fr%3Dentry%2Findex%26Entry_sort%3Dname.desc, class=update-entry}}, source=8, target=10} */
//			formInputs = new ArrayList<FormInput>();
//			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "Entry_name"), "Random Website"));
//			testSuiteHelper.handleFormInputs(formInputs);
//			Thread.sleep(100);
//			Assert.assertTrue(testSuiteHelper.fireEvent(9), "Event fired: Random Website");
//			testSuiteHelper.runInCrawlingPlugins(10);
//			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 10");
//
//			testSuiteHelper.addStateToReportBuilder(10);
//
//			if (assertionMode != StateEquivalenceAssertionMode.NONE){
//
//				if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(10)
//										&& allStatesIdentical;
//				}
//
//				if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    /* Perform a visual diff on the two states. */
//				    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(10)
//						&& allStatesIdentical;
//				}
//				if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
//					allStatesIdentical = testSuiteHelper.fragDiffBool(10)
//						&& allStatesIdentical;
//				}
//			}
//
//			/* Label - none */
//			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/TABLE[1]/TBODY[1]/TR[1]/TD[4]/A[4], element=Element{node=null, tag=A, text=, attributes={data-reveal-id=entry-form-modal, rel=/ppma/index.php?r=entry/getData&id=1&withPassword=1, anyaccess=none, href=/ppma/index.php?r=entry/update&id=1&returnUrl=%2Fppma%2Findex.php%3Fr%3Dentry%2Findex%26Entry_sort%3Dusername, title=Update, class=update-entry}}, source=10, target=78} */
//			formInputs = new ArrayList<FormInput>();
//			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "Entry_name"), "Random Website"));
//			testSuiteHelper.handleFormInputs(formInputs);
//			Thread.sleep(100);
//			Assert.assertTrue(testSuiteHelper.fireEvent(100075), "Event fired: ");
//			testSuiteHelper.runInCrawlingPlugins(78);
//			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 78");
//
//			testSuiteHelper.addStateToReportBuilder(78);
//
//			if (assertionMode != StateEquivalenceAssertionMode.NONE){
//
//				if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(78)
//										&& allStatesIdentical;
//				}
//
//				if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    /* Perform a visual diff on the two states. */
//				    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(78)
//						&& allStatesIdentical;
//				}
//				if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
//					allStatesIdentical = testSuiteHelper.fragDiffBool(78)
//						&& allStatesIdentical;
//				}
//			}
//
//		} catch (Exception e) {
//			Assert.fail(e.getMessage());
//		}
//		if(!allStatesIdentical) {
//			Assert.fail("At least one state is different.");
//		}
//	}
//
//	@Test(priority=37)
//	public void method_BT34_path_22_25_200076(){
//		testSuiteHelper.newCurrentTestMethod("method_BT34_path_22_25_200076", 37);
//		List<FormInput> formInputs;
//
//		boolean allStatesIdentical = true;
//
//		testSuiteHelper.addStateToReportBuilder(8);
//
//		if (assertionMode != StateEquivalenceAssertionMode.NONE){
//			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(8)
//										&& allStatesIdentical;
//			}
//
//			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(8)
//					&& allStatesIdentical;
//			}
//			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
//				allStatesIdentical = testSuiteHelper.fragDiffBool(8)
//					&& allStatesIdentical;
//			}
//		}
//		try {
//			/* Label - index delete entry */
//			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/TABLE[1]/TBODY[1]/TR[1]/TD[4]/A[5], element=Element{node=null, tag=A, text=, attributes={anyaccess=none, href=/ppma/index.php?r=entry/delete&id=1, title=Delete, class=delete}}, source=8, target=2} */
//			formInputs = new ArrayList<FormInput>();
//			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "Entry_name"), "Random Website"));
//			testSuiteHelper.handleFormInputs(formInputs);
//			Thread.sleep(100);
//			Assert.assertTrue(testSuiteHelper.fireEvent(22), "Event fired: ");
//			testSuiteHelper.runInCrawlingPlugins(2);
//			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 2");
//
//			testSuiteHelper.addStateToReportBuilder(2);
//
//			if (assertionMode != StateEquivalenceAssertionMode.NONE){
//
//				if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(2)
//										&& allStatesIdentical;
//				}
//
//				if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    /* Perform a visual diff on the two states. */
//				    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(2)
//						&& allStatesIdentical;
//				}
//				if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
//					allStatesIdentical = testSuiteHelper.fragDiffBool(2)
//						&& allStatesIdentical;
//				}
//			}
//
//			/* Label - index tag */
//			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/NAV[1]/SECTION[1]/UL[1]/LI[2]/A[1], element=Element{node=null, tag=A, text=Tags, attributes={href=/ppma/index.php?r=tag/index}}, source=2, target=34} */
//			formInputs = new ArrayList<FormInput>();
//			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "Entry_name"), "Random Website"));
//			testSuiteHelper.handleFormInputs(formInputs);
//			Thread.sleep(100);
//			Assert.assertTrue(testSuiteHelper.fireEvent(25), "Event fired: Tags");
//			testSuiteHelper.runInCrawlingPlugins(34);
//			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 34");
//
//			testSuiteHelper.addStateToReportBuilder(34);
//
//			if (assertionMode != StateEquivalenceAssertionMode.NONE){
//
//				if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(34)
//										&& allStatesIdentical;
//				}
//
//				if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    /* Perform a visual diff on the two states. */
//				    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(34)
//						&& allStatesIdentical;
//				}
//				if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
//					allStatesIdentical = testSuiteHelper.fragDiffBool(34)
//						&& allStatesIdentical;
//				}
//			}
//
//			/* Label - index delete entry tag */
//			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/TABLE[1]/TBODY[1]/TR[1]/TD[3]/A[3], element=Element{node=null, tag=A, text=, attributes={anyaccess=none, href=/ppma/index.php?r=tag/delete&id=2, title=Delete, class=delete}}, source=34, target=39} */
//			formInputs = new ArrayList<FormInput>();
//			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "Entry_name"), "Random Website"));
//			testSuiteHelper.handleFormInputs(formInputs);
//			Thread.sleep(100);
//			Assert.assertTrue(testSuiteHelper.fireEvent(200076), "Event fired: ");
//			testSuiteHelper.runInCrawlingPlugins(39);
//			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 39");
//
//			testSuiteHelper.addStateToReportBuilder(39);
//
//			if (assertionMode != StateEquivalenceAssertionMode.NONE){
//
//				if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(39)
//										&& allStatesIdentical;
//				}
//
//				if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    /* Perform a visual diff on the two states. */
//				    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(39)
//						&& allStatesIdentical;
//				}
//				if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
//					allStatesIdentical = testSuiteHelper.fragDiffBool(39)
//						&& allStatesIdentical;
//				}
//			}
//
//		} catch (Exception e) {
//			Assert.fail(e.getMessage());
//		}
//		if(!allStatesIdentical) {
//			Assert.fail("At least one state is different.");
//		}
//	}
//
//	@Test(priority=38)
//	public void method_BT135_path_5_6_100065_100077(){
//		testSuiteHelper.newCurrentTestMethod("method_BT135_path_5_6_100065_100077", 38);
//		List<FormInput> formInputs;
//
//		boolean allStatesIdentical = true;
//
//		testSuiteHelper.addStateToReportBuilder(2);
//
//		if (assertionMode != StateEquivalenceAssertionMode.NONE){
//			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(2)
//										&& allStatesIdentical;
//			}
//
//			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(2)
//					&& allStatesIdentical;
//			}
//			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
//				allStatesIdentical = testSuiteHelper.fragDiffBool(2)
//					&& allStatesIdentical;
//			}
//		}
//		try {
//			/* Label - index create entry */
//			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/NAV[1]/SECTION[1]/UL[1]/LI[1]/UL[1]/LI[2]/A[1], element=Element{node=null, tag=A, text=Create, attributes={href=/ppma/index.php?r=entry/create}}, source=2, target=6} */
//			formInputs = new ArrayList<FormInput>();
//			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "Entry_name"), "Random Website"));
//			testSuiteHelper.handleFormInputs(formInputs);
//			Thread.sleep(100);
//			Assert.assertTrue(testSuiteHelper.fireEvent(5), "Event fired: Create");
//			testSuiteHelper.runInCrawlingPlugins(6);
//			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 6");
//
//			testSuiteHelper.addStateToReportBuilder(6);
//
//			if (assertionMode != StateEquivalenceAssertionMode.NONE){
//
//				if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(6)
//										&& allStatesIdentical;
//				}
//
//				if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    /* Perform a visual diff on the two states. */
//				    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(6)
//						&& allStatesIdentical;
//				}
//				if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
//					allStatesIdentical = testSuiteHelper.fragDiffBool(6)
//						&& allStatesIdentical;
//				}
//			}
//
//			/* Label - submit button entry save index radius */
//			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/INPUT[7], element=Element{node=null, tag=INPUT, text=, attributes={name=yt0, type=submit, class=button radius, value=Save}}, source=6, target=7} */
//			formInputs = new ArrayList<FormInput>();
//			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/INPUT[2]"), "Random Website"));
//			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/INPUT[3]"), "jdoe"));
//			formInputs.add(new FormInput(FormInput.InputType.PASSWORD, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/INPUT[1]"), "123456"));
//			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/INPUT[4]"), "nrzmfmkJ"));
//			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/INPUT[5]"), "POFeABBy"));
//			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/TEXTAREA[1]"), "jtQbbrpV"));
//			testSuiteHelper.handleFormInputs(formInputs);
//			Thread.sleep(100);
//			Assert.assertTrue(testSuiteHelper.fireEvent(6), "Event fired: ");
//			testSuiteHelper.runInCrawlingPlugins(7);
//			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 7");
//
//			testSuiteHelper.addStateToReportBuilder(7);
//
//			if (assertionMode != StateEquivalenceAssertionMode.NONE){
//
//				if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(7)
//										&& allStatesIdentical;
//				}
//
//				if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    /* Perform a visual diff on the two states. */
//				    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(7)
//						&& allStatesIdentical;
//				}
//				if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
//					allStatesIdentical = testSuiteHelper.fragDiffBool(7)
//						&& allStatesIdentical;
//				}
//			}
//
//			/* Label - none */
//			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[4]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/A[1], element=Element{node=null, tag=A, text=Random Website, attributes={data-reveal-id=entry-form-modal, rel=/ppma/index.php?r=entry/getData&id=1&withPassword=1, href=/ppma/index.php?r=entry/update&id=1&returnUrl=%2Fppma%2Findex.php%3Fr%3Dentry%2Findex, class=update-entry}}, source=7, target=135} */
//			formInputs = new ArrayList<FormInput>();
//			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "Entry_name"), "Random Website"));
//			testSuiteHelper.handleFormInputs(formInputs);
//			Thread.sleep(100);
//			Assert.assertTrue(testSuiteHelper.fireEvent(100065), "Event fired: Random Website");
//			testSuiteHelper.runInCrawlingPlugins(135);
//			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 135");
//
//			testSuiteHelper.addStateToReportBuilder(135);
//
//			if (assertionMode != StateEquivalenceAssertionMode.NONE){
//
//				if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(135)
//										&& allStatesIdentical;
//				}
//
//				if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    /* Perform a visual diff on the two states. */
//				    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(135)
//						&& allStatesIdentical;
//				}
//				if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
//					allStatesIdentical = testSuiteHelper.fragDiffBool(135)
//						&& allStatesIdentical;
//				}
//			}
//
//			/* Label - none */
//			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[4]/TABLE[1]/TBODY[1]/TR[1]/TD[4]/A[5], element=Element{node=null, tag=A, text=, attributes={anyaccess=action, href=/ppma/index.php?r=entry/delete&id=7, title=Delete, class=delete}}, source=135, target=78} */
//			formInputs = new ArrayList<FormInput>();
//			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "Entry_name"), "Random Website"));
//			testSuiteHelper.handleFormInputs(formInputs);
//			Thread.sleep(100);
//			Assert.assertTrue(testSuiteHelper.fireEvent(100077), "Event fired: ");
//			testSuiteHelper.runInCrawlingPlugins(78);
//			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 78");
//
//			testSuiteHelper.addStateToReportBuilder(78);
//
//			if (assertionMode != StateEquivalenceAssertionMode.NONE){
//
//				if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(78)
//										&& allStatesIdentical;
//				}
//
//				if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    /* Perform a visual diff on the two states. */
//				    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(78)
//						&& allStatesIdentical;
//				}
//				if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
//					allStatesIdentical = testSuiteHelper.fragDiffBool(78)
//						&& allStatesIdentical;
//				}
//			}
//
//		} catch (Exception e) {
//			Assert.fail(e.getMessage());
//		}
//		if(!allStatesIdentical) {
//			Assert.fail("At least one state is different.");
//		}
//	}
//
//	@Test(priority=39)
//	public void method_BT7_path_9_100055_100081_200082(){
//		testSuiteHelper.newCurrentTestMethod("method_BT7_path_9_100055_100081_200082", 39);
//		List<FormInput> formInputs;
//
//		boolean allStatesIdentical = true;
//
//		testSuiteHelper.addStateToReportBuilder(8);
//
//		if (assertionMode != StateEquivalenceAssertionMode.NONE){
//			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(8)
//										&& allStatesIdentical;
//			}
//
//			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(8)
//					&& allStatesIdentical;
//			}
//			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
//				allStatesIdentical = testSuiteHelper.fragDiffBool(8)
//					&& allStatesIdentical;
//			}
//		}
//		try {
//			/* Label - index update id entry */
//			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/A[1], element=Element{node=null, tag=A, text=Random Website, attributes={data-reveal-id=entry-form-modal, rel=/ppma/index.php?r=entry/getData&id=1&withPassword=1, anyaccess=none, href=/ppma/index.php?r=entry/update&id=1&returnUrl=%2Fppma%2Findex.php%3Fr%3Dentry%2Findex%26Entry_sort%3Dname.desc, class=update-entry}}, source=8, target=10} */
//			formInputs = new ArrayList<FormInput>();
//			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "Entry_name"), "Random Website"));
//			testSuiteHelper.handleFormInputs(formInputs);
//			Thread.sleep(100);
//			Assert.assertTrue(testSuiteHelper.fireEvent(9), "Event fired: Random Website");
//			testSuiteHelper.runInCrawlingPlugins(10);
//			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 10");
//
//			testSuiteHelper.addStateToReportBuilder(10);
//
//			if (assertionMode != StateEquivalenceAssertionMode.NONE){
//
//				if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(10)
//										&& allStatesIdentical;
//				}
//
//				if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    /* Perform a visual diff on the two states. */
//				    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(10)
//						&& allStatesIdentical;
//				}
//				if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
//					allStatesIdentical = testSuiteHelper.fragDiffBool(10)
//						&& allStatesIdentical;
//				}
//			}
//
//			/* Label - submit button entry save index radius */
//			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[2]/FORM[1]/INPUT[7], element=Element{node=null, tag=INPUT, text=, attributes={name=yt1, anyaccess=action, type=submit, class=button radius, value=Save}}, source=10, target=7} */
//			formInputs = new ArrayList<FormInput>();
//			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "Entry_name"), "Random Website"));
//			testSuiteHelper.handleFormInputs(formInputs);
//			Thread.sleep(100);
//			Assert.assertTrue(testSuiteHelper.fireEvent(100055), "Event fired: ");
//			testSuiteHelper.runInCrawlingPlugins(7);
//			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 7");
//
//			testSuiteHelper.addStateToReportBuilder(7);
//
//			if (assertionMode != StateEquivalenceAssertionMode.NONE){
//
//				if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(7)
//										&& allStatesIdentical;
//				}
//
//				if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    /* Perform a visual diff on the two states. */
//				    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(7)
//						&& allStatesIdentical;
//				}
//				if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
//					allStatesIdentical = testSuiteHelper.fragDiffBool(7)
//						&& allStatesIdentical;
//				}
//			}
//
//			/* Label - index update id entry */
//			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[4]/TABLE[1]/TBODY[1]/TR[1]/TD[4]/A[4], element=Element{node=null, tag=A, text=, attributes={data-reveal-id=entry-form-modal, rel=/ppma/index.php?r=entry/getData&id=1&withPassword=1, href=/ppma/index.php?r=entry/update&id=1&returnUrl=%2Fppma%2Findex.php%3Fr%3Dentry%2Findex, title=Update, class=update-entry}}, source=7, target=135} */
//			formInputs = new ArrayList<FormInput>();
//			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "Entry_name"), "Random Website"));
//			testSuiteHelper.handleFormInputs(formInputs);
//			Thread.sleep(100);
//			Assert.assertTrue(testSuiteHelper.fireEvent(100081), "Event fired: ");
//			testSuiteHelper.runInCrawlingPlugins(135);
//			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 135");
//
//			testSuiteHelper.addStateToReportBuilder(135);
//
//			if (assertionMode != StateEquivalenceAssertionMode.NONE){
//
//				if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(135)
//										&& allStatesIdentical;
//				}
//
//				if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    /* Perform a visual diff on the two states. */
//				    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(135)
//						&& allStatesIdentical;
//				}
//				if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
//					allStatesIdentical = testSuiteHelper.fragDiffBool(135)
//						&& allStatesIdentical;
//				}
//			}
//
//			/* Label - none */
//			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[4]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/A[1], element=Element{node=null, tag=A, text=Random Website, attributes={data-reveal-id=entry-form-modal, rel=/ppma/index.php?r=entry/getData&id=7&withPassword=1, anyaccess=action, href=/ppma/index.php?r=entry/update&id=7&returnUrl=%2Fppma%2Findex.php%3Fr%3Dentry%2Findex, class=update-entry}}, source=135, target=78} */
//			formInputs = new ArrayList<FormInput>();
//			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "Entry_name"), "Random Website"));
//			testSuiteHelper.handleFormInputs(formInputs);
//			Thread.sleep(100);
//			Assert.assertTrue(testSuiteHelper.fireEvent(200082), "Event fired: Random Website");
//			testSuiteHelper.runInCrawlingPlugins(78);
//			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 78");
//
//			testSuiteHelper.addStateToReportBuilder(78);
//
//			if (assertionMode != StateEquivalenceAssertionMode.NONE){
//
//				if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(78)
//										&& allStatesIdentical;
//				}
//
//				if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    /* Perform a visual diff on the two states. */
//				    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(78)
//						&& allStatesIdentical;
//				}
//				if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
//					allStatesIdentical = testSuiteHelper.fragDiffBool(78)
//						&& allStatesIdentical;
//				}
//			}
//
//		} catch (Exception e) {
//			Assert.fail(e.getMessage());
//		}
//		if(!allStatesIdentical) {
//			Assert.fail("At least one state is different.");
//		}
//	}
//
//	@Test(priority=40)
//	public void method_BT10_path_9_dup0(){
//		testSuiteHelper.newCurrentTestMethod("method_BT10_path_9_dup0", 40);
//		List<FormInput> formInputs;
//
//		boolean allStatesIdentical = true;
//
//		testSuiteHelper.addStateToReportBuilder(8);
//
//		if (assertionMode != StateEquivalenceAssertionMode.NONE){
//			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(8)
//										&& allStatesIdentical;
//			}
//
//			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(8)
//					&& allStatesIdentical;
//			}
//			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
//				allStatesIdentical = testSuiteHelper.fragDiffBool(8)
//					&& allStatesIdentical;
//			}
//		}
//		try {
//			/* Label - index update id entry */
//			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/A[1], element=Element{node=null, tag=A, text=Random Website, attributes={data-reveal-id=entry-form-modal, rel=/ppma/index.php?r=entry/getData&id=1&withPassword=1, anyaccess=none, href=/ppma/index.php?r=entry/update&id=1&returnUrl=%2Fppma%2Findex.php%3Fr%3Dentry%2Findex%26Entry_sort%3Dname.desc, class=update-entry}}, source=8, target=10} */
//			formInputs = new ArrayList<FormInput>();
//			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "Entry_name"), "Random Website"));
//			testSuiteHelper.handleFormInputs(formInputs);
//			Thread.sleep(100);
//			Assert.assertTrue(testSuiteHelper.fireEvent(9), "Event fired: Random Website");
//			testSuiteHelper.runInCrawlingPlugins(10);
//			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 10");
//
//			testSuiteHelper.addStateToReportBuilder(10);
//
//			if (assertionMode != StateEquivalenceAssertionMode.NONE){
//
//				if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(10)
//										&& allStatesIdentical;
//				}
//
//				if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    /* Perform a visual diff on the two states. */
//				    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(10)
//						&& allStatesIdentical;
//				}
//				if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
//					allStatesIdentical = testSuiteHelper.fragDiffBool(10)
//						&& allStatesIdentical;
//				}
//			}
//
//		} catch (Exception e) {
//			Assert.fail(e.getMessage());
//		}
//		if(!allStatesIdentical) {
//			Assert.fail("At least one state is different.");
//		}
//	}
//
//	@Test(priority=41)
//	public void method_BT34_failed_path_22_1000004(){
//		testSuiteHelper.newCurrentTestMethod("method_BT34_failed_path_22_1000004", 41);
//		List<FormInput> formInputs;
//
//		boolean allStatesIdentical = true;
//
//		testSuiteHelper.addStateToReportBuilder(8);
//
//		if (assertionMode != StateEquivalenceAssertionMode.NONE){
//			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(8)
//										&& allStatesIdentical;
//			}
//
//			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(8)
//					&& allStatesIdentical;
//			}
//			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
//				allStatesIdentical = testSuiteHelper.fragDiffBool(8)
//					&& allStatesIdentical;
//			}
//		}
//		try {
//			/* Label - index delete entry */
//			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/TABLE[1]/TBODY[1]/TR[1]/TD[4]/A[5], element=Element{node=null, tag=A, text=, attributes={anyaccess=none, href=/ppma/index.php?r=entry/delete&id=1, title=Delete, class=delete}}, source=8, target=2} */
//			formInputs = new ArrayList<FormInput>();
//			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "Entry_name"), "Random Website"));
//			testSuiteHelper.handleFormInputs(formInputs);
//			Thread.sleep(100);
//			Assert.assertTrue(testSuiteHelper.fireEvent(22), "Event fired: ");
//			testSuiteHelper.runInCrawlingPlugins(2);
//			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 2");
//
//			testSuiteHelper.addStateToReportBuilder(2);
//
//			if (assertionMode != StateEquivalenceAssertionMode.NONE){
//
//				if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(2)
//										&& allStatesIdentical;
//				}
//
//				if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    /* Perform a visual diff on the two states. */
//				    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(2)
//						&& allStatesIdentical;
//				}
//				if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
//					allStatesIdentical = testSuiteHelper.fragDiffBool(2)
//						&& allStatesIdentical;
//				}
//			}
//
//			/* Label - index tag */
//			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/NAV[1]/SECTION[1]/UL[1]/LI[2]/A[1], element=Element{node=null, tag=A, text=Tags, attributes={href=/ppma/index.php?r=tag/index}}, source=2, target=39} */
//			formInputs = new ArrayList<FormInput>();
//			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "Entry_name"), "Random Website"));
//			testSuiteHelper.handleFormInputs(formInputs);
//			Thread.sleep(100);
//			Assert.assertTrue(testSuiteHelper.fireEvent(1000004), "Event fired: Tags");
//			testSuiteHelper.runInCrawlingPlugins(39);
//			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 39");
//
//			testSuiteHelper.addStateToReportBuilder(39);
//
//			if (assertionMode != StateEquivalenceAssertionMode.NONE){
//
//				if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(39)
//										&& allStatesIdentical;
//				}
//
//				if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    /* Perform a visual diff on the two states. */
//				    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(39)
//						&& allStatesIdentical;
//				}
//				if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
//					allStatesIdentical = testSuiteHelper.fragDiffBool(39)
//						&& allStatesIdentical;
//				}
//			}
//
//		} catch (Exception e) {
//			Assert.fail(e.getMessage());
//		}
//		if(!allStatesIdentical) {
//			Assert.fail("At least one state is different.");
//		}
//	}
//
//	@Test(priority=42)
//	public void method_BT135_path_5_6_100065(){
//		testSuiteHelper.newCurrentTestMethod("method_BT135_path_5_6_100065", 42);
//		List<FormInput> formInputs;
//
//		boolean allStatesIdentical = true;
//
//		testSuiteHelper.addStateToReportBuilder(2);
//
//		if (assertionMode != StateEquivalenceAssertionMode.NONE){
//			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(2)
//										&& allStatesIdentical;
//			}
//
//			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(2)
//					&& allStatesIdentical;
//			}
//			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
//				allStatesIdentical = testSuiteHelper.fragDiffBool(2)
//					&& allStatesIdentical;
//			}
//		}
//		try {
//			/* Label - index create entry */
//			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/NAV[1]/SECTION[1]/UL[1]/LI[1]/UL[1]/LI[2]/A[1], element=Element{node=null, tag=A, text=Create, attributes={href=/ppma/index.php?r=entry/create}}, source=2, target=6} */
//			formInputs = new ArrayList<FormInput>();
//			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "Entry_name"), "Random Website"));
//			testSuiteHelper.handleFormInputs(formInputs);
//			Thread.sleep(100);
//			Assert.assertTrue(testSuiteHelper.fireEvent(5), "Event fired: Create");
//			testSuiteHelper.runInCrawlingPlugins(6);
//			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 6");
//
//			testSuiteHelper.addStateToReportBuilder(6);
//
//			if (assertionMode != StateEquivalenceAssertionMode.NONE){
//
//				if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(6)
//										&& allStatesIdentical;
//				}
//
//				if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    /* Perform a visual diff on the two states. */
//				    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(6)
//						&& allStatesIdentical;
//				}
//				if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
//					allStatesIdentical = testSuiteHelper.fragDiffBool(6)
//						&& allStatesIdentical;
//				}
//			}
//
//			/* Label - submit button entry save index radius */
//			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/INPUT[7], element=Element{node=null, tag=INPUT, text=, attributes={name=yt0, type=submit, class=button radius, value=Save}}, source=6, target=7} */
//			formInputs = new ArrayList<FormInput>();
//			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/INPUT[2]"), "Random Website"));
//			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/INPUT[3]"), "jdoe"));
//			formInputs.add(new FormInput(FormInput.InputType.PASSWORD, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/INPUT[1]"), "123456"));
//			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/INPUT[4]"), "nrzmfmkJ"));
//			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/INPUT[5]"), "POFeABBy"));
//			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/TEXTAREA[1]"), "jtQbbrpV"));
//			testSuiteHelper.handleFormInputs(formInputs);
//			Thread.sleep(100);
//			Assert.assertTrue(testSuiteHelper.fireEvent(6), "Event fired: ");
//			testSuiteHelper.runInCrawlingPlugins(7);
//			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 7");
//
//			testSuiteHelper.addStateToReportBuilder(7);
//
//			if (assertionMode != StateEquivalenceAssertionMode.NONE){
//
//				if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(7)
//										&& allStatesIdentical;
//				}
//
//				if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    /* Perform a visual diff on the two states. */
//				    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(7)
//						&& allStatesIdentical;
//				}
//				if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
//					allStatesIdentical = testSuiteHelper.fragDiffBool(7)
//						&& allStatesIdentical;
//				}
//			}
//
//			/* Label - none */
//			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[4]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/A[1], element=Element{node=null, tag=A, text=Random Website, attributes={data-reveal-id=entry-form-modal, rel=/ppma/index.php?r=entry/getData&id=1&withPassword=1, href=/ppma/index.php?r=entry/update&id=1&returnUrl=%2Fppma%2Findex.php%3Fr%3Dentry%2Findex, class=update-entry}}, source=7, target=135} */
//			formInputs = new ArrayList<FormInput>();
//			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "Entry_name"), "Random Website"));
//			testSuiteHelper.handleFormInputs(formInputs);
//			Thread.sleep(100);
//			Assert.assertTrue(testSuiteHelper.fireEvent(100065), "Event fired: Random Website");
//			testSuiteHelper.runInCrawlingPlugins(135);
//			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 135");
//
//			testSuiteHelper.addStateToReportBuilder(135);
//
//			if (assertionMode != StateEquivalenceAssertionMode.NONE){
//
//				if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(135)
//										&& allStatesIdentical;
//				}
//
//				if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    /* Perform a visual diff on the two states. */
//				    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(135)
//						&& allStatesIdentical;
//				}
//				if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
//					allStatesIdentical = testSuiteHelper.fragDiffBool(135)
//						&& allStatesIdentical;
//				}
//			}
//
//		} catch (Exception e) {
//			Assert.fail(e.getMessage());
//		}
//		if(!allStatesIdentical) {
//			Assert.fail("At least one state is different.");
//		}
//	}
//
//	@Test(priority=43)
//	public void method_BT7_path_9_100055_100083(){
//		testSuiteHelper.newCurrentTestMethod("method_BT7_path_9_100055_100083", 43);
//		List<FormInput> formInputs;
//
//		boolean allStatesIdentical = true;
//
//		testSuiteHelper.addStateToReportBuilder(8);
//
//		if (assertionMode != StateEquivalenceAssertionMode.NONE){
//			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(8)
//										&& allStatesIdentical;
//			}
//
//			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(8)
//					&& allStatesIdentical;
//			}
//			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
//				allStatesIdentical = testSuiteHelper.fragDiffBool(8)
//					&& allStatesIdentical;
//			}
//		}
//		try {
//			/* Label - index update id entry */
//			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/A[1], element=Element{node=null, tag=A, text=Random Website, attributes={data-reveal-id=entry-form-modal, rel=/ppma/index.php?r=entry/getData&id=1&withPassword=1, anyaccess=none, href=/ppma/index.php?r=entry/update&id=1&returnUrl=%2Fppma%2Findex.php%3Fr%3Dentry%2Findex%26Entry_sort%3Dname.desc, class=update-entry}}, source=8, target=10} */
//			formInputs = new ArrayList<FormInput>();
//			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "Entry_name"), "Random Website"));
//			testSuiteHelper.handleFormInputs(formInputs);
//			Thread.sleep(100);
//			Assert.assertTrue(testSuiteHelper.fireEvent(9), "Event fired: Random Website");
//			testSuiteHelper.runInCrawlingPlugins(10);
//			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 10");
//
//			testSuiteHelper.addStateToReportBuilder(10);
//
//			if (assertionMode != StateEquivalenceAssertionMode.NONE){
//
//				if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(10)
//										&& allStatesIdentical;
//				}
//
//				if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    /* Perform a visual diff on the two states. */
//				    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(10)
//						&& allStatesIdentical;
//				}
//				if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
//					allStatesIdentical = testSuiteHelper.fragDiffBool(10)
//						&& allStatesIdentical;
//				}
//			}
//
//			/* Label - submit button entry save index radius */
//			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[2]/FORM[1]/INPUT[7], element=Element{node=null, tag=INPUT, text=, attributes={name=yt1, anyaccess=action, type=submit, class=button radius, value=Save}}, source=10, target=7} */
//			formInputs = new ArrayList<FormInput>();
//			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "Entry_name"), "Random Website"));
//			testSuiteHelper.handleFormInputs(formInputs);
//			Thread.sleep(100);
//			Assert.assertTrue(testSuiteHelper.fireEvent(100055), "Event fired: ");
//			testSuiteHelper.runInCrawlingPlugins(7);
//			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 7");
//
//			testSuiteHelper.addStateToReportBuilder(7);
//
//			if (assertionMode != StateEquivalenceAssertionMode.NONE){
//
//				if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(7)
//										&& allStatesIdentical;
//				}
//
//				if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    /* Perform a visual diff on the two states. */
//				    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(7)
//						&& allStatesIdentical;
//				}
//				if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
//					allStatesIdentical = testSuiteHelper.fragDiffBool(7)
//						&& allStatesIdentical;
//				}
//			}
//
//			/* Label - index delete entry tag */
//			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[4]/TABLE[1]/TBODY[1]/TR[1]/TD[4]/A[5], element=Element{node=null, tag=A, text=, attributes={href=/ppma/index.php?r=entry/delete&id=1, title=Delete, class=delete}}, source=7, target=2} */
//			formInputs = new ArrayList<FormInput>();
//			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "Entry_name"), "Random Website"));
//			testSuiteHelper.handleFormInputs(formInputs);
//			Thread.sleep(100);
//			Assert.assertTrue(testSuiteHelper.fireEvent(100083), "Event fired: ");
//			testSuiteHelper.runInCrawlingPlugins(2);
//			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 2");
//
//			testSuiteHelper.addStateToReportBuilder(2);
//
//			if (assertionMode != StateEquivalenceAssertionMode.NONE){
//
//				if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(2)
//										&& allStatesIdentical;
//				}
//
//				if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    /* Perform a visual diff on the two states. */
//				    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(2)
//						&& allStatesIdentical;
//				}
//				if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
//					allStatesIdentical = testSuiteHelper.fragDiffBool(2)
//						&& allStatesIdentical;
//				}
//			}
//
//		} catch (Exception e) {
//			Assert.fail(e.getMessage());
//		}
//		if(!allStatesIdentical) {
//			Assert.fail("At least one state is different.");
//		}
//	}
//
//	@Test(priority=44)
//	public void method_BT7_path_5_6(){
//		testSuiteHelper.newCurrentTestMethod("method_BT7_path_5_6", 44);
//		List<FormInput> formInputs;
//
//		boolean allStatesIdentical = true;
//
//		testSuiteHelper.addStateToReportBuilder(2);
//
//		if (assertionMode != StateEquivalenceAssertionMode.NONE){
//			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(2)
//										&& allStatesIdentical;
//			}
//
//			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(2)
//					&& allStatesIdentical;
//			}
//			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
//				allStatesIdentical = testSuiteHelper.fragDiffBool(2)
//					&& allStatesIdentical;
//			}
//		}
//		try {
//			/* Label - index create entry */
//			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/NAV[1]/SECTION[1]/UL[1]/LI[1]/UL[1]/LI[2]/A[1], element=Element{node=null, tag=A, text=Create, attributes={href=/ppma/index.php?r=entry/create}}, source=2, target=6} */
//			formInputs = new ArrayList<FormInput>();
//			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "Entry_name"), "Random Website"));
//			testSuiteHelper.handleFormInputs(formInputs);
//			Thread.sleep(100);
//			Assert.assertTrue(testSuiteHelper.fireEvent(5), "Event fired: Create");
//			testSuiteHelper.runInCrawlingPlugins(6);
//			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 6");
//
//			testSuiteHelper.addStateToReportBuilder(6);
//
//			if (assertionMode != StateEquivalenceAssertionMode.NONE){
//
//				if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(6)
//										&& allStatesIdentical;
//				}
//
//				if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    /* Perform a visual diff on the two states. */
//				    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(6)
//						&& allStatesIdentical;
//				}
//				if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
//					allStatesIdentical = testSuiteHelper.fragDiffBool(6)
//						&& allStatesIdentical;
//				}
//			}
//
//			/* Label - submit button entry save index radius */
//			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/INPUT[7], element=Element{node=null, tag=INPUT, text=, attributes={name=yt0, type=submit, class=button radius, value=Save}}, source=6, target=7} */
//			formInputs = new ArrayList<FormInput>();
//			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/INPUT[2]"), "Random Website"));
//			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/INPUT[3]"), "jdoe"));
//			formInputs.add(new FormInput(FormInput.InputType.PASSWORD, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/INPUT[1]"), "123456"));
//			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/INPUT[4]"), "nrzmfmkJ"));
//			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/INPUT[5]"), "POFeABBy"));
//			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/TEXTAREA[1]"), "jtQbbrpV"));
//			testSuiteHelper.handleFormInputs(formInputs);
//			Thread.sleep(100);
//			Assert.assertTrue(testSuiteHelper.fireEvent(6), "Event fired: ");
//			testSuiteHelper.runInCrawlingPlugins(7);
//			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 7");
//
//			testSuiteHelper.addStateToReportBuilder(7);
//
//			if (assertionMode != StateEquivalenceAssertionMode.NONE){
//
//				if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(7)
//										&& allStatesIdentical;
//				}
//
//				if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
//				    /* Perform a visual diff on the two states. */
//				    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(7)
//						&& allStatesIdentical;
//				}
//				if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
//					allStatesIdentical = testSuiteHelper.fragDiffBool(7)
//						&& allStatesIdentical;
//				}
//			}
//
//		} catch (Exception e) {
//			Assert.fail(e.getMessage());
//		}
//		if(!allStatesIdentical) {
//			Assert.fail("At least one state is different.");
//		}
//	}
//
//
//}
