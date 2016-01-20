package com.raystone.ray.goplaces;

import android.app.Application;
import android.support.test.rule.ActivityTestRule;
import android.test.ApplicationTestCase;

import com.raystone.ray.goplaces.Login.LoginActivity;

import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
public class ApplicationTest extends ApplicationTestCase<Application> {
    public ApplicationTest() {
        super(Application.class);
    }

    @Rule
    public ActivityTestRule<LoginActivity> mLoginActivityTestRule = new ActivityTestRule<>(LoginActivity.class);

    @Test
    public void clickRegister_openRegisterUI() throws Exception
    {
        onView(withId(R.id.sign_in)).perform(click());
        onView(withId(R.id.register_email)).check(matches(isDisplayed()));
    }

}