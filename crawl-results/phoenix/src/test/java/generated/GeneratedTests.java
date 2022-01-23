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
 * Generated @ Wed Sep 22 21:01:02 CDT 2021
 */

public class GeneratedTests {
	private final boolean mutate = true;
    private final String URL = "http://localhost:4000";
	private TestSuiteHelper testSuiteHelper;
	
	private final String CRAWL_PATH = "/Users/liuyu/projects/tackle-test-generator-ui-level/testlabeling/crawljax_frag/out/phoenix/phoenix_HYBRID_DOM_-1.0_60mins/localhost/crawl0";

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
	public void method_BT0_path_1_2_3_7_8_9_10_11_12_13_14_15_16_17_18_19_20_21_22_23_24_25_26_27_28_29_30_31_32_33_34_35_36_37_38_39_40_41_42_43_44_45_46_47_48_49_50_51_52_53_54_55_56_57_58_59_60_61_62_63_64_65_66_67_68_69_70_71_72_73_74_75_76_77_78_79_80_81_82_83_84_85_86_87_88_89_90_91_92_93_94_95_96_97_98_99_100_101_102_103_104_105_106_107_108_109_110_111_112_113_114_115_116_117_118_119_120_121_122_123_124_125_126_127_128_129_130_131_132_133_134_135_136_137_138_139_140_141_142_143_144_145_146_147_148_149_150_151_152_153_154_155_156_157_158_159_160_161_162_163_164_165_166_167_168_169_170_171_172_173_174_175_176_177_178_179_180_181_182_183_184_185_186_187_188_189_190_191_192_193_194_195_196_197_198_199_200_201_202_203_204_205_206_207_208_209_210_211_212_213_214_215_216_217_218_219_220_221_222_223_224_225_226_227_228_229_230_231_232_233_234_235_236_237_238_239_240_241_242_243_244_245_246_247_248_249_250_251_252_253_254_255_256_257_258_259_260_261_262_263_264_265_266_267_268_269_270_271_272_273_274_275_276_277_278_279_280_281_282_283_284_285_286_287_288_289_290_291_292_293_294_295_296_297_298_299_300_301_302_303_304_305_306_307_308_309_310_311_312_313_314_315_316_317_318_319_320_321_322_323_324_325_326_327_328_329_330_331_332_333_334_335_336_337_338_339_340_341_342_343_344_345_346_347_348_349_350_351_352_353_354_355_356_357_358_359_360_361_362_363_364_365_366_367_368_369_370_371_372_373_374_375_376_377_378_379_380_381_382_383_384_385_386_387_388_389_390_391_392_393_394_395_396_397_398_399_400_401_402_403_404_405_406_407(){
		testSuiteHelper.newCurrentTestMethod("method_BT0_path_1_2_3_7_8_9_10_11_12_13_14_15_16_17_18_19_20_21_22_23_24_25_26_27_28_29_30_31_32_33_34_35_36_37_38_39_40_41_42_43_44_45_46_47_48_49_50_51_52_53_54_55_56_57_58_59_60_61_62_63_64_65_66_67_68_69_70_71_72_73_74_75_76_77_78_79_80_81_82_83_84_85_86_87_88_89_90_91_92_93_94_95_96_97_98_99_100_101_102_103_104_105_106_107_108_109_110_111_112_113_114_115_116_117_118_119_120_121_122_123_124_125_126_127_128_129_130_131_132_133_134_135_136_137_138_139_140_141_142_143_144_145_146_147_148_149_150_151_152_153_154_155_156_157_158_159_160_161_162_163_164_165_166_167_168_169_170_171_172_173_174_175_176_177_178_179_180_181_182_183_184_185_186_187_188_189_190_191_192_193_194_195_196_197_198_199_200_201_202_203_204_205_206_207_208_209_210_211_212_213_214_215_216_217_218_219_220_221_222_223_224_225_226_227_228_229_230_231_232_233_234_235_236_237_238_239_240_241_242_243_244_245_246_247_248_249_250_251_252_253_254_255_256_257_258_259_260_261_262_263_264_265_266_267_268_269_270_271_272_273_274_275_276_277_278_279_280_281_282_283_284_285_286_287_288_289_290_291_292_293_294_295_296_297_298_299_300_301_302_303_304_305_306_307_308_309_310_311_312_313_314_315_316_317_318_319_320_321_322_323_324_325_326_327_328_329_330_331_332_333_334_335_336_337_338_339_340_341_342_343_344_345_346_347_348_349_350_351_352_353_354_355_356_357_358_359_360_361_362_363_364_365_366_367_368_369_370_371_372_373_374_375_376_377_378_379_380_381_382_383_384_385_386_387_388_389_390_391_392_393_394_395_396_397_398_399_400_401_402_403_404_405_406_407", 2);
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
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/MAIN[1]/A[1], element=Element{node=[A: null], tag=A, text=Create new account, attributes={data-reactid=.0.0.0.2, href=/sign_up}}, source=HybridStateVertexImpl{id=1, name=state1}, target=HybridStateVertexImpl{id=4, name=state4}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/MAIN[1]/FORM[1]/DIV[1]/INPUT[1]"), "john@phoenix-trello.com"));
			formInputs.add(new FormInput(FormInput.InputType.PASSWORD, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/MAIN[1]/FORM[1]/DIV[2]/INPUT[1]"), "12345678"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(1), "Event fired: Create new account");
			testSuiteHelper.runInCrawlingPlugins(4);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 4");

			testSuiteHelper.addStateToReportBuilder(4);
			
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/MAIN[1]/A[1], element=Element{node=[A: null], tag=A, text=Sign in, attributes={data-reactid=.0.0.0.2, href=/sign_in}}, source=HybridStateVertexImpl{id=4, name=state4}, target=HybridStateVertexImpl{id=1, name=state1}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/MAIN[1]/FORM[1]/DIV[1]/INPUT[1]"), "foo"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/MAIN[1]/FORM[1]/DIV[2]/INPUT[1]"), "bar"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/MAIN[1]/FORM[1]/DIV[3]/INPUT[1]"), "john@phoenix-trello.com"));
			formInputs.add(new FormInput(FormInput.InputType.PASSWORD, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/MAIN[1]/FORM[1]/DIV[4]/INPUT[1]"), "12345678"));
			formInputs.add(new FormInput(FormInput.InputType.PASSWORD, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/MAIN[1]/FORM[1]/DIV[5]/INPUT[1]"), "foobar123"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(2), "Event fired: Sign in");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/MAIN[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Sign in, attributes={data-reactid=.0.0.0.1.3, type=submit}}, source=HybridStateVertexImpl{id=1, name=state1}, target=HybridStateVertexImpl{id=6, name=state6}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/MAIN[1]/FORM[1]/DIV[1]/INPUT[1]"), "john@phoenix-trello.com"));
			formInputs.add(new FormInput(FormInput.InputType.PASSWORD, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/MAIN[1]/FORM[1]/DIV[2]/INPUT[1]"), "12345678"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(3), "Event fired: Sign in");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/SECTION[1]/DIV[1]/DIV[1]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=Add new board..., attributes={data-reactid=.0.0.1.0.0.1.1.0.0, id=add_new_board}}, source=HybridStateVertexImpl{id=6, name=state6}, target=HybridStateVertexImpl{id=9, name=state9}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(7), "Event fired: Add new board...");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/SECTION[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/A[1], element=Element{node=[A: null], tag=A, text=cancel, attributes={data-reactid=.0.0.1.0.0.1.1.0.1.4, href=#}}, source=HybridStateVertexImpl{id=9, name=state9}, target=HybridStateVertexImpl{id=6, name=state6}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/SECTION[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/INPUT[1]"), "ElJuLazS"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(8), "Event fired: cancel");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/SECTION[1]/DIV[1]/DIV[1], element=Element{node=[DIV: null], tag=DIV, text=Add new board..., attributes={class=board add-new, data-reactid=.0.0.1.0.0.1.1}}, source=HybridStateVertexImpl{id=6, name=state6}, target=HybridStateVertexImpl{id=9, name=state9}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(9), "Event fired: Add new board...");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/SECTION[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Create board, attributes={data-reactid=.0.0.1.0.0.1.1.0.1.2, type=submit}}, source=HybridStateVertexImpl{id=9, name=state9}, target=HybridStateVertexImpl{id=12, name=state12}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/SECTION[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/INPUT[1]"), "WfNvXFxe"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(10), "Event fired: Create board");
			testSuiteHelper.runInCrawlingPlugins(12);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 12");

			testSuiteHelper.addStateToReportBuilder(12);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(12)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(12)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(12)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/HEADER[1]/UL[1]/SPAN[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={class=add-new, data-reactid=.0.0.1.0.0.1.0.$=11.0, href=#}}, source=HybridStateVertexImpl{id=12, name=state12}, target=HybridStateVertexImpl{id=13, name=state13}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(11), "Event fired: ");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/HEADER[1]/UL[1]/SPAN[1]/LI[2]/UL[1]/LI[1]/FORM[1]/A[1], element=Element{node=[A: null], tag=A, text=cancel, attributes={data-reactid=.0.0.1.0.0.1.0.$=11.1.0.0.5, href=#}}, source=HybridStateVertexImpl{id=13, name=state13}, target=HybridStateVertexImpl{id=12, name=state12}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.EMAIL, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/HEADER[1]/UL[1]/SPAN[1]/LI[2]/UL[1]/LI[1]/FORM[1]/INPUT[1]"), "foo@bar.com"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(12), "Event fired: cancel");
			testSuiteHelper.runInCrawlingPlugins(12);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 12");

			testSuiteHelper.addStateToReportBuilder(12);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(12)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(12)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(12)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=HybridStateVertexImpl{id=12, name=state12}, target=HybridStateVertexImpl{id=15, name=state15}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(13), "Event fired: Add new list...");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/A[1], element=Element{node=[A: null], tag=A, text=cancel, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.4, href=#}}, source=HybridStateVertexImpl{id=15, name=state15}, target=HybridStateVertexImpl{id=12, name=state12}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/INPUT[1]"), "updated list"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(14), "Event fired: cancel");
			testSuiteHelper.runInCrawlingPlugins(12);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 12");

			testSuiteHelper.addStateToReportBuilder(12);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(12)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(12)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(12)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=inner, data-reactid=.0.0.1.0.1.0.0.1.0}}, source=HybridStateVertexImpl{id=12, name=state12}, target=HybridStateVertexImpl{id=15, name=state15}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(15), "Event fired: Add new list...");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save list, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.2, type=submit}}, source=HybridStateVertexImpl{id=15, name=state15}, target=HybridStateVertexImpl{id=18, name=state18}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/INPUT[1]"), "updated list"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(16), "Event fired: Save list");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FOOTER[1]/A[1], element=Element{node=[A: null], tag=A, text=Add a new card..., attributes={class=add-new, data-reactid=.0.0.1.0.1.0.0.0:$1.0.2.1, href=#}}, source=HybridStateVertexImpl{id=18, name=state18}, target=HybridStateVertexImpl{id=19, name=state19}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(17), "Event fired: Add a new card...");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/A[1], element=Element{node=[A: null], tag=A, text=cancel, attributes={data-reactid=.0.0.1.0.1.0.0.0:$1.0.2.0.0.4, href=#}}, source=HybridStateVertexImpl{id=19, name=state19}, target=HybridStateVertexImpl{id=18, name=state18}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/TEXTAREA[1]"), "just a card"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(18), "Event fired: cancel");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=HybridStateVertexImpl{id=18, name=state18}, target=HybridStateVertexImpl{id=21, name=state21}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(19), "Event fired: Add new list...");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FORM[1]/A[1], element=Element{node=[A: null], tag=A, text=cancel, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.4, href=#}}, source=HybridStateVertexImpl{id=21, name=state21}, target=HybridStateVertexImpl{id=18, name=state18}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FORM[1]/INPUT[1]"), "updated list"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(20), "Event fired: cancel");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=inner, data-reactid=.0.0.1.0.1.0.0.1.0}}, source=HybridStateVertexImpl{id=18, name=state18}, target=HybridStateVertexImpl{id=21, name=state21}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(21), "Event fired: Add new list...");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save list, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.2, type=submit}}, source=HybridStateVertexImpl{id=21, name=state21}, target=HybridStateVertexImpl{id=24, name=state24}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FORM[1]/INPUT[1]"), "updated list"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(22), "Event fired: Save list");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FOOTER[1]/A[1], element=Element{node=[A: null], tag=A, text=Add a new card..., attributes={class=add-new, data-reactid=.0.0.1.0.1.0.0.0:$2.0.2.1, href=#}}, source=HybridStateVertexImpl{id=24, name=state24}, target=HybridStateVertexImpl{id=25, name=state25}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(23), "Event fired: Add a new card...");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/A[1], element=Element{node=[A: null], tag=A, text=cancel, attributes={data-reactid=.0.0.1.0.1.0.0.0:$2.0.2.0.0.4, href=#}}, source=HybridStateVertexImpl{id=25, name=state25}, target=HybridStateVertexImpl{id=24, name=state24}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/TEXTAREA[1]"), "just a card"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(24), "Event fired: cancel");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=HybridStateVertexImpl{id=24, name=state24}, target=HybridStateVertexImpl{id=27, name=state27}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(25), "Event fired: Add new list...");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/DIV[1]/FORM[1]/A[1], element=Element{node=[A: null], tag=A, text=cancel, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.4, href=#}}, source=HybridStateVertexImpl{id=27, name=state27}, target=HybridStateVertexImpl{id=24, name=state24}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/DIV[1]/FORM[1]/INPUT[1]"), "updated list"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(26), "Event fired: cancel");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/DIV[1], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=inner, data-reactid=.0.0.1.0.1.0.0.1.0}}, source=HybridStateVertexImpl{id=24, name=state24}, target=HybridStateVertexImpl{id=27, name=state27}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(27), "Event fired: Add new list...");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/DIV[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save list, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.2, type=submit}}, source=HybridStateVertexImpl{id=27, name=state27}, target=HybridStateVertexImpl{id=30, name=state30}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/DIV[1]/FORM[1]/INPUT[1]"), "updated list"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(28), "Event fired: Save list");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/DIV[1]/FOOTER[1]/A[1], element=Element{node=[A: null], tag=A, text=Add a new card..., attributes={class=add-new, data-reactid=.0.0.1.0.1.0.0.0:$3.0.2.1, href=#}}, source=HybridStateVertexImpl{id=30, name=state30}, target=HybridStateVertexImpl{id=31, name=state31}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(29), "Event fired: Add a new card...");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/A[1], element=Element{node=[A: null], tag=A, text=cancel, attributes={data-reactid=.0.0.1.0.1.0.0.0:$3.0.2.0.0.4, href=#}}, source=HybridStateVertexImpl{id=31, name=state31}, target=HybridStateVertexImpl{id=30, name=state30}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/TEXTAREA[1]"), "just a card"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(30), "Event fired: cancel");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[4], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=HybridStateVertexImpl{id=30, name=state30}, target=HybridStateVertexImpl{id=33, name=state33}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(31), "Event fired: Add new list...");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[4]/DIV[1]/FORM[1]/A[1], element=Element{node=[A: null], tag=A, text=cancel, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.4, href=#}}, source=HybridStateVertexImpl{id=33, name=state33}, target=HybridStateVertexImpl{id=30, name=state30}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[4]/DIV[1]/FORM[1]/INPUT[1]"), "updated list"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(32), "Event fired: cancel");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[4]/DIV[1], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=inner, data-reactid=.0.0.1.0.1.0.0.1.0}}, source=HybridStateVertexImpl{id=30, name=state30}, target=HybridStateVertexImpl{id=33, name=state33}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(33), "Event fired: Add new list...");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[4]/DIV[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save list, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.2, type=submit}}, source=HybridStateVertexImpl{id=33, name=state33}, target=HybridStateVertexImpl{id=36, name=state36}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[4]/DIV[1]/FORM[1]/INPUT[1]"), "updated list"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(34), "Event fired: Save list");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[4]/DIV[1]/FOOTER[1]/A[1], element=Element{node=[A: null], tag=A, text=Add a new card..., attributes={class=add-new, data-reactid=.0.0.1.0.1.0.0.0:$4.0.2.1, href=#}}, source=HybridStateVertexImpl{id=36, name=state36}, target=HybridStateVertexImpl{id=37, name=state37}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(35), "Event fired: Add a new card...");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[4]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/A[1], element=Element{node=[A: null], tag=A, text=cancel, attributes={data-reactid=.0.0.1.0.1.0.0.0:$4.0.2.0.0.4, href=#}}, source=HybridStateVertexImpl{id=37, name=state37}, target=HybridStateVertexImpl{id=36, name=state36}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[4]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/TEXTAREA[1]"), "just a card"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(36), "Event fired: cancel");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[5], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=HybridStateVertexImpl{id=36, name=state36}, target=HybridStateVertexImpl{id=39, name=state39}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(37), "Event fired: Add new list...");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[5]/DIV[1]/FORM[1]/A[1], element=Element{node=[A: null], tag=A, text=cancel, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.4, href=#}}, source=HybridStateVertexImpl{id=39, name=state39}, target=HybridStateVertexImpl{id=36, name=state36}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[5]/DIV[1]/FORM[1]/INPUT[1]"), "updated list"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(38), "Event fired: cancel");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[5]/DIV[1], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=inner, data-reactid=.0.0.1.0.1.0.0.1.0}}, source=HybridStateVertexImpl{id=36, name=state36}, target=HybridStateVertexImpl{id=39, name=state39}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(39), "Event fired: Add new list...");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[5]/DIV[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save list, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.2, type=submit}}, source=HybridStateVertexImpl{id=39, name=state39}, target=HybridStateVertexImpl{id=42, name=state42}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[5]/DIV[1]/FORM[1]/INPUT[1]"), "updated list"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(40), "Event fired: Save list");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[5]/DIV[1]/FOOTER[1]/A[1], element=Element{node=[A: null], tag=A, text=Add a new card..., attributes={class=add-new, data-reactid=.0.0.1.0.1.0.0.0:$5.0.2.1, href=#}}, source=HybridStateVertexImpl{id=42, name=state42}, target=HybridStateVertexImpl{id=43, name=state43}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(41), "Event fired: Add a new card...");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[5]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/A[1], element=Element{node=[A: null], tag=A, text=cancel, attributes={data-reactid=.0.0.1.0.1.0.0.0:$5.0.2.0.0.4, href=#}}, source=HybridStateVertexImpl{id=43, name=state43}, target=HybridStateVertexImpl{id=42, name=state42}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[5]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/TEXTAREA[1]"), "just a card"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(42), "Event fired: cancel");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[6], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=HybridStateVertexImpl{id=42, name=state42}, target=HybridStateVertexImpl{id=45, name=state45}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(43), "Event fired: Add new list...");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[6]/DIV[1]/FORM[1]/A[1], element=Element{node=[A: null], tag=A, text=cancel, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.4, href=#}}, source=HybridStateVertexImpl{id=45, name=state45}, target=HybridStateVertexImpl{id=42, name=state42}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[6]/DIV[1]/FORM[1]/INPUT[1]"), "updated list"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(44), "Event fired: cancel");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[6]/DIV[1], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=inner, data-reactid=.0.0.1.0.1.0.0.1.0}}, source=HybridStateVertexImpl{id=42, name=state42}, target=HybridStateVertexImpl{id=45, name=state45}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(45), "Event fired: Add new list...");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[6]/DIV[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save list, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.2, type=submit}}, source=HybridStateVertexImpl{id=45, name=state45}, target=HybridStateVertexImpl{id=48, name=state48}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[6]/DIV[1]/FORM[1]/INPUT[1]"), "updated list"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(46), "Event fired: Save list");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[6]/DIV[1]/FOOTER[1]/A[1], element=Element{node=[A: null], tag=A, text=Add a new card..., attributes={class=add-new, data-reactid=.0.0.1.0.1.0.0.0:$6.0.2.1, href=#}}, source=HybridStateVertexImpl{id=48, name=state48}, target=HybridStateVertexImpl{id=49, name=state49}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(47), "Event fired: Add a new card...");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[6]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/A[1], element=Element{node=[A: null], tag=A, text=cancel, attributes={data-reactid=.0.0.1.0.1.0.0.0:$6.0.2.0.0.4, href=#}}, source=HybridStateVertexImpl{id=49, name=state49}, target=HybridStateVertexImpl{id=48, name=state48}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[6]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/TEXTAREA[1]"), "just a card"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(48), "Event fired: cancel");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[7], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=HybridStateVertexImpl{id=48, name=state48}, target=HybridStateVertexImpl{id=51, name=state51}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(49), "Event fired: Add new list...");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[7]/DIV[1]/FORM[1]/A[1], element=Element{node=[A: null], tag=A, text=cancel, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.4, href=#}}, source=HybridStateVertexImpl{id=51, name=state51}, target=HybridStateVertexImpl{id=48, name=state48}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[7]/DIV[1]/FORM[1]/INPUT[1]"), "updated list"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(50), "Event fired: cancel");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[7]/DIV[1], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=inner, data-reactid=.0.0.1.0.1.0.0.1.0}}, source=HybridStateVertexImpl{id=48, name=state48}, target=HybridStateVertexImpl{id=51, name=state51}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(51), "Event fired: Add new list...");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[7]/DIV[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save list, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.2, type=submit}}, source=HybridStateVertexImpl{id=51, name=state51}, target=HybridStateVertexImpl{id=54, name=state54}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[7]/DIV[1]/FORM[1]/INPUT[1]"), "updated list"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(52), "Event fired: Save list");
			testSuiteHelper.runInCrawlingPlugins(54);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 54");

			testSuiteHelper.addStateToReportBuilder(54);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(54)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(54)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(54)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[7]/DIV[1]/FOOTER[1]/A[1], element=Element{node=[A: null], tag=A, text=Add a new card..., attributes={class=add-new, data-reactid=.0.0.1.0.1.0.0.0:$7.0.2.1, href=#}}, source=HybridStateVertexImpl{id=54, name=state54}, target=HybridStateVertexImpl{id=55, name=state55}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(53), "Event fired: Add a new card...");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[7]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/A[1], element=Element{node=[A: null], tag=A, text=cancel, attributes={data-reactid=.0.0.1.0.1.0.0.0:$7.0.2.0.0.4, href=#}}, source=HybridStateVertexImpl{id=55, name=state55}, target=HybridStateVertexImpl{id=54, name=state54}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[7]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/TEXTAREA[1]"), "just a card"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(54), "Event fired: cancel");
			testSuiteHelper.runInCrawlingPlugins(54);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 54");

			testSuiteHelper.addStateToReportBuilder(54);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(54)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(54)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(54)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[8], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=HybridStateVertexImpl{id=54, name=state54}, target=HybridStateVertexImpl{id=57, name=state57}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(55), "Event fired: Add new list...");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[8]/DIV[1]/FORM[1]/A[1], element=Element{node=[A: null], tag=A, text=cancel, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.4, href=#}}, source=HybridStateVertexImpl{id=57, name=state57}, target=HybridStateVertexImpl{id=54, name=state54}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[8]/DIV[1]/FORM[1]/INPUT[1]"), "updated list"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(56), "Event fired: cancel");
			testSuiteHelper.runInCrawlingPlugins(54);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 54");

			testSuiteHelper.addStateToReportBuilder(54);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(54)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(54)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(54)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[8]/DIV[1], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=inner, data-reactid=.0.0.1.0.1.0.0.1.0}}, source=HybridStateVertexImpl{id=54, name=state54}, target=HybridStateVertexImpl{id=57, name=state57}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(57), "Event fired: Add new list...");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[8]/DIV[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save list, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.2, type=submit}}, source=HybridStateVertexImpl{id=57, name=state57}, target=HybridStateVertexImpl{id=60, name=state60}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[8]/DIV[1]/FORM[1]/INPUT[1]"), "updated list"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(58), "Event fired: Save list");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[8]/DIV[1]/FOOTER[1]/A[1], element=Element{node=[A: null], tag=A, text=Add a new card..., attributes={class=add-new, data-reactid=.0.0.1.0.1.0.0.0:$8.0.2.1, href=#}}, source=HybridStateVertexImpl{id=60, name=state60}, target=HybridStateVertexImpl{id=61, name=state61}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(59), "Event fired: Add a new card...");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[8]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/A[1], element=Element{node=[A: null], tag=A, text=cancel, attributes={data-reactid=.0.0.1.0.1.0.0.0:$8.0.2.0.0.4, href=#}}, source=HybridStateVertexImpl{id=61, name=state61}, target=HybridStateVertexImpl{id=60, name=state60}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[8]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/TEXTAREA[1]"), "just a card"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(60), "Event fired: cancel");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[9], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=HybridStateVertexImpl{id=60, name=state60}, target=HybridStateVertexImpl{id=63, name=state63}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(61), "Event fired: Add new list...");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[9]/DIV[1]/FORM[1]/A[1], element=Element{node=[A: null], tag=A, text=cancel, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.4, href=#}}, source=HybridStateVertexImpl{id=63, name=state63}, target=HybridStateVertexImpl{id=60, name=state60}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[9]/DIV[1]/FORM[1]/INPUT[1]"), "updated list"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(62), "Event fired: cancel");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[9]/DIV[1], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=inner, data-reactid=.0.0.1.0.1.0.0.1.0}}, source=HybridStateVertexImpl{id=60, name=state60}, target=HybridStateVertexImpl{id=63, name=state63}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(63), "Event fired: Add new list...");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[9]/DIV[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save list, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.2, type=submit}}, source=HybridStateVertexImpl{id=63, name=state63}, target=HybridStateVertexImpl{id=66, name=state66}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[9]/DIV[1]/FORM[1]/INPUT[1]"), "updated list"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(64), "Event fired: Save list");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[9]/DIV[1]/FOOTER[1]/A[1], element=Element{node=[A: null], tag=A, text=Add a new card..., attributes={class=add-new, data-reactid=.0.0.1.0.1.0.0.0:$9.0.2.1, href=#}}, source=HybridStateVertexImpl{id=66, name=state66}, target=HybridStateVertexImpl{id=67, name=state67}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(65), "Event fired: Add a new card...");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[9]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/A[1], element=Element{node=[A: null], tag=A, text=cancel, attributes={data-reactid=.0.0.1.0.1.0.0.0:$9.0.2.0.0.4, href=#}}, source=HybridStateVertexImpl{id=67, name=state67}, target=HybridStateVertexImpl{id=66, name=state66}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[9]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/TEXTAREA[1]"), "just a card"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(66), "Event fired: cancel");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[10], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=HybridStateVertexImpl{id=66, name=state66}, target=HybridStateVertexImpl{id=69, name=state69}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(67), "Event fired: Add new list...");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[10]/DIV[1]/FORM[1]/A[1], element=Element{node=[A: null], tag=A, text=cancel, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.4, href=#}}, source=HybridStateVertexImpl{id=69, name=state69}, target=HybridStateVertexImpl{id=66, name=state66}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[10]/DIV[1]/FORM[1]/INPUT[1]"), "updated list"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(68), "Event fired: cancel");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[10]/DIV[1], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=inner, data-reactid=.0.0.1.0.1.0.0.1.0}}, source=HybridStateVertexImpl{id=66, name=state66}, target=HybridStateVertexImpl{id=69, name=state69}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(69), "Event fired: Add new list...");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[10]/DIV[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save list, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.2, type=submit}}, source=HybridStateVertexImpl{id=69, name=state69}, target=HybridStateVertexImpl{id=72, name=state72}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[10]/DIV[1]/FORM[1]/INPUT[1]"), "updated list"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(70), "Event fired: Save list");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[10]/DIV[1]/FOOTER[1]/A[1], element=Element{node=[A: null], tag=A, text=Add a new card..., attributes={class=add-new, data-reactid=.0.0.1.0.1.0.0.0:$10.0.2.1, href=#}}, source=HybridStateVertexImpl{id=72, name=state72}, target=HybridStateVertexImpl{id=73, name=state73}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(71), "Event fired: Add a new card...");
			testSuiteHelper.runInCrawlingPlugins(73);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 73");

			testSuiteHelper.addStateToReportBuilder(73);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(73)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(73)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(73)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[10]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/A[1], element=Element{node=[A: null], tag=A, text=cancel, attributes={data-reactid=.0.0.1.0.1.0.0.0:$10.0.2.0.0.4, href=#}}, source=HybridStateVertexImpl{id=73, name=state73}, target=HybridStateVertexImpl{id=72, name=state72}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[10]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/TEXTAREA[1]"), "just a card"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(72), "Event fired: cancel");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[11], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=HybridStateVertexImpl{id=72, name=state72}, target=HybridStateVertexImpl{id=75, name=state75}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(73), "Event fired: Add new list...");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[11]/DIV[1]/FORM[1]/A[1], element=Element{node=[A: null], tag=A, text=cancel, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.4, href=#}}, source=HybridStateVertexImpl{id=75, name=state75}, target=HybridStateVertexImpl{id=72, name=state72}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[11]/DIV[1]/FORM[1]/INPUT[1]"), "updated list"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(74), "Event fired: cancel");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[11]/DIV[1], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=inner, data-reactid=.0.0.1.0.1.0.0.1.0}}, source=HybridStateVertexImpl{id=72, name=state72}, target=HybridStateVertexImpl{id=75, name=state75}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(75), "Event fired: Add new list...");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[11]/DIV[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save list, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.2, type=submit}}, source=HybridStateVertexImpl{id=75, name=state75}, target=HybridStateVertexImpl{id=78, name=state78}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[11]/DIV[1]/FORM[1]/INPUT[1]"), "updated list"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(76), "Event fired: Save list");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[11]/DIV[1]/FOOTER[1]/A[1], element=Element{node=[A: null], tag=A, text=Add a new card..., attributes={class=add-new, data-reactid=.0.0.1.0.1.0.0.0:$11.0.2.1, href=#}}, source=HybridStateVertexImpl{id=78, name=state78}, target=HybridStateVertexImpl{id=79, name=state79}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(77), "Event fired: Add a new card...");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[11]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/A[1], element=Element{node=[A: null], tag=A, text=cancel, attributes={data-reactid=.0.0.1.0.1.0.0.0:$11.0.2.0.0.4, href=#}}, source=HybridStateVertexImpl{id=79, name=state79}, target=HybridStateVertexImpl{id=78, name=state78}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[11]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/TEXTAREA[1]"), "just a card"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(78), "Event fired: cancel");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[12], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=HybridStateVertexImpl{id=78, name=state78}, target=HybridStateVertexImpl{id=81, name=state81}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(79), "Event fired: Add new list...");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[12]/DIV[1]/FORM[1]/A[1], element=Element{node=[A: null], tag=A, text=cancel, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.4, href=#}}, source=HybridStateVertexImpl{id=81, name=state81}, target=HybridStateVertexImpl{id=78, name=state78}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[12]/DIV[1]/FORM[1]/INPUT[1]"), "updated list"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(80), "Event fired: cancel");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[12]/DIV[1], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=inner, data-reactid=.0.0.1.0.1.0.0.1.0}}, source=HybridStateVertexImpl{id=78, name=state78}, target=HybridStateVertexImpl{id=81, name=state81}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(81), "Event fired: Add new list...");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[12]/DIV[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save list, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.2, type=submit}}, source=HybridStateVertexImpl{id=81, name=state81}, target=HybridStateVertexImpl{id=84, name=state84}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[12]/DIV[1]/FORM[1]/INPUT[1]"), "updated list"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(82), "Event fired: Save list");
			testSuiteHelper.runInCrawlingPlugins(84);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 84");

			testSuiteHelper.addStateToReportBuilder(84);
			
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[12]/DIV[1]/FOOTER[1]/A[1], element=Element{node=[A: null], tag=A, text=Add a new card..., attributes={class=add-new, data-reactid=.0.0.1.0.1.0.0.0:$12.0.2.1, href=#}}, source=HybridStateVertexImpl{id=84, name=state84}, target=HybridStateVertexImpl{id=85, name=state85}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(83), "Event fired: Add a new card...");
			testSuiteHelper.runInCrawlingPlugins(85);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 85");

			testSuiteHelper.addStateToReportBuilder(85);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(85)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(85)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(85)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[12]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/A[1], element=Element{node=[A: null], tag=A, text=cancel, attributes={data-reactid=.0.0.1.0.1.0.0.0:$12.0.2.0.0.4, href=#}}, source=HybridStateVertexImpl{id=85, name=state85}, target=HybridStateVertexImpl{id=84, name=state84}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[12]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/TEXTAREA[1]"), "just a card"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(84), "Event fired: cancel");
			testSuiteHelper.runInCrawlingPlugins(84);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 84");

			testSuiteHelper.addStateToReportBuilder(84);
			
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[13], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=HybridStateVertexImpl{id=84, name=state84}, target=HybridStateVertexImpl{id=87, name=state87}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(85), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(87);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 87");

			testSuiteHelper.addStateToReportBuilder(87);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(87)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(87)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(87)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[13]/DIV[1]/FORM[1]/A[1], element=Element{node=[A: null], tag=A, text=cancel, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.4, href=#}}, source=HybridStateVertexImpl{id=87, name=state87}, target=HybridStateVertexImpl{id=84, name=state84}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[13]/DIV[1]/FORM[1]/INPUT[1]"), "updated list"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(86), "Event fired: cancel");
			testSuiteHelper.runInCrawlingPlugins(84);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 84");

			testSuiteHelper.addStateToReportBuilder(84);
			
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[13]/DIV[1], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=inner, data-reactid=.0.0.1.0.1.0.0.1.0}}, source=HybridStateVertexImpl{id=84, name=state84}, target=HybridStateVertexImpl{id=87, name=state87}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(87), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(87);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 87");

			testSuiteHelper.addStateToReportBuilder(87);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(87)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(87)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(87)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[13]/DIV[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save list, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.2, type=submit}}, source=HybridStateVertexImpl{id=87, name=state87}, target=HybridStateVertexImpl{id=90, name=state90}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[13]/DIV[1]/FORM[1]/INPUT[1]"), "updated list"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(88), "Event fired: Save list");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[13]/DIV[1]/FOOTER[1]/A[1], element=Element{node=[A: null], tag=A, text=Add a new card..., attributes={class=add-new, data-reactid=.0.0.1.0.1.0.0.0:$13.0.2.1, href=#}}, source=HybridStateVertexImpl{id=90, name=state90}, target=HybridStateVertexImpl{id=91, name=state91}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(89), "Event fired: Add a new card...");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[13]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/A[1], element=Element{node=[A: null], tag=A, text=cancel, attributes={data-reactid=.0.0.1.0.1.0.0.0:$13.0.2.0.0.4, href=#}}, source=HybridStateVertexImpl{id=91, name=state91}, target=HybridStateVertexImpl{id=90, name=state90}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[13]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/TEXTAREA[1]"), "just a card"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(90), "Event fired: cancel");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[14], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=HybridStateVertexImpl{id=90, name=state90}, target=HybridStateVertexImpl{id=93, name=state93}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(91), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(93);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 93");

			testSuiteHelper.addStateToReportBuilder(93);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(93)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(93)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(93)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[14]/DIV[1]/FORM[1]/A[1], element=Element{node=[A: null], tag=A, text=cancel, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.4, href=#}}, source=HybridStateVertexImpl{id=93, name=state93}, target=HybridStateVertexImpl{id=90, name=state90}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[14]/DIV[1]/FORM[1]/INPUT[1]"), "updated list"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(92), "Event fired: cancel");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[14]/DIV[1], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=inner, data-reactid=.0.0.1.0.1.0.0.1.0}}, source=HybridStateVertexImpl{id=90, name=state90}, target=HybridStateVertexImpl{id=93, name=state93}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(93), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(93);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 93");

			testSuiteHelper.addStateToReportBuilder(93);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(93)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(93)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(93)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[14]/DIV[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save list, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.2, type=submit}}, source=HybridStateVertexImpl{id=93, name=state93}, target=HybridStateVertexImpl{id=96, name=state96}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[14]/DIV[1]/FORM[1]/INPUT[1]"), "updated list"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(94), "Event fired: Save list");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[14]/DIV[1]/FOOTER[1]/A[1], element=Element{node=[A: null], tag=A, text=Add a new card..., attributes={class=add-new, data-reactid=.0.0.1.0.1.0.0.0:$14.0.2.1, href=#}}, source=HybridStateVertexImpl{id=96, name=state96}, target=HybridStateVertexImpl{id=97, name=state97}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(95), "Event fired: Add a new card...");
			testSuiteHelper.runInCrawlingPlugins(97);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 97");

			testSuiteHelper.addStateToReportBuilder(97);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(97)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(97)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(97)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[14]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/A[1], element=Element{node=[A: null], tag=A, text=cancel, attributes={data-reactid=.0.0.1.0.1.0.0.0:$14.0.2.0.0.4, href=#}}, source=HybridStateVertexImpl{id=97, name=state97}, target=HybridStateVertexImpl{id=96, name=state96}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[14]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/TEXTAREA[1]"), "just a card"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(96), "Event fired: cancel");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[15], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=HybridStateVertexImpl{id=96, name=state96}, target=HybridStateVertexImpl{id=99, name=state99}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(97), "Event fired: Add new list...");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[15]/DIV[1]/FORM[1]/A[1], element=Element{node=[A: null], tag=A, text=cancel, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.4, href=#}}, source=HybridStateVertexImpl{id=99, name=state99}, target=HybridStateVertexImpl{id=96, name=state96}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[15]/DIV[1]/FORM[1]/INPUT[1]"), "updated list"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(98), "Event fired: cancel");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[15]/DIV[1], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=inner, data-reactid=.0.0.1.0.1.0.0.1.0}}, source=HybridStateVertexImpl{id=96, name=state96}, target=HybridStateVertexImpl{id=99, name=state99}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(99), "Event fired: Add new list...");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[15]/DIV[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save list, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.2, type=submit}}, source=HybridStateVertexImpl{id=99, name=state99}, target=HybridStateVertexImpl{id=102, name=state102}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[15]/DIV[1]/FORM[1]/INPUT[1]"), "updated list"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(100), "Event fired: Save list");
			testSuiteHelper.runInCrawlingPlugins(102);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 102");

			testSuiteHelper.addStateToReportBuilder(102);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(102)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(102)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(102)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[15]/DIV[1]/FOOTER[1]/A[1], element=Element{node=[A: null], tag=A, text=Add a new card..., attributes={class=add-new, data-reactid=.0.0.1.0.1.0.0.0:$15.0.2.1, href=#}}, source=HybridStateVertexImpl{id=102, name=state102}, target=HybridStateVertexImpl{id=103, name=state103}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(101), "Event fired: Add a new card...");
			testSuiteHelper.runInCrawlingPlugins(103);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 103");

			testSuiteHelper.addStateToReportBuilder(103);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(103)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(103)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(103)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[15]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/A[1], element=Element{node=[A: null], tag=A, text=cancel, attributes={data-reactid=.0.0.1.0.1.0.0.0:$15.0.2.0.0.4, href=#}}, source=HybridStateVertexImpl{id=103, name=state103}, target=HybridStateVertexImpl{id=102, name=state102}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[15]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/TEXTAREA[1]"), "just a card"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(102), "Event fired: cancel");
			testSuiteHelper.runInCrawlingPlugins(102);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 102");

			testSuiteHelper.addStateToReportBuilder(102);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(102)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(102)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(102)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[16], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=HybridStateVertexImpl{id=102, name=state102}, target=HybridStateVertexImpl{id=105, name=state105}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(103), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(105);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 105");

			testSuiteHelper.addStateToReportBuilder(105);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(105)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(105)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(105)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[16]/DIV[1]/FORM[1]/A[1], element=Element{node=[A: null], tag=A, text=cancel, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.4, href=#}}, source=HybridStateVertexImpl{id=105, name=state105}, target=HybridStateVertexImpl{id=102, name=state102}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[16]/DIV[1]/FORM[1]/INPUT[1]"), "updated list"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(104), "Event fired: cancel");
			testSuiteHelper.runInCrawlingPlugins(102);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 102");

			testSuiteHelper.addStateToReportBuilder(102);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(102)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(102)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(102)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[16]/DIV[1], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=inner, data-reactid=.0.0.1.0.1.0.0.1.0}}, source=HybridStateVertexImpl{id=102, name=state102}, target=HybridStateVertexImpl{id=105, name=state105}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(105), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(105);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 105");

			testSuiteHelper.addStateToReportBuilder(105);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(105)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(105)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(105)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[16]/DIV[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save list, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.2, type=submit}}, source=HybridStateVertexImpl{id=105, name=state105}, target=HybridStateVertexImpl{id=108, name=state108}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[16]/DIV[1]/FORM[1]/INPUT[1]"), "updated list"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(106), "Event fired: Save list");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[16]/DIV[1]/FOOTER[1]/A[1], element=Element{node=[A: null], tag=A, text=Add a new card..., attributes={class=add-new, data-reactid=.0.0.1.0.1.0.0.0:$16.0.2.1, href=#}}, source=HybridStateVertexImpl{id=108, name=state108}, target=HybridStateVertexImpl{id=109, name=state109}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(107), "Event fired: Add a new card...");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[16]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/A[1], element=Element{node=[A: null], tag=A, text=cancel, attributes={data-reactid=.0.0.1.0.1.0.0.0:$16.0.2.0.0.4, href=#}}, source=HybridStateVertexImpl{id=109, name=state109}, target=HybridStateVertexImpl{id=108, name=state108}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[16]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/TEXTAREA[1]"), "just a card"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(108), "Event fired: cancel");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[17], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=HybridStateVertexImpl{id=108, name=state108}, target=HybridStateVertexImpl{id=111, name=state111}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(109), "Event fired: Add new list...");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[17]/DIV[1]/FORM[1]/A[1], element=Element{node=[A: null], tag=A, text=cancel, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.4, href=#}}, source=HybridStateVertexImpl{id=111, name=state111}, target=HybridStateVertexImpl{id=108, name=state108}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[17]/DIV[1]/FORM[1]/INPUT[1]"), "updated list"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(110), "Event fired: cancel");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[17]/DIV[1], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=inner, data-reactid=.0.0.1.0.1.0.0.1.0}}, source=HybridStateVertexImpl{id=108, name=state108}, target=HybridStateVertexImpl{id=111, name=state111}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(111), "Event fired: Add new list...");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[17]/DIV[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save list, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.2, type=submit}}, source=HybridStateVertexImpl{id=111, name=state111}, target=HybridStateVertexImpl{id=114, name=state114}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[17]/DIV[1]/FORM[1]/INPUT[1]"), "updated list"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(112), "Event fired: Save list");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[17]/DIV[1]/FOOTER[1]/A[1], element=Element{node=[A: null], tag=A, text=Add a new card..., attributes={class=add-new, data-reactid=.0.0.1.0.1.0.0.0:$17.0.2.1, href=#}}, source=HybridStateVertexImpl{id=114, name=state114}, target=HybridStateVertexImpl{id=115, name=state115}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(113), "Event fired: Add a new card...");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[17]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/A[1], element=Element{node=[A: null], tag=A, text=cancel, attributes={data-reactid=.0.0.1.0.1.0.0.0:$17.0.2.0.0.4, href=#}}, source=HybridStateVertexImpl{id=115, name=state115}, target=HybridStateVertexImpl{id=114, name=state114}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[17]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/TEXTAREA[1]"), "just a card"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(114), "Event fired: cancel");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[18], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=HybridStateVertexImpl{id=114, name=state114}, target=HybridStateVertexImpl{id=117, name=state117}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(115), "Event fired: Add new list...");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[18]/DIV[1]/FORM[1]/A[1], element=Element{node=[A: null], tag=A, text=cancel, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.4, href=#}}, source=HybridStateVertexImpl{id=117, name=state117}, target=HybridStateVertexImpl{id=114, name=state114}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[18]/DIV[1]/FORM[1]/INPUT[1]"), "updated list"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(116), "Event fired: cancel");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[18]/DIV[1], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=inner, data-reactid=.0.0.1.0.1.0.0.1.0}}, source=HybridStateVertexImpl{id=114, name=state114}, target=HybridStateVertexImpl{id=117, name=state117}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(117), "Event fired: Add new list...");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[18]/DIV[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save list, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.2, type=submit}}, source=HybridStateVertexImpl{id=117, name=state117}, target=HybridStateVertexImpl{id=120, name=state120}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[18]/DIV[1]/FORM[1]/INPUT[1]"), "updated list"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(118), "Event fired: Save list");
			testSuiteHelper.runInCrawlingPlugins(120);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 120");

			testSuiteHelper.addStateToReportBuilder(120);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(120)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(120)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(120)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[18]/DIV[1]/FOOTER[1]/A[1], element=Element{node=[A: null], tag=A, text=Add a new card..., attributes={class=add-new, data-reactid=.0.0.1.0.1.0.0.0:$18.0.2.1, href=#}}, source=HybridStateVertexImpl{id=120, name=state120}, target=HybridStateVertexImpl{id=121, name=state121}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(119), "Event fired: Add a new card...");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[18]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/A[1], element=Element{node=[A: null], tag=A, text=cancel, attributes={data-reactid=.0.0.1.0.1.0.0.0:$18.0.2.0.0.4, href=#}}, source=HybridStateVertexImpl{id=121, name=state121}, target=HybridStateVertexImpl{id=120, name=state120}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[18]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/TEXTAREA[1]"), "just a card"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(120), "Event fired: cancel");
			testSuiteHelper.runInCrawlingPlugins(120);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 120");

			testSuiteHelper.addStateToReportBuilder(120);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(120)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(120)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(120)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[19], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=HybridStateVertexImpl{id=120, name=state120}, target=HybridStateVertexImpl{id=123, name=state123}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(121), "Event fired: Add new list...");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[19]/DIV[1]/FORM[1]/A[1], element=Element{node=[A: null], tag=A, text=cancel, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.4, href=#}}, source=HybridStateVertexImpl{id=123, name=state123}, target=HybridStateVertexImpl{id=120, name=state120}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[19]/DIV[1]/FORM[1]/INPUT[1]"), "updated list"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(122), "Event fired: cancel");
			testSuiteHelper.runInCrawlingPlugins(120);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 120");

			testSuiteHelper.addStateToReportBuilder(120);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(120)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(120)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(120)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[19]/DIV[1], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=inner, data-reactid=.0.0.1.0.1.0.0.1.0}}, source=HybridStateVertexImpl{id=120, name=state120}, target=HybridStateVertexImpl{id=123, name=state123}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(123), "Event fired: Add new list...");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[19]/DIV[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save list, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.2, type=submit}}, source=HybridStateVertexImpl{id=123, name=state123}, target=HybridStateVertexImpl{id=126, name=state126}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[19]/DIV[1]/FORM[1]/INPUT[1]"), "updated list"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(124), "Event fired: Save list");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[19]/DIV[1]/FOOTER[1]/A[1], element=Element{node=[A: null], tag=A, text=Add a new card..., attributes={class=add-new, data-reactid=.0.0.1.0.1.0.0.0:$19.0.2.1, href=#}}, source=HybridStateVertexImpl{id=126, name=state126}, target=HybridStateVertexImpl{id=127, name=state127}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(125), "Event fired: Add a new card...");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[19]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/A[1], element=Element{node=[A: null], tag=A, text=cancel, attributes={data-reactid=.0.0.1.0.1.0.0.0:$19.0.2.0.0.4, href=#}}, source=HybridStateVertexImpl{id=127, name=state127}, target=HybridStateVertexImpl{id=126, name=state126}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[19]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/TEXTAREA[1]"), "just a card"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(126), "Event fired: cancel");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[20], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=HybridStateVertexImpl{id=126, name=state126}, target=HybridStateVertexImpl{id=129, name=state129}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(127), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(129);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 129");

			testSuiteHelper.addStateToReportBuilder(129);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(129)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(129)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(129)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[20]/DIV[1]/FORM[1]/A[1], element=Element{node=[A: null], tag=A, text=cancel, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.4, href=#}}, source=HybridStateVertexImpl{id=129, name=state129}, target=HybridStateVertexImpl{id=126, name=state126}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[20]/DIV[1]/FORM[1]/INPUT[1]"), "updated list"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(128), "Event fired: cancel");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[20]/DIV[1], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=inner, data-reactid=.0.0.1.0.1.0.0.1.0}}, source=HybridStateVertexImpl{id=126, name=state126}, target=HybridStateVertexImpl{id=129, name=state129}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(129), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(129);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 129");

			testSuiteHelper.addStateToReportBuilder(129);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(129)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(129)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(129)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[20]/DIV[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save list, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.2, type=submit}}, source=HybridStateVertexImpl{id=129, name=state129}, target=HybridStateVertexImpl{id=132, name=state132}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[20]/DIV[1]/FORM[1]/INPUT[1]"), "updated list"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(130), "Event fired: Save list");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[20]/DIV[1]/FOOTER[1]/A[1], element=Element{node=[A: null], tag=A, text=Add a new card..., attributes={class=add-new, data-reactid=.0.0.1.0.1.0.0.0:$20.0.2.1, href=#}}, source=HybridStateVertexImpl{id=132, name=state132}, target=HybridStateVertexImpl{id=133, name=state133}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(131), "Event fired: Add a new card...");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[20]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/A[1], element=Element{node=[A: null], tag=A, text=cancel, attributes={data-reactid=.0.0.1.0.1.0.0.0:$20.0.2.0.0.4, href=#}}, source=HybridStateVertexImpl{id=133, name=state133}, target=HybridStateVertexImpl{id=132, name=state132}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[20]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/TEXTAREA[1]"), "just a card"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(132), "Event fired: cancel");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[21], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=HybridStateVertexImpl{id=132, name=state132}, target=HybridStateVertexImpl{id=135, name=state135}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(133), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(135);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 135");

			testSuiteHelper.addStateToReportBuilder(135);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(135)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(135)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(135)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[21]/DIV[1]/FORM[1]/A[1], element=Element{node=[A: null], tag=A, text=cancel, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.4, href=#}}, source=HybridStateVertexImpl{id=135, name=state135}, target=HybridStateVertexImpl{id=132, name=state132}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[21]/DIV[1]/FORM[1]/INPUT[1]"), "updated list"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(134), "Event fired: cancel");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[21]/DIV[1], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=inner, data-reactid=.0.0.1.0.1.0.0.1.0}}, source=HybridStateVertexImpl{id=132, name=state132}, target=HybridStateVertexImpl{id=135, name=state135}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(135), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(135);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 135");

			testSuiteHelper.addStateToReportBuilder(135);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(135)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(135)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(135)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[21]/DIV[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save list, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.2, type=submit}}, source=HybridStateVertexImpl{id=135, name=state135}, target=HybridStateVertexImpl{id=138, name=state138}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[21]/DIV[1]/FORM[1]/INPUT[1]"), "updated list"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(136), "Event fired: Save list");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[21]/DIV[1]/FOOTER[1]/A[1], element=Element{node=[A: null], tag=A, text=Add a new card..., attributes={class=add-new, data-reactid=.0.0.1.0.1.0.0.0:$21.0.2.1, href=#}}, source=HybridStateVertexImpl{id=138, name=state138}, target=HybridStateVertexImpl{id=139, name=state139}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(137), "Event fired: Add a new card...");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[21]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/A[1], element=Element{node=[A: null], tag=A, text=cancel, attributes={data-reactid=.0.0.1.0.1.0.0.0:$21.0.2.0.0.4, href=#}}, source=HybridStateVertexImpl{id=139, name=state139}, target=HybridStateVertexImpl{id=138, name=state138}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[21]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/TEXTAREA[1]"), "just a card"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(138), "Event fired: cancel");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[22], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=HybridStateVertexImpl{id=138, name=state138}, target=HybridStateVertexImpl{id=141, name=state141}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(139), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(141);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 141");

			testSuiteHelper.addStateToReportBuilder(141);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(141)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(141)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(141)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[22]/DIV[1]/FORM[1]/A[1], element=Element{node=[A: null], tag=A, text=cancel, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.4, href=#}}, source=HybridStateVertexImpl{id=141, name=state141}, target=HybridStateVertexImpl{id=138, name=state138}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[22]/DIV[1]/FORM[1]/INPUT[1]"), "updated list"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(140), "Event fired: cancel");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[22]/DIV[1], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=inner, data-reactid=.0.0.1.0.1.0.0.1.0}}, source=HybridStateVertexImpl{id=138, name=state138}, target=HybridStateVertexImpl{id=141, name=state141}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(141), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(141);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 141");

			testSuiteHelper.addStateToReportBuilder(141);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(141)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(141)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(141)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[22]/DIV[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save list, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.2, type=submit}}, source=HybridStateVertexImpl{id=141, name=state141}, target=HybridStateVertexImpl{id=144, name=state144}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[22]/DIV[1]/FORM[1]/INPUT[1]"), "updated list"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(142), "Event fired: Save list");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[22]/DIV[1]/FOOTER[1]/A[1], element=Element{node=[A: null], tag=A, text=Add a new card..., attributes={class=add-new, data-reactid=.0.0.1.0.1.0.0.0:$22.0.2.1, href=#}}, source=HybridStateVertexImpl{id=144, name=state144}, target=HybridStateVertexImpl{id=145, name=state145}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(143), "Event fired: Add a new card...");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[22]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/A[1], element=Element{node=[A: null], tag=A, text=cancel, attributes={data-reactid=.0.0.1.0.1.0.0.0:$22.0.2.0.0.4, href=#}}, source=HybridStateVertexImpl{id=145, name=state145}, target=HybridStateVertexImpl{id=144, name=state144}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[22]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/TEXTAREA[1]"), "just a card"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(144), "Event fired: cancel");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[23], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=HybridStateVertexImpl{id=144, name=state144}, target=HybridStateVertexImpl{id=147, name=state147}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(145), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(147);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 147");

			testSuiteHelper.addStateToReportBuilder(147);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(147)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(147)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(147)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[23]/DIV[1]/FORM[1]/A[1], element=Element{node=[A: null], tag=A, text=cancel, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.4, href=#}}, source=HybridStateVertexImpl{id=147, name=state147}, target=HybridStateVertexImpl{id=144, name=state144}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[23]/DIV[1]/FORM[1]/INPUT[1]"), "updated list"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(146), "Event fired: cancel");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[23]/DIV[1], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=inner, data-reactid=.0.0.1.0.1.0.0.1.0}}, source=HybridStateVertexImpl{id=144, name=state144}, target=HybridStateVertexImpl{id=147, name=state147}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(147), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(147);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 147");

			testSuiteHelper.addStateToReportBuilder(147);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(147)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(147)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(147)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[23]/DIV[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save list, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.2, type=submit}}, source=HybridStateVertexImpl{id=147, name=state147}, target=HybridStateVertexImpl{id=150, name=state150}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[23]/DIV[1]/FORM[1]/INPUT[1]"), "updated list"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(148), "Event fired: Save list");
			testSuiteHelper.runInCrawlingPlugins(150);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 150");

			testSuiteHelper.addStateToReportBuilder(150);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(150)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(150)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(150)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[23]/DIV[1]/FOOTER[1]/A[1], element=Element{node=[A: null], tag=A, text=Add a new card..., attributes={class=add-new, data-reactid=.0.0.1.0.1.0.0.0:$23.0.2.1, href=#}}, source=HybridStateVertexImpl{id=150, name=state150}, target=HybridStateVertexImpl{id=151, name=state151}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(149), "Event fired: Add a new card...");
			testSuiteHelper.runInCrawlingPlugins(151);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 151");

			testSuiteHelper.addStateToReportBuilder(151);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(151)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(151)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(151)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[23]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/A[1], element=Element{node=[A: null], tag=A, text=cancel, attributes={data-reactid=.0.0.1.0.1.0.0.0:$23.0.2.0.0.4, href=#}}, source=HybridStateVertexImpl{id=151, name=state151}, target=HybridStateVertexImpl{id=150, name=state150}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[23]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/TEXTAREA[1]"), "just a card"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(150), "Event fired: cancel");
			testSuiteHelper.runInCrawlingPlugins(150);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 150");

			testSuiteHelper.addStateToReportBuilder(150);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(150)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(150)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(150)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[24], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=HybridStateVertexImpl{id=150, name=state150}, target=HybridStateVertexImpl{id=153, name=state153}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(151), "Event fired: Add new list...");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[24]/DIV[1]/FORM[1]/A[1], element=Element{node=[A: null], tag=A, text=cancel, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.4, href=#}}, source=HybridStateVertexImpl{id=153, name=state153}, target=HybridStateVertexImpl{id=150, name=state150}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[24]/DIV[1]/FORM[1]/INPUT[1]"), "updated list"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(152), "Event fired: cancel");
			testSuiteHelper.runInCrawlingPlugins(150);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 150");

			testSuiteHelper.addStateToReportBuilder(150);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(150)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(150)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(150)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[24]/DIV[1], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=inner, data-reactid=.0.0.1.0.1.0.0.1.0}}, source=HybridStateVertexImpl{id=150, name=state150}, target=HybridStateVertexImpl{id=153, name=state153}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(153), "Event fired: Add new list...");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[24]/DIV[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save list, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.2, type=submit}}, source=HybridStateVertexImpl{id=153, name=state153}, target=HybridStateVertexImpl{id=156, name=state156}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[24]/DIV[1]/FORM[1]/INPUT[1]"), "updated list"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(154), "Event fired: Save list");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[24]/DIV[1]/FOOTER[1]/A[1], element=Element{node=[A: null], tag=A, text=Add a new card..., attributes={class=add-new, data-reactid=.0.0.1.0.1.0.0.0:$24.0.2.1, href=#}}, source=HybridStateVertexImpl{id=156, name=state156}, target=HybridStateVertexImpl{id=157, name=state157}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(155), "Event fired: Add a new card...");
			testSuiteHelper.runInCrawlingPlugins(157);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 157");

			testSuiteHelper.addStateToReportBuilder(157);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(157)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(157)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(157)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[24]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/A[1], element=Element{node=[A: null], tag=A, text=cancel, attributes={data-reactid=.0.0.1.0.1.0.0.0:$24.0.2.0.0.4, href=#}}, source=HybridStateVertexImpl{id=157, name=state157}, target=HybridStateVertexImpl{id=156, name=state156}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[24]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/TEXTAREA[1]"), "just a card"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(156), "Event fired: cancel");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[25], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=HybridStateVertexImpl{id=156, name=state156}, target=HybridStateVertexImpl{id=159, name=state159}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(157), "Event fired: Add new list...");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[25]/DIV[1]/FORM[1]/A[1], element=Element{node=[A: null], tag=A, text=cancel, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.4, href=#}}, source=HybridStateVertexImpl{id=159, name=state159}, target=HybridStateVertexImpl{id=156, name=state156}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[25]/DIV[1]/FORM[1]/INPUT[1]"), "updated list"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(158), "Event fired: cancel");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[25]/DIV[1], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=inner, data-reactid=.0.0.1.0.1.0.0.1.0}}, source=HybridStateVertexImpl{id=156, name=state156}, target=HybridStateVertexImpl{id=159, name=state159}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(159), "Event fired: Add new list...");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[25]/DIV[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save list, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.2, type=submit}}, source=HybridStateVertexImpl{id=159, name=state159}, target=HybridStateVertexImpl{id=162, name=state162}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[25]/DIV[1]/FORM[1]/INPUT[1]"), "updated list"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(160), "Event fired: Save list");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[25]/DIV[1]/FOOTER[1]/A[1], element=Element{node=[A: null], tag=A, text=Add a new card..., attributes={class=add-new, data-reactid=.0.0.1.0.1.0.0.0:$25.0.2.1, href=#}}, source=HybridStateVertexImpl{id=162, name=state162}, target=HybridStateVertexImpl{id=163, name=state163}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(161), "Event fired: Add a new card...");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[25]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/A[1], element=Element{node=[A: null], tag=A, text=cancel, attributes={data-reactid=.0.0.1.0.1.0.0.0:$25.0.2.0.0.4, href=#}}, source=HybridStateVertexImpl{id=163, name=state163}, target=HybridStateVertexImpl{id=162, name=state162}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[25]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/TEXTAREA[1]"), "just a card"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(162), "Event fired: cancel");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[26], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=HybridStateVertexImpl{id=162, name=state162}, target=HybridStateVertexImpl{id=165, name=state165}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(163), "Event fired: Add new list...");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[26]/DIV[1]/FORM[1]/A[1], element=Element{node=[A: null], tag=A, text=cancel, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.4, href=#}}, source=HybridStateVertexImpl{id=165, name=state165}, target=HybridStateVertexImpl{id=162, name=state162}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[26]/DIV[1]/FORM[1]/INPUT[1]"), "updated list"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(164), "Event fired: cancel");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[26]/DIV[1], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=inner, data-reactid=.0.0.1.0.1.0.0.1.0}}, source=HybridStateVertexImpl{id=162, name=state162}, target=HybridStateVertexImpl{id=165, name=state165}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(165), "Event fired: Add new list...");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[26]/DIV[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save list, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.2, type=submit}}, source=HybridStateVertexImpl{id=165, name=state165}, target=HybridStateVertexImpl{id=168, name=state168}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[26]/DIV[1]/FORM[1]/INPUT[1]"), "updated list"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(166), "Event fired: Save list");
			testSuiteHelper.runInCrawlingPlugins(168);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 168");

			testSuiteHelper.addStateToReportBuilder(168);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(168)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(168)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(168)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[26]/DIV[1]/FOOTER[1]/A[1], element=Element{node=[A: null], tag=A, text=Add a new card..., attributes={class=add-new, data-reactid=.0.0.1.0.1.0.0.0:$26.0.2.1, href=#}}, source=HybridStateVertexImpl{id=168, name=state168}, target=HybridStateVertexImpl{id=169, name=state169}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(167), "Event fired: Add a new card...");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[26]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/A[1], element=Element{node=[A: null], tag=A, text=cancel, attributes={data-reactid=.0.0.1.0.1.0.0.0:$26.0.2.0.0.4, href=#}}, source=HybridStateVertexImpl{id=169, name=state169}, target=HybridStateVertexImpl{id=168, name=state168}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[26]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/TEXTAREA[1]"), "just a card"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(168), "Event fired: cancel");
			testSuiteHelper.runInCrawlingPlugins(168);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 168");

			testSuiteHelper.addStateToReportBuilder(168);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(168)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(168)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(168)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[27], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=HybridStateVertexImpl{id=168, name=state168}, target=HybridStateVertexImpl{id=171, name=state171}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(169), "Event fired: Add new list...");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[27]/DIV[1]/FORM[1]/A[1], element=Element{node=[A: null], tag=A, text=cancel, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.4, href=#}}, source=HybridStateVertexImpl{id=171, name=state171}, target=HybridStateVertexImpl{id=168, name=state168}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[27]/DIV[1]/FORM[1]/INPUT[1]"), "updated list"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(170), "Event fired: cancel");
			testSuiteHelper.runInCrawlingPlugins(168);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 168");

			testSuiteHelper.addStateToReportBuilder(168);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(168)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(168)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(168)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[27]/DIV[1], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=inner, data-reactid=.0.0.1.0.1.0.0.1.0}}, source=HybridStateVertexImpl{id=168, name=state168}, target=HybridStateVertexImpl{id=171, name=state171}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(171), "Event fired: Add new list...");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[27]/DIV[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save list, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.2, type=submit}}, source=HybridStateVertexImpl{id=171, name=state171}, target=HybridStateVertexImpl{id=174, name=state174}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[27]/DIV[1]/FORM[1]/INPUT[1]"), "updated list"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(172), "Event fired: Save list");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[27]/DIV[1]/FOOTER[1]/A[1], element=Element{node=[A: null], tag=A, text=Add a new card..., attributes={class=add-new, data-reactid=.0.0.1.0.1.0.0.0:$27.0.2.1, href=#}}, source=HybridStateVertexImpl{id=174, name=state174}, target=HybridStateVertexImpl{id=175, name=state175}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(173), "Event fired: Add a new card...");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[27]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/A[1], element=Element{node=[A: null], tag=A, text=cancel, attributes={data-reactid=.0.0.1.0.1.0.0.0:$27.0.2.0.0.4, href=#}}, source=HybridStateVertexImpl{id=175, name=state175}, target=HybridStateVertexImpl{id=174, name=state174}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[27]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/TEXTAREA[1]"), "just a card"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(174), "Event fired: cancel");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[28], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=HybridStateVertexImpl{id=174, name=state174}, target=HybridStateVertexImpl{id=177, name=state177}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(175), "Event fired: Add new list...");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[28]/DIV[1]/FORM[1]/A[1], element=Element{node=[A: null], tag=A, text=cancel, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.4, href=#}}, source=HybridStateVertexImpl{id=177, name=state177}, target=HybridStateVertexImpl{id=174, name=state174}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[28]/DIV[1]/FORM[1]/INPUT[1]"), "updated list"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(176), "Event fired: cancel");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[28]/DIV[1], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=inner, data-reactid=.0.0.1.0.1.0.0.1.0}}, source=HybridStateVertexImpl{id=174, name=state174}, target=HybridStateVertexImpl{id=177, name=state177}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(177), "Event fired: Add new list...");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[28]/DIV[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save list, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.2, type=submit}}, source=HybridStateVertexImpl{id=177, name=state177}, target=HybridStateVertexImpl{id=180, name=state180}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[28]/DIV[1]/FORM[1]/INPUT[1]"), "updated list"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(178), "Event fired: Save list");
			testSuiteHelper.runInCrawlingPlugins(180);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 180");

			testSuiteHelper.addStateToReportBuilder(180);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(180)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(180)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(180)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[28]/DIV[1]/FOOTER[1]/A[1], element=Element{node=[A: null], tag=A, text=Add a new card..., attributes={class=add-new, data-reactid=.0.0.1.0.1.0.0.0:$28.0.2.1, href=#}}, source=HybridStateVertexImpl{id=180, name=state180}, target=HybridStateVertexImpl{id=181, name=state181}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(179), "Event fired: Add a new card...");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[28]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/A[1], element=Element{node=[A: null], tag=A, text=cancel, attributes={data-reactid=.0.0.1.0.1.0.0.0:$28.0.2.0.0.4, href=#}}, source=HybridStateVertexImpl{id=181, name=state181}, target=HybridStateVertexImpl{id=180, name=state180}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[28]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/TEXTAREA[1]"), "just a card"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(180), "Event fired: cancel");
			testSuiteHelper.runInCrawlingPlugins(180);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 180");

			testSuiteHelper.addStateToReportBuilder(180);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(180)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(180)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(180)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[29], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=HybridStateVertexImpl{id=180, name=state180}, target=HybridStateVertexImpl{id=183, name=state183}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(181), "Event fired: Add new list...");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[29]/DIV[1]/FORM[1]/A[1], element=Element{node=[A: null], tag=A, text=cancel, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.4, href=#}}, source=HybridStateVertexImpl{id=183, name=state183}, target=HybridStateVertexImpl{id=180, name=state180}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[29]/DIV[1]/FORM[1]/INPUT[1]"), "updated list"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(182), "Event fired: cancel");
			testSuiteHelper.runInCrawlingPlugins(180);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 180");

			testSuiteHelper.addStateToReportBuilder(180);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(180)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(180)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(180)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[29]/DIV[1], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=inner, data-reactid=.0.0.1.0.1.0.0.1.0}}, source=HybridStateVertexImpl{id=180, name=state180}, target=HybridStateVertexImpl{id=183, name=state183}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(183), "Event fired: Add new list...");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[29]/DIV[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save list, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.2, type=submit}}, source=HybridStateVertexImpl{id=183, name=state183}, target=HybridStateVertexImpl{id=186, name=state186}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[29]/DIV[1]/FORM[1]/INPUT[1]"), "updated list"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(184), "Event fired: Save list");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[29]/DIV[1]/FOOTER[1]/A[1], element=Element{node=[A: null], tag=A, text=Add a new card..., attributes={class=add-new, data-reactid=.0.0.1.0.1.0.0.0:$29.0.2.1, href=#}}, source=HybridStateVertexImpl{id=186, name=state186}, target=HybridStateVertexImpl{id=187, name=state187}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(185), "Event fired: Add a new card...");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[29]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/A[1], element=Element{node=[A: null], tag=A, text=cancel, attributes={data-reactid=.0.0.1.0.1.0.0.0:$29.0.2.0.0.4, href=#}}, source=HybridStateVertexImpl{id=187, name=state187}, target=HybridStateVertexImpl{id=186, name=state186}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[29]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/TEXTAREA[1]"), "just a card"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(186), "Event fired: cancel");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[30], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=HybridStateVertexImpl{id=186, name=state186}, target=HybridStateVertexImpl{id=189, name=state189}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(187), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(189);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 189");

			testSuiteHelper.addStateToReportBuilder(189);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(189)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(189)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(189)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[30]/DIV[1]/FORM[1]/A[1], element=Element{node=[A: null], tag=A, text=cancel, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.4, href=#}}, source=HybridStateVertexImpl{id=189, name=state189}, target=HybridStateVertexImpl{id=186, name=state186}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[30]/DIV[1]/FORM[1]/INPUT[1]"), "updated list"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(188), "Event fired: cancel");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[30]/DIV[1], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=inner, data-reactid=.0.0.1.0.1.0.0.1.0}}, source=HybridStateVertexImpl{id=186, name=state186}, target=HybridStateVertexImpl{id=189, name=state189}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(189), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(189);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 189");

			testSuiteHelper.addStateToReportBuilder(189);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(189)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(189)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(189)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[30]/DIV[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save list, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.2, type=submit}}, source=HybridStateVertexImpl{id=189, name=state189}, target=HybridStateVertexImpl{id=192, name=state192}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[30]/DIV[1]/FORM[1]/INPUT[1]"), "updated list"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(190), "Event fired: Save list");
			testSuiteHelper.runInCrawlingPlugins(192);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 192");

			testSuiteHelper.addStateToReportBuilder(192);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(192)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(192)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(192)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[30]/DIV[1]/FOOTER[1]/A[1], element=Element{node=[A: null], tag=A, text=Add a new card..., attributes={class=add-new, data-reactid=.0.0.1.0.1.0.0.0:$30.0.2.1, href=#}}, source=HybridStateVertexImpl{id=192, name=state192}, target=HybridStateVertexImpl{id=193, name=state193}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(191), "Event fired: Add a new card...");
			testSuiteHelper.runInCrawlingPlugins(193);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 193");

			testSuiteHelper.addStateToReportBuilder(193);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(193)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(193)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(193)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[30]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/A[1], element=Element{node=[A: null], tag=A, text=cancel, attributes={data-reactid=.0.0.1.0.1.0.0.0:$30.0.2.0.0.4, href=#}}, source=HybridStateVertexImpl{id=193, name=state193}, target=HybridStateVertexImpl{id=192, name=state192}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[30]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/TEXTAREA[1]"), "just a card"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(192), "Event fired: cancel");
			testSuiteHelper.runInCrawlingPlugins(192);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 192");

			testSuiteHelper.addStateToReportBuilder(192);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(192)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(192)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(192)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[31], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=HybridStateVertexImpl{id=192, name=state192}, target=HybridStateVertexImpl{id=195, name=state195}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(193), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(195);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 195");

			testSuiteHelper.addStateToReportBuilder(195);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(195)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(195)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(195)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[31]/DIV[1]/FORM[1]/A[1], element=Element{node=[A: null], tag=A, text=cancel, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.4, href=#}}, source=HybridStateVertexImpl{id=195, name=state195}, target=HybridStateVertexImpl{id=192, name=state192}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[31]/DIV[1]/FORM[1]/INPUT[1]"), "updated list"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(194), "Event fired: cancel");
			testSuiteHelper.runInCrawlingPlugins(192);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 192");

			testSuiteHelper.addStateToReportBuilder(192);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(192)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(192)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(192)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[31]/DIV[1], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=inner, data-reactid=.0.0.1.0.1.0.0.1.0}}, source=HybridStateVertexImpl{id=192, name=state192}, target=HybridStateVertexImpl{id=195, name=state195}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(195), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(195);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 195");

			testSuiteHelper.addStateToReportBuilder(195);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(195)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(195)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(195)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[31]/DIV[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save list, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.2, type=submit}}, source=HybridStateVertexImpl{id=195, name=state195}, target=HybridStateVertexImpl{id=198, name=state198}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[31]/DIV[1]/FORM[1]/INPUT[1]"), "updated list"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(196), "Event fired: Save list");
			testSuiteHelper.runInCrawlingPlugins(198);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 198");

			testSuiteHelper.addStateToReportBuilder(198);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(198)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(198)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(198)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[31]/DIV[1]/FOOTER[1]/A[1], element=Element{node=[A: null], tag=A, text=Add a new card..., attributes={class=add-new, data-reactid=.0.0.1.0.1.0.0.0:$31.0.2.1, href=#}}, source=HybridStateVertexImpl{id=198, name=state198}, target=HybridStateVertexImpl{id=199, name=state199}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(197), "Event fired: Add a new card...");
			testSuiteHelper.runInCrawlingPlugins(199);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 199");

			testSuiteHelper.addStateToReportBuilder(199);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(199)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(199)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(199)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[31]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/A[1], element=Element{node=[A: null], tag=A, text=cancel, attributes={data-reactid=.0.0.1.0.1.0.0.0:$31.0.2.0.0.4, href=#}}, source=HybridStateVertexImpl{id=199, name=state199}, target=HybridStateVertexImpl{id=198, name=state198}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[31]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/TEXTAREA[1]"), "just a card"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(198), "Event fired: cancel");
			testSuiteHelper.runInCrawlingPlugins(198);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 198");

			testSuiteHelper.addStateToReportBuilder(198);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(198)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(198)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(198)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[32], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=HybridStateVertexImpl{id=198, name=state198}, target=HybridStateVertexImpl{id=201, name=state201}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(199), "Event fired: Add new list...");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[32]/DIV[1]/FORM[1]/A[1], element=Element{node=[A: null], tag=A, text=cancel, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.4, href=#}}, source=HybridStateVertexImpl{id=201, name=state201}, target=HybridStateVertexImpl{id=198, name=state198}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[32]/DIV[1]/FORM[1]/INPUT[1]"), "updated list"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(200), "Event fired: cancel");
			testSuiteHelper.runInCrawlingPlugins(198);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 198");

			testSuiteHelper.addStateToReportBuilder(198);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(198)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(198)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(198)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[32]/DIV[1], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=inner, data-reactid=.0.0.1.0.1.0.0.1.0}}, source=HybridStateVertexImpl{id=198, name=state198}, target=HybridStateVertexImpl{id=201, name=state201}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(201), "Event fired: Add new list...");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[32]/DIV[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save list, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.2, type=submit}}, source=HybridStateVertexImpl{id=201, name=state201}, target=HybridStateVertexImpl{id=204, name=state204}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[32]/DIV[1]/FORM[1]/INPUT[1]"), "updated list"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(202), "Event fired: Save list");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[32]/DIV[1]/FOOTER[1]/A[1], element=Element{node=[A: null], tag=A, text=Add a new card..., attributes={class=add-new, data-reactid=.0.0.1.0.1.0.0.0:$32.0.2.1, href=#}}, source=HybridStateVertexImpl{id=204, name=state204}, target=HybridStateVertexImpl{id=205, name=state205}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(203), "Event fired: Add a new card...");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[32]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/A[1], element=Element{node=[A: null], tag=A, text=cancel, attributes={data-reactid=.0.0.1.0.1.0.0.0:$32.0.2.0.0.4, href=#}}, source=HybridStateVertexImpl{id=205, name=state205}, target=HybridStateVertexImpl{id=204, name=state204}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[32]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/TEXTAREA[1]"), "just a card"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(204), "Event fired: cancel");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[33], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=HybridStateVertexImpl{id=204, name=state204}, target=HybridStateVertexImpl{id=207, name=state207}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(205), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(207);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 207");

			testSuiteHelper.addStateToReportBuilder(207);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(207)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(207)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(207)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[33]/DIV[1]/FORM[1]/A[1], element=Element{node=[A: null], tag=A, text=cancel, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.4, href=#}}, source=HybridStateVertexImpl{id=207, name=state207}, target=HybridStateVertexImpl{id=204, name=state204}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[33]/DIV[1]/FORM[1]/INPUT[1]"), "updated list"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(206), "Event fired: cancel");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[33]/DIV[1], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=inner, data-reactid=.0.0.1.0.1.0.0.1.0}}, source=HybridStateVertexImpl{id=204, name=state204}, target=HybridStateVertexImpl{id=207, name=state207}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(207), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(207);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 207");

			testSuiteHelper.addStateToReportBuilder(207);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(207)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(207)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(207)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[33]/DIV[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save list, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.2, type=submit}}, source=HybridStateVertexImpl{id=207, name=state207}, target=HybridStateVertexImpl{id=210, name=state210}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[33]/DIV[1]/FORM[1]/INPUT[1]"), "updated list"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(208), "Event fired: Save list");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[33]/DIV[1]/FOOTER[1]/A[1], element=Element{node=[A: null], tag=A, text=Add a new card..., attributes={class=add-new, data-reactid=.0.0.1.0.1.0.0.0:$33.0.2.1, href=#}}, source=HybridStateVertexImpl{id=210, name=state210}, target=HybridStateVertexImpl{id=211, name=state211}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(209), "Event fired: Add a new card...");
			testSuiteHelper.runInCrawlingPlugins(211);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 211");

			testSuiteHelper.addStateToReportBuilder(211);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(211)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(211)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(211)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[33]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/A[1], element=Element{node=[A: null], tag=A, text=cancel, attributes={data-reactid=.0.0.1.0.1.0.0.0:$33.0.2.0.0.4, href=#}}, source=HybridStateVertexImpl{id=211, name=state211}, target=HybridStateVertexImpl{id=210, name=state210}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[33]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/TEXTAREA[1]"), "just a card"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(210), "Event fired: cancel");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[34], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=HybridStateVertexImpl{id=210, name=state210}, target=HybridStateVertexImpl{id=213, name=state213}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(211), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(213);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 213");

			testSuiteHelper.addStateToReportBuilder(213);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(213)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(213)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(213)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[34]/DIV[1]/FORM[1]/A[1], element=Element{node=[A: null], tag=A, text=cancel, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.4, href=#}}, source=HybridStateVertexImpl{id=213, name=state213}, target=HybridStateVertexImpl{id=210, name=state210}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[34]/DIV[1]/FORM[1]/INPUT[1]"), "updated list"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(212), "Event fired: cancel");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[34]/DIV[1], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=inner, data-reactid=.0.0.1.0.1.0.0.1.0}}, source=HybridStateVertexImpl{id=210, name=state210}, target=HybridStateVertexImpl{id=213, name=state213}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(213), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(213);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 213");

			testSuiteHelper.addStateToReportBuilder(213);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(213)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(213)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(213)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[34]/DIV[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save list, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.2, type=submit}}, source=HybridStateVertexImpl{id=213, name=state213}, target=HybridStateVertexImpl{id=216, name=state216}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[34]/DIV[1]/FORM[1]/INPUT[1]"), "updated list"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(214), "Event fired: Save list");
			testSuiteHelper.runInCrawlingPlugins(216);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 216");

			testSuiteHelper.addStateToReportBuilder(216);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(216)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(216)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(216)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[34]/DIV[1]/FOOTER[1]/A[1], element=Element{node=[A: null], tag=A, text=Add a new card..., attributes={class=add-new, data-reactid=.0.0.1.0.1.0.0.0:$34.0.2.1, href=#}}, source=HybridStateVertexImpl{id=216, name=state216}, target=HybridStateVertexImpl{id=217, name=state217}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(215), "Event fired: Add a new card...");
			testSuiteHelper.runInCrawlingPlugins(217);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 217");

			testSuiteHelper.addStateToReportBuilder(217);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(217)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(217)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(217)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[34]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/A[1], element=Element{node=[A: null], tag=A, text=cancel, attributes={data-reactid=.0.0.1.0.1.0.0.0:$34.0.2.0.0.4, href=#}}, source=HybridStateVertexImpl{id=217, name=state217}, target=HybridStateVertexImpl{id=216, name=state216}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[34]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/TEXTAREA[1]"), "just a card"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(216), "Event fired: cancel");
			testSuiteHelper.runInCrawlingPlugins(216);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 216");

			testSuiteHelper.addStateToReportBuilder(216);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(216)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(216)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(216)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[35], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=HybridStateVertexImpl{id=216, name=state216}, target=HybridStateVertexImpl{id=219, name=state219}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(217), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(219);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 219");

			testSuiteHelper.addStateToReportBuilder(219);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(219)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(219)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(219)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[35]/DIV[1]/FORM[1]/A[1], element=Element{node=[A: null], tag=A, text=cancel, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.4, href=#}}, source=HybridStateVertexImpl{id=219, name=state219}, target=HybridStateVertexImpl{id=216, name=state216}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[35]/DIV[1]/FORM[1]/INPUT[1]"), "updated list"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(218), "Event fired: cancel");
			testSuiteHelper.runInCrawlingPlugins(216);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 216");

			testSuiteHelper.addStateToReportBuilder(216);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(216)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(216)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(216)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[35]/DIV[1], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=inner, data-reactid=.0.0.1.0.1.0.0.1.0}}, source=HybridStateVertexImpl{id=216, name=state216}, target=HybridStateVertexImpl{id=219, name=state219}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(219), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(219);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 219");

			testSuiteHelper.addStateToReportBuilder(219);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(219)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(219)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(219)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[35]/DIV[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save list, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.2, type=submit}}, source=HybridStateVertexImpl{id=219, name=state219}, target=HybridStateVertexImpl{id=222, name=state222}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[35]/DIV[1]/FORM[1]/INPUT[1]"), "updated list"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(220), "Event fired: Save list");
			testSuiteHelper.runInCrawlingPlugins(222);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 222");

			testSuiteHelper.addStateToReportBuilder(222);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(222)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(222)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(222)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[35]/DIV[1]/FOOTER[1]/A[1], element=Element{node=[A: null], tag=A, text=Add a new card..., attributes={class=add-new, data-reactid=.0.0.1.0.1.0.0.0:$35.0.2.1, href=#}}, source=HybridStateVertexImpl{id=222, name=state222}, target=HybridStateVertexImpl{id=223, name=state223}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(221), "Event fired: Add a new card...");
			testSuiteHelper.runInCrawlingPlugins(223);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 223");

			testSuiteHelper.addStateToReportBuilder(223);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(223)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(223)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(223)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[35]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/A[1], element=Element{node=[A: null], tag=A, text=cancel, attributes={data-reactid=.0.0.1.0.1.0.0.0:$35.0.2.0.0.4, href=#}}, source=HybridStateVertexImpl{id=223, name=state223}, target=HybridStateVertexImpl{id=222, name=state222}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[35]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/TEXTAREA[1]"), "just a card"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(222), "Event fired: cancel");
			testSuiteHelper.runInCrawlingPlugins(222);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 222");

			testSuiteHelper.addStateToReportBuilder(222);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(222)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(222)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(222)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[36], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=HybridStateVertexImpl{id=222, name=state222}, target=HybridStateVertexImpl{id=225, name=state225}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(223), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(225);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 225");

			testSuiteHelper.addStateToReportBuilder(225);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(225)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(225)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(225)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[36]/DIV[1]/FORM[1]/A[1], element=Element{node=[A: null], tag=A, text=cancel, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.4, href=#}}, source=HybridStateVertexImpl{id=225, name=state225}, target=HybridStateVertexImpl{id=222, name=state222}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[36]/DIV[1]/FORM[1]/INPUT[1]"), "updated list"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(224), "Event fired: cancel");
			testSuiteHelper.runInCrawlingPlugins(222);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 222");

			testSuiteHelper.addStateToReportBuilder(222);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(222)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(222)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(222)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[36]/DIV[1], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=inner, data-reactid=.0.0.1.0.1.0.0.1.0}}, source=HybridStateVertexImpl{id=222, name=state222}, target=HybridStateVertexImpl{id=225, name=state225}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(225), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(225);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 225");

			testSuiteHelper.addStateToReportBuilder(225);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(225)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(225)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(225)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[36]/DIV[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save list, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.2, type=submit}}, source=HybridStateVertexImpl{id=225, name=state225}, target=HybridStateVertexImpl{id=228, name=state228}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[36]/DIV[1]/FORM[1]/INPUT[1]"), "updated list"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(226), "Event fired: Save list");
			testSuiteHelper.runInCrawlingPlugins(228);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 228");

			testSuiteHelper.addStateToReportBuilder(228);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(228)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(228)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(228)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[36]/DIV[1]/FOOTER[1]/A[1], element=Element{node=[A: null], tag=A, text=Add a new card..., attributes={class=add-new, data-reactid=.0.0.1.0.1.0.0.0:$36.0.2.1, href=#}}, source=HybridStateVertexImpl{id=228, name=state228}, target=HybridStateVertexImpl{id=229, name=state229}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(227), "Event fired: Add a new card...");
			testSuiteHelper.runInCrawlingPlugins(229);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 229");

			testSuiteHelper.addStateToReportBuilder(229);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(229)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(229)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(229)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[36]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/A[1], element=Element{node=[A: null], tag=A, text=cancel, attributes={data-reactid=.0.0.1.0.1.0.0.0:$36.0.2.0.0.4, href=#}}, source=HybridStateVertexImpl{id=229, name=state229}, target=HybridStateVertexImpl{id=228, name=state228}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[36]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/TEXTAREA[1]"), "just a card"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(228), "Event fired: cancel");
			testSuiteHelper.runInCrawlingPlugins(228);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 228");

			testSuiteHelper.addStateToReportBuilder(228);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(228)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(228)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(228)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[37], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=HybridStateVertexImpl{id=228, name=state228}, target=HybridStateVertexImpl{id=231, name=state231}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(229), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(231);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 231");

			testSuiteHelper.addStateToReportBuilder(231);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(231)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(231)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(231)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[37]/DIV[1]/FORM[1]/A[1], element=Element{node=[A: null], tag=A, text=cancel, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.4, href=#}}, source=HybridStateVertexImpl{id=231, name=state231}, target=HybridStateVertexImpl{id=228, name=state228}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[37]/DIV[1]/FORM[1]/INPUT[1]"), "updated list"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(230), "Event fired: cancel");
			testSuiteHelper.runInCrawlingPlugins(228);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 228");

			testSuiteHelper.addStateToReportBuilder(228);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(228)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(228)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(228)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[37]/DIV[1], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=inner, data-reactid=.0.0.1.0.1.0.0.1.0}}, source=HybridStateVertexImpl{id=228, name=state228}, target=HybridStateVertexImpl{id=231, name=state231}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(231), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(231);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 231");

			testSuiteHelper.addStateToReportBuilder(231);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(231)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(231)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(231)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[37]/DIV[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save list, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.2, type=submit}}, source=HybridStateVertexImpl{id=231, name=state231}, target=HybridStateVertexImpl{id=234, name=state234}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[37]/DIV[1]/FORM[1]/INPUT[1]"), "updated list"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(232), "Event fired: Save list");
			testSuiteHelper.runInCrawlingPlugins(234);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 234");

			testSuiteHelper.addStateToReportBuilder(234);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(234)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(234)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(234)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[37]/DIV[1]/FOOTER[1]/A[1], element=Element{node=[A: null], tag=A, text=Add a new card..., attributes={class=add-new, data-reactid=.0.0.1.0.1.0.0.0:$37.0.2.1, href=#}}, source=HybridStateVertexImpl{id=234, name=state234}, target=HybridStateVertexImpl{id=235, name=state235}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(233), "Event fired: Add a new card...");
			testSuiteHelper.runInCrawlingPlugins(235);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 235");

			testSuiteHelper.addStateToReportBuilder(235);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(235)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(235)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(235)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[37]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/A[1], element=Element{node=[A: null], tag=A, text=cancel, attributes={data-reactid=.0.0.1.0.1.0.0.0:$37.0.2.0.0.4, href=#}}, source=HybridStateVertexImpl{id=235, name=state235}, target=HybridStateVertexImpl{id=234, name=state234}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[37]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/TEXTAREA[1]"), "just a card"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(234), "Event fired: cancel");
			testSuiteHelper.runInCrawlingPlugins(234);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 234");

			testSuiteHelper.addStateToReportBuilder(234);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(234)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(234)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(234)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[38], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=HybridStateVertexImpl{id=234, name=state234}, target=HybridStateVertexImpl{id=237, name=state237}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(235), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(237);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 237");

			testSuiteHelper.addStateToReportBuilder(237);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(237)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(237)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(237)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[38]/DIV[1]/FORM[1]/A[1], element=Element{node=[A: null], tag=A, text=cancel, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.4, href=#}}, source=HybridStateVertexImpl{id=237, name=state237}, target=HybridStateVertexImpl{id=234, name=state234}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[38]/DIV[1]/FORM[1]/INPUT[1]"), "updated list"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(236), "Event fired: cancel");
			testSuiteHelper.runInCrawlingPlugins(234);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 234");

			testSuiteHelper.addStateToReportBuilder(234);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(234)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(234)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(234)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[38]/DIV[1], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=inner, data-reactid=.0.0.1.0.1.0.0.1.0}}, source=HybridStateVertexImpl{id=234, name=state234}, target=HybridStateVertexImpl{id=237, name=state237}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(237), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(237);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 237");

			testSuiteHelper.addStateToReportBuilder(237);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(237)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(237)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(237)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[38]/DIV[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save list, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.2, type=submit}}, source=HybridStateVertexImpl{id=237, name=state237}, target=HybridStateVertexImpl{id=240, name=state240}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[38]/DIV[1]/FORM[1]/INPUT[1]"), "updated list"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(238), "Event fired: Save list");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[38]/DIV[1]/FOOTER[1]/A[1], element=Element{node=[A: null], tag=A, text=Add a new card..., attributes={class=add-new, data-reactid=.0.0.1.0.1.0.0.0:$38.0.2.1, href=#}}, source=HybridStateVertexImpl{id=240, name=state240}, target=HybridStateVertexImpl{id=241, name=state241}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(239), "Event fired: Add a new card...");
			testSuiteHelper.runInCrawlingPlugins(241);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 241");

			testSuiteHelper.addStateToReportBuilder(241);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(241)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(241)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(241)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[38]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/A[1], element=Element{node=[A: null], tag=A, text=cancel, attributes={data-reactid=.0.0.1.0.1.0.0.0:$38.0.2.0.0.4, href=#}}, source=HybridStateVertexImpl{id=241, name=state241}, target=HybridStateVertexImpl{id=240, name=state240}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[38]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/TEXTAREA[1]"), "just a card"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(240), "Event fired: cancel");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[39], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=HybridStateVertexImpl{id=240, name=state240}, target=HybridStateVertexImpl{id=243, name=state243}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(241), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(243);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 243");

			testSuiteHelper.addStateToReportBuilder(243);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(243)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(243)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(243)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[39]/DIV[1]/FORM[1]/A[1], element=Element{node=[A: null], tag=A, text=cancel, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.4, href=#}}, source=HybridStateVertexImpl{id=243, name=state243}, target=HybridStateVertexImpl{id=240, name=state240}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[39]/DIV[1]/FORM[1]/INPUT[1]"), "updated list"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(242), "Event fired: cancel");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[39]/DIV[1], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=inner, data-reactid=.0.0.1.0.1.0.0.1.0}}, source=HybridStateVertexImpl{id=240, name=state240}, target=HybridStateVertexImpl{id=243, name=state243}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(243), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(243);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 243");

			testSuiteHelper.addStateToReportBuilder(243);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(243)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(243)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(243)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[39]/DIV[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save list, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.2, type=submit}}, source=HybridStateVertexImpl{id=243, name=state243}, target=HybridStateVertexImpl{id=246, name=state246}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[39]/DIV[1]/FORM[1]/INPUT[1]"), "updated list"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(244), "Event fired: Save list");
			testSuiteHelper.runInCrawlingPlugins(246);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 246");

			testSuiteHelper.addStateToReportBuilder(246);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(246)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(246)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(246)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[39]/DIV[1]/FOOTER[1]/A[1], element=Element{node=[A: null], tag=A, text=Add a new card..., attributes={class=add-new, data-reactid=.0.0.1.0.1.0.0.0:$39.0.2.1, href=#}}, source=HybridStateVertexImpl{id=246, name=state246}, target=HybridStateVertexImpl{id=247, name=state247}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(245), "Event fired: Add a new card...");
			testSuiteHelper.runInCrawlingPlugins(247);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 247");

			testSuiteHelper.addStateToReportBuilder(247);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(247)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(247)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(247)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[39]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/A[1], element=Element{node=[A: null], tag=A, text=cancel, attributes={data-reactid=.0.0.1.0.1.0.0.0:$39.0.2.0.0.4, href=#}}, source=HybridStateVertexImpl{id=247, name=state247}, target=HybridStateVertexImpl{id=246, name=state246}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[39]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/TEXTAREA[1]"), "just a card"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(246), "Event fired: cancel");
			testSuiteHelper.runInCrawlingPlugins(246);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 246");

			testSuiteHelper.addStateToReportBuilder(246);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(246)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(246)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(246)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[40], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=HybridStateVertexImpl{id=246, name=state246}, target=HybridStateVertexImpl{id=249, name=state249}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(247), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(249);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 249");

			testSuiteHelper.addStateToReportBuilder(249);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(249)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(249)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(249)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[40]/DIV[1]/FORM[1]/A[1], element=Element{node=[A: null], tag=A, text=cancel, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.4, href=#}}, source=HybridStateVertexImpl{id=249, name=state249}, target=HybridStateVertexImpl{id=246, name=state246}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[40]/DIV[1]/FORM[1]/INPUT[1]"), "updated list"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(248), "Event fired: cancel");
			testSuiteHelper.runInCrawlingPlugins(246);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 246");

			testSuiteHelper.addStateToReportBuilder(246);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(246)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(246)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(246)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[40]/DIV[1], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=inner, data-reactid=.0.0.1.0.1.0.0.1.0}}, source=HybridStateVertexImpl{id=246, name=state246}, target=HybridStateVertexImpl{id=249, name=state249}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(249), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(249);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 249");

			testSuiteHelper.addStateToReportBuilder(249);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(249)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(249)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(249)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[40]/DIV[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save list, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.2, type=submit}}, source=HybridStateVertexImpl{id=249, name=state249}, target=HybridStateVertexImpl{id=252, name=state252}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[40]/DIV[1]/FORM[1]/INPUT[1]"), "updated list"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(250), "Event fired: Save list");
			testSuiteHelper.runInCrawlingPlugins(252);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 252");

			testSuiteHelper.addStateToReportBuilder(252);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(252)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(252)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(252)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[40]/DIV[1]/FOOTER[1]/A[1], element=Element{node=[A: null], tag=A, text=Add a new card..., attributes={class=add-new, data-reactid=.0.0.1.0.1.0.0.0:$40.0.2.1, href=#}}, source=HybridStateVertexImpl{id=252, name=state252}, target=HybridStateVertexImpl{id=253, name=state253}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(251), "Event fired: Add a new card...");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[40]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/A[1], element=Element{node=[A: null], tag=A, text=cancel, attributes={data-reactid=.0.0.1.0.1.0.0.0:$40.0.2.0.0.4, href=#}}, source=HybridStateVertexImpl{id=253, name=state253}, target=HybridStateVertexImpl{id=252, name=state252}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[40]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/TEXTAREA[1]"), "just a card"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(252), "Event fired: cancel");
			testSuiteHelper.runInCrawlingPlugins(252);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 252");

			testSuiteHelper.addStateToReportBuilder(252);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(252)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(252)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(252)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[41], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=HybridStateVertexImpl{id=252, name=state252}, target=HybridStateVertexImpl{id=255, name=state255}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(253), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(255);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 255");

			testSuiteHelper.addStateToReportBuilder(255);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(255)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(255)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(255)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[41]/DIV[1]/FORM[1]/A[1], element=Element{node=[A: null], tag=A, text=cancel, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.4, href=#}}, source=HybridStateVertexImpl{id=255, name=state255}, target=HybridStateVertexImpl{id=252, name=state252}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[41]/DIV[1]/FORM[1]/INPUT[1]"), "updated list"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(254), "Event fired: cancel");
			testSuiteHelper.runInCrawlingPlugins(252);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 252");

			testSuiteHelper.addStateToReportBuilder(252);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(252)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(252)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(252)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[41]/DIV[1], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=inner, data-reactid=.0.0.1.0.1.0.0.1.0}}, source=HybridStateVertexImpl{id=252, name=state252}, target=HybridStateVertexImpl{id=255, name=state255}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(255), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(255);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 255");

			testSuiteHelper.addStateToReportBuilder(255);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(255)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(255)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(255)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[41]/DIV[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save list, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.2, type=submit}}, source=HybridStateVertexImpl{id=255, name=state255}, target=HybridStateVertexImpl{id=258, name=state258}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[41]/DIV[1]/FORM[1]/INPUT[1]"), "updated list"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(256), "Event fired: Save list");
			testSuiteHelper.runInCrawlingPlugins(258);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 258");

			testSuiteHelper.addStateToReportBuilder(258);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(258)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(258)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(258)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[41]/DIV[1]/FOOTER[1]/A[1], element=Element{node=[A: null], tag=A, text=Add a new card..., attributes={class=add-new, data-reactid=.0.0.1.0.1.0.0.0:$41.0.2.1, href=#}}, source=HybridStateVertexImpl{id=258, name=state258}, target=HybridStateVertexImpl{id=259, name=state259}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(257), "Event fired: Add a new card...");
			testSuiteHelper.runInCrawlingPlugins(259);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 259");

			testSuiteHelper.addStateToReportBuilder(259);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(259)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(259)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(259)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[41]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/A[1], element=Element{node=[A: null], tag=A, text=cancel, attributes={data-reactid=.0.0.1.0.1.0.0.0:$41.0.2.0.0.4, href=#}}, source=HybridStateVertexImpl{id=259, name=state259}, target=HybridStateVertexImpl{id=258, name=state258}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[41]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/TEXTAREA[1]"), "just a card"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(258), "Event fired: cancel");
			testSuiteHelper.runInCrawlingPlugins(258);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 258");

			testSuiteHelper.addStateToReportBuilder(258);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(258)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(258)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(258)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[42], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=HybridStateVertexImpl{id=258, name=state258}, target=HybridStateVertexImpl{id=261, name=state261}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(259), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(261);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 261");

			testSuiteHelper.addStateToReportBuilder(261);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(261)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(261)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(261)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[42]/DIV[1]/FORM[1]/A[1], element=Element{node=[A: null], tag=A, text=cancel, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.4, href=#}}, source=HybridStateVertexImpl{id=261, name=state261}, target=HybridStateVertexImpl{id=258, name=state258}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[42]/DIV[1]/FORM[1]/INPUT[1]"), "updated list"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(260), "Event fired: cancel");
			testSuiteHelper.runInCrawlingPlugins(258);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 258");

			testSuiteHelper.addStateToReportBuilder(258);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(258)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(258)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(258)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[42]/DIV[1], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=inner, data-reactid=.0.0.1.0.1.0.0.1.0}}, source=HybridStateVertexImpl{id=258, name=state258}, target=HybridStateVertexImpl{id=261, name=state261}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(261), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(261);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 261");

			testSuiteHelper.addStateToReportBuilder(261);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(261)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(261)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(261)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[42]/DIV[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save list, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.2, type=submit}}, source=HybridStateVertexImpl{id=261, name=state261}, target=HybridStateVertexImpl{id=264, name=state264}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[42]/DIV[1]/FORM[1]/INPUT[1]"), "updated list"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(262), "Event fired: Save list");
			testSuiteHelper.runInCrawlingPlugins(264);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 264");

			testSuiteHelper.addStateToReportBuilder(264);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(264)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(264)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(264)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[42]/DIV[1]/FOOTER[1]/A[1], element=Element{node=[A: null], tag=A, text=Add a new card..., attributes={class=add-new, data-reactid=.0.0.1.0.1.0.0.0:$42.0.2.1, href=#}}, source=HybridStateVertexImpl{id=264, name=state264}, target=HybridStateVertexImpl{id=265, name=state265}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(263), "Event fired: Add a new card...");
			testSuiteHelper.runInCrawlingPlugins(265);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 265");

			testSuiteHelper.addStateToReportBuilder(265);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(265)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(265)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(265)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[42]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/A[1], element=Element{node=[A: null], tag=A, text=cancel, attributes={data-reactid=.0.0.1.0.1.0.0.0:$42.0.2.0.0.4, href=#}}, source=HybridStateVertexImpl{id=265, name=state265}, target=HybridStateVertexImpl{id=264, name=state264}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[42]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/TEXTAREA[1]"), "just a card"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(264), "Event fired: cancel");
			testSuiteHelper.runInCrawlingPlugins(264);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 264");

			testSuiteHelper.addStateToReportBuilder(264);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(264)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(264)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(264)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[43], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=HybridStateVertexImpl{id=264, name=state264}, target=HybridStateVertexImpl{id=267, name=state267}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(265), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(267);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 267");

			testSuiteHelper.addStateToReportBuilder(267);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(267)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(267)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(267)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[43]/DIV[1]/FORM[1]/A[1], element=Element{node=[A: null], tag=A, text=cancel, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.4, href=#}}, source=HybridStateVertexImpl{id=267, name=state267}, target=HybridStateVertexImpl{id=264, name=state264}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[43]/DIV[1]/FORM[1]/INPUT[1]"), "updated list"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(266), "Event fired: cancel");
			testSuiteHelper.runInCrawlingPlugins(264);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 264");

			testSuiteHelper.addStateToReportBuilder(264);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(264)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(264)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(264)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[43]/DIV[1], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=inner, data-reactid=.0.0.1.0.1.0.0.1.0}}, source=HybridStateVertexImpl{id=264, name=state264}, target=HybridStateVertexImpl{id=267, name=state267}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(267), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(267);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 267");

			testSuiteHelper.addStateToReportBuilder(267);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(267)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(267)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(267)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[43]/DIV[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save list, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.2, type=submit}}, source=HybridStateVertexImpl{id=267, name=state267}, target=HybridStateVertexImpl{id=270, name=state270}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[43]/DIV[1]/FORM[1]/INPUT[1]"), "updated list"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(268), "Event fired: Save list");
			testSuiteHelper.runInCrawlingPlugins(270);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 270");

			testSuiteHelper.addStateToReportBuilder(270);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(270)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(270)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(270)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[43]/DIV[1]/FOOTER[1]/A[1], element=Element{node=[A: null], tag=A, text=Add a new card..., attributes={class=add-new, data-reactid=.0.0.1.0.1.0.0.0:$43.0.2.1, href=#}}, source=HybridStateVertexImpl{id=270, name=state270}, target=HybridStateVertexImpl{id=271, name=state271}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(269), "Event fired: Add a new card...");
			testSuiteHelper.runInCrawlingPlugins(271);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 271");

			testSuiteHelper.addStateToReportBuilder(271);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(271)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(271)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(271)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[43]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/A[1], element=Element{node=[A: null], tag=A, text=cancel, attributes={data-reactid=.0.0.1.0.1.0.0.0:$43.0.2.0.0.4, href=#}}, source=HybridStateVertexImpl{id=271, name=state271}, target=HybridStateVertexImpl{id=270, name=state270}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[43]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/TEXTAREA[1]"), "just a card"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(270), "Event fired: cancel");
			testSuiteHelper.runInCrawlingPlugins(270);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 270");

			testSuiteHelper.addStateToReportBuilder(270);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(270)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(270)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(270)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[44], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=HybridStateVertexImpl{id=270, name=state270}, target=HybridStateVertexImpl{id=273, name=state273}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(271), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(273);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 273");

			testSuiteHelper.addStateToReportBuilder(273);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(273)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(273)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(273)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[44]/DIV[1]/FORM[1]/A[1], element=Element{node=[A: null], tag=A, text=cancel, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.4, href=#}}, source=HybridStateVertexImpl{id=273, name=state273}, target=HybridStateVertexImpl{id=270, name=state270}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[44]/DIV[1]/FORM[1]/INPUT[1]"), "updated list"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(272), "Event fired: cancel");
			testSuiteHelper.runInCrawlingPlugins(270);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 270");

			testSuiteHelper.addStateToReportBuilder(270);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(270)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(270)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(270)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[44]/DIV[1], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=inner, data-reactid=.0.0.1.0.1.0.0.1.0}}, source=HybridStateVertexImpl{id=270, name=state270}, target=HybridStateVertexImpl{id=273, name=state273}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(273), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(273);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 273");

			testSuiteHelper.addStateToReportBuilder(273);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(273)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(273)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(273)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[44]/DIV[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save list, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.2, type=submit}}, source=HybridStateVertexImpl{id=273, name=state273}, target=HybridStateVertexImpl{id=276, name=state276}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[44]/DIV[1]/FORM[1]/INPUT[1]"), "updated list"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(274), "Event fired: Save list");
			testSuiteHelper.runInCrawlingPlugins(276);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 276");

			testSuiteHelper.addStateToReportBuilder(276);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(276)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(276)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(276)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[44]/DIV[1]/FOOTER[1]/A[1], element=Element{node=[A: null], tag=A, text=Add a new card..., attributes={class=add-new, data-reactid=.0.0.1.0.1.0.0.0:$44.0.2.1, href=#}}, source=HybridStateVertexImpl{id=276, name=state276}, target=HybridStateVertexImpl{id=277, name=state277}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(275), "Event fired: Add a new card...");
			testSuiteHelper.runInCrawlingPlugins(277);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 277");

			testSuiteHelper.addStateToReportBuilder(277);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(277)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(277)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(277)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[44]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/A[1], element=Element{node=[A: null], tag=A, text=cancel, attributes={data-reactid=.0.0.1.0.1.0.0.0:$44.0.2.0.0.4, href=#}}, source=HybridStateVertexImpl{id=277, name=state277}, target=HybridStateVertexImpl{id=276, name=state276}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[44]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/TEXTAREA[1]"), "just a card"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(276), "Event fired: cancel");
			testSuiteHelper.runInCrawlingPlugins(276);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 276");

			testSuiteHelper.addStateToReportBuilder(276);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(276)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(276)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(276)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[45], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=HybridStateVertexImpl{id=276, name=state276}, target=HybridStateVertexImpl{id=279, name=state279}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(277), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(279);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 279");

			testSuiteHelper.addStateToReportBuilder(279);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(279)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(279)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(279)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[45]/DIV[1]/FORM[1]/A[1], element=Element{node=[A: null], tag=A, text=cancel, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.4, href=#}}, source=HybridStateVertexImpl{id=279, name=state279}, target=HybridStateVertexImpl{id=276, name=state276}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[45]/DIV[1]/FORM[1]/INPUT[1]"), "updated list"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(278), "Event fired: cancel");
			testSuiteHelper.runInCrawlingPlugins(276);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 276");

			testSuiteHelper.addStateToReportBuilder(276);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(276)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(276)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(276)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[45]/DIV[1], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=inner, data-reactid=.0.0.1.0.1.0.0.1.0}}, source=HybridStateVertexImpl{id=276, name=state276}, target=HybridStateVertexImpl{id=279, name=state279}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(279), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(279);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 279");

			testSuiteHelper.addStateToReportBuilder(279);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(279)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(279)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(279)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[45]/DIV[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save list, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.2, type=submit}}, source=HybridStateVertexImpl{id=279, name=state279}, target=HybridStateVertexImpl{id=282, name=state282}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[45]/DIV[1]/FORM[1]/INPUT[1]"), "updated list"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(280), "Event fired: Save list");
			testSuiteHelper.runInCrawlingPlugins(282);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 282");

			testSuiteHelper.addStateToReportBuilder(282);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(282)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(282)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(282)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[45]/DIV[1]/FOOTER[1]/A[1], element=Element{node=[A: null], tag=A, text=Add a new card..., attributes={class=add-new, data-reactid=.0.0.1.0.1.0.0.0:$45.0.2.1, href=#}}, source=HybridStateVertexImpl{id=282, name=state282}, target=HybridStateVertexImpl{id=283, name=state283}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(281), "Event fired: Add a new card...");
			testSuiteHelper.runInCrawlingPlugins(283);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 283");

			testSuiteHelper.addStateToReportBuilder(283);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(283)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(283)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(283)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[45]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/A[1], element=Element{node=[A: null], tag=A, text=cancel, attributes={data-reactid=.0.0.1.0.1.0.0.0:$45.0.2.0.0.4, href=#}}, source=HybridStateVertexImpl{id=283, name=state283}, target=HybridStateVertexImpl{id=282, name=state282}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[45]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/TEXTAREA[1]"), "just a card"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(282), "Event fired: cancel");
			testSuiteHelper.runInCrawlingPlugins(282);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 282");

			testSuiteHelper.addStateToReportBuilder(282);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(282)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(282)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(282)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[46], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=HybridStateVertexImpl{id=282, name=state282}, target=HybridStateVertexImpl{id=285, name=state285}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(283), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(285);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 285");

			testSuiteHelper.addStateToReportBuilder(285);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(285)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(285)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(285)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[46]/DIV[1]/FORM[1]/A[1], element=Element{node=[A: null], tag=A, text=cancel, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.4, href=#}}, source=HybridStateVertexImpl{id=285, name=state285}, target=HybridStateVertexImpl{id=282, name=state282}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[46]/DIV[1]/FORM[1]/INPUT[1]"), "updated list"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(284), "Event fired: cancel");
			testSuiteHelper.runInCrawlingPlugins(282);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 282");

			testSuiteHelper.addStateToReportBuilder(282);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(282)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(282)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(282)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[46]/DIV[1], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=inner, data-reactid=.0.0.1.0.1.0.0.1.0}}, source=HybridStateVertexImpl{id=282, name=state282}, target=HybridStateVertexImpl{id=285, name=state285}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(285), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(285);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 285");

			testSuiteHelper.addStateToReportBuilder(285);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(285)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(285)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(285)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[46]/DIV[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save list, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.2, type=submit}}, source=HybridStateVertexImpl{id=285, name=state285}, target=HybridStateVertexImpl{id=288, name=state288}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[46]/DIV[1]/FORM[1]/INPUT[1]"), "updated list"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(286), "Event fired: Save list");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[46]/DIV[1]/FOOTER[1]/A[1], element=Element{node=[A: null], tag=A, text=Add a new card..., attributes={class=add-new, data-reactid=.0.0.1.0.1.0.0.0:$46.0.2.1, href=#}}, source=HybridStateVertexImpl{id=288, name=state288}, target=HybridStateVertexImpl{id=289, name=state289}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(287), "Event fired: Add a new card...");
			testSuiteHelper.runInCrawlingPlugins(289);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 289");

			testSuiteHelper.addStateToReportBuilder(289);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(289)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(289)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(289)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[46]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/A[1], element=Element{node=[A: null], tag=A, text=cancel, attributes={data-reactid=.0.0.1.0.1.0.0.0:$46.0.2.0.0.4, href=#}}, source=HybridStateVertexImpl{id=289, name=state289}, target=HybridStateVertexImpl{id=288, name=state288}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[46]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/TEXTAREA[1]"), "just a card"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(288), "Event fired: cancel");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[47], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=HybridStateVertexImpl{id=288, name=state288}, target=HybridStateVertexImpl{id=291, name=state291}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(289), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(291);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 291");

			testSuiteHelper.addStateToReportBuilder(291);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(291)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(291)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(291)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[47]/DIV[1]/FORM[1]/A[1], element=Element{node=[A: null], tag=A, text=cancel, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.4, href=#}}, source=HybridStateVertexImpl{id=291, name=state291}, target=HybridStateVertexImpl{id=288, name=state288}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[47]/DIV[1]/FORM[1]/INPUT[1]"), "updated list"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(290), "Event fired: cancel");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[47]/DIV[1], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=inner, data-reactid=.0.0.1.0.1.0.0.1.0}}, source=HybridStateVertexImpl{id=288, name=state288}, target=HybridStateVertexImpl{id=291, name=state291}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(291), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(291);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 291");

			testSuiteHelper.addStateToReportBuilder(291);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(291)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(291)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(291)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[47]/DIV[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save list, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.2, type=submit}}, source=HybridStateVertexImpl{id=291, name=state291}, target=HybridStateVertexImpl{id=294, name=state294}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[47]/DIV[1]/FORM[1]/INPUT[1]"), "updated list"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(292), "Event fired: Save list");
			testSuiteHelper.runInCrawlingPlugins(294);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 294");

			testSuiteHelper.addStateToReportBuilder(294);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(294)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(294)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(294)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[47]/DIV[1]/FOOTER[1]/A[1], element=Element{node=[A: null], tag=A, text=Add a new card..., attributes={class=add-new, data-reactid=.0.0.1.0.1.0.0.0:$47.0.2.1, href=#}}, source=HybridStateVertexImpl{id=294, name=state294}, target=HybridStateVertexImpl{id=295, name=state295}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(293), "Event fired: Add a new card...");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[47]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/A[1], element=Element{node=[A: null], tag=A, text=cancel, attributes={data-reactid=.0.0.1.0.1.0.0.0:$47.0.2.0.0.4, href=#}}, source=HybridStateVertexImpl{id=295, name=state295}, target=HybridStateVertexImpl{id=294, name=state294}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[47]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/TEXTAREA[1]"), "just a card"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(294), "Event fired: cancel");
			testSuiteHelper.runInCrawlingPlugins(294);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 294");

			testSuiteHelper.addStateToReportBuilder(294);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(294)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(294)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(294)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[48], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=HybridStateVertexImpl{id=294, name=state294}, target=HybridStateVertexImpl{id=297, name=state297}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(295), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(297);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 297");

			testSuiteHelper.addStateToReportBuilder(297);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(297)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(297)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(297)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[48]/DIV[1]/FORM[1]/A[1], element=Element{node=[A: null], tag=A, text=cancel, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.4, href=#}}, source=HybridStateVertexImpl{id=297, name=state297}, target=HybridStateVertexImpl{id=294, name=state294}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[48]/DIV[1]/FORM[1]/INPUT[1]"), "updated list"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(296), "Event fired: cancel");
			testSuiteHelper.runInCrawlingPlugins(294);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 294");

			testSuiteHelper.addStateToReportBuilder(294);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(294)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(294)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(294)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[48]/DIV[1], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=inner, data-reactid=.0.0.1.0.1.0.0.1.0}}, source=HybridStateVertexImpl{id=294, name=state294}, target=HybridStateVertexImpl{id=297, name=state297}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(297), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(297);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 297");

			testSuiteHelper.addStateToReportBuilder(297);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(297)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(297)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(297)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[48]/DIV[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save list, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.2, type=submit}}, source=HybridStateVertexImpl{id=297, name=state297}, target=HybridStateVertexImpl{id=300, name=state300}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[48]/DIV[1]/FORM[1]/INPUT[1]"), "updated list"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(298), "Event fired: Save list");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[48]/DIV[1]/FOOTER[1]/A[1], element=Element{node=[A: null], tag=A, text=Add a new card..., attributes={class=add-new, data-reactid=.0.0.1.0.1.0.0.0:$48.0.2.1, href=#}}, source=HybridStateVertexImpl{id=300, name=state300}, target=HybridStateVertexImpl{id=301, name=state301}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(299), "Event fired: Add a new card...");
			testSuiteHelper.runInCrawlingPlugins(301);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 301");

			testSuiteHelper.addStateToReportBuilder(301);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(301)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(301)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(301)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[48]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/A[1], element=Element{node=[A: null], tag=A, text=cancel, attributes={data-reactid=.0.0.1.0.1.0.0.0:$48.0.2.0.0.4, href=#}}, source=HybridStateVertexImpl{id=301, name=state301}, target=HybridStateVertexImpl{id=300, name=state300}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[48]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/TEXTAREA[1]"), "just a card"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(300), "Event fired: cancel");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[49], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=HybridStateVertexImpl{id=300, name=state300}, target=HybridStateVertexImpl{id=303, name=state303}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(301), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(303);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 303");

			testSuiteHelper.addStateToReportBuilder(303);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(303)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(303)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(303)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[49]/DIV[1]/FORM[1]/A[1], element=Element{node=[A: null], tag=A, text=cancel, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.4, href=#}}, source=HybridStateVertexImpl{id=303, name=state303}, target=HybridStateVertexImpl{id=300, name=state300}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[49]/DIV[1]/FORM[1]/INPUT[1]"), "updated list"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(302), "Event fired: cancel");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[49]/DIV[1], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=inner, data-reactid=.0.0.1.0.1.0.0.1.0}}, source=HybridStateVertexImpl{id=300, name=state300}, target=HybridStateVertexImpl{id=303, name=state303}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(303), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(303);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 303");

			testSuiteHelper.addStateToReportBuilder(303);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(303)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(303)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(303)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[49]/DIV[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save list, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.2, type=submit}}, source=HybridStateVertexImpl{id=303, name=state303}, target=HybridStateVertexImpl{id=306, name=state306}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[49]/DIV[1]/FORM[1]/INPUT[1]"), "updated list"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(304), "Event fired: Save list");
			testSuiteHelper.runInCrawlingPlugins(306);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 306");

			testSuiteHelper.addStateToReportBuilder(306);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(306)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(306)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(306)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[49]/DIV[1]/FOOTER[1]/A[1], element=Element{node=[A: null], tag=A, text=Add a new card..., attributes={class=add-new, data-reactid=.0.0.1.0.1.0.0.0:$49.0.2.1, href=#}}, source=HybridStateVertexImpl{id=306, name=state306}, target=HybridStateVertexImpl{id=307, name=state307}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(305), "Event fired: Add a new card...");
			testSuiteHelper.runInCrawlingPlugins(307);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 307");

			testSuiteHelper.addStateToReportBuilder(307);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(307)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(307)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(307)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[49]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/A[1], element=Element{node=[A: null], tag=A, text=cancel, attributes={data-reactid=.0.0.1.0.1.0.0.0:$49.0.2.0.0.4, href=#}}, source=HybridStateVertexImpl{id=307, name=state307}, target=HybridStateVertexImpl{id=306, name=state306}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[49]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/TEXTAREA[1]"), "just a card"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(306), "Event fired: cancel");
			testSuiteHelper.runInCrawlingPlugins(306);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 306");

			testSuiteHelper.addStateToReportBuilder(306);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(306)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(306)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(306)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[50], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=HybridStateVertexImpl{id=306, name=state306}, target=HybridStateVertexImpl{id=309, name=state309}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(307), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(309);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 309");

			testSuiteHelper.addStateToReportBuilder(309);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(309)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(309)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(309)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[50]/DIV[1]/FORM[1]/A[1], element=Element{node=[A: null], tag=A, text=cancel, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.4, href=#}}, source=HybridStateVertexImpl{id=309, name=state309}, target=HybridStateVertexImpl{id=306, name=state306}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[50]/DIV[1]/FORM[1]/INPUT[1]"), "updated list"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(308), "Event fired: cancel");
			testSuiteHelper.runInCrawlingPlugins(306);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 306");

			testSuiteHelper.addStateToReportBuilder(306);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(306)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(306)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(306)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[50]/DIV[1], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=inner, data-reactid=.0.0.1.0.1.0.0.1.0}}, source=HybridStateVertexImpl{id=306, name=state306}, target=HybridStateVertexImpl{id=309, name=state309}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(309), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(309);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 309");

			testSuiteHelper.addStateToReportBuilder(309);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(309)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(309)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(309)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[50]/DIV[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save list, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.2, type=submit}}, source=HybridStateVertexImpl{id=309, name=state309}, target=HybridStateVertexImpl{id=312, name=state312}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[50]/DIV[1]/FORM[1]/INPUT[1]"), "updated list"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(310), "Event fired: Save list");
			testSuiteHelper.runInCrawlingPlugins(312);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 312");

			testSuiteHelper.addStateToReportBuilder(312);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(312)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(312)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(312)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[50]/DIV[1]/FOOTER[1]/A[1], element=Element{node=[A: null], tag=A, text=Add a new card..., attributes={class=add-new, data-reactid=.0.0.1.0.1.0.0.0:$50.0.2.1, href=#}}, source=HybridStateVertexImpl{id=312, name=state312}, target=HybridStateVertexImpl{id=313, name=state313}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(311), "Event fired: Add a new card...");
			testSuiteHelper.runInCrawlingPlugins(313);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 313");

			testSuiteHelper.addStateToReportBuilder(313);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(313)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(313)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(313)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[50]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/A[1], element=Element{node=[A: null], tag=A, text=cancel, attributes={data-reactid=.0.0.1.0.1.0.0.0:$50.0.2.0.0.4, href=#}}, source=HybridStateVertexImpl{id=313, name=state313}, target=HybridStateVertexImpl{id=312, name=state312}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[50]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/TEXTAREA[1]"), "just a card"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(312), "Event fired: cancel");
			testSuiteHelper.runInCrawlingPlugins(312);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 312");

			testSuiteHelper.addStateToReportBuilder(312);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(312)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(312)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(312)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[51], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=HybridStateVertexImpl{id=312, name=state312}, target=HybridStateVertexImpl{id=315, name=state315}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(313), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(315);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 315");

			testSuiteHelper.addStateToReportBuilder(315);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(315)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(315)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(315)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[51]/DIV[1]/FORM[1]/A[1], element=Element{node=[A: null], tag=A, text=cancel, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.4, href=#}}, source=HybridStateVertexImpl{id=315, name=state315}, target=HybridStateVertexImpl{id=312, name=state312}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[51]/DIV[1]/FORM[1]/INPUT[1]"), "updated list"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(314), "Event fired: cancel");
			testSuiteHelper.runInCrawlingPlugins(312);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 312");

			testSuiteHelper.addStateToReportBuilder(312);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(312)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(312)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(312)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[51]/DIV[1], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=inner, data-reactid=.0.0.1.0.1.0.0.1.0}}, source=HybridStateVertexImpl{id=312, name=state312}, target=HybridStateVertexImpl{id=315, name=state315}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(315), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(315);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 315");

			testSuiteHelper.addStateToReportBuilder(315);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(315)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(315)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(315)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[51]/DIV[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save list, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.2, type=submit}}, source=HybridStateVertexImpl{id=315, name=state315}, target=HybridStateVertexImpl{id=318, name=state318}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[51]/DIV[1]/FORM[1]/INPUT[1]"), "updated list"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(316), "Event fired: Save list");
			testSuiteHelper.runInCrawlingPlugins(318);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 318");

			testSuiteHelper.addStateToReportBuilder(318);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(318)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(318)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(318)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[51]/DIV[1]/FOOTER[1]/A[1], element=Element{node=[A: null], tag=A, text=Add a new card..., attributes={class=add-new, data-reactid=.0.0.1.0.1.0.0.0:$51.0.2.1, href=#}}, source=HybridStateVertexImpl{id=318, name=state318}, target=HybridStateVertexImpl{id=319, name=state319}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(317), "Event fired: Add a new card...");
			testSuiteHelper.runInCrawlingPlugins(319);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 319");

			testSuiteHelper.addStateToReportBuilder(319);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(319)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(319)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(319)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[51]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/A[1], element=Element{node=[A: null], tag=A, text=cancel, attributes={data-reactid=.0.0.1.0.1.0.0.0:$51.0.2.0.0.4, href=#}}, source=HybridStateVertexImpl{id=319, name=state319}, target=HybridStateVertexImpl{id=318, name=state318}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[51]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/TEXTAREA[1]"), "just a card"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(318), "Event fired: cancel");
			testSuiteHelper.runInCrawlingPlugins(318);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 318");

			testSuiteHelper.addStateToReportBuilder(318);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(318)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(318)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(318)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[52], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=HybridStateVertexImpl{id=318, name=state318}, target=HybridStateVertexImpl{id=321, name=state321}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(319), "Event fired: Add new list...");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[52]/DIV[1]/FORM[1]/A[1], element=Element{node=[A: null], tag=A, text=cancel, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.4, href=#}}, source=HybridStateVertexImpl{id=321, name=state321}, target=HybridStateVertexImpl{id=318, name=state318}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[52]/DIV[1]/FORM[1]/INPUT[1]"), "updated list"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(320), "Event fired: cancel");
			testSuiteHelper.runInCrawlingPlugins(318);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 318");

			testSuiteHelper.addStateToReportBuilder(318);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(318)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(318)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(318)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[52]/DIV[1], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=inner, data-reactid=.0.0.1.0.1.0.0.1.0}}, source=HybridStateVertexImpl{id=318, name=state318}, target=HybridStateVertexImpl{id=321, name=state321}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(321), "Event fired: Add new list...");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[52]/DIV[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save list, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.2, type=submit}}, source=HybridStateVertexImpl{id=321, name=state321}, target=HybridStateVertexImpl{id=324, name=state324}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[52]/DIV[1]/FORM[1]/INPUT[1]"), "updated list"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(322), "Event fired: Save list");
			testSuiteHelper.runInCrawlingPlugins(324);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 324");

			testSuiteHelper.addStateToReportBuilder(324);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(324)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(324)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(324)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[52]/DIV[1]/FOOTER[1]/A[1], element=Element{node=[A: null], tag=A, text=Add a new card..., attributes={class=add-new, data-reactid=.0.0.1.0.1.0.0.0:$52.0.2.1, href=#}}, source=HybridStateVertexImpl{id=324, name=state324}, target=HybridStateVertexImpl{id=325, name=state325}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(323), "Event fired: Add a new card...");
			testSuiteHelper.runInCrawlingPlugins(325);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 325");

			testSuiteHelper.addStateToReportBuilder(325);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(325)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(325)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(325)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[52]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/A[1], element=Element{node=[A: null], tag=A, text=cancel, attributes={data-reactid=.0.0.1.0.1.0.0.0:$52.0.2.0.0.4, href=#}}, source=HybridStateVertexImpl{id=325, name=state325}, target=HybridStateVertexImpl{id=324, name=state324}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[52]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/TEXTAREA[1]"), "just a card"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(324), "Event fired: cancel");
			testSuiteHelper.runInCrawlingPlugins(324);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 324");

			testSuiteHelper.addStateToReportBuilder(324);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(324)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(324)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(324)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[53], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=HybridStateVertexImpl{id=324, name=state324}, target=HybridStateVertexImpl{id=327, name=state327}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(325), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(327);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 327");

			testSuiteHelper.addStateToReportBuilder(327);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(327)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(327)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(327)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[53]/DIV[1]/FORM[1]/A[1], element=Element{node=[A: null], tag=A, text=cancel, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.4, href=#}}, source=HybridStateVertexImpl{id=327, name=state327}, target=HybridStateVertexImpl{id=324, name=state324}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[53]/DIV[1]/FORM[1]/INPUT[1]"), "updated list"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(326), "Event fired: cancel");
			testSuiteHelper.runInCrawlingPlugins(324);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 324");

			testSuiteHelper.addStateToReportBuilder(324);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(324)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(324)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(324)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[53]/DIV[1], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=inner, data-reactid=.0.0.1.0.1.0.0.1.0}}, source=HybridStateVertexImpl{id=324, name=state324}, target=HybridStateVertexImpl{id=327, name=state327}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(327), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(327);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 327");

			testSuiteHelper.addStateToReportBuilder(327);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(327)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(327)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(327)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[53]/DIV[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save list, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.2, type=submit}}, source=HybridStateVertexImpl{id=327, name=state327}, target=HybridStateVertexImpl{id=330, name=state330}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[53]/DIV[1]/FORM[1]/INPUT[1]"), "updated list"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(328), "Event fired: Save list");
			testSuiteHelper.runInCrawlingPlugins(330);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 330");

			testSuiteHelper.addStateToReportBuilder(330);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(330)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(330)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(330)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[53]/DIV[1]/FOOTER[1]/A[1], element=Element{node=[A: null], tag=A, text=Add a new card..., attributes={class=add-new, data-reactid=.0.0.1.0.1.0.0.0:$53.0.2.1, href=#}}, source=HybridStateVertexImpl{id=330, name=state330}, target=HybridStateVertexImpl{id=331, name=state331}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(329), "Event fired: Add a new card...");
			testSuiteHelper.runInCrawlingPlugins(331);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 331");

			testSuiteHelper.addStateToReportBuilder(331);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(331)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(331)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(331)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[53]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/A[1], element=Element{node=[A: null], tag=A, text=cancel, attributes={data-reactid=.0.0.1.0.1.0.0.0:$53.0.2.0.0.4, href=#}}, source=HybridStateVertexImpl{id=331, name=state331}, target=HybridStateVertexImpl{id=330, name=state330}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[53]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/TEXTAREA[1]"), "just a card"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(330), "Event fired: cancel");
			testSuiteHelper.runInCrawlingPlugins(330);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 330");

			testSuiteHelper.addStateToReportBuilder(330);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(330)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(330)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(330)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[54], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=HybridStateVertexImpl{id=330, name=state330}, target=HybridStateVertexImpl{id=333, name=state333}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(331), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(333);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 333");

			testSuiteHelper.addStateToReportBuilder(333);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(333)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(333)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(333)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[54]/DIV[1]/FORM[1]/A[1], element=Element{node=[A: null], tag=A, text=cancel, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.4, href=#}}, source=HybridStateVertexImpl{id=333, name=state333}, target=HybridStateVertexImpl{id=330, name=state330}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[54]/DIV[1]/FORM[1]/INPUT[1]"), "updated list"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(332), "Event fired: cancel");
			testSuiteHelper.runInCrawlingPlugins(330);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 330");

			testSuiteHelper.addStateToReportBuilder(330);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(330)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(330)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(330)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[54]/DIV[1], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=inner, data-reactid=.0.0.1.0.1.0.0.1.0}}, source=HybridStateVertexImpl{id=330, name=state330}, target=HybridStateVertexImpl{id=333, name=state333}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(333), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(333);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 333");

			testSuiteHelper.addStateToReportBuilder(333);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(333)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(333)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(333)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[54]/DIV[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save list, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.2, type=submit}}, source=HybridStateVertexImpl{id=333, name=state333}, target=HybridStateVertexImpl{id=336, name=state336}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[54]/DIV[1]/FORM[1]/INPUT[1]"), "updated list"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(334), "Event fired: Save list");
			testSuiteHelper.runInCrawlingPlugins(336);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 336");

			testSuiteHelper.addStateToReportBuilder(336);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(336)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(336)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(336)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[54]/DIV[1]/FOOTER[1]/A[1], element=Element{node=[A: null], tag=A, text=Add a new card..., attributes={class=add-new, data-reactid=.0.0.1.0.1.0.0.0:$54.0.2.1, href=#}}, source=HybridStateVertexImpl{id=336, name=state336}, target=HybridStateVertexImpl{id=337, name=state337}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(335), "Event fired: Add a new card...");
			testSuiteHelper.runInCrawlingPlugins(337);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 337");

			testSuiteHelper.addStateToReportBuilder(337);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(337)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(337)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(337)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[54]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/A[1], element=Element{node=[A: null], tag=A, text=cancel, attributes={data-reactid=.0.0.1.0.1.0.0.0:$54.0.2.0.0.4, href=#}}, source=HybridStateVertexImpl{id=337, name=state337}, target=HybridStateVertexImpl{id=336, name=state336}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[54]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/TEXTAREA[1]"), "just a card"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(336), "Event fired: cancel");
			testSuiteHelper.runInCrawlingPlugins(336);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 336");

			testSuiteHelper.addStateToReportBuilder(336);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(336)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(336)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(336)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[55], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=HybridStateVertexImpl{id=336, name=state336}, target=HybridStateVertexImpl{id=339, name=state339}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(337), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(339);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 339");

			testSuiteHelper.addStateToReportBuilder(339);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(339)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(339)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(339)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[55]/DIV[1]/FORM[1]/A[1], element=Element{node=[A: null], tag=A, text=cancel, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.4, href=#}}, source=HybridStateVertexImpl{id=339, name=state339}, target=HybridStateVertexImpl{id=336, name=state336}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[55]/DIV[1]/FORM[1]/INPUT[1]"), "updated list"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(338), "Event fired: cancel");
			testSuiteHelper.runInCrawlingPlugins(336);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 336");

			testSuiteHelper.addStateToReportBuilder(336);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(336)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(336)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(336)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[55]/DIV[1], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=inner, data-reactid=.0.0.1.0.1.0.0.1.0}}, source=HybridStateVertexImpl{id=336, name=state336}, target=HybridStateVertexImpl{id=339, name=state339}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(339), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(339);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 339");

			testSuiteHelper.addStateToReportBuilder(339);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(339)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(339)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(339)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[55]/DIV[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save list, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.2, type=submit}}, source=HybridStateVertexImpl{id=339, name=state339}, target=HybridStateVertexImpl{id=342, name=state342}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[55]/DIV[1]/FORM[1]/INPUT[1]"), "updated list"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(340), "Event fired: Save list");
			testSuiteHelper.runInCrawlingPlugins(342);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 342");

			testSuiteHelper.addStateToReportBuilder(342);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(342)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(342)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(342)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[55]/DIV[1]/FOOTER[1]/A[1], element=Element{node=[A: null], tag=A, text=Add a new card..., attributes={class=add-new, data-reactid=.0.0.1.0.1.0.0.0:$55.0.2.1, href=#}}, source=HybridStateVertexImpl{id=342, name=state342}, target=HybridStateVertexImpl{id=343, name=state343}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(341), "Event fired: Add a new card...");
			testSuiteHelper.runInCrawlingPlugins(343);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 343");

			testSuiteHelper.addStateToReportBuilder(343);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(343)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(343)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(343)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[55]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/A[1], element=Element{node=[A: null], tag=A, text=cancel, attributes={data-reactid=.0.0.1.0.1.0.0.0:$55.0.2.0.0.4, href=#}}, source=HybridStateVertexImpl{id=343, name=state343}, target=HybridStateVertexImpl{id=342, name=state342}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[55]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/TEXTAREA[1]"), "just a card"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(342), "Event fired: cancel");
			testSuiteHelper.runInCrawlingPlugins(342);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 342");

			testSuiteHelper.addStateToReportBuilder(342);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(342)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(342)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(342)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[56], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=HybridStateVertexImpl{id=342, name=state342}, target=HybridStateVertexImpl{id=345, name=state345}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(343), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(345);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 345");

			testSuiteHelper.addStateToReportBuilder(345);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(345)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(345)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(345)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[56]/DIV[1]/FORM[1]/A[1], element=Element{node=[A: null], tag=A, text=cancel, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.4, href=#}}, source=HybridStateVertexImpl{id=345, name=state345}, target=HybridStateVertexImpl{id=342, name=state342}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[56]/DIV[1]/FORM[1]/INPUT[1]"), "updated list"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(344), "Event fired: cancel");
			testSuiteHelper.runInCrawlingPlugins(342);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 342");

			testSuiteHelper.addStateToReportBuilder(342);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(342)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(342)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(342)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[56]/DIV[1], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=inner, data-reactid=.0.0.1.0.1.0.0.1.0}}, source=HybridStateVertexImpl{id=342, name=state342}, target=HybridStateVertexImpl{id=345, name=state345}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(345), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(345);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 345");

			testSuiteHelper.addStateToReportBuilder(345);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(345)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(345)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(345)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[56]/DIV[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save list, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.2, type=submit}}, source=HybridStateVertexImpl{id=345, name=state345}, target=HybridStateVertexImpl{id=348, name=state348}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[56]/DIV[1]/FORM[1]/INPUT[1]"), "updated list"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(346), "Event fired: Save list");
			testSuiteHelper.runInCrawlingPlugins(348);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 348");

			testSuiteHelper.addStateToReportBuilder(348);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(348)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(348)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(348)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[56]/DIV[1]/FOOTER[1]/A[1], element=Element{node=[A: null], tag=A, text=Add a new card..., attributes={class=add-new, data-reactid=.0.0.1.0.1.0.0.0:$56.0.2.1, href=#}}, source=HybridStateVertexImpl{id=348, name=state348}, target=HybridStateVertexImpl{id=349, name=state349}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(347), "Event fired: Add a new card...");
			testSuiteHelper.runInCrawlingPlugins(349);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 349");

			testSuiteHelper.addStateToReportBuilder(349);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(349)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(349)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(349)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[56]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/A[1], element=Element{node=[A: null], tag=A, text=cancel, attributes={data-reactid=.0.0.1.0.1.0.0.0:$56.0.2.0.0.4, href=#}}, source=HybridStateVertexImpl{id=349, name=state349}, target=HybridStateVertexImpl{id=348, name=state348}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[56]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/TEXTAREA[1]"), "just a card"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(348), "Event fired: cancel");
			testSuiteHelper.runInCrawlingPlugins(348);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 348");

			testSuiteHelper.addStateToReportBuilder(348);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(348)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(348)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(348)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[57], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=HybridStateVertexImpl{id=348, name=state348}, target=HybridStateVertexImpl{id=351, name=state351}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(349), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(351);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 351");

			testSuiteHelper.addStateToReportBuilder(351);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(351)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(351)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(351)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[57]/DIV[1]/FORM[1]/A[1], element=Element{node=[A: null], tag=A, text=cancel, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.4, href=#}}, source=HybridStateVertexImpl{id=351, name=state351}, target=HybridStateVertexImpl{id=348, name=state348}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[57]/DIV[1]/FORM[1]/INPUT[1]"), "updated list"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(350), "Event fired: cancel");
			testSuiteHelper.runInCrawlingPlugins(348);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 348");

			testSuiteHelper.addStateToReportBuilder(348);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(348)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(348)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(348)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[57]/DIV[1], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=inner, data-reactid=.0.0.1.0.1.0.0.1.0}}, source=HybridStateVertexImpl{id=348, name=state348}, target=HybridStateVertexImpl{id=351, name=state351}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(351), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(351);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 351");

			testSuiteHelper.addStateToReportBuilder(351);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(351)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(351)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(351)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[57]/DIV[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save list, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.2, type=submit}}, source=HybridStateVertexImpl{id=351, name=state351}, target=HybridStateVertexImpl{id=354, name=state354}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[57]/DIV[1]/FORM[1]/INPUT[1]"), "updated list"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(352), "Event fired: Save list");
			testSuiteHelper.runInCrawlingPlugins(354);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 354");

			testSuiteHelper.addStateToReportBuilder(354);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(354)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(354)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(354)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[57]/DIV[1]/FOOTER[1]/A[1], element=Element{node=[A: null], tag=A, text=Add a new card..., attributes={class=add-new, data-reactid=.0.0.1.0.1.0.0.0:$57.0.2.1, href=#}}, source=HybridStateVertexImpl{id=354, name=state354}, target=HybridStateVertexImpl{id=355, name=state355}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(353), "Event fired: Add a new card...");
			testSuiteHelper.runInCrawlingPlugins(355);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 355");

			testSuiteHelper.addStateToReportBuilder(355);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(355)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(355)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(355)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[57]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/A[1], element=Element{node=[A: null], tag=A, text=cancel, attributes={data-reactid=.0.0.1.0.1.0.0.0:$57.0.2.0.0.4, href=#}}, source=HybridStateVertexImpl{id=355, name=state355}, target=HybridStateVertexImpl{id=354, name=state354}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[57]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/TEXTAREA[1]"), "just a card"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(354), "Event fired: cancel");
			testSuiteHelper.runInCrawlingPlugins(354);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 354");

			testSuiteHelper.addStateToReportBuilder(354);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(354)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(354)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(354)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[58], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=HybridStateVertexImpl{id=354, name=state354}, target=HybridStateVertexImpl{id=357, name=state357}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(355), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(357);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 357");

			testSuiteHelper.addStateToReportBuilder(357);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(357)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(357)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(357)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[58]/DIV[1]/FORM[1]/A[1], element=Element{node=[A: null], tag=A, text=cancel, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.4, href=#}}, source=HybridStateVertexImpl{id=357, name=state357}, target=HybridStateVertexImpl{id=354, name=state354}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[58]/DIV[1]/FORM[1]/INPUT[1]"), "updated list"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(356), "Event fired: cancel");
			testSuiteHelper.runInCrawlingPlugins(354);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 354");

			testSuiteHelper.addStateToReportBuilder(354);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(354)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(354)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(354)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[58]/DIV[1], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=inner, data-reactid=.0.0.1.0.1.0.0.1.0}}, source=HybridStateVertexImpl{id=354, name=state354}, target=HybridStateVertexImpl{id=357, name=state357}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(357), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(357);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 357");

			testSuiteHelper.addStateToReportBuilder(357);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(357)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(357)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(357)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[58]/DIV[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save list, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.2, type=submit}}, source=HybridStateVertexImpl{id=357, name=state357}, target=HybridStateVertexImpl{id=360, name=state360}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[58]/DIV[1]/FORM[1]/INPUT[1]"), "updated list"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(358), "Event fired: Save list");
			testSuiteHelper.runInCrawlingPlugins(360);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 360");

			testSuiteHelper.addStateToReportBuilder(360);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(360)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(360)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(360)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[58]/DIV[1]/FOOTER[1]/A[1], element=Element{node=[A: null], tag=A, text=Add a new card..., attributes={class=add-new, data-reactid=.0.0.1.0.1.0.0.0:$58.0.2.1, href=#}}, source=HybridStateVertexImpl{id=360, name=state360}, target=HybridStateVertexImpl{id=361, name=state361}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(359), "Event fired: Add a new card...");
			testSuiteHelper.runInCrawlingPlugins(361);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 361");

			testSuiteHelper.addStateToReportBuilder(361);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(361)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(361)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(361)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[58]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/A[1], element=Element{node=[A: null], tag=A, text=cancel, attributes={data-reactid=.0.0.1.0.1.0.0.0:$58.0.2.0.0.4, href=#}}, source=HybridStateVertexImpl{id=361, name=state361}, target=HybridStateVertexImpl{id=360, name=state360}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[58]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/TEXTAREA[1]"), "just a card"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(360), "Event fired: cancel");
			testSuiteHelper.runInCrawlingPlugins(360);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 360");

			testSuiteHelper.addStateToReportBuilder(360);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(360)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(360)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(360)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[59], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=HybridStateVertexImpl{id=360, name=state360}, target=HybridStateVertexImpl{id=363, name=state363}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(361), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(363);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 363");

			testSuiteHelper.addStateToReportBuilder(363);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(363)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(363)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(363)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[59]/DIV[1]/FORM[1]/A[1], element=Element{node=[A: null], tag=A, text=cancel, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.4, href=#}}, source=HybridStateVertexImpl{id=363, name=state363}, target=HybridStateVertexImpl{id=360, name=state360}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[59]/DIV[1]/FORM[1]/INPUT[1]"), "updated list"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(362), "Event fired: cancel");
			testSuiteHelper.runInCrawlingPlugins(360);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 360");

			testSuiteHelper.addStateToReportBuilder(360);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(360)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(360)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(360)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[59]/DIV[1], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=inner, data-reactid=.0.0.1.0.1.0.0.1.0}}, source=HybridStateVertexImpl{id=360, name=state360}, target=HybridStateVertexImpl{id=363, name=state363}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(363), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(363);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 363");

			testSuiteHelper.addStateToReportBuilder(363);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(363)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(363)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(363)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[59]/DIV[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save list, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.2, type=submit}}, source=HybridStateVertexImpl{id=363, name=state363}, target=HybridStateVertexImpl{id=366, name=state366}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[59]/DIV[1]/FORM[1]/INPUT[1]"), "updated list"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(364), "Event fired: Save list");
			testSuiteHelper.runInCrawlingPlugins(366);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 366");

			testSuiteHelper.addStateToReportBuilder(366);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(366)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(366)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(366)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[59]/DIV[1]/FOOTER[1]/A[1], element=Element{node=[A: null], tag=A, text=Add a new card..., attributes={class=add-new, data-reactid=.0.0.1.0.1.0.0.0:$59.0.2.1, href=#}}, source=HybridStateVertexImpl{id=366, name=state366}, target=HybridStateVertexImpl{id=367, name=state367}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(365), "Event fired: Add a new card...");
			testSuiteHelper.runInCrawlingPlugins(367);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 367");

			testSuiteHelper.addStateToReportBuilder(367);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(367)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(367)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(367)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[59]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/A[1], element=Element{node=[A: null], tag=A, text=cancel, attributes={data-reactid=.0.0.1.0.1.0.0.0:$59.0.2.0.0.4, href=#}}, source=HybridStateVertexImpl{id=367, name=state367}, target=HybridStateVertexImpl{id=366, name=state366}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[59]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/TEXTAREA[1]"), "just a card"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(366), "Event fired: cancel");
			testSuiteHelper.runInCrawlingPlugins(366);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 366");

			testSuiteHelper.addStateToReportBuilder(366);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(366)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(366)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(366)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[60], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=HybridStateVertexImpl{id=366, name=state366}, target=HybridStateVertexImpl{id=369, name=state369}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(367), "Event fired: Add new list...");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[60]/DIV[1]/FORM[1]/A[1], element=Element{node=[A: null], tag=A, text=cancel, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.4, href=#}}, source=HybridStateVertexImpl{id=369, name=state369}, target=HybridStateVertexImpl{id=366, name=state366}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[60]/DIV[1]/FORM[1]/INPUT[1]"), "updated list"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(368), "Event fired: cancel");
			testSuiteHelper.runInCrawlingPlugins(366);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 366");

			testSuiteHelper.addStateToReportBuilder(366);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(366)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(366)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(366)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[60]/DIV[1], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=inner, data-reactid=.0.0.1.0.1.0.0.1.0}}, source=HybridStateVertexImpl{id=366, name=state366}, target=HybridStateVertexImpl{id=369, name=state369}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(369), "Event fired: Add new list...");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[60]/DIV[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save list, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.2, type=submit}}, source=HybridStateVertexImpl{id=369, name=state369}, target=HybridStateVertexImpl{id=372, name=state372}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[60]/DIV[1]/FORM[1]/INPUT[1]"), "updated list"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(370), "Event fired: Save list");
			testSuiteHelper.runInCrawlingPlugins(372);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 372");

			testSuiteHelper.addStateToReportBuilder(372);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(372)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(372)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(372)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[60]/DIV[1]/FOOTER[1]/A[1], element=Element{node=[A: null], tag=A, text=Add a new card..., attributes={class=add-new, data-reactid=.0.0.1.0.1.0.0.0:$60.0.2.1, href=#}}, source=HybridStateVertexImpl{id=372, name=state372}, target=HybridStateVertexImpl{id=373, name=state373}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(371), "Event fired: Add a new card...");
			testSuiteHelper.runInCrawlingPlugins(373);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 373");

			testSuiteHelper.addStateToReportBuilder(373);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(373)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(373)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(373)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[60]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/A[1], element=Element{node=[A: null], tag=A, text=cancel, attributes={data-reactid=.0.0.1.0.1.0.0.0:$60.0.2.0.0.4, href=#}}, source=HybridStateVertexImpl{id=373, name=state373}, target=HybridStateVertexImpl{id=372, name=state372}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[60]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/TEXTAREA[1]"), "just a card"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(372), "Event fired: cancel");
			testSuiteHelper.runInCrawlingPlugins(372);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 372");

			testSuiteHelper.addStateToReportBuilder(372);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(372)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(372)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(372)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[61], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=HybridStateVertexImpl{id=372, name=state372}, target=HybridStateVertexImpl{id=375, name=state375}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(373), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(375);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 375");

			testSuiteHelper.addStateToReportBuilder(375);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(375)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(375)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(375)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[61]/DIV[1]/FORM[1]/A[1], element=Element{node=[A: null], tag=A, text=cancel, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.4, href=#}}, source=HybridStateVertexImpl{id=375, name=state375}, target=HybridStateVertexImpl{id=372, name=state372}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[61]/DIV[1]/FORM[1]/INPUT[1]"), "updated list"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(374), "Event fired: cancel");
			testSuiteHelper.runInCrawlingPlugins(372);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 372");

			testSuiteHelper.addStateToReportBuilder(372);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(372)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(372)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(372)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[61]/DIV[1], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=inner, data-reactid=.0.0.1.0.1.0.0.1.0}}, source=HybridStateVertexImpl{id=372, name=state372}, target=HybridStateVertexImpl{id=375, name=state375}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(375), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(375);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 375");

			testSuiteHelper.addStateToReportBuilder(375);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(375)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(375)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(375)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[61]/DIV[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save list, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.2, type=submit}}, source=HybridStateVertexImpl{id=375, name=state375}, target=HybridStateVertexImpl{id=378, name=state378}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[61]/DIV[1]/FORM[1]/INPUT[1]"), "updated list"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(376), "Event fired: Save list");
			testSuiteHelper.runInCrawlingPlugins(378);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 378");

			testSuiteHelper.addStateToReportBuilder(378);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(378)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(378)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(378)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[61]/DIV[1]/FOOTER[1]/A[1], element=Element{node=[A: null], tag=A, text=Add a new card..., attributes={class=add-new, data-reactid=.0.0.1.0.1.0.0.0:$61.0.2.1, href=#}}, source=HybridStateVertexImpl{id=378, name=state378}, target=HybridStateVertexImpl{id=379, name=state379}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(377), "Event fired: Add a new card...");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[61]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/A[1], element=Element{node=[A: null], tag=A, text=cancel, attributes={data-reactid=.0.0.1.0.1.0.0.0:$61.0.2.0.0.4, href=#}}, source=HybridStateVertexImpl{id=379, name=state379}, target=HybridStateVertexImpl{id=378, name=state378}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[61]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/TEXTAREA[1]"), "just a card"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(378), "Event fired: cancel");
			testSuiteHelper.runInCrawlingPlugins(378);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 378");

			testSuiteHelper.addStateToReportBuilder(378);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(378)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(378)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(378)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[62], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=HybridStateVertexImpl{id=378, name=state378}, target=HybridStateVertexImpl{id=381, name=state381}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(379), "Event fired: Add new list...");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[62]/DIV[1]/FORM[1]/A[1], element=Element{node=[A: null], tag=A, text=cancel, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.4, href=#}}, source=HybridStateVertexImpl{id=381, name=state381}, target=HybridStateVertexImpl{id=378, name=state378}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[62]/DIV[1]/FORM[1]/INPUT[1]"), "updated list"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(380), "Event fired: cancel");
			testSuiteHelper.runInCrawlingPlugins(378);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 378");

			testSuiteHelper.addStateToReportBuilder(378);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(378)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(378)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(378)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[62]/DIV[1], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=inner, data-reactid=.0.0.1.0.1.0.0.1.0}}, source=HybridStateVertexImpl{id=378, name=state378}, target=HybridStateVertexImpl{id=381, name=state381}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(381), "Event fired: Add new list...");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[62]/DIV[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save list, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.2, type=submit}}, source=HybridStateVertexImpl{id=381, name=state381}, target=HybridStateVertexImpl{id=384, name=state384}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[62]/DIV[1]/FORM[1]/INPUT[1]"), "updated list"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(382), "Event fired: Save list");
			testSuiteHelper.runInCrawlingPlugins(384);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 384");

			testSuiteHelper.addStateToReportBuilder(384);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(384)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(384)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(384)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[62]/DIV[1]/FOOTER[1]/A[1], element=Element{node=[A: null], tag=A, text=Add a new card..., attributes={class=add-new, data-reactid=.0.0.1.0.1.0.0.0:$62.0.2.1, href=#}}, source=HybridStateVertexImpl{id=384, name=state384}, target=HybridStateVertexImpl{id=385, name=state385}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(383), "Event fired: Add a new card...");
			testSuiteHelper.runInCrawlingPlugins(385);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 385");

			testSuiteHelper.addStateToReportBuilder(385);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(385)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(385)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(385)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[62]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/A[1], element=Element{node=[A: null], tag=A, text=cancel, attributes={data-reactid=.0.0.1.0.1.0.0.0:$62.0.2.0.0.4, href=#}}, source=HybridStateVertexImpl{id=385, name=state385}, target=HybridStateVertexImpl{id=384, name=state384}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[62]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/TEXTAREA[1]"), "just a card"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(384), "Event fired: cancel");
			testSuiteHelper.runInCrawlingPlugins(384);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 384");

			testSuiteHelper.addStateToReportBuilder(384);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(384)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(384)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(384)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[63], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=HybridStateVertexImpl{id=384, name=state384}, target=HybridStateVertexImpl{id=387, name=state387}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(385), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(387);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 387");

			testSuiteHelper.addStateToReportBuilder(387);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(387)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(387)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(387)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[63]/DIV[1]/FORM[1]/A[1], element=Element{node=[A: null], tag=A, text=cancel, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.4, href=#}}, source=HybridStateVertexImpl{id=387, name=state387}, target=HybridStateVertexImpl{id=384, name=state384}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[63]/DIV[1]/FORM[1]/INPUT[1]"), "updated list"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(386), "Event fired: cancel");
			testSuiteHelper.runInCrawlingPlugins(384);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 384");

			testSuiteHelper.addStateToReportBuilder(384);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(384)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(384)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(384)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[63]/DIV[1], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=inner, data-reactid=.0.0.1.0.1.0.0.1.0}}, source=HybridStateVertexImpl{id=384, name=state384}, target=HybridStateVertexImpl{id=387, name=state387}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(387), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(387);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 387");

			testSuiteHelper.addStateToReportBuilder(387);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(387)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(387)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(387)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[63]/DIV[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save list, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.2, type=submit}}, source=HybridStateVertexImpl{id=387, name=state387}, target=HybridStateVertexImpl{id=390, name=state390}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[63]/DIV[1]/FORM[1]/INPUT[1]"), "updated list"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(388), "Event fired: Save list");
			testSuiteHelper.runInCrawlingPlugins(390);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 390");

			testSuiteHelper.addStateToReportBuilder(390);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(390)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(390)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(390)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[63]/DIV[1]/FOOTER[1]/A[1], element=Element{node=[A: null], tag=A, text=Add a new card..., attributes={class=add-new, data-reactid=.0.0.1.0.1.0.0.0:$63.0.2.1, href=#}}, source=HybridStateVertexImpl{id=390, name=state390}, target=HybridStateVertexImpl{id=391, name=state391}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(389), "Event fired: Add a new card...");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[63]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/A[1], element=Element{node=[A: null], tag=A, text=cancel, attributes={data-reactid=.0.0.1.0.1.0.0.0:$63.0.2.0.0.4, href=#}}, source=HybridStateVertexImpl{id=391, name=state391}, target=HybridStateVertexImpl{id=390, name=state390}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[63]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/TEXTAREA[1]"), "just a card"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(390), "Event fired: cancel");
			testSuiteHelper.runInCrawlingPlugins(390);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 390");

			testSuiteHelper.addStateToReportBuilder(390);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(390)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(390)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(390)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[64], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=HybridStateVertexImpl{id=390, name=state390}, target=HybridStateVertexImpl{id=393, name=state393}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(391), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(393);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 393");

			testSuiteHelper.addStateToReportBuilder(393);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(393)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(393)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(393)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[64]/DIV[1]/FORM[1]/A[1], element=Element{node=[A: null], tag=A, text=cancel, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.4, href=#}}, source=HybridStateVertexImpl{id=393, name=state393}, target=HybridStateVertexImpl{id=390, name=state390}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[64]/DIV[1]/FORM[1]/INPUT[1]"), "updated list"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(392), "Event fired: cancel");
			testSuiteHelper.runInCrawlingPlugins(390);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 390");

			testSuiteHelper.addStateToReportBuilder(390);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(390)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(390)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(390)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[64]/DIV[1], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=inner, data-reactid=.0.0.1.0.1.0.0.1.0}}, source=HybridStateVertexImpl{id=390, name=state390}, target=HybridStateVertexImpl{id=393, name=state393}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(393), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(393);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 393");

			testSuiteHelper.addStateToReportBuilder(393);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(393)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(393)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(393)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[64]/DIV[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save list, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.2, type=submit}}, source=HybridStateVertexImpl{id=393, name=state393}, target=HybridStateVertexImpl{id=396, name=state396}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[64]/DIV[1]/FORM[1]/INPUT[1]"), "updated list"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(394), "Event fired: Save list");
			testSuiteHelper.runInCrawlingPlugins(396);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 396");

			testSuiteHelper.addStateToReportBuilder(396);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(396)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(396)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(396)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[64]/DIV[1]/FOOTER[1]/A[1], element=Element{node=[A: null], tag=A, text=Add a new card..., attributes={class=add-new, data-reactid=.0.0.1.0.1.0.0.0:$64.0.2.1, href=#}}, source=HybridStateVertexImpl{id=396, name=state396}, target=HybridStateVertexImpl{id=397, name=state397}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(395), "Event fired: Add a new card...");
			testSuiteHelper.runInCrawlingPlugins(397);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 397");

			testSuiteHelper.addStateToReportBuilder(397);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(397)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(397)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(397)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[64]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/A[1], element=Element{node=[A: null], tag=A, text=cancel, attributes={data-reactid=.0.0.1.0.1.0.0.0:$64.0.2.0.0.4, href=#}}, source=HybridStateVertexImpl{id=397, name=state397}, target=HybridStateVertexImpl{id=396, name=state396}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[64]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/TEXTAREA[1]"), "just a card"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(396), "Event fired: cancel");
			testSuiteHelper.runInCrawlingPlugins(396);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 396");

			testSuiteHelper.addStateToReportBuilder(396);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(396)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(396)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(396)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[65], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=HybridStateVertexImpl{id=396, name=state396}, target=HybridStateVertexImpl{id=399, name=state399}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(397), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(399);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 399");

			testSuiteHelper.addStateToReportBuilder(399);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(399)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(399)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(399)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[65]/DIV[1]/FORM[1]/A[1], element=Element{node=[A: null], tag=A, text=cancel, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.4, href=#}}, source=HybridStateVertexImpl{id=399, name=state399}, target=HybridStateVertexImpl{id=396, name=state396}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[65]/DIV[1]/FORM[1]/INPUT[1]"), "updated list"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(398), "Event fired: cancel");
			testSuiteHelper.runInCrawlingPlugins(396);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 396");

			testSuiteHelper.addStateToReportBuilder(396);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(396)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(396)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(396)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[65]/DIV[1], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=inner, data-reactid=.0.0.1.0.1.0.0.1.0}}, source=HybridStateVertexImpl{id=396, name=state396}, target=HybridStateVertexImpl{id=399, name=state399}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(399), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(399);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 399");

			testSuiteHelper.addStateToReportBuilder(399);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(399)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(399)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(399)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[65]/DIV[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save list, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.2, type=submit}}, source=HybridStateVertexImpl{id=399, name=state399}, target=HybridStateVertexImpl{id=402, name=state402}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[65]/DIV[1]/FORM[1]/INPUT[1]"), "updated list"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(400), "Event fired: Save list");
			testSuiteHelper.runInCrawlingPlugins(402);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 402");

			testSuiteHelper.addStateToReportBuilder(402);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(402)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(402)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(402)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[65]/DIV[1]/FOOTER[1]/A[1], element=Element{node=[A: null], tag=A, text=Add a new card..., attributes={class=add-new, data-reactid=.0.0.1.0.1.0.0.0:$65.0.2.1, href=#}}, source=HybridStateVertexImpl{id=402, name=state402}, target=HybridStateVertexImpl{id=403, name=state403}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(401), "Event fired: Add a new card...");
			testSuiteHelper.runInCrawlingPlugins(403);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 403");

			testSuiteHelper.addStateToReportBuilder(403);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(403)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(403)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(403)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[65]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/A[1], element=Element{node=[A: null], tag=A, text=cancel, attributes={data-reactid=.0.0.1.0.1.0.0.0:$65.0.2.0.0.4, href=#}}, source=HybridStateVertexImpl{id=403, name=state403}, target=HybridStateVertexImpl{id=402, name=state402}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[65]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/TEXTAREA[1]"), "just a card"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(402), "Event fired: cancel");
			testSuiteHelper.runInCrawlingPlugins(402);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 402");

			testSuiteHelper.addStateToReportBuilder(402);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(402)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(402)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(402)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[66], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=HybridStateVertexImpl{id=402, name=state402}, target=HybridStateVertexImpl{id=405, name=state405}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(403), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(405);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 405");

			testSuiteHelper.addStateToReportBuilder(405);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(405)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(405)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(405)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[66]/DIV[1]/FORM[1]/A[1], element=Element{node=[A: null], tag=A, text=cancel, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.4, href=#}}, source=HybridStateVertexImpl{id=405, name=state405}, target=HybridStateVertexImpl{id=402, name=state402}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[66]/DIV[1]/FORM[1]/INPUT[1]"), "updated list"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(404), "Event fired: cancel");
			testSuiteHelper.runInCrawlingPlugins(402);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 402");

			testSuiteHelper.addStateToReportBuilder(402);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(402)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(402)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(402)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[66]/DIV[1], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=inner, data-reactid=.0.0.1.0.1.0.0.1.0}}, source=HybridStateVertexImpl{id=402, name=state402}, target=HybridStateVertexImpl{id=405, name=state405}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(405), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(405);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 405");

			testSuiteHelper.addStateToReportBuilder(405);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(405)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(405)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(405)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[66]/DIV[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save list, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.2, type=submit}}, source=HybridStateVertexImpl{id=405, name=state405}, target=HybridStateVertexImpl{id=408, name=state408}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[66]/DIV[1]/FORM[1]/INPUT[1]"), "updated list"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(406), "Event fired: Save list");
			testSuiteHelper.runInCrawlingPlugins(408);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 408");

			testSuiteHelper.addStateToReportBuilder(408);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(408)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(408)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(408)
					&& allStatesIdentical;	
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[66]/DIV[1]/FOOTER[1]/A[1], element=Element{node=[A: null], tag=A, text=Add a new card..., attributes={class=add-new, data-reactid=.0.0.1.0.1.0.0.0:$66.0.2.1, href=#}}, source=HybridStateVertexImpl{id=408, name=state408}, target=HybridStateVertexImpl{id=409, name=state409}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(407), "Event fired: Add a new card...");
			testSuiteHelper.runInCrawlingPlugins(409);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 409");

			testSuiteHelper.addStateToReportBuilder(409);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(409)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.BOTH) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(409)
					&& allStatesIdentical;
			}
			if (assertionMode == StateEquivalenceAssertionMode.HYBRID) {
				allStatesIdentical = testSuiteHelper.fragDiffBool(409)
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
