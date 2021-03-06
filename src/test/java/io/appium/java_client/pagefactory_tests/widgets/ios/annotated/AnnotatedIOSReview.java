package io.appium.java_client.pagefactory_tests.widgets.ios.annotated;


import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.iOSFindBy;
import io.appium.java_client.pagefactory.iOSFindBys;
import io.appium.java_client.pagefactory_tests.widgets.Review;
import io.appium.java_client.pagefactory_tests.widgets.ios.simple.IOSReview;
import org.openqa.selenium.WebElement;

@iOSFindBy(className = "UIAWindow")
public class AnnotatedIOSReview extends IOSReview {
    protected AnnotatedIOSReview(WebElement element) {
        super(element);
    }
}
