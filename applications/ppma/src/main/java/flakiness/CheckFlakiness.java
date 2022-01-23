package flakiness;

import org.junit.runner.Description;
import utils.Properties;
import utils.ResetAppState;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class CheckFlakiness {

    public void check(){

        int numExecutionFlakyTestSuite = Integer.valueOf(Properties.getInstance().getProperty("num_execution_flaky_test_suite"));
        TestCaseExecutionListener testCaseExecutionListener = new TestCaseExecutionListener();
        TestCaseExecutor testCaseExecutor = new TestCaseExecutor();
        Map<Description, Set<String>> failures = new HashMap<>();
        for (int i = 0; i < numExecutionFlakyTestSuite; i++) {
            ResetAppState.reset();
            System.out.println("Execution: " + i);
            testCaseExecutor.execute(testCaseExecutionListener);
            Optional<Description> failedTestDescriptionOptional = testCaseExecutionListener.getFailedTestDescription();
            if(failedTestDescriptionOptional.isPresent()){
                Description failedTestDescription = failedTestDescriptionOptional.get();
                System.out.println("First test case that failed: " + failedTestDescription);
                Set<String> tracesOfFailedTestCase = failures.get(failedTestDescription);
                if(tracesOfFailedTestCase == null){
                    tracesOfFailedTestCase = new HashSet<>();
                }
                Optional<String> failedTestTraceOptional = testCaseExecutionListener.getFailedTestTrace();
                if(failedTestTraceOptional.isPresent()){
                    System.out.println("Stack trace: " + failedTestTraceOptional.get());
                    tracesOfFailedTestCase.add(failedTestTraceOptional.get());
                } else {
                    throw new IllegalStateException("Test trace not present in test that failed " + failedTestDescription);
                }
                failures.put(failedTestDescription, tracesOfFailedTestCase);
            } else {
                System.out.println("No failure");
            }
            System.out.println();
            System.out.println();
        }
        if(failures.size() > 0)
            System.out.println("Test suite is considered flaky. Some test cases failed during default execution");
        else
            System.out.println("Test suite is not flaky. Executing the test suite in its default order for "
                    + numExecutionFlakyTestSuite + " times did not result in any test failure.");
    }
}
