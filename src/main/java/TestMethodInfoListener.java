import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import java.lang.reflect.Method;


public class TestMethodInfoListener implements ITestListener {

    @Override
    public void onTestStart(ITestResult result) {
        Method method = result.getMethod().getConstructorOrMethod().getMethod();
        if (method.isAnnotationPresent(TestMethodInfo.class)) {
            TestMethodInfo testMethodInfo = method.getAnnotation(TestMethodInfo.class);
            System.out.println("Test Method Info:");
            System.out.println("Priority: " + testMethodInfo.priority());
            System.out.println("Author: " + testMethodInfo.author());
            System.out.println("Last Modified: " + testMethodInfo.lastModified());
        }
    }

    //Другие методы
    @Override
    public void onTestSuccess(ITestResult result) {}

    @Override
    public void onTestFailure(ITestResult result) {}

    @Override
    public void onTestSkipped(ITestResult result) {}

    @Override
    public void onFinish(ITestContext context) {}

    @Override
    public void onStart(ITestContext context) {}
}
