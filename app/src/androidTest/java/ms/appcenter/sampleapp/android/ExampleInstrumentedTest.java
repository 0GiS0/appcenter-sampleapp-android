package ms.appcenter.sampleapp.android;

import android.content.Context;

import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.platform.app.InstrumentationRegistry;

import org.junit.Rule;
import org.junit.After;

import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.junit.Assert.assertEquals;

/* Espresso */

import com.microsoft.appcenter.espresso.Factory;
import com.microsoft.appcenter.espresso.ReportHelper;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import androidx.test.espresso.assertion.ViewAssertions.*;


/**
 * Instrumentation test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {

    @Rule
    public ActivityScenarioRule<MainActivity> activityActivityScenarioRule = new ActivityScenarioRule<>(MainActivity.class);

    @Rule
    public ReportHelper reportHelper = Factory.getReportHelper();

    @After
    public void TearDown() {
        reportHelper.label("Stopping App");
    }

    @Test
    public void useAppContext() {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();

        assertEquals("ms.appcenter.sampleapp.android", appContext.getPackageName());
    }

    @Test
    public void welcomeText_newActivity(){

        //Check that the text is "Visual Studio App Center is mission control for apps. It brings together multiple services, commonly used for mobile developers, into a single, integrated product.\n\n\nSwipe right to learn about our services"
        //onView(withId(R.id.welcomeTextView)).check(matches(withText("Visual Studio App Center is mission control for apps.")));
        onView(withId(R.id.welcomeTextView)).check(matches(withText("Visual Studio App Center is mission control for apps. It brings together multiple services, commonly used for mobile developers, into a single, integrated product.\n\n\nSwipe right to learn about our services")));

    }
}

